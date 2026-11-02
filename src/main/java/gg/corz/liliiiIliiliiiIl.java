package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public final class liliiiIliiliiiIl {
   public static final int IlliIiIlll = 64;
   private ilIIiillIiIIiill liliIiIlll;
   public static final double llliIiIlll = 4.0;
   private final List<IilIiiililIiii> iiliIiIlll = new ArrayList<>();
   private final int IiliIiIlll;
   public static final int iIliIiIlll = 16;
   public static final int lIliIiIlll = 32;
   private static final double illiIiIlll = 1.0E-6;

   public boolean iliIiiliiiii() {
      return this.iiliIiIlll.isEmpty();
   }

   public IilIiiililIiii IilliliilIIi() {
      return this.iiliIiIlll.isEmpty() ? null : this.iiliIiIlll.get(0);
   }

   public ilIIiillIiIIiill iIlIlllllill() {
      return this.liliIiIlll;
   }

   public liliiiIliiliiiIl(int depth) {
      this.IiliIiIlll = Math.max(16, Math.min(64, depth));
   }

   public int IiIlliIliiIl(long radius, int stillValid, Predicate<IilIiiililIiii> changedCell) {
      long var6 = -7473627235759366444L;
      if (this.liliIiIlll == null) {
         return 0;
      } else {
         var6 ^= ((long)this.liliIiIlll.Iiiiliiiiiii(radius, stillValid, changedCell) << 32 ^ var6) & -1L << 32;
         this.IIillIiliIil();
         return (int)(var6 >>> 32);
      }
   }

   private boolean Illlllllilll(double heldMaterial, double bodyX, float bodyZ, long bodyYawDeg) {
      long var14 = -4977553286205900878L;
      double var8 = IiilIiliilIi.liiiIIllIl(Ililllililil(this.iiliIiIlll.get(0)), heldMaterial, bodyX, 0L, false, bodyZ, bodyYawDeg, 4.0);
      var14 ^= ((long)Math.min(this.IiliIiIlll, this.iiliIiIlll.size()) << 32 ^ var14) & -1L << 32;

      for (long var17 = var14 ^ (1L ^ var14) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         double var12 = IiilIiliilIi.liiiIIllIl(Ililllililil(this.iiliIiIlll.get((int)var17)), heldMaterial, bodyX, 0L, false, bodyZ, bodyYawDeg, 4.0);
         if (var12 < var8 - 1.0E-6) {
            return false;
         }
      }

      return true;
   }

   private void Iilllilliill(double bodyYawDeg, double bodyX, float bodyZ, long heldMaterial) {
      List var8 = IiilIiliilIi.IliIlllilIi(this.iiliIiIlll, liliiiIliiliiiIl::Ililllililil, bodyYawDeg, bodyX, bodyZ, heldMaterial, 4.0);
      this.iiliIiIlll.clear();
      this.iiliIiIlll.addAll(var8);
   }

   private void IIillIiliIil() {
      if (this.liliIiIlll == null) {
         this.iiliIiIlll.clear();
      } else {
         this.iiliIiIlll.removeIf(s -> {
            IliIlIillliIlIil var2 = this.liliIiIlll.IIlllIlliIll(s.IliIlllilIi());
            return var2 != IliIlIillliIlIil.iiiIIIlIil && var2 != IliIlIillliIlIil.IIIlIIlIil;
         });
      }
   }

   public void liiiIIllIl(ilIIiillIiIIiill bodyZ, double bodyYawDeg, double m, float heldMaterial, long bodyX) {
      this.liliIiIlll = bodyZ;
      this.iiliIiIlll.clear();
      if (bodyZ != null) {
         for (IilIiiililIiii var10 : bodyZ.IilliliilIIi()) {
            IliIlIillliIlIil var11 = bodyZ.IIlllIlliIll(var10.IliIlllilIi());
            if (var11 == IliIlIillliIlIil.iiiIIIlIil || var11 == IliIlIillliIlIil.IIIlIIlIil) {
               this.iiliIiIlll.add(var10);
            }
         }

         this.Iilllilliill(bodyYawDeg, m, heldMaterial, bodyX);
      }
   }

   public List<IilIiiililIiii> lIiiIiIlilli() {
      return Collections.unmodifiableList(new ArrayList<>(this.iiliIiIlll.subList(0, Math.min(this.IiliIiIlll, this.iiliIiIlll.size()))));
   }

   private static IIlIlllllIlIllll Ililllililil(IilIiiililIiii s) {
      return new IIlIlllllIlIllll(s.IliIlllilIi(), s.liiiIIllIl(), s.IlIlllIlilIl(), s.iliIiiliiiii(), s.IiIlliIliiIl());
   }

   public int IlIlllIlilIl(Predicate<IilIiiililIiii> stillValid) {
      long var3 = 566664432511393358L;
      if (this.liliIiIlll == null) {
         return 0;
      } else {
         var3 ^= ((long)this.liliIiIlll.Iliilliiilii(stillValid) << 32 ^ var3) & -1L << 32;
         this.IIillIiliIil();
         return (int)(var3 >>> 32);
      }
   }

   public int IIIllIIliIIl(long bodyYawDeg, double placedTarget, double heldMaterial, float bodyX, long bodyZ) {
      if (this.liliIiIlll == null) {
         return 0;
      } else {
         this.liliIiIlll.IIlilIliiIli(bodyYawDeg, this.liliIiIlll.IIIllIIliIIl());
         this.IIillIiliIil();
         if (!this.iiliIiIlll.isEmpty() && !this.Illlllllilll(placedTarget, heldMaterial, bodyX, bodyZ)) {
            this.Iilllilliill(placedTarget, heldMaterial, bodyX, bodyZ);
         }

         return this.liliIiIlll.Iilllilliill();
      }
   }

   public void IIlllIlliIll() {
      this.liliIiIlll = null;
      this.iiliIiIlll.clear();
   }

   public int IliIlllilIi() {
      return this.IiliIiIlll;
   }
}
