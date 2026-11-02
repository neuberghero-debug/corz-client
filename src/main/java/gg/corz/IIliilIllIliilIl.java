package gg.corz;

import net.minecraft.class_1304;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class IIliilIllIliilIl {
   private int IiiliilIll;
   private long liiliilIll = Long.MIN_VALUE;
   public static final int iIiliilIll = 36;
   private float IlIiiilIll;
   public static final double IliliilIll = 12.0;
   private class_243 iIIiiilIll;
   private long IIIiiilIll = Long.MIN_VALUE;
   public static final int lliliilIll = 1;
   private long lIIiiilIll = Long.MIN_VALUE;
   private float iiiliilIll;
   private lliiilIiiliiilIi llIiiilIll;
   private static final class_1304[] ililiilIll = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   public static final int lIiliilIll = 40;

   public void liiiIIllIl(IlIillIiilIi tick, long e, int selfId) {
      if (tick instanceof llIiIIliilIiIIli var5) {
         if (var5.IliIlllilIi() != selfId) {
            return;
         }

         this.IiiliilIll++;
         this.liiliilIll = e;
      } else if (tick instanceof IIlilIIllIlilIIl var6) {
         if (var6.IliIlllilIi() != selfId) {
            return;
         }

         this.IIIiiilIll = e;
         this.iiiliilIll = 0.0F;
      } else if (tick instanceof iIIlIlilIlIlIlil var7) {
         if (var7.IliIlllilIi() == null) {
            return;
         }

         this.lIIiiilIll = e;
         this.iIIiiilIll = var7.IliIlllilIi();
         this.IlIiiilIll = var7.liiiIIllIl();
      }
   }

   public void lIiiIiIlilli() {
      this.IiiliilIll = 0;
      this.liiliilIll = Long.MIN_VALUE;
      this.iiiliilIll = 0.0F;
      this.IIIiiilIll = Long.MIN_VALUE;
      this.lIIiiilIll = Long.MIN_VALUE;
      this.iIIiiilIll = null;
      this.IlIiiilIll = 0.0F;
      this.llIiiilIll = null;
   }

   public lliiilIiiliiilIi IliIlllilIi(long tick) {
      long var32 = 6406929695623512885L;
      long var34 = 982572998805472527L;
      long var36 = -1898276267796141529L;
      long var38 = 3490539844276934162L;
      long var26 = 5484451622575721847L;
      long var28 = 2018782951665584730L;
      long var30 = -1643487854429628920L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      class_638 var5 = var3.field_1687;
      if (var4 != null && var5 != null) {
         class_243 var6 = var4.method_73189();
         class_238 var7 = var4.method_5829();
         this.iliIiiliiiii(tick, var4, var6, var7);
         float var8 = 1.0F;
         class_1304[] var9 = ililiilIll;
         var26 ^= ((long)var9.length << 32 ^ var26) & -1L << 32;

         for (var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            class_1304 var12 = var9[(int)var26];
            class_1799 var13 = var4.method_6118(var12);
            float var14 = var13.method_7960() ? 0.0F : (float)iIliilIlIlliilIl.IilliliilIIi(var13);
            var8 = Math.min(var8, var14);
         }

         class_1661 var40 = var4.method_31548();
         var26 ^= (0L ^ var26) & -1L << 32;
         var26 ^= (0L ^ var26) & -1L >>> 32;
         var28 ^= (0L ^ var28) & -1L << 32;
         var28 ^= (0L ^ var28) & -1L >>> 32;
         var30 ^= (0L ^ var30) & -1L << 32;
         var30 ^= (0L ^ var30) & -1L >>> 32;
         var32 ^= (0L ^ var32) & -1L << 32;
         var32 ^= (0L ^ var32) & -1L >>> 32;
         var34 ^= (0L ^ var34) & -1L << 32;
         class_1799 var19 = class_1799.field_8037;

         for (var34 ^= (0L ^ var34) & -1L >>> 32; (int)var34 <= 40; var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
            if ((int)var34 < 36 || (int)var34 >= 40) {
               class_1799 var21 = var40.method_5438((int)var34);
               if (!var21.method_7960()) {
                  var36 ^= ((long)var21.method_7947() << 32 ^ var36) & -1L << 32;
                  if (var21.method_31574(class_1802.field_8288)) {
                     var26 ^= ((long)((int)(var26 >>> 32) + (int)(var36 >>> 32)) << 32 ^ var26) & -1L << 32;
                  } else if (var21.method_31574(class_1802.field_8301)) {
                     var26 ^= ((long)((int)var26 + (int)(var36 >>> 32)) ^ var26) & -1L >>> 32;
                  } else if (var21.method_31574(class_1802.field_8281)) {
                     var28 ^= ((long)((int)(var28 >>> 32) + (int)(var36 >>> 32)) << 32 ^ var28) & -1L << 32;
                  } else if (var21.method_31574(class_1802.field_23141)) {
                     var28 ^= ((long)((int)var28 + (int)(var36 >>> 32)) ^ var28) & -1L >>> 32;
                  } else if (var21.method_31574(class_1802.field_8801)) {
                     var30 ^= ((long)((int)(var30 >>> 32) + (int)(var36 >>> 32)) << 32 ^ var30) & -1L << 32;
                  } else if (var21.method_31574(class_1802.field_8463) || var21.method_31574(class_1802.field_8367)) {
                     var30 ^= ((long)((int)var30 + (int)(var36 >>> 32)) ^ var30) & -1L >>> 32;
                  } else if (var21.method_31574(class_1802.field_8634)) {
                     var32 ^= ((long)((int)var32 + (int)(var36 >>> 32)) ^ var32) & -1L >>> 32;
                     if (var19.method_7960()) {
                        var19 = var21;
                     }
                  } else if (var21.method_31574(class_1802.field_8287)) {
                     var34 ^= ((long)((int)(var34 >>> 32) + (int)(var36 >>> 32)) << 32 ^ var34) & -1L << 32;
                  } else if (var21.method_57826(class_9334.field_50075)) {
                     var32 ^= ((long)((int)(var32 >>> 32) + (int)(var36 >>> 32)) << 32 ^ var32) & -1L << 32;
                  }
               }
            }
         }

         class_1799 var20 = var4.method_6079();
         var36 ^= ((long)var20.method_31574(class_1802.field_8288) ^ var36) & -1L >>> 32;
         var36 ^= ((long)((int)var36 != 0 && !IIIIilIilIIIilIi.iiiIlIIIll(40) ? 1 : 0) << 32 ^ var36) & -1L << 32;
         var38 ^= ((long)(!var19.method_7960() && !var4.method_7357().method_7904(var19) ? 1 : 0) << 32 ^ var38) & -1L << 32;
         iiIllIlIIlllIl var24 = lllIliIlillIliIl.iiiIlIIIll(var4);
         IlillIllllillIll var25 = IilIilllilIill.liiiIIllIl(var5, class_2338.method_49638(var6));
         this.llIiiilIll = new lliiilIiiliiilIi(
            var6,
            var4.method_33571(),
            var7,
            var4.method_18798(),
            var4.method_24828(),
            var4.method_6032(),
            var4.method_6067(),
            var24,
            var8,
            (boolean)((int)var36),
            (boolean)((int)(var36 >>> 32)),
            (int)(var26 >>> 32),
            (int)var26,
            (int)(var28 >>> 32),
            (int)var28,
            (int)(var30 >>> 32),
            (int)var30,
            (int)(var32 >>> 32),
            (int)var32,
            (int)(var34 >>> 32),
            (boolean)((int)(var38 >>> 32)),
            var4.method_7261(0.5F),
            var4.method_7344().method_7586(),
            illIllilIilIllil.Iilllilliill(var4.method_5628()),
            this.iiiliilIll,
            this.IiiliilIll,
            this.liiliilIll,
            var4.method_6115(),
            IIIIilIilIIIilIi.lIIlliIIll(),
            lIlIiIliIlIiIl.Iilllilliill(),
            var25,
            illIllilIilIllil.IiIlliIliiIl(),
            (double)illIllilIilIllil.IIIllIIliIIl()
         );
         return this.llIiiilIll;
      } else {
         return this.llIiiilIll;
      }
   }

   public lliiilIiiliiilIi iIlIlllllill() {
      return this.llIiiilIll;
   }

   private void iliIiiliiiii(long pos, class_746 tick, class_243 box, class_238 p) {
      long var8 = 4875929790274604116L;
      if (this.IIIiiilIll != Long.MIN_VALUE) {
         var8 ^= (
               (long)(
                        this.iIIiiilIll != null
                              && this.lIIiiilIll != Long.MIN_VALUE
                              && Math.abs(this.lIIiiilIll - this.IIIiiilIll) <= 1L
                              && this.iIIiiilIll.method_1022(box) <= 12.0
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var8
            )
            & -1L << 32;
         if ((int)(var8 >>> 32) != 0) {
            float var7 = this.IlIiiilIll > 0.0F ? this.IlIiiilIll : 6.0F;
            this.iiiliilIll = lllIliIlillIliIl.IlIllllIll(tick, this.iIIiiilIll, box, p, null, null, var7);
            this.IIIiiilIll = Long.MIN_VALUE;
         } else if (pos - this.IIIiiilIll >= 1L) {
            this.iiiliilIll = 0.0F;
            this.IIIiiilIll = Long.MIN_VALUE;
         }
      }
   }

   public void IilliliilIIi() {
      this.IiiliilIll = 0;
   }
}
