package gg.corz;

public final class lIIillIiiIIillIi {
   public final boolean IiiiiiIIIi;
   public final boolean liiiiiIIIi;
   public final boolean iiiiiiIIIi;
   public final int lliiiiIIIi;
   public final int IliiiiIIIi;
   public final int iliiiiIIIi;
   public final boolean IlIIIIlIIi;
   public final boolean IiIIIIlIIi;
   public final boolean ilIIIIlIIi;
   public final boolean llIIIIlIIi;
   public final boolean iIIIIIlIIi;
   public final boolean liIIIIlIIi;
   public final boolean lIIIIIlIIi;
   public final boolean iiIIIIlIIi;
   public final int lIiiiiIIIi;
   public final boolean IIIIIIlIIi;
   public final int iIiiiiIIIi;

   public static lIIillIiiIIillIi IliIlllilIi() {
      return new lIIillIiiIIillIi(70, 3, 10, 6, true, true, true, true, true, true, true, true, true, true, false);
   }

   public lIIillIiiIIillIi(
      int useDeepActivity,
      int useBlockEntities,
      int useExcavation,
      int detectModified,
      int useFarms,
      boolean useEntityContext,
      boolean ignoreStructures,
      boolean minClusterSize,
      boolean threshold,
      boolean minEvidenceTypes,
      boolean minStorage,
      boolean useGeometry,
      boolean useRedstone,
      boolean ignoreTrial,
      boolean undergroundBias,
      boolean useLighting,
      boolean antiXrayAware
   ) {
      this.lIiiiiIIIi = useDeepActivity;
      this.iIiiiiIIIi = useBlockEntities;
      this.IliiiiIIIi = useExcavation;
      this.lliiiiIIIi = detectModified;
      this.iliiiiIIIi = useFarms;
      this.IiiiiiIIIi = useEntityContext;
      this.liiiiiIIIi = ignoreStructures;
      this.iiiiiiIIIi = minClusterSize;
      this.IIIIIIlIIi = threshold;
      this.lIIIIIlIIi = minEvidenceTypes;
      this.iIIIIIlIIi = minStorage;
      this.IlIIIIlIIi = useGeometry;
      this.llIIIIlIIi = useRedstone;
      this.ilIIIIlIIi = ignoreTrial;
      this.IiIIIIlIIi = undergroundBias;
      this.liIIIIlIIi = useLighting;
      this.iiIIIIlIIi = antiXrayAware;
   }

   public lIIillIiiIIillIi(
      int minClusterSize,
      int useExcavation,
      int undergroundBias,
      int useLighting,
      boolean useFarms,
      boolean threshold,
      boolean useRedstone,
      boolean detectModified,
      boolean useEntityContext,
      boolean minEvidenceTypes,
      boolean antiXrayAware,
      boolean ignoreTrial,
      boolean ignoreStructures,
      boolean useBlockEntities,
      boolean useGeometry
   ) {
      this(
         minClusterSize,
         useExcavation,
         undergroundBias,
         0,
         useLighting,
         useFarms,
         threshold,
         useRedstone,
         detectModified,
         useEntityContext,
         minEvidenceTypes,
         antiXrayAware,
         ignoreTrial,
         true,
         ignoreStructures,
         useBlockEntities,
         useGeometry
      );
   }

   public lIIillIiiIIillIi(
      int minEvidenceTypes,
      int ignoreTrial,
      int ignoreStructures,
      int detectModified,
      boolean undergroundBias,
      boolean useRedstone,
      boolean minClusterSize,
      boolean useLighting,
      boolean useGeometry,
      boolean useFarms,
      boolean useBlockEntities,
      boolean threshold,
      boolean useEntityContext
   ) {
      this(
         minEvidenceTypes,
         ignoreTrial,
         ignoreStructures,
         detectModified,
         undergroundBias,
         useRedstone,
         minClusterSize,
         useLighting,
         useGeometry,
         useFarms,
         true,
         true,
         useBlockEntities,
         threshold,
         useEntityContext
      );
   }

   public lIIillIiiIIillIi(
      int useBlockEntities,
      int useLighting,
      int ignoreTrial,
      int detectModified,
      boolean threshold,
      boolean useRedstone,
      boolean ignoreStructures,
      boolean minClusterSize,
      boolean minEvidenceTypes,
      boolean useGeometry,
      boolean undergroundBias
   ) {
      this(
         useBlockEntities,
         useLighting,
         ignoreTrial,
         detectModified,
         threshold,
         useRedstone,
         ignoreStructures,
         minClusterSize,
         true,
         true,
         minEvidenceTypes,
         useGeometry,
         undergroundBias
      );
   }
}
