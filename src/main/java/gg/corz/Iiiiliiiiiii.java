package gg.corz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;

public class Iiiiliiiiiii extends Iliilliiilii {
   private static final float iIIiilIlIiil = 12.0F;
   private float llIlIiilIlIi;
   private int iIilIiIlilIi;
   private float lIllIiiIllIi;
   private static final String IiiIilliiIil = "Partial preview";
   private long liiIIiiiiIIi;
   private static final float ilililIiilil = 0.72F;
   private static final String iIiIilIliIil = "File missing: ";
   private int iliiIiIiiiIi;
   private final IntConsumer iIiiilIliiil;
   private float lIiiIiiIiiIi;
   private final lIIiIiIiiIIiIiIi Illiilllliil;
   private final Runnable Iiiiilliiiil;
   private final Matrix4f liliiliiliil;
   private boolean lillIiiillIi;
   private static final long liiilliiiill = 300000000L;
   private static final float IiIiilliIiil = 5.0F;
   private String llliIiilliIi;
   private String iIlIIiIllIIi;
   private String iilIIiIIiIIi;
   private int IiilIiliilIi;
   private static final int IllIillllIil = 2;
   private float iiIlIiIIllIi;
   private final IntConsumer lliiililiiil;
   private static final String lliIililiIil = "corzclient/schematics";
   private static final float liililiiilil = 5.0F;
   private static final float iillilIIilil = 6.0F;
   private float IIIlIilIIlIi;
   private String IlIiIillIiIi;
   private int IiliIililiIi;
   private final Runnable IlIIIillIIIi;
   private int IIilIilIilIi;
   private static final float iIllilIlllil = 3.0F;
   private long iliIIiIiiIIi;
   private static final String IIiIillIiIil = "Failed to load ";
   private String[] liIIIiiiIIIi;
   private static final float llIiililIiil = 0.7F;
   private String lIIiIiiIIiIi;
   private static final String IlIlilllIlil = " -_+&\u00b7.,";
   private String iIliIiIlliIi;
   private static final float Iliilllliill = 134.0F;
   private iIilliIlIlilliIl IIliIilIliIi;
   private String IilIIililIIi;
   private static final float IIIiillIIiil = 4.0F;
   private final Map<String, iIIiilllIlIiilll> IIiiillIiiil;
   private long IliIIilliIIi;
   private static final Pattern lIIliliIIlil = Pattern.compile(
      IliIlllilIi<"IliIlllilIi","MGnXa+uWxFJpn6vQJzH0JAniS9AbaQzV8Qg2UvjXSujSgkSpzjzzOqdtrWctlZA9oIXgPQ==">()
   );
   private static boolean iiIiilIIliil;
   private static final String illIilIilIil = "Drag to rotate  \u00b7  Scroll to zoom  \u00b7  Right-drag to pan";
   private static final float lIiilliIiill = 340.0F;
   private int lIiIIiiIiIIi;
   private static final float llllililllil = 7.0F;
   private List<String> IIlIIilIlIIi;
   private static final Pattern ilIlilIiIlil = Pattern.compile(
      IliIlllilIi<"IliIlllilIi","oEAN55WM4br0jxv2teyEEPruQ9iALXhpo7nEvWO4WPyLA1mMKIpTGKEOOTO4Ol5nSUMX">()
   );
   private static final float iilillIIiill = 500.0F;
   private int liIiIiiiIiIi;
   private final iIIllilIlIllil illiilIiliil = new iIIllilIlIllil(35.0F, 26.0F, 1.0F, 0.45F, 12.0F, 80.0F).IliIlllilIi(9.0F);
   private float IlllIillllIi;
   private static final float iiIIilIIlIil = 1.1F;
   private static final Set<String> liIliliiIlil = Set.of(
      IliIlllilIi<"IliIlllilIi","wDF8cZ10+sKzDJIMSqcBtdG5CSTB/Oh4dRaVKrMd">(),
      IliIlllilIi<"IliIlllilIi","9tjSsM/w7bZtmvqS1OuQXjw9F5eW39I+hpbFe5+5rQ==">(),
      IliIlllilIi<"IliIlllilIi","FY9ADofrxuPS183L/TMynhszTgKKxmN43pn4z2t8">(),
      IliIlllilIi<"IliIlllilIi","NwFn7kevTrY8q3T6ODDLrQVwXxTcpzExwFj1nZQ8zSc=">(),
      IliIlllilIi<"IliIlllilIi","o3V4c/vjW3ge7b1zcbd/J/vdAPDwuMmRwR/jrlwbNxw=">(),
      IliIlllilIi<"IliIlllilIi","w8i9P8qHrsRjOAGaLJQhQ+sT10G0Pd8n800LzZrJSw==">(),
      IliIlllilIi<"IliIlllilIi","LXjVXeBhYRjXqJ2vo6UwcGRLZ61XmH/PIeE1tA7fQI2Y">(),
      IliIlllilIi<"IliIlllilIi","uxD++5fV3HmL5WacWs8bUs6HMr/RlOOb5zln5gUGnR0eEEc=">(),
      IliIlllilIi<"IliIlllilIi","6P9C7ADxVi0LGpzajVuJC1NPejuUgD7OPCYE7+gSez1aSw==">(),
      IliIlllilIi<"IliIlllilIi","zwoixcQxVGe8CYpmaOLSyywjrnjzYtoWU9LV74P178VsdA==">(),
      IliIlllilIi<"IliIlllilIi","z4eeLd9JR7qczdFJtG0r0fXRN41skkTDVGkU2zeSlWfPzmU=">()
   );
   private static final float iIIIilIlIIil = 8.0F;
   private static final long iliillIiiill = 1500000000L;
   private final Runnable iiiiilIIIIIi;
   private float iiliIiIIiiIi;
   private float iIIlIiIlIlIi;
   private static final float lIililiIilil = 13.0F;
   private static final float IIllillIllil = 6.0F;
   private String lllIIiillIIi;
   private final Runnable lIIIIiiIIIIi;
   private static final float IIIIillIIIil = 20.0F;
   private static final float llIIililIIil = 4.0F;
   private static final float Ilililllilil = 13.0F;
   private static final float Iillillillil = 12.0F;
   private static final float IiIIilliIIil = 7.0F;
   private float IliiIilliiIi;
   private static final float lIlIiliIlIil = 1.5F;
   private int ilIiIiIiIiIi;
   private float IiIlIiliIlIi;
   private static final String iiiIilIIIlil = "Reset view";
   private String iiilIiIIIiIi;
   private String[] ilIIIiIiIIIi;
   private static final String lilIiliilIil = "Loading schematic";
   private static Iiiiliiiiiii lIliiliIliil;
   private float illlIiIillIi;
   private int llilIiililIi;

   protected final int Illlilllli() {
      return this.ilIIIiIiIIIi.length;
   }

   protected final void IiIliliIli() {
      this.IlIiillIii();
   }

   protected final int lIlliiIlli() {
      return this.lIiIIiiIiIIi;
   }

   @Override
   protected void lilIliilIl() {
      this.IIllllIlll();
   }

   @Override
   public float IIIilIIiiIIi() {
      return 134.0F;
   }

