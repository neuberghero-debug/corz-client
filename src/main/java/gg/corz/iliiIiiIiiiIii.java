package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public record iliiIiiIiiiIii(
   class_1309 target,
   iIIlIIiIlIlIIi predicted,
   iIIlIIiIlIlIIi self,
   float fromYaw,
   float fromPitch,
   float maxSelfDamage,
   boolean allowTotemTrade,
   IilIlIIllilIlIIl targetWindow,
   IilIlIIllilIlIIl selfWindow,
   float targetEhp,
   boolean targetTotem,
   boolean allowCover,
   int glowstone,
   lIiillIiiIiillIi tuning,
   Predicate<class_243> veto,
   class_2338 forcedCell,
   class_243 digToward
) {
   private final lIiillIiiIiillIi IIlilIiIIl;
   private final IilIlIIllilIlIIl IlIilIiIIl;
   private final boolean IiIilIiIIl;
   private final float iiillIiIIl;
   private final iIIlIIiIlIlIIi IiillIiIIl;
   private final float ilIilIiIIl;
   private final IilIlIIllilIlIIl llIilIiIIl;
   private final boolean liIilIiIIl;
   private final class_2338 iIlilIiIIl;
   private final Predicate<class_243> lIlilIiIIl;
   private final int iiIilIiIIl;
   private final iIIlIIiIlIlIIi liillIiIIl;
   private final float lIIilIiIIl;
   private final float IIIilIiIIl;
   private final class_243 IllilIiIIl;
   private final class_1309 ilillIiIIl;
   private final boolean iIIilIiIIl;

   public float lIiiIiIlilli() {
      return this.IIIilIiIIl;
   }

   public boolean Iilllilliill() {
      return this.liIilIiIIl;
   }

   public class_1309 IliIlllilIi() {
      return this.ilillIiIIl;
   }

   public IilIlIIllilIlIIl IlIlllIlilIl() {
      return this.IlIilIiIIl;
   }

   public iIIlIIiIlIlIIi iIlIlllllill() {
      return this.liillIiIIl;
   }

   public float iliIiiliiiii() {
      return this.lIIilIiIIl;
   }

   public class_2338 IIIilIIiiIIi() {
      return this.iIlilIiIIl;
   }

   public Predicate<class_243> Iiilliiliiil() {
      return this.lIlilIiIIl;
   }

   public int IIillIiliIil() {
      return this.iiIilIiIIl;
   }

   public class_243 IlIillIiilIi() {
      return this.IllilIiIIl;
   }

   public iliiIiiIiiiIii(
      class_1309 target,
      iIIlIIiIlIlIIi predicted,
      iIIlIIiIlIlIIi self,
      float fromYaw,
      float fromPitch,
      float maxSelfDamage,
      boolean allowTotemTrade,
      IilIlIIllilIlIIl targetWindow,
      IilIlIIllilIlIIl selfWindow,
      float targetEhp,
      boolean targetTotem,
      boolean allowCover,
      int glowstone,
      lIiillIiiIiillIi tuning,
      Predicate<class_243> veto,
      class_2338 forcedCell,
      class_243 digToward
   ) {
      this.ilillIiIIl = target;
      this.IiillIiIIl = predicted;
      this.liillIiIIl = self;
      this.iiillIiIIl = fromYaw;
      this.IIIilIiIIl = fromPitch;
      this.lIIilIiIIl = maxSelfDamage;
      this.iIIilIiIIl = allowTotemTrade;
      this.IlIilIiIIl = targetWindow;
      this.llIilIiIIl = selfWindow;
      this.ilIilIiIIl = targetEhp;
      this.IiIilIiIIl = targetTotem;
      this.liIilIiIIl = allowCover;
      this.iiIilIiIIl = glowstone;
      this.IIlilIiIIl = tuning;
      this.lIlilIiIIl = veto;
      this.iIlilIiIIl = forcedCell;
      this.IllilIiIIl = digToward;
   }

   public boolean Illlllllilll() {
      return this.IiIilIiIIl;
   }

   public iliiIiiIiiiIii(
      class_1309 fromPitch,
      iIIlIIiIlIlIIi allowTotemTrade,
      iIIlIIiIlIlIIi forcedCell,
      float targetWindow,
      float allowCover,
      float selfWindow,
      boolean tuning,
      IilIlIIllilIlIIl fromYaw,
      IilIlIIllilIlIIl targetEhp,
      float veto,
      boolean glowstone,
      boolean self,
      int target,
      lIiillIiiIiillIi targetTotem,
      Predicate<class_243> maxSelfDamage,
      class_2338 predicted
   ) {
      this(
         fromPitch,
         allowTotemTrade,
         forcedCell,
         targetWindow,
         allowCover,
         selfWindow,
         tuning,
         fromYaw,
         targetEhp,
         veto,
         glowstone,
         self,
         target,
         targetTotem,
         maxSelfDamage,
         predicted,
         null
      );
   }

   public IilIlIIllilIlIIl IiIlliIliiIl() {
      return this.llIilIiIIl;
   }

   public iIIlIIiIlIlIIi liiiIIllIl() {
      return this.IiillIiIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.iIIilIiIIl;
   }

   public lIiillIiiIiillIi Ililllililil() {
      return this.IIlilIiIIl;
   }

   public float IIlllIlliIll() {
      return this.ilIilIiIIl;
   }

   public float IilliliilIIi() {
      return this.iiillIiIIl;
   }

   public iliiIiiIiiiIii(
      class_1309 tuning,
      iIIlIIiIlIlIIi allowCover,
      iIIlIIiIlIlIIi fromYaw,
      float predicted,
      float self,
      float target,
      boolean glowstone,
      IilIlIIllilIlIIl fromPitch,
      IilIlIIllilIlIIl targetTotem,
      float selfWindow,
      boolean maxSelfDamage,
      boolean targetWindow,
      int allowTotemTrade,
      lIiillIiiIiillIi veto,
      Predicate<class_243> targetEhp
   ) {
      this(
         tuning,
         allowCover,
         fromYaw,
         predicted,
         self,
         target,
         glowstone,
         fromPitch,
         targetTotem,
         selfWindow,
         maxSelfDamage,
         targetWindow,
         allowTotemTrade,
         veto,
         targetEhp,
         null,
         null
      );
   }
}
