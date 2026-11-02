package gg.corz;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.IntConsumer;
import net.minecraft.class_332;

public final class liiiliiliiiiliil {
   private static final float lIIllIIiil = 7.0F;
   private float iliilIIiil;
   private static final float llIllIIiil = 0.78F;
   private int IIlIiIIiil;
   private float IiiIiIIiil;
   private final iiIiIlIIliIl lIIilIIiil;
   private String iliIiIIiil;
   private float[] illIiIIiil;
   public static final int iilIlIIiil = 3;
   private final iiiilIIiIIIIiIIi llIilIIiil;
   private boolean iIiilIIiil;
   private long lllilIIiil;
   private static final float iiiIlIIiil = 7.0F;
   private int lIlIiIIiil;
   private final iIIiliiIlIilii iIIilIIiil;
   private final lIIIIiiiIIIIii liillIIiil = new lIIIIiiiIIIIii();
   private float iiiilIIiil;
   private static final String lilllIIiil = "preview:close";
   private static final float illllIIiil = 3.0F;
   private static final String iilllIIiil = "...";
   private static final float iIlllIIiil = 0.08F;
   private final IIiilIiiiIii IiillIIiil;
   private float IiIIiIIiil;
   public static final float IIiIlIIiil = 0.56F;
   private static final float IllllIIiil = 10.0F;
   private static final float IlillIIiil = 7.0F;
   private static final String IIillIIiil = "preview:rail-more";
   private static final double IIlllIIiil = 0.004166666666666667;
   private float llIIiIIiil;
   private final float[] IiIilIIiil;
   private long iIlilIIiil;
   private float IiiilIIiil;
   private boolean IIiilIIiil;
   private static final float iliIlIIiil = 2.0F;
   private float iIIIiIIiil;
   private boolean lililIIiil;
   private static final float iIillIIiil = 4.0F;
   private float lIiIiIIiil;
   private final llillIlilillIl IIIilIIiil;
   private float lIIIiIIiil;
   private boolean lIiilIIiil;
   private static final float liiIlIIiil = 3.0F;
   private String[] lilIiIIiil;
   public static final int illIlIIiil = 0;
   private boolean IliilIIiil;
   private boolean lliilIIiil;
   private final IntConsumer iiIilIIiil;
   private static final double liIllIIiil = 784.0;
   private boolean IililIIiil;
   private static final float llillIIiil = 0.45F;
   private boolean iIlIiIIiil;
   private static final Set<String> ilillIIiil = ConcurrentHashMap.newKeySet();
   private static final float lIillIIiil = 20.0F;
   private int iiIIiIIiil;
   private static final float lIlllIIiil = 0.6F;
   private static final float IliIlIIiil = 22.0F;
   private final llIIiililIIiil ilIilIIiil;
   private static final float IiIllIIiil = 2.5F;
   private float IIiIiIIiil;
   public static final float lIiIlIIiil = 0.56F;
   private float[] IilIiIIiil;
   private static final float IIIllIIiil = 11.0F;
   public static final int lilIlIIiil = 2;
   private float IlIIiIIiil;
   private static final float IiiIlIIiil = 22.0F;
   private iliiIillIiiiIill IllIiIIiil;
   private final Runnable liIilIIiil;
   private static final float lllllIIiil = 6.0F;
   public static final int IilIlIIiil = 1;
   private static final float iIIllIIiil = 6.0F;
   private long illilIIiil;
   private int liIIiIIiil;
   private String lliIiIIiil;
   private boolean iililIIiil;
   private static final float lliIlIIiil = 30.0F;
   private float IIIIiIIiil;
   private final iIiilIliil IlIilIIiil;
   private float liiilIIiil;
   private float ilIIiIIiil;
   private long IllilIIiil;
   private static final double iiIllIIiil = 42.0;
   private long lIlilIIiil;
   private final Runnable IIlilIIiil;
   private final iIllIilIlllIil iiillIIiil = new iIllIilIlllIil();
   private String IliIiIIiil;
   private static final float ilIllIIiil = 170.0F;
   private static final float IlIllIIiil = 0.82F;
   private iliiIillIiiiIill lllIiIIiil;
   private String[] iilIiIIiil;
   private String iIiIiIIiil;
   private static final float IilllIIiil = 0.3F;
   private static final int iIiIlIIiil = 4;

   private void ilIllIiIll(double stride, float target, float dt) {
      long var9 = -8131047248054276135L;
      if (!this.IIiilIIiil) {
         this.ilIilIIiil.liiiIIllIl(stride);
         this.IIiilIIiil = true;
      } else if (this.ilIilIIiil.iiIiIiIliIIliIiIli != stride || this.ilIilIIiil.lIliIiIliiIliIiIli != 0.0) {
         var9 ^= ((long)Math.max(1, (int)Math.ceil((double)dt / 0.004166666666666667)) << 32 ^ var9) & -1L << 32;
         double var6 = (double)dt / (double)((int)(var9 >>> 32));

         for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            this.ilIilIIiil.IliIlllilIi(stride, 784.0, 42.0, var6);
         }

         if (Math.abs(this.ilIilIIiil.iiIiIiIliIIliIiIli - stride) < 0.04 && Math.abs(this.ilIilIIiil.lIliIiIliiIliIiIli) < 1.5) {
            this.ilIilIIiil.liiiIIllIl(stride);
         }
      }

