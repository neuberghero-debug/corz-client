package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class IIiIiIillIiIiIil {
   private boolean iIiiillIil;
   private final Object IiliillIil;
   public static final float IlliillIil = 6.0F;
   public static final int iIliillIil = 25;
   private final IIiIIlilIiIIli illiillIil;
   private class_2338 liliillIil;
   private final class_310 llliillIil = class_310.method_1551();
   private boolean iiliillIil;
   private int IIiiillIil = -1;
   private boolean lIiiillIil;

   public boolean Illlllllilll(class_1799 s) {
      return s != null
         && !s.method_7960()
         && s.method_31573(class_3489.field_42614)
         && Iilllilliill(s, class_1893.field_9099)
         && (
            !s.method_7963()
               || s.method_7936() - s.method_7919()
                  >= (
                     (
                           ((-2085654991 << 1 | -2085654991 >>> 31) >>> 13 | (-2085654991 << 1 | -2085654991 >>> 31) << 19) >>> 29
                              | ((-2085654991 << 1 | -2085654991 >>> 31) >>> 13 | (-2085654991 << 1 | -2085654991 >>> 31) << 19) << 3
                        )
                        ^ 415356846
                  )
         );
   }

   public boolean iliIiiliiiii() {
      if (this.iiliillIil && this.iIiiillIil && this.liliillIil != null) {
         class_746 var1 = this.llliillIil.field_1724;
         if (var1 == null || this.llliillIil.field_1687 == null || this.llliillIil.field_1755 != null || !var1.method_24828() || var1.method_6115()) {
            return false;
         } else {
            return this.IIiiillIil >= 0 && this.illiillIil.IIillIiliIil(this.IIiiillIil) ? IIiIIlilIiIIli.iIIIlIlIIl(this.llliillIil, this.liliillIil) : false;
         }
      } else {
         return false;
      }
   }

   public void IilliliilIIi() {
      if (this.liliillIil != null && this.llliillIil.field_1761 != null) {
         this.llliillIil.field_1761.method_2925();
      }

      this.liliillIil = null;
      this.iiliillIil = false;
      this.iIiiillIil = false;
   }

   public boolean IlIlllIlilIl() {
      return IIiIIlilIiIIli.iIIIlIlIIl(this.llliillIil, this.liliillIil);
   }

   public static int IIillIiliIil(class_1661 inv) {
      int var1 = 0;

      for (int var2 = 0; var2 <= 35; var2++) {
         if (IIlllIlliIll(inv.method_5438(var2))) {
            var1++;
         }
      }

      return var1;
   }

   static int IIIilIIiiIIi(class_1661 inv) {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (inv.method_5438(var1).method_7960()) {
            return var1;
         }
      }

      for (int var3 = 0; var3 <= 8; var3++) {
         class_1799 var2 = inv.method_5438(var3);
         if (!var2.method_31573(class_3489.field_42614)
            && var2.method_58694(class_9334.field_50075) == null
            && !var2.method_31574(class_1802.field_8466)
            && !var2.method_31574(class_1802.field_8288)) {
            return var3;
         }
      }

      return inv.method_67532() == 8 ? 7 : 8;
   }

   public static boolean IIlllIlliIll(class_1799 s) {
      if (s == null || s.method_7960()) {
         return false;
      } else {
         return !s.method_31574(class_1802.field_8377) && !s.method_31574(class_1802.field_22024)
            ? false
            : s.method_7936() - s.method_7919()
               >= (((942726332 << 13 | 942726332 >>> 19) << 29 | (942726332 << 13 | 942726332 >>> 19) >>> 3) + -1 - -77 ^ -1015877323);
      }
   }

   public IIiIiIillIiIiIil(IIiIIlilIiIIli owner, Object body) {
      this.illiillIil = owner;
      this.IiliillIil = body;
   }

   public void liiiIIllIl() {
      if (!this.iiliillIil && this.liliillIil != null) {
         this.IilliliilIIi();
      }
   }

   public class_2338 iIlIlllllill() {
      return this.liliillIil;
   }

   public void lIiiIiIlilli(boolean ok) {
      this.iIiiillIil = ok;
   }

   private static int Ililllililil(class_1661 inv, Predicate<class_1799> m) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (m.test(inv.method_5438(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private boolean Iiilliiliiil(class_1661 inv, Predicate<class_1799> match) {
      if (!this.lIiiillIil && !lIlIiIliIlIiIl.Illlllllilll()) {
         class_746 var3 = this.llliillIil.field_1724;
         if (var3.field_7512 != var3.field_7498) {
            return false;
         } else {
            for (int var4 = 9; var4 <= 35; var4++) {
               if (match.test(inv.method_5438(var4))) {
                  if (!lIlillliIlilll.IliIlllilIi(this.IiliillIil)) {
                     return true;
                  }

                  int var5 = var4;
                  int var6 = IIIilIIiiIIi(inv);
                  lIlIiIliIlIiIl.iIlIlllllill(
                     () -> {
                        class_746 var4x = this.llliillIil.field_1724;
                        if (var4x != null && this.llliillIil.field_1761 != null && var4x.field_7512 == var4x.field_7498) {
                           if (match.test(var4x.method_31548().method_5438(var5))) {
                              this.llliillIil
                                 .field_1761
                                 .method_2906(
                                    var4x.field_7498.field_7763,
                                    iiilIiIiIIIiIiIi.IliIlllilIi(var5),
                                    iiilIiIiIIIiIiIi.iIlIlllllill(var6),
                                    class_1713.field_7791,
                                    var4x
                                 );
                           }
                        }
                     },
                     true
                  );
                  this.lIiiillIil = true;
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean Iilllilliill(class_1799 stack, class_5321<class_1887> key) {
      if (stack != null && !stack.method_7960()) {
         class_9304 var2 = (class_9304)stack.method_58695(class_9334.field_49633, class_9304.field_49385);

         for (class_6880 var4 : var2.method_57534()) {
            if (var4.method_40225(key)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public lIlIiiiliIlIiiil IIIllIIliIIl(class_2338 silk, boolean pos) {
      long var7 = 176330494181826166L;
      class_746 var3 = this.llliillIil.field_1724;
      if (var3 != null && this.llliillIil.field_1687 != null && silk != null) {
         class_2680 var4 = this.llliillIil.field_1687.method_8320(silk);
         if (var4.method_26215() || !var4.method_26227().method_15769() && var4.method_26220(this.llliillIil.field_1687, silk).method_1110()) {
            if (silk.equals(this.liliillIil)) {
               this.liliillIil = null;
            }

            return lIlIiiiliIlIiiil.IiIiiIIiil;
         } else {
            if (!silk.equals(this.liliillIil)) {
               if (this.liliillIil != null && this.llliillIil.field_1761 != null) {
                  this.llliillIil.field_1761.method_2925();
               }

               this.liliillIil = silk;
            }

            this.iiliillIil = true;
            class_243 var5 = this.illiillIil.Iliilliiilii(silk, Double.longBitsToDouble(-7970131378680543060L ^ -3353378810672363348L));
            if (var5 == null) {
               return lIlIiiiliIlIiiil.iiIiiIIiil;
            } else {
               this.illiillIil.IIlllIlliIll(var5, 1);
               var7 ^= ((long)this.IiIlliIliiIl(var4, pos) << 32 ^ var7) & -1L << 32;
               if ((int)(var7 >>> 32) == ((-959985678 + 87) * 43 ^ -1670292547)) {
                  return lIlIiiiliIlIiiil.IIliiIIiil;
               } else if ((int)(var7 >>> 32) < 0) {
                  return lIlIiiiliIlIiiil.liIiiIIiil;
               } else {
                  this.IIiiillIil = (int)(var7 >>> 32);
                  if (!this.illiillIil.IIillIiliIil((int)(var7 >>> 32))) {
                     this.illiillIil.Ililllililil((int)(var7 >>> 32));
                     return lIlIiiiliIlIiiil.IIliiIIiil;
                  } else {
                     return lIlIiiiliIlIiiil.ilIiiIIiil;
                  }
               }
            }
         }
      } else {
         return lIlIiiiliIlIiiil.iiIiiIIiil;
      }
   }

   public void IliIlllilIi() {
      this.iiliillIil = false;
      this.iIiiillIil = false;
      if (this.lIiiillIil && !lIlIiIliIlIiIl.Illlllllilll()) {
         this.lIiiillIil = false;
      }
   }

   int IiIlliIliiIl(class_2680 st, boolean silk) {
      class_746 var3 = this.llliillIil.field_1724;
      class_1661 var4 = var3.method_31548();
      boolean var5 = st.method_27852(class_2246.field_23152);
      boolean var6 = st.method_27852(class_2246.field_10443);
      if (silk) {
         int var13 = Ililllililil(var4, this::Illlllllilll);
         if (var13 >= 0) {
            return var13;
         } else {
            return this.Iiilliiliiil(var4, this::Illlllllilll) ? -2 : -1;
         }
      } else if (!var5 && !var6) {
         float[] var12 = new float[9];
         boolean[] var14 = new boolean[9];

         for (int var15 = 0; var15 < 9; var15++) {
            class_1799 var17 = var4.method_5438(var15);
            boolean var19 = var17.method_7963() && var17.method_7936() - var17.method_7919() < 25;
            var12[var15] = var19 ? 1.0F : var17.method_7924(st);
            var14[var15] = !var19 && var17.method_7951(st);
         }

         int var16 = IIiiIlilIiiIli.IliIlllilIi(var12, var14, var4.method_67532());
         if (var16 < 0 || var16 > 8) {
            var16 = var4.method_67532();
         }

         class_1799 var18 = var4.method_5438(var16);
         if (var18.method_7963() && var18.method_7936() - var18.method_7919() < 25) {
            for (int var20 = 0; var20 < 9; var20++) {
               if (!var4.method_5438(var20).method_7963()) {
                  return var20;
               }
            }
         }

         return var16;
      } else {
         int var7 = -1;
         float var8 = 0.0F;

         for (int var9 = 0; var9 < 9; var9++) {
            class_1799 var10 = var4.method_5438(var9);
            if (IIlllIlliIll(var10) && var10.method_7951(st)) {
               float var11 = var10.method_7924(st) - (Iilllilliill(var10, class_1893.field_9099) ? 0.01F : 0.0F);
               if (var11 > var8) {
                  var8 = var11;
                  var7 = var9;
               }
            }
         }

         if (var7 >= 0) {
            return var7;
         } else {
            return this.Iiilliiliiil(var4, stx -> IIlllIlliIll(stx) && stx.method_7951(st)) ? -2 : -1;
         }
      }
   }
}
