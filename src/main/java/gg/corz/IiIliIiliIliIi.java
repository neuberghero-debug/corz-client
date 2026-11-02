package gg.corz;

import java.util.Arrays;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_746;

final class IiIliIiliIliIi implements llIliIiilIliIi {
   private final boolean[] IiiiIiliiliiiIilii;
   private final boolean[] iIiiIiliiIliiIilii;
   private final byte[][] iiiiIiliiIIIIlilii;
   private final int[] IIiiIiliilIiiIilii;
   private final boolean[] lliiIiliiiliiIilii;
   private int IlIIliliillIIlilii;
   private final double[][] lIIIliliiiIIIlilii;
   private final class_1799[] liliIiliiiiliIilii;
   private final IIilIiilIilIii[] illiIiliiIiliIilii;

   @Override
   public boolean iIlIlllllill(int hotbar) {
      return hotbar == this.IlIIliliillIIlilii || this.ilIIliliiIiIIlilii.IIliIlIIllIliIlIIl.iliIiiliiiii(hotbar);
   }

   @Override
   public boolean iliIiiliiiii(int slot) {
      return this.IiiiIiliiliiiIilii[slot];
   }

   @Override
   public double IlIlllIlilIl(int category, int slot) {
      double var3 = this.lIIIliliiiIIIlilii[category][slot];
      if (Double.isNaN(var3)) {
         var3 = this.illiIiliiIiliIilii[category].iliIiiliiiii(this.liliIiliiiiliIilii[slot]);
         this.lIIIliliiiIIIlilii[category][slot] = var3;
      }

      return var3;
   }

   @Override
   public boolean lIiiIiIlilli(int slot) {
      return this.lliiIiliiiliiIilii[slot];
   }

   @Override
   public boolean IIillIiliIil(int hotbar) {
      class_1799 var2 = this.ilIIliliiIiIIlilii.iIliIlIIlIlliIlIIl[hotbar];
      return this.IIiiIiliilIiiIilii[hotbar] == 0 && var2 != null && this.ilIIliliiIiIIlilii.ilIiIlIIlIiIiIlIIl.Iiilliiliiil(var2.method_7909());
   }

   @Override
   public boolean Iilllilliill(int hotbar) {
      class_1799 var2 = this.ilIIliliiIiIIlilii.iIliIlIIlIlliIlIIl[hotbar];
      return var2 != null && this.illiIiliiIiliIilii[this.IIiiIiliilIiiIilii[hotbar]].lIiiIiIlilli(var2);
   }

   @Override
   public int IiIlliIliiIl(int slot) {
      return this.liliIiliiiiliIilii[slot].method_7947();
   }

   @Override
   public boolean Iiilliiliiil(int source, int target) {
      return this.ilIIliliiIiIIlilii.IIliIlIIllIliIlIIl.IlIlllIlilIl(IlIIlIlillIIlIli.IliIlllilIi(source, target), this.liliIiliiiiliIilii[source]);
   }

   private IiIliIiliIliIi(final lIiiIiiIiiIi param1) {
      this.ilIIliliiIiIIlilii = var1;
      this.illiIiliiIiliIilii = IIilIiilIilIii.values();
      this.liliIiliiiiliIilii = new class_1799[((-651648955 * 84215045 ^ -91) >>> 27 | (-651648955 * 84215045 ^ -91) << 5) + -121 ^ -1756315854];
      this.IIiiIiliilIiiIilii = new int[(~221684936 << 13 | ~221684936 >>> 19) * 724452315 ^ -83 ^ 1129651847];
      this.iIiiIiliiIliiIilii = new boolean[~(1218012742 * -75 * 9 - 115) ^ 1819847437];
      this.lliiIiliiiliiIilii = new boolean[(-(-1852778917 * -105) >>> 13 | -(-1852778917 * -105) << 19) * -50529027 ^ 1887459687];
      this.IiiiIiliiliiiIilii = new boolean[((-591522261 << 5 | -591522261 >>> 27) + 29) * 1030792151 ^ 585349772];
      this.iiiiIiliiIIIIlilii = new byte[this.illiIiliiIiliIilii.length][~(-(-1405366061 - 21) >>> 9 | -(-1405366061 - 21) << 23) ^ 1591090636];
      this.lIIIliliiiIIIlilii = new double[this.illiIiliiIiliIilii.length][2068246210 - -95 - 87 ^ 2068246254];
   }

