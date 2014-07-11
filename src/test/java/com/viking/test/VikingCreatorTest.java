package com.viking.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.viking.test.VikingCreatorImpl.VikingLineage;

public class VikingCreatorTest {

	VikingCreator vikingCreator;

	@Before
	public void setUp() {

		vikingCreator = new VikingCreatorImpl();
	}

	@Test
	public void testCreateVikingPersonWithNordicGodLineageShouldCreateThor() {

		VikingLineage nordicGod = new VikingLineage("nordic-god");

		vikingCreator.perform(nordicGod,
				vkp -> Assert.assertEquals("Thor", vkp.name));
	}

	@Test
	public void testCreateVikingPersonWithNordicHumanLineageShouldCreateRagnar() {

		VikingLineage nordicHuman = new VikingLineage("nordic-human");

		vikingCreator.perform(nordicHuman,
				vkp -> Assert.assertEquals("Ragnar", vkp.name));
	}
}
