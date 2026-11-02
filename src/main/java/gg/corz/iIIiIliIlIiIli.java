package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_4174;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class iIIiIliIlIiIli {
   private int ililIlIIIl = 20;
   private int iiilIlIIIl;
   private final class_310 IlilIlIIIl;
   private boolean IiilIlIIIl;
   private final ilIIIIiIiIIIIi llilIlIIIl;
   private int IIIiIlIIIl;
   private int liilIlIIIl = -1;
   private static final int iIilIlIIIl = 10;

   public boolean IliIlllilIi() {
      long var4 = 5033354307395354465L;
      class_746 var1 = this.IlilIlIIIl.field_1724;
      if (var1 == null || this.IlilIlIIIl.field_1761 == null) {
         return false;
      } else if (!this.llilIlIIIl.lliiIIiliiliiIIili) {
         if (this.IiilIlIIIl) {
            this.liiiIIllIl(var1);
         }

         return false;
      } else {
         var4 ^= ((long)var1.method_7344().method_7586() << 32 ^ var4) & -1L << 32;
         if (this.IiilIlIIIl) {
            if (var1.method_6115()) {
               this.IlilIlIIIl.field_1690.field_1904.method_23481(true);
               return true;
            } else {
               if ((int)(var4 >>> 32) <= this.iiilIlIIIl) {
                  this.IIIiIlIIIl = 20;
               }

               this.liiiIIllIl(var1);
               this.ililIlIIIl = (int)(var4 >>> 32);
               return false;
            }
         } else if (this.IIIiIlIIIl > 0) {
            this.IIIiIlIIIl--;
            return false;
         } else {
            if ((int)(var4 >>> 32) > this.ililIlIIIl) {
               this.ililIlIIIl = (int)(var4 >>> 32);
            }

            var4 ^= ((long)((int)(var4 >>> 32) <= 10 ? iIlIlllllill(var1) : -1) ^ var4) & -1L >>> 32;
            if ((int)var4 < 0) {
               if (this.ililIlIIIl - (int)(var4 >>> 32) < this.llilIlIIIl.IiiiIIililiiiIIili * 2) {
                  return false;
               }

               var4 ^= ((long)IilliliilIIi(var1) ^ var4) & -1L >>> 32;
            }

            if ((int)var4 < 0) {
               return false;
            } else {
               this.liilIlIIIl = var1.method_31548().method_67532();
               var1.method_31548().method_61496((int)var4);
               this.IlilIlIIIl.field_1761.method_2919(var1, class_1268.field_5808);
               this.iiilIlIIIl = (int)(var4 >>> 32);
               this.IiilIlIIIl = true;
               this.IlilIlIIIl.field_1690.field_1904.method_23481(var1.method_6115());
               return true;
            }
         }
      }
   }

   private static int iIlIlllllill(class_746 p) {
      long var8 = 3953969415400627539L;
      long var10 = 3330501378453611084L;
      var8 ^= (-4294967296L ^ var8) & -1L << 32;
      var8 ^= (-2147483648L ^ var8) & -1L >>> 32;

      for (long var15 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var15 >>> 32) < 9; var15 += 4294967296L) {
         class_1799 var4 = p.method_31548().method_5438((int)(var15 >>> 32));
         class_4174 var5 = var4.method_7960() ? null : (class_4174)var4.method_58694(class_9334.field_50075);
         if (var5 != null) {
            class_1792 var6 = var4.method_7909();
            if (var6 != class_1802.field_8463
               && var6 != class_1802.field_8367
               && var6 != class_1802.field_8233
               && var6 != class_1802.field_8323
               && var6 != class_1802.field_8680
               && var6 != class_1802.field_8635
               && var6 != class_1802.field_8766) {
               var15 ^= ((long)(var6 == class_1802.field_8511 ? var5.comp_2491() - 100 : var5.comp_2491()) ^ var15) & -1L >>> 32;
               if ((int)var15 > (int)var8) {
                  var8 ^= ((long)((int)var15) ^ var8) & -1L >>> 32;
                  var8 ^= ((long)((int)(var15 >>> 32)) << 32 ^ var8) & -1L << 32;
               }
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   public iIIiIliIlIiIli(class_310 mc, ilIIIIiIiIIIIi config) {
      this.iiilIlIIIl = 20;
      this.IlilIlIIIl = mc;
      this.llilIlIIIl = config;
   }

   private static int IilliliilIIi(class_746 p) {
      long var3 = 4558865250326375272L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         class_1799 var2 = p.method_31548().method_5438((int)(var5 >>> 32));
         if (var2.method_7909() == class_1802.field_8463 || var2.method_7909() == class_1802.field_8367) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   public void lIiiIiIlilli() {
      if (this.IiilIlIIIl) {
         class_746 var1 = this.IlilIlIIIl.field_1724;
         if (var1 != null) {
            this.liiiIIllIl(var1);
         } else {
            this.IlilIlIIIl.field_1690.field_1904.method_23481(false);
         }
      }

      this.IiilIlIIIl = false;
      this.liilIlIIIl = -1;
      this.ililIlIIIl = 20;
      this.iiilIlIIIl = 20;
      this.IIIiIlIIIl = 0;
   }

   private void liiiIIllIl(class_746 p) {
      if (this.liilIlIIIl >= 0 && this.liilIlIIIl < 9) {
         p.method_31548().method_61496(this.liilIlIIIl);
      }

      this.IiilIlIIIl = false;
      this.liilIlIIIl = -1;
      this.IlilIlIIIl.field_1690.field_1904.method_23481(false);
   }
}
