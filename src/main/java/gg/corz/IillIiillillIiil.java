package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_243;

public record IillIiillillIiil(
   class_1309 target,
   iIIlIIiIlIlIIi predicted,
   double minEfficiency,
   boolean antiSuicide,
   float maxSelfDamage,
   boolean autoObsidian,
   boolean hasObsidian,
   lIIiIiiIIiIi guards,
   long nowMs,
   long tick,
   int reattackTicks,
   float fromYaw,
   float fromPitch,
   float viewYaw,
   lIiillIiiIiillIi tuning,
   iIIlIIiIlIlIIi self,
   class_243 spread,
   IilIlIIllilIlIIl targetWindow,
   IilIlIIllilIlIIl selfWindow,
   float targetEhp,
   boolean targetTotem,
   boolean allowTotemTrade,
   Predicate<class_243> veto,
   ilIIiiiIiIIiii support
) {
   private final iIIlIIiIlIlIIi iIlIIIilil;
   private final boolean iilIIIilil;
   private final long ilIIIIilil;
   private final IilIlIIllilIlIIl lllIIIilil;
   private final boolean iiiiiillil;
   private final lIiillIiiIiillIi lIlIIIilil;
   private final float IIlIIIilil;
   private final iIIlIIiIlIlIIi Iiiiiillil;
   private final int IiIIIIilil;
   private final float liIIIIilil;
   private final boolean iIIIIIilil;
   private final float IIIIIIilil;
   private final float iiIIIIilil;
   private final lIIiIiiIIiIi IlIIIIilil;
   private final ilIIiiiIiIIiii lIiIIIilil;
   private final boolean lilIIIilil;
   private final boolean lIIIIIilil;
   private final class_243 IllIIIilil;
   private final IilIlIIllilIlIIl illIIIilil;
   private final class_1309 iliiiillil;
   private final long llIIIIilil;
   private final double liiiiillil;
   private final float IilIIIilil;
   private final Predicate<class_243> IIiIIIilil;

   public boolean IIlllIlliIll() {
      return this.iIIIIIilil;
   }

   public lIIiIiiIIiIi Illlllllilll() {
      return this.IlIIIIilil;
   }

   public float Iiilliiliiil() {
      return this.liIIIIilil;
   }

   public IillIiillillIiil IliIlllilIi(ilIIiiiIiIIiii s) {
      return new IillIiillillIiil(
         this.iliiiillil,
         this.Iiiiiillil,
         this.liiiiillil,
         this.iiiiiillil,
         this.IIIIIIilil,
         this.lIIIIIilil,
         this.iIIIIIilil,
         this.IlIIIIilil,
         this.llIIIIilil,
         this.ilIIIIilil,
         this.IiIIIIilil,
         this.liIIIIilil,
         this.iiIIIIilil,
         this.IIlIIIilil,
         this.lIlIIIilil,
         this.iIlIIIilil,
         this.IllIIIilil,
         this.lllIIIilil,
         this.illIIIilil,
         this.IilIIIilil,
         this.lilIIIilil,
         this.iilIIIilil,
         this.IIiIIIilil,
         s
      );
   }

   public long IIillIiliIil() {
      return this.ilIIIIilil;
   }

   public double iliIiiliiiii() {
      return this.liiiiillil;
   }

   public boolean Iiiiliiiiiii() {
      return this.lilIIIilil;
   }

   public float IlIlllIlilIl() {
      return this.IIIIIIilil;
   }

   public iIIlIIiIlIlIIi IIlilIliiIli() {
      return this.iIlIIIilil;
   }

   public boolean IIIllIIliIIl() {
      return this.iiiiiillil;
   }

   public float IlIillIiilIi() {
      return this.IIlIIIilil;
   }

   public iIIlIIiIlIlIIi lIiiIiIlilli() {
      return this.Iiiiiillil;
   }

   public IillIiillillIiil(
      class_1309 viewYaw,
      iIIlIIiIlIlIIi antiSuicide,
      double maxSelfDamage,
      boolean nowMs,
      float target,
      boolean fromPitch,
      boolean predicted,
      lIIiIiiIIiIi guards,
      long fromYaw,
      long tick,
      int minEfficiency,
      float reattackTicks,
      float hasObsidian,
      float autoObsidian
   ) {
      this(
         viewYaw,
         antiSuicide,
         maxSelfDamage,
         nowMs,
         target,
         fromPitch,
         predicted,
         guards,
         fromYaw,
         tick,
         minEfficiency,
         reattackTicks,
         hasObsidian,
         autoObsidian,
         lIiillIiiIiillIi.lllllIlIIi,
         null,
         class_243.field_1353,
         IilIlIIllilIlIIl.IIIIlillIl,
         IilIlIIllilIlIIl.IIIIlillIl,
         Float.NaN,
         true,
         false,
         null
      );
   }

   public IillIiillillIiil(
      class_1309 fromPitch,
      iIIlIIiIlIlIIi guards,
      double predicted,
      boolean selfWindow,
      float targetEhp,
      boolean target,
      boolean tick,
      lIIiIiiIIiIi antiSuicide,
      long viewYaw,
      long self,
      int veto,
      float autoObsidian,
      float minEfficiency,
      float reattackTicks,
      lIiillIiiIiillIi nowMs,
      iIIlIIiIlIlIIi targetWindow,
      class_243 hasObsidian,
      IilIlIIllilIlIIl fromYaw,
      IilIlIIllilIlIIl allowTotemTrade,
      float spread,
      boolean targetTotem,
      boolean tuning,
      Predicate<class_243> maxSelfDamage
   ) {
      this(
         fromPitch,
         guards,
         predicted,
         selfWindow,
         targetEhp,
         target,
         tick,
         antiSuicide,
         viewYaw,
         self,
         veto,
         autoObsidian,
         minEfficiency,
         reattackTicks,
         nowMs,
         targetWindow,
         hasObsidian,
         fromYaw,
         allowTotemTrade,
         spread,
         targetTotem,
         tuning,
         maxSelfDamage,
         null
      );
   }

   public class_1309 IilliliilIIi() {
      return this.iliiiillil;
   }

   public Predicate<class_243> iIIIlIlIIl() {
      return this.IIiIIIilil;
   }

   public IilIlIIllilIlIIl IIiilIiiiIii() {
      return this.illIIIilil;
   }

   public IillIiillillIiil iIlIlllllill() {
      return this.lIlIIIilil != null && this.lIlIIIilil.liiiIIllIl() ? this.liiiIIllIl(this.lIlIIIilil.iIlIlllllill()) : null;
   }

   public float IIIilIIiiIIi() {
      return this.iiIIIIilil;
   }

   public IilIlIIllilIlIIl Iilililiiili() {
      return this.lllIIIilil;
   }

   public long Iilllilliill() {
      return this.llIIIIilil;
   }

   public class_243 Illillliilli() {
      return this.IllIIIilil;
   }

   public IillIiillillIiil liiiIIllIl(lIiillIiiIiillIi t) {
      return new IillIiillillIiil(
         this.iliiiillil,
         this.Iiiiiillil,
         this.liiiiillil,
         this.iiiiiillil,
         this.IIIIIIilil,
         this.lIIIIIilil,
         this.iIIIIIilil,
         this.IlIIIIilil,
         this.llIIIIilil,
         this.ilIIIIilil,
         this.IiIIIIilil,
         this.liIIIIilil,
         this.iiIIIIilil,
         this.IIlIIIilil,
         t,
         this.iIlIIIilil,
         this.IllIIIilil,
         this.lllIIIilil,
         this.illIIIilil,
         this.IilIIIilil,
         this.lilIIIilil,
         this.iilIIIilil,
         this.IIiIIIilil,
         this.lIiIIIilil
      );
   }

   public boolean IiIlliIliiIl() {
      return this.lIIIIIilil;
   }

   public ilIIiiiIiIIiii llIIlilIIl() {
      return this.lIiIIIilil;
   }

   public float Iliilliiilii() {
      return this.IilIIIilil;
   }

   public IillIiillillIiil(
      class_1309 target,
      iIIlIIiIlIlIIi predicted,
      double minEfficiency,
      boolean antiSuicide,
      float maxSelfDamage,
      boolean autoObsidian,
      boolean hasObsidian,
      lIIiIiiIIiIi guards,
      long nowMs,
      long tick,
      int reattackTicks,
      float fromYaw,
      float fromPitch,
      float viewYaw,
      lIiillIiiIiillIi tuning,
      iIIlIIiIlIlIIi self,
      class_243 spread,
      IilIlIIllilIlIIl targetWindow,
      IilIlIIllilIlIIl selfWindow,
      float targetEhp,
      boolean targetTotem,
      boolean allowTotemTrade,
      Predicate<class_243> veto,
      ilIIiiiIiIIiii support
   ) {
      this.iliiiillil = target;
      this.Iiiiiillil = predicted;
      this.liiiiillil = minEfficiency;
      this.iiiiiillil = antiSuicide;
      this.IIIIIIilil = maxSelfDamage;
      this.lIIIIIilil = autoObsidian;
      this.iIIIIIilil = hasObsidian;
      this.IlIIIIilil = guards;
      this.llIIIIilil = nowMs;
      this.ilIIIIilil = tick;
      this.IiIIIIilil = reattackTicks;
      this.liIIIIilil = fromYaw;
      this.iiIIIIilil = fromPitch;
      this.IIlIIIilil = viewYaw;
      this.lIlIIIilil = tuning;
      this.iIlIIIilil = self;
      this.IllIIIilil = spread;
      this.lllIIIilil = targetWindow;
      this.illIIIilil = selfWindow;
      this.IilIIIilil = targetEhp;
      this.lilIIIilil = targetTotem;
      this.iilIIIilil = allowTotemTrade;
      this.IIiIIIilil = veto;
      this.lIiIIIilil = support;
   }

   public int Ililllililil() {
      return this.IiIIIIilil;
   }

   public boolean IIIIllIIIl() {
      return this.iilIIIilil;
   }

   public lIiillIiiIiillIi IiIiliIiiiIi() {
      return this.lIlIIIilil;
   }
}
