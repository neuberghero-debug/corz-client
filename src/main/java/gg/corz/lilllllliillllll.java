package gg.corz;

import java.util.function.Supplier;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class lilllllliillllll implements illlllllIillllll {
   private final Supplier<lIIiIiiIIiIi> illlIiIill;
   private float IiilIiIill;
   private float liilIiIill;
   public static final int IIllIiIill = 60;
   private ilIiliilIiIiliil lIilIiIill = ilIiliilIiIiliil.IiIlIIIiil;
   private boolean IIilIiIill;
   private long lillIiIill;
   private final lIlIiIIliIlIiIIl llllIiIill;
   private final iilllIiIIillIi lIllIiIill;
   private final illillIlIilillIl iIllIiIill;
   private long IillIiIill;
   private float iillIiIill;
   private boolean ililIiIill;
   private final IIllllIlll IlllIiIill;
   private float llilIiIill;
   private long iIilIiIill = Long.MIN_VALUE;
   private float IlilIiIill;

   @Override
   public float IliIlllilIi() {
      return this.lIllIiIill.IilliliilIIi();
   }

   public boolean Iiiiliiiiiii() {
      return this.iIilIiIill == this.IillIiIill;
   }

   @Override
   public double IilliliilIIi() {
      return this.lIllIiIill.IIIllIIliIIl();
   }

   @Override
   public boolean Iiilliiliiil() {
      return true;
   }

   @Override
   public boolean iIlIlllllill() {
      return this.lIllIiIill.iliIiiliiiii();
   }

   public void IIlilIliiIli(long tick, long maxSelfDamage, float nowMs, boolean allowTotemTrade) {
      this.Illillliilli(tick, maxSelfDamage, nowMs, allowTotemTrade, ilIiliilIiIiliil.IiIlIIIiil);
   }

   @Override
   public double Iilllilliill() {
      return lliiIliliiIl.liiiIIllIl();
   }

   @Override
   public boolean IIIllIIliIIl() {
      return this.iIllIiIill.lIiiIiIlilli();
   }

   @Override
   public boolean IIlllIlliIll(float expectedCost, float killsTarget, boolean fullDamage) {
      long var8 = -7263587759447563031L;
      class_746 var4 = class_310.method_1551().field_1724;
      if (var4 == null) {
         return false;
      } else {
         float var5 = var4.method_6032() + var4.method_6067();
         var8 ^= ((long)this.Iiiiliiiiiii() << 32 ^ var8) & -1L << 32;
         if (this.lIilIiIill.iiIIlIIlIl()) {
            return this.Iilililiiili(expectedCost, killsTarget, var5, fullDamage, (boolean)((int)(var8 >>> 32)));
         } else if ((int)(var8 >>> 32) != 0
            && this.lIilIiIill.IiIiliIiiiIi(this.IlilIiIill, this.llilIiIill, this.ililIiIill, this.IiilIiIill, expectedCost, killsTarget, var5)) {
            return true;
         } else {
            var8 ^= ((long)(expectedCost > 0.0F && expectedCost >= var5 - 1.0F ? 1 : 0) ^ var8) & -1L >>> 32;
            return (int)var8 == 0 || this.IIilIiIill && fullDamage
               ? killsTarget <= this.iillIiIill
                  && (
                     !this.lIilIiIill.iIIIlIlIIl()
                        || (int)(var8 >>> 32) != 0 && ilIiliilIiIiliil.IIillIiliIil(this.IlilIiIill, this.llilIiIill, this.ililIiIill, killsTarget)
                  )
               : false;
         }
      }
   }

   @Override
   public boolean IIIilIIiiIIi(int slot) {
      return this.llllIiIill.IiIlliIliiIl(slot, this.IillIiIill);
   }

   @Override
   public long Ililllililil() {
      return this.lillIiIill;
   }

   public boolean iIIIlIlIIl() {
      return this.IIilIiIill;
   }

   @Override
   public long IIillIiliIil() {
      return this.IillIiIill;
   }

   @Override
   public void lIiiIiIlilli(class_243 settle, boolean point) {
      class_746 var3 = class_310.method_1551().field_1724;
      if (var3 != null && settle != null) {
         float[] var4 = ilIiiIiIii.Ililllililil(var3.method_33571(), settle);
         this.lIllIiIill.IIlllIlliIll(IiilIiIiliilIiIi.iIIllIiIIi, var4[0], var4[1], IIIliIilIIliIi.lilIIiliiiilIIilii, 60);
      }
   }

   @Override
   public boolean IlIlllIlilIl(int slot) {
      return this.llllIiIill.lIiiIiIlilli(slot, false);
   }

   @Override
   public void iliIiiliiiii(float pitch, float yaw) {
      this.lIllIiIill.Iilllilliill(IiilIiIiliilIiIi.iIIllIiIIi, pitch, yaw, 60);
   }

   public float IIIIllIIIl() {
      return this.iillIiIill;
   }

   @Override
   public lIIiIiiIIiIi Illlllllilll() {
      return this.illlIiIill == null ? null : this.illlIiIill.get();
   }

   public ilIiliilIiIiliil llIIlilIIl() {
      return this.lIilIiIill;
   }

   @Override
   public float[] IlIillIiilIi(class_243 point) {
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && point != null) {
         float[] var3 = ilIiiIiIii.Ililllililil(var2.method_33571(), point);
         return this.lIllIiIill.Ililllililil(IiilIiIiliilIiIi.iIIllIiIIi, var3[0], var3[1], IIIliIilIIliIi.lilIIiliiiilIIilii, 60, 8.0F);
      } else {
         return null;
      }
   }

   @Override
   public boolean IiIlliIliiIl() {
      return this.IlllIiIill.iiIIlIIlIl();
   }

   public lilllllliillllll(iilllIiIIillIi gates, illillIlIilillIl ledger, IIllllIlll guards, lIlIiIIliIlIiIIl aim, Supplier<lIIiIiiIIiIi> slots) {
      this.IiilIiIill = Float.NaN;
      this.liilIiIill = Float.NaN;
      this.lIllIiIill = gates;
      this.iIllIiIill = ledger;
      this.IlllIiIill = guards;
      this.llllIiIill = aim;
      this.illlIiIill = slots;
   }

   @Override
   public void IiIiliIiiiIi() {
      this.lIllIiIill.Iiilliiliiil();
   }

   public void Illillliilli(long tick, long trade, float maxSelfDamage, boolean allowTotemTrade, ilIiliilIiIiliil nowMs) {
      this.IillIiIill = tick;
      this.lillIiIill = trade;
      this.iillIiIill = Float.isFinite(maxSelfDamage) ? Math.max(0.0F, maxSelfDamage) : 0.0F;
      this.IIilIiIill = allowTotemTrade;
      this.lIilIiIill = nowMs == null ? ilIiliilIiIiliil.IiIlIIIiil : nowMs;
   }

   public void Iliilliiilii(float targetEhp, float dealt, boolean knock, float popsTarget, float selfCost) {
      this.iIilIiIill = this.IillIiIill;
      this.IlilIiIill = targetEhp;
      this.llilIiIill = dealt;
      this.ililIiIill = knock;
      this.IiilIiIill = popsTarget;
      this.liilIiIill = selfCost;
   }

   public void IIiilIiiiIii(float knock, float targetEhp, boolean dealt, float popsTarget) {
      this.Iliilliiilii(knock, targetEhp, dealt, popsTarget, Float.NaN);
   }

   private boolean Iilililiiili(float expectedCost, float hp, float full, boolean quoted, boolean kills) {
      if (!kills) {
         return this.lIilIiIill.lIiiIiIlilli(expectedCost, full, this.lIilIiIill.iliIiiliiiii(quoted));
      } else {
         float var6 = Float.isFinite(this.liilIiIill) ? Math.max(hp, this.liilIiIill) : expectedCost;
         return this.lIilIiIill.lIiiIiIlilli(this.lIilIiIill.IlIlllIlilIl(expectedCost, var6), full, this.lIilIiIill.IIIllIIliIIl(quoted, this.ililIiIill))
            && this.lIilIiIill.IIlllIlliIll(this.IlilIiIill, this.ililIiIill, expectedCost, var6, false);
      }
   }

   @Override
   public float liiiIIllIl() {
      return this.lIllIiIill.lIiiIiIlilli();
   }
}
