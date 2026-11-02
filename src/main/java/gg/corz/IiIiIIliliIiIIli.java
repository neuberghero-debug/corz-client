package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class IiIiIIliliIiIIli extends ilIllIiIll {
   private static final HttpClient iliIIiIlIi;
   private static volatile class_2960 liliilIlIi = null;
   private static volatile iIIiIIlIlIiIIl IiliilIlIi = new iIIiIIlIlIiIIl(
      IliIlllilIi<"IliIlllilIi","7I6p3pLNZvINsfDVfcmq8fzbLhKyNULMlp4QWyQIxrkh2u7/AjaA">(),
      IliIlllilIi<"IliIlllilIi","7I6p3pLNZvINsfDVfcmq8fzbLhKyNULMlp4QWyQIxrkh2u7/AjaA">(),
      Iiilililliililil.IliIlllilIi(
         IliIlllilIi<"IliIlllilIi","7I6p3pLNZvINsfDVfcmq8fzbLhKyNULMlp4QWyQIxrkh2u7/AjaA">(),
         IliIlllilIi<"IliIlllilIi","7I6p3pLNZvINsfDVfcmq8fzbLhKyNULMlp4QWyQIxrkh2u7/AjaA">()
      ),
      226,
      152000L,
      System.currentTimeMillis(),
      true
   );
   private static final class_2960 llliilIlIi = class_2960.method_60655(
      IliIlllilIi<"IliIlllilIi","Q7+bqMko45PtuduSfBMnF1dcoor0+FQDSjq+kDM+So5nrt43xsQ=">(),
      IliIlllilIi<"IliIlllilIi","A+vS4noFfpqGZ1BEFkfv0gjdMsmQKlyJiLWks05j78BlRNnrFTLMqUI=">()
   );
   private long IlIIIiIlIi;
   private final iiIiiilIIliiil lIiiilIlIi;
   private long IIIIIiIlIi;
   private static final long illIIiIlIi = 2600L;
   private static volatile float lliiilIlIi = 0.0F;
   private iliiIIiIiiiIIi IiIIIiIlIi;
   private static final ExecutorService IiiIIiIlIi;
   private long lliIIiIlIi;
   private final iiIiiilIIliiil IliiilIlIi;
   private static final Color iIlIIiIlIi = new Color(240, 243, 248, 255);
   private static final int[] lIlIIiIlIi = new int[256];
   private static final AtomicReference<iIIiiIilIlIiiIil> iiliilIlIi = new AtomicReference<>();
   private IIliiIlllIliiIll lIiIIiIlIi;
   private static final Object illiilIlIi = new Object();
   private static final float liiiilIlIi = 340.0F;
   private long lIIIIiIlIi;
   private int llIIIiIlIi;
   private static final Color[] IllIIiIlIi = new Color[17];
   private final iiIiiilIIliiil iIiiilIlIi;
   private static final Color[] IIlIIiIlIi = new Color[256];
   private iiIliiiIIlliii iliiilIlIi;
   private float liIIIiIlIi;
   private final HashMap<Integer, iliIlIlIiiIlIl> iiIIIiIlIi;
   private float iiiiilIlIi;
   private String IIiIIiIlIi;
   private static final float lilIIiIlIi = 28.0F;
   private static volatile lIIIilliIIIill iiiIIiIlIi;
   private static final long IiiiilIlIi = 120L;
   private static final float IilIIiIlIi = 28.0F;
   private final iiIiiilIIliiil IIiiilIlIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","UrGDgGNk6W096MJ60HTg2i6aY1NrbGCBn45iZHnnbS0IvBVfQUSO">(),
      IliIlllilIi<"IliIlllilIi","S9gXBHQzP00FxYSi8RHg08ScK145gmwg1IyLWIAt0FP/Ertjvgu62VWrv9R8pYROHDEVikeoTaHcwP0dkSb8VRtNdYNjsT+CAPx1TSNbdzeEZBBj8azbab95">(),
      true
   );
   private int ilIIIiIlIi;
   private long iIIIIiIlIi;
   private static final AtomicReference<String> liiIIiIlIi;
   private String[] iIiIIiIlIi;
   private static final class_4587 lllIIiIlIi = new class_4587();
   private static final float iilIIiIlIi = 12.0F;
   private float[] IliIIiIlIi;

   private static String iIlIiIllIi(IIliiIlllIliiIll s, String maxW, int f) {
      if (!maxW.isEmpty() && !(s.iIlIlllllill(maxW) <= (float)f)) {
         int var3 = (int)s.iIlIlllllill(IliIlllilIi<"IliIlllilIi","ZqAcdYGv2zZXTuI1Cdh6DHjTkZ4JePCSgt9w/PwXbw==">());
         StringBuilder var4 = new StringBuilder();

         for (int var5 = 0; var5 < maxW.length() && !(s.iIlIlllllill(var4.toString() + maxW.charAt(var5)) + (float)var3 > (float)f); var5++) {
            var4.append(maxW.charAt(var5));
         }

         return var4.append(IliIlllilIi<"IliIlllilIi","ZqAcdYGv2zZXTuI1Cdh6DHjTkZ4JePCSgt9w/PwXbw==">()).toString();
      } else {
         return maxW;
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      this.lllllillll(event.IIiIilIIIl);
   }

   public static void ilIllIiIll(int elapsedSec) {
      synchronized (illiilIlIi) {
         iIIiIIlIlIiIIl var2 = IiliilIlIi;
         IiliilIlIi = new iIIiIIlIlIiIIl(
            var2.liiiIIllIl(),
            var2.iIlIlllllill(),
            var2.IilliliilIIi(),
            var2.lIiiIiIlilli(),
            liIIiiiIIi((long)elapsedSec * (7273754806182398740L ^ 7273754806182398204L), var2.lIiiIiIlilli()),
            System.currentTimeMillis(),
            var2.IlIlllIlilIl()
         );
      }
   }

   @Override
   protected void Iilililiiili() {
      IlIIIIIillIIIIIi.liiiIIllIl();
   }

   private void iiiilIIIIi(class_4587 size, class_2960 centerY, int col, int ms, int id, Color centerX) {
      iiIlilIlIIllilIl.IliIlllilIi((float)col - (float)id / 2.0F, (float)ms - (float)id / 2.0F, (float)id, (float)id, centerY, centerX, size);
   }

   private int lIilliIill(iliiIIiIiiiIIi doc, int t, long w, float line, IIliiIlllIliiIll f) {
      if (t < 0) {
         return t;
      } else {
         IlIilIilllIilIil var7 = doc.liiiIIllIl()[t];
         iliIlIlIiiIlIl var8 = this.IIIillIIil(doc, t, line, f);
         int var9 = 0;

         for (int var10 = 0; var10 < var7.lIiiIiIlilli().length && var7.iliIiiliiiii()[var10] <= w; var10++) {
            var9 = var8.IliIlllilIi()[var10];
         }

         return t << 3 | Math.min(7, var9);
      }
   }

   private static void lIIlliIIll(String trackTitle, String elapsedMs, long totalSec, int resyncMs, boolean trackArtist, long isPlaying) {
      long var18 = 4318349899664536644L;
      long var20 = 4496354101807405500L;
      String var8 = trackTitle != null ? trackTitle : "";
      String var9 = elapsedMs != null ? elapsedMs : "";
      var18 ^= ((long)Math.max(1, resyncMs) << 32 ^ var18) & -1L << 32;
      long var11 = System.currentTimeMillis();
      synchronized (illiilIlIi) {
         iIIiIIlIlIiIIl var14 = IiliilIlIi;
         var18 ^= ((long)(var8.equals(var14.liiiIIllIl()) && var9.equals(var14.iIlIlllllill()) ? 1 : 0) ^ var18) & -1L >>> 32;
         var20 ^= ((long)((int)var18 != 0 && (int)(var18 >>> 32) == var14.lIiiIiIlilli() && trackArtist == var14.IlIlllIlilIl() ? 1 : 0) << 32 ^ var20)
            & -1L << 32;
         if ((int)(var20 >>> 32) == 0 || Math.abs(totalSec - var14.IliIlllilIi(var11)) >= isPlaying) {
            IiliilIlIi = new iIIiIIlIlIiIIl(
               var8,
               var9,
               (int)var18 != 0 ? var14.IilliliilIIi() : Iiilililliililil.IliIlllilIi(var9, var8),
               (int)(var18 >>> 32),
               liIIiiiIIi(totalSec, (int)(var18 >>> 32)),
               var11,
               trackArtist
            );
         }
      }
   }

   public IiIiIIliliIiIIli() {
      super(IliIlllilIi<"IliIlllilIi","RnHGKYACWKEVtXAqBlEfCGDm36H2XLmsnZn6vKSjurETP3gg03DG">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.lIiiilIlIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gWOYaI5dCjclMxq3lsiydO7yNNsRdueoWS+CE4VxNSCV/dATLA==">(),
         IliIlllilIi<"IliIlllilIi","Iz0M+OCgUY3dF6CCg8OKnzYph7d+hFxjeO/g0QmD/6o5NccN9Evai1giVg6vZ8c1WTRi10KS9VtjIocdV3j8TpII">(),
         true
      );
      this.iIiiilIlIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ixOhTcViqoDkLFjQ4tU2RTTl0DCxXvSZvBbzv4uqKkE+P9zC9QS1rA==">(),
         IliIlllilIi<"IliIlllilIi","Vxbt57bF+5rJLDbg2TtI0bkz+g2Lrf49ZZencbLESfziqnbH/EP6yRsMstL/7UqKlhop//7mhuN/ETeHKy5QgdvqN2keGtzX">(),
         true
      );
      this.IliiilIlIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","o9sicsXefp6IJVEacfu9eRP9w54wF9Ob82Zj2TnWOeF8CQ==">(),
         IliIlllilIi<"IliIlllilIi","1kVONsYV04C/SK6likOmwCFPaUpbnjZXmE4WTncW9UvSO0gWrruEG1CLxX4OA91CZg9Tg9AW51sDsdS2U6cBp2jxKyCGJH2FdJ2mXbjmaRdL2U5n0sk7rNDHa9p8hJ48SH6l6A==">(),
         true
      );
      this.iiiiilIlIi = 0.0F;
      this.IIIIIiIlIi = 0L;
      this.lIIIIiIlIi = 0L;
      this.iIIIIiIlIi = 0L;
      this.IlIIIiIlIi = 1000L;
      this.llIIIiIlIi = Integer.MIN_VALUE;
      this.ilIIIiIlIi = Integer.MIN_VALUE;
      this.liIIIiIlIi = -1.0F;
      this.iiIIIiIlIi = new HashMap<>();
      this.IIiIIiIlIi = "";
      this.iIiIIiIlIi = new String[0];
      this.IliIIiIlIi = new float[0];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiiilIlIi, this.lIiiilIlIi, this.iIiiilIlIi, this.IliiilIlIi});
   }

   public static int iIlllIllll() {
      long var5 = 103331236501020497L;
      long var7 = -6557273941599265248L;
      IiIiIIliliIiIIli var0 = (IiIiIIliliIiIIli)llilIllililIll.iliIiiliiiii(IiIiIIliliIiIIli.class);
      if (var0 != null && var0.IliIlllilIi()) {
         var5 ^= (21474836480L ^ var5) & -1L << 32;
         var5 ^= ((long)(var0.lIiiilIlIi.Iilllilliill() ? ~(~(-1097627011 ^ 7)) ^ -1097627026 : 0) ^ var5) & -1L >>> 32;
         var7 ^= (
               (long)(
                        (int)(var5 >>> 32)
                           + Math.max((int)var5, (int)illlIiiIillIii.iIlIlllllill().IilliliilIIi() + 1 + (int)illlIiiIillIii.liiiIIllIl().IilliliilIIi())
                           + (int)(var5 >>> 32)
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         var7 ^= (
               (long)(
                     (int)(var7 >>> 32)
                        + (var0.iIiiilIlIi.Iilllilliill() ? (-1737168168 >>> 3 | -1737168168 << 29) * -71 ^ -1225630770 : 0)
                        + Math.round(lliiilIlIi)
                  )
                  ^ var7
            )
            & -1L >>> 32;
         return (~(1391470448 + 47) ^ -1391470474)
            + Math.round((float)((int)var7) * IIililillIililil.iIlIllIllIll(IliIlllilIi<"IliIlllilIi","f6fbyzDrmN8bQ4irQg57PMIfp7s0L9gshIWrmE3wTTWgEUM=">()));
      } else {
         return -1;
      }
   }

   private static String ilIIiIiIIi(String json) {
      long var4 = 9177865571926498049L;
      long var6 = 1283148444437113928L;
      var4 ^= ((long)json.indexOf(IliIlllilIi<"IliIlllilIi","SF7ppFiYfalac3I5ipcrJiB43CQkLZ/9lhMRZH8In0WjrNgRDEH8TEwMDw==">()) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) < 0) {
         return null;
      } else {
         var4 ^= (
               (long)json.indexOf(
                     -(-(-1379932872 << 1 | -1379932872 >>> 31)) - 15 ^ 1535101504,
                     json.indexOf(76730951 * -1108378657 * -51 * -65 * -17 ^ 1274646127, (int)(var4 >>> 32)) + 1
                  )
                  ^ var4
            )
            & -1L >>> 32;
         var6 ^= ((long)((int)var4 < 0 ? -1 : json.indexOf(-(--455540340 >>> 31 | --455540340 << 1) * -1059797125 ^ -657513302, (int)var4 + 1)) << 32 ^ var6)
            & -1L << 32;
         return (int)var4 >= 0 && (int)(var6 >>> 32) >= 0
            ? json.substring((int)var4 + 1, (int)(var6 >>> 32))
               .replace(
                  IliIlllilIi<"IliIlllilIi","3x7KdKAq8aRP34Se7y/wtsGL0jJ7eZNd30Vb4OOb">(),
                  IliIlllilIi<"IliIlllilIi","kzw8Trzr7MoOGbUsokkToD8r4hQzXMlWmbU0hu0=">()
               )
            : null;
      }
   }

   static {
      for (int var0 = 0; var0 < IllIIiIlIi.length; var0++) {
         IllIIiIlIi[var0] = new Color(240, 243, 248, Math.round(255.0F * (float)var0 / (float)(IllIIiIlIi.length - 1)));
      }

      iliIIiIlIi = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(6L)).followRedirects(Redirect.NORMAL).build();
      IiiIIiIlIi = Executors.newSingleThreadExecutor(r -> {
         Thread var1 = new Thread(r, IliIlllilIi<"IliIlllilIi","Tj6VK6sa7bvXB6+/GcVaJ3aHeb49sWGc5IUyjlv1axIhtjeP4t8THeGn9qkUwA==">());
         var1.setDaemon(true);
         return var1;
      });
      liiIIiIlIi = new AtomicReference<>("");
      iiiIIiIlIi = null;
   }

   private static long liIIiiiIIi(long durSec, int ms) {
      long var3 = (long)ms * (-4623968016598689669L ^ -4623968016598688877L);
      return durSec < (1788379687060403245L ^ 1788379687060403245L) ? 0L : (durSec > var3 ? var3 : durSec);
   }

   private static iliIlIlIiiIlIl iIIilIlIil(float[] ww, float maxW, float sp) {
      int var3 = ww.length;
      int[] var4 = new int[var3];
      float[] var5 = new float[var3];
      ArrayList var6 = new ArrayList();
      float var7 = 0.0F;
      int var8 = 0;

      for (int var9 = 0; var9 < var3; var9++) {
         if (var7 > 0.0F && var7 + maxW + ww[var9] > sp) {
            var6.add(var7);
            var8++;
            var7 = 0.0F;
         }

         if (var7 > 0.0F) {
            var7 += maxW;
         }

         var4[var9] = var8;
         var5[var9] = var7;
         var7 += ww[var9];
      }

      var6.add(var7);
      float[] var11 = new float[var6.size()];

      for (int var10 = 0; var10 < var11.length; var10++) {
         var11[var10] = (Float)var6.get(var10);
      }

      return new iliIlIlIiiIlIl(var4, var5, var11, var11.length);
   }

   private static Color liilliiill(int c, int a) {
      long var5 = 2139716609802930673L;
      var5 ^= (
            (long)(
                     a
                           << (
                              (
                                    (
                                             (-1993577777 * 1171354717 << 1 | -1993577777 * 1171354717 >>> 31) >>> 7
                                                | (-1993577777 * 1171354717 << 1 | -1993577777 * 1171354717 >>> 31) << 25
                                          )
                                          >>> 27
                                       | (
                                             (-1993577777 * 1171354717 << 1 | -1993577777 * 1171354717 >>> 31) >>> 7
                                                | (-1993577777 * 1171354717 << 1 | -1993577777 * 1171354717 >>> 31) << 25
                                          )
                                          << 5
                                 )
                                 ^ -104608639
                           )
                        | c << ((~1155253350 << 27 | ~1155253350 >>> 5) * 799063683 ^ 180198276)
                        | c << (~(-(-2059320995 << 25 | -2059320995 >>> 7)) ^ -1156939127)
                        | Math.min(884074754 * -941362695 - -7 ^ -79 ^ 399735735, c + 3)
                  )
                  << 32
               ^ var5
         )
         & -1L << 32;
      var5 ^= (
            (long)(
                  (int)(var5 >>> 32) * (((-1338599511 ^ 55) >>> 9 | (-1338599511 ^ 55) << 23) ^ 1366254330)
                     >>> (-((1619540634 >>> 1 | 1619540634 << 31) ^ -41) ^ 809770366)
               )
               ^ var5
         )
         & -1L >>> 32;
      Color var4 = IIlIIiIlIi[(int)var5];
      if (var4 == null || lIlIIiIlIi[(int)var5] != (int)(var5 >>> 32)) {
         var4 = new Color((int)(var5 >>> 32), true);
         IIlIIiIlIi[(int)var5] = var4;
         lIlIIiIlIi[(int)var5] = (int)(var5 >>> 32);
      }

      return var4;
   }

   private iliIlIlIiiIlIl IIIillIIil(iliiIIiIiiiIIi doc, int maxW, float f, IIliiIlllIliiIll key) {
      iliIlIlIiiIlIl var5 = this.iiIIIiIlIi.get(maxW);
      if (var5 != null) {
         return var5;
      } else {
         String[] var6 = doc.liiiIIllIl()[maxW].lIiiIiIlilli();
         float[] var7 = new float[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = key.iIlIlllllill(var6[var8]);
         }

         float var12 = key.iIlIlllllill(IliIlllilIi<"IliIlllilIi","DeDunmWG1stzR/yMUtvKIiz+81C0rBnNN8RyHkk=">());
         iliIlIlIiiIlIl var9 = iIIilIlIil(var7, var12, f);

         for (float var10 = f - 4.0F; var9.IilliliilIIi() > 1 && var10 > f * 0.5F; var10 -= 4.0F) {
            iliIlIlIiiIlIl var11 = iIIilIlIil(var7, var12, var10);
            if (var11.IilliliilIIi() != var9.IilliliilIIi()) {
               break;
            }

            var9 = var11;
         }

         this.iiIIIiIlIi.put(maxW, var9);
         return var9;
      }
   }

   public static void liIlliiIll(boolean isPlaying) {
      long var1 = System.currentTimeMillis();
      synchronized (illiilIlIi) {
         iIIiIIlIlIiIIl var4 = IiliilIlIi;
         IiliilIlIi = new iIIiIIlIlIiIIl(
            var4.liiiIIllIl(), var4.iIlIlllllill(), var4.IilliliilIIi(), var4.lIiiIiIlilli(), var4.IliIlllilIi(var1), var1, isPlaying
         );
      }
   }

   private static long iiIilIIlil(iliiIIiIiiiIIi songMs, int doc, long key) {
      long var6 = -1137754738990295617L;
      IlIilIilllIilIil[] var4 = songMs.liiiIIllIl();
      if (doc == (-(~423304130) ^ -423304132)) {
         return var4.length > 0 ? var4[0].liiiIIllIl() : 1L;
      } else {
         var6 ^= ((long)(-(doc + 2)) << 32 ^ var6) & -1L << 32;
         return (int)(var6 >>> 32) + 1 < var4.length ? var4[(int)(var6 >>> 32) + 1].liiiIIllIl() : key;
      }
   }

   private void ilillIiill(class_332 done, iliiIIiIiiiIIi alpha, int key, long w, float y, float f, float x0, float doc, boolean ctx, IIliiIlllIliiIll t) {
      if (!(doc < 0.01F) && key != Integer.MIN_VALUE) {
         float var12 = t.IilliliilIIi() + 2.0F;
         if (key >= 0) {
            int var27 = key >>> 3;
            int var14 = key & 7;
            IlIilIilllIilIil var28 = alpha.liiiIIllIl()[var27];
            iliIlIlIiiIlIl var16 = this.IIIillIIil(alpha, var27, x0, t);
            if (var14 < var16.IilliliilIIi()) {
               String[] var29 = var28.lIiiIiIlilli();
               float var30 = y + (x0 - var16.iIlIlllllill()[var14]) / 2.0F;

               for (int var31 = 0; var31 < var29.length; var31++) {
                  if (var16.IliIlllilIi()[var31] == var14) {
                     float var32 = ctx
                        ? 1.0F
                        : Illillllil(
                           (float)(w - var28.iliIiiliiiii()[var31]) / (float)Math.max(160L, var28.IIIllIIliIIl()[var31] - var28.iliIiiliiiii()[var31])
                        );
                     float var33 = lililiilil(var32);
                     int var34 = Math.round(255.0F * doc * (0.34F + 0.66F * var33));
                     if (var34 >= 3) {
                        int var35 = Math.round(212.0F + 41.0F * var33);
                        t.IliIlllilIi(var29[var31], var30 + var16.liiiIIllIl()[var31], f, liilliiill(var35, Math.min(255, var34)));
                     }
                  }
               }
            }
         } else {
            long var13 = IiIilliIil(alpha, key);
            long var15 = iiIilIIlil(alpha, key, this.IlIIIiIlIi);
            float var17 = ctx ? 1.0F : Illillllil((float)(w - var13) / (float)Math.max(1L, var15 - var13));
            float var18 = 0.88F + 0.12F * (float)Math.sin((double)System.currentTimeMillis() / 420.0);
            byte var19 = 3;
            byte var20 = 4;
            int var21 = var19 * 3 + var20 * 2;
            int var22 = Math.round(y + (x0 - (float)var21) / 2.0F);
            int var23 = Math.round(f + (var12 - (float)var19) / 2.0F);

            for (int var24 = 0; var24 < 3; var24++) {
               float var25 = illilIilil(Illillllil(var17 * 3.0F - (float)var24));
               int var26 = Math.round(255.0F * doc * (0.28F + 0.72F * var25) * var18);
               IIIiiIillIIiiIil.lIiiIiIlilli(done, var22 + var24 * (var19 + var20), var23, var19, var19, 1, var26 << 24 | 16251388);
            }
         }
      }
   }

   private static int llIililIil(iliiIIiIiiiIIi t, long doc) {
      IlIilIilllIilIil[] var3 = t.liiiIIllIl();
      int var4 = 0;
      int var5 = var3.length - 1;
      int var6 = -1;

      while (var4 <= var5) {
         int var7 = var4 + var5 >>> 1;
         if (var3[var7].liiiIIllIl() <= doc) {
            var6 = var7;
            var4 = var7 + 1;
         } else {
            var5 = var7 - 1;
         }
      }

      if (var6 < 0) {
         return !var3[0].IliIlllilIi() && var3[0].liiiIIllIl() - doc < 1800L ? 0 : -1;
      } else {
         IlIilIilllIilIil var9 = var3[var6];
         IlIilIilllIilIil var8 = var6 + 1 < var3.length ? var3[var6 + 1] : null;
         if (!var9.IliIlllilIi()) {
            return var8 != null
                  && !var8.IliIlllilIi()
                  && doc > var9.iIlIlllllill() + 1000L
                  && var8.liiiIIllIl() - var9.iIlIlllllill() > 3500L
                  && var8.liiiIIllIl() - doc > 900L
               ? -(var6 + 2)
               : var6;
         } else {
            return var8 == null || var8.IliIlllilIi() || var8.liiiIIllIl() - doc >= 900L && var8.liiiIIllIl() - var9.liiiIIllIl() >= 2500L
               ? -(var6 + 2)
               : var6 + 1;
         }
      }
   }

   private static long IiIilliIil(iliiIIiIiiiIIi doc, int key) {
      if (key == (~(-766268458 - 89 - -105 >>> 29 | -766268458 - 89 - -105 << 3) ^ -1835180234)) {
         return 0L;
      } else {
         IlIilIilllIilIil var2 = doc.liiiIIllIl()[-(key + 2)];
         return var2.IliIlllilIi() ? var2.liiiIIllIl() : var2.iIlIlllllill();
      }
   }

   private static void IlIllllIll(String trackArtist, String isPlaying, boolean trackTitle) {
      long var11 = -3199549934354532923L;
      String var3 = trackArtist != null ? trackArtist : "";
      String var4 = isPlaying != null ? isPlaying : "";
      long var5 = System.currentTimeMillis();
      synchronized (illiilIlIi) {
         iIIiIIlIlIiIIl var8 = IiliilIlIi;
         var11 ^= ((long)(var3.equals(var8.liiiIIllIl()) && var4.equals(var8.iIlIlllllill()) ? 1 : 0) << 32 ^ var11) & -1L << 32;
         if ((int)(var11 >>> 32) == 0 || trackTitle != var8.IlIlllIlilIl()) {
            IiliilIlIi = new iIIiIIlIlIiIIl(
               var3,
               var4,
               (int)(var11 >>> 32) != 0 ? var8.IilliliilIIi() : Iiilililliililil.IliIlllilIi(var4, var3),
               var8.lIiiIiIlilli(),
               var8.IliIlllilIi(var5),
               var5,
               trackTitle
            );
         }
      }
   }

   private static String IIlIilIlIi(int sec) {
      if (sec < 0) {
         sec = 0;
      }

      return String.format(
         Locale.ROOT,
         IliIlllilIi<"IliIlllilIi","qOfKH99t2yP2Y1sPhRRW0NR73+2AUV98MAUya3x82RueVzY=">(),
         sec / (((-1793382723 * -71 << 31 | -1793382723 * -71 >>> 1) << 21 | (-1793382723 * -71 << 31 | -1793382723 * -71 >>> 1) >>> 11) ^ 425351096),
         sec % (609657803 + 111 - 7 ^ 609657871)
      );
   }

   private void Iillllilll(class_332 ctx, class_4587 factor, int sw, float ms, boolean scaled) {
      IIliiIlllIliiIll var6 = illlIiiIillIii.liiiIIllIl();
      IIliiIlllIliiIll var7 = illlIiiIillIii.iIlIlllllill();
      byte var8 = 5;
      boolean var9 = this.lIiiilIlIi.Iilllilliill();
      int var10 = var9 ? 20 : 0;
      int var11 = var9 ? 6 : 0;
      byte var12 = 70;
      byte var13 = 6;
      byte var14 = 10;
      byte var15 = 13;
      byte var16 = 5;
      int var17 = var14 + var16 + var15 + var16 + var14;
      int var18 = (int)var6.IilliliilIIi();
      int var19 = (int)var7.IilliliilIIi();
      int var20 = var8 + var10 + var11 + var12 + var13 + var17 + var8;
      int var21 = var8 + Math.max(var10, var19 + 1 + var18) + var8;
      iIIiIIlIlIiIIl var22 = IiliilIlIi;
      long var23 = var22.IliIlllilIi(System.currentTimeMillis());
      boolean var25 = this.iIiiilIlIi.Iilllilliill();
      byte var26 = 0;
      byte var27 = 13;
      int var28 = var21 + (var25 ? var26 + var27 : 0);
      float var29 = this.iilllIIill((float)var20 - (float)var8 * 2.0F, var6, var22, var23);
      lliiilIlIi = var29;
      int var30 = var28 + (int)Math.ceil((double)var29);
      float var31 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<"IliIlllilIi","f6fbyzDrmN8bQ4irQg57PMIfp7s0L9gshIWrmE3wTTWgEUM=">());
      float var32 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<"IliIlllilIi","f6fbyzDrmN8bQ4irQg57PMIfp7s0L9gshIWrmE3wTTWgEUM=">());
      int var33 = (sw - var20) / 2;
      byte var34 = 22;
      int var35 = var33 + Math.round(var31);
      int var36 = var34 + Math.round(var32);
      iiIliiiIIlliii var37 = IIililillIililil.ilIIllIiIIll(
         IliIlllilIi<"IliIlllilIi","f6fbyzDrmN8bQ4irQg57PMIfp7s0L9gshIWrmE3wTTWgEUM=">(),
         (float)var33 + var31,
         (float)var34 + var32,
         (float)var20,
         (float)var30
      );
      this.iliiilIlIi = var37;
      if (var37 != null) {
         var37.IilliliilIIi(factor);
      }

      this.Iiiilliiil(ctx, var35, var36, var20, var30, 7);
      int var38 = var35 + var8;
      if (var9) {
         int var39 = var36 + (var21 - var10) / 2;
         if (liliilIlIi != null) {
            iiIlilIlIIllilIl.liiiIIllIl((float)var38, (float)var39, (float)var10, (float)var10, liliilIlIi, factor);
         } else {
            IIIiiIillIIiiIil.lIiiIiIlilli(ctx, var38, var39, var10, var10, 4, new Color(46, 50, 62, 235).getRGB());
            IIIiiIillIIiiIil.lIiiIiIlilli(ctx, var38, var39 + var10 / 2, var10, var10 / 2, 4, new Color(32, 35, 45, 200).getRGB());
            byte var40 = 11;
            iiIlilIlIIllilIl.IliIlllilIi(
               (float)var38 + (float)(var10 - var40) / 2.0F,
               (float)var39 + (float)(var10 - var40) / 2.0F,
               (float)var40,
               (float)var40,
               lIlIIiliIlIIil.Iiilliiliiil(),
               new Color(200, 205, 215, 220),
               factor
            );
         }

         var38 += var10 + var11;
      }

      int var58 = var19 + 1 + var18;
      int var59 = var36 + (var21 - var58) / 2;
      var7.IliIlllilIi(iIlIiIllIi(var7, var22.iIlIlllllill(), var12), (float)var38, (float)var59, new Color(178, 184, 196, 235));
      this.lliililiil(ctx, var6, var22.liiiIIllIl(), var38, var59 + var19 + 1, var12, var21, var36, ms, scaled);
      int var41 = var36 + var21 / 2;
      int var42 = var35 + var20 - var8 - var17;
      Color var43 = new Color(212, 217, 227, 240);
      this.iiiilIIIIi(factor, lIlIIiliIlIIil.Illlllllilll(), var42 + var14 / 2, var41, var14, var43);
      var42 += var14 + var16;
      this.iiiilIIIIi(
         factor,
         var22.IlIlllIlilIl() ? lIlIIiliIlIIil.Ililllililil() : lIlIIiliIlIIil.IIillIiliIil(),
         var42 + var15 / 2,
         var41,
         var15,
         new Color(247, 249, 252, 255)
      );
      var42 += var15 + var16;
      this.iiiilIIIIi(factor, lIlIIiliIlIIil.Iilllilliill(), var42 + var14 / 2, var41, var14, var43);
      if (var25) {
         int var44 = var36 + var21 + var26;
         IIIiiIillIIiiIil.IilliliilIIi(ctx, (float)(var35 + var8), (float)var44, (float)(var20 - var8 * 2), 0.5F, 486539263);
         int var45 = var22.lIiiIiIlilli();
         int var46 = (int)(var23 / 1000L);
         int var47 = Math.max(0, var45 - var46);
         float var48 = (float)((double)var23 / ((double)var45 * 1000.0));
         String var49 = IIlIilIlIi(var46);
         String var50 = IliIlllilIi<"IliIlllilIi","e0U5zB9arFZJriTPGpoFk0S51Iz/UCDaBzKq1q0=">() + IIlIilIlIi(var47);
         int var51 = (int)var7.iIlIlllllill(var50);
         int var52 = var7.IlIillIiilIi(var44, var27);
         var7.IliIlllilIi(var49, (float)(var35 + var8), (float)var52, new Color(216, 221, 231, 240));
         var7.IliIlllilIi(var50, (float)(var35 + var20 - var8 - var51), (float)var52, new Color(150, 156, 168, 225));
         int var53 = var35 + var8 + (int)var7.iIlIlllllill(var49) + 7;
         int var54 = var35 + var20 - var8 - var51 - 7 - var53;
         byte var55 = 3;
         int var56 = var44 + (var27 - var55) / 2;
         if (var54 > 4) {
            IIIiiIillIIiiIil.lIiiIiIlilli(ctx, var53, var56, var54, var55, 1, new Color(255, 255, 255, 40).getRGB());
            int var57 = Math.round((float)var54 * Math.max(0.0F, Math.min(1.0F, var48)));
            if (var57 > 0) {
               IIIiiIillIIiiIil.lIiiIiIlilli(ctx, var53, var56, var57, var55, 1, new Color(245, 247, 250, 245).getRGB());
            }
         }
      }

      if (var29 > 0.5F) {
         this.Ilillllill(ctx, var35, var36 + var28, var20, var8, var6);
      }

      if (var37 != null) {
         factor.method_22909();
      }
   }

   private void Ilillllill(class_332 pad, int fT, int ox, int top, int cardW, IIliiIlllIliiIll ctx) {
      iliiIIiIiiiIIi var7 = this.IiIIIiIlIi;
      if (var7 != null) {
         float var8 = illilIilil(this.iiiiilIlIi);
         float var9 = IliiIilliiIi.IilliliilIIi(var8 * var8);

         try {
            IIIiiIillIIiiIil.IilliliilIIi(pad, (float)(fT + cardW), (float)ox, (float)(top - cardW * 2), 0.5F, 486539263);
            long var10 = this.iIIIIiIlIi;
            float var12 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.lIIIIiIlIi) / 340.0F);
            float var13 = this.ilIIIiIlIi == Integer.MIN_VALUE ? 1.0F : illilIilil(var12);
            float var14 = (float)(fT + cardW);
            float var15 = (float)top - (float)cardW * 2.0F;
            float var16 = (float)ox + 6.0F;
            if (var13 < 1.0F) {
               this.ilillIiill(pad, var7, this.ilIIIiIlIi, var10, var14, var16 - 3.0F * var13, var15, (1.0F - var13) * (1.0F - var13), true, ctx);
            }

            this.ilillIiill(pad, var7, this.llIIIiIlIi, var10, var14, var16 + 3.0F * (1.0F - var13), var15, var13, false, ctx);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var9);
         }
      }
   }

   public static void iiiIlIIIll(String trackArtist, String isPlaying, int elapsedSec, int trackTitle, boolean totalSec) {
      lIIlliIIll(
         trackArtist,
         isPlaying,
         (long)elapsedSec * (-1994313007826944267L ^ -1994313007826944739L),
         trackTitle,
         totalSec,
         -3666321916663831800L ^ -3666321916663828352L
      );
   }

   private static void IlIIillIIi(String artist, String title) {
      if (title != null && !title.isEmpty()) {
         String var2 = (artist + IliIlllilIi<"IliIlllilIi","JGQUW1nOZwPnD9rMGB87DMU3vDjnyFbA8YmBtGQ=">() + title).toLowerCase(Locale.ROOT);
         if (!var2.equals(liiIIiIlIi.get())) {
            liliilIlIi = null;
            iiliilIlIi.set(null);
            lIIIilliIIIill var3 = iiiIIiIlIi;
            if (var3 == null
               || !var3.IliIlllilIi().equals(var2)
               || System.currentTimeMillis() - var3.liiiIIllIl() >= (-4073279698636740612L ^ -4073279698636743324L)) {
               liiIIiIlIi.set(var2);
               IiiIIiIlIi.submit(
                  () -> {
                     if (var2.equals(liiIIiIlIi.get())) {
                        try {
                           String var3x = URLEncoder.encode(
                              (artist + IliIlllilIi<"IliIlllilIi","DeDunmWG1stzR/yMUtvKIiz+81C0rBnNN8RyHkk=">() + title).trim(), StandardCharsets.UTF_8
                           );
                           URI var4 = URI.create(
                              IliIlllilIi<"IliIlllilIi","uPk1Y/ZJkO5Di3HidOKfAgAiYIez2Mh0v0zBNSWVeUZToPMKPleFHbOI8v49rqqLH+TN1bmLKAMDG1Lm5QVCmxk=">()
                                 + var3x
                                 + IliIlllilIi<"IliIlllilIi","vkZ3NWGnvhU8xBYzTZv79nRuna57YyPzitdNelK/HnmOWIGH5OcjImtqdxp+npF9">()
                           );
                           HttpRequest var5 = HttpRequest.newBuilder(var4)
                              .timeout(Duration.ofSeconds(8L))
                              .header(
                                 IliIlllilIi<"IliIlllilIi","OpSMKzJAVMbQbhg8NAOUxrM/SUeX1rIXvS7aQfMZfjS5xaDlfh0=">(),
                                 IliIlllilIi<"IliIlllilIi","FQH9DyNSmwgF4p1A8X7VrwmXb/3jUB5QqRAaeengFwzfxrLBf/4=">()
                              )
                              .GET()
                              .build();
                           HttpResponse var6 = iliIIiIlIi.send(var5, BodyHandlers.ofString());
                           if (var6.statusCode() != 200) {
                              throw new IOException(
                                 IliIlllilIi<"IliIlllilIi","GiNocGJF0XpIEJ8YzOKgfuI9BYGcrNMVa1LTBTeDNT3ZQwWRAz4LWetamb8v+BA=">() + var6.statusCode()
                              );
                           }

                           String var7 = ilIIiIiIIi((String)var6.body());
                           if (var7 == null) {
                              return;
                           }

                           if (!var2.equals(liiIIiIlIi.get())) {
                              return;
                           }

                           String var8 = var7.replace(
                              IliIlllilIi<"IliIlllilIi","JU5Uy2fFEKD4ZR8OO5P8Zq2O8sfj06OzUEnp6fgyMywocK4MNA==">(),
                              IliIlllilIi<"IliIlllilIi","xwRmCjFa6lySXgKomBHTf9cc5SVaJ0XbFqXJdoILi483P8nCIw==">()
                           );
                           HttpResponse var9 = iliIIiIlIi.send(
                              HttpRequest.newBuilder(URI.create(var8)).timeout(Duration.ofSeconds(8L)).GET().build(), BodyHandlers.ofByteArray()
                           );
                           if (var9.statusCode() != 200) {
                              throw new IOException(
                                 IliIlllilIi<"IliIlllilIi","cO70ni/pscq4TpEc+MQ38ZA/r72JjikXgXP43fTjBRZHwe6XRSSRtgbP1dRYtbkk">() + var9.statusCode()
                              );
                           }

                           BufferedImage var10 = ImageIO.read(new ByteArrayInputStream((byte[])var9.body()));
                           if (var10 == null) {
                              return;
                           }

                           if (!var2.equals(liiIIiIlIi.get())) {
                              return;
                           }

                           int var11 = var10.getWidth();
                           int var12 = var10.getHeight();
                           iiliilIlIi.set(new iIIiiIilIlIiiIil(var2, var11, var12, var10.getRGB(0, 0, var11, var12, null, 0, var11)));
                        } catch (Throwable var13) {
                           iiiIIiIlIi = new lIIIilliIIIill(var2, System.currentTimeMillis());
                           liiIIiIlIi.compareAndSet(var2, "");
                        }
                     }
                  }
               );
            }
         }
      }
   }

   private void IIiillIiil(IIliiIlllIliiIll s, String f) {
      int var3 = f.length();
      this.iIiIIiIlIi = new String[var3];
      this.IliIIiIlIi = new float[var3 + 1];

      for (int var4 = 0; var4 < var3; var4++) {
         this.iIiIIiIlIi[var4] = String.valueOf(f.charAt(var4));
         this.IliIIiIlIi[var4] = s.iIlIlllllill(f.substring(0, var4));
      }

      this.IliIIiIlIi[var3] = s.iIlIlllllill(f);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.IIiiilIlIi.Iilllilliill()) {
         IlIIIIIillIIIIIi.IliIlllilIi();
      } else {
         IlIIIIIillIIIIIi.liiiIIllIl();
      }
   }

   public void lllllillll(class_332 ctx) {
      if (ctx != null) {
         iIIiiIilIlIiiIil var2 = iiliilIlIi.get() == null ? null : iiliilIlIi.getAndSet(null);
         if (var2 != null) {
            lIIIiiIIIi(var2);
         }

         class_4587 var3 = new class_4587();
         CorzClient.fontManager.iIlIlllllill(var3);
         IIIiiIillIIiiIil.IliIlllilIi(var3);
         double var4 = (double)Iiiilllliiilll.method_22683().method_4495();
         int var6 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
         float var7 = (float)((double)var6 / var4);
         boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
         int var9;
         if (var8) {
            var9 = Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var7);
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var9;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var7);
         } else {
            var9 = Iiiilllliiilll.method_22683().method_4486();
         }

         float var10 = IIililillIililil.ilIllIiIll();
         if (var10 < 0.004F) {
            if (var8) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }
         } else {
            float var11 = IliiIilliiIi.IilliliilIIi(var10);

            try {
               this.Iillllilll(ctx, var3, var9, var7, var8);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var11);
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   private float iilllIIill(float elMs, IIliiIlllIliiIll tr, iIIiIIlIlIiIIl fT, long innerW) {
      long var6 = System.nanoTime();
      float var8 = this.IIIIIiIlIi == 0L ? 0.0F : Math.min(0.1F, (float)(var6 - this.IIIIIiIlIi) / 1.0E9F);
      this.IIIIIiIlIi = var6;
      iliiIIiIiiiIIi var9 = this.IliiilIlIi.Iilllilliill() ? Iiilililliililil.liiiIIllIl(fT.IilliliilIIi()) : null;
      if (var9 != null && var9.liiiIIllIl().length == 0) {
         var9 = null;
      }

      if (var9 != null && var9 != this.IiIIIiIlIi) {
         this.IiIIIiIlIi = var9;
         this.iiIIIiIlIi.clear();
         this.llIIIiIlIi = Integer.MIN_VALUE;
         this.ilIIIiIlIi = Integer.MIN_VALUE;
      }

      if (elMs != this.liIIIiIlIi) {
         this.iiIIIiIlIi.clear();
         this.liIIIiIlIi = elMs;
      }

      this.iiiiilIlIi = lIliliIlil(this.iiiiilIlIi, var9 != null ? 1.0F : 0.0F, var8, 0.16F);
      if (this.IiIIIiIlIi != null && !(this.iiiiilIlIi < 0.003F)) {
         if (var9 != null) {
            this.iIIIIiIlIi = innerW + 120L;
            this.IlIIIiIlIi = (long)fT.lIiiIiIlilli() * 1000L;
            int var10 = this.lIilliIill(this.IiIIIiIlIi, llIililIil(this.IiIIIiIlIi, this.iIIIIiIlIi), this.iIIIIiIlIi, elMs, tr);
            if (var10 != this.llIIIiIlIi) {
               this.ilIIIiIlIi = this.llIIIiIlIi;
               this.llIIIiIlIi = var10;
               this.lIIIIiIlIi = System.currentTimeMillis();
            }
         }

         return (6.0F + tr.IilliliilIIi() + 2.0F + 6.0F) * illilIilil(this.iiiiilIlIi);
      } else {
         if (var9 == null) {
            this.IiIIIiIlIi = null;
            this.iiiiilIlIi = 0.0F;
         }

         return 0.0F;
      }
   }

   private void lliililiil(class_332 cardH, IIliiIlllIliiIll x, String col, int ctx, int scaled, int f, int y, int cardY, float factor, boolean s) {
      float var11 = x.iIlIlllllill(col);
      if (var11 <= (float)f) {
         x.IliIlllilIi(col, (float)ctx, (float)scaled, iIlIIiIlIi);
      } else {
         long var12 = System.currentTimeMillis();
         if (!col.equals(this.IIiIIiIlIi) || x != this.lIiIIiIlIi) {
            this.IIiIIiIlIi = col;
            this.lIiIIiIlIi = x;
            this.lliIIiIlIi = var12;
            this.IIiillIiil(x, col);
         }

         float var14 = var11 + 28.0F;
         long var15 = (long)Math.ceil((double)(var14 * 1000.0F / 28.0F));
         long var17 = (var12 - this.lliIIiIlIi) % (2600L + var15);
         float var19 = var17 < 2600L ? 0.0F : Math.min(var14, (float)(var17 - 2600L) * 28.0F / 1000.0F);
         iiIliiiIIlliii var20 = this.iliiilIlIi;
         float var21 = (float)ctx;
         float var22 = (float)cardY;
         float var23 = (float)(ctx + f);
         float var24 = (float)(cardY + y);
         if (var20 != null) {
            var21 = var20.liiiIIllIl(var21);
            var22 = var20.iIlIlllllill(var22);
            var23 = var20.liiiIIllIl(var23);
            var24 = var20.iIlIlllllill(var24);
         }

         float var25 = s ? factor : 1.0F;
         class_4587 var26 = IIIiiIillIIiiIil.liiiIIllIl();
         IIIiiIillIIiiIil.IliIlllilIi(lllIIiIlIi);

         try {
            cardH.method_44379(
               (int)Math.floor((double)(var21 * var25)),
               (int)Math.floor((double)(var22 * var25)),
               (int)Math.ceil((double)(var23 * var25)),
               (int)Math.ceil((double)(var24 * var25))
            );
         } finally {
            IIIiiIillIIiiIil.IliIlllilIi(var26);
         }

         float var27 = Math.min(1.0F, var19 / 12.0F) * Math.min(1.0F, (var14 - var19) / 12.0F);
         this.iIiilIliil(x, (float)ctx - var19, scaled, ctx, ctx + f, var27);
         if (var19 > 0.0F) {
            this.iIiilIliil(x, (float)ctx - var19 + var14, scaled, ctx, ctx + f, var27);
         }

         cardH.method_44380();
      }
   }

   private static float illilIilil(float v) {
      float var1 = 1.0F - Illillllil(v);
      return 1.0F - var1 * var1 * var1;
   }

   private static float lililiilil(float v) {
      v = Illillllil(v);
      return v * v * (3.0F - 2.0F * v);
   }

   private void iIiilIliil(IIliiIlllIliiIll right, float f, int left, int y, int x0, float fadeL) {
      for (int var7 = 0; var7 < this.iIiIIiIlIi.length; var7++) {
         float var8 = f + this.IliIIiIlIi[var7];
         float var9 = this.IliIIiIlIi[var7 + 1] - this.IliIIiIlIi[var7];
         float var10 = var8 + var9 / 2.0F;
         if (!(var8 + var9 < (float)y) && !(var8 > (float)x0) && !this.iIiIIiIlIi[var7].isBlank()) {
            float var11 = Math.min(1.0F, ((float)x0 - var10) / 12.0F);
            if (fadeL > 0.0F) {
               var11 = Math.min(var11, 1.0F - fadeL + fadeL * Math.min(1.0F, (var10 - (float)y) / 12.0F));
            }

            if (!(var11 <= 0.02F)) {
               right.IliIlllilIi(this.iIiIIiIlIi[var7], var8, (float)left, IllIIiIlIi[Math.round(Illillllil(var11) * (float)(IllIIiIlIi.length - 1))]);
            }
         }
      }
   }

   private static float lIliliIlil(float v, float tau, float target, float dt) {
      if (target <= 0.0F) {
         return v;
      } else {
         float var4 = v + (tau - v) * (1.0F - (float)Math.exp((double)(-target / dt)));
         return Math.abs(var4 - tau) < 0.002F ? tau : var4;
      }
   }

   private void Iiiilliiil(class_332 w, int h, int y, int ctx, int x, int r) {
      if (IIililillIililil.liIlliiIll()) {
         llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.IlIlIlIiIl, (float)h, (float)y, (float)ctx, (float)x, 1.0F);
      } else {
         IIIiiIillIIiiIil.lIiiIiIlilli(w, h, y, ctx, x, r, -((1784858801 - 67) * 75) * -3 ^ 1490167982);
      }
   }

   private static float Illillllil(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static void IIllllIlll(class_2960 art) {
      liliilIlIi = art;
   }

   private static void lIIIiiIIIi(iIIiiIilIlIiiIil c) {
      if (c.lllIlilIil.equals(liiIIiIlIi.get())) {
         try {
            class_1011 var1 = new class_1011(c.illIlilIil, c.IilIlilIil, false);

            for (int var2 = 0; var2 < c.lilIlilIil.length; var2++) {
               var1.method_61941(var2 % c.illIlilIil, var2 / c.illIlilIil, c.lilIlilIil[var2]);
            }

            Iiiilllliiilll.method_1531()
               .method_4616(
                  llliilIlIi, new class_1043(() -> IliIlllilIi<"IliIlllilIi","lGl4LYyNYOxgoFJ02DFh2WUfGoVI6LIy6uitzqWi6JtoOO+peGwdiTVYkvnVVw==">(), var1)
               );
            liliilIlIi = llliilIlIi;
            if (!c.lllIlilIil.equals(liiIIiIlIi.get())) {
               liliilIlIi = null;
            }
         } catch (Throwable var3) {
         }
      }
   }
}
