package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import net.minecraft.class_243;

public final class IlIililllIilil implements liiIIlliiiIIll {
   private double IIIIllIlilIIIllIli;
   private final double llliIlIliilliIlIli;
   private final class_243 llilIlIliililIlIli;
   private double liiiIlIliiiiiIlIli;
   private final double lIIiIlIliiIIiIlIli;
   private final class_243 iIilIlIliIlilIlIli;
   private final boolean IIilIlIlilIilIlIli;
   private int IllIllIlilllIllIli;
   private final double ilIiIlIliIiIiIlIli;
   private final double iiilIlIliIIIiIlIli;
   private final double IIliIlIlilIliIlIli;
   private final double liIiIlIliiiIiIlIli;
   private double llIIllIliilIIllIli;
   private int illIllIliIilIllIli;
   private final llIiililIiil IliiIlIlilliiIlIli;
   private final double iiliIlIliIIiiIlIli;
   private final double IiilIlIliliilIlIli;
   private final double IlIiIlIlillIiIlIli;
   private double IiIIllIliliIIllIli;
   private double iiIIllIliIIlIllIli;
   private final double iIliIlIliIlliIlIli;
   private final double lIiiIlIliiIiiIlIli;
   private double lIlIllIliiIlIllIli;
   private final double IiliIlIlililiIlIli;
   private double iIIIllIliIlIIllIli;
   private final Long2ByteOpenHashMap iliiIlIliIiiiIlIli = new Long2ByteOpenHashMap();

   public boolean IIIllIIliIIl() {
      return this.IIilIlIlilIilIlIli;
   }

