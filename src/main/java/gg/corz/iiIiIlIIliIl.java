package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.IntConsumer;
import net.minecraft.class_332;

public final class iiIiIlIIliIl {
   static final int Iiiillilliiillil = 1;
   private float iIilililIlililil;
   private static final float lllIililillIilil = 10.0F;
   private static final float iIIlililIlIlilil = 9.0F;
   private String illlililIillilil;
   private static final float iliIililIiiIilil = 3.5F;
   private static final float IIIlilillIIlilil = 3.0F;
   private static final float iilIililIIiIilil = 11.0F;
   private static final float IilIilillilIilil = 28.0F;
   private int Illlililllllilil;
   private static final float lIiIililiIiIilil = 6.0F;
   private final List<IIiillillIiillil> iiIlililIIllilil = new ArrayList<>();
   static final int iiiillilIIIIilil = 2;
   static final int liIIililiiIIilil = 6;
   private static final float IliIilillliIilil = 2.5F;
   private static final String[] IiIlililliIlilil = new String[256];
   private String lillililiillilil;
   private String IIililillIililil;
   private static final float IIlIilillIlIilil = 4.0F;
   static final int lIIIililiIIIilil = 3;
   private boolean llililililililil;
   private static final float liiIililiiiIilil = 160.0F;
   static final int lliillililiillil = 0;
   static final int IlIIililllIIilil = 4;
   static final int ilIIililIiIIilil = 5;
   private static final float llIlilililIlilil = 0.05F;
   private final Map<String, IIlIilllIlIill> lIllililiIllilil = new HashMap<>();
   private static final float iIlIililIllIilil = 10.0F;

   private String IIiilIiiiIii(String text, float room) {
      if (text.equals(this.lillililiillilil) && room == this.iIilililIlililil && this.IIililillIililil != null) {
         return this.IIililillIililil;
      } else {
         this.lillililiillilil = text;
         this.iIilililIlililil = room;
         this.IIililillIililil = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(text, room / 0.82F);
         return this.IIililillIililil;
      }
   }

   public iiIiIlIIliIl IIlllIlliIll(String colors, int[] active, int onPick, IntConsumer id) {
      return active != null && active.length != 0 ? this.IIillIiliIil(4, colors, "", null, false, active, onPick, null, id) : this;
   }

   void IliIlllilIi() {
      long var3 = -8070482441117236808L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.Illlililllllilil; var5 += 4294967296L) {
         IIiillillIiillil var2 = this.iiIlililIIllilil.get((int)(var5 >>> 32));
         var2.IiiilIIlil = null;
         var2.liiilIIlil = null;
         var2.iliilIIlil = null;
      }

