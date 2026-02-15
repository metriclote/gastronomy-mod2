/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import milas_andmetric_gastronomi_mod.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class MilasAndMetricGastronomyModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvoladorsmore.LAYER_LOCATION, Modelvoladorsmore::createBodyLayer);
		event.registerLayerDefinition(Modeldumplin.LAYER_LOCATION, Modeldumplin::createBodyLayer);
		event.registerLayerDefinition(ModelHADA.LAYER_LOCATION, ModelHADA::createBodyLayer);
		event.registerLayerDefinition(Modelcornfeti_popper.LAYER_LOCATION, Modelcornfeti_popper::createBodyLayer);
		event.registerLayerDefinition(Modelphatompaleta.LAYER_LOCATION, Modelphatompaleta::createBodyLayer);
		event.registerLayerDefinition(Modeldumplingmediano.LAYER_LOCATION, Modeldumplingmediano::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelsmores.LAYER_LOCATION, Modelsmores::createBodyLayer);
		event.registerLayerDefinition(Modelicecream.LAYER_LOCATION, Modelicecream::createBodyLayer);
		event.registerLayerDefinition(Modelboss_gummy_bear.LAYER_LOCATION, Modelboss_gummy_bear::createBodyLayer);
		event.registerLayerDefinition(Modelestatuanait.LAYER_LOCATION, Modelestatuanait::createBodyLayer);
		event.registerLayerDefinition(Modeljuliancola.LAYER_LOCATION, Modeljuliancola::createBodyLayer);
		event.registerLayerDefinition(Modelmilasguard.LAYER_LOCATION, Modelmilasguard::createBodyLayer);
		event.registerLayerDefinition(Modelgummy_bear.LAYER_LOCATION, Modelgummy_bear::createBodyLayer);
		event.registerLayerDefinition(Modelsandwich.LAYER_LOCATION, Modelsandwich::createBodyLayer);
		event.registerLayerDefinition(Modelbloqueserpiente.LAYER_LOCATION, Modelbloqueserpiente::createBodyLayer);
		event.registerLayerDefinition(Modeldumplinggigante.LAYER_LOCATION, Modeldumplinggigante::createBodyLayer);
		event.registerLayerDefinition(Modeljegechefgb.LAYER_LOCATION, Modeljegechefgb::createBodyLayer);
		event.registerLayerDefinition(Modelchef.LAYER_LOCATION, Modelchef::createBodyLayer);
		event.registerLayerDefinition(Modeljarron.LAYER_LOCATION, Modeljarron::createBodyLayer);
		event.registerLayerDefinition(Modelcubano.LAYER_LOCATION, Modelcubano::createBodyLayer);
		event.registerLayerDefinition(Modelravioli.LAYER_LOCATION, Modelravioli::createBodyLayer);
		event.registerLayerDefinition(Modeldonasanguijuela.LAYER_LOCATION, Modeldonasanguijuela::createBodyLayer);
		event.registerLayerDefinition(Modelmalteada.LAYER_LOCATION, Modelmalteada::createBodyLayer);
		event.registerLayerDefinition(Modelreinaguacaraña.LAYER_LOCATION, Modelreinaguacaraña::createBodyLayer);
		event.registerLayerDefinition(Modelsandw2.LAYER_LOCATION, Modelsandw2::createBodyLayer);
		event.registerLayerDefinition(Modelserpientehelado.LAYER_LOCATION, Modelserpientehelado::createBodyLayer);
		event.registerLayerDefinition(ModelnaitBear_47.LAYER_LOCATION, ModelnaitBear_47::createBodyLayer);
		event.registerLayerDefinition(Modeldunplin_pequeño.LAYER_LOCATION, Modeldunplin_pequeño::createBodyLayer);
		event.registerLayerDefinition(Modelcorinmetric.LAYER_LOCATION, Modelcorinmetric::createBodyLayer);
		event.registerLayerDefinition(Modeldumpling_grande.LAYER_LOCATION, Modeldumpling_grande::createBodyLayer);
		event.registerLayerDefinition(Modelgy.LAYER_LOCATION, Modelgy::createBodyLayer);
	}
}