   @Override
   public boolean IilliliilIIi(int slot) {
      return this.liliIiliiiiliIilii[slot].method_7960();
   }

   @Override
   public int IIlllIlliIll(int slot) {
      return this.liliIiliiiiliIilii[slot].method_7914();
   }

   @Override
   public boolean Illlllllilll(int a, int b) {
      return lIiiIiiIiiIi.liIlliiIll(this.liliIiliiiiliIilii[a], this.liliIiliiiiliIilii[b]);
   }

   @Override
   public boolean IIIllIIliIIl(int category, int slot) {
      long var4 = -8944201043540722894L;
      var4 ^= ((long)this.iiiiIiliiIIIIlilii[category][slot] << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) == 0) {
         var4 ^= ((long)(this.illiIiliiIiliIilii[category].lIiiIiIlilli(this.liliIiliiiiliIilii[slot]) ? 1 : 2) << 32 ^ var4) & -1L << 32;
         this.iiiiIiliiIIIIlilii[category][slot] = (byte)((int)(var4 >>> 32));
      }

      return (int)(var4 >>> 32) == (-1138802022 * 1963413621 + 67 ^ -212889436);
   }

   @Override
   public int IliIlllilIi(int hotbar) {
      return this.IIiiIiliilIiiIilii[hotbar];
   }

   @Override
   public boolean Ililllililil(int hotbar, int slot) {
      class_1799 var3 = this.ilIIliliiIiIIlilii.iIliIlIIlIlliIlIIl[hotbar];
      return var3 != null && lIiiIiiIiiIi.liIlliiIll(var3, this.liliIiliiiiliIilii[slot]);
   }

   void IIIilIIiiIIi(class_746 p) {
      class_1661 var2;
      lIllIiiiIllIii var10000;
      label85: {
         var2 = p.method_31548();
         if (llilIllililIll.iliIiiliiiii(lIllIiiiIllIii.class) instanceof lIllIiiiIllIii var4 && var4.IliIlllilIi()) {
            var10000 = var4;
            break label85;
         }

         var10000 = null;
      }

      lIllIiiiIllIii var3 = var10000;
      this.IlIIliliillIIlilii = var2.method_67532();

      for (int var8 = 0; var8 < 36; var8++) {
         class_1799 var12 = var2.method_5438(var8);
         this.liliIiliiiiliIilii[var8] = var12;
         boolean var6 = var12.method_31574(class_1802.field_8288);
         this.lliiIiliiiliiIilii[var8] = var12.method_7960() || !var6 && !lllIIllillIIll.liiiIIllIl(var8);
         this.IiiiIiliiliiiIilii[var8] = !var12.method_7960() && !var6 && (var3 == null || !var3.iiiIlIIIll(var12));
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.IIiiIiliilIiiIilii[var9] = this.ilIIliliiIiIIlilii.IIllllIlll(var9).ordinal();
         this.iIiiIiliiIliiIilii[var9] = lllIIllillIIll.IliIlllilIi(var9) || lllIIllillIIll.liiiIIllIl(var9);
      }

      for (byte[] var7 : this.iiiiIiliiIIIIlilii) {
         Arrays.fill(var7, (byte)0);
      }

      for (double[] var17 : this.lIIIliliiiIIIlilii) {
         Arrays.fill(var17, Double.NaN);
      }
   }

   @Override
   public boolean liiiIIllIl(int hotbar) {
      return this.iIiiIiliiIliiIilii[hotbar];
   }
}
