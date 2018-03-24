/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2018 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.gui.necronomicon;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import com.google.common.collect.Lists;
import com.shinoow.abyssalcraft.api.APIUtils;
import com.shinoow.abyssalcraft.api.necronomicon.condition.caps.NecroDataCapability;
import com.shinoow.abyssalcraft.api.spell.Spell;
import com.shinoow.abyssalcraft.api.spell.SpellRegistry;
import com.shinoow.abyssalcraft.client.gui.necronomicon.buttons.ButtonHome;
import com.shinoow.abyssalcraft.client.gui.necronomicon.buttons.ButtonNextPage;
import com.shinoow.abyssalcraft.client.lib.GuiRenderHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.oredict.OreDictionary;

public class GuiNecronomiconSpellEntry extends GuiNecronomicon {

	private ButtonNextPage buttonNextPage, buttonNextPageLong;
	private ButtonNextPage buttonPreviousPage, buttonPreviousPageLong;
	private GuiButton buttonDone;
	private ButtonHome buttonHome;
	private GuiNecronomicon parent;
	private List<Spell> spells = Lists.newArrayList();

	public GuiNecronomiconSpellEntry(int bookType, GuiNecronomicon gui){
		super(bookType);
		parent = gui;
		isInfo = true;
		//		this.ritualnum = ritualnum;
	}

	@Override
	public GuiNecronomicon withBookType(int par1){
		//		if(getBookType() > par1)
		//			isInvalid = true;
		return super.withBookType(par1);
	}

	@Override
	public void initGui(){
		if(isInvalid)
			mc.displayGuiScreen(parent.withBookType(getBookType()));
		currentNecro = this;
		if(spells.isEmpty())
			initStuff();
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		buttonList.add(buttonDone = new GuiButton(0, width / 2 - 100, 4 + guiHeight, 200, 20, I18n.format("gui.done", new Object[0])));

		int i = (width - guiWidth) / 2;
		byte b0 = 2;
		buttonList.add(buttonNextPage = new ButtonNextPage(1, i + 215, b0 + 154, true, false));
		buttonList.add(buttonNextPageLong = new ButtonNextPage(2, i + 203, b0 + 167, true, true));
		buttonList.add(buttonPreviousPage = new ButtonNextPage(3, i + 18, b0 + 154, false, false));
		buttonList.add(buttonPreviousPageLong = new ButtonNextPage(4, i + 23, b0 + 167, false, true));
		buttonList.add(buttonHome = new ButtonHome(5, i + 118, b0 + 167));

		updateButtons();
	}

	private void updateButtons()
	{
		buttonNextPage.visible = currTurnup < getTurnupLimit() - 1;
		buttonNextPageLong.visible = currTurnup < getTurnupLimit() -5;
		buttonPreviousPage.visible = true;
		buttonPreviousPageLong.visible = currTurnup > 4;
		buttonDone.visible = true;
		buttonHome.visible = true;
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		if (button.enabled)
			if (button.id == 0)
				mc.displayGuiScreen((GuiScreen)null);
			else if(button.id == 1){
				if(currTurnup < getTurnupLimit() -1)
					++currTurnup;
			} else if(button.id == 2){
				if(currTurnup < getTurnupLimit() -5)
					currTurnup += 5;
			} else if(button.id == 3){
				if(currTurnup == 0){
					isInfo = false;
					mc.displayGuiScreen(parent.withBookType(getBookType()));
				} else if(currTurnup > 0)
					--currTurnup;
			} else if(button.id == 4){
				if(currTurnup > 4)
					currTurnup -= 5;
			} else if(button.id == 5)
				mc.displayGuiScreen(new GuiNecronomicon(getBookType()));

		updateButtons();
	}

	@Override
	protected void drawInformationText(int x, int y){
		drawPage(spells.get(currTurnup), x, y);
	}

	private void drawPage(Spell spell, int x, int y){
		int k = (width - guiWidth) / 2;
		byte b0 = 2;
		String title = spell.getLocalizedName();
		fontRendererObj.drawSplitString(title, k + 20, b0 + 16, 116, 0xC40000);

		writeText(1, "PE per cast: " + spell.getReqEnergy() + " PE", 125);
		writeText(1, "Spell Type: "+ (spell.requiresCharging() ? "Charging" : "Instant"), 135);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation("abyssalcraft", "textures/gui/necronomicon/spell.png"));
		drawTexturedModalRect(k, b0, 0, 0, 256, 256);

		tooltipStack = null;

		ItemStack[] offerings = new ItemStack[5];
		if(spell.getReagents().length < 5)
			for(int i = 0; i < spell.getReagents().length; i++)
				offerings[i] = APIUtils.convertToStack(spell.getReagents()[i]);
		else offerings = getStacks(spell.getReagents());

		renderItem(k + 58, b0 + 41, offerings[0], x, y);
		renderItem(k + 83, b0 + 62, offerings[1], x, y);
		renderItem(k + 72, b0 + 91, offerings[2], x, y);
		renderItem(k + 45, b0 + 91, offerings[3], x, y);
		renderItem(k + 33, b0 + 62, offerings[4], x, y);
		//center
		renderItem(k + 58, b0 + 66, spell.getParchment(), x, y);

		if(tooltipStack != null)
		{
			List<String> tooltipData = tooltipStack.getTooltip(Minecraft.getMinecraft().player, false);
			List<String> parsedTooltip = new ArrayList();
			boolean first = true;

			for(String s : tooltipData)
			{
				String s_ = s;
				if(!first)
					s_ = TextFormatting.GRAY + s;
				parsedTooltip.add(s_);
				first = false;
			}
			GuiRenderHelper.renderTooltip(x, y, parsedTooltip);
		}
	}

	private ItemStack[] getStacks(Object[] objects){
		ItemStack[] stacks = new ItemStack[objects.length];
		for(int i = 0; i < objects.length; i++)
			stacks[i] = APIUtils.convertToStack(objects[i]);
		return stacks;
	}

	private ItemStack tooltipStack;
	public void renderItem(int xPos, int yPos, ItemStack stack, int mx, int my)
	{
		if(stack == null || stack.isEmpty()) return;

		if(stack.getItemDamage() == OreDictionary.WILDCARD_VALUE)
			stack.setItemDamage(0);

		RenderItem render = Minecraft.getMinecraft().getRenderItem();
		if(mx > xPos && mx < xPos+16 && my > yPos && my < yPos+16)
			tooltipStack = stack;

		GlStateManager.pushMatrix();
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.enableRescaleNormal();
		GlStateManager.enableDepth();
		render.renderItemAndEffectIntoGUI(stack, xPos, yPos);
		render.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, stack, xPos, yPos, null);
		RenderHelper.disableStandardItemLighting();
		GlStateManager.popMatrix();

		GlStateManager.disableLighting();
	}

	private void initStuff(){
		for(Spell spell : SpellRegistry.instance().getSpells())
			if(NecroDataCapability.getCap(Minecraft.getMinecraft().player).isUnlocked(spell.getUnlockCondition(), Minecraft.getMinecraft().player)
					&& spell.getBookType() <= getBookType())
				spells.add(spell);
		setTurnupLimit(spells.size());
	}
}