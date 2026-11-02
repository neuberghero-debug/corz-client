package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_243;

public record iiilililIIIiilil(
   class_1309 target,
   lIiillIiiIiillIi tuning,
   float maxSelfDamage,
   boolean allowTotemTrade,
   boolean autoObsidian,
   int predictTicks,
   class_243 spread,
   iIIlIIiIlIlIIi self,
   IilIlIIllilIlIIl targetWindow,
   IilIlIIllilIlIIl selfWindow,
   float targetEhp,
   boolean targetTotem,
   Predicate<class_243> veto,
   ilIIllIiIiIIllIi directive
) {
   private final boolean iIilIlllil;
   private final int llilIlllil;
   private final float lIilIlllil;
   private final float IIIiIlllil;
   private final boolean IlilIlllil;
   private final ilIIllIiIiIIllIi IlIiIlllil;
   private final IilIlIIllilIlIIl iiilIlllil;
   private final boolean lIIiIlllil;
   private final iIIlIIiIlIlIIi IiilIlllil;
   private final class_243 ililIlllil;
   private final class_1309 iillIlllil;
   private final Predicate<class_243> iIIiIlllil;
   private final IilIlIIllilIlIIl liilIlllil;
   private final lIiillIiiIiillIi IIilIlllil;

   public iiilililIIIiilil IliIlllilIi(ilIIllIiIiIIllIi d) {
      return new iiilililIIIiilil(
         this.iillIlllil,
         this.IIilIlllil,
         this.lIilIlllil,
         this.iIilIlllil,
         this.IlilIlllil,
         this.llilIlllil,
         this.ililIlllil,
         this.IiilIlllil,
         this.liilIlllil,
         this.iiilIlllil,
         this.IIIiIlllil,
         this.lIIiIlllil,
         this.iIIiIlllil,
         d
      );
   }

   public ilIIllIiIiIIllIi Iiilliiliiil() {
      return this.IlIiIlllil;
   }

   public Predicate<class_243> Ililllililil() {
      return this.iIIiIlllil;
   }

   public lIiillIiiIiillIi iIlIlllllill() {
      return this.IIilIlllil;
   }

   public boolean IIillIiliIil() {
      return this.lIIiIlllil;
   }

   public IilIlIIllilIlIIl Illlllllilll() {
      return this.iiilIlllil;
   }

   public float Iilllilliill() {
      return this.IIIiIlllil;
   }

   public boolean iliIiiliiiii() {
      return this.IlilIlllil;
   }

   public float IilliliilIIi() {
      return this.lIilIlllil;
   }

   public iiilililIIIiilil(
      class_1309 predictTicks,
      lIiillIiiIiillIi targetEhp,
      float target,
      boolean targetWindow,
      boolean selfWindow,
      int autoObsidian,
      class_243 self,
      iIIlIIiIlIlIIi tuning,
      IilIlIIllilIlIIl targetTotem,
      IilIlIIllilIlIIl allowTotemTrade,
      float spread,
      boolean maxSelfDamage,
      Predicate<class_243> veto
   ) {
      this(
         predictTicks, targetEhp, target, targetWindow, selfWindow, autoObsidian, self, tuning, targetTotem, allowTotemTrade, spread, maxSelfDamage, veto, null
      );
   }

   public class_243 IlIlllIlilIl() {
      return this.ililIlllil;
   }

   public class_1309 liiiIIllIl() {
      return this.iillIlllil;
   }

   public int IIIllIIliIIl() {
      return this.llilIlllil;
   }

   public boolean lIiiIiIlilli() {
      return this.iIilIlllil;
   }

   public iIIlIIiIlIlIIi IiIlliIliiIl() {
      return this.IiilIlllil;
   }

   public IilIlIIllilIlIIl IIlllIlliIll() {
      return this.liilIlllil;
   }

   public iiilililIIIiilil(
      class_1309 target,
      lIiillIiiIiillIi tuning,
      float maxSelfDamage,
      boolean allowTotemTrade,
      boolean autoObsidian,
      int predictTicks,
      class_243 spread,
      iIIlIIiIlIlIIi self,
      IilIlIIllilIlIIl targetWindow,
      IilIlIIllilIlIIl selfWindow,
      float targetEhp,
      boolean targetTotem,
      Predicate<class_243> veto,
      ilIIllIiIiIIllIi directive
   ) {
      this.iillIlllil = target;
      this.IIilIlllil = tuning;
      this.lIilIlllil = maxSelfDamage;
      this.iIilIlllil = allowTotemTrade;
      this.IlilIlllil = autoObsidian;
      this.llilIlllil = predictTicks;
      this.ililIlllil = spread;
      this.IiilIlllil = self;
      this.liilIlllil = targetWindow;
      this.iiilIlllil = selfWindow;
      this.IIIiIlllil = targetEhp;
      this.lIIiIlllil = targetTotem;
      this.iIIiIlllil = veto;
      this.IlIiIlllil = directive;
   }
}
