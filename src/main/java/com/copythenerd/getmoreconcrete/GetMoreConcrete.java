package com.copythenerd.getmoreconcrete;

import com.copythenerd.getmoreconcrete.block.ConcreteBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetMoreConcrete implements ModInitializer {
	public static final String MOD_ID = "get-more-concrete";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ConcreteBlocks.registerConcreteBlocks();
	}
}