   public double lIiiIiIlilli(double ex, double ez, double ey) {
      double var7 = Math.max(0.0, Math.max(this.IiilIlIliliilIlIli - ex, ex - this.IlIiIlIlillIiIlIli));
      double var9 = Math.max(0.0, Math.max(this.iiilIlIliIIIiIlIli - ez, ez - this.ilIiIlIliIiIiIlIli));
      double var11 = Math.max(0.0, Math.max(this.lIIiIlIliiIIiIlIli - ey, ey - this.liIiIlIliiiIiIlIli));
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public int iliIiiliiiii() {
      return this.illIllIliIilIllIli;
   }

   @Override
   public double liiiIIllIl(int x, double z, int feetY) {
      double var5 = IIiIIillIiIIil.IIIllIIliIIl((double)x + 0.5, (double)feetY + 0.5, this.iIilIlIliIlilIlIli.field_1352, this.iIilIlIliIlilIlIli.field_1350)
         - this.IiliIlIlililiIlIli
         - this.iiliIlIliIIiiIlIli * IIiIIillIiIIil.lilIiilIiiilIiilIi;
      return var5 > 0.0 ? var5 * 3.6 : 0.0;
   }

   @Override
   public double IilliliilIIi(int z, double x, int feetY) {
      return Double.isFinite(x) && !this.IiIlliIliiIl(z, x, feetY) ? this.lIiiIiIlilli((double)z + 0.5, x + 1.62, (double)feetY + 0.5) : Double.MAX_VALUE;
   }

   private boolean IiIlliIliiIl(int x, double feetY, int z) {
      double var5 = 0.3;
      double var7 = (double)x + 0.5;
      double var9 = (double)z + 0.5;
      return var7 - var5 < this.llIIllIliilIIllIli
         && var7 + var5 > this.liiiIlIliiiiiIlIli
         && feetY < this.IiIIllIliliIIllIli
         && feetY + 1.8 > this.IIIIllIlilIIIllIli
         && var9 - var5 < this.iiIIllIliIIlIllIli
         && var9 + var5 > this.iIIIllIliIlIIllIli;
   }

   public double IlIlllIlilIl() {
      return this.lIlIllIliiIlIllIli;
   }

   @Override
   public double iIlIlllllill(int z, double feetY, int x) {
      double var5 = 0.0;
      if (this.llilIlIliililIlIli != null) {
         var5 += 1.0 * IIiIIillIiIIil.IIIllIIliIIl((double)z + 0.5, (double)x + 0.5, this.llilIlIliililIlIli.field_1352, this.llilIlIliililIlIli.field_1350);
      }

      return var5 + IIiIIillIiIIil.IlIlllIlilIl(feetY, this.lIiiIlIliiIiiIlIli);
   }

   @Override
   public boolean IliIlllilIi(int z, double feetY, int x) {
      if (!Double.isFinite(feetY)) {
         return false;
      } else if (feetY > this.lIlIllIliiIlIllIli + 1.0E-9) {
         return false;
      } else {
         double var5 = (double)z + 0.5;
         double var7 = feetY + 1.62;
         double var9 = (double)x + 0.5;
         if (this.lIiiIiIlilli(var5, var7, var9) > this.IiliIlIlililiIlIli + 1.0E-9) {
            return false;
         } else {
            return this.IiIlliIliiIl(z, feetY, x) ? false : this.Illlllllilll(z, feetY, x, var5, var7, var9);
         }
      }
   }

   void IIlllIlliIll(double maxZ, double maxY, double minX, double minY, double maxX, double minZ) {
      this.liiiIlIliiiiiIlIli = maxZ;
      this.IIIIllIlilIIIllIli = maxY;
      this.iIIIllIliIlIIllIli = minX;
      this.llIIllIliilIIllIli = minY;
      this.IiIIllIliliIIllIli = maxX;
      this.iiIIllIliIIlIllIli = minZ;
   }

   IlIililllIilil(
      boolean reach,
      class_243 maxZ,
      class_243 minX,
      double aimZ,
      double radius,
      double los,
      double maxX,
      double maxY,
      double melee,
      double losBudget,
      double prefer,
      double minY,
      double anchor,
      double aimY,
      double aimX,
      llIiililIiil minZ,
      int levelY
   ) {
      this.lIlIllIliiIlIllIli = Double.POSITIVE_INFINITY;
      this.IIilIlIlilIilIlIli = reach;
      this.iIilIlIliIlilIlIli = maxZ;
      this.llilIlIliililIlIli = minX;
      this.IiilIlIliliilIlIli = aimZ;
      this.iiilIlIliIIIiIlIli = radius;
      this.lIIiIlIliiIIiIlIli = los;
      this.IlIiIlIlillIiIlIli = maxX;
      this.ilIiIlIliIiIiIlIli = maxY;
      this.liIiIlIliiiIiIlIli = melee;
      this.IIliIlIlilIliIlIli = losBudget;
      this.iIliIlIliIlliIlIli = prefer;
      this.llliIlIliilliIlIli = minY;
      this.IiliIlIlililiIlIli = anchor;
      this.iiliIlIliIIiiIlIli = aimY;
      this.lIiiIlIliiIiiIlIli = aimX;
      this.IliiIlIlilliiIlIli = minZ;
      this.IllIllIlilllIllIli = Math.max(0, levelY);
   }

   private boolean Illlllllilll(int ey, double feetY, int z, double ez, double x, double ex) {
      long var21 = 5059528605210788616L;
      if (this.IliiIlIlilliiIlIli == null) {
         return true;
      } else {
         long var11 = IIIiIllIIiIl.iIlIlllllill(ey, IIIiIllIIiIl.lIiiIiIlilli(feetY), z);
         var21 ^= ((long)this.iliiIlIliIiiiIlIli.get(var11) << 32 ^ var21) & -1L << 32;
         if ((int)(var21 >>> 32) != 0) {
            return (int)(var21 >>> 32) == 1;
         } else {
            if (this.IllIllIlilllIllIli > 0) {
               this.IllIllIlilllIllIli--;
               this.illIllIliIilIllIli++;
               var21 ^= ((long)this.IliiIlIlilliiIlIli.clear(ez, x, ex, this.IIliIlIlilIliIlIli, this.iIliIlIliIlliIlIli, this.llliIlIliilliIlIli) ^ var21)
                  & -1L >>> 32;
            } else {
               double var15 = this.IIliIlIlilIliIlIli - ez;
               double var17 = this.iIliIlIliIlliIlIli - x;
               double var19 = this.llliIlIliilliIlIli - ex;
               var21 ^= ((long)(Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19) < 2.0 ? 1 : 0) ^ var21) & -1L >>> 32;
            }

            this.iliiIlIliIiiiIlIli.put(var11, (byte)((int)var21 != 0 ? 1 : 2));
            return (boolean)((int)var21);
         }
      }
   }
}
