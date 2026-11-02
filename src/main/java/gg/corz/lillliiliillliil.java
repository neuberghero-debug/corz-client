package gg.corz;

import com.corz.client.CorzClient;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_276;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import org.lwjgl.glfw.GLFW;

public class lillliiliillliil extends class_437 implements Iilililiiili, Illillliilli {
   private static final int illlIiilil = 12;
   private double IIiiIiilil;
   private static final float liilIiilil = 1.1F;
   private String iIiIliilil;
   private final class_4587 lIIIliilil;
   private int iiliIiilil;
   private double liiiIiilil;
   private int iIlIliilil;
   private static int lilIliilil;
   private static long IIiIliilil;
   private int liliIiilil;
   private static final float IlilIiilil = 14.0F;
   private static final long liIiIiilil = 900000000L;
   private illiIlllIiliIlll llliIiilil;
   private static boolean ilIIliilil = false;
   private static final int llIiIiilil = 16;
   private boolean llIIliilil;
   private final liIliIliiIliIl iIIIliilil;
   private static final double lIIiIiilil = 140.0;
   private static int illIliilil;
   private static long iilIliilil;
   private static final int lIllIiilil = 620;
   private final illilIiIililIi IIIIliilil;
   private long lliiIiilil;
   private ilIllIiIll IIlIliilil;
   private float iiIIliilil;
   private iIiilIiIliilIi iIliIiilil;
   private static final int iIilIiilil = 3;
   private static final int llllIiilil = 6;
   private static final float llilIiilil = 0.9F;
   private lIllIIiiIllIIi lIliIiilil;
   private static boolean liIIliilil = false;
   private int IllIliilil;
   private static final double IIIiIiilil = 150.0;
   private static final float IiilIiilil = 1.9F;
   private static int IilIliilil;
   private static final int lIilIiilil = 0;
   private static final double iiilIiilil = 260.0;
   private static final double IlIiIiilil = 70.0;
   private float IiiiIiilil;
   private iIlllIllll IlliIiilil;
   private boolean IlIIliilil;
   private static final int IlllIiilil = 128;
   private static final float ililIiilil = 0.965F;
   private static boolean lllIliilil;
   private static liiIlIliiiiIlIli IiIIliilil;
   private boolean lIiiIiilil;
   private IIIiliIilIIiliIi IiliIiilil;
   private boolean lIlIliilil;
   private static final int iillIiilil = 0;
   private static final float ilIiIiilil = 0.5F;
   private static final int lillIiilil = 4;
   private illliiiIilliii illiIiilil;
   private String IliiIiilil;
   private final List<IiiIllilliiIllil> IliIliilil;
   private boolean iiIiIiilil = false;
   private final Map<lllIllillIll, List<IiiIllilliiIllil>> IIliIiilil = new HashMap<>();
   private static final int IiIiIiilil = 16;
   private static final int IIilIiilil = 4;
   private static final double iIIiIiilil = 26.0;
   private long iiiiIiilil;
   private static final int IillIiilil = 4;
   private double iIiiIiilil;
   private float iliiIiilil;
   private static final int iIllIiilil = 360;
   private static long lIiIliilil;

   private boolean Iiiiliiiiiii() {
      return this.IlIIliilil || this.IIIIliilil.liiiIIllIl() || IIIiIillIIiIil.liIlliiIll();
   }

   public boolean method_25402(class_11909 doubled, boolean click) {
      long var17 = 8167975081207509544L;
      long var19 = -8172649840217585508L;
      long var21 = 5468411515634247857L;
      long var15 = -1187107391063219267L;
      if (!this.IlIIliilil && !this.IIIIliilil.liiiIIllIl() && IIIiIillIIiIil.iIlllIllll()) {
         return true;
      } else if (this.Iiiiliiiiiii()) {
         return true;
      } else {
         double var3 = this.iIIIlIlIIl(doubled.comp_4798());
         double var5 = this.llIIlilIIl(doubled.comp_4799());
         var15 ^= ((long)doubled.method_74245() << 32 ^ var15) & -1L << 32;
         if (!this.Illlllllilll() && this.iIliIiilil.IiIiliIiiiIi(var3, var5)) {
            for (IiiIllilliiIllil var26 : this.IIIllIIliIIl()) {
               var26.Illlllllilll();
            }

            if (this.llliIiilil != null) {
               this.llliIiilil.Iiiiliiiiiii();
            }

            this.iIliIiilil.IlIillIiilIi(var3, var5, (int)(var15 >>> 32));
            return true;
         } else {
            for (IiiIllilliiIllil var9 : this.IIIllIIliIIl()) {
               if (var9.IIIllIIliIIl()) {
                  if ((int)(var15 >>> 32) >= 0 && (int)(var15 >>> 32) <= 7) {
                     var9.IiIlliIliiIl((int)(var15 >>> 32));
                  } else {
                     var9.IIlllIlliIll();
                  }

                  return true;
               }
            }

            if (this.IiIlliIliiIl() && this.llliIiilil.IIIllIIliIIl()) {
               if ((int)(var15 >>> 32) >= 0 && (int)(var15 >>> 32) <= 7) {
                  this.llliIiilil.iIIIlIlIIl((int)(var15 >>> 32));
               } else {
                  this.llliIiilil.llIIlilIIl();
               }

               return true;
            } else if (iIIlIllIlIlIll.iIlIiIllIi((int)(var15 >>> 32))) {
               return true;
            } else {
               if (this.llliIiilil != null && (!this.IiIlliIliiIl() || !this.IIillIiliIil(var3, var5))) {
                  this.llliIiilil.Iiiiliiiiiii();
               }

               int[] var23 = this.lliIliliIl();
               if (var23 != null && (int)(var15 >>> 32) == 0) {
                  var15 ^= ((long)var23[0] ^ var15) & -1L >>> 32;
                  var17 ^= ((long)var23[1] << 32 ^ var17) & -1L << 32;
                  var17 ^= ((long)var23[2] ^ var17) & -1L >>> 32;
                  var19 ^= ((long)var23[3] << 32 ^ var19) & -1L << 32;
                  var19 ^= ((long)var23[4] ^ var19) & -1L >>> 32;
                  var21 ^= ((long)var23[5] << 32 ^ var21) & -1L << 32;
                  if (var3 > (double)((int)var15 - 1)
                     && var3 <= (double)((int)var15 + (int)(var19 >>> 32) + 2)
                     && var5 >= (double)((int)(var17 >>> 32))
                     && var5 <= (double)((int)(var17 >>> 32) + (int)var17)) {
                     if (var5 >= (double)((int)var19) && var5 <= (double)((int)var19 + (int)(var21 >>> 32))) {
                        this.lIiiIiilil = true;
                        this.iIiiIiilil = var5 - (double)((int)var19);
                     } else {
                        this.iIiiIiilil = (double)((int)(var21 >>> 32)) / 2.0;
                        this.IiiIlliiIl(var5 - this.iIiiIiilil, (int)(var17 >>> 32), (int)var17, (int)(var21 >>> 32));
                        this.IIiiIiilil = (double)this.iiliIiilil;
                        this.lIiiIiilil = true;
                     }

                     return true;
                  }
               }

               IiiIllilliiIllil var25 = this.Iilllilliill();
               if (var25 != null) {
                  var25.IIiilIiiiIii(var3, var5, (int)(var15 >>> 32));
                  return true;
               } else if (IIIiIillIIiIil.Iillllilll(var3, var5, (int)(var15 >>> 32))) {
                  return true;
               } else if (this.lIliIiilil.IlIllllIll(var3, var5, (int)(var15 >>> 32))) {
                  return true;
               } else if (this.iIliIiilil.IlIillIiilIi(var3, var5, (int)(var15 >>> 32))) {
                  return true;
               } else if (!this.IIillIiliIil(var3, var5)) {
                  return false;
               } else if (this.IlIlllIlilIl()) {
                  return this.IlliIiilil.IiIIlliIIl(var3, var5 + (double)this.iliiIiilil, (int)(var15 >>> 32));
               } else if (this.IiIlliIliiIl()) {
                  return this.llliIiilil.IIlilIliiIli(var3, var5 + (double)this.iliiIiilil, (int)(var15 >>> 32));
               } else if (this.IIlllIlliIll()) {
                  return this.illiIiilil.IlIlllIlilIl(var3, var5, (int)(var15 >>> 32));
               } else {
                  long var10 = System.nanoTime();

                  for (IiiIllilliiIllil var13 : this.IIIllIIliIIl()) {
                     if ((var13.IillIllillIl() == 0L || !var13.iillIlIIilIl() || !((double)(var10 - var13.IillIllillIl()) / 1000000.0 < 75.0))
                        && var13.IIiilIiiiIii(var3, var5, (int)(var15 >>> 32))) {
                        if (var13.llIiIlilIiIl()) {
                           this.iliIiiliiiii(var13);
                        }

                        this.IiliIiilil.IIIllIIliIIl(var13.liilIliiilIl().IilliliilIIi(), var13.llIiIlilIiIl());
                        this.lIIlliIIll();
                        return true;
                     }
                  }

                  return false;
               }
            }
         }
      }
   }

