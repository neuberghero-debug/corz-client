package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public record iIiIIIlIliIIIl(int x, int y, int z, int charges, int depth, boolean exposed, int digs, double distance, Iiiililiiili verdict) {
   private final double IlIIIliIlllIIIliIl;
   private final int lliiiIiIliliiiIiIl;
   public static final Comparator<iIiIIIlIliIIIl> IIlIIliIllIlIIliIl = Comparator.comparingDouble(iIiIIIlIliIIIl::liiiIIllIl)
      .thenComparingDouble(iIiIIIlIliIIIl::Ililllililil)
      .thenComparingInt(t -> -t.IlIlllIlilIl())
      .thenComparingInt(iIiIIIlIliIIIl::IIIllIIliIIl)
      .thenComparingInt(iIiIIIlIliIIIl::IiIlliIliiIl);
   private final int liliiIiIliiliiIiIl;
   private final int iIiiiIiIlIliiiIiIl;
   private final int IIiiiIiIllIiiiIiIl;
   private final int IiiiiIiIlliiiiIiIl;
   private final Iiiililiiili ilIIIliIlIiIIIliIl;
   public static final double liIIIliIliiIIIliIl = 3.0;
   private final boolean iiiiiIiIlIIIIIliIl;
   private final int lIIIIliIliIIIIliIl;

   public int IIillIiliIil() {
      return this.lIIIIliIliIIIIliIl;
   }

   public int IIIllIIliIIl() {
      return this.liliiIiIliiliiIiIl;
   }

   public Iiiililiiili Iiilliiliiil() {
      return this.ilIIIliIlIiIIIliIl;
   }

   public boolean IliIlllilIi() {
      return this.ilIIIliIlIiIIIliIl != null && this.ilIIIliIlIiIIIliIl.liiiIIllIl();
   }

   public boolean Iilllilliill() {
      return this.iiiiiIiIlIIIIIliIl;
   }

   public static int iIlIlllllill(int anchorY, int feetY) {
      return Math.max(0, feetY - anchorY);
   }

   public iIiIIIlIliIIIl(int x, int y, int z, int charges, int depth, boolean exposed, int digs, double distance, Iiiililiiili verdict) {
      this.liliiIiIliiliiIiIl = x;
      this.IIiiiIiIllIiiiIiIl = y;
      this.iIiiiIiIlIliiiIiIl = z;
      this.lliiiIiIliliiiIiIl = charges;
      this.IiiiiIiIlliiiiIiIl = depth;
      this.iiiiiIiIlIIIIIliIl = exposed;
      this.lIIIIliIliIIIIliIl = digs;
      this.IlIIIliIlllIIIliIl = distance;
      this.ilIIIliIlIiIIIliIl = verdict;
   }

   public static int IilliliilIIi(boolean exposed, int depth, int standDigs) {
      return exposed ? 0 : depth + standDigs;
   }

   public double liiiIIllIl() {
      return this.IlIIIliIlllIIIliIl
         + Double.longBitsToDouble(-2832452686766562542L ^ -7441886905380265198L) * (double)this.IiiiiIiIlliiiiIiIl
         + (double)this.lIIIIliIliIIIIliIl;
   }

   public static iIiIIIlIliIIIl lIiiIiIlilli(
      int sy, int allowDig, int sx, int stands, double y, double charges, double feetY, int z, lliIllliliIlll sz, Iiiililiiili verdict, boolean x
   ) {
      long var24 = -7677477462792845949L;
      long var26 = 485730150273831085L;
      var24 ^= ((long)iIlIlllllill(allowDig, z) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)(sz != null && !sz.IilliliilIIi().isEmpty() ? 1 : 0) ^ var24) & -1L >>> 32;
      Ilililllilil var16 = sz == null ? null : sz.liiiIIllIl(x);
      var26 ^= ((long)IilliliilIIi((boolean)((int)var24), var16 == null ? 0 : var16.lIiiIiIlilli(), (int)(var24 >>> 32)) << 32 ^ var26) & -1L << 32;
      double var18 = (double)sy + Double.longBitsToDouble(795846986882698358L ^ 3813258737220930678L) - y;
      double var20 = (double)allowDig + Double.longBitsToDouble(3127107580477626187L ^ 1478790116860024651L) - charges;
      double var22 = (double)sx + Double.longBitsToDouble(-3785704112382278640L ^ -822335557572492272L) - feetY;
      return new iIiIIIlIliIIIl(
         sy,
         allowDig,
         sx,
         stands,
         (int)(var24 >>> 32),
         (boolean)((int)var24),
         (int)(var26 >>> 32),
         Math.sqrt(var18 * var18 + var20 * var20 + var22 * var22),
         verdict
      );
   }

   public static List<iIiIIIlIliIIIl> iliIiiliiiii(Collection<iIiIIIlIliIIIl> in) {
      ArrayList var1 = new ArrayList();
      if (in == null) {
         return var1;
      } else {
         for (iIiIIIlIliIIIl var3 : in) {
            if (var3 != null && var3.IliIlllilIi()) {
               var1.add(var3);
            }
         }

         var1.sort(IIlIIliIllIlIIliIl);
         return var1;
      }
   }

   public int IIlllIlliIll() {
      return this.lliiiIiIliliiiIiIl;
   }

   public int IlIlllIlilIl() {
      return this.IIiiiIiIllIiiiIiIl;
   }

   public int Illlllllilll() {
      return this.IiiiiIiIlliiiiIiIl;
   }

   public double Ililllililil() {
      return this.IlIIIliIlllIIIliIl;
   }

   public int IiIlliIliiIl() {
      return this.iIiiiIiIlIliiiIiIl;
   }
}
