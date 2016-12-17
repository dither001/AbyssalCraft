/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import com.shinoow.abyssalcraft.common.entity.EntityChagaroth;

public class ModelChagaroth extends ModelBase {

	private int rot = 0;

	public ModelRenderer frontspike1;
	public ModelRenderer frontspike2;
	public ModelRenderer frontspike3;
	public ModelRenderer frontspike4;
	public ModelRenderer frontspike5;
	public ModelRenderer leftneck;
	public ModelRenderer middleneck;
	public ModelRenderer rightneck;
	public ModelRenderer body;
	public ModelRenderer tentacle2base;
	public ModelRenderer tentacle1;
	public ModelRenderer tentacle2;
	public ModelRenderer tentacle3;
	public ModelRenderer tentacle4;
	public ModelRenderer tentacle5;
	public ModelRenderer tentacle6;
	public ModelRenderer tentacle7;
	public ModelRenderer tentacle8;
	public ModelRenderer tentacle9;
	public ModelRenderer tentacle10;
	public ModelRenderer tentacle11;
	public ModelRenderer tentacle12;
	public ModelRenderer tentacle13;
	public ModelRenderer tentacle14;
	public ModelRenderer tentacle15;
	public ModelRenderer tentacle16;
	public ModelRenderer tentacle17;
	public ModelRenderer tentacle18;
	public ModelRenderer tentacle19;
	public ModelRenderer tentacle20;
	public ModelRenderer tlib12;
	public ModelRenderer tlib22;
	public ModelRenderer tspike12;
	public ModelRenderer tspike22;
	public ModelRenderer tspike32;
	public ModelRenderer tspike42;
	public ModelRenderer tlib1;
	public ModelRenderer tlib2;
	public ModelRenderer tspike1;
	public ModelRenderer tspike2;
	public ModelRenderer tspike3;
	public ModelRenderer tspike4;
	public ModelRenderer lefthead;
	public ModelRenderer leftjaw;
	public ModelRenderer leftupperjaw;
	public ModelRenderer lstooth1;
	public ModelRenderer lstooth2;
	public ModelRenderer lstooth3;
	public ModelRenderer lstooth4;
	public ModelRenderer lbtooth1;
	public ModelRenderer lbtooth2;
	public ModelRenderer lbtooth3;
	public ModelRenderer lbtooth4;
	public ModelRenderer lbtooth5;
	public ModelRenderer lbackspike1;
	public ModelRenderer lbackspike2;
	public ModelRenderer lbackspike3;
	public ModelRenderer lackspike4;
	public ModelRenderer lefteye1;
	public ModelRenderer lefteye2;
	public ModelRenderer middlehead;
	public ModelRenderer middlejaw;
	public ModelRenderer middleupperjaw;
	public ModelRenderer mstooth1;
	public ModelRenderer mstooth2;
	public ModelRenderer mstooth3;
	public ModelRenderer mstooth4;
	public ModelRenderer mbtooth1;
	public ModelRenderer mbtooth2;
	public ModelRenderer mbtooth3;
	public ModelRenderer mbtooth4;
	public ModelRenderer mbtooth5;
	public ModelRenderer mbackspike1;
	public ModelRenderer mbackspike2;
	public ModelRenderer mbackspike3;
	public ModelRenderer mbackspike4;
	public ModelRenderer middleeye1;
	public ModelRenderer middleeye2;
	public ModelRenderer righthead;
	public ModelRenderer rightjaw;
	public ModelRenderer rightupperjaw;
	public ModelRenderer rstooth1;
	public ModelRenderer rstooth2;
	public ModelRenderer rstooth3;
	public ModelRenderer rstooth4;
	public ModelRenderer rbtooth1;
	public ModelRenderer rbtooth2;
	public ModelRenderer rbtooth3;
	public ModelRenderer rbtooth4;
	public ModelRenderer rbtooth5;
	public ModelRenderer rbackspike1;
	public ModelRenderer rbackspike2;
	public ModelRenderer rbackspike3;
	public ModelRenderer rbackspike4;
	public ModelRenderer righteye1;
	public ModelRenderer righteye2;
	public ModelRenderer middlewall;
	public ModelRenderer rightwall;
	public ModelRenderer leftwall;
	public ModelRenderer walltentacle1;
	public ModelRenderer walltentacle2;
	public ModelRenderer walltentacle3;
	public ModelRenderer walltentacle4;
	public ModelRenderer walltentacle5;
	public ModelRenderer walltentacle6;
	public ModelRenderer walltentacle7;
	public ModelRenderer walltentacle8;

