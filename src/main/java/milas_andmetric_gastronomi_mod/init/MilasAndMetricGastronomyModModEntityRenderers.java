/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import milas_andmetric_gastronomi_mod.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class MilasAndMetricGastronomyModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.M.get(), MRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.S_GUACAPIDER.get(), SGuacapiderRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.REYNAGUACA.get(), ReynaguacaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.GUACAPIG.get(), GuacapigRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OLLITA.get(), OllitaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OLLITACCHULE.get(), OllitacchuleRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.BURBUJITO.get(), BurbujitoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.JAMON.get(), JamonRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.CHEF.get(), ChefRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.MILASCHEF.get(), MilaschefRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSODEGOMA.get(), OsodegomaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.G_UARDIAGUACA.get(), GUardiaguacaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSITO_2.get(), Osito2Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSITO_3.get(), Osito3Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSITO_4.get(), Osito4Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSITO_5.get(), Osito5Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.NAITBEAR.get(), NaitbearRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HADA_DEDULCE.get(), HadaDedulceRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.CORRINPOPPER.get(), CorrinpopperRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SWETIPOPPER.get(), SwetipopperRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.CORRINMETRIC.get(), CorrinmetricRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DUMPLINGVENDEDORDEBOBA.get(), DumplingvendedordebobaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DUMPLINPEQUENO.get(), DumplinpequenoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DUMPLINGMEDIANO.get(), DumplingmedianoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DUMPLINGRANDE.get(), DumplingrandeRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.CALAMARFRITO.get(), CalamarfritoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SANDWICHSALVAJE.get(), SandwichsalvajeRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.CUBANO.get(), CubanoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SANDWICHDULCE.get(), SandwichdulceRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.OSO_6.get(), Oso6Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB.get(), HeladomobRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_2.get(), Heladomob2Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_3.get(), Heladomob3Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_4.get(), Heladomob4Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_5.get(), Heladomob5Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_6.get(), Heladomob6Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_7.get(), Heladomob7Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMOB_8.get(), Heladomob8Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.HELADOMETRIC.get(), HeladometricRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SLIME.get(), SlimeRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DONASANGUIJUELA.get(), DonasanguijuelaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.PHATOMPALETA.get(), PhatompaletaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.PHATOMPALETA_2.get(), Phatompaleta2Renderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.JARRON.get(), JarronRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.JARRONJULIAN.get(), JarronjulianRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SMORE.get(), SmoreRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SMOREVOLADOR.get(), SmorevoladorRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.ARANAHAMBURGUESA.get(), AranahamburguesaRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.SERPIENTEHELADO.get(), SerpienteheladoRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.DUMPLINGIGANTE.get(), DumplingiganteRenderer::new);
		event.registerEntityRenderer(MilasAndMetricGastronomyModModEntities.MALTEADITO.get(), MalteaditoRenderer::new);
	}
}