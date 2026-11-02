package gg.corz;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

final class llIIlIiilIIlIi implements iIIIlIiIlIIlIi {
   private int IiIliIIiiliIliIIii;
   private final class_2339 iIIliIIiiIlIliIIii = new class_2339();
   private long llIliIIiiilIliIIii = Long.MIN_VALUE;
   private final class_1937 IIIliIIiilIIliIIii;

   llIIlIiilIIlIi(class_1937 world) {
      this.IIIliIIiilIIliIIii = world;
   }

   @Override
   public boolean lIiiIiIlilli(int y, int x, int z) {
      this.iIIliIIiiIlIliIIii.method_10103(y, x, z);
      class_2680 var4 = this.IIIliIIiilIIliIIii.method_8320(this.iIIliIIiiIlIliIIii);
      if ((var4.method_26215() || var4.method_45474()) && var4.method_26227().method_15769()) {
         this.iIIliIIiiIlIliIIii.method_10103(y, x - 1, z);
         return !this.IIIliIIiilIIliIIii.method_8320(this.iIIliIIiiIlIliIIii).method_26215();
      } else {
         return false;
      }
   }

   @Override
   public boolean IilliliilIIi(double ay, double by, double ax, double az, double bz, double bx) {
      class_243 var13 = new class_243(ay, by, ax);
      class_243 var14 = new class_243(az, bz, bx);
      return var13.method_1025(var14) < 1.0E-8
         ? true
         : this.IIIliIIiilIIliIIii
               .method_17742(new class_3959(var13, var14, class_3960.field_17558, class_242.field_1348, class_3726.method_16194()))
               .method_17783()
            == class_240.field_1333;
   }

   @Override
   public boolean IliIlllilIi(int z, int y, int x) {
      class_2338 var4 = new class_2338(z, y, x);
      return lllIIlilillIIlil.IIIllIIliIIl(this.IIIliIIiilIIliIIii, var4) && (this.liiiIIllIl(z, y, x) & 287) == 0;
   }

   @Override
   public int iIlIlllllill(int x, int z, int y) {
      long var6 = -1732422549984110904L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < 4; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         this.iIIliIIiiIlIliIIii.method_10103(x + iIIlillIlIlill.iIiiIIlIiIliiIIlIi[(int)var6], z, y + iIIlillIlIlill.lliiIIlIiiliiIIlIi[(int)var6]);
         if (lllIIlilillIIlil.lIiiIiIlilli(this.IIIliIIiilIIliIIii, this.iIIliIIiiIlIliIIii)) {
            this.iIIliIIiiIlIliIIii.method_10103(x + iIIlillIlIlill.iIiiIIlIiIliiIIlIi[(int)var6], z + 1, y + iIIlillIlIlill.lliiIIlIiiliiIIlIi[(int)var6]);
            if (lllIIlilillIIlil.lIiiIiIlilli(this.IIIliIIiilIIliIIii, this.iIIliIIiiIlIliIIii)) {
               var6 += 4294967296L;
            }
         }
      }

      return (int)(var6 >>> 32);
   }

   @Override
   public int liiiIIllIl(int x, int y, int z) {
      long var4 = iIIlillIlIlill.illIlIilIl(x, y, z);
      if (var4 != this.llIliIIiiilIliIIii) {
         this.IiIliIIiiliIliIIii = iIiIilIliIil.IliIlllilIi(this.IIIliIIiilIIliIIii, new class_2338(x, y, z));
         this.llIliIIiiilIliIIii = var4;
      }

      return this.IiIliIIiiliIliIIii;
   }
}