   private void IliIilliIi(class_332 live, iIIiliiIlIilii x, float stage, float h, float ctx, boolean y) {
      long var17 = 2324010779992055668L;
      long var19 = -7085506339396485583L;
      var17 ^= ((long)this.IiliIililiIi << 32 ^ var17) & -1L << 32;
      if ((int)(var17 >>> 32) > 1) {
         String var8 = this.IIililIili();
         if ((int)(var17 >>> 32) != this.iliiIiIiiiIi) {
            this.iliiIiIiiiIi = (int)(var17 >>> 32);
            this.IliiIilliiIi = 42.0F
               + (float)Math.ceil(
                  (double)lIlIIIliIlIIIl.IIlllIlliIll(
                     IliIlllilIi<"IliIlllilIi","vd6QFl/houGqdQyQCd9Mo6lnELd3w1O13xV/kcBZ/riEaA==">()
                        + (int)(var17 >>> 32)
                        + IliIlllilIi<"IliIlllilIi","JhRSTjIINTqVbzHPHTSuMaVe/XarlFOOsdTFN4p/Wqc=">()
                        + (int)(var17 >>> 32),
                     0.72F
                  )
               );
         }

         float var9 = this.IliiIilliiIi;
         var17 ^= ((long)(this.IIilIilIilIi >= 0 ? 1 : 0) ^ var17) & -1L >>> 32;
         lIlIIIliIlIIIl.IIIllIIliIIl(live, stage, h, var9, ctx, 4.0F, 0.0F, (int)var17 != 0 ? 1.0F : 0.0F);
         var19 ^= ((long)((int)var17 != 0 ? this.IIilIilIilIi : (int)(var17 >>> 32) - 1) << 32 ^ var19) & -1L << 32;
         this.iliIiIiiIi(
            live,
            x,
            IliIlllilIi<"IliIlllilIi","F/JJd2M39w60Tgj+NE3hjY5PxJ0th/9oE2LBB5fSfqnFhnLP">(),
            lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<"IliIlllilIi","a+84KOUpA2tftoSNM8LUZ4VcjyByPeb4EB6B5c+D2G1TlaoQScsliw==">()),
            stage,
            h,
            ctx,
            y && (int)(var19 >>> 32) > 0,
            this.iiiiilIIIIIi
         );
         this.iliIiIiiIi(
            live,
            x,
            IliIlllilIi<"IliIlllilIi","GU8jouGZFrT5F74BdZ+OHhjXSf661qymcSJJc9ZEOJvIlqqA">(),
            lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<"IliIlllilIi","YqSQ/eOMqfvIEz+Yact8bfU3qCqYieJTtBl6XXf4/KpTYrLjYPPyqCU=">()),
            stage + var9 - 12.0F,
            h,
            ctx,
            y && (int)var17 != 0,
            this.lIIIIiiIIIIi
         );
         float var12 = var9 - 24.0F;
         float var13 = 10.0F + lIlIIIliIlIIIl.IIlllIlliIll(var8, 0.72F);
         float var14 = llilliilililliil.IIIllIIliIIl(stage + 12.0F + (var12 - var13) / 2.0F);
         float var15 = y ? x.lIiiIiIlilli(IliIlllilIi<"IliIlllilIi","h5ALm6+4nB4S5P4Mwi4raNQplT1pqtPLcHmJ9xnnuVj6XAkG">(), stage + 12.0F, h, var12, ctx) : 0.0F;
         var19 ^= ((long)((int)var17 != 0 ? lIlIIIliIlIIIl.IiIlliIliiIl(var15, 1.0F) : IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var15)) ^ var19)
            & -1L >>> 32;
         lIlIIIliIlIIIl.IIIilIIiiIIi(
            lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<"IliIlllilIi","t9s10IFWUzkHeD4g12uLUHShRUBP0bjpFJnOzaVxcnoQYQ==">()),
            var14,
            llilliilililliil.IIIllIIliIIl(h + (ctx - 7.0F) / 2.0F),
            7.0F,
            (int)var19
         );
         lIlIIIliIlIIIl.Illlllllilll(var8, var14 + 7.0F + 3.0F, h, ctx, 0.72F, (int)var19);
         if (y) {
            x.IlIlllIlilIl(IliIlllilIi<"IliIlllilIi","h5ALm6+4nB4S5P4Mwi4raNQplT1pqtPLcHmJ9xnnuVj6XAkG">(), stage + 12.0F, h, var12, ctx, this.lliiililiiil);
         }
      }
   }

   private static float IilIililIi(String s) {
      return (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(s, 0.7F)) + 10.0F;
   }

   protected final void iiIliIIlli() {
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
      }
   }

   private static String IIIillIIil(String file) {
      long var2 = -2976869230224327679L;
      var2 ^= ((long)file.lastIndexOf(46) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 ? file.substring(0, (int)(var2 >>> 32)) : file;
   }

   private static void iilIiIIiIi(class_332 ctx, String w, float y, float x, float ink, float s, int h) {
      lIlIIIliIlIIIl.IIIllIIliIIl(ctx, y, x, ink, s, 4.0F, 0.0F, 0.0F);
      lIlIIIliIlIIIl.Illlllllilll(w, y + 5.0F, x, s, 0.7F, h);
   }

   private void ilIiiIiIii() {
      this.illiilIiliil.IliIlllilIi(0.0F);
      iiIiilIIliil = true;
   }

   private void lliililiil(iIIiilllIlIiilll job, lIlIlilliIlIlill s) {
      iiiIiIilIIIliIil var3 = s.IIIllIIliIIl();

      IlIIllillIIlli var4;
      try {
         var4 = IlIIllillIIlli.IliIlllilIi(
            var3.iiIIIilIil, var3.IIlIIilIil, null, IliIlllilIi<"IliIlllilIi","V2Xt5HYsY4ejj87OrWDIDuB35Ejk39nnMAfdVcc8Zkfv4gLRsyhoPjvfcCKmHmT/e4nn">()
         );
      } catch (Throwable var6) {
         iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<"IliIlllilIi","PMBG0XYY5v/qWq0yAQ/P3aCwSHxTfKysNyLXVCbOqqA=">(), var6);
         return;
      }

      if (job.iIliiIlill != null) {
         job.iIliiIlill.close();
      }

      job.iIliiIlill = var4;
      job.IlliiIlill = var3.lIlIIilIil - job.IiIiiIlill.llililiIll;
   }

   @Override
   protected void illIlIilIl() {
      this.iliIIiIiiIIi = System.nanoTime();
      this.IliIIilliIIi = this.iliIIiIiiIIi;
      lIliiliIliil = this;
   }

   private boolean iIIilIlIil() {
      String var1 = this.Illiilllliil.IIIllIIliIIl();
      return var1 != null
         && var1.startsWith(IliIlllilIi<"IliIlllilIi","jnLzs++JeLatcrN14piaumKH9X0tLFm2f3/mFAelQhmODp/A">())
         && var1.endsWith(IliIlllilIi<"IliIlllilIi","t2JjzdBrM9TUexNiaagPaE7Dq3lMiJ19iH88ESyACQ==">());
   }

   @Override
   public boolean IiIIlliIIl(iIIiliiIlIilii x, double y, double amount, double stage) {
      this.illiilIiliil.iliIiiliiiii(stage);
      iIIiilllIlIiilll var8 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var8 != null && var8.IiIiiIlill != null && var8.IiliiIlill > 0.0F) {
         float var9 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
         this.iiIlIiIIllIi = (float)(y - (double)x.IliIlllilIi()) * var9 / var8.IiliiIlill;
         this.lIllIiiIllIi = (float)(-(amount - (double)x.liiiIIllIl())) * var9 / var8.IiliiIlill;
         this.lillIiiillIi = true;
      }

      return true;
   }

   protected final boolean IIIlilIIli() {
      return this.llIililIil(this.iIlIIiIllIIi);
   }

   protected final boolean llIliilIli() {
      return this.ilIIIiIiIIIi.length > 0 || this.Illiilllliil.lIiiIiIlilli() != null;
   }

   @Override
   public void IIIllIIliIIl(class_332 ctx, iIIiliiIlIilii stage) {
      String var3 = this.IlIIillIIi(stage.iIlIlliIIl);
      iIIiilllIlIiilll var4 = this.IIiiillIiiil.get(var3);
      if (var4 != null && var4.liIiiIlill != null && var4.IiIiiIlill != null) {
         float var5 = var4.iiIiiIlill == 0L ? Float.MAX_VALUE : (float)(System.nanoTime() - var4.iiIiiIlill) / 1000000.0F;
         float var6 = var4.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.Iilililiiili(var5);
         if (var6 < 1.0F) {
            this.IIlIilIlIi(ctx, stage, 1.0F - var6);
         }

         this.liIIiiiIIi(ctx, stage, var4, var6, var4.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.IIiilIiiiIii(var5));
      } else if (this.ilIIIiIiIIIi.length == 0 && this.Illiilllliil.lIiiIiIlilli() == null) {
         lIlIIIliIlIIIl.Iiilliiliiil(
            ctx,
            stage.lIIIlliIIl,
            stage.iIIIlliIIl,
            stage.IlIIlliIIl,
            stage.llIIlliIIl,
            lIlIIiliIlIIil.IIIIllIIIl(IliIlllilIi<"IliIlllilIi","9Myzq7/p4g+AeQIlKevDeKSYqEEIwLzgNnY84pRgHJ0+9w==">()),
            IliIlllilIi<"IliIlllilIi","sLdhz3Y/ASv8AeiYc0CqTPB1dZoXna9Zgu3RSL+X6SOOLiD3RqOkwx4tFHm1">(),
            IliIlllilIi<"IliIlllilIi","NqInSrglvBpcP4l5fLtaAcCI3aTtrf7UhiTGvSgVcLcz5RIbOQN0dkEgvZrKYKdcvvBDA505IgtKwGj0dSqtd11jutZlh/UB9NIzvXFVNBMKdJ0=">()
         );
      } else if (var3.isEmpty()) {
         lIlIIIliIlIIIl.Iiilliiliiil(
            ctx,
            stage.lIIIlliIIl,
            stage.iIIIlliIIl,
            stage.IlIIlliIIl,
            stage.llIIlliIIl,
            lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<"IliIlllilIi","cnoMA3jAB5bwyyAVHeRxtWw7N0pmH2snPgF3PuqYNFs=">()),
            IliIlllilIi<"IliIlllilIi","EeW1t3AhlAC88oSx3T+94usYLqg78jZc7k0U7pKidTc862QzkmeXLJOVOFc=">(),
            IliIlllilIi<"IliIlllilIi","nsEiOCXhup8wQRpOF3ilo8GZECzwZnVlAPdNpbHkqapu1P85U2D4BtjQTnYuCr663FaQAQ==">()
         );
      } else if (var4 != null && var4.IiIiiIlill != null && var4.IiIiiIlill.IliIlllilIi()) {
         lIlIIIliIlIIIl.Iiilliiliiil(
            ctx,
            stage.lIIIlliIIl,
            stage.iIIIlliIIl,
            stage.IlIIlliIIl,
            stage.llIIlliIIl,
            lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<"IliIlllilIi","cnoMA3jAB5bwyyAVHeRxtWw7N0pmH2snPgF3PuqYNFs=">()),
            IliIlllilIi<"IliIlllilIi","nE9BZeSYVMvd8TXqkqAfnS362GIrgLY8ThK9KLzp7syo++LBMjgYfIeb80sZuQ==">(),
            IliIlllilIi<"IliIlllilIi","W5BM0ME3fsiQ1Jr7OhFdNw31N/Q+wa/pTQ5uAK89uwlewzFvDgc4iw6e1TdXi4rLOVWLjWGjxcY=">()
         );
      } else if (var4 != null && var4.IiIiiIlill != null && iilIIiiIIiIIii.iIlIlllllill()) {
         this.ilIIiIiIIi(ctx, stage);
      } else if (this.llIililIil(var3)) {
         lIlIIIliIlIIIl.Iiilliiliiil(
            ctx,
            stage.lIIIlliIIl,
            stage.iIIIlliIIl,
            stage.IlIIlliIIl,
            stage.llIIlliIIl,
            lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<"IliIlllilIi","3epnbD4uYENoLRGschfJgy959dHd3ifMwR0QbkHlszZc">()),
            IliIlllilIi<"IliIlllilIi","Ms1beOrlC5Fn3d2ZvtpLzyXTHwbHeCVe61O5RGd9CrruF+H2iti4ILwKxCMs84r/xA5YDZ/x6yo=">(),
            IliIlllilIi<"IliIlllilIi","NFV/Plv92XJhacnPJ/I6riBWl40Y1bWzXpvaN9D8fFiyDRq0jBHJXr4xDFjzXYbntbqJ6z23Vz3ypfhRG64mR4NXp2h0MrBGKSBebN0NGlfwxQ==">()
         );
      } else if (var4 != null && var4.IIliiIlill) {
         lIlIIIliIlIIIl.Iiilliiliiil(
            ctx,
            stage.lIIIlliIIl,
            stage.iIIIlliIIl,
            stage.IlIIlliIIl,
            stage.llIIlliIIl,
            lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<"IliIlllilIi","cnoMA3jAB5bwyyAVHeRxtWw7N0pmH2snPgF3PuqYNFs=">()),
            IliIlllilIi<"IliIlllilIi","0LIpDyuQwp9pfKDuw/yB3aPl3OwbZfZKMgHC0nhsScvBlOYfl5ejDAmuaJIZelxzuMRHDa28eul0">(),
            IliIlllilIi<"IliIlllilIi","ZfrnWu1MvgLj3E6IbG3w13fhvixMUTkF06eb/IJ6AT2xTZ2P/3MdxVqXruP7qQBWk+budi1wGMN8jwzT">()
         );
      } else {
         this.IIlIilIlIi(ctx, stage, 1.0F);
      }
   }

   private void iIiliIlili(int dir) {
      long var4 = 1183034291329014831L;
      var4 ^= ((long)this.IiliIililiIi << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 1 && dir != 0) {
         var4 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var4 >>> 32) - 1 : this.IIilIilIilIi) ^ var4) & -1L >>> 32;
         var4 ^= ((long)Math.floorMod((int)var4 - Integer.signum(dir), (int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         this.IIilIilIilIi = (int)var4 >= (int)(var4 >>> 32) - 1 ? -1 : (int)var4;
      }
   }

   private void ilIIiIiIIi(class_332 stage, iIIiliiIlIilii ctx) {
      lIlIIIliIlIIIl.Iiilliiliiil(
         stage,
         ctx.lIIIlliIIl,
         ctx.iIIIlliIIl,
         ctx.IlIIlliIIl,
         ctx.llIIlliIIl,
         lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<"IliIlllilIi","cnoMA3jAB5bwyyAVHeRxtWw7N0pmH2snPgF3PuqYNFs=">()),
         IliIlllilIi<"IliIlllilIi","WenAFC/A1ffj45b1SJRV4Mzku64hUXE3AaltQdyGwd5eIK7MAMWtzZJhz6MpLb3z5w4=">(),
         IliIlllilIi<"IliIlllilIi","MC9TcdGuda2Vi4TGN4e/J1djB2YV8Z8bWRZj5ueb1Kf9jtlk8OMUUIm2SXaEIVWNeSEhA8OApf2zieSyBjD6yVqpa1Vzp4VHwQ33hgsp">()
      );
   }

   public static String liIiiiiIii(String arg) {
      long var7 = -6746214662658995039L;
      long var9 = -187561428285648895L;
      Iiiiliiiiiii var1 = lIliiliIliil;
      if (var1 != null && class_310.method_1551().field_1755 == var1) {
         String[] var2 = arg.trim().split(IliIlllilIi<"IliIlllilIi","xZ691/xtCRBbsvAqzYdMO0/9HS3gUmfCEby/gEN/Fw==">());

         try {
            String var3 = var2[0].toLowerCase(Locale.ROOT);
            var7 ^= (-4294967296L ^ var7) & -1L << 32;
            switch (var3.hashCode()) {
               case 110749:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","Z/DRSSdl+SCpn90WnNRa5tzwGw7ISWnIyfCEUqWO7w==">())) {
                     var7 ^= (17179869184L ^ var7) & -1L << 32;
                  }
                  break;
               case 3440673:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","RryVUdb98zAl5Pn/ugP49rtLt85lSkNGiZ+HygSMVKc=">())) {
                     var7 ^= (12884901888L ^ var7) & -1L << 32;
                  }
                  break;
               case 3536962:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","8Lqxw88Y/NHIoX6CzwjYhkBoHCB30Oe9ltp8Girrh60=">())) {
                     var7 ^= (25769803776L ^ var7) & -1L << 32;
                  }
                  break;
               case 3744723:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","HNZ7H96vZjmSKVkxFbMNKH72ngFBegkURWbuEygxQ+Q=">())) {
                     var7 ^= (4294967296L ^ var7) & -1L << 32;
                  }
                  break;
               case 102749521:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","DuxVZZ+aXYaAIlwQ4fat0iaI2uGJVp1zV3VbYP3FU5mn">())) {
                     var7 ^= (8589934592L ^ var7) & -1L << 32;
                  }
                  break;
               case 106004554:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","QRL3rc8gelZSk+2O0sK68C3MLAYHQZcdU6cNwfGhvFVU">())) {
                     var7 ^= (0L ^ var7) & -1L << 32;
                  }
                  break;
               case 108404047:
                  if (var3.equals(IliIlllilIi<"IliIlllilIi","vAq+o6LgMx42yGy0aoQyQZIh/5X/Pj3I6sNe3BqoMIbM">())) {
                     var7 ^= (21474836480L ^ var7) & -1L << 32;
                  }
            }

            switch ((int)(var7 >>> 32)) {
               case 0:
                  var1.ilIiiIiIii();
                  float var5 = Float.parseFloat(var2[1]);
                  float var6 = var2.length > 2 ? Float.parseFloat(var2[2]) : 26.0F;
                  var1.illiilIiliil.liiiIIllIl();
                  var1.illiilIiliil
                     .iIlIlllllill((double)(-(var5 - var1.illiilIiliil.Illlllllilll()) / 1.6F), (double)((var6 - var1.illiilIiliil.Iilllilliill()) / 0.6F));
                  var1.illiilIiliil.IilliliilIIi();
                  break;
               case 1:
                  var1.illiilIiliil.IIIllIIliIIl(Float.parseFloat(var2[1]));
                  break;
               case 2:
                  var7 ^= ((long)var1.IiliIililiIi ^ var7) & -1L >>> 32;
                  var9 ^= (
                        (long)(
                                 var2[1].equalsIgnoreCase(IliIlllilIi<"IliIlllilIi","5XumRXJelUY7fcqM/jvYAbuq7/EgG3vyO42GxJMJkw==">())
                                    ? -1
                                    : Integer.parseInt(var2[1]) - 1
                              )
                              << 32
                           ^ var9
                     )
                     & -1L << 32;
                  var1.IIilIilIilIi = (int)(var9 >>> 32) >= 0 && (int)(var9 >>> 32) < (int)var7 - 1 ? (int)(var9 >>> 32) : -1;
                  break;
               case 3:
                  var7 ^= ((long)(Integer.parseInt(var2[1]) - 1) ^ var7) & -1L >>> 32;
                  if ((int)var7 >= 0 && (int)var7 < var1.ilIIIiIiIIIi.length) {
                     var1.lIliliIlil(var1.ilIIIiIiIIIi[(int)var7]);
                     var1.iiilllIIIill.Iilllilliill(var1.lIiIIiiIiIIi, true);
                  }
                  break;
               case 4:
                  var1.ilIiiIiIii();
                  var1.llIlIiilIlIi = Float.parseFloat(var2[1]);
                  var1.IiIlIiliIlIi = Float.parseFloat(var2[2]);
                  var1.lIIIiiIIIi();
                  break;
               case 5:
                  var1.lIIiiiIIii();
                  break;
               case 6:
                  var1.illiilIiliil
                     .IliIlllilIi(
                        var2.length > 1 && var2[1].equalsIgnoreCase(IliIlllilIi<"IliIlllilIi","wDZmXuVZvYuxmmPwCRZ1f8XIKYxoy7tquvL0iJZPAg==">()) ? 0.0F : 9.0F
                     );
                  break;
               default:
                  return IliIlllilIi<"IliIlllilIi","7YAijf9JyWUj32o1GhJx1Ly2NqnKz3JmLmySdbcB17KsFED6hX2Zte4MCA==">() + arg;
            }
         } catch (RuntimeException var11) {
            return IliIlllilIi<"IliIlllilIi","xGctxIeWd7jTlL0upXueETePYWk+XBQvieDKJlk6v4UYqoD06e5SrO6HEJA=">() + arg;
         }

         iIIiilllIlIiilll var12 = var1.IIiiillIiiil.get(var1.iIlIIiIllIIi);
         return String.format(
            Locale.ROOT,
            IliIlllilIi<"IliIlllilIi","DRQJOUfVEELAjjAILEg0YePfagBEjk1ROT79Dxal80krdkCqIwYfAPd0aFrQh1llcxUNx4oY1zcYg1gQfYkqFBftHPsitPreFvS1Ky3CxA0ayeFMuGwltwX+VNjHCWmoEQWGhwG1gaHmmXSxxvBW">(),
            arg,
            var1.iIlIIiIllIIi,
            var12 != null && var12.liIiiIlill != null,
            var12 != null && var12.IiIiiIlill != null ? var12.IiIiiIlill.IlililiIll : 0,
            var1.iIilIiIlilIi,
            var1.illiilIiliil.Illlllllilll(),
            var1.illiilIiliil.Iilllilliill(),
            var1.illiilIiliil.IIillIiliIil(),
            iilIIiiIIiIIii.iIlIlllllill()
               ? IliIlllilIi<"IliIlllilIi","VjUsy6yjT6WSnZsDiOxCupKabGNqqZarUBkcRIlm8/VxSA==">()
               : IliIlllilIi<"IliIlllilIi","xpHS9Qz7GHTUAwM1XM5Z+eKHVh9nFSn4gSCUV7If">()
         );
      } else {
         return IliIlllilIi<"IliIlllilIi","S4V42IqSoTmS0RqqByNAFXg5F9SJa5ftWByq6RLGGmMVztfcJlqtcAnY99r/PP7PBSCB">();
      }
   }

   public static String lIilliIill(String file) {
      return ilillIiill(file, true, false);
   }

   private void lllIiillIi(class_332 stage, iIIiliiIlIilii ctx, boolean partial) {
      if (this.iIliIiIlliIi != null && this.llliIiilliIi != null) {
         float var4 = 12.0F;
         float var5 = llilliilililliil.IIIllIIliIIl(ctx.iIIIlliIIl + 6.0F);
         float var6 = ctx.lIIIlliIIl + ctx.IlIIlliIIl - 6.0F;
         float var7 = IilIililIi(this.llliIiilliIi);
         float var8 = IilIililIi(this.iIliIiIlliIi);
         iilIiIIiIi(stage, this.llliIiilliIi, var6 - var7, var5, var7, var4, -7630437);
         iilIiIIiIi(stage, this.iIliIiIlliIi, var6 - var7 - 3.0F - var8, var5, var8, var4, -7630437);
         if (partial) {
            float var9 = IilIililIi(IliIlllilIi<"IliIlllilIi","dSUVSD0Sq38EblmZ5J3xYuqBP2s7wUrWOIJjNVTcLxmlWlm2ih6TsQNXww==">());
            iilIiIIiIi(
               stage,
               IliIlllilIi<"IliIlllilIi","dSUVSD0Sq38EblmZ5J3xYuqBP2s7wUrWOIJjNVTcLxmlWlm2ih6TsQNXww==">(),
               var6 - var7 - var8 - 6.0F - var9,
               var5,
               var9,
               var4,
               -1535700
            );
         }
      }
   }

   @Override
   public void iIIIlIlIIl(iIIiliiIlIilii dx, double dy, double y, double x, double stage, int button) {
      if (button != 0) {
         iIIiilllIlIiilll var11 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
         if (var11 != null && var11.IiIiiIlill != null) {
            float var12 = var11.IiliiIlill * this.illiilIiliil.IIillIiliIil();
            if (!(var12 <= 0.0F)) {
               float var13 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
               this.llIlIiilIlIi += (float)x * var13 / var12;
               this.IiIlIiliIlIi -= (float)stage * var13 / var12;
               this.lIIIiiIIIi();
            }
         }
      } else {
         if (x != 0.0 || stage != 0.0) {
            this.liiIIiiiiIIi = 0L;
         }

         this.illiilIiliil.iIlIlllllill(x, stage);
      }
   }

   protected final boolean liiIiiiiIi() {
      String var1 = this.Illiilllliil.iliIiiliiiii();
      return !this.iIlIIiIllIIi.isEmpty()
         && this.iIlIIiIllIIi.equals(var1)
         && this.Illiilllliil.lIiiIiIlilli() != null
         && this.iilIIiIIiIIi == null
         && !this.iIIilIlIil();
   }

   @Override
   public void method_25432() {
      super.method_25432();
      this.IIllllIlll();
   }

   private void iiIilIIlil(String file) {
      this.lllIIiillIIi = this.iIlIIiIllIIi;
      this.iIlIIiIllIIi = file;
      this.lIiIIiiIiIIi = this.liilliiill(file);
      this.Illillllil();
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
      }
   }

   private void liIIiiiIIi(class_332 scale, iIIiliiIlIilii alpha, iIIiilllIlIiilll ctx, float stage, float s) {
      long var20 = -4527457329113842842L;
      long var22 = 3222446146031490025L;
      long var24 = 3848973334062474433L;
      if (!iilIIiiIIiIIii.liiiIIllIl()) {
         this.ilIIiIiIIi(scale, alpha);
      } else if (!(stage <= 0.002F)) {
         liIIliIliiIIliIl var6 = ctx.IiIiiIlill;
         float var7 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
         var20 ^= ((long)Math.max(1, Math.round(alpha.IlIIlliIIl * var7)) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)Math.max(1, Math.round(alpha.llIIlliIIl * var7)) ^ var20) & -1L >>> 32;
         if (ctx.llliiIlill != (int)(var20 >>> 32) || ctx.illiiIlill != (int)var20) {
            ctx.llliiIlill = (int)(var20 >>> 32);
            ctx.illiiIlill = (int)var20;
            ctx.IiliiIlill = ilIIliilIiIIliil.iIlIlllllill(
               var6.ilililiIll, var6.IiililiIll, var6.liililiIll, (float)((int)(var20 >>> 32)), (float)((int)var20), 26.0F
            );
         }

         var22 ^= ((long)ctx.IlIiiIlill.equals(this.iIlIIiIllIIi) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)((int)(var22 >>> 32) != 0 ? this.iIilIiIlilIi : -1) ^ var22) & -1L >>> 32;
         float var12 = ctx.IiliiIlill * this.illiilIiliil.IIillIiliIil();
         float var13 = ilIIliilIiIIliil.liiiIIllIl(var6.ilililiIll, var6.IiililiIll, var6.liililiIll);
         ilIIliilIiIIliil.IilliliilIIi(
            this.liliiliiliil,
            var6.iiililiIll,
            var6.IIIiiliIll,
            var6.lIIiiliIll,
            var13,
            this.illiilIiliil.Illlllllilll(),
            this.illiilIiliil.Iilllilliill(),
            var12,
            (int)(var22 >>> 32) != 0 ? this.IIIlIilIIlIi : 0.0F,
            (int)(var22 >>> 32) != 0 ? this.iIIlIiIlIlIi : 0.0F,
            (float)((int)(var20 >>> 32)),
            (float)((int)var20)
         );
         IlIIllillIIlli var14 = (int)var22 >= 0 && ctx.IlliiIlill == (int)var22 ? ctx.iIliiIlill : null;
         var24 ^= ((long)iilIIiiIIiIIii.iliIiiliiiii((int)(var20 >>> 32), (int)var20) << 32 ^ var24) & -1L << 32;
         float var16 = gg.corz.IliiIilliiIi.IilliliilIIi(stage);
         var24 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(scale, alpha.IliIlllilIi(), alpha.liiiIIllIl(), s, 0.0F) ^ var24) & -1L >>> 32;

         try {
            iilIIiiIIiIIii.IIIllIIliIIl(
               ctx.liIiiIlill,
               var6.liiiIIllIl((int)var22),
               var6.iIlIlllllill((int)var22),
               (int)var22 > 0 ? var6.liiiIIllIl((int)var22 - 1) : 0,
               (int)var22 > 0 ? var6.iIlIlllllill((int)var22 - 1) : 0,
               var6.IilliliilIIi((int)var22),
               (int)var22 > 0 ? var6.IilliliilIIi((int)var22 - 1) : 0,
               var14,
               this.liliiliiliil,
               (int)(var20 >>> 32) * (int)(var24 >>> 32),
               (int)var20 * (int)(var24 >>> 32)
            );
            iilIIiiIIiIIii.IIlllIlliIll(
               IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
               alpha.lIIIlliIIl,
               alpha.iIIIlliIIl,
               alpha.IlIIlliIIl,
               alpha.llIIlliIIl,
               alpha.IilIlliIIl,
               gg.corz.IliiIilliiIi.IIIllIIliIIl()
            );
         } catch (Throwable var28) {
            iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<"IliIlllilIi","lMckiZLd/rSWoBZzzr4/n4LY5SoAl04GTeUQ1NeM1FJJuA==">(), var28);
         } finally {
            lIlIIIliIlIIIl.IIlilIliiIli(scale, (boolean)((int)var24));
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var16);
         }
      }
   }

   @Override
   public float IilliliilIIi() {
      return 500.0F;
   }

   @Override
   public void IIlllIlliIll(iiIiIlIIliIl f) {
      if (this.ilIIIiIiIIIi.length == 0 && this.Illiilllliil.lIiiIiIlilli() == null) {
         f.iIlIlllllill(IliIlllilIi<"IliIlllilIi","1g5OO/zIMIvrTwfkfemEO+WkSK5dmmXHYKAGz9KCl/qe1tszkVNX7elB6iSFUkq6Aw==">())
            .IilliliilIIi()
            .Iilllilliill(
               IliIlllilIi<"IliIlllilIi","9Myzq7/p4g+AeQIlKevDeKSYqEEIwLzgNnY84pRgHJ0+9w==">(),
               IliIlllilIi<"IliIlllilIi","ygg6EOtZVTlpjqmt7bLkmfGuZcHkTpMg+eiuHZLaVBUcGs5G/nvY">(),
               this.IlIIIillIIIi
            );
      }
   }

   public Iiiiliiiiiii(class_437 parent, lIIiIiIiiIIiIiIi manager) {
      this(parent, manager, IliIlllilIi<"IliIlllilIi","G/p6Xn7VFx6+Kdm2pZqGBC8+531xFvQbIJGhI83nl727m3gWxKlduLxQ3aEh">());
   }

   @Override
   public void IlIillIiilIi(int index) {
      if (index >= 0 && index < this.ilIIIiIiIIIi.length) {
         this.lIliliIlil(this.ilIIIiIiIIIi[index]);
      }
   }

   @Override
   public void iliIiiliiiii(float dt) {
      long var6 = -3724284162366865747L;
      long var2 = System.nanoTime();
      if (var2 - this.IliIIilliIIi > 1500000000L) {
         this.IliIIilliIIi = var2;
         this.iIlllIllll();
      }

      this.illiilIiliil.IIlllIlliIll(dt);
      this.iiiilIIIIi(dt);
      this.IiIilliIil();
      this.IIiillIiil();
      this.Iiiilliiil();
      iIIiilllIlIiilll var4 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      var6 ^= ((long)(var4 != null && var4.liIiiIlill != null ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.illlIiIillIi = lliiiIliliiiIl.IIIllIIliIIl(this.illlIiIillIi, !iiIiilIIliil && (int)(var6 >>> 32) != 0 ? 1.0F : 0.0F, 8.0F, dt, 0.002F);
   }

   private String IlIIillIIi(int item) {
      return this.Illlllllilll() != 0 && item >= 0 && item < this.ilIIIiIiIIIi.length ? this.ilIIIiIiIIIi[item] : this.iIlIIiIllIIi;
   }

   private int liilliiill(String file) {
      long var3 = -2289766204081353311L;
      if (file != null && !file.isEmpty()) {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.ilIIIiIiIIIi.length; var5 += 4294967296L) {
            if (this.ilIIIiIiIIIi[(int)(var5 >>> 32)].equals(file)) {
               return (int)(var5 >>> 32);
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void Iillllilll(List<String> list) {
      long var8 = 6628420503380646037L;
      long var10 = -1092414143266685031L;
      this.IIlIIilIlIIi = List.copyOf(list);
      var8 ^= ((long)list.size() << 32 ^ var8) & -1L << 32;
      String[] var3 = list.toArray(new String[0]);
      String[] var4 = new String[(int)(var8 >>> 32)];
      HashMap var5 = new HashMap();

      for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         var4[(int)var8] = Ilillllill(var3[(int)var8], true);
         var5.merge(var4[(int)var8].toLowerCase(Locale.ROOT), 1, Integer::sum);
      }

      for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         if ((Integer)var5.get(var4[(int)var8].toLowerCase(Locale.ROOT)) > 1) {
            var4[(int)var8] = Ilillllill(var3[(int)var8], false);
         }
      }

      Integer[] var6 = new Integer[(int)(var8 >>> 32)];

      for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)(var8 >>> 32); var10 += 4294967296L) {
         var6[(int)(var10 >>> 32)] = (int)(var10 >>> 32);
      }

      Arrays.sort(var6, (b, a) -> {
         long var5x = 3706270926422621657L;
         var5x ^= ((long)String.CASE_INSENSITIVE_ORDER.compare(var4[b], var4[a]) << 32 ^ var5x) & -1L << 32;
         return (int)(var5x >>> 32) != 0 ? (int)(var5x >>> 32) : var3[b].compareTo(var3[a]);
      });
      this.ilIIIiIiIIIi = new String[(int)(var8 >>> 32)];
      this.liIIIiiiIIIi = new String[(int)(var8 >>> 32)];

      for (long var16 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var16 >>> 32) < (int)(var8 >>> 32); var16 += 4294967296L) {
         this.ilIIIiIiIIIi[(int)(var16 >>> 32)] = var3[var6[(int)(var16 >>> 32)]];
         this.liIIIiiiIIIi[(int)(var16 >>> 32)] = var4[var6[(int)(var16 >>> 32)]];
      }
   }

   @Override
   public boolean IIIIllIIIl(iIIiliiIlIilii y, double stage, double x, int button) {
      long var7 = System.nanoTime();
      if (button == 0) {
         if (this.liiIIiiiiIIi != 0L && var7 - this.liiIIiiiiIIi < 300000000L) {
            this.liiIIiiiiIIi = 0L;
            this.lIIiiiIIii();
            return true;
         } else {
            this.liiIIiiiiIIi = var7;
            this.ilIiiIiIii();
            this.illiilIiliil.liiiIIllIl();
            return true;
         }
      } else {
         this.ilIiiIiIii();
         return true;
      }
   }

   @Override
   public boolean iiIIlIIlIl(int key, int modifiers) {
      switch (key) {
         case 82:
            this.lIIiiiIIii();
            return true;
         case 266:
            this.iiiliIIIii(1);
            return true;
         case 267:
            this.iiiliIIIii(-1);
            return true;
         default:
            return false;
      }
   }

   private void lIIiiiIIii() {
      this.illiilIiliil.IlIlllIlilIl();
      this.illiilIiliil.IliIlllilIi(9.0F);
      this.llIlIiilIlIi = this.IiIlIiliIlIi = 0.0F;
      this.lillIiiillIi = false;
   }

   private void iIlllIllll() {
      long var4 = 7485400474461539597L;

      try {
         this.Illiilllliil.iIlIlllllill();
      } catch (Throwable var6) {
      }

      List var1 = this.Illiilllliil.IilliliilIIi();
      if (!this.lllllillll(var1)) {
         var4 ^= ((long)this.lIiIIiiIiIIi << 32 ^ var4) & -1L << 32;
         this.Iillllilll(var1);
         this.lIiIIiiIiIIi = this.liilliiill(this.iIlIIiIllIIi);
         if (this.lIiIIiiIiIIi >= 0) {
            this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
         } else if (this.ilIIIiIiIIIi.length > 0 && !this.Iilililiiili()) {
            var4 ^= ((long)Math.max(0, Math.min(this.ilIIIiIiIIIi.length - 1, (int)(var4 >>> 32))) ^ var4) & -1L >>> 32;
            this.lIliliIlil(this.ilIIIiIiIIIi[(int)var4]);
            this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
         }
      }
   }

   @Override
   public int Illlllllilll() {
      return this.ilIIIiIiIIIi.length >= 2 ? this.ilIIIiIiIIIi.length : 0;
   }

   private void iliIiIiiIi(class_332 enabled, iIIiliiIlIilii x, String stage, class_2960 ctx, float y, float h, float icon, boolean act, Runnable id) {
      float var10 = act ? x.lIiiIiIlilli(stage, y, h, 12.0F, icon) : 0.0F;
      if (var10 > 0.01F) {
         IIIiiIillIIiiIil.IlIlllIlilIl(enabled, y + 1.5F, h + 1.5F, 9.0F, icon - 3.0F, 2.5F, llilliilililliil.IIIIllIIIl(-1, 0.07F * var10));
      }

      lIlIIIliIlIIIl.IIIilIIiiIIi(
         ctx,
         llilliilililliil.IIIllIIliIIl(y + 3.0F),
         llilliilililliil.IIIllIIliIIl(h + (icon - 6.0F) / 2.0F),
         6.0F,
         act ? IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var10) : -11117467
      );
      if (act) {
         x.IIIllIIliIIl(stage, y, h, 12.0F, icon, id);
      }
   }

   private void lIliliIlil(String file) {
      if (file != null && !file.equals(this.iIlIIiIllIIi)) {
         this.lllIIiillIIi = this.iIlIIiIllIIi;
         this.iIlIIiIllIIi = file;
         this.lIiIIiiIiIIi = this.liilliiill(file);
         this.Illillllil();
         String var2 = this.Illiilllliil.iliIiiliiiii();
         this.iilIIiIIiIIi = file.equals(var2) && this.Illiilllliil.lIiiIiIlilli() != null ? null : file;
      }
   }

   private void lIiIiiIiIi(class_332 y, iIIiliiIlIilii ctx, float live, boolean stage) {
      long var13 = -3108088637460609705L;
      float var5 = 13.0F;
      float var6 = 10.0F
         + (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<"IliIlllilIi","QLNtn6zsCGd8noXSpyJ3UQkmoaVKjxEShYjGRQ6cLLGld/Y2wIo=">(), 0.72F))
         + 10.0F;
      float var7 = llilliilililliil.IIIllIIliIIl(ctx.lIIIlliIIl + ctx.IlIIlliIIl - 6.0F - var6);
      float var8 = stage ? ctx.lIiiIiIlilli(IliIlllilIi<"IliIlllilIi","ZNtVzwKFNMvSju+4tSFYY6g16Md74583UJwJUFLlpaeCuLAv">(), var7, live, var6, var5) : 0.0F;
      var13 ^= (
            (long)lIlIIIliIlIIIl.IiIiliIiiiIi(
                     y,
                     var7 + var6 / 2.0F,
                     live + var5 / 2.0F,
                     ctx.iliIiiliiiii(IliIlllilIi<"IliIlllilIi","ZNtVzwKFNMvSju+4tSFYY6g16Md74583UJwJUFLlpaeCuLAv">(), 0.05F),
                     0.0F
                  )
                  << 32
               ^ var13
         )
         & -1L << 32;

      try {
         lIlIIIliIlIIIl.IIIllIIliIIl(y, var7, live, var6, var5, 4.0F, var8, 0.0F);
         float var10 = var7 + 5.0F;
         var13 ^= ((long)lIlIIIliIlIIIl.IiIlliIliiIl(var8, 0.0F) ^ var13) & -1L >>> 32;
         lIlIIIliIlIIIl.IIIilIIiiIIi(
            lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<"IliIlllilIi","vyb8o/L8jiZKPBNwcok7FU56EVZpAHFgDARHZVgnjJexYiqnFs8=">()),
            var10,
            llilliilililliil.IIIllIIliIIl(live + (var5 - 7.0F) / 2.0F),
            7.0F,
            (int)var13
         );
         lIlIIIliIlIIIl.Illlllllilll(
            IliIlllilIi<"IliIlllilIi","QLNtn6zsCGd8noXSpyJ3UQkmoaVKjxEShYjGRQ6cLLGld/Y2wIo=">(), var10 + 7.0F + 3.0F, live, var5, 0.72F, (int)var13
         );
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(y, (boolean)((int)(var13 >>> 32)));
      }

      if (stage) {
         ctx.IIIllIIliIIl(IliIlllilIi<"IliIlllilIi","ZNtVzwKFNMvSju+4tSFYY6g16Md74583UJwJUFLlpaeCuLAv">(), var7, live, var6, var5, this.Iiiiilliiiil);
      }
   }

   private void iIiilIliil(iIIiilllIlIiilll r, liIIliIliiIIliIl s) {
      long var5 = 4161277761229367707L;
      IlIIllillIIlli var3 = null;
      if (!s.IliIlllilIi() && iilIIiiIIiIIii.liiiIIllIl()) {
         try {
            var3 = IlIIllillIIlli.IliIlllilIi(
               s.IilliliIll, s.lilliliIll, s.iilliliIll, IliIlllilIi<"IliIlllilIi","TBx9mXEu/XRr1QxL+T5LGm9MwitMk5m0Vv5wWgIGXazpkgZ/uCvHm2FWtEzWAg==">()
            );
         } catch (Throwable var7) {
            iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<"IliIlllilIi","hb8afR6c8VFYXvI/XN2K30fI06C0GJSHrIzC/72mwUXPJg==">(), var7);
         }
      }

      s.IilliliIll.Iiilliiliiil();
      s.lilliliIll.Iiilliiliiil();
      s.iilliliIll.Iiilliiliiil();
      var5 ^= ((long)(r.liIiiIlill != null ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if (r.liIiiIlill != null) {
         r.liIiiIlill.close();
      }

      if (r.iIliiIlill != null) {
         r.iIliiIlill.close();
      }

      if (r.lIliiIlill != null) {
         r.lIliiIlill.IliIlllilIi();
      }

      r.iIliiIlill = null;
      r.lIliiIlill = null;
      r.IlliiIlill = -1;
      r.liIiiIlill = var3;
      r.IiIiiIlill = s;
      r.IIliiIlill = false;
      r.llliiIlill = r.illiiIlill = -1;
      r.iiIiiIlill = (int)(var5 >>> 32) != 0 ? 0L : System.nanoTime();
      if (r.IlIiiIlill.equals(this.iIlIIiIllIIi)) {
         this.iIilIiIlilIi = -1;
         if (this.IIilIilIilIi >= s.IlililiIll - 1) {
            this.IIilIilIilIi = -1;
         }
      }
   }

   @Override
   public void llIIlilIIl(iIIiliiIlIilii x, double button, double y, int stage) {
      if (stage == 0) {
         this.illiilIiliil.IilliliilIIi();
      }
   }

   private void IIllllIlll() {
      for (iIIiilllIlIiilll var2 : this.IIiiillIiiil.values()) {
         var2.IliIlllilIi();
      }

      this.IIiiillIiiil.clear();
      iilIIiiIIiIIii.lIiiIiIlilli();
      if (lIliiliIliil == this) {
         lIliiliIliil = null;
      }
   }

   private static String ilillIiill(String dropTags, boolean file, boolean dropAuthor) {
      long var10 = -1913385819736997959L;
      long var12 = -3133802211993370669L;
      String var3 = IIIillIIil(dropTags == null ? "" : dropTags);
      String var4 = var3;

      String var5;
      do {
         var5 = var4;
         var4 = var4.replaceAll(IliIlllilIi<"IliIlllilIi","qkdBI94dubYd3XAKbNMYrJF6m59bFmYT4Wu7Y8RIxTV0qxVhlQPeoxOXSc0xOufhUwqdYZrrRvsiHH9uk1f9iWrSF9Q=">(), "");
      } while (!var4.equals(var5) && !var4.isEmpty());

      if (file) {
         Matcher var6 = lIIliliIIlil.matcher(var4);
         StringBuilder var7 = new StringBuilder();

         while (var6.find()) {
            var10 ^= (0L ^ var10) & -1L << 32;

            for (var10 ^= ((long)var6.start() ^ var10) & -1L >>> 32; (int)var10 < var6.end(); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
               if (Character.isLetter(var4.charAt((int)var10))) {
                  var10 += 4294967296L;
               }
            }

            var6.appendReplacement(
               var7,
               (int)(var10 >>> 32) >= 4 ? IliIlllilIi<"IliIlllilIi","XvFYyr19Nxv4/3j/sCaDUHJwnxPPCRoJ3+EV/qs=">() : Matcher.quoteReplacement(var6.group())
            );
         }

         var6.appendTail(var7);
         if (var7.toString().trim().length() >= 3) {
            var4 = var7.toString();
         }
      }

      if (var4.indexOf(95) >= 0) {
         var4 = var4.replaceAll(
               IliIlllilIi<"IliIlllilIi","NvpX9fKUtGG5/IpfZS160M4teK1p6konZNgSxbC7pQ3lv20/s8cNstbtN1gqubRG">(),
               IliIlllilIi<"IliIlllilIi","eH8xh/0O6+0o2qF+kA0h+a7EHQ3qec20vGjJC0pwy/p6">()
            )
            .replace('_', ' ');
      }

      if (var4.indexOf(32) < 0) {
         var4 = var4.replace('-', ' ');
      }

      var4 = var4.replaceAll(
            IliIlllilIi<"IliIlllilIi","xZ691/xtCRBbsvAqzYdMO0/9HS3gUmfCEby/gEN/Fw==">(),
            IliIlllilIi<"IliIlllilIi","XvFYyr19Nxv4/3j/sCaDUHJwnxPPCRoJ3+EV/qs=">()
         )
         .trim();
      if (dropAuthor) {
         Matcher var16 = ilIlilIiIlil.matcher(var4);
         if (var16.find() && !var16.group(1).equalsIgnoreCase(var16.group(2)) && !liIliliiIlil.contains(var16.group(2).toLowerCase(Locale.ROOT))) {
            String var17 = var4.substring(0, var16.end(1)).trim();
            if (var17.length() >= 3) {
               var4 = var17;
            }
         }
      }

      var12 ^= (0L ^ var12) & -1L << 32;
      var12 ^= ((long)var4.length() ^ var12) & -1L >>> 32;

      while (
         (int)(var12 >>> 32) < (int)var12
            && IliIlllilIi<"IliIlllilIi","6/guDkbwqcu5Ib8zl8PmaxW7V6AKcpos9gq2svO26B2znhxU+A==">().indexOf(var4.charAt((int)(var12 >>> 32))) >= 0
      ) {
         var12 += 4294967296L;
      }

      while (
         (int)var12 > (int)(var12 >>> 32)
            && IliIlllilIi<"IliIlllilIi","6/guDkbwqcu5Ib8zl8PmaxW7V6AKcpos9gq2svO26B2znhxU+A==">().indexOf(var4.charAt((int)var12 - 1)) >= 0
      ) {
         var12 ^= (var12 ^ var12 + (long)-1) & -1L >>> 32;
      }

      var4 = var4.substring((int)(var12 >>> 32), (int)var12);
      if (var4.isEmpty()) {
         return var3;
      } else {
         var10 ^= (0L ^ var10) & -1L << 32;
         var10 ^= (0L ^ var10) & -1L >>> 32;

         while ((int)var10 < var4.length() && (int)(var10 >>> 32) == 0) {
            var10 ^= ((long)Character.isUpperCase(var4.charAt((int)var10)) << 32 ^ var10) & -1L << 32;
            var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32;
         }

         return (int)(var10 >>> 32) != 0 ? var4 : Character.toUpperCase(var4.charAt(0)) + var4.substring(1);
      }
   }

   protected Iiiiliiiiiii(class_437 manager, lIIiIiIiiIIiIiIi parent, String title) {
      super(manager, title);
      this.liliiliiliil = new Matrix4f();
      this.IIiiillIiiil = new LinkedHashMap<>();
      this.iIiiilIliiil = this::iiiliIIIii;
      this.lliiililiiil = this::iIiliIlili;
      this.Iiiiilliiiil = this::lIIiiiIIii;
      this.iiiiilIIIIIi = () -> this.iiiliIIIii(-1);
      this.lIIIIiiIIIIi = () -> this.iiiliIIIii(1);
      this.IlIIIillIIIi = this::IlIiillIii;
      this.ilIIIiIiIIIi = new String[0];
      this.liIIIiiiIIIi = new String[0];
      this.IIlIIilIlIIi = List.of();
      this.iIlIIiIllIIi = "";
      this.lllIIiillIIi = "";
      this.IilIIililIIi = "";
      this.lIiIIiiIiIIi = -1;
      this.IlllIillllIi = -1.0F;
      this.IIilIilIilIi = -1;
      this.iIilIiIlilIi = -1;
      this.llilIiililIi = Integer.MIN_VALUE;
      this.IiilIiliilIi = -1;
      this.iiilIiIIIiIi = IliIlllilIi<"IliIlllilIi","kwrLR7J84zNJx88nyaEeRBDPSummaVc7ZhP8oXaMtdyzqQW4ZQw=">();
      this.ilIiIiIiIiIi = Integer.MIN_VALUE;
      this.liIiIiiiIiIi = -1;
      this.iiliIiIIiiIi = -1.0F;
      this.lIiiIiiIiiIi = -1.0F;
      this.iliiIiIiiiIi = -1;
      this.Illiilllliil = parent;
      this.Iillllilll(parent.IilliliilIIi());
      String var4 = parent.iliIiiliiiii() == null ? "" : parent.iliIiiliiiii();
      this.IilIIililIIi = var4;
      this.iIlIIiIllIIi = !var4.isEmpty() ? var4 : (this.ilIIIiIiIIIi.length > 0 ? this.ilIIIiIiIIIi[0] : "");
      this.lIiIIiiIiIIi = this.liilliiill(this.iIlIIiIllIIi);
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
      }

      if (!this.iIlIIiIllIIi.isEmpty() && (!this.iIlIIiIllIIi.equals(var4) || parent.lIiiIiIlilli() == null)) {
         this.iilIIiIIiIIi = this.iIlIIiIllIIi;
      }
   }

   private void IiIilliIil() {
      long var6 = -1966281275851199948L;
      String var1 = this.Illiilllliil.iliIiiliiiii() == null ? "" : this.Illiilllliil.iliIiiliiiii();
      iIilliIlIlilliIl var2 = this.Illiilllliil.lIiiIiIlilli();
      var6 ^= ((long)this.iIIilIlIil() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)this.Iilililiiili() ^ var6) & -1L >>> 32;
      if (this.iilIIiIIiIIi == null
         && (int)(var6 >>> 32) == 0
         && (int)var6 == 0
         && var1.isEmpty()
         && var2 != null
         && this.lIiIIiiIiIIi >= 0
         && !this.llIililIil(this.iIlIIiIllIIi)) {
         this.iilIIiIIiIIi = this.iIlIIiIllIIi;
      }

      if (this.iilIIiIIiIIi != null && (int)(var6 >>> 32) == 0 && (int)var6 == 0) {
         String var5 = this.iilIIiIIiIIi;
         this.iilIIiIIiIIi = null;
         if (!var5.equals(var1) || var2 == null) {
            this.Illiilllliil.IiIlliIliiIl(var5);
            var6 ^= (4294967296L ^ var6) & -1L << 32;
         }
      }

      if (!var1.equals(this.IilIIililIIi)) {
         this.IilIIililIIi = var1;
         if (!var1.isEmpty() && !var1.equals(this.iIlIIiIllIIi) && this.iilIIiIIiIIi == null && (int)(var6 >>> 32) == 0) {
            this.iiIilIIlil(var1);
         } else if (var1.isEmpty()
            && var2 == null
            && this.iilIIiIIiIIi == null
            && (int)(var6 >>> 32) == 0
            && !this.iIlIIiIllIIi.isEmpty()
            && !this.llIililIil(this.iIlIIiIllIIi)) {
            this.lllIIiillIIi = this.iIlIIiIllIIi;
            this.iIlIIiIllIIi = "";
            this.lIiIIiiIiIIi = -1;
            this.iiilllIIIill.IIillIiliIil();
         }
      }

      if (var2 != null && this.iIlIIiIllIIi.equals(var1)) {
         this.lililiilil(this.illilIilil(this.iIlIIiIllIIi), var2);
      }
   }

   private void iIlIiIllIi(iIIiliiIlIilii stage, float y) {
      if (!(this.illlIiIillIi <= 0.004F)) {
         if (this.iiliIiIIiiIi < 0.0F) {
            this.iiliIiIIiiIi = lIlIIIliIlIIIl.IIlllIlliIll(
               IliIlllilIi<"IliIlllilIi","omywE7tq4w/fd01DhnrjSBXovbWvYRmwp9eMxNudgk1MaxF+DKTzB12ZfPn8uB1sLzSMK1rpVjm7gfOqZ38ze+Tb2rffbZxcBYrpNvHrpd7r2wIvkQ==">(),
               0.72F
            );
         }

         if (!(this.iiliIiIIiiIi > stage.IlIIlliIIl - 16.0F)) {
            float var3 = gg.corz.IliiIilliiIi.IilliliilIIi(this.illlIiIillIi);

            try {
               lIlIIIliIlIIIl.Illlllllilll(
                  IliIlllilIi<"IliIlllilIi","omywE7tq4w/fd01DhnrjSBXovbWvYRmwp9eMxNudgk1MaxF+DKTzB12ZfPn8uB1sLzSMK1rpVjm7gfOqZ38ze+Tb2rffbZxcBYrpNvHrpd7r2wIvkQ==">(),
                  llilliilililliil.IIIllIIliIIl(stage.IliIlllilIi() - this.iiliIiIIiiIi / 2.0F),
                  y,
                  10.0F,
                  0.72F,
                  -7630437
               );
            } finally {
               gg.corz.IliiIilliiIi.lIiiIiIlilli(var3);
            }
         }
      }
   }

   private String IIililIili() {
      long var3 = -1577166952661859822L;
      var3 ^= ((long)Math.max(1, this.IiliIililiIi) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var3 >>> 32) - 1 : Math.min(this.IIilIilIilIi, (int)(var3 >>> 32) - 1)) ^ var3) & -1L >>> 32;
      if ((int)var3 != this.llilIiililIi || (int)(var3 >>> 32) != this.IiilIiliilIi) {
         this.llilIiililIi = (int)var3;
         this.IiilIiliilIi = (int)(var3 >>> 32);
         this.iiilIiIIIiIi = (int)var3 >= (int)(var3 >>> 32) - 1
            ? IliIlllilIi<"IliIlllilIi","kwrLR7J84zNJx88nyaEeRBDPSummaVc7ZhP8oXaMtdyzqQW4ZQw=">()
            : IliIlllilIi<"IliIlllilIi","vd6QFl/houGqdQyQCd9Mo6lnELd3w1O13xV/kcBZ/riEaA==">()
               + ((int)var3 + 1)
               + IliIlllilIi<"IliIlllilIi","JhRSTjIINTqVbzHPHTSuMaVe/XarlFOOsdTFN4p/Wqc=">()
               + (int)(var3 >>> 32);
      }

      return this.iiilIiIIIiIi;
   }

   @Override
   public void IlIlllIlilIl(class_332 s, iIIiliiIlIilii ctx) {
      ilIiiiiIiIiiii.IilliliilIIi(s, 0, ctx.lIIIlliIIl, ctx.iIIIlliIIl, ctx.IlIIlliIIl, ctx.llIIlliIIl, ctx.IilIlliIIl);
      float var3 = ctx.IliIlllilIi();
      float var4 = ctx.liiiIIllIl() - ctx.llIIlliIIl * 0.03F;
      float var5 = ctx.IlIIlliIIl * 0.34F;
      float var6 = ctx.llIIlliIIl * 0.34F;
      IIIiiIillIIiiIil.IiIlliIliiIl(
         s,
         var3 - var5 / 2.0F,
         var4 - var6 / 2.0F,
         var5,
         var6,
         Math.min(var5, var6) / 2.0F,
         IilIIIIililIIIIi.IIlllIlliIll(0.07),
         Math.min(ctx.IlIIlliIIl, ctx.llIIlliIIl) * 0.22F,
         1.0F
      );
   }

   private void iiiilIIIIi(float dt) {
      float var2 = this.illiilIiliil.IIillIiliIil();
      if (this.lillIiiillIi && this.IlllIillllIi > 0.0F && var2 != this.IlllIillllIi) {
         float var3 = 1.0F / var2 - 1.0F / this.IlllIillllIi;
         float var4 = this.iiIlIiIIllIi * var3;
         float var5 = this.lIllIiiIllIi * var3;
         this.IIIlIilIIlIi += var4;
         this.iIIlIiIlIlIi += var5;
         this.llIlIiilIlIi += var4;
         this.IiIlIiliIlIi += var5;
         this.lIIIiiIIIi();
      }

      if (var2 == this.illiilIiliil.Ililllililil()) {
         this.lillIiiillIi = false;
      }

      this.IlllIillllIi = var2;
      this.IIIlIilIIlIi = lliiiIliliiiIl.IIIllIIliIIl(this.IIIlIilIIlIi, this.llIlIiilIlIi, 20.0F, dt, 1.0E-4F);
      this.iIIlIiIlIlIi = lliiiIliliiiIl.IIIllIIliIIl(this.iIIlIiIlIlIi, this.IiIlIiliIlIi, 20.0F, dt, 1.0E-4F);
   }

   protected final String illliIilli() {
      return this.lIiIIiiIiIIi >= 0 && this.lIiIIiiIiIIi < this.liIIIiiiIIIi.length ? this.liIIIiiiIIIi[this.lIiIIiiIiIIi] : "";
   }

   private boolean lllllillll(List<String> list) {
      return list.equals(this.IIlIIilIlIIi);
   }

   @Override
   public void IiIlliIliiIl(class_332 ctx, iIIiliiIlIilii stage) {
      long var10 = 2838214913219886654L;
      iIIiilllIlIiilll var3 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      var10 ^= ((long)(var3 != null && var3.liIiiIlill != null && var3.IiIiiIlill != null && this.liiIiiiiIi() ? 1 : 0) << 32 ^ var10) & -1L << 32;
      float var5 = llilliilililliil.IIIllIIliIIl(stage.iIIIlliIIl + stage.llIIlliIIl - 6.0F - 13.0F);
      if ((int)(var10 >>> 32) != 0) {
         float var6 = var3.iiIiiIlill == 0L ? Float.MAX_VALUE : (float)(System.nanoTime() - var3.iiIiiIlill) / 1000000.0F;
         float var7 = var3.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.Iilililiiili(var6);
         float var8 = gg.corz.IliiIilliiIi.IilliliilIIi(var7);

         try {
            this.lilliiilli();
            this.lllIiillIi(ctx, stage, var3.IiIiiIlill.iIililiIll);
            this.IliIilliIi(ctx, stage, llilliilililliil.IIIllIIliIIl(stage.lIIIlliIIl + 6.0F), var5, 13.0F, var7 > 0.5F);
            this.lIiIiiIiIi(ctx, stage, var5, var7 > 0.5F);
         } finally {
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var8);
         }
      }

      this.iIlIiIllIi(stage, (int)(var10 >>> 32) != 0 ? var5 - 13.0F : stage.iIIIlliIIl + stage.llIIlliIIl - 20.0F);
   }

   private void lililiilil(iIIiilllIlIiilll s, iIilliIlIlilliIl schematic) {
      if (s.llIiiIlill != schematic) {
         if (s.ilIiiIlill != null) {
            s.ilIiiIlill.IliIlllilIi();
         }

         s.llIiiIlill = schematic;
         s.IIliiIlill = false;

         try {
            s.ilIiiIlill = IiIlllllliIlllll.IliIlllilIi(schematic, IllliIIilllliIIi.IliIlllilIi());
         } catch (Throwable var4) {
            s.ilIiiIlill = null;
            s.IIliiIlill = true;
         }
      }
   }

   private boolean llIililIil(String file) {
      if (file != null && !file.isEmpty()) {
         String var2 = this.Illiilllliil.IIIllIIliIIl();
         return var2 != null && var2.endsWith(file)
            ? var2.startsWith(IliIlllilIi<"IliIlllilIi","AMSItogOCTsh804vofaRoR6JY+VyrQ6blxA1dU7ppDY+tytnuaodLKreNA==">())
                  && var2.length() == IliIlllilIi<"IliIlllilIi","AMSItogOCTsh804vofaRoR6JY+VyrQ6blxA1dU7ppDY+tytnuaodLKreNA==">().length() + file.length()
               || var2.startsWith(IliIlllilIi<"IliIlllilIi","Vc98MM75FsdzLw+XKwN+pSFsgvdYpvKmjcVWQvggbDXkCTrMCzezG7Mo">())
                  && var2.length() == IliIlllilIi<"IliIlllilIi","Vc98MM75FsdzLw+XKwN+pSFsgvdYpvKmjcVWQvggbDXkCTrMCzezG7Mo">().length() + file.length()
            : false;
      } else {
         return false;
      }
   }

   private void Iiiilliiil() {
      long var5 = 4535039680295749299L;
      iIIiilllIlIiilll var1 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var1 != null && var1.IiIiiIlill != null && var1.liIiiIlill != null) {
         var5 ^= ((long)var1.IiIiiIlill.IlililiIll << 32 ^ var5) & -1L << 32;
         if (this.IIilIilIilIi >= (int)(var5 >>> 32) - 1) {
            this.IIilIilIilIi = -1;
         }

         if (this.IIilIilIilIi < 0) {
            this.iIilIiIlilIi = -1;
         } else if (var1.IlliiIlill == this.IIilIilIilIi) {
            this.iIilIiIlilIi = this.IIilIilIilIi;
         } else {
            if (this.iIilIiIlilIi >= 0 && var1.IlliiIlill != this.iIilIiIlilIi) {
               this.iIilIiIlilIi = -1;
            }

            var5 ^= ((long)(var1.IiIiiIlill.llililiIll + this.IIilIilIilIi) ^ var5) & -1L >>> 32;
            if (var1.lIliiIlill == null || var1.lIliiIlill.iliIiiliiiii() != (int)var5) {
               if (var1.lIliiIlill != null) {
                  var1.lIliiIlill.IliIlllilIi();
               }

               try {
                  var1.lIliiIlill = IiIlllllliIlllll.liiiIIllIl(var1.IiIiiIlill.IIililiIll, (int)var5);
               } catch (Throwable var7) {
                  var1.lIliiIlill = null;
               }
            }
         }
      } else {
         this.iIilIiIlilIi = -1;
      }
   }

   @Override
   public String iIlIlllllill() {
      if (!this.iIlIIiIllIIi.equals(this.IlIiIillIiIi) || this.lIiIIiiIiIIi != this.ilIiIiIiIiIi || this.ilIIIiIiIIIi.length != this.liIiIiiiIiIi) {
         this.IlIiIillIiIi = this.iIlIIiIllIIi;
         this.ilIiIiIiIiIi = this.lIiIIiiIiIIi;
         this.liIiIiiiIiIi = this.ilIIIiIiIIIi.length;
         iIilliIlIlilliIl var1 = this.Illiilllliil.lIiiIiIlilli();
         String var2;
         if (!this.iIlIIiIllIIi.isEmpty()) {
            var2 = IIIillIIil(this.iIlIIiIllIIi);
         } else if (var1 != null && var1.iliIiiiIll != null && !var1.iliIiiiIll.isBlank()) {
            var2 = var1.iliIiiiIll;
         } else {
            var2 = this.ilIIIiIiIIIi.length == 0
               ? IliIlllilIi<"IliIlllilIi","VLaz/TNXLeSRr2ybIA+z35NA6m07vbqABuVbX5a4//ZCnQkfhW4C9GJAC8u7bqI=">()
               : IliIlllilIi<"IliIlllilIi","opmEspGDb2ObNjMgprKhB7KwcQQxEIpnHVRjHK7TsZdlMIyZ5XfadK9D5jwWoDV/bA==">();
         }

         this.lIIiIiiIIiIi = this.lIiIIiiIiIIi >= 0 && this.ilIIIiIiIIIi.length >= 2
            ? var2
               + IliIlllilIi<"IliIlllilIi","AbY+HIEfxUDgGMUozRoKHgpoLXSmoQce1rSVOLXDBg7JZg==">()
               + (this.lIiIIiiIiIIi + 1)
               + IliIlllilIi<"IliIlllilIi","JhRSTjIINTqVbzHPHTSuMaVe/XarlFOOsdTFN4p/Wqc=">()
               + this.ilIIIiIiIIIi.length
            : var2;
      }

      return this.lIIiIiiIIiIi;
   }

   private void IIlIilIlIi(class_332 ctx, iIIiliiIlIilii a, float stage) {
      long var13 = -3760107145721321568L;
      if (!(stage <= 0.002F)) {
         float var4 = gg.corz.IliiIilliiIi.IilliliilIIi(stage);

         try {
            float var5 = (float)(System.nanoTime() - this.iliIIiIiiIIi) / 1.0E9F;
            float var6 = a.IliIlllilIi();
            float var7 = a.liiiIIllIl() - 6.0F;

            for (long var17 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var17 >>> 32) < 3; var17 += 4294967296L) {
               float var9 = 0.5F + 0.5F * (float)Math.sin((double)(var5 * 1.1F) * Math.PI * 2.0 - (double)((int)(var17 >>> 32)) * 0.7);
               float var10 = var6 + (float)((int)(var17 >>> 32) - 1) * 11.0F - 2.0F;
               float var11 = var7 - 2.0F - 1.5F * var9;
               IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var10, var11, 4.0F, 4.0F, 2.0F, IilIIIIililIIIIi.IIlllIlliIll(0.3 + 0.7 * (double)var9));
            }

            if (this.lIiiIiiIiiIi < 0.0F) {
               this.lIiiIiiIiiIi = lIlIIIliIlIIIl.IIlllIlliIll(
                  IliIlllilIi<"IliIlllilIi","NrkengYtQVOz20WoZcjvyyz4kWfhfKtKkEkttCGngSYhpYY9SyxhtGbl5q9t">(), 0.82F
               );
            }

            lIlIIIliIlIIIl.Illlllllilll(
               IliIlllilIi<"IliIlllilIi","NrkengYtQVOz20WoZcjvyyz4kWfhfKtKkEkttCGngSYhpYY9SyxhtGbl5q9t">(),
               llilliilililliil.IIIllIIliIIl(var6 - this.lIiiIiiIiiIi / 2.0F),
               var7 + 8.0F,
               10.0F,
               0.82F,
               -7630437
            );
         } finally {
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var4);
         }
      }
   }

   private void lIIIiiIIIi() {
      iIIiilllIlIiilll var1 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var1 != null && var1.IiIiiIlill != null) {
         float var2 = ilIIliilIiIIliil.liiiIIllIl(var1.IiIiiIlill.ilililiIll, var1.IiIiiIlill.IiililiIll, var1.IiIiiIlill.liililiIll);
         this.llIlIiilIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.llIlIiilIlIi, var2);
         this.IiIlIiliIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.IiIlIiliIlIi, var2);
         this.IIIlIilIIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.IIIlIilIIlIi, var2);
         this.iIIlIiIlIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.iIIlIiIlIlIi, var2);
      }
   }

   private void IIiillIiil() {
      for (iIIiilllIlIiilll var2 : this.IIiiillIiiil.values()) {
         lliiIIIliliiIIIl var3 = var2.ilIiiIlill;
         if (var3 != null && var3.liiiIIllIl()) {
            var2.ilIiiIlill = null;
            if (!var3.iIlIlllllill()) {
               liIIliIliiIIliIl var4 = var3.iliIiiliiiii();
               if (var3.IilliliilIIi() == null && var4 != null) {
                  this.iIiilIliil(var2, var4);
               } else {
                  var2.IIliiIlill = true;
                  if (var3.IilliliilIIi() != null) {
                  }
               }
            }
         }

         lIlIlilliIlIlill var5 = var2.lIliiIlill;
         if (var5 != null && var5.liiiIIllIl()) {
            var2.lIliiIlill = null;
            if (!var5.iIlIlllllill() && var5.IIIllIIliIIl() != null && var2.IiIiiIlill != null) {
               this.lliililiil(var2, var5);
            }
         }
      }
   }

   private void lilliiilli() {
      String var1 = this.Illiilllliil.iliIiiliiiii() == null ? "" : this.Illiilllliil.iliIiiliiiii();
      iIilliIlIlilliIl var2 = this.Illiilllliil.lIiiIiIlilli();
      iIilliIlIlilliIl var3 = var2 != null && this.iIlIIiIllIIi.equals(var1) ? var2 : null;
      if (var3 != null && var3 != this.IIliIilIliIi) {
         this.IIliIilIliIi = var3;
         this.iIliIiIlliIi = var3.IiiIiiiIll
            + IliIlllilIi<"IliIlllilIi","6q9ZCyNabocJxG5pwoPcTCHBcWYIzckudnV7sAhNewQ=">()
            + var3.liiIiiiIll
            + IliIlllilIi<"IliIlllilIi","6q9ZCyNabocJxG5pwoPcTCHBcWYIzckudnV7sAhNewQ=">()
            + var3.iiiIiiiIll;
         this.llliIiilliIi = String.format(Locale.ROOT, IliIlllilIi<"IliIlllilIi","J9BPioz2KzVReIvqNTIH4e6oPr7XEGTGrY6m/Nywrw==">(), var3.iIIliiiIll)
            + (
               var3.iIIliiiIll == 1
                  ? IliIlllilIi<"IliIlllilIi","Z0LtB9JZpbIetn9JYGshQXzXjNvIorkQkmVv5X5zFkuKnQ==">()
                  : IliIlllilIi<"IliIlllilIi","KNlwldBorCz7WAZIOHKpmhyxiaqZSHyYo4061qFBJ9UfZlU=">()
            );
      }

      iIIiilllIlIiilll var4 = this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var4 != null && var4.IiIiiIlill != null) {
         this.IiliIililiIi = var4.IiIiiIlill.IlililiIll;
      } else if (this.IIliIilIliIi != null) {
         this.IiliIililiIi = this.IIliIilIliIi.liiIiiiIll;
      }
   }

   @Override
   public String Iilllilliill(int index) {
      return index >= 0 && index < this.liIIIiiiIIIi.length ? this.liIIIiiiIIIi[index] : "";
   }

   private void Illillllil() {
      this.IIIlIilIIlIi = this.iIIlIiIlIlIi = this.llIlIiilIlIi = this.IiIlIiliIlIi = 0.0F;
      this.lillIiiillIi = false;
      this.IIilIilIilIi = -1;
      this.iIilIiIlilIi = -1;
   }

   private void IlIiillIii() {
      this.Illiilllliil.IlIlllIlilIl();
   }

   protected final void lliliilili(int index) {
      if (index >= 0 && index < this.ilIIIiIiIIIi.length) {
         this.lIliliIlil(this.ilIIIiIiIIIi[index]);
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
      }
   }

   @Override
   public float lIiiIiIlilli() {
      return 340.0F;
   }

   protected final String iIIliIlIli() {
      return this.iIlIIiIllIIi;
   }

   private iIIiilllIlIiilll illilIilil(String file) {
      iIIiilllIlIiilll var2 = this.IIiiillIiiil.get(file);
      if (var2 != null) {
         return var2;
      } else {
         if (this.IIiiillIiiil.size() >= 2) {
            Iterator var3 = this.IIiiillIiiil.entrySet().iterator();

            while (var3.hasNext() && this.IIiiillIiiil.size() >= 2) {
               Entry var4 = (Entry)var3.next();
               if (!((String)var4.getKey()).equals(this.iIlIIiIllIIi) && !((String)var4.getKey()).equals(this.lllIIiillIIi)) {
                  ((iIIiilllIlIiilll)var4.getValue()).IliIlllilIi();
                  var3.remove();
               }
            }

            if (this.IIiiillIiiil.size() >= 2) {
               var3 = this.IIiiillIiiil.entrySet().iterator();

               while (var3.hasNext() && this.IIiiillIiiil.size() >= 2) {
                  Entry var7 = (Entry)var3.next();
                  if (!((String)var7.getKey()).equals(this.iIlIIiIllIIi)) {
                     ((iIIiilllIlIiilll)var7.getValue()).IliIlllilIi();
                     var3.remove();
                  }
               }
            }
         }

         var2 = new iIIiilllIlIiilll(file);
         this.IIiiillIiiil.put(file, var2);
         return var2;
      }
   }

   protected final void Iiililiili() {
      this.iilIIiIIiIIi = null;
      if (!this.iIlIIiIllIIi.isEmpty()) {
         this.lllIIiillIIi = this.iIlIIiIllIIi;
         this.iIlIIiIllIIi = "";
         this.lIiIIiiIiIIi = -1;
         this.iiilllIIIill.IIillIiliIil();
      }
   }

   public static String iilllIIill(String file) {
      return Ilillllill(file, true);
   }

   private static String Ilillllill(String dropTags, boolean file) {
      return ilillIiill(dropTags, file, file);
   }

   private void iiiliIIIii(int dir) {
      long var4 = -2831443882364206537L;
      var4 ^= ((long)this.IiliIililiIi << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 1 && dir != 0) {
         var4 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var4 >>> 32) - 1 : this.IIilIilIilIi) ^ var4) & -1L >>> 32;
         var4 ^= ((long)Math.max(0, Math.min((int)(var4 >>> 32) - 1, (int)var4 + Integer.signum(dir))) ^ var4) & -1L >>> 32;
         this.IIilIilIilIi = (int)var4 >= (int)(var4 >>> 32) - 1 ? -1 : (int)var4;
      }
   }
}