   public boolean method_25404(class_11908 input) {
      long var9 = -4043708278263608780L;
      long var11 = 1377758996627484267L;
      if (!this.IlIIliilil && !this.IIIIliilil.liiiIIllIl()) {
         var9 ^= ((long)IIIiIillIIiIil.iilllIIill(input.comp_4795()) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) == 2) {
            this.method_25419();
            return true;
         }

         if ((int)(var9 >>> 32) == 1) {
            return true;
         }
      }

      if (this.Iiiiliiiiiii()) {
         return true;
      } else {
         var9 ^= ((long)input.comp_4795() << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)input.comp_4796() ^ var9) & -1L >>> 32;
         var11 ^= ((long)input.comp_4797() << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)this.iIliIiilil.IIiilIiiiIii().IIlilIliiIli() ^ var11) & -1L >>> 32;
         if ((int)var11 != 0 && this.iIliIiilil.IIlilIliiIli((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32))) {
            return true;
         } else {
            IiiIllilliiIllil var6 = this.Iilllilliill();
            if (var6 != null) {
               var6.iIIIlIlIIl((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32));
               return true;
            } else if (this.iIliIiilil.IIlilIliiIli((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32))) {
               if (this.llliIiilil != null) {
                  this.llliIiilil.Iiiiliiiiiii();
               }

               return true;
            } else if ((int)var11 == 0 && this.IiIlliIliiIl() && this.llliIiilil.IIIllIIliIIl()) {
               this.llliIiilil.IIIIllIIIl((int)(var9 >>> 32));
               return true;
            } else if (this.IiIlliIliiIl() && this.llliIiilil.IIiilIiiiIii((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32))) {
               return true;
            } else {
               for (IiiIllilliiIllil var8 : this.IIIllIIliIIl()) {
                  if ((int)var11 == 0 && var8.IIIllIIliIIl()) {
                     var8.IlIlllIlilIl((int)(var9 >>> 32));
                     return true;
                  }

                  if (var8.iIIIlIlIIl((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32))) {
                     return true;
                  }
               }

               if (this.IIlllIlliIll() && (int)var11 == 0 && this.illiIiilil.Iilllilliill((int)(var9 >>> 32), (int)(var11 >>> 32))) {
                  return true;
               } else if ((int)(var9 >>> 32) == 256) {
                  this.method_25419();
                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   private void IIiilIiiiIii(class_332 root, int px, int py, float ctx) {
      long var9 = 8133846151034730853L;
      long var11 = 7350181984117129743L;
      var9 ^= ((long)(px + this.liliIiilil + 12) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)(620 - this.liliIiilil - 18) ^ var9) & -1L >>> 32;
      var11 ^= ((long)(py + 6) << 32 ^ var11) & -1L << 32;
      var11 ^= (348L ^ var11) & -1L >>> 32;
      iilIllIiIIiIllIi.IIIllIIliIIl(root, 0, (float)((int)(var9 >>> 32)), (float)((int)(var11 >>> 32)), (float)((int)var9), (float)((int)var11), 7.0F, ctx);
   }

   private static float Illillliilli(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   public void method_25432() {
      super.method_25432();
      if (this.illiIiilil != null) {
         this.illiIiilil.Ililllililil();
      }

      IIIiIillIIiIil.IilliliilIIi();
      if (!this.IlIIliilil) {
         iIIlIllIlIlIll.IiIlliIliiIl();
      }
   }

   private boolean IlIlllIlilIl() {
      return !this.iiIIlIIlIl() && this.IlliIiilil != null && this.IiliIiilil.lIiiIiIlilli() == lllIllillIll.lillIIIiiillIIIi;
   }

   public void liiiIIllIl() {
      this.lIlIliilil = true;
   }

   public void method_25420(class_332 ctx, int mx, int delta, float my) {
   }

   private void lIIlliIIll() {
      this.IlIllllIll(IiiIllilliiIllil.IIliilIlii(this.IIiiIiilil));
   }

   private static float IIlilIliiIli(float t) {
      t = Illillliilli(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private double llIIlilIIl(double y) {
      return (double)this.field_22790 / 2.0 + (y - (double)this.field_22790 / 2.0) / (double)this.iiIIliilil;
   }

   private int lilIliilIl() {
      return 316;
   }

   private boolean IIlllIlliIll() {
      return !this.iiIIlIIlIl() && this.illiIiilil != null && this.IiliIiilil.lIiiIiIlilli() == lllIllillIll.lIllIIIiiIllIIIi;
   }

   private void IilliliilIIi() {
      long var9 = -7615658092167904892L;
      long var1 = System.nanoTime();
      this.lliiIiilil = var1;
      this.iiiiIiilil = var1;
      if (this.IIlllIlliIll()) {
         this.illiIiilil.IilliliilIIi();
      } else {
         var9 ^= ((long)this.lIlIliIlIl() << 32 ^ var9) & -1L << 32;
         var9 ^= (0L ^ var9) & -1L >>> 32;

         for (IiiIllilliiIllil var6 : this.IIIllIIliIIl()) {
            if (var6.IIIiIllIIiIl()) {
               double var7 = (int)(var9 >>> 32) != 0 ? 0.0 : (double)Math.min((int)var9, 16) * 26.0;
               var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
               var6.llllIlilllIl(var1 + (long)(var7 * 1000000.0), true);
            }
         }
      }
   }

   private void ilIllIiIll() {
      super.method_25419();
      ilIllIiIll.Iiiilllliiilll.method_15993();
   }

   private int[] iIiIlIliIl(int cy, int cw, int ch, int cx) {
      long var17 = 4760221482180351735L;
      long var19 = -9042221035522668253L;
      long var21 = 6165317542539635527L;
      long var15 = 7737782864565937224L;
      var15 ^= ((long)this.IIiIllIiIl() << 32 ^ var15) & -1L << 32;
      if ((int)(var15 >>> 32) <= 0) {
         return null;
      } else {
         var15 ^= ((long)this.illIlIilIl() ^ var15) & -1L >>> 32;
         var17 ^= (12884901888L ^ var17) & -1L << 32;
         var17 ^= ((long)(cy + ch + 1) ^ var17) & -1L >>> 32;
         var19 ^= ((long)(cw + 6) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)(cx - 12) ^ var19) & -1L >>> 32;
         var21 ^= ((long)Math.max(24, (int)((double)cx / (double)((int)var15) * (double)((int)var19))) << 32 ^ var21) & -1L << 32;
         double var12 = Math.max(0.0, Math.min(1.0, this.IIiiIiilil / (double)((int)(var15 >>> 32))));
         this.IiiiIiilil = (float)((double)((int)(var19 >>> 32)) + var12 * (double)((int)var19 - (int)(var21 >>> 32)));
         var21 ^= ((long)Math.round(this.IiiiIiilil) ^ var21) & -1L >>> 32;
         return new int[]{(int)var17, (int)(var19 >>> 32), (int)var19, (int)(var17 >>> 32), (int)var21, (int)(var21 >>> 32)};
      }
   }

   public boolean method_25400(class_11905 input) {
      long var7 = -2606488056194164076L;
      IIIiIillIIiIil.IIllllIlll();
      if (this.Iiiiliiiiiii()) {
         return true;
      } else {
         var7 ^= ((long)((char)input.comp_4793()) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)input.comp_4794() ^ var7) & -1L >>> 32;
         if (this.iIliIiilil.IIiilIiiiIii().IIlilIliiIli() && this.iIliIiilil.Illillliilli((char)((int)(var7 >>> 32)), (int)var7)) {
            return true;
         } else {
            IiiIllilliiIllil var4 = this.Iilllilliill();
            if (var4 != null) {
               var4.llIIlilIIl((char)((int)(var7 >>> 32)), (int)var7);
               return true;
            } else if (this.iIliIiilil.Illillliilli((char)((int)(var7 >>> 32)), (int)var7)) {
               return true;
            } else if (this.IiIlliIliiIl() && this.llliIiilil.Iliilliiilii((char)((int)(var7 >>> 32)), (int)var7)) {
               return true;
            } else {
               for (IiiIllilliiIllil var6 : this.IIIllIIliIIl()) {
                  if (var6.llIIlilIIl((char)((int)(var7 >>> 32)), (int)var7)) {
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   private static boolean Iilililiiili(lllIllillIll c) {
      return c == lllIllillIll.IlllIIIillllIIIi
         || c == lllIllillIll.illlIIIiIillIIIi
         || c == lllIllillIll.lillIIIiiillIIIi
         || c == lllIllillIll.IIilIIIilIilIIIi;
   }

   public void method_25419() {
      if (!this.IlIIliilil) {
         this.IlIIliilil = true;
         ilIIliilil = true;
         this.lIiiIiilil = false;
         this.iIIIliilil.IIIllIIliIIl(iIIlIllIlIlIll.lIiiIiIlilli() ? 380 : 240);
         this.iIIIliilil.lIiiIiIlilli(0.0);
      }
   }

   private void iiiIlIIIll(class_332 ch, int cw, int mx, int ctx, int my, int cy, int cx) {
      long var32 = -5867710872803026094L;
      long var24 = 8978503039344008065L;
      long var26 = 2083509937276490003L;
      long var28 = 4595079469554877418L;
      long var30 = -7169869412912107147L;
      int[] var8 = this.iIiIlIliIl(cw, mx, ctx, my);
      if (var8 == null) {
         this.liiiIiilil = 0.0;
      } else {
         var24 ^= ((long)var8[0] << 32 ^ var24) & -1L << 32;
         var24 ^= ((long)var8[1] ^ var24) & -1L >>> 32;
         var26 ^= ((long)var8[2] << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)var8[3] ^ var26) & -1L >>> 32;
         var28 ^= ((long)var8[4] << 32 ^ var28) & -1L << 32;
         var28 ^= ((long)var8[5] ^ var28) & -1L >>> 32;
         var30 ^= ((long)(cy >= cw + ctx - 2 && cy <= cw + ctx + 6 && cx >= mx && cx <= mx + my ? 1 : 0) << 32 ^ var30) & -1L << 32;
         var30 ^= (
               (long)(
                     !this.lIiiIiilil
                           && (
                              cy <= (int)(var24 >>> 32) - 1
                                 || cy > (int)(var24 >>> 32) + (int)var26 + 2
                                 || cx < (int)(var28 >>> 32)
                                 || cx > (int)(var28 >>> 32) + (int)var28
                           )
                        ? 0
                        : 1
                  )
                  ^ var30
            )
            & -1L >>> 32;
         long var17 = System.nanoTime();
         if (this.lIiiIiilil || (int)(var30 >>> 32) != 0 || Math.abs(this.IIiiIiilil - (double)this.iiliIiilil) > 0.5) {
            this.iiiiIiilil = var17;
         }

         var32 ^= ((long)(var17 - this.iiiiIiilil < 900000000L ? 1 : 0) << 32 ^ var32) & -1L << 32;
         this.liiiIiilil = IiiIIIIlliiIIIIl.iIlIlllllill(
            this.liiiIiilil, (int)(var32 >>> 32) != 0 ? 1.0 : 0.0, (int)(var32 >>> 32) != 0 ? 18.0 : 5.0, llIilillilIilill.liiiIIllIl()
         );
         if (!(this.liiiIiilil < 0.01)) {
            var32 ^= ((long)((int)var30 != 0 ? IilIIIIililIIIIi.IIlllIlliIll(0.75) : 872415231) ^ var32) & -1L >>> 32;
            float var21 = (float)IiiIllilliiIllil.IIliilIlii((double)this.IiiiIiilil);
            float var22 = IliiIilliiIi.IilliliilIIi((float)this.liiiIiilil);

            try {
               IIIiiIillIIiiIil.IlIlllIlilIl(
                  ch, (float)((int)(var24 >>> 32) + 1), var21, (float)((int)var26 - 1), (float)((int)var28), (float)((int)var26 - 1) / 2.0F, (int)var32
               );
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var22);
            }
         }
      }
   }

   private int IIiIllIiIl() {
      return Math.max(0, this.illIlIilIl() - this.lilIliilIl());
   }

   private int[] lliIliliIl() {
      long var7 = -1500257103502795943L;
      long var9 = 3808696740288296016L;
      long var11 = 7696823878979340788L;
      var7 ^= ((long)((this.field_22790 - 360) / 2) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((this.field_22789 - 620) / 2) ^ var7) & -1L >>> 32;
      var9 ^= ((long)((int)var7 + this.liliIiilil + 12) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)((int)(var7 >>> 32) + 6 + 28 + 4) ^ var9) & -1L >>> 32;
      var11 ^= ((long)(620 - this.liliIiilil - 18) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)this.lilIliilIl() ^ var11) & -1L >>> 32;
      return this.iIiIlIliIl((int)(var9 >>> 32), (int)var9, (int)(var11 >>> 32), (int)var11);
   }

   public boolean method_25406(class_11909 click) {
      long var11 = -8027660860945251899L;
      IIIiIillIIiIil.IIllllIlll();
      if (iIIlIllIlIlIll.IilIililIi(click.method_74245())) {
         return true;
      } else if (this.Iiiiliiiiiii()) {
         return true;
      } else if (this.lIiiIiilil) {
         this.lIiiIiilil = false;
         return true;
      } else {
         double var2 = this.iIIIlIlIIl(click.comp_4798());
         double var4 = this.llIIlilIIl(click.comp_4799());
         var11 ^= ((long)click.method_74245() << 32 ^ var11) & -1L << 32;
         if (this.IIlllIlliIll()) {
            this.illiIiilil.IIlllIlliIll(var2, var4, (int)(var11 >>> 32));
            return true;
         } else if (this.IlIlllIlilIl()) {
            this.IlliIiilil.lIlIliIlIl(var2, var4 + (double)this.iliiIiilil, (int)(var11 >>> 32));
            return true;
         } else if (this.IiIlliIliiIl()) {
            this.llliIiilil.Iilililiiili(var2, var4 + (double)this.iliiIiilil, (int)(var11 >>> 32));
            return true;
         } else {
            double var7 = var4;

            for (IiiIllilliiIllil var10 : this.IIIllIIliIIl()) {
               var10.IIIIllIIIl(var2, var7, (int)(var11 >>> 32));
            }

            return this.Illlllllilll();
         }
      }
   }

   private boolean lIlIliIlIl() {
      return !this.iiIIlIIlIl() && Iilililiiili(this.IiliIiilil.lIiiIiIlilli());
   }

   private int illIlIilIl() {
      long var12 = 4754030757375820259L;
      if (this.IlIlllIlilIl()) {
         return 0 + this.IlliIiilil.iliIiiliiiii();
      } else if (this.IiIlliIliiIl()) {
         return 0 + this.llliIiilil.lIiiIiIlilli();
      } else if (this.IIlllIlliIll()) {
         return this.lilIliilIl();
      } else {
         List var1 = this.IIIllIIliIIl();
         if (var1.isEmpty()) {
            return 0;
         } else {
            var12 ^= ((long)this.lIlIliIlIl() << 32 ^ var12) & -1L << 32;
            double var3 = 0.0;
            double var5 = 0.0;
            var12 ^= (0L ^ var12) & -1L >>> 32;

            for (IiiIllilliiIllil var9 : var1) {
               if (var9.IIIiIllIIiIl()) {
                  double var10 = var9.IlIiillIii() + 4.0;
                  if ((int)(var12 >>> 32) != 0) {
                     var3 += var10;
                  } else if ((int)var12 % 2 == 0) {
                     var3 += var10;
                  } else {
                     var5 += var10;
                  }

                  var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
               }
            }

            return 0 + (int)Math.ceil(Math.max(0.0, ((int)(var12 >>> 32) != 0 ? var3 : Math.max(var3, var5)) - 4.0));
         }
      }
   }

   public boolean method_25421() {
      return false;
   }

   private void IiIIlliIIl(String search) {
      long var17 = 4449251531763349411L;
      long var15 = 5686828244803699918L;
      String var2 = search.toLowerCase().trim();
      var15 ^= ((long)(!this.iIiIliilil.isEmpty() ? 1 : 0) << 32 ^ var15) & -1L << 32;
      this.iIiIliilil = var2;
      ArrayList var4 = new ArrayList<>(this.IliIliilil);
      this.IliIliilil.clear();
      if (var2.isEmpty()) {
         lllIllillIll var19 = this.IiliIiilil.lIiiIiIlilli();
         this.IIliIiilil.forEach((list, cat) -> cat.forEach(p -> p.iIIiIlIlIiIl(list == var19)));
         this.iiliIiilil = 0;
         this.IIiiIiilil = 0.0;
         if ((int)(var15 >>> 32) != 0) {
            this.IilliliilIIi();
         }
      } else {
         ArrayList var5 = new ArrayList();

         for (Entry var7 : this.IIliIiilil.entrySet()) {
            if (Iilililiiili((lllIllillIll)var7.getKey())) {
               for (IiiIllilliiIllil var24 : (List)var7.getValue()) {
                  var24.iIIiIlIlIiIl(false);
               }
            } else {
               String var8 = ((lllIllillIll)var7.getKey()).name().toLowerCase();

               for (IiiIllilliiIllil var10 : (List)var7.getValue()) {
                  String var11 = var10.liilIliiilIl().IilliliilIIi().toLowerCase();
                  String var12 = ilIIlilIiIIlil.IliIlllilIi(var10.liilIliiilIl());
                  double var13 = 0.0;
                  if (var11.startsWith(var2)) {
                     var13 = 3.0;
                  } else if (var11.contains(var2)) {
                     var13 = 2.0;
                  } else if (var12 != null && var12.toLowerCase().contains(var2)) {
                     var13 = 1.0;
                  } else if (var8.contains(var2)) {
                     var13 = 0.5;
                  }

                  var10.iIIiIlIlIiIl(var13 > 0.0);
                  if (var13 > 0.0) {
                     var5.add(new Object[]{var10, var13});
                  }
               }
            }
         }

         var5.sort(
            (b, a) -> {
               long var3 = -5732592995616630768L;
               var3 ^= ((long)Double.compare((Double)a[1], (Double)b[1]) << 32 ^ var3) & -1L << 32;
               return (int)(var3 >>> 32) != 0
                  ? (int)(var3 >>> 32)
                  : ((IiiIllilliiIllil)b[0]).liilIliiilIl().IilliliilIIi().compareToIgnoreCase(((IiiIllilliiIllil)a[0]).liilIliiilIl().IilliliilIIi());
            }
         );

         for (Object[] var22 : var5) {
            this.IliIliilil.add((IiiIllilliiIllil)var22[0]);
         }

         this.iiliIiilil = 0;
         this.IIiiIiilil = 0.0;
         long var21 = System.nanoTime();
         var15 ^= (0L ^ var15) & -1L >>> 32;
         var17 ^= (0L ^ var17) & -1L << 32;

         while ((int)(var17 >>> 32) < this.IliIliilil.size()) {
            IiiIllilliiIllil var25 = this.IliIliilil.get((int)(var17 >>> 32));
            var17 ^= ((long)var4.indexOf(var25) ^ var17) & -1L >>> 32;
            if ((int)var17 < 0) {
               int var10002 = (int)var15;
               var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
               var25.llllIlilllIl(var21 + (long)((double)Math.min(var10002, 16) * 26.0 * 0.6 * 1000000.0), true);
            } else if ((int)var17 != (int)(var17 >>> 32)) {
               var25.llllIlilllIl(var21, false);
            }

            var17 += 4294967296L;
         }

         if ((int)var15 > 0) {
            this.lliiIiilil = var21;
         }
      }
   }

   private void IlIillIiilIi(class_332 ty, float ctx) {
      this.lIIIliilil.method_22903();
      this.lIIIliilil.method_46416(0.0F, ctx, 0.0F);
      ty.method_51448().pushMatrix();
      ty.method_51448().translate(0.0F, ctx);
   }

   private boolean IIillIiliIil(double my, double mx) {
      long var11 = -5003717803120962529L;
      long var13 = -5394336073428220121L;
      long var15 = 6982150659578866309L;
      var11 ^= ((long)((this.field_22789 - 620) / 2) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)((this.field_22790 - 360) / 2) ^ var11) & -1L >>> 32;
      var13 ^= ((long)((int)(var11 >>> 32) + this.liliIiilil + 12) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)((int)var11 + 6 + 28 + 4) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(620 - this.liliIiilil - 18) << 32 ^ var15) & -1L << 32;
      var15 ^= (316L ^ var15) & -1L >>> 32;
      return my >= (double)((int)(var13 >>> 32))
         && my <= (double)((int)(var13 >>> 32) + (int)(var15 >>> 32))
         && mx >= (double)((int)var13)
         && mx <= (double)((int)var13 + (int)var15);
   }

   private GpuTextureView Iliilliiilii() {
      long var4 = 7331188573158701955L;
      if (IiIIliilil == null) {
         IiIIliilil = new liiIlIliiiiIlIli();
      }

      class_276 var1 = ilIllIiIll.Iiiilllliiilll.method_1522();
      if (var1 != null && var1.method_30277() != null) {
         var4 ^= ((long)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489() << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506() ^ var4) & -1L >>> 32;
         return (int)(var4 >>> 32) > 0 && (int)var4 > 0
            ? IiIIliilil.IliIlllilIi(var1.method_30277(), var1.method_71639(), (int)(var4 >>> 32), (int)var4, 4, 2.5F)
            : null;
      } else {
         return null;
      }
   }

   protected void method_25426() {
      long var33 = -6350053904448062631L;
      long var35 = 6619267057772093813L;
      long var37 = -2695462210342655514L;
      long var39 = -2434637825055435588L;
      long var25 = 5604990084310744429L;
      long var41 = -3508052031642159158L;
      long var27 = -4625854277887676685L;
      long var29 = -8481790804916401570L;
      long var31 = 503027745556860980L;
      if (!this.iiIiIiilil) {
         this.iiIiIiilil = true;
         ilIllIiIll.Iiiilllliiilll.method_15993();
      } else {
         var25 ^= ((long)this.lIlIliilil << 32 ^ var25) & -1L << 32;
         this.lIlIliilil = false;
         if ((int)(var25 >>> 32) != 0 && this.lIliIiilil != null && this.field_22789 == this.iIlIliilil && this.field_22790 == this.IllIliilil) {
            super.method_25426();
            ilIIliilil = this.IlIIliilil;
         } else {
            super.method_25426();
            llIilillilIilill.iIlIlllllill();
            ilIIliilil = this.IlIIliilil;
            this.IiliIiilil = IIIiliIilIIiliIi.IliIlllilIi();
            List var2 = this.IiliIiilil.liiiIIllIl();
            var25 ^= ((long)((this.field_22789 - 620) / 2) ^ var25) & -1L >>> 32;
            var27 ^= ((long)((this.field_22790 - 360) / 2) << 32 ^ var27) & -1L << 32;
            this.lIliIiilil = new lIllIIiiIllIIi((int)var25 + 6, (int)(var27 >>> 32) + 6, 128, 348, var2, this::iIlIlllllill);
            this.liliIiilil = this.lIliIiilil.liiiIIllIl();
            this.iIliIiilil = new iIiilIiIliilIi((int)var25 + this.liliIiilil + 12, (int)(var27 >>> 32) + 6, 620 - this.liliIiilil - 18);
            var27 ^= (0L ^ var27) & -1L >>> 32;

            for (lllIllillIll var7 : var2) {
               List var8 = var7 == lllIllillIll.lIllIIIiiIllIIIi
                  ? llIlIIIiilIlIIIi.IlIlllIlilIl(this.IiliIiilil.iIlIlllllill(var7))
                  : this.IiliIiilil.iIlIlllllill(var7);
               ArrayList var9 = new ArrayList();
               long var50 = var29 ^ ((long)((int)var25 + this.liliIiilil + 12) << 32 ^ var29) & -1L << 32;
               var29 = var50 ^ ((long)((int)(var27 >>> 32) + 6 + 28 + 4 + 0) ^ var50) & -1L >>> 32;
               long var51 = var31 ^ ((long)(620 - this.liliIiilil - 18 - 0) << 32 ^ var31) & -1L << 32;
               var31 = var51 ^ ((long)Iilililiiili(var7) ^ var51) & -1L >>> 32;
               var33 ^= ((long)((int)var31 != 0 ? (int)(var31 >>> 32) : ((int)(var31 >>> 32) - 4) / 2) << 32 ^ var33) & -1L << 32;
               var33 ^= ((long)((int)var29) ^ var33) & -1L >>> 32;
               var35 ^= ((long)((int)var29) << 32 ^ var35) & -1L << 32;
               String var17 = null;

               for (var35 ^= (0L ^ var35) & -1L >>> 32; (int)var35 < var8.size(); var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
                  ilIllIiIll var19 = (ilIllIiIll)var8.get((int)var35);
                  if ((int)var31 != 0) {
                     var37 ^= ((long)((int)(var29 >>> 32)) << 32 ^ var37) & -1L << 32;
                     var37 ^= ((long)((int)var33) ^ var37) & -1L >>> 32;
                  } else {
                     var39 ^= ((long)((int)var35 % 2 == 0 ? 1 : 0) << 32 ^ var39) & -1L << 32;
                     var37 ^= ((long)((int)(var39 >>> 32) != 0 ? (int)(var29 >>> 32) : (int)(var29 >>> 32) + (int)(var33 >>> 32) + 4) << 32 ^ var37)
                        & -1L << 32;
                     var37 ^= ((long)((int)(var39 >>> 32) != 0 ? (int)var33 : (int)(var35 >>> 32)) ^ var37) & -1L >>> 32;
                  }

                  IiiIllilliiIllil var22 = new IiiIllilliiIllil((int)(var37 >>> 32), (int)var37, (int)(var33 >>> 32), var19);
                  if ((int)var31 != 0) {
                     var22.IilliliilIIi(true);
                     if (var7 == lllIllillIll.IlllIIIillllIIIi) {
                        String var23 = var22.lliliilili();
                        if (!var23.equals(var17)) {
                           var22.Iiililiili(var23);
                           var17 = var23;
                        }
                     }
                  }

                  var22.iIIiIlIlIiIl(var7 == this.IiliIiilil.lIiiIiIlilli());
                  var39 ^= ((long)(this.IiliIiilil.IlIlllIlilIl(var19.IilliliilIIi()) && (int)var27 == 0 ? 1 : 0) ^ var39) & -1L >>> 32;
                  if (this.IiliIiilil.IlIlllIlilIl(var19.IilliliilIIi()) && (int)var39 == 0) {
                     this.IiliIiilil.IIIllIIliIIl(var19.IilliliilIIi(), false);
                  }

                  if ((int)var39 != 0) {
                     var27 ^= (1L ^ var27) & -1L >>> 32;
                  }

                  var22.IiIiIlliIiIl((boolean)((int)var39));
                  var9.add(var22);
                  if ((int)var31 != 0) {
                     var33 ^= ((long)((int)var33 + var22.iiiliIIIii() + 4) ^ var33) & -1L >>> 32;
                  } else {
                     var41 ^= ((long)((int)var35 % 2 == 0 ? 1 : 0) << 32 ^ var41) & -1L << 32;
                     if ((int)(var41 >>> 32) != 0) {
                        var33 ^= ((long)((int)var33 + var22.iiiliIIIii() + 4) ^ var33) & -1L >>> 32;
                     } else {
                        var35 ^= ((long)((int)(var35 >>> 32) + var22.iiiliIIIii() + 4) << 32 ^ var35) & -1L << 32;
                     }
                  }
               }

               this.IIliIiilil.put(var7, var9);
            }

            this.IlliIiilil = Iiliililliliilil.llllllllil != null ? new iIlllIllll(Iiliililliliilil.llllllllil) : null;
            this.llliIiilil = new illiIlllIiliIlll();
            if (this.illiIiilil != null) {
               this.illiIiilil.Ililllililil();
            }

            this.illiIiilil = new illliiiIilliii(llIlIIIiilIlIIIi.IlIlllIlilIl(this.IiliIiilil.iIlIlllllill(lllIllillIll.lIllIIIiiIllIIIi)));
            this.IilliliilIIi();
            this.iIlIliilil = this.field_22789;
            this.IllIliilil = this.field_22790;
            if (this.IIlIliilil != null) {
               lllIllillIll var43 = this.IIlIliilil.iliIiiliiiii();
               if (this.IiliIiilil.lIiiIiIlilli() != var43) {
                  this.iIlIlllllill(var43);
               }

               if (var43 == lllIllillIll.lIllIIIiiIllIIIi) {
                  this.illiIiilil.liiiIIllIl(this.IIlIliilil);
               }

               for (IiiIllilliiIllil var45 : this.IIIllIIliIIl()) {
                  if (var45.liilIliiilIl() == this.IIlIliilil) {
                     var45.iIIiIlIlIiIl(true);
                     var45.IiIilliIil();
                     break;
                  }
               }

               this.IIlIliilil = null;
            }
         }
      }
   }

   private static float lIiiIiIlilli(float t, float back) {
      float var2 = Illillliilli(t) - 1.0F;
      return 1.0F + (back + 1.0F) * var2 * var2 * var2 + back * var2 * var2;
   }

   private void IlIllllIll(double sv) {
      long var22 = 380314878624341787L;
      long var24 = 902384520478895554L;
      long var26 = 1145381160476448654L;
      long var28 = -1852249419225138167L;
      long var30 = 3775803850616925267L;
      var22 ^= ((long)((this.field_22790 - 360) / 2) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)((this.field_22789 - 620) / 2) ^ var22) & -1L >>> 32;
      var24 ^= ((long)((int)var22 + this.liliIiilil + 12) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)(var22 >>> 32) + 6 + 28 + 4 + 0) ^ var24) & -1L >>> 32;
      var26 ^= ((long)(620 - this.liliIiilil - 18 - 0) << 32 ^ var26) & -1L << 32;
      if (this.IIlllIlliIll()) {
         this.illiIiilil.lIiiIiIlilli((int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32), this.lilIliilIl());
      } else {
         var26 ^= ((long)this.lIlIliIlIl() ^ var26) & -1L >>> 32;
         var28 ^= ((long)((int)var26 != 0 ? (int)(var26 >>> 32) : ((int)(var26 >>> 32) - 4) / 2) << 32 ^ var28) & -1L << 32;
         List var10 = this.IIIllIIliIIl();
         double var11 = (double)((int)var24) - sv;
         double var13 = (double)((int)var24) - sv;
         var28 ^= (0L ^ var28) & -1L >>> 32;

         for (IiiIllilliiIllil var17 : var10) {
            if (var17.IIIiIllIIiIl()) {
               double var19;
               if ((int)var26 != 0) {
                  var30 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var30) & -1L << 32;
                  var19 = var11;
               } else {
                  long var40 = var30 ^ ((long)((int)var28 % 2 == 0 ? 1 : 0) ^ var30) & -1L >>> 32;
                  var30 = var40 ^ ((long)((int)var40 != 0 ? (int)(var24 >>> 32) : (int)(var24 >>> 32) + (int)(var28 >>> 32) + 4) << 32 ^ var40) & -1L << 32;
                  var19 = (int)var30 != 0 ? var11 : var13;
               }

               var17.llliiillii((int)(var30 >>> 32), var19, (int)(var28 >>> 32));
               if ((int)var26 != 0) {
                  var11 += var17.IlIiillIii() + 4.0;
               } else {
                  var30 ^= ((long)((int)var28 % 2 == 0 ? 1 : 0) ^ var30) & -1L >>> 32;
                  if ((int)var30 != 0) {
                     var11 += var17.IlIiillIii() + 4.0;
                  } else {
                     var13 += var17.IlIiillIii() + 4.0;
                  }
               }

               var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
            }
         }
      }
   }

   private void IllIllllIl() {
      long var6 = -1916238750734364693L;
      long var8 = 1958300738772072547L;
      lllIllillIll var1 = this.IiliIiilil.lIiiIiIlilli();
      var6 ^= (-4294967296L ^ var6) & -1L << 32;
      var6 ^= (0L ^ var6) & -1L >>> 32;
      if (!Iilililiiili(var1)) {
         List var4 = this.IIliIiilil.get(var1);
         var6 ^= ((long)(var4 == null ? 0 : var4.size()) << 32 ^ var6) & -1L << 32;

         for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)(var6 >>> 32); var12 += 4294967296L) {
            if (((IiiIllilliiIllil)var4.get((int)(var12 >>> 32))).liilIliiilIl().IliIlllilIi()) {
               var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32;
            }
         }
      }

      this.iIliIiilil.iIlIlllllill(var1, (int)(var6 >>> 32), (int)var6, this.iiIIlIIlIl(), this.IliIliilil.size());
   }

   private boolean Illlllllilll() {
      if (this.IlIlllIlilIl()) {
         return this.IlliIiilil.IIIllIIliIIl();
      } else if (this.IiIlliIliiIl()) {
         return this.llliIiilil.iliIiiliiiii();
      } else {
         for (IiiIllilliiIllil var2 : this.IIIllIIliIIl()) {
            if (var2.lIiiIiIlilli()) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean liIlliiIll() {
      return ilIIliilil;
   }

   public void method_25394(class_332 delta, int my, int mx, float ctx) {
      IliiIilliiIi.iiIIlIIlIl();

      try {
         this.Ililllililil(delta, my, mx, ctx);
      } finally {
         IliiIilliiIi.lIlIliIlIl();
      }
   }

   private boolean IiIlliIliiIl() {
      return !this.iiIIlIIlIl() && this.llliIiilil != null && this.IiliIiilil.lIiiIiIlilli() == lllIllillIll.IlllIIIillllIIIi;
   }

   public boolean method_25401(double my, double vAmt, double mx, double hAmt) {
      IIIiIillIIiIil.IIllllIlll();
      if (this.Iiiiliiiiiii()) {
         return true;
      } else if (iIIlIllIlIlIll.iilIiIIiIi(hAmt)) {
         return true;
      } else {
         my = this.iIIIlIlIIl(my);
         double var9 = this.llIIlilIIl(vAmt);
         if (this.IlIlllIlilIl() || this.IiIlliIliiIl()) {
            this.iiliIiilil -= (int)(hAmt * 28.0);
            this.iiliIiilil = Math.max(0, Math.min(this.iiliIiilil, this.IIiIllIiIl()));
            return true;
         } else if (this.IIlllIlliIll()) {
            this.illiIiilil.Illlllllilll(my, var9, hAmt);
            return true;
         } else if (!this.Illlllllilll()) {
            for (IiiIllilliiIllil var15 : this.IIIllIIliIIl()) {
               if (var15.Iliilliiilii(my, var9, hAmt)) {
                  return true;
               }
            }

            this.iiliIiilil -= (int)(hAmt * 28.0);
            this.iiliIiilil = Math.max(0, Math.min(this.iiliIiilil, this.IIiIllIiIl()));
            return true;
         } else {
            for (IiiIllilliiIllil var12 : this.IIIllIIliIIl()) {
               var12.Iliilliiilii(my, var9, hAmt);
            }

            return true;
         }
      }
   }

   private void iIlIlllllill(lllIllillIll c) {
      if (this.iiIIlIIlIl()) {
         this.iIliIiilil.IIiilIiiiIii().IiIiliIiiiIi("");
         this.IliiIiilil = "";
         this.IiIIlliIIl("");
      }

      if (c != this.IiliIiilil.lIiiIiIlilli()) {
         if (this.llliIiilil != null) {
            this.llliIiilil.Iiiiliiiiiii();
         }

         if (this.illiIiilil != null) {
            this.illiIiilil.IIillIiliIil();
         }

         this.IiliIiilil.iliIiiliiiii(c);
         this.iiliIiilil = 0;
         this.IIiiIiilil = 0.0;
         this.IIliIiilil.forEach((cx, cat) -> cat.forEach(cxx -> {
               if (cxx.llIiIlilIiIl()) {
                  cxx.IiIiIlliIiIl(false);
                  cxx.liIiiiiIii();
                  this.IiliIiilil.IIIllIIliIIl(cxx.liilIliiilIl().IilliliilIIi(), false);
               }

               cxx.iIIiIlIlIiIl(cx == c);
            }));
         this.IilliliilIIi();
      }
   }

   private boolean IIIIllIIIl() {
      long var4 = 8850047395811688909L;
      if (!this.iIliIiilil.IIiilIiiiIii().IIlilIliiIli() && !this.Illlllllilll()) {
         if (!this.iiIIlIIlIl()) {
            lllIllillIll var1 = this.IiliIiilil.lIiiIiIlilli();
            if (var1 == lllIllillIll.illlIIIiIillIIIi || var1 == lllIllillIll.IIilIIIilIilIIIi) {
               return false;
            }
         }

         for (IiiIllilliiIllil var2 : this.IIIllIIliIIl()) {
            if (var2.IIIllIIliIIl() || var2.IIIIIllIIIIl()) {
               return false;
            }
         }

         if (this.llliIiilil == null || !this.llliIiilil.IIIllIIliIIl() && !this.llliIiilil.IlIlllIlilIl()) {
            long var7 = ilIllIiIll.Iiiilllliiilll.method_22683().method_4490();

            for (long var8 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var8 >>> 32) < 3; var8 += 4294967296L) {
               if (GLFW.glfwGetMouseButton(var7, (int)(var8 >>> 32)) == 1) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private List<IiiIllilliiIllil> IIIllIIliIIl() {
      if (this.iiIIlIIlIl()) {
         return this.IliIliilil;
      } else if (this.IIlllIlliIll()) {
         return this.illiIiilil.IliIlllilIi();
      } else {
         List var1 = this.IIliIiilil.get(this.IiliIiilil.lIiiIiIlilli());
         return var1 != null ? var1 : List.of();
      }
   }

   private void iliIiiliiiii(IiiIllilliiIllil keep) {
      this.IIliIiilil.values().forEach(keepx -> keepx.forEach(keepxx -> {
            if (keepxx != keep && keepxx.llIiIlilIiIl()) {
               keepxx.IiIiIlliIiIl(false);
               this.IiliIiilil.IIIllIIliIIl(keepxx.liilIliiilIl().IilliliilIIi(), false);
            }
         }));
   }

   private void Ililllililil(class_332 ctx, int delta, int mx, float my) {
      long var64 = 8659040659833872106L;
      long var80 = -6007712807937334516L;
      long var66 = 1779799361443726391L;
      long var68 = -1620559488093385879L;
      long var70 = -1706422911755020905L;
      long var72 = -3923014998173483826L;
      long var74 = 8563295885244522820L;
      long var60 = -7795478892253262688L;
      long var76 = -6453263952324270340L;
      long var62 = -3143758526086654868L;
      long var78 = 6538145614216291095L;
      long var5 = System.nanoTime();
      var60 ^= ((long)IIlliiillIlliiil.iliillIiil << 32 ^ var60) & -1L << 32;
      llIilillilIilill.IliIlllilIi();
      IlIIilIlllIIilIl.IilliliilIIi();
      if (!lllIliilil) {
         lllIliilil = true;
      }

      CorzClient.fontManager.iIlIlllllill(this.lIIIliilil);
      IIIiiIillIIiiIil.IliIlllilIi(this.lIIIliilil);
      IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
      if (!this.IlIIliilil && Math.abs(this.iIIIliilil.IiIlliIliiIl() - 1.0) > 0.01) {
         this.iIIIliilil.lIiiIiIlilli(1.0);
      }

      float var8 = (float)this.iIIIliilil.iIlIlllllill();
      var60 ^= ((long)iIIlIllIlIlIll.iliIiiliiiii() ^ var60) & -1L >>> 32;
      if ((int)var60 != 0) {
         iIIlIllIlIlIll.Ilillllill(ctx);
      }

      if (!this.IlIIliilil || !(var8 < 0.006F)) {
         var62 ^= ((long)((this.field_22789 - 620) / 2) << 32 ^ var62) & -1L << 32;
         var62 ^= ((long)((this.field_22790 - 360) / 2) ^ var62) & -1L >>> 32;
         if (this.IIIIliilil.liiiIIllIl()) {
            this.llIIliilil = true;
            if ((int)var60 != 0) {
               iIIlIllIlIlIll.ilillIiill((float)((int)(var62 >>> 32)), (float)((int)var62), 620.0F, 360.0F, 12.0F, 1.0F, 1.0F, true);
            }

            this.IIIIliilil.iIlIlllllill(ctx, (int)(var62 >>> 32), (int)var62, 620, 360, 12);
         } else {
            if (this.llIIliilil) {
               this.llIIliilil = false;
               this.IilliliilIIi();
               IIIiIillIIiIil.lllllillll();
            }

            this.IIIilIIiiIIi((int)(var62 >>> 32), (int)var62);
            float var12;
            float var13;
            float var14;
            float var15;
            if (this.IlIIliilil) {
               float var16 = (int)var60 != 0 ? (float)Math.cbrt((double)var8) : 0.0F;
               float var17 = (int)var60 != 0 ? Illillliilli((var16 - 0.22F) / 0.78F) : Illillliilli((var8 - 0.3F) / 0.7F);
               var13 = Illillliilli(var17 * 1.9F);
               var14 = IIlilIliiIli(Illillliilli((var17 - 0.12F) / 0.88F));
               var12 = IIlilIliiIli((int)var60 != 0 ? Illillliilli(var16 / 0.75F) : Illillliilli(var8 / 0.3F));
               var15 = 0.96F + 0.04F * var17;
            } else {
               float var156 = IIlilIliiIli(var8);
               var12 = var156;
               var13 = Illillliilli(var156 * 1.9F);
               var14 = IIlilIliiIli(Illillliilli((var156 - 0.12F) / 0.88F));
               var15 = 0.96F + 0.04F * var156;
            }

            this.iiIIliilil = var15;
            delta = (int)Math.round(this.iIIIlIlIIl((double)delta));
            mx = (int)Math.round(this.llIIlilIIl((double)mx));
            if ((int)var60 != 0) {
               iIIlIllIlIlIll.ilillIiill((float)((int)(var62 >>> 32)), (float)((int)var62), 620.0F, 360.0F, 12.0F, var15, var13, false);
            }

            IIIiIillIIiIil.iliIiiliiiii(
               this.field_22789,
               this.field_22790,
               var12,
               delta,
               mx,
               (int)var60 == 0,
               ilIllIiIll.Iiiilllliiilll.field_1755 == this,
               this.IIIIllIIIl(),
               !this.Illlllllilll(),
               (int)(var62 >>> 32),
               (int)var62,
               620,
               360
            );
            GpuTextureView var157 = null;
            var64 ^= ((long)(IilIIIIililIIIIi.liiiIIllIl() && Iiliililliliilil.lIlillllil ? 1 : 0) << 32 ^ var64) & -1L << 32;
            if ((int)var60 == 0 && !liIIliilil && (int)(var64 >>> 32) != 0 && var12 > 0.02F) {
               try {
                  var157 = this.Iliilliiilii();
               } catch (Throwable var149) {
                  liIIliilil = true;
               }
            }

            var64 ^= ((long)(IilIIIIililIIIIi.liiiIIllIl() ? 46 : 145) ^ var64) & -1L >>> 32;
            if ((int)var60 != 0) {
               iIIlIllIlIlIll.liilliiill(var12, (int)var64);
               iIIlIllIlIlIll.IIIillIIil((int)(var64 >>> 32) != 0 && var12 > 0.02F);
            } else if (var12 > 0.001F) {
               IIIiiIillIIiiIil.lIiiIiIlilli(ctx, 0, 0, this.field_22789, this.field_22790, 0, (int)(var12 * (float)((int)var64)) << 24);
            }

            float var19 = (float)this.field_22789 / 2.0F;
            float var20 = (float)this.field_22790 / 2.0F;
            this.lIIIliilil.method_22903();
            this.lIIIliilil.method_46416(var19, var20, 0.0F);
            this.lIIIliilil.method_22905(var15, var15, 1.0F);
            this.lIIIliilil.method_46416(-var19, -var20, 0.0F);
            ctx.method_51448().pushMatrix();
            ctx.method_51448().translate(var19, var20);
            ctx.method_51448().scale(var15, var15);
            ctx.method_51448().translate(-var19, -var20);
            var66 ^= ((long)((int)(var62 >>> 32) + this.liliIiilil + 12) << 32 ^ var66) & -1L << 32;
            var66 ^= ((long)((int)var62 + 6 + 28 + 4) ^ var66) & -1L >>> 32;
            var68 ^= ((long)(620 - this.liliIiilil - 18) << 32 ^ var68) & -1L << 32;
            var68 ^= (316L ^ var68) & -1L >>> 32;

            try {
               float var25 = IliiIilliiIi.IilliliilIIi(var13);

               try {
                  if (var157 != null) {
                     try {
                        float var26 = (float)this.field_22789;
                        float var27 = (float)this.field_22790;
                        float var28 = (float)((int)(var62 >>> 32)) / var26;
                        float var29 = (float)((int)(var62 >>> 32) + 620) / var26;
                        float var30 = 1.0F - (float)((int)var62) / var27;
                        float var31 = 1.0F - (float)((int)var62 + 360) / var27;
                        IliiIilliiIi.Iiiiliiiiiii(
                           this.lIIIliilil.method_23760().method_23761(),
                           (float)((int)(var62 >>> 32)),
                           (float)((int)var62),
                           (float)((int)(var62 >>> 32) + 620),
                           (float)((int)var62 + 360),
                           var28,
                           var30,
                           var29,
                           var31,
                           var157,
                           12.0F,
                           1.0F
                        );
                     } catch (Throwable var148) {
                        liIIliilil = true;
                     }
                  }

                  if ((int)var60 == 0) {
                     iilIIiIIiIIi.IilliliilIIi((int)(var62 >>> 32), (int)var62, 620, 360, 12, this.field_22789, this.field_22790, delta, mx);
                  }

                  IIIiiIillIIiiIil.IIillIiliIil(ctx, (int)(var62 >>> 32), (int)var62, 620, 360, 12, IilIIIIililIIIIi.iIlIlllllill(), 352321535);
                  if (!IilIIIIililIIIIi.liiiIIllIl()) {
                     IIiIllIllIiIllIl.IliIlllilIi(ctx, (int)(var62 >>> 32) + 6, (int)var62 + 6, this.liliIiilil, 348, 7, IilIIIIililIIIIi.IilliliilIIi());
                     float var158 = (float)((int)(var62 >>> 32) + 6 + this.liliIiilil);
                     float var160 = (float)(608 - this.liliIiilil);
                     IIiIllIllIiIllIl.liiiIIllIl(ctx, var158, (float)((int)var62 + 6), var160, 348.0F, 7.0F, IilIIIIililIIIIi.lIiiIiIlilli());
                  }
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var25);
               }

               this.IIiilIiiiIii(ctx, (int)(var62 >>> 32), (int)var62, var13);
               if ((int)var60 == 0) {
                  iilIIiIIiIIi.lIiiIiIlilli((int)(var62 >>> 32), (int)var62, 620, 360, var13);
               }

               float var159 = IliiIilliiIi.IilliliilIIi(var14);

               try {
                  this.lIliIiilil.IiIiliIiiiIi(ctx, delta, mx, my);
                  String var161 = this.iIliIiilil.Iilililiiili();
                  if (!var161.equals(this.IliiIiilil)) {
                     this.IiIIlliIIl(var161);
                     this.IliiIiilil = var161;
                  }

                  this.IllIllllIl();
                  this.iIliIiilil.IilliliilIIi(ctx, delta, mx, my);

                  for (IiiIllilliiIllil var164 : this.IIIllIIliIIl()) {
                     if (var164.IIIiIllIIiIl()) {
                        var164.ilIiiIiIii();
                     }
                  }

                  this.iiliIiilil = Math.max(0, Math.min(this.iiliIiilil, this.IIiIllIiIl()));
                  this.IIiiIiilil = IiiIIIIlliiIIIIl.iIlIlllllill(this.IIiiIiilil, (double)this.iiliIiilil, 18.0, llIilillilIilill.liiiIIllIl());
                  if (Math.abs(this.IIiiIiilil - (double)this.iiliIiilil) < 0.05) {
                     this.IIiiIiilil = (double)this.iiliIiilil;
                  }

                  this.IIiiIiilil = Math.max(0.0, Math.min(this.IIiiIiilil, (double)this.IIiIllIiIl()));
                  double var163 = IiiIllilliiIllil.IIliilIlii(this.IIiiIiilil);
                  var70 ^= ((long)((int)Math.floor(var163)) << 32 ^ var70) & -1L << 32;
                  this.iliiIiilil = (float)(var163 - (double)((int)(var70 >>> 32)));
                  this.IlIllllIll(var163);
                  var70 ^= ((long)(!this.IlIlllIlilIl() && !this.IiIlliIliiIl() ? 0 : 1) ^ var70) & -1L >>> 32;
                  var72 ^= ((long)((int)var70 != 0 ? 0 : (int)Math.ceil(Math.max(0.0, 3.0 - var163))) << 32 ^ var72) & -1L << 32;
                  var72 ^= ((long)((int)var70 != 0 ? 0 : (int)Math.ceil(Math.max(0.0, 3.0 - ((double)this.IIiIllIiIl() - var163)))) ^ var72) & -1L >>> 32;
                  ctx.method_44379(
                     (int)(var66 >>> 32) - 3,
                     (int)var66 - (int)(var72 >>> 32),
                     (int)(var66 >>> 32) + (int)(var68 >>> 32) + 3,
                     (int)var66 + (int)var68 + (int)var72
                  );
                  double var34 = (double)(System.nanoTime() - this.lliiIiilil) / 1000000.0;

                  try {
                     if (!this.Illlllllilll()) {
                        var74 ^= ((long)(this.IIillIiliIil((double)delta, (double)mx) ? delta : (int)(var66 >>> 32) - 2000) << 32 ^ var74) & -1L << 32;
                        if (!this.IlIlllIlilIl() && !this.IiIlliIliiIl()) {
                           if (this.IIlllIlliIll()) {
                              this.illiIiilil.iliIiiliiiii(ctx, (int)(var66 >>> 32), (int)var66, (int)(var68 >>> 32), (int)var68, (int)(var74 >>> 32), mx, my);
                           } else {
                              var78 ^= ((long)this.lIlIliIlIl() << 32 ^ var78) & -1L << 32;
                              long var166 = System.nanoTime();

                              for (IiiIllilliiIllil var41 : this.IIIllIIliIIl()) {
                                 if (var41.IIIiIllIIiIl()) {
                                    float var42 = 1.0F;
                                    float var43 = 1.0F;
                                    float var44 = 0.0F;
                                    var78 ^= (1L ^ var78) & -1L >>> 32;
                                    if (var41.IillIllillIl() != 0L) {
                                       double var46 = (double)(var166 - var41.IillIllillIl()) / 1000000.0;
                                       if (var46 < 260.0) {
                                          var80 ^= ((long)var41.iillIlIIilIl() << 32 ^ var80) & -1L << 32;
                                          float var49 = (float)Math.max(0.0, var46 / 260.0);
                                          float var50 = var46 <= 0.0 ? 0.0F : IIlilIliiIli(Illillliilli((float)(var46 / 150.0)));
                                          var42 = (int)(var80 >>> 32) != 0 ? var50 : 0.55F + 0.45F * var50;
                                          if ((int)(var78 >>> 32) == 0) {
                                             float var51 = (int)(var80 >>> 32) != 0 ? 0.9F : 0.965F;
                                             var43 = var51 + (1.0F - var51) * lIiiIiIlilli(var49, (int)(var80 >>> 32) != 0 ? 1.9F : 1.1F);
                                             if ((int)(var80 >>> 32) != 0) {
                                                var44 = (1.0F - var50) * 0.5F * Illillliilli((float)(var34 / 70.0));
                                             }
                                          }

                                          var78 ^= ((long)(var49 > 0.6F ? 1 : 0) ^ var78) & -1L >>> 32;
                                       }
                                    }

                                    if (!(var42 <= 0.002F) || !(var44 <= 0.004F)) {
                                       double var168 = var41.iIllIlIlllIl();
                                       double var48 = var41.IlIiillIii();
                                       float var169 = (float)Math.min(
                                          var168 + var48 - (double)((int)var66 - (int)(var72 >>> 32)), (double)((int)var66 + (int)var68 + (int)var72) - var168
                                       );
                                       if (!(var169 <= 0.0F)) {
                                          float var170 = Illillliilli(var169 / 14.0F);
                                          float var52 = var41.IIllIllIllIl();
                                          this.IlIillIiilIi(ctx, var52);
                                          if (Math.abs(var43 - 1.0F) > 5.0E-4F) {
                                             float var53 = (float)var41.lIilIliIilIl() + (float)var41.IlilIlllilIl() / 2.0F;
                                             float var54 = (float)(Math.floor(var168) + Math.min(var48, (double)var41.Iiliililii()) / 2.0);
                                             this.lIIIliilil.method_46416(var53, var54, 0.0F);
                                             this.lIIIliilil.method_22905(var43, var43, 1.0F);
                                             this.lIIIliilil.method_46416(-var53, -var54, 0.0F);
                                             ctx.method_51448().translate(var53, var54);
                                             ctx.method_51448().scale(var43, var43);
                                             ctx.method_51448().translate(-var53, -var54);
                                          }

                                          if (var44 > 0.004F) {
                                             float var171 = IliiIilliiIi.IilliliilIIi(var44 * var170);

                                             try {
                                                IIiIllIllIiIllIl.IlIlllIlilIl(
                                                   ctx,
                                                   (float)var41.lIilIliIilIl(),
                                                   (float)Math.floor(var168),
                                                   (float)var41.IlilIlllilIl(),
                                                   (float)var48,
                                                   7.0F,
                                                   0.0,
                                                   0.0,
                                                   0.0
                                                );
                                             } finally {
                                                IliiIilliiIi.lIiiIiIlilli(var171);
                                             }
                                          }

                                          float var172 = IliiIilliiIi.IilliliilIIi(var42 * var170);
                                          IiiIllilliiIllil.IIlilIliiIli(
                                             (int)Math.floor((double)((float)((int)var66 - (int)(var72 >>> 32)) - var52)) - 16,
                                             (int)Math.ceil((double)((float)((int)var66 + (int)var68 + (int)var72) - var52)) + 16
                                          );

                                          try {
                                             if (var42 > 0.002F) {
                                                var41.Iilililiiili(
                                                   ctx,
                                                   (int)var78 != 0 ? (int)(var74 >>> 32) : (int)(var66 >>> 32) - 2000,
                                                   (int)Math.floor((double)((float)mx - var52)),
                                                   my
                                                );
                                             }
                                          } finally {
                                             IiiIllilliiIllil.Illillliilli();
                                             IliiIilliiIi.lIiiIiIlilli(var172);
                                             this.IiIiliIiiiIi(ctx);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        } else {
                           float var37 = IIlilIliiIli(Illillliilli((float)(var34 / 140.0)));
                           if (var37 > 0.002F) {
                              float var38 = -this.iliiIiilil;
                              var74 ^= ((long)((int)(var68 >>> 32) - 0) ^ var74) & -1L >>> 32;
                              this.IlIillIiilIi(ctx, var38);
                              float var40 = IliiIilliiIi.IilliliilIIi(var37);

                              try {
                                 var76 ^= ((long)((int)var66 + 0 - (int)(var70 >>> 32)) << 32 ^ var76) & -1L << 32;
                                 var76 ^= ((long)((int)Math.floor((double)((float)mx - var38))) ^ var76) & -1L >>> 32;
                                 if (this.IlIlllIlilIl()) {
                                    this.IlliIiilil.IiIlliIliiIl(ctx, (int)(var66 >>> 32), (int)(var76 >>> 32), (int)var74, (int)(var74 >>> 32), (int)var76);
                                 } else {
                                    this.llliIiilil.IiIlliIliiIl(ctx, (int)(var66 >>> 32), (int)(var76 >>> 32), (int)var74, (int)(var74 >>> 32), (int)var76);
                                 }
                              } finally {
                                 IliiIilliiIi.lIiiIiIlilli(var40);
                                 this.IiIiliIiiiIi(ctx);
                              }
                           }
                        }
                     }
                  } finally {
                     ctx.method_44380();
                  }

                  this.iiiIlIIIll(ctx, (int)(var66 >>> 32), (int)var66, (int)(var68 >>> 32), (int)var68, delta, mx);
                  if ((int)var60 == 0) {
                     lIliIllliIliIlll.IilliliilIIi((int)(var62 >>> 32), (int)var62, 620, 360, 12, this.field_22789, delta, mx);
                  }

                  if ((int)var60 == 0) {
                     iilIIiIIiIIi.iliIiiliiiii((int)(var62 >>> 32), (int)var62, 620, 360, 12, this.field_22789, this.field_22790, delta, mx);
                  } else {
                     iilIIiIIiIIi.iIlIlllllill();
                  }

                  if ((int)var60 == 0) {
                     IIIiIillIIiIil.ilIllIiIll(ctx, (int)(var62 >>> 32), (int)var62, 620, this.field_22789, this.field_22790);
                  }

                  if (this.IlIlllIlilIl()) {
                     this.IlliIiilil.IlIlllIlilIl(ctx);
                  } else if (this.IiIlliIliiIl()) {
                     this.llliIiilil.IIlllIlliIll(ctx);
                  } else {
                     if (this.IIlllIlliIll()) {
                        this.illiIiilil.IIIllIIliIIl(ctx);
                     }

                     for (IiiIllilliiIllil var165 : this.IIIllIIliIIl()) {
                        var165.iliIiiliiiii(ctx);
                     }
                  }

                  this.lIliIiilil
                     .IiiIlliiIl(
                        ctx,
                        this.Illlllllilll(),
                        this.IIlllIlliIll() ? (float)((int)(var66 >>> 32)) + IiIlIllliIlIll.IiIlliIliiIl() : (float)((int)(var66 >>> 32))
                     );
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var159);
               }
            } finally {
               ctx.method_51448().popMatrix();
               this.lIIIliilil.method_22909();
            }

            if ((int)var60 == 0) {
               IIIiIillIIiIil.IlIllllIll(ctx, this.field_22789, this.field_22790, var13, this.iiIIliilil);
            }

            if ((int)var60 != 0) {
               iIIlIllIlIlIll.llIililIil(ctx);
            }

            super.method_25394(ctx, delta, mx, my);
            if ((int)var60 != 0) {
               iIIlIllIlIlIll.iIIilIlIil();
            } else {
               Iliiiiilliiiii.IliIlllilIi().IilliliilIIi(ctx);
            }

            IliiIilliiIi.lilIliilIl();
            Iiilliiliiil(var5, (int)(var60 >>> 32));
         }
      } else if (!iIIlIllIlIlIll.IIllllIlll()) {
         this.ilIllIiIll();
      }
   }

   private void IiIiliIiiiIi(class_332 ctx) {
      ctx.method_51448().popMatrix();
      this.lIIIliilil.method_22909();
   }

   private static void Iiilliiliiil(long p0, int t0) {
      long var8 = 2932295467807687963L;
      long var3 = System.nanoTime() - p0;
      var8 ^= ((long)(IIlliiillIlliiil.iliillIiil - t0) << 32 ^ var8) & -1L << 32;
      illIliilil++;
      iilIliilil += var3;
      IilIliilil += (int)(var8 >>> 32);
      if (var3 > IIiIliilil) {
         IIiIliilil = var3;
      }

      if ((int)(var8 >>> 32) > lilIliilil) {
         lilIliilil = (int)(var8 >>> 32);
      }

      long var6 = System.currentTimeMillis();
      if (lIiIliilil == 0L) {
         lIiIliilil = var6;
      }

      if (var6 - lIiIliilil >= 5000L) {
         illIliilil = 0;
         iilIliilil = 0L;
         IilIliilil = 0;
         IIiIliilil = 0L;
         lilIliilil = 0;
         lIiIliilil = var6;
      }
   }

   private IiiIllilliiIllil Iilllilliill() {
      for (IiiIllilliiIllil var2 : this.IIIllIIliIIl()) {
         if (var2.lIiiIiIlilli()) {
            return var2;
         }
      }

      return null;
   }

   private boolean iiIIlIIlIl() {
      return !this.iIiIliilil.isEmpty();
   }

   private double iIIIlIlIIl(double x) {
      return (double)this.field_22789 / 2.0 + (x - (double)this.field_22789 / 2.0) / (double)this.iiIIliilil;
   }

   public lillliiliillliil(ilIllIiIll confirmModule) {
      this();
      this.IIlIliilil = confirmModule;
   }

   private void IiiIlliiIl(double thumbH, int thumbTop, int trackTop, int trackH) {
      long var9 = -9101179405522797273L;
      var9 ^= ((long)this.IIiIllIiIl() << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) <= 0) {
         this.iiliIiilil = 0;
      } else {
         double var7 = Math.max(0.0, Math.min(1.0, (thumbH - (double)thumbTop) / (double)(trackTop - trackH)));
         this.iiliIiilil = (int)Math.round(var7 * (double)((int)(var9 >>> 32)));
      }
   }

   public lillliiliillliil() {
      super(class_2561.method_43470(IliIlllilIi<"IliIlllilIi","xpIoZI/KewcY3mCavt9Yalm29gHEgSmrI5y65PDwFbZawWZ0Sps=">()));
      this.liliIiilil = 128;
      this.iiliIiilil = 0;
      this.IIiiIiilil = 0.0;
      this.lIiiIiilil = false;
      this.iIiiIiilil = 0.0;
      this.IliiIiilil = "";
      this.lliiIiilil = System.nanoTime();
      this.iliiIiilil = 0.0F;
      this.IiiiIiilil = 0.0F;
      this.liiiIiilil = 0.0;
      this.iiiiIiilil = System.nanoTime();
      this.IIIIliilil = new illilIiIililIi();
      this.lIIIliilil = new class_4587();
      this.iIIIliilil = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 220, 0.0);
      this.IlIIliilil = false;
      this.llIIliilil = false;
      this.iiIIliilil = 1.0F;
      this.IIlIliilil = null;
      this.lIlIliilil = false;
      this.iIlIliilil = -1;
      this.IllIliilil = -1;
      this.iIiIliilil = "";
      this.IliIliilil = new ArrayList<>();
      iilIllIiIIiIllIi.IilliliilIIi();
      lIliIllliIliIlll.iIlIlllllill();
      iilIIiIIiIIi.iIlIlllllill();
      IIIiIillIIiIil.iIlIlllllill();
   }

   public boolean method_25403(class_11909 offsetY, double offsetX, double click) {
      long var15 = -5945888850730539366L;
      IIIiIillIIiIil.IIllllIlll();
      if (this.Iiiiliiiiiii()) {
         return true;
      } else if (iIIlIllIlIlIll.lllIiillIi(offsetY.method_74245(), offsetX, click)) {
         return true;
      } else {
         double var6 = this.iIIIlIlIIl(offsetY.comp_4798());
         double var8 = this.llIIlilIIl(offsetY.comp_4799());
         var15 ^= ((long)offsetY.method_74245() << 32 ^ var15) & -1L << 32;
         if (this.lIiiIiilil) {
            int[] var17 = this.lliIliliIl();
            if (var17 != null) {
               this.IiiIlliiIl(var8 - this.iIiiIiilil, var17[1], var17[2], var17[5]);
               this.IIiiIiilil = (double)this.iiliIiilil;
            }

            return true;
         } else if (this.IIlllIlliIll()) {
            this.illiIiilil.IiIlliIliiIl(var6, var8, (int)(var15 >>> 32));
            return true;
         } else if (this.IlIlllIlilIl()) {
            this.IlliIiilil.iiIIlIIlIl(var6, var8 + (double)this.iliiIiilil, (int)(var15 >>> 32));
            return true;
         } else if (this.IiIlliIliiIl()) {
            this.llliIiilil.Illillliilli(var6, var8 + (double)this.iliiIiilil, (int)(var15 >>> 32));
            return true;
         } else {
            double var11 = var8;

            for (IiiIllilliiIllil var14 : this.IIIllIIliIIl()) {
               var14.Iiiiliiiiiii(var6, var11, (int)(var15 >>> 32));
            }

            return this.Illlllllilll();
         }
      }
   }

   private void IIIilIIiiIIi(int py, int px) {
      long var4 = 7399159471314990811L;
      this.lIliIiilil.iIlIlllllill();
      var4 ^= ((long)this.lIliIiilil.liiiIIllIl() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != this.liliIiilil) {
         this.liliIiilil = (int)(var4 >>> 32);
         this.iIliIiilil.liiiIIllIl(py + this.liliIiilil + 12, 620 - this.liliIiilil - 18);
      }
   }
}
