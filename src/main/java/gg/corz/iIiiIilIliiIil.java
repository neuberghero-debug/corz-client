package gg.corz;

import java.util.List;
import java.util.Map;

record iIiiIilIliiIil(
   List<lIiliiliIiliil> poses,
   List<lIiliiliIiliil> all,
   Map<lIiliiliIiliil, Integer> coverage,
   boolean future,
   IIiiIiIllIiiIiIl overlay,
   boolean constructible,
   boolean headLevel
) {
   private final Map<lIiliiliIiliil, Integer> iiIlIiiIiIIllIiiIi;
   private final IIiiIiIllIiiIiIl IlllIiiIillllIiiIi;
   private final List<lIiliiliIiliil> IiIlIiiIiliIlIiiIi;
   private final boolean lillIiiIiiillIiiIi;
   private final boolean lIllIiiIiiIllIiiIi;
   private final List<lIiliiliIiliil> llIlIiiIiilIlIiiIi;
   private final boolean illlIiiIiIillIiiIi;

   public boolean IIIllIIliIIl() {
      return this.lillIiiIiiillIiiIi;
   }

   public IIiiIiIllIiiIiIl lIiiIiIlilli() {
      return this.IlllIiiIillllIiiIi;
   }

   public List<lIiliiliIiliil> IliIlllilIi() {
      return this.llIlIiiIiilIlIiiIi;
   }

   private iIiiIilIliiIil(
      List<lIiliiliIiliil> poses,
      List<lIiliiliIiliil> all,
      Map<lIiliiliIiliil, Integer> coverage,
      boolean future,
      IIiiIiIllIiiIiIl overlay,
      boolean constructible,
      boolean headLevel
   ) {
      this.llIlIiiIiilIlIiiIi = poses;
      this.IiIlIiiIiliIlIiiIi = all;
      this.iiIlIiiIiIIllIiiIi = coverage;
      this.lIllIiiIiiIllIiiIi = future;
      this.IlllIiiIillllIiiIi = overlay;
      this.illlIiiIiIillIiiIi = constructible;
      this.lillIiiIiiillIiiIi = headLevel;
   }

   public boolean iliIiiliiiii() {
      return this.illlIiiIiIillIiiIi;
   }

   public List<lIiliiliIiliil> liiiIIllIl() {
      return this.IiIlIiiIiliIlIiiIi;
   }

   public Map<lIiliiliIiliil, Integer> iIlIlllllill() {
      return this.iiIlIiiIiIIllIiiIi;
   }

   public boolean IilliliilIIi() {
      return this.lIllIiiIiiIllIiiIi;
   }
}