      this.Illlililllllilil = 0;
      this.illlililIillilil = null;
      this.llililililililil = false;
   }

   public iiIiIlIIliIl iliIiiliiiii(String onClick, String text, Runnable id) {
      return this.IIillIiliIil(1, onClick, text, null, false, null, 0, id, null);
   }

   private static float Iliilliiilii(float v) {
      return (float)Math.ceil((double)v);
   }

   public iiIiIlIIliIl Illlllllilll(String id, String onClick, Runnable text) {
      return this.IIillIiliIil(5, id, onClick, null, false, null, 0, text, null);
   }

   private iiIiIlIIliIl IIillIiliIil(int active, String kind, String fn, String act, boolean colors, int[] label, int on, Runnable value, IntConsumer id) {
      IIiillillIiillil var10;
      if (this.Illlililllllilil < this.iiIlililIIllilil.size()) {
         var10 = this.iiIlililIIllilil.get(this.Illlililllllilil);
      } else {
         var10 = new IIiillillIiillil();
         this.iiIlililIIllilil.add(var10);
      }

      this.Illlililllllilil++;
      var10.IililIIlil = active;
      var10.iililIIlil = kind != null
         ? kind
         : (fn != null ? fn : Iiiiliiiiiii<"Iiiiliiiiiii","/y+ZlQV/IA9hzufILaHzY0+0rv27cGYcTgdnq+RnlD4=">() + this.Illlililllllilil);
      var10.IIiilIIlil = fn == null ? "" : fn;
      var10.lIiilIIlil = act;
      var10.iIiilIIlil = colors;
      var10.iliilIIlil = label;
      var10.lililIIlil = on;
      var10.IiiilIIlil = value;
      var10.liiilIIlil = id;
      var10.IliilIIlil = this.llililililililil;
      var10.lliilIIlil = false;
      return this;
   }

   private void IiIiliIiiiIi(
      class_332 dt, IIiillillIiillil py, IIlIilllIlIill anims, float mx, float st, float it, boolean ctx, iIllIilIlllIil hits, llillIlilillIl my, float live
   ) {
      long var17 = -1896225152726939453L;
      long var19 = -103170603098008591L;
      float var11 = 16.0F;
      if (py.IililIIlil == 4) {
         this.Illillliilli(dt, py, anims, mx, st, it, ctx, my, live);
      } else {
         var17 ^= ((long)(py.IililIIlil != 0 ? 1 : 0) << 32 ^ var17) & -1L << 32;
         var17 ^= (
               (long)(
                     ctx
                           && (int)(var17 >>> 32) != 0
                           && st >= py.iiiilIIlil
                           && st <= py.iiiilIIlil + py.IIIIiIIlil
                           && it >= mx - 1.0F
                           && it <= mx + var11 + 1.0F
                        ? 1
                        : 0
                  )
                  ^ var17
            )
            & -1L >>> 32;
         anims.liliilIIiiiliilIIi = lliiiIliliiiIl.IIIllIIliIIl(
            anims.liliilIIiiiliilIIi, (int)var17 != 0 ? 1.0F : 0.0F, (int)var17 != 0 ? 16.0F : 11.0F, live, 0.002F
         );
         anims.IIiiilIIilIiiilIIi = lliiiIliliiiIl.IIIllIIliIIl(
            anims.IIiiilIIilIiiilIIi, py.IililIIlil == 2 && py.iIiilIIlil ? 1.0F : 0.0F, 18.0F, live, 0.002F
         );
         float var14 = anims.liliilIIiiiliilIIi;
         var19 ^= (
               (long)lIlIIIliIlIIIl.IiIiliIiiiIi(dt, py.iiiilIIlil + py.IIIIiIIlil / 2.0F, mx + var11 / 2.0F, hits.IiIlliIliiIl(py.iililIIlil, 0.05F), 0.0F)
                     << 32
                  ^ var19
            )
            & -1L << 32;

         try {
            switch (py.IililIIlil) {
               case 0:
                  lIlIIIliIlIIIl.iliIiiliiiii(dt, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, 0.0F, 0.0F);
                  lIlIIIliIlIIIl.Illlllllilll(py.IIiilIIlil, py.iiiilIIlil + 7.0F, mx, var11, 0.82F, -7630437);
                  break;
               case 1:
               case 2:
               case 4:
               default:
                  lIlIIIliIlIIIl.iliIiiliiiii(dt, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, var14, anims.IIiiilIIilIiiilIIi);
                  Iilililiiili(py.IIiilIIlil, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, lIlIIIliIlIIIl.IiIlliIliiIl(var14, anims.IIiiilIIilIiiilIIi));
                  break;
               case 3:
                  this.IIlilIliiIli(dt, py, anims, mx, var11, var14);
                  break;
               case 5:
                  lIlIIIliIlIIIl.iliIiiliiiii(dt, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, var14, 0.0F);
                  Iilililiiili(py.IIiilIIlil, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, lIlIIIliIlIIIl.IiIlliIliiIl(var14, 0.0F));
                  break;
               case 6:
                  lIlIIIliIlIIIl.IlIlllIlilIl(dt, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, var14);
                  Iilililiiili(py.IIiilIIlil, py.iiiilIIlil, mx, py.IIIIiIIlil, var11, llilliilililliil.Iiiiliiiiiii());
            }
         } finally {
            lIlIIIliIlIIIl.IIlilIliiIli(dt, (boolean)((int)(var19 >>> 32)));
         }

         if (ctx) {
            if (py.IililIIlil == 3) {
               my.liiiIIllIl(py.iiiilIIlil, mx - 1.0F, py.IIIIiIIlil, var11 + 2.0F, 1, py.iililIIlil, null, py.liiilIIlil, 0);
            } else if ((int)(var17 >>> 32) != 0) {
               my.liiiIIllIl(py.iiiilIIlil, mx - 1.0F, py.IIIIiIIlil, var11 + 2.0F, 0, py.iililIIlil, py.IiiilIIlil, null, 0);
            }
         }
      }
   }

   private static void Iilililiiili(String x, float argb, float h, float label, float y, int w) {
      float var6 = lIlIIIliIlIIIl.IIlllIlliIll(x, 0.82F);
      lIlIIIliIlIIIl.Illlllllilll(x, llilliilililliil.IIIllIIliIIl(argb + (label - var6) / 2.0F), h, y, 0.82F, w);
   }

   public iiIiIlIIliIl() {
      this.iIilililIlililil = -1.0F;
   }

   public iiIiIlIIliIl IilliliilIIi() {
      this.llililililililil = true;
      return this;
   }

   public iiIiIlIIliIl lIiiIiIlilli(String id, String text) {
      return this.IIillIiliIil(0, id, text, null, false, null, 0, null, null);
   }

   public iiIiIlIIliIl Iilllilliill(String text, String onClick, Runnable id) {
      return this.IIillIiliIil(6, text, onClick, null, false, null, 0, id, null);
   }

   public iiIiIlIIliIl IiIlliIliiIl(String label, String id, String value, IntConsumer onStep) {
      return this.IIillIiliIil(3, label, id, value == null ? "" : value, false, null, 0, null, onStep);
   }

   static String Ililllililil(int v) {
      if (v >= 0 && v < IiIlililliIlilil.length) {
         String var1 = IiIlililliIlilil[v];
         if (var1 == null) {
            IiIlililliIlilil[v] = var1 = Integer.toString(v);
         }

         return var1;
      } else {
         return Integer.toString(v);
      }
   }

   private void Illillliilli(class_332 hits, IIiillillIiillil live, IIlIilllIlIill it, float dt, float st, float py, boolean ctx, llillIlilillIl mx, float my) {
      long var24 = 7669429196966282682L;
      long var26 = -4763374306393303440L;
      long var28 = -8146161789386337859L;
      long var30 = 7701065422869748938L;
      var24 ^= ((long)live.iliilIIlil.length << 32 ^ var24) & -1L << 32;
      if (it.IiiiilIIiliiiilIIi.length != (int)(var24 >>> 32)) {
         it.IiiiilIIiliiiilIIi = new float[(int)(var24 >>> 32)];
      }

      float var11 = dt + 8.0F;
      float var12 = live.iiiilIIlil + 2.5F + 5.5F;
      var24 ^= ((long)Math.max(0, Math.min((int)(var24 >>> 32) - 1, live.lililIIlil)) ^ var24) & -1L >>> 32;
      float var14 = var12 + (float)((int)var24) * 17.0F;
      it.lliiilIIiiliiilIIi = Float.isNaN(it.lliiilIIiiliiilIIi) ? var14 : lliiiIliliiiIl.IIIllIIliIIl(it.lliiilIIiiliiilIIi, var14, 20.0F, my, 0.02F);
      float var15 = 5.5F;
      var26 ^= (0L ^ var26) & -1L << 32;

      while ((int)(var26 >>> 32) < (int)(var24 >>> 32)) {
         float var17 = var12 + (float)((int)(var26 >>> 32)) * 17.0F;
         var26 ^= ((long)(ctx && Math.abs(st - var17) <= var15 + 2.5F && Math.abs(py - var11) <= var15 + 2.5F ? 1 : 0) ^ var26) & -1L >>> 32;
         it.IiiiilIIiliiiilIIi[(int)(var26 >>> 32)] = lliiiIliliiiIl.IIIllIIliIIl(
            it.IiiiilIIiliiiilIIi[(int)(var26 >>> 32)],
            (int)var26 != 0 && (int)(var26 >>> 32) != (int)var24 ? 1.0F : 0.0F,
            (int)var26 != 0 ? 16.0F : 11.0F,
            my,
            0.002F
         );
         float var19 = 1.0F + 0.12F * it.IiiiilIIiliiiilIIi[(int)(var26 >>> 32)];
         var28 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(hits, var17, var11, var19, 0.0F) << 32 ^ var28) & -1L << 32;

         try {
            var28 ^= ((long)(0xFF000000 | live.iliilIIlil[(int)(var26 >>> 32)]) ^ var28) & -1L >>> 32;
            var30 ^= ((long)(iIillliIlillli.IIiilIiiiIii((int)var28) > 0.6F ? 771751936 : 788529151) << 32 ^ var30) & -1L << 32;
            IIIiiIillIIiiIil.Ililllililil(hits, var17 - var15, var11 - var15, 11.0F, 11.0F, var15, (int)var28, (int)(var30 >>> 32));
         } finally {
            lIlIIIliIlIIIl.IIlilIliiIli(hits, (boolean)((int)(var28 >>> 32)));
         }

         if (ctx) {
            mx.liiiIIllIl(var17 - var15 - 2.5F, var11 - var15 - 2.5F, 16.0F, 16.0F, 2, live.iililIIlil, null, live.liiilIIlil, (int)(var26 >>> 32));
         }

         var26 += 4294967296L;
      }

      float var16 = var15 + 2.5F;
      IIIiiIillIIiiIil.Iiilliiliiil(
         hits,
         it.lliiilIIiiliiilIIi - var16,
         var11 - var16,
         var16 * 2.0F,
         var16 * 2.0F,
         var16,
         IIIiiIillIIiiIil.Illlllllilll() * 1.5F,
         llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.95F)
      );
   }

   public iiIiIlIIliIl IlIlllIlilIl(String onStep, String value, int id, IntConsumer label) {
      return this.IiIlliIliiIl(onStep, value, Ililllililil(id), label);
   }

   private IIlIilllIlIill Iiilliiliiil(String id) {
      IIlIilllIlIill var2 = this.lIllililiIllilil.get(id);
      if (var2 == null) {
         var2 = new IIlIilllIlIill();
         this.lIllililiIllilil.put(id, var2);
      }

      return var2;
   }

   void IlIillIiilIi(class_332 anims, float ctx, float y, float x, float my, float mx, float w, boolean h, iIllIilIlllIil live, llillIlilillIl hits) {
      long var20 = 3460815144764933561L;
      long var22 = 9021651678358860819L;
      long var24 = -681112814762877673L;
      float var11 = live.liiiIIllIl();
      float var12 = ctx + x;
      var20 ^= (0L ^ var20) & -1L << 32;

      for (var20 ^= ((long)(this.Illlililllllilil - 1) ^ var20) & -1L >>> 32; (int)var20 >= 0; var20 ^= (var20 ^ var20 + (long)-1) & -1L >>> 32) {
         IIiillillIiillil var15 = this.iiIlililIIllilil.get((int)var20);
         if (var15.IliilIIlil) {
            IIlIilllIlIill var16 = this.Iiilliiliiil(var15.iililIIlil);
            var15.IIIIiIIlil = this.IIIilIIiiIIi(var15, var16, var11);
            var12 -= var15.IIIIiIIlil;
            var15.iiiilIIlil = var12;
            var15.lliilIIlil = var12 >= ctx;
            var12 -= 4.0F;
            var20 ^= (4294967296L ^ var20) & -1L << 32;
         }
      }

      float var14 = (int)(var20 >>> 32) != 0 ? var12 + 4.0F - 10.0F : ctx + x;
      float var27 = 0.0F;

      for (var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < this.Illlililllllilil; var22 += 4294967296L) {
         IIiillillIiillil var17 = this.iiIlililIIllilil.get((int)(var22 >>> 32));
         if (!var17.IliilIIlil) {
            var17.IIIIiIIlil = this.IIIilIIiiIIi(var17, this.Iiilliiliiil(var17.iililIIlil), var11);
            var27 += var17.IIIIiIIlil + 4.0F;
         }
      }

      float var28 = ctx;
      if (this.illlililIillilil != null) {
         float var29 = var14 - ctx - var27 - (var27 > 0.0F ? 10.0F : 0.0F);
         if (var29 >= 28.0F) {
            String var18 = this.IIiilIiiiIii(this.illlililIillilil, var29);
            lIlIIIliIlIIIl.Illlllllilll(var18, ctx + 1.0F, y, my, 0.82F, -7630437);
            var28 = ctx + Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(var18, 0.82F)) + 10.0F;
         }
      }

      for (long var35 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var35 < this.Illlililllllilil; var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
         IIiillillIiillil var31 = this.iiIlililIIllilil.get((int)var35);
         if (!var31.IliilIIlil) {
            var31.iiiilIIlil = var28;
            var31.lliilIIlil = var28 + var31.IIIIiIIlil <= var14 + 0.5F;
            var28 += var31.IIIIiIIlil + 4.0F;
         }
      }

      float var30 = y + (my - 16.0F) / 2.0F;

      for (long var36 = var24 ^ (0L ^ var24) & -1L << 32; (int)(var36 >>> 32) < this.Illlililllllilil; var36 += 4294967296L) {
         IIiillillIiillil var19 = this.iiIlililIIllilil.get((int)(var36 >>> 32));
         if (var19.lliilIIlil) {
            this.IiIiliIiiiIi(anims, var19, this.Iiilliiliiil(var19.iililIIlil), var30, mx, w, h, live, hits, var11);
         }
      }
   }

   private void IIlilIliiIli(class_332 bh, IIiillillIiillil st, IIlIilllIlIill ctx, float py, float hv, float it) {
      long var18 = 5344972806137091265L;
      lIlIIIliIlIIIl.iliIiiliiiii(bh, st.iiiilIIlil, py, st.IIIIiIIlil, hv, it, 0.0F);
      float var7 = st.iiiilIIlil + 7.0F;
      lIlIIIliIlIIIl.Illlllllilll(st.IIiilIIlil, var7, py, hv, 0.82F, IilIIIIililIIIIi.Illlllllilll(-7630437, -5854026, (double)it));
      float var8 = var7 + Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(st.IIiilIIlil, 0.82F)) + 3.5F;
      long var9 = System.nanoTime();
      if (ctx.iiiiilIIiIIIIIiIIi == null) {
         ctx.iiiiilIIiIIIIIiIIi = st.lIiilIIlil;
      } else if (!Objects.equals(ctx.iiiiilIIiIIIIIiIIi, st.lIiilIIlil)) {
         ctx.lIIIIiIIiiIIIIiIIi = ctx.iiiiilIIiIIIIIiIIi;
         ctx.iiiiilIIiIIIIIiIIi = st.lIiilIIlil;
         ctx.IlIIIiIIillIIIiIIi = var9;
      }

      var18 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-920587, IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.22), (double)it) << 32 ^ var18)
         & -1L << 32;
      float var12 = ctx.lIIIIiIIiiIIIIiIIi == null ? 1.0F : (float)(var9 - ctx.IlIIIiIIillIIIiIIi) / 1000000.0F / 160.0F;
      if (var12 >= 1.0F) {
         ctx.lIIIIiIIiiIIIIiIIi = null;
         lIlIIIliIlIIIl.Illlllllilll(ctx.iiiiilIIiIIIIIiIIi, var8, py, hv, 0.82F, (int)(var18 >>> 32));
      } else {
         float var13 = lliiiIliliiiIl.IliIlllilIi(var12 / 0.55F);
         float var14 = lliiiIliliiiIl.liiiIIllIl((var12 - 0.25F) / 0.75F);
         if (var13 < 1.0F) {
            float var15 = IliiIilliiIi.IilliliilIIi(1.0F - var13);

            try {
               lIlIIIliIlIIIl.Illlllllilll(ctx.lIIIIiIIiiIIIIiIIi, var8, py - 3.0F * var13, hv, 0.82F, (int)(var18 >>> 32));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var15);
            }
         }

         if (var14 > 0.0F) {
            float var26 = IliiIilliiIi.IilliliilIIi(var14);

            try {
               lIlIIIliIlIIIl.Illlllllilll(ctx.iiiiilIIiIIIIIiIIi, var8, py + 3.0F * (1.0F - var14), hv, 0.82F, (int)(var18 >>> 32));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var26);
            }
         }
      }
   }

   boolean liiiIIllIl() {
      return this.Illlililllllilil == 0 && this.illlililIillilil == null;
   }

   public iiIiIlIIliIl IIIllIIliIIl(String onToggle, String text, boolean id, Runnable on) {
      return this.IIillIiliIil(2, onToggle, text, null, id, null, 0, on, null);
   }

   public iiIiIlIIliIl iIlIlllllill(String text) {
      this.illlililIillilil = text != null && !text.isEmpty() ? text : null;
      return this;
   }

   private float IIIilIIiiIIi(IIiillillIiillil it, IIlIilllIlIill dt, float st) {
      float var4 = switch (it.IililIIlil) {
         case 3 -> Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(it.IIiilIIlil, 0.82F))
         + 3.5F
         + Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(it.lIiilIIlil, 0.82F))
         + 14.0F;
         case 4 -> (float)it.iliilIIlil.length * 11.0F + (float)(it.iliilIIlil.length - 1) * 6.0F + 5.0F;
         case 5, 6 -> Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(it.IIiilIIlil, 0.82F)) + 18.0F;
         default -> Iliilliiilii(lIlIIIliIlIIIl.IIlllIlliIll(it.IIiilIIlil, 0.82F)) + 14.0F;
      };
      if (dt.iIiiilIIiIliiilIIi < 0.0F) {
         dt.iIiiilIIiIliiilIIi = var4;
      } else {
         dt.iIiiilIIiIliiilIIi = lliiiIliliiiIl.IIIllIIliIIl(dt.iIiiilIIiIliiilIIi, var4, 18.0F, st, 0.05F);
      }

      return dt.iIiiilIIiIliiilIIi;
   }
}