      float var5 = lliiiIliliiiIl.IliIlllilIi((float)Math.abs(this.ilIilIIiil.iiIiIiIliIIliIiIli - stride) / Math.max(1.0F, target));
      this.ilIIiIIiil = lliiiIliliiiIl.IIIllIIliIIl(this.ilIIiIIiil, 1.0F - 0.6F * var5, 22.0F, dt, 0.004F);
   }

   private void iiiIlIIIll(class_332 a, int textX, float thumbs, float room, float top, float rx, float ctx, float rowR, float rowH, boolean i, float rw) {
      long var21 = -2996881113609140501L;
      float var12 = this.illIiIIiil[textX];
      float var13 = this.IilIiIIiil[textX];
      float var14 = IliiIilliiIi.IilliliilIIi(rw);

      try {
         IIiIllIllIiIllIl.IilliliilIIi(a, thumbs, room, top, rx, ctx, (double)var12);
         if (i) {
            float var15 = thumbs + 7.0F;
            float var16 = room + (rx - 22.0F) / 2.0F;
            lIlIIIliIlIIIl.lIiiIiIlilli(a, var15, var16, 22.0F);
            float var17 = IIIiiIillIIiiIil.Illlllllilll();
            lIlIIIliIlIIIl.Iliilliiilii(a, var15 + var17, var16 + var17, 22.0F - var17 * 2.0F, 22.0F - var17 * 2.0F);

            try {
               this.IiillIIiil.Iiilliiliiil(a, textX, var15, var16, 22.0F);
            } finally {
               a.method_44380();
            }

            lIlIIIliIlIIIl.IilliliilIIi(a, var15, var16, 22.0F, 22.0F, 5.0F);
         }

         var21 ^= (
               (long)IilIIIIililIIIIi.Illlllllilll(
                        IilIIIIililIIIIi.Illlllllilll(-8090988, -920587, (double)var12 * 0.6), IlIIilIlllIIilIl.lliiIlliIl, (double)var13
                     )
                     << 32
                  ^ var21
            )
            & -1L << 32;
         String var29 = this.lIIlliIIll(textX, rowH);
         String var30 = this.IiillIIiil.IIillIiliIil(textX);
         if (var30 == null) {
            llilliilililliil.iiIIlIIlIl(var29, rowR, llilliilililliil.IIIllIIliIIl(room + rx / 2.0F - 8.28F), (int)(var21 >>> 32));
         } else {
            float var18 = room + rx / 2.0F - 0.5F;
            llilliilililliil.iiIIlIIlIl(var29, rowR, llilliilililliil.IIIllIIliIIl(var18 - 11.5F), (int)(var21 >>> 32));
            String var19 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var30, Math.max(0.0F, rowH) / 0.78F);
            llilliilililliil.lIlIliIlIl(
               var19, rowR, var18 + 9.5F - 8.969999F, 0.78F, IilIIIIililIIIIi.Illlllllilll(-11117467, -7630437, (double)Math.max(var12, var13))
            );
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var14);
      }
   }

   private void Iliilliiilii(int n) {
      this.lIlIiIIiil = n;
      this.illIiIIiil = new float[n];
      this.IilIiIIiil = new float[n];
      this.lilIiIIiil = new String[n];
      this.iilIiIIiil = new String[n];
      if (this.liIIiIIiil >= n) {
         this.liIIiIIiil = n - 1;
      }

      if (this.liIIiIIiil < 0 && n > 0 && !this.iIlIiIIiil) {
         this.liIIiIIiil = 0;
      }

      if (this.iiIIiIIiil >= n) {
         this.iiIIiIIiil = -1;
      }

      if (this.liIIiIIiil >= 0) {
         this.IilIiIIiil[this.liIIiIIiil] = 1.0F;
      }

      this.IIiilIIiil = false;
      this.lIiilIIiil = true;
   }

   public boolean lIilliIill(int modifiers, int key) {
      if (this.iililIIiil) {
         return true;
      } else if (!this.lililIIiil && this.IiillIIiil.iiIIlIIlIl(modifiers, key)) {
         return true;
      } else if (modifiers == 256) {
         this.liiiIIllIl();
         return true;
      } else if (this.lililIIiil) {
         return true;
      } else {
         if (this.lIlIiIIiil > 0 && !this.IiillIIiil.Iilililiiili()) {
            switch (modifiers) {
               case 262:
               case 264:
                  this.IlIillIiilIi(1);
                  return true;
               case 263:
               case 265:
                  this.IlIillIiilIi(-1);
                  return true;
               case 266:
               case 267:
               default:
                  break;
               case 268:
                  this.IIIilIIiiIIi(0);
                  return true;
               case 269:
                  this.IIIilIIiiIIi(this.lIlIiIIiil - 1);
                  return true;
            }
         }

         return false;
      }
   }

   public void IIillIiliIil() {
      this.iiIIiIIiil = this.liIIiIIiil;
      this.liIIiIIiil = -1;
      this.IliilIIiil = false;
      this.iIlIiIIiil = true;
   }

   private void IIiIllIiIl(class_332 ms, float live, boolean dt, float ctx) {
      long var32 = -2905807573610006903L;
      long var34 = -3483440967743310636L;
      long var36 = 1554343450468324566L;
      long var38 = -2387449696607955158L;
      long var40 = -1442239795066361064L;
      var32 ^= ((long)this.lIlIiIIiil << 32 ^ var32) & -1L << 32;
      if ((int)(var32 >>> 32) > 0) {
         float var6 = this.liillIIiil.iliiIllIIl;
         float var7 = this.liillIIiil.IiiiIllIIl;
         float var8 = this.liillIIiil.liiiIllIIl;
         var32 ^= ((long)this.IiillIIiil.Ililllililil() ^ var32) & -1L >>> 32;
         var34 ^= ((long)((int)var32 == 0 && this.IiillIIiil.IIillIiliIil(0) == null ? 0 : 1) << 32 ^ var34) & -1L << 32;
         float var11 = (int)(var34 >>> 32) != 0 ? 30.0F : 22.0F;
         float var12 = var11 + 2.0F;
         if (var12 != this.IiIIiIIiil) {
            this.IiIIiIIiil = var12;
            this.IIiilIIiil = false;
         }

         float var13 = IiiIlliiIl(this.liillIIiil.iiiiIllIIl, var12, var11);
         String var14 = this.IiillIIiil.IiIiliIiiiIi();
         var34 ^= ((long)this.IiillIIiil.Iilililiiili() ^ var34) & -1L >>> 32;
         this.llIilIIiil.IliIlllilIi((float)((int)(var32 >>> 32)) * var12 - 2.0F + (var14 != null ? 24.0F : 0.0F), var13);
         var36 ^= ((long)(dt && !this.lliilIIiil && this.liillIIiil.IlIlllIlilIl((double)this.IlIIiIIiil, (double)this.llIIiIIiil) ? 1 : 0) << 32 ^ var36)
            & -1L << 32;
         var36 ^= ((long)((int)(var36 >>> 32) != 0 && (int)var34 == 0 ? 1 : 0) ^ var36) & -1L >>> 32;
         if (this.lIiilIIiil && this.liIIiIIiil >= 0) {
            float var18 = (float)this.liIIiIIiil * var12;
            if (this.iIiilIIiil) {
               if (var18 < this.llIilIIiil.IIlllIlliIll()) {
                  this.llIilIIiil.lIiiIiIlilli(var18);
               } else if (var18 + var11 > this.llIilIIiil.IIlllIlliIll() + var13) {
                  this.llIilIIiil.lIiiIiIlilli(var18 + var11 - var13);
               }
            } else {
               this.llIilIIiil.iliIiiliiiii((float)Math.round((var18 + var11 / 2.0F - var13 / 2.0F) / var12) * var12);
            }

            this.lIiilIIiil = false;
         }

         this.llIilIIiil.IlIlllIlilIl(ctx, (boolean)((int)(var36 >>> 32)));
         float var54 = llilliilililliil.IIIllIIliIIl(this.llIilIIiil.IiIlliIliiIl());
         var38 ^= ((long)Math.max(0, (int)Math.floor((double)(var54 / var12))) << 32 ^ var38) & -1L << 32;
         var38 ^= ((long)Math.min((int)(var32 >>> 32) - 1, (int)Math.floor((double)((var54 + var13) / var12))) ^ var38) & -1L >>> 32;
         if (!(this.Illillliilli(live, 0) <= 0.002F) || !(this.Illillliilli(live, (int)var38 - (int)(var38 >>> 32)) <= 0.002F) || this.lililIIiil) {
            float var21 = Math.min(7.0F, Math.max(4.0F, var11 / 2.0F - 2.0F));
            float var22 = var6 + ((int)var32 != 0 ? 36.0F : 11.0F);
            float var23 = var6 + var8 - 6.0F - var22;
            if (var23 != this.IIiIiIIiil) {
               this.IIiIiIIiil = var23;
               Arrays.fill(this.lilIiIIiil, null);
            }

            lIlIIIliIlIIIl.Iliilliiilii(ms, var6 - 6.0F, var7, var8 + 12.0F, var13);

            try {
               this.ilIllIiIll(this.liIIiIIiil < 0 ? 0.0 : (double)this.liIIiIIiil * (double)var12, var12, ctx);
               if (this.liIIiIIiil >= 0 && this.liIIiIIiil < (int)(var32 >>> 32)) {
                  float var24 = llilliilililliil.IIIllIIliIIl(var7 + (float)this.ilIilIIiil.iiIiIiIliIIliIiIli - var54);
                  float var25 = this.Illillliilli(live, Math.max(0, this.liIIiIIiil - (int)(var38 >>> 32)))
                     * this.llIilIIiil.Iiilliiliiil(var24, var24 + var11, var7, var11 * 0.3F);
                  if (var25 > 0.002F) {
                     float var26 = IliiIilliiIi.IilliliilIIi(var25);

                     try {
                        IIiIllIllIiIllIl.iliIiiliiiii(ms, var6, var24, var8, var11, var21);
                        float var27 = (float)Math.round(var11 / 2.0F * this.ilIIiIIiil);
                        IIiIllIllIiIllIl.IIIllIIliIIl(ms, var6 + 3.0F, var24 + (var11 - var27) / 2.0F, var27, 1.0);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var26);
                     }
                  }
               }

               var40 ^= ((long)((int)(var38 >>> 32)) << 32 ^ var40) & -1L << 32;

               while ((int)(var40 >>> 32) <= (int)var38) {
                  float var56 = var7 + (float)((int)(var40 >>> 32)) * var12 - var54;
                  float var58 = this.Illillliilli(live, (int)(var40 >>> 32) - (int)(var38 >>> 32))
                     * this.llIilIIiil.Iiilliiliiil(var56, var56 + var11, var7, var11 * 0.3F)
                     * ((int)var34 != 0 ? 0.45F : 1.0F);
                  var40 ^= (
                        (long)((int)var36 != 0 && this.llIIiIIiil >= Math.max(var56, var7) && this.llIIiIIiil < Math.min(var56 + var11, var7 + var13) ? 1 : 0)
                           ^ var40
                     )
                     & -1L >>> 32;
                  this.illIiIIiil[(int)(var40 >>> 32)] = lliiiIliliiiIl.IIIllIIliIIl(
                     this.illIiIIiil[(int)(var40 >>> 32)],
                     (int)var40 != 0 && (int)(var40 >>> 32) != this.liIIiIIiil ? 1.0F : 0.0F,
                     (int)var40 != 0 ? 16.0F : 11.0F,
                     ctx,
                     0.002F
                  );
                  this.IilIiIIiil[(int)(var40 >>> 32)] = lliiiIliliiiIl.IIIllIIliIIl(
                     this.IilIiIIiil[(int)(var40 >>> 32)], (int)(var40 >>> 32) == this.liIIiIIiil ? 1.0F : 0.0F, 14.0F, ctx, 0.002F
                  );
                  if (!(var58 <= 0.002F)) {
                     this.iiiIlIIIll(ms, (int)(var40 >>> 32), var6, var56, var8, var11, var21, var22, var23, (boolean)((int)var32), var58);
                     float var28 = Math.max(var56, var7);
                     float var29 = Math.min(var56 + var11, var7 + var13) - var28;
                     if (dt && (int)var34 == 0 && var58 > 0.5F && var29 > 2.0F) {
                        this.IIIilIIiil.liiiIIllIl(var6, var28, var8, var29, 2, null, null, this.iiIilIIiil, (int)(var40 >>> 32));
                     }
                  }

                  var40 += 4294967296L;
               }

               if (var14 != null) {
                  this.iIiIlIliIl(
                     ms,
                     var14,
                     var6,
                     var7 + (float)((int)(var32 >>> 32)) * var12 - 2.0F + 4.0F - var54,
                     var8,
                     var7,
                     var13,
                     var21,
                     var22,
                     this.Illillliilli(live, Math.max(0, (int)var38 - (int)(var38 >>> 32) + 1)),
                     (boolean)((int)var36),
                     dt
                  );
               }
            } finally {
               ms.method_44380();
            }

            float var55 = this.IIlilIliiIli(live, 2);
            if (var55 > 0.002F) {
               float var57 = IliiIilliiIi.IilliliilIIi(var55);

               try {
                  lIlIIIliIlIIIl.Ililllililil(ms, var6 + var8 + 3.0F, var7 + 2.0F, var13 - 4.0F, this.llIilIIiil);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var57);
               }
            }
         }
      }
   }

   private void IllIllllIl(int weight, float item, boolean incoming) {
      this.iIIilIIiil.iIlIlliIIl = weight;
      this.iIIilIIiil.IllIlliIIl = item;
      this.iIIilIIiil.lilIlliIIl = incoming;
   }

   public void Ililllililil() {
      if (this.IililIIiil) {
         this.lllilIIiil = System.nanoTime();
         this.IliilIIiil = true;
         this.lllIiIIiil = iliiIillIiiiIill.iilililill;
      }
   }

   public iIIiliiIlIilii IlIlllIlilIl() {
      return this.iIIilIIiil;
   }

   public void IiIiliIiiiIi(class_332 rawMx, float ctx, float rawMy, double screenH, double screenW) {
      long var23 = -1957179490247389990L;
      long var25 = 2549047737751215615L;
      long var8 = System.nanoTime();
      float var10 = this.IllilIIiil == 0L ? 0.0F : Math.min(0.05F, (float)(var8 - this.IllilIIiil) / 1.0E9F);
      this.IllilIIiil = var8;
      this.iiillIIiil.IliIlllilIi(var10);
      if (!this.iililIIiil) {
         this.IiillIIiil.iliIiiliiiii(var10);
      }

      this.IIIilIIiil.IliIlllilIi();
      this.lIIilIIiil.IliIlllilIi();
      this.IiillIIiil.IIlllIlliIll(this.lIIilIIiil);
      String var11 = this.IiillIIiil.iIlIlllllill();
      var23 ^= ((long)Math.max(0, this.IiillIIiil.Illlllllilll()) << 32 ^ var23) & -1L << 32;
      if ((int)(var23 >>> 32) != this.lIlIiIIiil) {
         this.Iliilliiilii((int)(var23 >>> 32));
      }

      this.liillIIiil
         .liiiIIllIl(
            ctx,
            rawMy,
            this.IiillIIiil.IilliliilIIi(),
            this.IiillIIiil.lIiiIiIlilli(),
            var11 != null,
            (int)(var23 >>> 32) > 0 ? this.IiillIIiil.IIIilIIiiIIi() : 0.0F,
            Math.max(0.0F, this.IiillIIiil.IIiilIiiiIii()),
            !this.lIIilIIiil.liiiIIllIl()
         );
      float var13 = (float)(var8 - (this.lililIIiil ? this.iIlilIIiil : this.lIlilIIiil)) / 1000000.0F;
      float var14;
      float var15;
      if (this.lililIIiil) {
         var14 = this.iliilIIiil * lliiiIliliiiIl.IlIlllIlilIl(var13, true);
         this.lIIIiIIiil = this.IiiilIIiil * lliiiIliliiiIl.IiIlliIliiIl(var13, true);
         this.iIIIiIIiil = this.liiilIIiil + lliiiIliliiiIl.IIlllIlliIll(var13, true);
         var15 = this.iiiilIIiil * lliiiIliliiiIl.Illlllllilll(var13, true);
         if (lliiiIliliiiIl.IIIilIIiiIIi(var13)) {
            this.iililIIiil = true;
         }
      } else {
         var14 = lliiiIliliiiIl.IlIlllIlilIl(var13, false);
         this.lIIIiIIiil = lliiiIliliiiIl.IiIlliIliiIl(var13, false);
         this.iIIIiIIiil = lliiiIliliiiIl.IIlllIlliIll(var13, false);
         var15 = lliiiIliliiiIl.Illlllllilll(var13, false);
      }

      float var16 = this.liillIIiil.IlliIllIIl + this.liillIIiil.illiIllIIl / 2.0F;
      float var17 = this.liillIIiil.llliIllIIl + this.liillIIiil.IiliIllIIl / 2.0F;
      this.IlIIiIIiil = this.Iilililiiili(screenH);
      this.llIIiIIiil = this.IIiilIiiiIii(screenW);
      var23 ^= ((long)(!this.lililIIiil && this.IIlilIliiIli(var13, 0) > 0.5F ? 1 : 0) ^ var23) & -1L >>> 32;
      if (var15 > 0.002F) {
         IIIiiIillIIiiIil.IilliliilIIi(rawMx, 0.0F, 0.0F, ctx, rawMy, lIlIIIliIlIIIl.Iiiiliiiiiii(-16777216, this.IIIIiIIiil * var15));
      }

      if (!this.iililIIiil) {
         var25 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(rawMx, var16, var17, this.lIIIiIIiil, this.iIIIiIIiil) << 32 ^ var25) & -1L << 32;

         try {
            if (var14 > 0.002F) {
               float var20 = IliiIilliiIi.IilliliilIIi(var14);

               try {
                  lIlIIIliIlIIIl.liiiIIllIl(
                     rawMx, this.liillIIiil.IlliIllIIl, this.liillIIiil.llliIllIIl, this.liillIIiil.illiIllIIl, this.liillIIiil.IiliIllIIl, var14
                  );
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var20);
               }
            }

            this.Iiiiliiiiiii(rawMx, var11, this.IIlilIliiIli(var13, 0), (boolean)((int)var23), var8);
            this.iiIIlIIlIl(rawMx, this.IIlilIliiIli(var13, 1), (boolean)((int)var23), var8, var10);
            if (this.liillIIiil.iIlIlllllill()) {
               this.lIlIliIlIl(rawMx, this.IIlilIliiIli(var13, 1), (boolean)((int)var23), var10);
            }

            if (this.liillIIiil.lIiiIiIlilli()) {
               this.IIiIllIiIl(rawMx, var13, (boolean)((int)var23), var10);
            }

            if (this.liillIIiil.iIlIlllIIl > 0.0F) {
               this.liIlliiIll(rawMx, this.IIlilIliiIli(var13, 3), (boolean)((int)var23));
            }
         } finally {
            lIlIIIliIlIIIl.IIlilIliiIli(rawMx, (boolean)((int)(var25 >>> 32)));
         }
      }
   }

   private void iiIIlIIlIl(class_332 ctx, float live, boolean now, long dt, float a) {
      long var17 = -2145902230419858233L;
      if (!(live <= 0.002F)) {
         float var7 = this.liillIIiil.IIIIlllIIl;
         float var8 = this.liillIIiil.lIIIlllIIl;
         float var9 = this.liillIIiil.iIIIlllIIl;
         float var10 = this.liillIIiil.IlIIlllIIl;
         if (!(var9 <= 1.0F) && !(var10 <= 1.0F)) {
            var17 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(ctx, 0.0F, 0.0F, 1.0F, this.lililIIiil ? 0.0F : lliiiIliliiiIl.Ililllililil(live)) << 32 ^ var17)
               & -1L << 32;
            float var12 = IliiIilliiIi.IilliliilIIi(live);

            try {
               lIlIIIliIlIIIl.iIlIlllllill(ctx, var7, var8, var9, var10, 7.0F);
               this.iIIilIIiil.lIIIlliIIl = var7;
               this.iIIilIIiil.iIIIlliIIl = var8;
               this.iIIilIIiil.IlIIlliIIl = var9;
               this.iIIilIIiil.llIIlliIIl = var10;
               this.iIIilIIiil.IilIlliIIl = 7.0F;
               this.iIIilIIiil.ilIIlliIIl = this.IlIIiIIiil;
               this.iIIilIIiil.liIIlliIIl = this.llIIiIIiil;
               this.iIIilIIiil.iiIIlliIIl = now && (this.lliilIIiil || this.liillIIiil.IIIllIIliIIl((double)this.IlIIiIIiil, (double)this.llIIiIIiil));
               this.iIIilIIiil.IIlIlliIIl = this.lliilIIiil;
               this.iIIilIIiil.lIlIlliIIl = this.IIlIiIIiil;
               this.iIIilIIiil.lllIlliIIl = live;
               this.iIIilIIiil.illIlliIIl = a;
               this.iIIilIIiil.iilIlliIIl = now && !this.lliilIIiil && live > 0.5F;
               this.iIIilIIiil.IIiIlliIIl = this.iiillIIiil;
               this.iIIilIIiil.lIiIlliIIl = this.IIIilIIiil;
               var17 ^= ((long)ilillIIiil.contains(this.IiillIIiil.getClass().getName()) ^ var17) & -1L >>> 32;
               if ((int)var17 == 0) {
                  lIlIIIliIlIIIl.Iliilliiilii(ctx, var7, var8, var9, var10);

                  try {
                     this.IllIllllIl(this.liIIiIIiil, 1.0F, true);
                     this.IiillIIiil.IlIlllIlilIl(ctx, this.iIIilIIiil);
                     this.illIlIilIl(ctx, dt);
                     this.IllIllllIl(this.liIIiIIiil, 1.0F, true);
                     this.IiillIIiil.IiIlliIliiIl(ctx, this.iIIilIIiil);
                  } catch (Throwable var25) {
                     var17 ^= (1L ^ var17) & -1L >>> 32;
                     ilillIIiil.add(this.IiillIIiil.getClass().getName());
                  } finally {
                     ctx.method_44380();
                  }
               }

               if ((int)var17 != 0) {
                  lIlIIIliIlIIIl.Iiilliiliiil(
                     ctx,
                     var7,
                     var8,
                     var9,
                     var10,
                     lIlIIIliIlIIIl.IlIillIiilIi(Ilillllill<"Ilillllill","prNpzmRVENuN8euX8G7AyzI6rNk0bmV/jKnhhurJzv0=">()),
                     Ilillllill<"Ilillllill","U976jxeU+F1y47mjRyS+izk8YxqdPc/pcveAapfSnXxP0LL0f6zVYKXRZvPaU8g=">(),
                     Ilillllill<"Ilillllill","u7ob68xychpXefMLDtI37d8lAPVSmw6akTplZvMtBG2GHZ9rkObcU6sAq870G2KdtsfUMHyvlrmpVj0nC9UcuR3jw7xozB4NBw==">()
                  );
               }

               lIlIIIliIlIIIl.IilliliilIIi(ctx, var7, var8, var9, var10, 7.0F);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var12);
               lIlIIIliIlIIIl.IIlilIliiIli(ctx, (boolean)((int)(var17 >>> 32)));
            }
         }
      }
   }

   public lIIIIiiiIIIIii IIIllIIliIIl() {
      return this.liillIIiil;
   }

   private void lilIliilIl(class_332 itemScale, int weight, float ctx, float item, boolean incoming) {
      long var9 = 5456399363732770955L;
      this.IllIllllIl(weight, ctx, incoming);
      var9 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(itemScale, this.iIIilIIiil.IliIlllilIi(), this.iIIilIIiil.liiiIIllIl(), item, 0.0F) << 32 ^ var9) & -1L << 32;
      float var7 = IliiIilliiIi.IilliliilIIi(ctx);

      try {
         this.IiillIIiil.IIIllIIliIIl(itemScale, this.iIIilIIiil);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var7);
         lIlIIIliIlIIIl.IIlilIliiIli(itemScale, (boolean)((int)(var9 >>> 32)));
      }
   }

   private void IiIIlliIIl(class_332 live, boolean ctx) {
      long var11 = -7799354316642945819L;
      float var3 = this.liillIIiil.iIiiIllIIl;
      float var4 = this.liillIIiil.IliiIllIIl;
      float var5 = this.liillIIiil.lliiIllIIl;
      var11 ^= ((long)(ctx && !this.lliilIIiil && this.liillIIiil.IIlllIlliIll((double)this.IlIIiIIiil, (double)this.llIIiIIiil) ? 1 : 0) << 32 ^ var11)
         & -1L << 32;
      float var7 = this.iiillIIiil
         .lIiiIiIlilli(Ilillllill<"Ilillllill","0el5OwtRCBgh9jBspYp73DneNBuP4onMjkyQpN8rhJN2MGIe45Fj4p4=">(), (boolean)((int)(var11 >>> 32)));
      var11 ^= (
            (long)lIlIIIliIlIIIl.IiIiliIiiiIi(
                  live,
                  var3 + var5 / 2.0F,
                  var4 + var5 / 2.0F,
                  this.iiillIIiil.IiIlliIliiIl(Ilillllill<"Ilillllill","0el5OwtRCBgh9jBspYp73DneNBuP4onMjkyQpN8rhJN2MGIe45Fj4p4=">(), 0.08F),
                  0.0F
               )
               ^ var11
         )
         & -1L >>> 32;

      try {
         if (var7 > 0.004F) {
            IIIiiIillIIiiIil.Iilllilliill(
               live, var3, var4, var5, var5, 5.0F, lIlIIIliIlIIIl.Iiiiliiiiiii(-1, 0.06F * var7), lIlIIIliIlIIIl.Iiiiliiiiiii(1040187391, var7)
            );
         }

         float var9 = (var5 - 10.0F) / 2.0F;
         lIlIIIliIlIIIl.IIIilIIiiIIi(
            lIlIIIliIlIIIl.IlIillIiilIi(Ilillllill<"Ilillllill","7oANuGqOCs5sP7ReOPIYokxNhrn3p7iM2nLIa90mWeB1">()),
            var3 + var9,
            var4 + var9,
            10.0F,
            IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var7)
         );
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(live, (boolean)((int)var11));
      }

      if (ctx) {
         this.IIIilIIiil
            .liiiIIllIl(
               var3 - 2.0F,
               var4 - 2.0F,
               var5 + 4.0F,
               var5 + 4.0F,
               0,
               Ilillllill<"Ilillllill","0el5OwtRCBgh9jBspYp73DneNBuP4onMjkyQpN8rhJN2MGIe45Fj4p4=">(),
               this.liIilIIiil,
               null,
               0
            );
      }
   }

   private void llIIlilIIl(String s, float dy, float room) {
      String var4 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(s, Math.max(0.0F, dy) / 0.82F);
      lIlIIIliIlIIIl.Illlllllilll(var4, this.liillIIiil.liliIllIIl, this.liillIIiil.lIiiIllIIl + room, 10.0F, 0.82F, -7630437);
   }

   public boolean iIlIlllllill() {
      return this.IililIIiil && !this.lililIIiil && !this.iililIIiil;
   }

   public boolean lllllillll(double rawX, double button, int rawY) {
      if (this.lliilIIiil && rawY == this.IIlIiIIiil) {
         this.IlIIiIIiil = this.Iilililiiili(rawX);
         this.llIIiIIiil = this.IIiilIiiiIii(button);
         this.Iillllilll();
         return true;
      } else {
         return false;
      }
   }

   private void Iiiiliiiiiii(class_332 ctx, String a, float now, boolean live, long sub) {
      long var11 = 8321966535622226994L;
      if (!(now <= 0.002F)) {
         var11 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(ctx, 0.0F, 0.0F, 1.0F, this.lililIIiil ? 0.0F : lliiiIliliiiIl.Ililllililil(now)) << 32 ^ var11)
            & -1L << 32;
         float var8 = IliiIilliiIi.IilliliilIIi(now);

         try {
            float var9 = this.liillIIiil.iIiiIllIIl - 8.0F - this.liillIIiil.liliIllIIl;
            llilliilililliil.IiiIlliiIl(ctx, this.IIIIllIIIl(var9), this.liillIIiil.liliIllIIl, this.liillIIiil.iiliIllIIl, this.liillIIiil.IIiiIllIIl);
            this.iIIIlIlIIl(a, sub);
            this.IiIIlliIIl(ctx, live);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var8);
            lIlIIIliIlIIIl.IIlilIliiIli(ctx, (boolean)((int)(var11 >>> 32)));
         }
      }
   }

   private void Iiilliiliiil(int index) {
      if (index != this.liIIiIIiil) {
         lllIlliillIlli.ilIllIiIll();
      }

      this.IIIilIIiiIIi(index);
   }

   public void Iilllilliill(int animate, boolean index) {
      long var5 = -781526001368805225L;
      var5 ^= ((long)Math.max(0, this.IiillIIiil.Illlllllilll()) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) > 0) {
         animate = Math.max(0, Math.min((int)(var5 >>> 32) - 1, animate));
      }

      if (animate != this.liIIiIIiil) {
         this.iIlIiIIiil = false;
         this.iiIIiIIiil = this.liIIiIIiil;
         this.liIIiIIiil = animate;
         var5 ^= ((long)(index && this.IililIIiil && this.iiIIiIIiil >= 0 ? 1 : 0) ^ var5) & -1L >>> 32;
         if ((int)var5 != 0) {
            this.lllilIIiil = System.nanoTime();
            this.IliilIIiil = true;
            this.lllIiIIiil = this.IllIiIIiil;
         } else {
            this.IliilIIiil = false;
         }

         this.lIiilIIiil = true;
         this.iIiilIIiil = (boolean)((int)var5);
      }
   }

   public void liiiIIllIl() {
      long var5 = -3772278247303645286L;
      if (!this.iililIIiil && !this.lililIIiil) {
         if (!this.IililIIiil) {
            this.iililIIiil = true;
         } else {
            long var1 = System.nanoTime();
            float var3 = (float)(var1 - this.lIlilIIiil) / 1000000.0F;
            this.iliilIIiil = lliiiIliliiiIl.IlIlllIlilIl(var3, false);
            this.IiiilIIiil = lliiiIliliiiIl.IiIlliIliiIl(var3, false);
            this.liiilIIiil = lliiiIliliiiIl.IIlllIlliIll(var3, false);
            this.iiiilIIiil = lliiiIliliiiIl.Illlllllilll(var3, false);

            for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 4; var7 += 4294967296L) {
               this.IiIilIIiil[(int)(var7 >>> 32)] = lliiiIliliiiIl.Iilllilliill(var3, (int)(var7 >>> 32), false);
            }

            this.Iillllilll();
            this.lililIIiil = true;
            this.iIlilIIiil = var1;
         }
      }
   }

   private void liIlliiIll(class_332 live, float a, boolean ctx) {
      long var7 = -3361384569643089283L;
      if (!(a <= 0.002F)) {
         var7 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(live, 0.0F, 0.0F, 1.0F, this.lililIIiil ? 0.0F : lliiiIliliiiIl.Ililllililil(a)) << 32 ^ var7) & -1L << 32;
         float var5 = IliiIilliiIi.IilliliilIIi(a);

         try {
            this.lIIilIIiil
               .IlIillIiilIi(
                  live,
                  this.liillIIiil.iiIIlllIIl,
                  this.liillIIiil.IIlIlllIIl,
                  this.liillIIiil.lIlIlllIIl,
                  this.liillIIiil.iIlIlllIIl,
                  this.IlIIiIIiil,
                  this.llIIiIIiil,
                  ctx && !this.lliilIIiil && a > 0.5F,
                  this.iiillIIiil,
                  this.IIIilIIiil
               );
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var5);
            lIlIIIliIlIIIl.IIlilIliiIli(live, (boolean)((int)(var7 >>> 32)));
         }
      }
   }

   public void IIlllIlliIll(iliiIillIiiiIill t) {
      this.IllIiIIiil = t == null ? iliiIillIiiiIill.lilililill : t;
   }

   private String IIIIllIIIl(float room) {
      String var2 = this.IiillIIiil.liiiIIllIl();
      if (var2 == null) {
         var2 = "";
      }

      if (!var2.equals(this.lliIiIIiil) || room != this.IiiIiIIiil) {
         this.lliIiIIiil = var2;
         this.IiiIiIIiil = room;
         this.iliIiIIiil = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var2, Math.max(0.0F, room) / 1.22F);
      }

      return this.iliIiIIiil;
   }

   public boolean IilliliilIIi() {
      return this.lililIIiil;
   }

   public iIllIilIlllIil IiIlliIliiIl() {
      return this.iiillIIiil;
   }

   private void IlIillIiilIi(int dir) {
      if (this.lIlIiIIiil > 0) {
         this.IIIilIIiiIIi(Math.floorMod((this.liIIiIIiil < 0 ? 0 : this.liIIiIIiil) + dir, this.lIlIiIIiil));
      }
   }

   public int iliIiiliiiii() {
      return this.liIIiIIiil;
   }

   public boolean lIiiIiIlilli() {
      return this.iililIIiil;
   }

   private float Illillliilli(float row, int ms) {
      return this.lililIIiil ? this.IiIilIIiil[2] * lliiiIliliiiIl.Iilllilliill(row, 2, true) : lliiiIliliiiIl.IIillIiliIil(row, 2, ms, false);
   }

   private static float IiiIlliiIl(float stride, float rowH, float height) {
      long var4 = -4419004866296118871L;
      var4 ^= ((long)((int)Math.floor((double)((stride + 2.0F) / rowH))) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) < 1 ? Math.min(stride, height) : (float)((int)(var4 >>> 32)) * rowH - 2.0F;
   }

   static String IlIllllIll(String room, float s) {
      long var7 = 1130648978065108709L;
      long var9 = 1181904512557008231L;
      IIliiIlllIliiIll var2 = llilliilililliil.IIiilIiiiIii();
      if (var2.iIlIlllllill(room) <= s) {
         return room;
      } else {
         float var3 = var2.iIlIlllllill(Ilillllill<"Ilillllill","dforZ8O/3mFni9Tgn5QkKByqEtGl0BPQICzz+DW5pw==">());
         var7 ^= (-4294967296L ^ var7) & -1L << 32;
         var7 ^= ((long)room.indexOf(32) ^ var7) & -1L >>> 32;

         while ((int)var7 > 0 && !(var2.iIlIlllllill(room.substring(0, (int)var7)) + var3 > s)) {
            var7 ^= ((long)((int)var7) << 32 ^ var7) & -1L << 32;
            var7 ^= ((long)room.indexOf(32, (int)var7 + 1) ^ var7) & -1L >>> 32;
         }

         if ((int)(var7 >>> 32) >= Math.min(6, room.length() / 3)) {
            String var5 = room.substring(0, (int)(var7 >>> 32));
            var9 ^= ((long)var5.length() << 32 ^ var9) & -1L << 32;

            while (
               (int)(var9 >>> 32) > 0
                  && Ilillllill<"Ilillllill","B0HHrKX6Re9qCKqNEDd03rBivZEsjhfA0XiCe63JcCeH4AwlXhc=">().indexOf(var5.charAt((int)(var9 >>> 32) - 1)) >= 0
            ) {
               var9 += -4294967296L;
            }

            if ((int)(var9 >>> 32) > 0) {
               return var5.substring(0, (int)(var9 >>> 32)) + Ilillllill<"Ilillllill","dforZ8O/3mFni9Tgn5QkKByqEtGl0BPQICzz+DW5pw==">();
            }
         }

         return var2.Iiilliiliiil(room, s);
      }
   }

   public boolean iilllIIill(double amount, double rawY, double rawX) {
      long var11 = 2744543460589102317L;
      if (this.IililIIiil && !this.lililIIiil && !this.iililIIiil) {
         float var7 = this.Iilililiiili(amount);
         float var8 = this.IIiilIiiiIii(rawY);
         if (!this.liillIIiil.IilliliilIIi((double)var7, (double)var8)
            && !this.liillIIiil.IlIlllIlilIl((double)var7, (double)var8)
            && this.IIIilIIiil.lIiiIiIlilli((double)var7, (double)var8, rawX)) {
            return true;
         } else if (this.liillIIiil.IlIlllIlilIl((double)var7, (double)var8)) {
            this.lIiIiIIiil = (float)((double)this.lIiIiIIiil + rawX);
            var11 ^= ((long)((int)this.lIiIiIIiil) << 32 ^ var11) & -1L << 32;
            if ((int)(var11 >>> 32) != 0) {
               this.lIiIiIIiil -= (float)((int)(var11 >>> 32));
               float var10 = (float)Math.round(this.llIilIIiil.IIlllIlliIll() / this.IiIIiIIiil - (float)((int)(var11 >>> 32))) * this.IiIIiIIiil;
               this.llIilIIiil.lIiiIiIlilli(var10);
            }

            return true;
         } else if (this.liillIIiil.IilliliilIIi((double)var7, (double)var8)) {
            this.IiillIIiil.Iiiiliiiiiii(this.IlIilIIiil, (double)var7, (double)var8, rawX);
            return true;
         } else {
            if (this.liillIIiil.IIIllIIliIIl((double)var7, (double)var8) && !ilillIIiil.contains(this.IiillIIiil.getClass().getName())) {
               this.IiillIIiil.IiIIlliIIl(this.iIIilIIiil, (double)var7, (double)var8, rawX);
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public boolean iIlllIllll(double rawX, double dy, int button, double dx, double rawY) {
      if (this.lliilIIiil && !this.lililIIiil) {
         float var10 = Math.max(0.05F, this.lIIIiIIiil);
         this.IiillIIiil
            .iIIIlIlIIl(this.iIIilIIiil, (double)this.Iilililiiili(rawX), (double)this.IIiilIiiiIii(dy), dx / (double)var10, rawY / (double)var10, button);
         return true;
      } else {
         return this.lliilIIiil;
      }
   }

   private float Iilililiiili(double raw) {
      float var3 = this.liillIIiil.IlliIllIIl + this.liillIIiil.illiIllIIl / 2.0F;
      return (float)((double)var3 + (raw - (double)var3) / (double)Math.max(0.05F, this.lIIIiIIiil));
   }

   private float IIiilIiiiIii(double raw) {
      float var3 = this.liillIIiil.llliIllIIl + this.liillIIiil.IiliIllIIl / 2.0F;
      return (float)((double)var3 + (raw - (double)this.iIIIiIIiil - (double)var3) / (double)Math.max(0.05F, this.lIIIiIIiil));
   }

   public boolean IIllllIlll(double rawX, double button, int rawY) {
      if (this.IililIIiil && !this.lililIIiil && !this.iililIIiil) {
         float var6 = this.Iilililiiili(rawX);
         float var7 = this.IIiilIiiiIii(button);
         if (!this.liillIIiil.iliIiiliiiii((double)var6, (double)var7)) {
            if (rawY == 0) {
               this.liiiIIllIl();
            }

            return true;
         } else if (this.IIIilIIiil.IilliliilIIi((double)var6, (double)var7, rawY, this.iiillIIiil)) {
            return true;
         } else {
            if (this.liillIIiil.IIIllIIliIIl((double)var6, (double)var7) && !ilillIIiil.contains(this.IiillIIiil.getClass().getName())) {
               if (this.lliilIIiil) {
                  this.Iillllilll();
               }

               this.lliilIIiil = true;
               this.IIlIiIIiil = rawY;
               this.iIIilIIiil.IIlIlliIIl = true;
               this.iIIilIIiil.lIlIlliIIl = rawY;
               this.IiillIIiil.IIIIllIIIl(this.iIIilIIiil, (double)var6, (double)var7, rawY);
            }

            return true;
         }
      } else {
         return true;
      }
   }

   private void iIiIlIliIl(
      class_332 textX, String rw, float rh, float overRail, float label, float live, float rowR, float ry, float alpha, float rx, boolean top, boolean ctx
   ) {
      long var20 = -2146561343230758046L;
      if (!(overRail >= live + rowR) && !(overRail + 20.0F <= live)) {
         float var13 = rx * this.llIilIIiil.Iiilliiliiil(overRail, overRail + 20.0F, live, 6.0F);
         var20 ^= (
               (long)(top && this.llIIiIIiil >= Math.max(overRail, live) && this.llIIiIIiil < Math.min(overRail + 20.0F, live + rowR) ? 1 : 0) << 32 ^ var20
            )
            & -1L << 32;
         float var15 = this.iiillIIiil
            .lIiiIiIlilli(Ilillllill<"Ilillllill","mBClN7B0mnMX8OHDeiS3LRWMIzPkQaRwg6JU0SEZjFIFpDCcp/1/C31ILeWZ">(), (boolean)((int)(var20 >>> 32)));
         if (!(var13 <= 0.002F)) {
            float var16 = IliiIilliiIi.IilliliilIIi(var13);

            try {
               IIiIllIllIiIllIl.IilliliilIIi(textX, rh, overRail, label, 20.0F, ry, (double)(var15 * 0.6F));
               var20 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var15) ^ var20) & -1L >>> 32;
               float var18 = llilliilililliil.IIIllIIliIIl(overRail + 6.5F);
               lIlIIIliIlIIIl.IIIilIIiiIIi(
                  lIlIIiliIlIIil.IiiIlliiIl(
                     this.IiillIIiil.IIlilIliiIli()
                        ? Ilillllill<"Ilillllill","phM8WkccdQqVaqABZIKPPFzaO+dlnEQvNx53d0S7xWZrKG96Xd8=">()
                        : Ilillllill<"Ilillllill","I2p0rVKPzazUNGBB/IgL+0zJRHeBlm7v3ewXMc8t6U99n1g/Qw5O9g==">()
                  ),
                  alpha,
                  var18,
                  7.0F,
                  (int)var20
               );
               lIlIIIliIlIIIl.Illlllllilll(rw, alpha + 7.0F + 5.0F, overRail, 20.0F, 0.82F, (int)var20);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var16);
            }

            float var17 = Math.max(overRail, live);
            float var24 = Math.min(overRail + 20.0F, live + rowR) - var17;
            if (ctx && var13 > 0.5F && var24 > 2.0F) {
               this.IIIilIIiil
                  .liiiIIllIl(
                     rh,
                     var17,
                     label,
                     var24,
                     0,
                     Ilillllill<"Ilillllill","mBClN7B0mnMX8OHDeiS3LRWMIzPkQaRwg6JU0SEZjFIFpDCcp/1/C31ILeWZ">(),
                     this.IIlilIIiil,
                     null,
                     0
                  );
            }
         }
      }
   }

   public liiiliiliiiiliil(IIiilIiiiIii host) {
      this.IIIilIIiil = new llillIlilillIl();
      this.lIIilIIiil = new iiIiIlIIliIl();
      this.iIIilIIiil = new iIIiliiIlIilii();
      this.IlIilIIiil = new iIiilIliil();
      this.llIilIIiil = new iiiilIIiIIIIiIIi();
      this.ilIilIIiil = new llIIiililIIiil(0.0);
      this.IiIilIIiil = new float[4];
      this.liIilIIiil = this::liiiIIllIl;
      this.iiIilIIiil = this::Iiilliiliiil;
      this.IIlilIIiil = this::lliIliliIl;
      this.lIiilIIiil = true;
      this.iliilIIiil = 1.0F;
      this.IiiilIIiil = 1.0F;
      this.iiiilIIiil = 1.0F;
      this.IIIIiIIiil = 0.56F;
      this.lIIIiIIiil = 1.0F;
      this.IlIIiIIiil = -10000.0F;
      this.llIIiIIiil = -10000.0F;
      this.ilIIiIIiil = 1.0F;
      this.IiIIiIIiil = 24.0F;
      this.liIIiIIiil = -1;
      this.iiIIiIIiil = -1;
      this.IIlIiIIiil = -1;
      this.IllIiIIiil = iliiIillIiiiIill.lilililill;
      this.lllIiIIiil = iliiIillIiiiIill.lilililill;
      this.illIiIIiil = new float[0];
      this.IilIiIIiil = new float[0];
      this.lilIiIIiil = new String[0];
      this.iilIiIIiil = new String[0];
      this.IIiIiIIiil = -1.0F;
      this.IiiIiIIiil = -1.0F;
      this.IiillIIiil = Objects.requireNonNull(host);
   }

   public void IliIlllilIi(boolean overScreen) {
      this.lIlilIIiil = System.nanoTime();
      this.IllilIIiil = 0L;
      this.IililIIiil = true;
      this.lililIIiil = false;
      this.iililIIiil = false;
      this.IIIIiIIiil = overScreen ? 0.56F : 0.56F;
   }

   private void IIIilIIiiIIi(int index) {
      long var3 = -1736747289068025526L;
      if (!this.IiillIIiil.Iilililiiili()) {
         var3 ^= ((long)this.liIIiIIiil << 32 ^ var3) & -1L << 32;
         this.Iilllilliill(index, true);
         if (this.liIIiIIiil != (int)(var3 >>> 32)) {
            this.IiillIIiil.IlIillIiilIi(this.liIIiIIiil);
         }
      }
   }

   private void lIlIliIlIl(class_332 dt, float a, boolean live, float ctx) {
      long var10 = -8331677769991872415L;
      if (!(a <= 0.002F) && !(this.liillIIiil.IiIIlllIIl <= 1.0F) && !(this.liillIIiil.liIIlllIIl <= 1.0F)) {
         String var5 = this.IiillIIiil.getClass().getName() + Ilillllill<"Ilillllill","DjtQYL31JQmL7NVTKW/0z+DAp/lW8k5QO1UPLeiEAmSD">();
         if (!ilillIIiil.contains(var5)) {
            var10 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(dt, 0.0F, 0.0F, 1.0F, this.lililIIiil ? 0.0F : lliiiIliliiiIl.Ililllililil(a)) << 32 ^ var10)
               & -1L << 32;
            float var7 = IliiIilliiIi.IilliliilIIi(a);

            try {
               this.IlIilIIiil.iiIIiliIIlIili = this.liillIIiil.llIIlllIIl;
               this.IlIilIIiil.lIlIiliiIlIili = this.liillIIiil.ilIIlllIIl;
               this.IlIilIIiil.IllIililllIili = this.liillIIiil.IiIIlllIIl;
               this.IlIilIIiil.illIiliIilIili = this.liillIIiil.liIIlllIIl;
               this.IlIilIIiil.lilIiliiilIili = this.IlIIiIIiil;
               this.IlIilIIiil.IIiIililIiIili = this.llIIiIIiil;
               this.IlIilIIiil.iIiIiliIliIili = ctx;
               this.IlIilIIiil.lliIiliiliIili = live && !this.lliilIIiil && a > 0.5F;
               this.IlIilIIiil.IiiIililiiIili = this.iiillIIiil;
               this.IlIilIIiil.iiiIiliIIIlili = this.IIIilIIiil;
               this.IiillIIiil.Iliilliiilii(dt, this.IlIilIIiil);
            } catch (Throwable var14) {
               ilillIIiil.add(var5);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var7);
               lIlIIIliIlIIIl.IIlilIliiIli(dt, (boolean)((int)(var10 >>> 32)));
            }
         }
      }
   }

   private float IIlilIliiIli(float ms, int layer) {
      return this.lililIIiil ? this.IiIilIIiil[layer] * lliiiIliliiiIl.Iilllilliill(ms, layer, true) : lliiiIliliiiIl.Iilllilliill(ms, layer, false);
   }

   private String lIIlliIIll(int room, float i) {
      String var3 = this.IiillIIiil.Iilllilliill(room);
      if (var3 == null) {
         var3 = "";
      }

      if (!var3.equals(this.lilIiIIiil[room])) {
         this.lilIiIIiil[room] = var3;
         this.iilIiIIiil[room] = IlIllllIll(var3, Math.max(0.0F, i));
      }

      return this.iilIiIIiil[room];
   }

   public void Illlllllilll() {
      this.liillIIiil.Illlllllilll();
   }

   private void iIIIlIlIIl(String sub, long now) {
      if (!Objects.equals(sub, this.iIiIiIIiil)) {
         this.IliIiIIiil = this.iIiIiIIiil != null && this.IililIIiil && !this.lililIIiil ? this.iIiIiIIiil : null;
         this.iIiIiIIiil = sub;
         this.illilIIiil = now;
      }

      if (this.iIiIiIIiil != null || this.IliIiIIiil != null) {
         float var4 = this.liillIIiil.IlliIllIIl + this.liillIIiil.illiIllIIl - 12.0F - this.liillIIiil.liliIllIIl;
         float var5 = this.IliIiIIiil == null ? 1.0F : (float)(now - this.illilIIiil) / 1000000.0F / 170.0F;
         if (var5 >= 1.0F) {
            this.IliIiIIiil = null;
            if (this.iIiIiIIiil != null) {
               this.llIIlilIIl(this.iIiIiIIiil, var4, 0.0F);
            }
         } else {
            float var6 = lliiiIliliiiIl.IliIlllilIi(var5 / 0.5F);
            float var7 = lliiiIliliiiIl.liiiIIllIl((var5 - 0.25F) / 0.75F);
            if (var6 < 1.0F) {
               float var8 = IliiIilliiIi.IilliliilIIi(1.0F - var6);

               try {
                  this.llIIlilIIl(this.IliIiIIiil, var4, -2.5F * var6);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var8);
               }
            }

            if (var7 > 0.0F && this.iIiIiIIiil != null) {
               float var17 = IliiIilliiIi.IilliliilIIi(var7);

               try {
                  this.llIIlilIIl(this.iIiIiIIiil, var4, 2.5F * (1.0F - var7));
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var17);
               }
            }
         }
      }
   }

   private void Iillllilll() {
      long var2 = 3147035438823266361L;
      if (this.lliilIIiil) {
         var2 ^= ((long)this.IIlIiIIiil << 32 ^ var2) & -1L << 32;
         this.lliilIIiil = false;
         this.IIlIiIIiil = -1;
         this.iIIilIIiil.IIlIlliIIl = false;
         this.iIIilIIiil.lIlIlliIIl = -1;
         this.IiillIIiil.llIIlilIIl(this.iIIilIIiil, (double)this.IlIIiIIiil, (double)this.llIIiIIiil, (int)(var2 >>> 32));
      }
   }

   private void lliIliliIl() {
      lllIlliillIlli.ilIllIiIll();
      this.IiillIIiil.Illillliilli();
      this.lIiilIIiil = true;
      this.iIiilIIiil = true;
   }

   private void illIlIilIl(class_332 ctx, long now) {
      if (!this.IliilIIiil) {
         this.lilIliilIl(ctx, this.liIIiIIiil, 1.0F, 1.0F, true);
      } else {
         float var4 = (float)(now - this.lllilIIiil) / 1000000.0F;
         if (this.lllIiIIiil != iliiIillIiiiIill.iilililill && this.iiIIiIIiil >= 0 && this.iiIIiIIiil != this.liIIiIIiil) {
            if (var4 >= 220.0F) {
               this.IliilIIiil = false;
               this.lilIliilIl(ctx, this.liIIiIIiil, 1.0F, 1.0F, true);
            } else {
               float var5 = lliiiIliliiiIl.IlIillIiilIi(var4);
               if (var5 > 0.002F) {
                  this.lilIliilIl(ctx, this.iiIIiIIiil, var5, lliiiIliliiiIl.Illillliilli(var4), false);
               }

               float var6 = lliiiIliliiiIl.IiIiliIiiiIi(var4);
               if (var6 > 0.002F) {
                  this.lilIliilIl(ctx, this.liIIiIIiil, var6, lliiiIliliiiIl.IIlilIliiIli(var4), true);
               }
            }
         } else if (var4 >= 260.0F) {
            this.IliilIIiil = false;
            this.lilIliilIl(ctx, this.liIIiIIiil, 1.0F, 1.0F, true);
         } else {
            this.lilIliilIl(ctx, this.liIIiIIiil, lliiiIliliiiIl.Iilililiiili(var4), lliiiIliliiiIl.IIiilIiiiIii(var4), true);
         }
      }
   }
}