	public ModelChagaroth()
	{
		textureWidth = 128;
		textureHeight = 64;

		frontspike1 = new ModelRenderer(this, 30, 50);
		frontspike1.addBox(0F, -4F, 0F, 1, 5, 1);
		frontspike1.setRotationPoint(-10F, 10F, -9F);
		frontspike1.setTextureSize(128, 64);
		frontspike1.mirror = true;
		setRotation(frontspike1, 0.6320364F, 0F, 0F);
		frontspike2 = new ModelRenderer(this, 30, 50);
		frontspike2.addBox(0F, -4F, 0F, 1, 5, 1);
		frontspike2.setRotationPoint(-4F, 10F, -9F);
		frontspike2.setTextureSize(128, 64);
		frontspike2.mirror = true;
		setRotation(frontspike2, 0.6320364F, 0F, 0F);
		frontspike3 = new ModelRenderer(this, 30, 50);
		frontspike3.addBox(0F, -4F, 0F, 1, 5, 1);
		frontspike3.setRotationPoint(2F, 10F, -9F);
		frontspike3.setTextureSize(128, 64);
		frontspike3.mirror = true;
		setRotation(frontspike3, 0.6320364F, 0F, 0F);
		frontspike4 = new ModelRenderer(this, 30, 50);
		frontspike4.addBox(0F, -4F, 0F, 1, 5, 1);
		frontspike4.setRotationPoint(8F, 10F, -9F);
		frontspike4.setTextureSize(128, 64);
		frontspike4.mirror = true;
		setRotation(frontspike4, 0.6320364F, 0F, 0F);
		frontspike5 = new ModelRenderer(this, 30, 50);
		frontspike5.addBox(0F, -4F, 0F, 1, 5, 1);
		frontspike5.setRotationPoint(14F, 10F, -9F);
		frontspike5.setTextureSize(128, 64);
		frontspike5.mirror = true;
		setRotation(frontspike5, 0.6320364F, 0F, 0F);
		leftneck = new ModelRenderer(this, 34, 0);
		leftneck.addBox(-1F, -16F, -2F, 3, 16, 3);
		leftneck.setRotationPoint(-7F, 10F, -1F);
		leftneck.setTextureSize(128, 64);
		leftneck.mirror = true;
		setRotation(leftneck, 0.4833219F, 0.2230717F, 0F);
		middleneck = new ModelRenderer(this, 34, 0);
		middleneck.addBox(-1F, -16F, -2F, 3, 16, 3);
		middleneck.setRotationPoint(2F, 10F, -1F);
		middleneck.setTextureSize(128, 64);
		middleneck.mirror = true;
		setRotation(middleneck, 0.4833219F, 0F, 0F);
		rightneck = new ModelRenderer(this, 34, 0);
		rightneck.addBox(-1F, -16F, -2F, 3, 16, 3);
		rightneck.setRotationPoint(10F, 10F, -1F);
		rightneck.setTextureSize(128, 64);
		rightneck.mirror = true;
		setRotation(rightneck, 0.4833219F, -0.2230705F, 0F);
		body = new ModelRenderer(this, 38, 30);
		body.addBox(0F, 0F, 0F, 25, 14, 20);
		body.setRotationPoint(-10F, 10F, -9F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		tentacle2base = new ModelRenderer(this, 0, 0);
		tentacle2base.addBox(0F, 0F, 0F, 9, 3, 3);
		tentacle2base.setRotationPoint(15F, 12F, -8F);
		tentacle2base.setTextureSize(128, 64);
		tentacle2base.mirror = true;
		setRotation(tentacle2base, 0F, 0F, 0F);
		tentacle1 = new ModelRenderer(this, 0, 0);
		tentacle1.addBox(-1.5F, -10F, -1.5F, 3, 10, 3);
		tentacle1.setRotationPoint(-2F, 10F, 9F);
		tentacle1.setTextureSize(128, 64);
		tentacle1.mirror = true;
		setRotation(tentacle1, 0F, 0F, 0F);
		tentacle2 = new ModelRenderer(this, 0, 0);
		tentacle2.addBox(-1.5F, -9F, -1.5F, 3, 9, 3);
		tentacle2.setRotationPoint(-2F, 1F, 9F);
		tentacle2.setTextureSize(128, 64);
		tentacle2.mirror = true;
		setRotation(tentacle2, 0.4833219F, 0F, 0F);
		tentacle3 = new ModelRenderer(this, 0, 0);
		tentacle3.addBox(-1.5F, -8F, -1.5F, 3, 8, 3);
		tentacle3.setRotationPoint(-2F, -6F, 5F);
		tentacle3.setTextureSize(128, 64);
		tentacle3.mirror = true;
		setRotation(tentacle3, -0.4461433F, 0F, 0F);
		tentacle4 = new ModelRenderer(this, 0, 0);
		tentacle4.addBox(0F, -1.5F, -1.5F, 9, 3, 3);
		tentacle4.setRotationPoint(-1F, 1F, 9F);
		tentacle4.setTextureSize(128, 64);
		tentacle4.mirror = true;
		setRotation(tentacle4, 0F, 0F, -0.5205006F);
		tentacle5 = new ModelRenderer(this, 0, 0);
		tentacle5.addBox(-1.5F, -1.5F, 0F, 3, 3, 10);
		tentacle5.setRotationPoint(-2F, -12F, 7F);
		tentacle5.setTextureSize(128, 64);
		tentacle5.mirror = true;
		setRotation(tentacle5, 0F, 0F, 0F);
		tentacle6 = new ModelRenderer(this, 0, 0);
		tentacle6.addBox(-1.5F, -8.5F, -1.5F, 3, 9, 3);
		tentacle6.setRotationPoint(-17.5F, 16F, -4F);
		tentacle6.setTextureSize(128, 64);
		tentacle6.mirror = true;
		setRotation(tentacle6, 0F, 0F, -0.3346075F);
		tentacle7 = new ModelRenderer(this, 0, 0);
		tentacle7.addBox(0F, -1.5F, -1.5F, 10, 3, 3);
		tentacle7.setRotationPoint(27F, 5F, 3F);
		tentacle7.setTextureSize(128, 64);
		tentacle7.mirror = true;
		setRotation(tentacle7, 0F, -0.5576792F, 0F);
		tentacle8 = new ModelRenderer(this, 0, 0);
		tentacle8.addBox(0F, -2.5F, -2.5F, 13, 5, 5);
		tentacle8.setRotationPoint(17F, 6F, 4F);
		tentacle8.setTextureSize(128, 64);
		tentacle8.mirror = true;
		setRotation(tentacle8, 0F, 0.2602503F, -0.1487144F);
		tentacle9 = new ModelRenderer(this, 0, 0);
		tentacle9.addBox(0F, 0F, 0F, 3, 12, 3);
		tentacle9.setRotationPoint(8F, 23F, -4F);
		tentacle9.setTextureSize(128, 64);
		tentacle9.mirror = true;
		setRotation(tentacle9, -0.4833219F, 0F, -0.5948578F);
		tentacle10 = new ModelRenderer(this, 0, 0);
		tentacle10.addBox(-9F, -1.5F, -1.5F, 9, 3, 3);
		tentacle10.setRotationPoint(-10F, 17F, -4F);
		tentacle10.setTextureSize(128, 64);
		tentacle10.mirror = true;
		setRotation(tentacle10, 0F, 0F, 0F);
		tentacle11 = new ModelRenderer(this, 0, 0);
		tentacle11.addBox(-1.5F, -1.5F, -11F, 3, 3, 11);
		tentacle11.setRotationPoint(-6F, 19F, -7F);
		tentacle11.setTextureSize(128, 64);
		tentacle11.mirror = true;
		setRotation(tentacle11, 0.1487144F, -0.4089647F, 0F);
		tentacle12 = new ModelRenderer(this, 0, 0);
		tentacle12.addBox(-2.5F, -10F, -2.5F, 5, 10, 5);
		tentacle12.setRotationPoint(16F, 8F, 4F);
		tentacle12.setTextureSize(128, 64);
		tentacle12.mirror = true;
		setRotation(tentacle12, 0F, 0F, 0F);
		tentacle13 = new ModelRenderer(this, 0, 0);
		tentacle13.addBox(-2.5F, -13F, -2.5F, 5, 8, 5);
		tentacle13.setRotationPoint(10F, 18F, 5F);
		tentacle13.setTextureSize(128, 64);
		tentacle13.mirror = true;
		setRotation(tentacle13, 0.0371786F, 0F, 0.5205006F);
		tentacle14 = new ModelRenderer(this, 0, 0);
		tentacle14.addBox(-1.5F, -11F, -1.5F, 3, 11, 3);
		tentacle14.setRotationPoint(17F, 0F, 5F);
		tentacle14.setTextureSize(128, 64);
		tentacle14.mirror = true;
		setRotation(tentacle14, -0.2602503F, 0F, 1.07818F);
		tentacle15 = new ModelRenderer(this, 0, 0);
		tentacle15.addBox(-1.5F, -1.5F, -8F, 3, 3, 8);
		tentacle15.setRotationPoint(25F, -5F, 7F);
		tentacle15.setTextureSize(128, 64);
		tentacle15.mirror = true;
		setRotation(tentacle15, 0F, -0.2974289F, 0F);
		tentacle16 = new ModelRenderer(this, 0, 0);
		tentacle16.addBox(0F, 0F, 0F, 3, 10, 3);
		tentacle16.setRotationPoint(0F, 22F, -6F);
		tentacle16.setTextureSize(128, 64);
		tentacle16.mirror = true;
		setRotation(tentacle16, -0.1115358F, 0F, 0.5205006F);
		tentacle17 = new ModelRenderer(this, 0, 0);
		tentacle17.addBox(0F, 0F, 0F, 3, 10, 3);
		tentacle17.setRotationPoint(5F, 24F, 4F);
		tentacle17.setTextureSize(128, 64);
		tentacle17.mirror = true;
		setRotation(tentacle17, 0.4461433F, 0F, 0F);
		tentacle18 = new ModelRenderer(this, 0, 0);
		tentacle18.addBox(0F, 0F, 0F, 5, 15, 5);
		tentacle18.setRotationPoint(-8F, 21F, 1F);
		tentacle18.setTextureSize(128, 64);
		tentacle18.mirror = true;
		setRotation(tentacle18, -0.37179F, 0F, 0.37179F);
		tentacle19 = new ModelRenderer(this, 0, 0);
		tentacle19.addBox(-12F, -1.5F, -1.5F, 12, 3, 3);
		tentacle19.setRotationPoint(-20F, 17F, 3F);
		tentacle19.setTextureSize(128, 64);
		tentacle19.mirror = true;
		setRotation(tentacle19, 0F, 0.8179294F, 0.3717861F);
		tentacle20 = new ModelRenderer(this, 0, 0);
		tentacle20.addBox(-8F, 0F, 0F, 13, 5, 5);
		tentacle20.setRotationPoint(-15F, 15F, 0F);
		tentacle20.setTextureSize(128, 64);
		tentacle20.mirror = true;
		setRotation(tentacle20, 0F, 0F, 0F);
		tlib12 = new ModelRenderer(this, 0, 0);
		tlib12.addBox(-1F, -1F, -8F, 3, 3, 8);
		tlib12.setRotationPoint(22F, 13F, -8F);
		tlib12.setTextureSize(128, 64);
		tlib12.mirror = true;
		setRotation(tlib12, 0F, 0F, 0F);
		tlib22 = new ModelRenderer(this, 30, 20);
		tlib22.addBox(-1F, -5F, -1F, 3, 5, 3);
		tlib22.setRotationPoint(22F, 14F, -15.5F);
		tlib22.setTextureSize(128, 64);
		tlib22.mirror = true;
		setRotation(tlib22, 0.8922867F, 0F, 0F);
		tspike12 = new ModelRenderer(this, 25, 25);
		tspike12.addBox(0F, -2F, 0F, 1, 2, 1);
		tspike12.setRotationPoint(23F, 10F, -19F);
		tspike12.setTextureSize(128, 64);
		tspike12.mirror = true;
		setRotation(tspike12, 0.0371786F, 0F, 0.5948578F);
		tspike22 = new ModelRenderer(this, 25, 25);
		tspike22.addBox(-1F, -2F, 0F, 1, 2, 1);
		tspike22.setRotationPoint(22F, 10F, -19F);
		tspike22.setTextureSize(128, 64);
		tspike22.mirror = true;
		setRotation(tspike22, 0.0371786F, 0F, -0.5948606F);
		tspike32 = new ModelRenderer(this, 25, 25);
		tspike32.addBox(0F, -2F, 0F, 1, 2, 1);
		tspike32.setRotationPoint(23F, 11.5F, -19F);
		tspike32.setTextureSize(128, 64);
		tspike32.mirror = true;
		setRotation(tspike32, 1.115355F, 0F, 0.5948578F);
		tspike42 = new ModelRenderer(this, 25, 25);
		tspike42.addBox(-1F, -2F, 0F, 1, 2, 1);
		tspike42.setRotationPoint(22F, 11.5F, -19F);
		tspike42.setTextureSize(128, 64);
		tspike42.mirror = true;
		setRotation(tspike42, 1.115353F, 0F, -0.5948606F);
		tlib1 = new ModelRenderer(this, 0, 0);
		tlib1.addBox(-1F, -1F, -8F, 3, 3, 8);
		tlib1.setRotationPoint(-2F, 20F, -16F);
		tlib1.setTextureSize(128, 64);
		tlib1.mirror = true;
		setRotation(tlib1, 0F, 0F, 0F);
		tlib2 = new ModelRenderer(this, 30, 20);
		tlib2.addBox(-1F, -5F, -1F, 3, 5, 3);
		tlib2.setRotationPoint(-2F, 21F, -23.5F);
		tlib2.setTextureSize(128, 64);
		tlib2.mirror = true;
		setRotation(tlib2, 0.8922867F, 0F, 0F);
		tspike1 = new ModelRenderer(this, 25, 25);
		tspike1.addBox(0F, -2F, 0F, 1, 2, 1);
		tspike1.setRotationPoint(-1F, 17F, -27F);
		tspike1.setTextureSize(128, 64);
		tspike1.mirror = true;
		setRotation(tspike1, 0.0371786F, 0F, 0.5948578F);
		tspike2 = new ModelRenderer(this, 25, 25);
		tspike2.addBox(-1F, -2F, 0F, 1, 2, 1);
		tspike2.setRotationPoint(-2F, 17F, -27F);
		tspike2.setTextureSize(128, 64);
		tspike2.mirror = true;
		setRotation(tspike2, 0.0371786F, 0F, -0.5948606F);
		tspike3 = new ModelRenderer(this, 25, 25);
		tspike3.addBox(0F, -2F, 0F, 1, 2, 1);
		tspike3.setRotationPoint(-1F, 18.5F, -27F);
		tspike3.setTextureSize(128, 64);
		tspike3.mirror = true;
		setRotation(tspike3, 1.115355F, 0F, 0.5948578F);
		tspike4 = new ModelRenderer(this, 25, 25);
		tspike4.addBox(-1F, -2F, 0F, 1, 2, 1);
		tspike4.setRotationPoint(-2F, 18.5F, -27.5F);
		tspike4.setTextureSize(128, 64);
		tspike4.mirror = true;
		setRotation(tspike4, 1.115353F, 0F, -0.5948606F);
		lefthead = new ModelRenderer(this, 0, 30);
		lefthead.addBox(-4.5F, -9F, -4.5F, 9, 9, 8);
		lefthead.setRotationPoint(-8F, -3F, -7F);
		lefthead.setTextureSize(128, 64);
		lefthead.mirror = true;
		setRotation(lefthead, 0F, 0F, 0F);
		leftjaw = new ModelRenderer(this, 0, 50);
		leftjaw.addBox(-4.5F, 1F, -6F, 9, 1, 9);
		leftjaw.setRotationPoint(0F, 0F, 0F);
		leftjaw.setTextureSize(128, 64);
		leftjaw.mirror = true;
		setRotation(leftjaw, 0.3346075F, 0F, 0F);
		lefthead.addChild(leftjaw);
		leftupperjaw = new ModelRenderer(this, 0, 28);
		leftupperjaw.addBox(0F, 0F, 0F, 9, 1, 1);
		leftupperjaw.setRotationPoint(-4.5F, -1F, -5.5F);
		leftupperjaw.setTextureSize(128, 64);
		leftupperjaw.mirror = true;
		setRotation(leftupperjaw, 0F, 0F, 0F);
		lefthead.addChild(leftupperjaw);
		lstooth1 = new ModelRenderer(this, 0, 50);
		lstooth1.addBox(0F, 0F, 0F, 1, 1, 1);
		lstooth1.setRotationPoint(-3.5F, 0F, -6F);
		lstooth1.setTextureSize(128, 64);
		lstooth1.mirror = true;
		setRotation(lstooth1, 0F, 0F, 0F);
		leftjaw.addChild(lstooth1);
		lstooth2 = new ModelRenderer(this, 0, 50);
		lstooth2.addBox(0F, 0F, 0F, 1, 1, 1);
		lstooth2.setRotationPoint(-1.5F, 0F, -6F);
		lstooth2.setTextureSize(128, 64);
		lstooth2.mirror = true;
		setRotation(lstooth2, 0F, 0F, 0F);
		leftjaw.addChild(lstooth2);
		lstooth3 = new ModelRenderer(this, 0, 50);
		lstooth3.addBox(0F, 0F, 0F, 1, 1, 1);
		lstooth3.setRotationPoint(0.5F, 0F, -6F);
		lstooth3.setTextureSize(128, 64);
		lstooth3.mirror = true;
		setRotation(lstooth3, 0F, 0F, 0F);
		leftjaw.addChild(lstooth3);
		lstooth4 = new ModelRenderer(this, 0, 50);
		lstooth4.addBox(0F, 0F, 0F, 1, 1, 1);
		lstooth4.setRotationPoint(2.5F, 0F, -6F);
		lstooth4.setTextureSize(128, 64);
		lstooth4.mirror = true;
		setRotation(lstooth4, 0F, 0F, 0F);
		leftjaw.addChild(lstooth4);
		lbtooth1 = new ModelRenderer(this, 0, 50);
		lbtooth1.addBox(0F, 0F, 0F, 1, 2, 1);
		lbtooth1.setRotationPoint(0F, 1F, 0F);
		lbtooth1.setTextureSize(128, 64);
		lbtooth1.mirror = true;
		setRotation(lbtooth1, 0F, 0F, 0F);
		leftupperjaw.addChild(lbtooth1);
		lbtooth2 = new ModelRenderer(this, 0, 50);
		lbtooth2.addBox(0F, 0F, 0F, 1, 2, 1);
		lbtooth2.setRotationPoint(2F, 1F, 0F);
		lbtooth2.setTextureSize(128, 64);
		lbtooth2.mirror = true;
		setRotation(lbtooth2, 0F, 0F, 0F);
		leftupperjaw.addChild(lbtooth2);
		lbtooth3 = new ModelRenderer(this, 0, 50);
		lbtooth3.addBox(0F, 0F, 0F, 1, 2, 1);
		lbtooth3.setRotationPoint(4F, 1F, 0F);
		lbtooth3.setTextureSize(128, 64);
		lbtooth3.mirror = true;
		setRotation(lbtooth3, 0F, 0F, 0F);
		leftupperjaw.addChild(lbtooth3);
		lbtooth4 = new ModelRenderer(this, 0, 50);
		lbtooth4.addBox(0F, 0F, 0F, 1, 2, 1);
		lbtooth4.setRotationPoint(6F, 1F, 0F);
		lbtooth4.setTextureSize(128, 64);
		lbtooth4.mirror = true;
		setRotation(lbtooth4, 0F, 0F, 0F);
		leftupperjaw.addChild(lbtooth4);
		lbtooth5 = new ModelRenderer(this, 0, 50);
		lbtooth5.addBox(0F, 0F, 0F, 1, 2, 1);
		lbtooth5.setRotationPoint(8F, 1F, 0F);
		lbtooth5.setTextureSize(128, 64);
		lbtooth5.mirror = true;
		setRotation(lbtooth5, 0F, 0F, 0F);
		leftupperjaw.addChild(lbtooth5);
		lbackspike1 = new ModelRenderer(this, 10, 24);
		lbackspike1.addBox(0F, 0F, 0F, 1, 1, 3);
		lbackspike1.setRotationPoint(-0.5F, -2F, 3.5F);
		lbackspike1.setTextureSize(128, 64);
		lbackspike1.mirror = true;
		setRotation(lbackspike1, 0F, 0F, 0F);
		lefthead.addChild(lbackspike1);
		lbackspike2 = new ModelRenderer(this, 10, 24);
		lbackspike2.addBox(0F, 0F, 0F, 1, 1, 3);
		lbackspike2.setRotationPoint(-0.5F, -4F, 3.5F);
		lbackspike2.setTextureSize(128, 64);
		lbackspike2.mirror = true;
		setRotation(lbackspike2, 0F, 0F, 0F);
		lefthead.addChild(lbackspike2);
		lbackspike3 = new ModelRenderer(this, 10, 24);
		lbackspike3.addBox(0F, 0F, 0F, 1, 1, 3);
		lbackspike3.setRotationPoint(-0.5F, -6F, 3.5F);
		lbackspike3.setTextureSize(128, 64);
		lbackspike3.mirror = true;
		setRotation(lbackspike3, 0F, 0F, 0F);
		lefthead.addChild(lbackspike3);
		lackspike4 = new ModelRenderer(this, 10, 24);
		lackspike4.addBox(0F, 0F, 0F, 1, 1, 3);
		lackspike4.setRotationPoint(-0.5F, -8F, 3.5F);
		lackspike4.setTextureSize(128, 64);
		lackspike4.mirror = true;
		setRotation(lackspike4, 0F, 0F, 0F);
		lefthead.addChild(lackspike4);
		lefteye1 = new ModelRenderer(this, 0, 24);
		lefteye1.addBox(0F, 0F, 0F, 3, 3, 1);
		lefteye1.setRotationPoint(0.5F, -6F, -5.5F);
		lefteye1.setTextureSize(128, 64);
		lefteye1.mirror = true;
		setRotation(lefteye1, 0F, 0F, 0F);
		lefthead.addChild(lefteye1);
		lefteye2 = new ModelRenderer(this, 0, 24);
		lefteye2.addBox(0F, 0F, 0F, 3, 3, 1);
		lefteye2.setRotationPoint(-3.5F, -6F, -5.5F);
		lefteye2.setTextureSize(128, 64);
		lefteye2.mirror = true;
		setRotation(lefteye2, 0F, 0F, 0F);
		lefthead.addChild(lefteye2);
		middlehead = new ModelRenderer(this, 0, 30);
		middlehead.addBox(-4.5F, -9F, -4.5F, 9, 9, 8);
		middlehead.setRotationPoint(3F, -3F, -7F);
		middlehead.setTextureSize(128, 64);
		middlehead.mirror = true;
		setRotation(middlehead, 0F, 0F, 0F);
		middlejaw = new ModelRenderer(this, 0, 50);
		middlejaw.addBox(-4.5F, 1F, -6F, 9, 1, 9);
		middlejaw.setRotationPoint(0,0,0);
		middlejaw.setTextureSize(128, 64);
		middlejaw.mirror = true;
		setRotation(middlejaw, 0.3346075F, 0F, 0F);
		middlehead.addChild(middlejaw);
		middleupperjaw = new ModelRenderer(this, 0, 28);
		middleupperjaw.addBox(0F, 0F, 0F, 9, 1, 1);
		middleupperjaw.setRotationPoint(-4.5F, -1F, -5.5F);
		middleupperjaw.setTextureSize(128, 64);
		middleupperjaw.mirror = true;
		setRotation(middleupperjaw, 0F, 0F, 0F);
		middlehead.addChild(middleupperjaw);
		mstooth1 = new ModelRenderer(this, 0, 50);
		mstooth1.addBox(0F, 0F, 0F, 1, 1, 1);
		mstooth1.setRotationPoint(-3.5F, 0F, -6F);
		mstooth1.setTextureSize(128, 64);
		mstooth1.mirror = true;
		setRotation(mstooth1, 0F, 0F, 0F);
		middlejaw.addChild(mstooth1);
		mstooth2 = new ModelRenderer(this, 0, 50);
		mstooth2.addBox(0F, 0F, 0F, 1, 1, 1);
		mstooth2.setRotationPoint(-1.5F, 0F, -6F);
		mstooth2.setTextureSize(128, 64);
		mstooth2.mirror = true;
		setRotation(mstooth2, 0F, 0F, 0F);
		middlejaw.addChild(mstooth2);
		mstooth3 = new ModelRenderer(this, 0, 50);
		mstooth3.addBox(0F, 0F, 0F, 1, 1, 1);
		mstooth3.setRotationPoint(0.5F, 0F, -6F);
		mstooth3.setTextureSize(128, 64);
		mstooth3.mirror = true;
		setRotation(mstooth3, 0F, 0F, 0F);
		middlejaw.addChild(mstooth3);
		mstooth4 = new ModelRenderer(this, 0, 50);
		mstooth4.addBox(0F, 0F, 0F, 1, 1, 1);
		mstooth4.setRotationPoint(2.5F, 0F, -6F);
		mstooth4.setTextureSize(128, 64);
		mstooth4.mirror = true;
		setRotation(mstooth4, 0F, 0F, 0F);
		middlejaw.addChild(mstooth4);
		mbtooth1 = new ModelRenderer(this, 0, 50);
		mbtooth1.addBox(0F, 0F, 0F, 1, 2, 1);
		mbtooth1.setRotationPoint(0F, 1F, 0F);
		mbtooth1.setTextureSize(128, 64);
		mbtooth1.mirror = true;
		setRotation(mbtooth1, 0F, 0F, 0F);
		middleupperjaw.addChild(mbtooth1);
		mbtooth2 = new ModelRenderer(this, 0, 50);
		mbtooth2.addBox(0F, 0F, 0F, 1, 2, 1);
		mbtooth2.setRotationPoint(2F, 1F, 0F);
		mbtooth2.setTextureSize(128, 64);
		mbtooth2.mirror = true;
		setRotation(mbtooth2, 0F, 0F, 0F);
		middleupperjaw.addChild(mbtooth2);
		mbtooth3 = new ModelRenderer(this, 0, 50);
		mbtooth3.addBox(0F, 0F, 0F, 1, 2, 1);
		mbtooth3.setRotationPoint(4F, 1F, 0F);
		mbtooth3.setTextureSize(128, 64);
		mbtooth3.mirror = true;
		setRotation(mbtooth3, 0F, 0F, 0F);
		middleupperjaw.addChild(mbtooth3);
		mbtooth4 = new ModelRenderer(this, 0, 50);
		mbtooth4.addBox(0F, 0F, 0F, 1, 2, 1);
		mbtooth4.setRotationPoint(6F, 1F, 0F);
		mbtooth4.setTextureSize(128, 64);
		mbtooth4.mirror = true;
		setRotation(mbtooth4, 0F, 0F, 0F);
		middleupperjaw.addChild(mbtooth4);
		mbtooth5 = new ModelRenderer(this, 0, 50);
		mbtooth5.addBox(0F, 0F, 0F, 1, 2, 1);
		mbtooth5.setRotationPoint(8F, 1F, 0F);
		mbtooth5.setTextureSize(128, 64);
		mbtooth5.mirror = true;
		setRotation(mbtooth5, 0F, 0F, 0F);
		middleupperjaw.addChild(mbtooth5);
		mbackspike1 = new ModelRenderer(this, 10, 24);
		mbackspike1.addBox(0F, 0F, 0F, 1, 1, 3);
		mbackspike1.setRotationPoint(-0.5F, -2F, 3.5F);
		mbackspike1.setTextureSize(128, 64);
		mbackspike1.mirror = true;
		setRotation(mbackspike1, 0F, 0F, 0F);
		middlehead.addChild(mbackspike1);
		mbackspike2 = new ModelRenderer(this, 10, 24);
		mbackspike2.addBox(0F, 0F, 0F, 1, 1, 3);
		mbackspike2.setRotationPoint(-0.5F, -4F, 3.5F);
		mbackspike2.setTextureSize(128, 64);
		mbackspike2.mirror = true;
		setRotation(mbackspike2, 0F, 0F, 0F);
		middlehead.addChild(mbackspike2);
		mbackspike3 = new ModelRenderer(this, 10, 24);
		mbackspike3.addBox(0F, 0F, 0F, 1, 1, 3);
		mbackspike3.setRotationPoint(-0.5F, -6F, 3.5F);
		mbackspike3.setTextureSize(128, 64);
		mbackspike3.mirror = true;
		setRotation(mbackspike3, 0F, 0F, 0F);
		middlehead.addChild(mbackspike3);
		mbackspike4 = new ModelRenderer(this, 10, 24);
		mbackspike4.addBox(0F, 0F, 0F, 1, 1, 3);
		mbackspike4.setRotationPoint(-0.5F, -8F, 3.5F);
		mbackspike4.setTextureSize(128, 64);
		mbackspike4.mirror = true;
		setRotation(mbackspike4, 0F, 0F, 0F);
		middlehead.addChild(mbackspike4);
		middleeye1 = new ModelRenderer(this, 0, 24);
		middleeye1.addBox(0F, 0F, 0F, 3, 3, 1);
		middleeye1.setRotationPoint(0.5F, -6F, -5.5F);
		middleeye1.setTextureSize(128, 64);
		middleeye1.mirror = true;
		setRotation(middleeye1, 0F, 0F, 0F);
		middlehead.addChild(middleeye1);
		middleeye2 = new ModelRenderer(this, 0, 24);
		middleeye2.addBox(0F, 0F, 0F, 3, 3, 1);
		middleeye2.setRotationPoint(-3.5F, -6F, -5.5F);
		middleeye2.setTextureSize(128, 64);
		middleeye2.mirror = true;
		setRotation(middleeye2, 0F, 0F, 0F);
		middlehead.addChild(middleeye2);
		righthead = new ModelRenderer(this, 0, 30);
		righthead.addBox(-4.5F, -9F, -4.5F, 9, 9, 8);
		righthead.setRotationPoint(13F, -3F, -7F);
		righthead.setTextureSize(128, 64);
		righthead.mirror = true;
		setRotation(righthead, 0F, 0F, 0F);
		rightjaw = new ModelRenderer(this, 0, 50);
		rightjaw.addBox(-4.5F, 1F, -6F, 9, 1, 9);
		rightjaw.setRotationPoint(0,0,0);
		rightjaw.setTextureSize(128, 64);
		rightjaw.mirror = true;
		setRotation(rightjaw, 0.3346075F, 0F, 0F);
		righthead.addChild(rightjaw);
		rightupperjaw = new ModelRenderer(this, 0, 28);
		rightupperjaw.addBox(0F, 0F, 0F, 9, 1, 1);
		rightupperjaw.setRotationPoint(-4.5F, -1F, -5.5F);
		rightupperjaw.setTextureSize(128, 64);
		rightupperjaw.mirror = true;
		setRotation(rightupperjaw, 0F, 0F, 0F);
		righthead.addChild(rightupperjaw);
		rstooth1 = new ModelRenderer(this, 0, 50);
		rstooth1.addBox(0F, 0F, 0F, 1, 1, 1);
		rstooth1.setRotationPoint(-3.5F, 0F, -6F);
		rstooth1.setTextureSize(128, 64);
		rstooth1.mirror = true;
		setRotation(rstooth1, 0F, 0F, 0F);
		rightjaw.addChild(rstooth1);
		rstooth2 = new ModelRenderer(this, 0, 50);
		rstooth2.addBox(0F, 0F, 0F, 1, 1, 1);
		rstooth2.setRotationPoint(-1.5F, 0F, -6F);
		rstooth2.setTextureSize(128, 64);
		rstooth2.mirror = true;
		setRotation(rstooth2, 0F, 0F, 0F);
		rightjaw.addChild(rstooth2);
		rstooth3 = new ModelRenderer(this, 0, 50);
		rstooth3.addBox(0F, 0F, 0F, 1, 1, 1);
		rstooth3.setRotationPoint(0.5F, 0F, -6F);
		rstooth3.setTextureSize(128, 64);
		rstooth3.mirror = true;
		setRotation(rstooth3, 0F, 0F, 0F);
		rightjaw.addChild(rstooth3);
		rstooth4 = new ModelRenderer(this, 0, 50);
		rstooth4.addBox(0F, 0F, 0F, 1, 1, 1);
		rstooth4.setRotationPoint(2.5F, 0F, -6F);
		rstooth4.setTextureSize(128, 64);
		rstooth4.mirror = true;
		setRotation(rstooth4, 0F, 0F, 0F);
		rightjaw.addChild(rstooth4);
		rbtooth1 = new ModelRenderer(this, 0, 50);
		rbtooth1.addBox(0F, 0F, 0F, 1, 2, 1);
		rbtooth1.setRotationPoint(0F, 1F, 0F);
		rbtooth1.setTextureSize(128, 64);
		rbtooth1.mirror = true;
		setRotation(rbtooth1, 0F, 0F, 0F);
		rightupperjaw.addChild(rbtooth1);
		rbtooth2 = new ModelRenderer(this, 0, 50);
		rbtooth2.addBox(0F, 0F, 0F, 1, 2, 1);
		rbtooth2.setRotationPoint(2F, 1F, 0F);
		rbtooth2.setTextureSize(128, 64);
		rbtooth2.mirror = true;
		setRotation(rbtooth2, 0F, 0F, 0F);
		rightupperjaw.addChild(rbtooth2);
		rbtooth3 = new ModelRenderer(this, 0, 50);
		rbtooth3.addBox(0F, 0F, 0F, 1, 2, 1);
		rbtooth3.setRotationPoint(4F, 1F, 0F);
		rbtooth3.setTextureSize(128, 64);
		rbtooth3.mirror = true;
		setRotation(rbtooth3, 0F, 0F, 0F);
		rightupperjaw.addChild(rbtooth3);
		rbtooth4 = new ModelRenderer(this, 0, 50);
		rbtooth4.addBox(0F, 0F, 0F, 1, 2, 1);
		rbtooth4.setRotationPoint(6F, 1F, 0F);
		rbtooth4.setTextureSize(128, 64);
		rbtooth4.mirror = true;
		setRotation(rbtooth4, 0F, 0F, 0F);
		rightupperjaw.addChild(rbtooth4);
		rbtooth5 = new ModelRenderer(this, 0, 50);
		rbtooth5.addBox(0F, 0F, 0F, 1, 2, 1);
		rbtooth5.setRotationPoint(8F, 1F, 0F);
		rbtooth5.setTextureSize(128, 64);
		rbtooth5.mirror = true;
		setRotation(rbtooth5, 0F, 0F, 0F);
		rightupperjaw.addChild(rbtooth5);
		rbackspike1 = new ModelRenderer(this, 10, 24);
		rbackspike1.addBox(0F, 0F, 0F, 1, 1, 3);
		rbackspike1.setRotationPoint(-0.5F, -2F, 3.5F);
		rbackspike1.setTextureSize(128, 64);
		rbackspike1.mirror = true;
		setRotation(rbackspike1, 0F, 0F, 0F);
		righthead.addChild(rbackspike1);
		rbackspike2 = new ModelRenderer(this, 10, 24);
		rbackspike2.addBox(0F, 0F, 0F, 1, 1, 3);
		rbackspike2.setRotationPoint(-0.5F, -4F, 3.5F);
		rbackspike2.setTextureSize(128, 64);
		rbackspike2.mirror = true;
		setRotation(rbackspike2, 0F, 0F, 0F);
		righthead.addChild(rbackspike2);
		rbackspike3 = new ModelRenderer(this, 10, 24);
		rbackspike3.addBox(0F, 0F, 0F, 1, 1, 3);
		rbackspike3.setRotationPoint(-0.5F, -6F, 3.5F);
		rbackspike3.setTextureSize(128, 64);
		rbackspike3.mirror = true;
		setRotation(rbackspike3, 0F, 0F, 0F);
		righthead.addChild(rbackspike3);
		rbackspike4 = new ModelRenderer(this, 10, 24);
		rbackspike4.addBox(0F, 0F, 0F, 1, 1, 3);
		rbackspike4.setRotationPoint(-0.5F, -8F, 3.5F);
		rbackspike4.setTextureSize(128, 64);
		rbackspike4.mirror = true;
		setRotation(rbackspike4, 0F, 0F, 0F);
		righthead.addChild(rbackspike4);
		righteye1 = new ModelRenderer(this, 0, 24);
		righteye1.addBox(0F, 0F, 0F, 3, 3, 1);
		righteye1.setRotationPoint(0.5F, -6F, -5.5F);
		righteye1.setTextureSize(128, 64);
		righteye1.mirror = true;
		setRotation(righteye1, 0F, 0F, 0F);
		righthead.addChild(righteye1);
		righteye2 = new ModelRenderer(this, 0, 24);
		righteye2.addBox(0F, 0F, 0F, 3, 3, 1);
		righteye2.setRotationPoint(-3.5F, -6F, -5.5F);
		righteye2.setTextureSize(128, 64);
		righteye2.mirror = true;
		setRotation(righteye2, 0F, 0F, 0F);
		righthead.addChild(righteye2);
		middlewall = new ModelRenderer(this, 46, 0);
		middlewall.addBox(0F, 0F, 0F, 40, 40, 1);
		middlewall.setRotationPoint(-18F, -15F, 17F);
		middlewall.setTextureSize(128, 64);
		middlewall.mirror = true;
		setRotation(middlewall, 0F, 0F, 0F);
		rightwall = new ModelRenderer(this, 46, 0);
		rightwall.addBox(0F, 0F, 0F, 40, 40, 1);
		rightwall.setRotationPoint(22F, -15F, 17F);
		rightwall.setTextureSize(128, 64);
		rightwall.mirror = true;
		setRotation(rightwall, 0F, 0.669215F, 0F);
		leftwall = new ModelRenderer(this, 46, 0);
		leftwall.addBox(-40F, 0F, 0F, 40, 40, 1);
		leftwall.setRotationPoint(-18F, -15F, 17F);
		leftwall.setTextureSize(128, 64);
		leftwall.mirror = true;
		setRotation(leftwall, 0F, -0.6692116F, 0F);
		walltentacle1 = new ModelRenderer(this, 0, 0);
		walltentacle1.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle1.setRotationPoint(-30F, -3F, 9F);
		walltentacle1.setTextureSize(128, 64);
		walltentacle1.mirror = true;
		setRotation(walltentacle1, 0F, 0F, 0F);
		walltentacle2 = new ModelRenderer(this, 0, 0);
		walltentacle2.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle2.setRotationPoint(-33F, 9F, 7F);
		walltentacle2.setTextureSize(128, 64);
		walltentacle2.mirror = true;
		setRotation(walltentacle2, 0F, 0F, 0F);
		walltentacle3 = new ModelRenderer(this, 0, 0);
		walltentacle3.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle3.setRotationPoint(-42F, 0F, 0F);
		walltentacle3.setTextureSize(128, 64);
		walltentacle3.mirror = true;
		setRotation(walltentacle3, 0F, 0F, 0F);
		walltentacle4 = new ModelRenderer(this, 0, 0);
		walltentacle4.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle4.setRotationPoint(-23F, 6F, 15F);
		walltentacle4.setTextureSize(128, 64);
		walltentacle4.mirror = true;
		setRotation(walltentacle4, 0F, 0F, 0F);
		walltentacle5 = new ModelRenderer(this, 0, 0);
		walltentacle5.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle5.setRotationPoint(42F, 0F, 3F);
		walltentacle5.setTextureSize(128, 64);
		walltentacle5.mirror = true;
		setRotation(walltentacle5, 0F, 0F, 0F);
		walltentacle6 = new ModelRenderer(this, 0, 0);
		walltentacle6.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle6.setRotationPoint(33F, -6F, 9F);
		walltentacle6.setTextureSize(128, 64);
		walltentacle6.mirror = true;
		setRotation(walltentacle6, 0F, 0F, 0F);
		walltentacle7 = new ModelRenderer(this, 0, 0);
		walltentacle7.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle7.setRotationPoint(36F, 11F, 7F);
		walltentacle7.setTextureSize(128, 64);
		walltentacle7.mirror = true;
		setRotation(walltentacle7, 0F, 0F, 0F);
		walltentacle8 = new ModelRenderer(this, 0, 0);
		walltentacle8.addBox(-1.5F, -1.5F, -12F, 3, 3, 12);
		walltentacle8.setRotationPoint(46.13334F, 17F, 0F);
		walltentacle8.setTextureSize(128, 64);
		walltentacle8.mirror = true;
		setRotation(walltentacle8, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GlStateManager.pushMatrix();
		super.render(entity, f, f1, f2, f3, f4, f5);
		GlStateManager.scale(2.0F, 2.0F, 2.0F);
		GlStateManager.translate(0F, -0.75F, 0F);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		frontspike1.render(f5);
		frontspike2.render(f5);
		frontspike3.render(f5);
		frontspike4.render(f5);
		frontspike5.render(f5);
		leftneck.render(f5);
		middleneck.render(f5);
		rightneck.render(f5);
		body.render(f5);
		tentacle2base.render(f5);
		tentacle1.render(f5);
		tentacle2.render(f5);
		tentacle3.render(f5);
		tentacle4.render(f5);
		tentacle5.render(f5);
		tentacle6.render(f5);
		tentacle7.render(f5);
		tentacle8.render(f5);
		tentacle9.render(f5);
		tentacle10.render(f5);
		tentacle11.render(f5);
		tentacle12.render(f5);
		tentacle13.render(f5);
		tentacle14.render(f5);
		tentacle15.render(f5);
		tentacle16.render(f5);
		tentacle17.render(f5);
		tentacle18.render(f5);
		tentacle19.render(f5);
		tentacle20.render(f5);
		tlib12.render(f5);
		tlib22.render(f5);
		tspike12.render(f5);
		tspike22.render(f5);
		tspike32.render(f5);
		tspike42.render(f5);
		tlib1.render(f5);
		tlib2.render(f5);
		tspike1.render(f5);
		tspike2.render(f5);
		tspike3.render(f5);
		tspike4.render(f5);
		lefthead.render(f5);
		middlehead.render(f5);
		righthead.render(f5);
		middlewall.render(f5);
		rightwall.render(f5);
		leftwall.render(f5);
		walltentacle1.render(f5);
		walltentacle2.render(f5);
		walltentacle3.render(f5);
		walltentacle4.render(f5);
		walltentacle5.render(f5);
		walltentacle6.render(f5);
		walltentacle7.render(f5);
		walltentacle8.render(f5);
		GlStateManager.popMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		lefthead.rotateAngleY = f3 / (180F / (float)Math.PI);
		lefthead.rotateAngleX = f4 / (180F / (float)Math.PI);

		middlehead.rotateAngleY = f3 / (180F / (float)Math.PI);
		middlehead.rotateAngleX = f4 / (180F / (float)Math.PI);

		righthead.rotateAngleY = f3 / (180F / (float)Math.PI);
		righthead.rotateAngleX = f4 / (180F / (float)Math.PI);

		walltentacle1.rotateAngleX = MathHelper.cos(f4 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle2.rotateAngleX = MathHelper.cos(f4 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle3.rotateAngleX = MathHelper.cos(f4 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle4.rotateAngleX = MathHelper.cos(f4 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle5.rotateAngleX = MathHelper.cos(f4 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle6.rotateAngleX = MathHelper.cos(f4 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle7.rotateAngleX = MathHelper.cos(f4 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle8.rotateAngleX = MathHelper.cos(f4 * 0.6662F) * 2.0F * f1 * 0.5F;

		walltentacle1.rotateAngleY = MathHelper.cos(f3 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle2.rotateAngleY = MathHelper.cos(f3 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle3.rotateAngleY = MathHelper.cos(f3 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle4.rotateAngleY = MathHelper.cos(f3 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle5.rotateAngleY = MathHelper.cos(f3 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle6.rotateAngleY = MathHelper.cos(f3 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle7.rotateAngleY = MathHelper.cos(f3 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle8.rotateAngleY = MathHelper.cos(f3 * 0.6662F) * 2.0F * f1 * 0.5F;

		walltentacle1.rotateAngleZ = MathHelper.cos(f5 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle2.rotateAngleZ = MathHelper.cos(f5 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle3.rotateAngleZ = MathHelper.cos(f5 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle4.rotateAngleZ = MathHelper.cos(f5 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle5.rotateAngleZ = MathHelper.cos(f5 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle6.rotateAngleZ = MathHelper.cos(f5 * 0.6662F) * 2.0F * f1 * 0.5F;
		walltentacle7.rotateAngleZ = MathHelper.cos(f5 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		walltentacle8.rotateAngleZ = MathHelper.cos(f5 * 0.6662F) * 2.0F * f1 * 0.5F;

		if(((EntityChagaroth)entity).deathTicks <= 200 && ((EntityChagaroth)entity).deathTicks > 0){
			++rot;
			lefthead.rotateAngleY = (180F - rot)  / (float)Math.PI;
			lefthead.rotateAngleX = (180F + rot) / (float)Math.PI;
			lefthead.rotateAngleZ = (180F + rot) / (float)Math.PI;

			middlehead.rotateAngleY = (180F + rot) / (float)Math.PI;
			middlehead.rotateAngleX = (180F - rot) / (float)Math.PI;
			middlehead.rotateAngleZ = (180F - rot) / (float)Math.PI;

			righthead.rotateAngleY = (180F + rot) / (float)Math.PI;
			righthead.rotateAngleX = (180F + rot) / (float)Math.PI;
			righthead.rotateAngleZ = (180F + rot) / (float)Math.PI;

			walltentacle1.isHidden = true;
			walltentacle2.isHidden = true;
			walltentacle3.isHidden = true;
			walltentacle4.isHidden = true;
			walltentacle5.isHidden = true;
			walltentacle6.isHidden = true;
			walltentacle7.isHidden = true;
			walltentacle8.isHidden = true;

			leftwall.isHidden = true;
			rightwall.isHidden = true;
		}
		if(((EntityChagaroth)entity).deathTicks == 0){

			lefthead.rotateAngleY = f3 / (180F / (float)Math.PI);
			lefthead.rotateAngleX = f4 / (180F / (float)Math.PI);
			lefthead.rotateAngleZ = 0;

			middlehead.rotateAngleY = f3 / (180F / (float)Math.PI);
			middlehead.rotateAngleX = f4 / (180F / (float)Math.PI);
			middlehead.rotateAngleZ = 0;

			righthead.rotateAngleY = f3 / (180F / (float)Math.PI);
			righthead.rotateAngleX = f4 / (180F / (float)Math.PI);
			righthead.rotateAngleZ = 0;

			walltentacle1.isHidden = false;
			walltentacle2.isHidden = false;
			walltentacle3.isHidden = false;
			walltentacle4.isHidden = false;
			walltentacle5.isHidden = false;
			walltentacle6.isHidden = false;
			walltentacle7.isHidden = false;
			walltentacle8.isHidden = false;

			leftwall.isHidden = false;
			rightwall.isHidden = false;
		}
	}
}
