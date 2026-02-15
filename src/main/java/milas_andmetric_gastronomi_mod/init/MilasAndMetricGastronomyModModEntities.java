/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import milas_andmetric_gastronomi_mod.entity.*;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

@EventBusSubscriber
public class MilasAndMetricGastronomyModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MEntity>> M = register("m", EntityType.Builder.<MEntity>of(MEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SGuacapiderEntity>> S_GUACAPIDER = register("s_guacapider",
			EntityType.Builder.<SGuacapiderEntity>of(SGuacapiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ReynaguacaEntity>> REYNAGUACA = register("reynaguaca",
			EntityType.Builder.<ReynaguacaEntity>of(ReynaguacaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GuacapigEntity>> GUACAPIG = register("guacapig",
			EntityType.Builder.<GuacapigEntity>of(GuacapigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<OllitaEntity>> OLLITA = register("ollita",
			EntityType.Builder.<OllitaEntity>of(OllitaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OllitacchuleEntity>> OLLITACCHULE = register("ollitacchule",
			EntityType.Builder.<OllitacchuleEntity>of(OllitacchuleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BurbujitoEntity>> BURBUJITO = register("burbujito",
			EntityType.Builder.<BurbujitoEntity>of(BurbujitoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<JamonEntity>> JAMON = register("jamon",
			EntityType.Builder.<JamonEntity>of(JamonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChefEntity>> CHEF = register("chef",
			EntityType.Builder.<ChefEntity>of(ChefEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MilaschefEntity>> MILASCHEF = register("milaschef",
			EntityType.Builder.<MilaschefEntity>of(MilaschefEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OsodegomaEntity>> OSODEGOMA = register("osodegoma",
			EntityType.Builder.<OsodegomaEntity>of(OsodegomaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GUardiaguacaEntity>> G_UARDIAGUACA = register("g_uardiaguaca",
			EntityType.Builder.<GUardiaguacaEntity>of(GUardiaguacaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<Osito2Entity>> OSITO_2 = register("osito_2",
			EntityType.Builder.<Osito2Entity>of(Osito2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Osito3Entity>> OSITO_3 = register("osito_3",
			EntityType.Builder.<Osito3Entity>of(Osito3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Osito4Entity>> OSITO_4 = register("osito_4",
			EntityType.Builder.<Osito4Entity>of(Osito4Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Osito5Entity>> OSITO_5 = register("osito_5",
			EntityType.Builder.<Osito5Entity>of(Osito5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NaitbearEntity>> NAITBEAR = register("naitbear",
			EntityType.Builder.<NaitbearEntity>of(NaitbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<HadaDedulceEntity>> HADA_DEDULCE = register("hada_dedulce",
			EntityType.Builder.<HadaDedulceEntity>of(HadaDedulceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorrinpopperEntity>> CORRINPOPPER = register("corrinpopper",
			EntityType.Builder.<CorrinpopperEntity>of(CorrinpopperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SwetipopperEntity>> SWETIPOPPER = register("swetipopper",
			EntityType.Builder.<SwetipopperEntity>of(SwetipopperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorrinmetricEntity>> CORRINMETRIC = register("corrinmetric",
			EntityType.Builder.<CorrinmetricEntity>of(CorrinmetricEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumplingvendedordebobaEntity>> DUMPLINGVENDEDORDEBOBA = register("dumplingvendedordeboba",
			EntityType.Builder.<DumplingvendedordebobaEntity>of(DumplingvendedordebobaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumplinpequenoEntity>> DUMPLINPEQUENO = register("dumplinpequeno",
			EntityType.Builder.<DumplinpequenoEntity>of(DumplinpequenoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumplingmedianoEntity>> DUMPLINGMEDIANO = register("dumplingmediano",
			EntityType.Builder.<DumplingmedianoEntity>of(DumplingmedianoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumplingrandeEntity>> DUMPLINGRANDE = register("dumplingrande",
			EntityType.Builder.<DumplingrandeEntity>of(DumplingrandeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CalamarfritoEntity>> CALAMARFRITO = register("calamarfrito",
			EntityType.Builder.<CalamarfritoEntity>of(CalamarfritoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandwichsalvajeEntity>> SANDWICHSALVAJE = register("sandwichsalvaje",
			EntityType.Builder.<SandwichsalvajeEntity>of(SandwichsalvajeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CubanoEntity>> CUBANO = register("cubano",
			EntityType.Builder.<CubanoEntity>of(CubanoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandwichdulceEntity>> SANDWICHDULCE = register("sandwichdulce",
			EntityType.Builder.<SandwichdulceEntity>of(SandwichdulceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Oso6Entity>> OSO_6 = register("oso_6",
			EntityType.Builder.<Oso6Entity>of(Oso6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeladomobEntity>> HELADOMOB = register("heladomob",
			EntityType.Builder.<HeladomobEntity>of(HeladomobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob2Entity>> HELADOMOB_2 = register("heladomob_2",
			EntityType.Builder.<Heladomob2Entity>of(Heladomob2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob3Entity>> HELADOMOB_3 = register("heladomob_3",
			EntityType.Builder.<Heladomob3Entity>of(Heladomob3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob4Entity>> HELADOMOB_4 = register("heladomob_4",
			EntityType.Builder.<Heladomob4Entity>of(Heladomob4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob5Entity>> HELADOMOB_5 = register("heladomob_5",
			EntityType.Builder.<Heladomob5Entity>of(Heladomob5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob6Entity>> HELADOMOB_6 = register("heladomob_6",
			EntityType.Builder.<Heladomob6Entity>of(Heladomob6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob7Entity>> HELADOMOB_7 = register("heladomob_7",
			EntityType.Builder.<Heladomob7Entity>of(Heladomob7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Heladomob8Entity>> HELADOMOB_8 = register("heladomob_8",
			EntityType.Builder.<Heladomob8Entity>of(Heladomob8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeladometricEntity>> HELADOMETRIC = register("heladometric",
			EntityType.Builder.<HeladometricEntity>of(HeladometricEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SlimeEntity>> SLIME = register("slime",
			EntityType.Builder.<SlimeEntity>of(SlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DonasanguijuelaEntity>> DONASANGUIJUELA = register("donasanguijuela",
			EntityType.Builder.<DonasanguijuelaEntity>of(DonasanguijuelaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PhatompaletaEntity>> PHATOMPALETA = register("phatompaleta",
			EntityType.Builder.<PhatompaletaEntity>of(PhatompaletaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Phatompaleta2Entity>> PHATOMPALETA_2 = register("phatompaleta_2",
			EntityType.Builder.<Phatompaleta2Entity>of(Phatompaleta2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<JarronEntity>> JARRON = register("jarron",
			EntityType.Builder.<JarronEntity>of(JarronEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<JarronjulianEntity>> JARRONJULIAN = register("jarronjulian",
			EntityType.Builder.<JarronjulianEntity>of(JarronjulianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmoreEntity>> SMORE = register("smore",
			EntityType.Builder.<SmoreEntity>of(SmoreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmorevoladorEntity>> SMOREVOLADOR = register("smorevolador",
			EntityType.Builder.<SmorevoladorEntity>of(SmorevoladorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AranahamburguesaEntity>> ARANAHAMBURGUESA = register("aranahamburguesa",
			EntityType.Builder.<AranahamburguesaEntity>of(AranahamburguesaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SerpienteheladoEntity>> SERPIENTEHELADO = register("serpientehelado",
			EntityType.Builder.<SerpienteheladoEntity>of(SerpienteheladoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumplingiganteEntity>> DUMPLINGIGANTE = register("dumplingigante",
			EntityType.Builder.<DumplingiganteEntity>of(DumplingiganteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MalteaditoEntity>> MALTEADITO = register("malteadito",
			EntityType.Builder.<MalteaditoEntity>of(MalteaditoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MilasAndMetricGastronomyModMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		MEntity.init(event);
		SGuacapiderEntity.init(event);
		ReynaguacaEntity.init(event);
		GuacapigEntity.init(event);
		OllitaEntity.init(event);
		OllitacchuleEntity.init(event);
		BurbujitoEntity.init(event);
		JamonEntity.init(event);
		ChefEntity.init(event);
		MilaschefEntity.init(event);
		OsodegomaEntity.init(event);
		GUardiaguacaEntity.init(event);
		Osito2Entity.init(event);
		Osito3Entity.init(event);
		Osito4Entity.init(event);
		Osito5Entity.init(event);
		NaitbearEntity.init(event);
		HadaDedulceEntity.init(event);
		CorrinpopperEntity.init(event);
		SwetipopperEntity.init(event);
		CorrinmetricEntity.init(event);
		DumplingvendedordebobaEntity.init(event);
		DumplinpequenoEntity.init(event);
		DumplingmedianoEntity.init(event);
		DumplingrandeEntity.init(event);
		CalamarfritoEntity.init(event);
		SandwichsalvajeEntity.init(event);
		CubanoEntity.init(event);
		SandwichdulceEntity.init(event);
		Oso6Entity.init(event);
		HeladomobEntity.init(event);
		Heladomob2Entity.init(event);
		Heladomob3Entity.init(event);
		Heladomob4Entity.init(event);
		Heladomob5Entity.init(event);
		Heladomob6Entity.init(event);
		Heladomob7Entity.init(event);
		Heladomob8Entity.init(event);
		HeladometricEntity.init(event);
		SlimeEntity.init(event);
		DonasanguijuelaEntity.init(event);
		PhatompaletaEntity.init(event);
		Phatompaleta2Entity.init(event);
		JarronEntity.init(event);
		JarronjulianEntity.init(event);
		SmoreEntity.init(event);
		SmorevoladorEntity.init(event);
		AranahamburguesaEntity.init(event);
		SerpienteheladoEntity.init(event);
		DumplingiganteEntity.init(event);
		MalteaditoEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(M.get(), MEntity.createAttributes().build());
		event.put(S_GUACAPIDER.get(), SGuacapiderEntity.createAttributes().build());
		event.put(REYNAGUACA.get(), ReynaguacaEntity.createAttributes().build());
		event.put(GUACAPIG.get(), GuacapigEntity.createAttributes().build());
		event.put(OLLITA.get(), OllitaEntity.createAttributes().build());
		event.put(OLLITACCHULE.get(), OllitacchuleEntity.createAttributes().build());
		event.put(BURBUJITO.get(), BurbujitoEntity.createAttributes().build());
		event.put(JAMON.get(), JamonEntity.createAttributes().build());
		event.put(CHEF.get(), ChefEntity.createAttributes().build());
		event.put(MILASCHEF.get(), MilaschefEntity.createAttributes().build());
		event.put(OSODEGOMA.get(), OsodegomaEntity.createAttributes().build());
		event.put(G_UARDIAGUACA.get(), GUardiaguacaEntity.createAttributes().build());
		event.put(OSITO_2.get(), Osito2Entity.createAttributes().build());
		event.put(OSITO_3.get(), Osito3Entity.createAttributes().build());
		event.put(OSITO_4.get(), Osito4Entity.createAttributes().build());
		event.put(OSITO_5.get(), Osito5Entity.createAttributes().build());
		event.put(NAITBEAR.get(), NaitbearEntity.createAttributes().build());
		event.put(HADA_DEDULCE.get(), HadaDedulceEntity.createAttributes().build());
		event.put(CORRINPOPPER.get(), CorrinpopperEntity.createAttributes().build());
		event.put(SWETIPOPPER.get(), SwetipopperEntity.createAttributes().build());
		event.put(CORRINMETRIC.get(), CorrinmetricEntity.createAttributes().build());
		event.put(DUMPLINGVENDEDORDEBOBA.get(), DumplingvendedordebobaEntity.createAttributes().build());
		event.put(DUMPLINPEQUENO.get(), DumplinpequenoEntity.createAttributes().build());
		event.put(DUMPLINGMEDIANO.get(), DumplingmedianoEntity.createAttributes().build());
		event.put(DUMPLINGRANDE.get(), DumplingrandeEntity.createAttributes().build());
		event.put(CALAMARFRITO.get(), CalamarfritoEntity.createAttributes().build());
		event.put(SANDWICHSALVAJE.get(), SandwichsalvajeEntity.createAttributes().build());
		event.put(CUBANO.get(), CubanoEntity.createAttributes().build());
		event.put(SANDWICHDULCE.get(), SandwichdulceEntity.createAttributes().build());
		event.put(OSO_6.get(), Oso6Entity.createAttributes().build());
		event.put(HELADOMOB.get(), HeladomobEntity.createAttributes().build());
		event.put(HELADOMOB_2.get(), Heladomob2Entity.createAttributes().build());
		event.put(HELADOMOB_3.get(), Heladomob3Entity.createAttributes().build());
		event.put(HELADOMOB_4.get(), Heladomob4Entity.createAttributes().build());
		event.put(HELADOMOB_5.get(), Heladomob5Entity.createAttributes().build());
		event.put(HELADOMOB_6.get(), Heladomob6Entity.createAttributes().build());
		event.put(HELADOMOB_7.get(), Heladomob7Entity.createAttributes().build());
		event.put(HELADOMOB_8.get(), Heladomob8Entity.createAttributes().build());
		event.put(HELADOMETRIC.get(), HeladometricEntity.createAttributes().build());
		event.put(SLIME.get(), SlimeEntity.createAttributes().build());
		event.put(DONASANGUIJUELA.get(), DonasanguijuelaEntity.createAttributes().build());
		event.put(PHATOMPALETA.get(), PhatompaletaEntity.createAttributes().build());
		event.put(PHATOMPALETA_2.get(), Phatompaleta2Entity.createAttributes().build());
		event.put(JARRON.get(), JarronEntity.createAttributes().build());
		event.put(JARRONJULIAN.get(), JarronjulianEntity.createAttributes().build());
		event.put(SMORE.get(), SmoreEntity.createAttributes().build());
		event.put(SMOREVOLADOR.get(), SmorevoladorEntity.createAttributes().build());
		event.put(ARANAHAMBURGUESA.get(), AranahamburguesaEntity.createAttributes().build());
		event.put(SERPIENTEHELADO.get(), SerpienteheladoEntity.createAttributes().build());
		event.put(DUMPLINGIGANTE.get(), DumplingiganteEntity.createAttributes().build());
		event.put(MALTEADITO.get(), MalteaditoEntity.createAttributes().build());
	}
}