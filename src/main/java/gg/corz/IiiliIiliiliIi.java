package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load;
import net.minecraft.class_10256;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1321;
import net.minecraft.class_1429;
import net.minecraft.class_1439;
import net.minecraft.class_1496;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1604;
import net.minecraft.class_1646;
import net.minecraft.class_1693;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2286;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2426;
import net.minecraft.class_243;
import net.minecraft.class_2457;
import net.minecraft.class_2459;
import net.minecraft.class_2462;
import net.minecraft.class_2580;
import net.minecraft.class_2586;
import net.minecraft.class_2587;
import net.minecraft.class_2589;
import net.minecraft.class_2595;
import net.minecraft.class_2601;
import net.minecraft.class_2605;
import net.minecraft.class_2608;
import net.minecraft.class_2611;
import net.minecraft.class_2614;
import net.minecraft.class_2627;
import net.minecraft.class_2636;
import net.minecraft.class_2646;
import net.minecraft.class_2665;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_3719;
import net.minecraft.class_3720;
import net.minecraft.class_3722;
import net.minecraft.class_3723;
import net.minecraft.class_3866;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_8961;
import net.minecraft.class_9199;
import net.minecraft.class_9817;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2902.class_2903;
import org.joml.Matrix4f;

public class IiiliIiliiliIi extends ilIllIiIll {
   private int iIIlIIiiiIlIlIIiii;
   private int llIlIIiiiilIlIIiii;
   private static final int IIiiiiliilIiiiilii = 6;
   private final ConcurrentHashMap<class_1923, Iilllilllilllill> IlIIIIiiillIIIIiii;
   private final iIIlIIIiIlIlIIIi liIIIIiiiiiIIIIiii;
   private final Set<Long> liiiIIiiiiiiiIIiii;
   private final iiIiiilIIliiil ililiiliiIiiliilii;
   private final iiIiiilIIliiil lIiliiliiiIiliilii;
   private final llllIliilllIli lIiiIIiiiiIiiIIiii;
   private volatile boolean IIliIIiiilIliIIiii;
   private final iIIlIIIiIlIlIIIi IliIIIiiilliIIIiii;
   private static final long iiiiiiliiIIIIIIiii = 60000L;
   private int liiIIIiiiiiiIIIiii;
   private int IiIlIIiiiliIlIIiii;
   private static final boolean iIlliiliiIllliilii = true;
   private long IIIIlIiiilIIIlIiii;
   private static final int lliiiiliiiliiiilii = 800;
   private volatile List<iliIIillIiiIIill> iIilIIiiiIlilIIiii;
   private final iiIiiilIIliiil iiIiiiliiIIliiilii;
   private long lillIIiiiiillIIiii;
   private static final long iiliIIiiiIIiiIIiii = 250L;
   private final ConcurrentHashMap<Long, iiiIIIilIIIlIIil> lIiIIIiiiiIiIIIiii;
   private int IlllIIiiillllIIiii;
   private volatile List<iIliiillIlliiill> iilIIIiiiIIiIIIiii;
   private int IilIIIiiililIIIiii;
   private boolean iiilIIiiiIIIiIIiii;
   public static volatile IiiliIiliiliIi IliiIIiiilliiIIiii;
   private long llliIIiiiilliIIiii;
   private int iIlIIIiiiIllIIIiii;
   private static final int IlIiIIiiillIiIIiii = 4;
   private final iiIiiilIIliiil IIIiiiliilIIiiilii;
   private static final int IiIIlIiiiliIIlIiii = 5;
   private int iiIlIIiiiIIllIIiii;
   private static final int lIIiIIiiiiIIiIIiii = 5;
   private final iiIiiilIIliiil llIiiiliiilIiiilii;
   private static final int Iiiiiiliiliiiiilii = 600;
   private int IIIlIIiiilIIlIIiii;
   private static final int iIiiiiliiIliiiilii = 10;
   private final iiIiiilIIliiil Ililiiliilliliilii;
   private static final int lIlIlIiiiiIlIlIiii = 24;
   private int lIllIIiiiiIllIIiii;
   private int lllIIIiiiillIIIiii;
   private static final long lIIIIIiiiiIIIIIiii = 5000L;
   private int llIIlIiiiilIIlIiii;
   private volatile liIlIIliiIlIIl iIliIIiiiIlliIIiii;
   private final iiIiiilIIliiil lIliiiliiiIliiilii;
   private final iiIiiilIIliiil IiIiiiliiliIiiilii;
   private static final int liliiiliiiiliiilii = 120;
   private boolean IIlIIIiiilIlIIIiii;
   private volatile String llilIIiiiililIIiii;
   private static final long iiIIlIiiiIIlIlIiii = 10000L;
   private static final int illiiiliiIiliiilii = 320;
   private long iIIIlIiiiIlIIlIiii;
   private static final int Illiiiliillliiilii = 6;
   private final iilliIlIIiliIl lllliiliiillliilii = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","M8fwCa3xF+CZQh83rWlPrAA7nJbURNzdGCC/ZdENhTNiDqWeBuhb">(),
      IliIlllilIi<"IliIlllilIi","/eoI9eKjbQ80346BLx6Pv8Two8xP2c8w2Viruh+dqhJ1ryvkqtInPFYyy9qO+Uco1/6fWDqO8kNHIhVL77o1antEXtDoDPCBdO/K0fTRS2cJEQaVob44qnS7o8G2Guv1U1/87BX8LqvDhqt5xiJuAJ9jE7E/Jwgq74Hog8KTqwy4aF0=">(),
      5,
      1,
      10
   );
   private final ConcurrentHashMap<class_1923, Long> ilIIIIiiiIiIIIIiii;
   public static final String IIlliiliilIlliilii = "chunkfinder-v5-budgeted-2026-10-04";
   private volatile List<iliIIillIiiIIill> iliIIIiiiIiiIIIiii;
   private volatile int IiliIIiiililiIIiii;
   private final iilliIlIIiliIl Iilliiliililliilii = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","6knE83HjGHGoM5hYh9+8x57c3gTsYEZqif1591nr/3b8VAR2BJqc">(),
      IliIlllilIi<"IliIlllilIi","8nqxakluKoEHX7ou6iNKieixLyDrLDCJsvgBNZeCXtTDivWbYZoA/K5h2XuAkHD2TrrDpvhcHtF5ZACP+98BGzI=">(),
      8,
      1,
      32
   );
   private final lIIlIiIliIIlIiIl iliiIIiiiIiiiIIiii;
   private int IiilIIiiiliilIIiii;
   private static final long ilIiIIiiiIiIiIIiii = 30000L;
   private final iiIiiilIIliiil iIIiiiliiIlIiiilii;
   private final ExecutorService liIiIIiiiiiIiIIiii;
   private final iiIiiilIIliiil liiliiliiiiiliilii;
   private final iiIiiilIIliiil iilliiliiIIiliilii = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","XMgKf9oRbSlZui4f8IYIbu5P+rwkJhKMkIhpHSHFy/yMyonB/iXKVw==">(),
      IliIlllilIi<"IliIlllilIi","mZHCjZdV/VpowLJecWx2Nxjuq2tKZpZN2aDkYM6MaXz26bcABz/dN4zgjltMMgj6yvTACwxusEAyDW97uk0XdFj6FmM++S3fq9G0lc+KOhlDrFISxnuBi0XpKwce8Js9KbL1H3DRseZDXfLl">(),
      true
   );
   private int illlIIiiiIillIIiii;
   private final ConcurrentHashMap<Long, Long> IIilIIiiilIilIIiii;

   private void iiiilIIIIi(Matrix4f cluster, iIliiillIlliiill matrix, boolean beam) {
      boolean var4 = matrix.lliIiiiill == llllllililllllil.lIIIliiIil;
      double var5 = (double)matrix.lilIiiiill + 1.02;
      float var7 = iIiiIIilIliiIIil.Iiilliiliiil(var5);
      int var8 = IlIIilIlllIIilIl.lliiIlliIl;
      int var9 = this.lllIiillIi(var8, var4 ? 1.0F : 0.85F);
      int var10 = this.lllIiillIi(-16777216, var4 ? 0.6F : 0.5F);
      int var11 = this.lllIiillIi(var8, var4 ? 0.2F : 0.14F);
      int var12 = this.lllIiillIi(var8, 0.0F);
      float var13 = var7 + (var4 ? 4.0F : 3.0F);
      int[] var14 = matrix.IIIliiiill;

      for (byte var15 = 0; var15 + 3 < var14.length; var15 += 4) {
         if (!iIiiIIilIliiIIil.IlIillIiilIi((double)(var14[var15] + var14[var15 + 2]) * 0.5, var5, (double)(var14[var15 + 1] + var14[var15 + 3]) * 0.5, 12.0F)) {
            this.lIIIiiIIIi(
               cluster,
               iIiiIIilIliiIIil.Ililllililil((double)var14[var15]),
               iIiiIIilIliiIIil.IIIilIIiiIIi((double)var14[var15 + 1]),
               iIiiIIilIliiIIil.Ililllililil((double)var14[var15 + 2]),
               iIiiIIilIliiIIil.IIIilIIiiIIi((double)var14[var15 + 3]),
               var7,
               var13,
               var9,
               var10,
               var11,
               var12
            );
         }
      }

      if (beam) {
         this.IlIIillIIi(cluster, iIiiIIilIliiIIil.Ililllililil(matrix.liiIiiiill), var7, iIiiIIilIliiIIil.IIIilIIiiIIi(matrix.iiiIiiiill), var8, var4);
      }
   }

   public static void iIlllIllll(class_1937 world, class_2338 oldState, class_2680 newState, class_2680 pos) {
      IiiliIiliiliIi var4 = IliiIIiiilliiIIiii;
      if (var4 != null && var4.IliIlllilIi()) {
         var4.lllllillll(oldState, newState, pos);
      }
   }

   private void lIIIiiIIIi(
      Matrix4f accentLine, float matrix, float z1, float wallTop, float z2, float x2, float wallBottom, int y, int x1, int shadowLine, int topY
   ) {
      class_4588 var12 = iIiiIIilIliiIIil.IilliliilIIi();
      var12.method_22918(accentLine, matrix, x2, z1).method_39415(shadowLine);
      var12.method_22918(accentLine, wallTop, x2, z2).method_39415(shadowLine);
      var12.method_22918(accentLine, wallTop, wallBottom, z2).method_39415(topY);
      var12.method_22918(accentLine, matrix, wallBottom, z1).method_39415(topY);
      iIiiIIilIliiIIil.Iliilliiilii(accentLine, matrix, x2, z1, wallTop, x2, z2, x1, 4.5F);
      iIiiIIilIliiIIil.Iliilliiilii(accentLine, matrix, x2, z1, wallTop, x2, z2, y, 2.5F);
   }

   private void lIIiiiIIii(class_4587 c, iliIIillIiiIIill matrices, float sy, float sx) {
      IIliiIlllIliiIll var5 = CorzClient.fontManager.lIiiIiIlilli();
      boolean var6 = matrices.Iiilillill >= 75;
      String var7 = IliIlllilIi<"IliIlllilIi","w9wwKkITjcDFCnRFnh8bGVWyq3PhSQJ0qj9qgvA4n6WoXckBKeGaaQ==">()
         + (matrices.liiiIIllIl() ? IliIlllilIi<"IliIlllilIi","uynhInRq3W3fGIpZw+80rB2p9F9Ww2VaY5P/Nr4=">() : "")
         + matrices.Iiilillill
         + IliIlllilIi<"IliIlllilIi","YoQbhPlIOEbEmgFseSuRsK0Q1UVJHR8H1IWlcC4=">();
      double var8 = matrices.Ililillill - Iiiilllliiilll.field_1724.method_23317();
      double var10 = matrices.ililillill - Iiiilllliiilll.field_1724.method_23321();
      int var12 = (int)Math.round(Math.sqrt(var8 * var8 + var10 * var10));
      String var13 = var12 + IliIlllilIi<"IliIlllilIi","BFjnqFLX4LyWvYgQyoIB8TCTNJo8wnVH9LF73mo=">();
      float var14 = var5.IilliliilIIi();
      float var15 = var14 * 0.42F;
      float var16 = 4.0F;
      float var17 = Math.max(var5.iIlIlllllill(var7), var5.iIlIlllllill(var13));
      float var18 = 6.0F;
      float var19 = 4.0F;
      float var20 = 1.5F;
      float var21 = var15 + var16 + var17 + var18 * 2.0F;
      float var22 = var14 * 2.0F + var20 + var19 * 2.0F;
      float var23 = 0.55F;
      c.method_22903();
      c.method_46416(sy, sx, 0.0F);
      c.method_22905(var23, var23, 1.0F);
      c.method_46416(-sy, -sx, 0.0F);
      float var24 = sy - var21 / 2.0F;
      float var25 = sx - var22;
      int var26 = -16184564;
      Color var27 = new Color(var26 >> 16 & 0xFF, var26 >> 8 & 0xFF, var26 & 0xFF, 215);
      int var28 = IlIIilIlllIIilIl.lliiIlliIl;
      int var29 = var28 >> 16 & 0xFF;
      int var30 = var28 >> 8 & 0xFF;
      int var31 = var28 & 0xFF;
      float var32 = var24 + var18;
      float var33 = var25 + var19 + (var14 - var15) / 2.0F;
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(c, var27, (double)var24, (double)var25, (double)(var24 + var21), (double)(var25 + var22), 2.5, 4.0);
         llilllililll.IiIlliIliiIl(
            c,
            new Color(var29, var30, var31, var6 ? 255 : 150),
            (double)var32,
            (double)var33,
            (double)(var32 + var15),
            (double)(var33 + var15),
            (double)(var15 / 2.0F),
            6.0
         );
      } finally {
         llilllililll.IIIilIIiiIIi();
      }

      float var34 = var24 + var18 + var15 + var16;
      var5.IliIlllilIi(var7, var34, var25 + var19, new Color(-1));
      var5.IliIlllilIi(var13, var34, var25 + var19 + var14 + var20, new Color(-8421505));
      if (var6) {
         llilllililll.IiIlliIliiIl(
            c,
            new Color(var29, var30, var31, 220),
            (double)var34,
            (double)(var25 + var22 - var19 + 1.0F),
            (double)(var24 + var21 - var18),
            (double)(var25 + var22 - var19 + 2.0F),
            0.5,
            2.0
         );
      }

      c.method_22909();
   }

   private iliIIillIiiIIill Illlilllli(lIiiIIIiiIiiIIIi underground, Illiilllllliilll sig, IllIiIIllllIiIIl now, String knowledge, long d, boolean e, int dim) {
      long var12 = 7177810193412750594L;
      ArrayList var9 = new ArrayList<>(underground.iIIIlIlIIl());
      String var10 = now.iIliIIilIl == lIiiIilliIiiIill.iIlililill
         ? IliIlllilIi<"IliIlllilIi","S03IBZJa1yKJe4yB2QOscEw1AKv2hSlvNGlyPyVPRs//sCvtsoBM21SOTg==">()
         : sig.iliIiiliiiii();
      var12 ^= ((long)iIIIlillIlIIlill.IliIlllilIi(underground) << 32 ^ var12) & -1L << 32;
      return new iliIIillIiiIIill(
         underground.IlIllllIll(),
         knowledge,
         var9,
         underground.IiIIlliIIl(),
         underground.lIlIliIlIl(),
         underground.illIlIilIl(),
         underground.iiIIlIIlIl(),
         underground.IllIllllIl(),
         underground.lilIliilIl(),
         now.liIiIIilIl,
         now.IIliIIilIl,
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.IIiilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.lIiilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.iIiilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.Iliilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.lliilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.iiiilliiil),
         underground.IiIlliIliiIl(lIlliIIiiIlliIIi.IIIIiliiil),
         (int)(var12 >>> 32),
         underground.Iilllilliill(),
         underground.IIIilIIiiIIi(),
         dim,
         e,
         now.llliIIilIl,
         var10,
         d
      );
   }

   private void lIiIiiIiIi(class_2818 chunk, long key) {
      try {
         class_1923 var4 = chunk.method_12004();
         long var5 = System.currentTimeMillis();
         long var7 = this.Iillllilll(var4.field_9181, var4.field_9180);
         long var9 = this.iilllIIill(var4.field_9181, var4.field_9180);
         lililIIiiililIIi var11 = iiIiiIlIIliiIl.lIiiIiIlilli(
            chunk,
            Iiiilllliiilll.field_1687,
            this.lIiiIIiiiiIiiIIiii,
            this.liiIIIiiiiiiIIIiii,
            this.IIIlIIiiilIIlIIiii,
            this.iliiIIiiiIiiiIIiii.iliIiiliiiii(key),
            true,
            var7,
            var9
         );
         long var12 = IliIilliIi(var11);
         if (var11.IliilIiiil.isEmpty() && var11.lliilIiiil == 0 && !var11.iliilIiiil.IiIiliIiiiIi()) {
            if (this.lIiIIIiiiiIiIIIiii.remove(key) != null) {
               this.iiilIIiiiIIIiIIiii = true;
            }
         } else {
            iiiIIIilIIIlIIil var14 = this.lIiIIIiiiiIiIIIiii
               .put(
                  key,
                  new iiiIIIilIIIlIIil(
                     var11.IliilIiiil,
                     var11.lliilIiiil,
                     var11.iliilIiiil,
                     var11.IiiilIiiil,
                     var11.ilIIiIiiil,
                     var11.IlIIiIiiil,
                     var11.llIIiIiiil,
                     var11.liIIiIiiil,
                     var12
                  )
               );
            if (var14 == null || var14.iIlIIlIIil != var12) {
               this.iiilIIiiiIIIiIIiii = true;
            }
         }

         for (lIIIIlIliIIIIlIl var15 : var11.IIlIiIiiil) {
            this.iliiIIiiiIiiiIIiii.IIIllIIliIIl(var15.llIIIiilIl, var15.ilIIIiilIl, var15.IiIIIiilIl, null, var5);
         }

         for (lIIIIlIliIIIIlIl var19 : var11.iiIIiIiiil) {
            this.iliiIIiiiIiiiIIiii.lIiiIiIlilli(var19.llIIIiilIl, var19.ilIIIiilIl, var19.IiIIIiilIl);
         }

         if (var11.liIIiIiiil) {
            if (this.liiiIIiiiiiiiIIiii.add(key)) {
               this.iiilIIiiiIIIiIIiii = true;
            }
         } else if (this.liiiIIiiiiiiiIIiii.remove(key)) {
            this.iiilIIiiiIIIiIIiii = true;
         }

         this.llIlIIiiiilIlIIiii++;
         this.IiIlIIiiiliIlIIiii = this.IiIlIIiiiliIlIIiii + var11.liiilIiiil;
         this.iiIlIIiiiIIllIIiii = this.iiIlIIiiiIIllIIiii + var11.iiiilIiiil;
         this.lIllIIiiiiIllIIiii = this.lIllIIiiiiIllIIiii + var11.IliilIiiil.size();
         this.lillIIiiiiillIIiii = this.lillIIiiiiillIIiii + var11.IIIIiIiiil;
         if (var7 != 0L) {
            this.IlllIIiiillllIIiii++;
         }

         if (var9 != 0L) {
            this.illlIIiiiIillIIiii++;
         }
      } catch (Throwable var16) {
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         this.iIiliIlili();
      }
   }

   @Override
   protected void Iilililiiili() {
      this.IlIIIIiiillIIIIiii.clear();
      this.ilIIIIiiiIiIIIIiii.clear();
      this.liIIIIiiiiiIIIIiii.liiiIIllIl();
      this.IIlIIIiiilIlIIIiii = false;
      this.lllIIIiiiillIIIiii = -1;
      this.iilIIIiiiIIiIIIiii = new ArrayList<>();
      this.Ilillllill();
   }

   private void IIIlilIIli(String dim) {
      lIIillIiiIIillIi var2 = this.liiIiiiiIi();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      boolean var5 = var2.llIIIIlIIi && this.iliiIIiiiIiiiIIiii.Illlllllilll();

      for (Entry var7 : this.lIiIIIiiiiIiIIIiii.entrySet()) {
         iiiIIIilIIIlIIil var8 = (iiiIIIilIIIlIIil)var7.getValue();
         boolean var9 = var2.llIIIIlIIi && (var5 || this.liiiIIiiiiiiiIIiii.contains(var7.getKey()));

         for (ilIlIIilIiIlIIil var11 : var8.IlIIIlIIil) {
            if (iiliiiIIiiii.IliIlllilIi(var11.llIiIlIIil) && (!var9 || !var11.iliIiiliiiii(64))) {
               var3.add(var11);
            }
         }

         var4.addAll(var8.IiIIIlIIil);
      }

      if (var2.iIIIIIlIIi) {
         var3.addAll(this.illliIilli());
      }

      liIlIIliiIlIIl var12 = new liIlIIliiIlIIl(dim, this.IiliIIiiililiIIiii, var2, var5, iiIiiIlIIliiIl.IliIlllilIi(Iiiilllliiilll.field_1687), var4, var3);
      this.IIliIIiiilIliIIiii = true;
      this.liIiIIiiiiiIiIIiii.submit(() -> {
         try {
            var12.IlIiIliIlllIiIliIl = iiiiliIIIIii.IliIlllilIi(var12.lIIiIliIliIIiIliIl, 5, 4);
         } catch (Throwable var3x) {
            var12.IlIiIliIlllIiIliIl = new ArrayList<>();
         }

         this.iIliIIiiiIlliIIiii = var12;
      });
   }

   private long Iillllilll(int cx, int cz) {
      try {
         iIiilIllIliilIll var3 = liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.get(class_1923.method_8331(cx, cz));
         if (var3 == null) {
            return 0L;
         } else {
            long var4 = 0L;

            for (int var6 = 1; var6 <= var3.IIliIlilll && var6 - 1 < 64; var6++) {
               int var7 = (var3.lIliIlilll + (var6 - 1)) * 16;
               if (var7 > -30) {
                  break;
               }

               if (iiliiiIIiiii.lIiiIiIlilli(var7) && var3.iIliIlilll[var6] == lilIlIiiilIlIi.IlIlIlIiillIlIlIii) {
                  var4 |= 1L << var6 - 1;
               }
            }

            return var4;
         }
      } catch (Throwable var8) {
         return 0L;
      }
   }

   private void lliliilili(Matrix4f c, iliIIillIiiIIill matrix, boolean high) {
      int var4 = IlIIilIlllIIilIl.lliiIlliIl;
      int var5 = this.lllIiillIi(var4, high ? 1.0F : 0.8F);
      int var6 = this.lllIiillIi(-16777216, 0.5F);
      float var7 = iIiiIIilIliiIIil.Ililllililil((double)matrix.Iillillill);
      float var8 = iIiiIIilIliiIIil.Iiilliiliiil((double)matrix.lillillill);
      float var9 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)matrix.iillillill);
      float var10 = iIiiIIilIliiIIil.Ililllililil((double)matrix.IIilillill + 1.0);
      float var11 = iIiiIIilIliiIIil.Iiilliiliiil((double)matrix.lIilillill + 1.0);
      float var12 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)matrix.iIilillill + 1.0);
      float var13 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var14 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var15 = (float)(var4 & 0xFF) / 255.0F;
      iIiiIIilIliiIIil.IIlilIliiIli(c, var7, var8, var9, var10, var11, var12, var13, var14, var15, high ? 0.1F : 0.06F);
      iIiiIIilIliiIIil.iIIIlIlIIl(c, var7, var8, var9, var10, var11, var12, var6, 4.0F);
      iIiiIIilIliiIIil.iIIIlIlIIl(c, var7, var8, var9, var10, var11, var12, var5, 2.0F);
   }

   private static long IliIilliIi(lililIIiiililIIi scan) {
      long var1 = 1125899906842597L;

      for (ilIlIIilIiIlIIil var4 : scan.IliilIiiil) {
         var1 = 31L * var1 + (long)var4.IlIiIlIIil;
         var1 = 31L * var1 + (long)var4.llIiIlIIil;
         var1 = 31L * var1 + (long)var4.ilIiIlIIil;
         var1 = 31L * var1 + (long)var4.IlliIlIIil;
         var1 = 31L * var1 + (long)var4.llliIlIIil;
         var1 = 31L * var1 + (long)var4.liIiIlIIil;
      }

      var1 = 31L * var1 + (long)scan.lliilIiiil;
      var1 = 31L * var1 + (long)scan.IiiilIiiil.size();
      var1 = 31L * var1 + (long)scan.ilIIiIiiil;
      var1 = 31L * var1 + (long)scan.IlIIiIiiil;
      var1 = 31L * var1 + (long)scan.llIIiIiiil;
      var1 = 31L * var1 + (long)scan.lIIIiIiiil;
      var1 = 31L * var1 + (long)(scan.liIIiIiiil ? 1 : 0);

      for (int var17 = 1; var17 < 148; var17++) {
         var1 = 31L * var1 + (long)scan.iliilIiiil.IIlllIlliIll(var17);
      }

      return var1;
   }

   private void liilliiill() {
      List var1 = this.iilIIIiiiIIiIIIiii;
      if (var1.size() >= (-(769016132 + -87) + -7 ^ -769016050) && Iiiilllliiilll.field_1724 != null) {
         double var2 = Iiiilllliiilll.field_1724.method_23317();
         double var4 = Iiiilllliiilll.field_1724.method_23321();
         ArrayList var6 = new ArrayList(var1);
         var6.sort((a, px) -> Double.compare(liIIiiiIIi(a, var2, var4), liIIiiiIIi(px, var2, var4)));
         this.iilIIIiiiIIiIIIiii = var6;
      }
   }

   private Iilllilllilllill iiIilIIlil(class_2818 chunk, class_1923 chunkPos) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      short var15 = 320;
      int var16 = Iiiilllliiilll.field_1687.method_31607();
      int var17 = Iiiilllliiilll.field_1687.method_8597().comp_652() + Iiiilllliiilll.field_1687.method_31607();
      int var18 = 0;
      ArrayList var19 = new ArrayList();
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      ArrayList var28 = new ArrayList();
      ArrayList var29 = new ArrayList();
      ArrayList var30 = new ArrayList();
      ArrayList var31 = new ArrayList();
      ArrayList var32 = new ArrayList();

      for (class_2338 var34 : chunk.method_12021()) {
         if (var34.method_10264() <= var15) {
            class_2586 var35 = Iiiilllliiilll.field_1687.method_8321(var34);
            if (var35 != null) {
               if (var35 instanceof class_2595 || var35 instanceof class_2646) {
                  var3 += 5;
                  var8++;
                  var11 = true;
                  var31.add(var34);
                  var19.add(var34);
               } else if (var35 instanceof class_3719) {
                  var3 += 4;
                  var8++;
                  var11 = true;
                  var31.add(var34);
                  var19.add(var34);
               } else if (var35 instanceof class_2627) {
                  var3 += 8;
                  var8++;
                  var7 += 4;
                  var11 = true;
                  var31.add(var34);
                  var19.add(var34);
               } else if (var35 instanceof class_2611) {
                  var7 += 3;
                  var19.add(var34);
               } else if (var35 instanceof class_2614) {
                  var3 += 3;
                  var6 += 2;
                  var14 = true;
                  var11 = true;
                  var20++;
                  var28.add(var34);
                  var19.add(var34);
               } else if (var35 instanceof class_3866 || var35 instanceof class_3720 || var35 instanceof class_3723) {
                  var3 += 3;
                  var8++;
                  var11 = true;
                  var31.add(var34);
                  var19.add(var34);
               } else if (var35 instanceof class_2580) {
                  var3 += 15;
                  var8++;
                  var7 += 5;
                  var11 = true;
                  var19.add(var34);
               } else if (var35 instanceof class_2605) {
                  var7 += 3;
                  var19.add(var34);
               } else if (var35 instanceof class_2589) {
                  var3 += 2;
                  var7 += 2;
                  var19.add(var34);
               } else if (var35 instanceof class_2587) {
                  var7 += 3;
                  var19.add(var34);
               } else if (var35 instanceof class_3722) {
                  var7++;
                  var19.add(var34);
               } else if (var35 instanceof class_8961 || var35 instanceof class_9199) {
                  var27++;
                  var3 += 10;
                  var19.add(var34);
               } else if (var35 instanceof class_2636) {
                  var26++;
                  var3 += 4;
                  var19.add(var34);
               } else if (var35 instanceof class_2601) {
                  if (this.IIIiiiliilIIiiilii.Iilllilliill()) {
                     var4 += 3;
                     var6 += 2;
                     var12 = true;
                     var14 = true;
                     var23++;
                     var32.add(var34);
                     var19.add(var34);
                  }
               } else if (var35 instanceof class_2608 && this.IIIiiiliilIIiiilii.Iilllilliill()) {
                  var4 += 3;
                  var6 += 2;
                  var12 = true;
                  var14 = true;
                  var23++;
                  var32.add(var34);
                  var19.add(var34);
               }
            }
         }
      }

      int var51 = chunkPos.method_8326();
      int var52 = chunkPos.method_8328();

      for (int var53 = 0; var53 < 16; var53++) {
         for (int var36 = 0; var36 < 16; var36++) {
            int var37 = chunk.method_12005(class_2903.field_13197, var53, var36) + 1;
            if (var37 > var18) {
               var18 = var37;
            }
         }
      }

      boolean var54 = this.IIIiiiliilIIiiilii.Iilllilliill();
      boolean var55 = this.liiliiliiiiiliilii.Iilllilliill();
      if (var54 || var55) {
         int var56 = Math.min(var17, var15);
         class_2826[] var38 = chunk.method_12006();
         int var39 = chunk.method_31607();

         for (int var40 = 0; var40 < var38.length; var40++) {
            int var41 = var39 + (var40 << 4);
            if (var41 < var56 && var41 + 15 >= var16) {
               class_2826 var42 = var38[var40];
               if (var42 != null && !var42.method_38292() && var42.method_19523(scanFarms -> lIliliIlil(scanFarms.method_26204(), var54, var55))) {
                  for (int var43 = 0; var43 < 16; var43++) {
                     int var44 = var41 + var43;
                     if (var44 >= var16 && var44 < var56) {
                        for (int var45 = 0; var45 < 16; var45++) {
                           for (int var46 = 0; var46 < 16; var46++) {
                              class_2248 var47 = var42.method_12254(var45, var43, var46).method_26204();
                              if (lIliliIlil(var47, var54, var55)) {
                                 int var48 = var51 + var45;
                                 int var49 = var52 + var46;
                                 if (var54) {
                                    if (var47 == class_2246.field_10615) {
                                       class_2338 var50 = new class_2338(var48, var44, var49);
                                       var4 += 2;
                                       var6 += 3;
                                       var12 = true;
                                       var14 = true;
                                       var22++;
                                       var30.add(var50);
                                       var32.add(var50);
                                       var19.add(var50);
                                    } else if (var47 instanceof class_2665) {
                                       class_2338 var71 = new class_2338(var48, var44, var49);
                                       var4 += 2;
                                       var6 += 2;
                                       var12 = true;
                                       var14 = true;
                                       var22++;
                                       var30.add(var71);
                                       var32.add(var71);
                                       var19.add(var71);
                                    } else if (var47 instanceof class_2426) {
                                       class_2338 var72 = new class_2338(var48, var44, var49);
                                       var4 += 2;
                                       var6 += 3;
                                       var12 = true;
                                       var14 = true;
                                       var21++;
                                       var29.add(var72);
                                       var32.add(var72);
                                       var19.add(var72);
                                    } else if (var47 instanceof class_2457) {
                                       var4++;
                                       var9++;
                                       var12 = true;
                                       var32.add(new class_2338(var48, var44, var49));
                                    } else if (var47 instanceof class_2459) {
                                       var4++;
                                       var9++;
                                       var12 = true;
                                       var32.add(new class_2338(var48, var44, var49));
                                    } else if (var47 instanceof class_2462) {
                                       class_2338 var73 = new class_2338(var48, var44, var49);
                                       var4 += 2;
                                       var9++;
                                       var12 = true;
                                       var32.add(var73);
                                       var19.add(var73);
                                    } else if (var47 instanceof class_2286) {
                                       class_2338 var74 = new class_2338(var48, var44, var49);
                                       var4 += 2;
                                       var9++;
                                       var12 = true;
                                       var32.add(var74);
                                       var19.add(var74);
                                    }
                                 }

                                 if (var55) {
                                    if (var47 == class_2246.field_9993 || var47 == class_2246.field_10463) {
                                       var5++;
                                       var10++;
                                    } else if (var47 == class_2246.field_10174 || var47 == class_2246.field_16541) {
                                       var5++;
                                       var10++;
                                    } else if (var47 == class_2246.field_10424) {
                                       var5++;
                                       var10++;
                                    } else if (var47 == class_2246.field_10211 || var47 == class_2246.field_10108) {
                                       var5++;
                                       var10++;
                                    } else if (var47 == class_2246.field_10029) {
                                       var5++;
                                       var10++;
                                    } else if (var47 == class_2246.field_10382) {
                                       var24++;
                                    } else if (var47 == class_2246.field_10293
                                       || var47 == class_2246.field_10247
                                       || var47 == class_2246.field_10609
                                       || var47 == class_2246.field_10341
                                       || var47 == class_2246.field_46283
                                       || var47 == class_2246.field_46282
                                       || var47 == class_2246.field_9974) {
                                       var25++;
                                       var5++;
                                       var10++;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (var10 >= 15 || var25 >= 10) {
         var13 = true;
      }

      if (var10 > 40) {
         var5 += 15;
      } else if (var10 > 20) {
         var5 += 8;
      } else if (var10 > 10) {
         var5 += 4;
      }

      if (var25 > 30) {
         var5 += 10;
      }

      if (var24 > 50) {
         var5 += 10;
         var6 += 5;
         if (var10 >= 5) {
            var13 = true;
         }
      }

      if (var20 >= 3) {
         int var57 = this.illilIilil(var28);
         var6 += var57;
         var3 += var57 / 2;
      }

      if (var21 >= 1 && var22 >= 1) {
         int var58 = this.lililiilil(var29, var30, 3);
         var6 += var58 * 5;
      }

      if (var23 >= 1 && var9 >= 2) {
         var6 += var23 * 3;
      }

      int var59 = 0;
      if (!var31.isEmpty() && !var32.isEmpty()) {
         var59 = this.lililiilil(var31, var32, 6);
         if (var59 > 0) {
            var6 += var59 * 4;
         }
      }

      int var60 = this.IIiillIiil(var19, 8);
      int var61 = var60 * 2;
      int var62 = var3 + var4 + var5 + var6 + var61;
      int var63 = 0;
      if (var11) {
         var63++;
      }

      if (var12) {
         var63++;
      }

      if (var13) {
         var63++;
      }

      if (var14) {
         var63++;
      }

      if (var8 <= 1 && !var12 && !var14 && !var13) {
         var62 = 0;
      }

      if (var12 && !var11 && !var14 && !var13 && var9 <= 3) {
         var62 = (int)((double)var62 * 0.2);
      }

      if (var7 >= 3 || var8 >= 8) {
         llllllililllllil var64 = var7 < 6 && var8 < 14 ? llllllililllllil.IIIIliiIil : llllllililllllil.lIIIliiIil;
         iilIiillIIiIiill var68 = this.Illillllil(chunk, var16, Math.min(var17 - 1, var15), var26, var27);
         return var68 != null
            ? new Iilllilllilllill(
               chunkPos, var62 + var7 * 3, IIIIlIIilIIIlIIi.liIiIlliil, llllllililllllil.IIIIliiIil, var18, var63, var8, var26, var27, var7, var68
            )
            : new Iilllilllilllill(chunkPos, var62 + var7 * 3, IIIIlIIilIIIlIIi.liIiIlliil, var64, var18, var63, var8, var26, var27, var7);
      } else if (var27 > 0) {
         return new Iilllilllilllill(chunkPos, var62 + 40, IIIIlIIilIIIlIIi.lIliIlliil, llllllililllllil.lIIIliiIil, var18, var63, var8, var26, var27, var7);
      } else if (var26 > 0) {
         llllllililllllil var67 = var8 > 0 ? llllllililllllil.lIIIliiIil : llllllililllllil.IIIIliiIil;
         return new Iilllilllilllill(chunkPos, var62 + 20, IIIIlIIilIIIlIIi.liIiIlliil, var67, var18, var63, var8, var26, var27, var7);
      } else if (var63 >= 2) {
         boolean var69 = var21 >= 1 && var22 >= 1 || var20 >= 3 || var59 >= 2 || var8 >= 3 && var12;
         llllllililllllil var65;
         if (var63 < 3 && (var63 < 2 || !var69 || var62 < this.liIlliiIll() * 2)) {
            if (var63 >= 2 && var62 >= this.liIlliiIll()) {
               var65 = llllllililllllil.IIIIliiIil;
            } else {
               var65 = llllllililllllil.iiiiIiiIil;
            }
         } else {
            var65 = llllllililllllil.lIIIliiIil;
         }

         IIIIlIIilIIIlIIi var70;
         if (var11 && var12) {
            var70 = IIIIlIIilIIIlIIi.lIliIlliil;
         } else if (var13 && var12) {
            var70 = IIIIlIIilIIIlIIi.lIliIlliil;
         } else if (var11 && var14) {
            var70 = IIIIlIIilIIIlIIi.lIliIlliil;
         } else if (var11) {
            var70 = IIIIlIIilIIIlIIi.liIiIlliil;
         } else if (var13) {
            var70 = IIIIlIIilIIIlIIi.iiIiIlliil;
         } else if (!var12 && !var14) {
            var70 = IIIIlIIilIIIlIIi.lIliIlliil;
         } else {
            var70 = IIIIlIIilIIIlIIi.IIliIlliil;
         }

         return new Iilllilllilllill(chunkPos, var62, var70, var65, var18, var63, var8, var26, var27, var7);
      } else if (this.IIllllIlll() > 0 && var8 >= this.IIllllIlll()) {
         llllllililllllil var66 = var8 >= this.IIllllIlll() * 2 ? llllllililllllil.lIIIliiIil : llllllililllllil.IIIIliiIil;
         return new Iilllilllilllill(chunkPos, var62, IIIIlIIilIIIlIIi.liIiIlliil, var66, var18, var63, var8, var26, var27, var7);
      } else {
         return new Iilllilllilllill(chunkPos, var62, IIIIlIIilIIIlIIi.lIliIlliil, llllllililllllil.iiiiIiiIil, var18, var63, var8, var26, var27, var7);
      }
   }

   private void IIililIili(iliIIillIiiIIill c) {
      if (this.iiIiiiliiIIliiilii.Iilllilliill()) {
         if (this.llIliilIli(c)) {
            if (c.Iiilillill >= (((231510944 - -15) * 53 ^ 93) * 31 ^ -1879582447)) {
               long var2 = System.currentTimeMillis();
               Long var4 = this.IIilIIiiilIilIIiii.get(c.Illlillill);
               if (var4 == null || var2 - var4 >= (2124359623733468213L ^ 2124359623733479669L)) {
                  this.IIilIIiiilIilIIiii.put(c.Illlillill, var2);
                  String var5 = String.format(
                     IliIlllilIi<"IliIlllilIi","RVYFVEcoDzoanS1JtXgyaL9JM4Rx32JrtaVFCfdqRDRFAasItKDmSSlTTGBJXe6wHVXQ/U0cvKQ5/5Rn76JsgO0qAQ==">(),
                     c.Iiilillill,
                     (int)c.Ililillill,
                     (int)c.llilillill,
                     (int)c.ililillill,
                     c.iIlIlllllill()
                  );
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","JLGLYCDVnY4MtlKfrgocli30BfbtJtWe8cikWnBcGB3ZffqHqqQL">(), var5, true);
                  if (this.lIliiiliiiIliiilii.Iilllilliill()) {
                     IilIlllilIll.IliIlllilIi();
                  }
               }
            }
         }
      }
   }

   private int ilIllIiIll() {
      return this.lllliiliiillliilii.Iilllilliill() >= ((1324918750 >>> 19 | 1324918750 << 13) - 105 ^ 65 ^ 352045375) ? 1 : 2;
   }

   private boolean llIliilIli(iliIIillIiiIIill c) {
      return c.lIliillill;
   }

   private void Iiiilliiil(Matrix4f high, double wz, double matrix, double wy, boolean wx) {
      float var9 = iIiiIIilIliiIIil.Ililllililil(wz);
      float var10 = iIiiIIilIliiIIil.Iiilliiliiil(matrix);
      float var11 = iIiiIIilIliiIIil.IIIilIIiiIIi(wy);
      float var12 = wx ? 0.6F : 0.45F;
      iIiiIIilIliiIIil.iIIIlIlIIl(
         high, var9 - var12, var10 - var12, var11 - var12, var9 + var12, var10 + var12, var11 + var12, this.lllIiillIi(IlIIilIlllIIilIl.lliiIlliIl, 1.0F), 2.5F
      );
   }

   private int iiiIlIIIll() {
      return Math.max(
         -((138868887 << 17 | 138868887 >>> 15) + 3) - 45 ^ 248639345,
         Math.min(
            ((32251358 >>> 23 | 32251358 << 9) - 41 ^ -123) + 61 ^ 667174090,
            (((1422975807 + 93 << 25 | 1422975807 + 93 >>> 7) << 1 | (1422975807 + 93 << 25 | 1422975807 + 93 >>> 7) >>> 31) * -83 ^ 1107368112)
               + (5 - this.lllliiliiillliilii.Iilllilliill()) * 4
         )
      );
   }

   private int IIiillIiil(List<class_2338> radius, int positions) {
      if (radius.size() < 3) {
         return 0;
      } else {
         int var3 = 0;

         for (class_2338 var5 : radius) {
            int var6 = 0;

            for (class_2338 var8 : radius) {
               if (var5 != var8 && var5.method_19455(var8) <= positions) {
                  var6++;
               }
            }

            if (var6 > var3) {
               var3 = var6;
            }
         }

         return Math.min(var3, 20);
      }
   }

   private void ilillIiill(class_2818 key, long chunk) {
      class_1923 var4 = key.method_12004();

      try {
         Iilllilllilllill var5 = this.iiIilIIlil(key, var4);
         if (var5 != null && this.llIililIil(var5)) {
            Iilllilllilllill var6 = this.IlIIIIiiillIIIIiii.put(var4, var5);
            if (var6 == null) {
               this.IIlIIIiiilIlIIIiii = true;
               this.iIiilIliil(var4, var5);
            } else if (!var6.IliIlllilIi(var5)) {
               this.IIlIIIiiilIlIIIiii = true;
            }
         } else if (this.IlIIIIiiillIIIIiii.remove(var4) != null) {
            this.IIlIIIiiilIlIIIiii = true;
         }
      } catch (Throwable var7) {
      }
   }

   private static double liIIiiiIIi(iIliiillIlliiill c, double px, double pz) {
      double var5 = c.liiIiiiill - px;
      double var7 = c.iiiIiiiill - pz;
      return var5 * var5 + var7 * var7;
   }

   private static boolean lIliliIlil(class_2248 farms, boolean block, boolean redstone) {
      return !block
            || !(farms instanceof class_2665)
               && !(farms instanceof class_2426)
               && !(farms instanceof class_2457)
               && !(farms instanceof class_2459)
               && !(farms instanceof class_2462)
               && !(farms instanceof class_2286)
         ? redstone
            && (
               farms == class_2246.field_9993
                  || farms == class_2246.field_10463
                  || farms == class_2246.field_10174
                  || farms == class_2246.field_16541
                  || farms == class_2246.field_10424
                  || farms == class_2246.field_10211
                  || farms == class_2246.field_10108
                  || farms == class_2246.field_10029
                  || farms == class_2246.field_10382
                  || farms == class_2246.field_10293
                  || farms == class_2246.field_10247
                  || farms == class_2246.field_10609
                  || farms == class_2246.field_10341
                  || farms == class_2246.field_46283
                  || farms == class_2246.field_46282
                  || farms == class_2246.field_9974
            )
         : true;
   }

   private void Iiililiili(lIiIlliiIiIlli event) {
      if (this.IiIiiiliiliIiiilii.Iilllilliill()) {
         List var2 = this.iliIIIiiiIiiIIIiii;
         if (!var2.isEmpty() && System.identityHashCode(Iiiilllliiilll.field_1687) == this.IiilIIiiiliilIIiii) {
            class_4587 var3 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var3);

            for (int var4 = Math.min(var2.size(), 10) - 1; var4 >= 0; var4--) {
               iliIIillIiiIIill var5 = (iliIIillIiiIIill)var2.get(var4);
               class_243 var6 = this.IilIililIi(new class_243(var5.Ililillill, (double)var5.lIilillill + 1.5, var5.ililillill));
               if (var6 != null && !(var6.field_1350 < 0.0) && !(var6.field_1350 > 1.0)) {
                  this.lIIiiiIIii(var3, var5, (float)var6.field_1352, (float)var6.field_1351);
               }
            }
         }
      }
   }

   private void IIIillIIil() {
      HashMap var1 = new HashMap<>(this.IlIIIIiiillIIIIiii);
      ArrayList var2 = new ArrayList();
      HashSet var3 = new HashSet();

      for (class_1923 var5 : var1.keySet()) {
         if (!var3.contains(var5)) {
            ArrayList var6 = new ArrayList();
            ArrayDeque var7 = new ArrayDeque();
            var7.add(var5);
            var3.add(var5);

            while (!var7.isEmpty()) {
               class_1923 var8 = (class_1923)var7.poll();
               var6.add(var8);

               for (int var9 = -1; var9 <= 1; var9++) {
                  for (int var10 = -1; var10 <= 1; var10++) {
                     if (var9 != 0 || var10 != 0) {
                        class_1923 var11 = new class_1923(var8.field_9181 + var9, var8.field_9180 + var10);
                        if (var1.containsKey(var11) && var3.add(var11)) {
                           var7.add(var11);
                        }
                     }
                  }
               }
            }

            var2.add(this.iIIilIlIil(var6, var1));
         }
      }

      this.iilIIIiiiIIiIIIiii = var2;
      this.liilliiill();
   }

   public static iilIiillIIiIiill liIiiiiIii(int trialCount, int spawnerCount, int playerScore, int type, IIIIlIIilIIIlIIi storageCount) {
      if (trialCount >= ((~981746420 << 17 | ~981746420 >>> 15) * -1775253149 ^ -259019642)
         || spawnerCount >= (-(43753760 + 105 << 13 | 43753760 + 105 >>> 19) + -101 ^ -1949376704)) {
         return iilIiillIIiIiill.Illliliill;
      } else if (type > 0) {
         return iilIiillIIiIiill.lllliliill;
      } else if (playerScore > 0) {
         return iilIiillIIiIiill.illliliill;
      } else if (storageCount == IIIIlIIilIIIlIIi.iiIiIlliil) {
         return iilIiillIIiIiill.lilliliill;
      } else {
         return storageCount == IIIIlIIilIIIlIIi.IIliIlliil ? iilIiillIIiIiill.iilliliill : iilIiillIIiIiill.Iilliliill;
      }
   }

   private void iIiliIlili() {
      List var1 = this.iliIIIiiiIiiIIIiii;
      if (!var1.isEmpty() && System.identityHashCode(Iiiilllliiilll.field_1687) == this.IiilIIiiiliilIIiii) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         boolean var3 = this.iIIiiiliiIlIiiilii.Iilllilliill();
         boolean var4 = this.llIiiiliiilIiiilii.Iilllilliill();
         int var5 = 0;

         for (int var6 = var1.size(); var5 < var6; var5++) {
            iliIIillIiiIIill var7 = (iliIIillIiiIIill)var1.get(var5);
            boolean var8 = var7.Iiilillill >= 75;
            this.lliliilili(var2, var7, var8);
            if (var4) {
               this.IlIIillIIi(
                  var2,
                  iIiiIIilIliiIIil.Ililllililil(var7.Ililillill),
                  iIiiIIilIliiIIil.Iiilliiliiil((double)var7.lIilillill + 1.0),
                  iIiiIIilIliiIIil.IIIilIIiiIIi(var7.ililillill),
                  IlIIilIlllIIilIl.lliiIlliIl,
                  var8
               );
            }

            if (var3 && var5 < 6) {
               double var9 = (double)var7.lIilillill + 1.5;
               Iillllilll.Iilllilliill(var7.Ililillill, var9, var7.ililillill, IlIIilIlllIIilIl.lliiIlliIl, var8);
               this.Iiiilliiil(var2, var7.Ililillill, var9, var7.ililillill, var8);
            }
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private void IIlIilIlIi(class_4587 matrices, iIliiillIlliiill cluster, float sx, float sy) {
      IIliiIlllIliiIll var5 = CorzClient.fontManager.lIiiIiIlilli();
      boolean var6 = cluster.lliIiiiill == llllllililllllil.lIIIliiIil;
      String var7 = this.iIlIiIllIi(cluster);
      double var8 = cluster.liiIiiiill - Iiiilllliiilll.field_1724.method_23317();
      double var10 = cluster.iiiIiiiill - Iiiilllliiilll.field_1724.method_23321();
      int var12 = (int)Math.round(Math.sqrt(var8 * var8 + var10 * var10));
      String var13 = (cluster.iilIiiiill > 0 ? cluster.iilIiiiill + IliIlllilIi<"IliIlllilIi","mBIOexmsbZ2GZXNRyaeiedGeXN/qWS5JtNex/DVOVr/G8mM4">() : "")
         + var12
         + IliIlllilIi<"IliIlllilIi","BFjnqFLX4LyWvYgQyoIB8TCTNJo8wnVH9LF73mo=">();
      float var14 = var5.IilliliilIIi();
      float var15 = var14 * 0.42F;
      float var16 = 4.0F;
      float var17 = Math.max(var5.iIlIlllllill(var7), var5.iIlIlllllill(var13));
      float var18 = 6.0F;
      float var19 = 4.0F;
      float var20 = 1.5F;
      float var21 = var15 + var16 + var17 + var18 * 2.0F;
      float var22 = var14 * 2.0F + var20 + var19 * 2.0F;
      float var23 = 0.55F;
      matrices.method_22903();
      matrices.method_46416(sx, sy, 0.0F);
      matrices.method_22905(var23, var23, 1.0F);
      matrices.method_46416(-sx, -sy, 0.0F);
      float var24 = sx - var21 / 2.0F;
      float var25 = sy - var22;
      int var26 = -16184564;
      Color var27 = new Color(var26 >> 16 & 0xFF, var26 >> 8 & 0xFF, var26 & 0xFF, 215);
      int var28 = IlIIilIlllIIilIl.lliiIlliIl;
      int var29 = var28 >> 16 & 0xFF;
      int var30 = var28 >> 8 & 0xFF;
      int var31 = var28 & 0xFF;
      float var32 = var24 + var18;
      float var33 = var25 + var19 + (var14 - var15) / 2.0F;
      Color var34 = new Color(var29, var30, var31, var6 ? 255 : 150);
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(matrices, var27, (double)var24, (double)var25, (double)(var24 + var21), (double)(var25 + var22), 2.5, 4.0);
         llilllililll.IiIlliIliiIl(matrices, var34, (double)var32, (double)var33, (double)(var32 + var15), (double)(var33 + var15), (double)(var15 / 2.0F), 6.0);
      } finally {
         llilllililll.IIIilIIiiIIi();
      }

      float var35 = var24 + var18 + var15 + var16;
      var5.IliIlllilIi(var7, var35, var25 + var19, new Color(-1));
      var5.IliIlllilIi(var13, var35, var25 + var19 + var14 + var20, new Color(-8421505));
      if (var6) {
         Color var36 = new Color(var29, var30, var31, 220);
         llilllililll.IiIlliIliiIl(
            matrices,
            var36,
            (double)var35,
            (double)(var25 + var22 - var19 + 1.0F),
            (double)(var24 + var21 - var18),
            (double)(var25 + var22 - var19 + 2.0F),
            0.5,
            2.0
         );
      }

      matrices.method_22909();
   }

   private boolean iiIliIIlli(class_2338 pos) {
      return pos.method_10264() >= Iiiilllliiilll.field_1687.method_31607() && pos.method_10264() <= Iiiilllliiilll.field_1687.method_31600()
         ? Iiiilllliiilll.field_1687.method_8314(class_1944.field_9284, pos) >= ((474154582 ^ -9) - -51 - -21 ^ -474154527)
         : false;
   }

   private void lllllillll(class_2338 newState, class_2680 oldState, class_2680 pos) {
      if (oldState != pos) {
         if (iiliiiIIiiii.IliIlllilIi(newState.method_10264())) {
            int var4 = lIiliIliIiliIl.liiiIIllIl(oldState);
            int var5 = lIiliIliIiliIl.liiiIIllIl(pos);
            if (var4 == 3 || var5 == 3) {
               this.llIIlIiiiilIIlIiii++;
               long var6 = System.currentTimeMillis();
               boolean var8 = this.iliiIIiiiIiiiIIiii
                  .liiiIIllIl(newState.method_10263(), newState.method_10264(), newState.method_10260(), var4, var5, oldState, pos, var6);
               this.IliIIIiiilliIIIiii.IilliliilIIi(newState.method_10263() >> 4, newState.method_10260() >> 4);
            }
         }
      }
   }

   private void lliililiil(class_1923 pos, Iilllilllilllill result) {
      long var7 = 8864823970364891217L;

      try {
         BufferedWriter var3 = new BufferedWriter(
            new FileWriter(IliIlllilIi<"IliIlllilIi","g5DhN4U468AF/logIFT5YbfpLrPuMYsCtfE9wJ7j+WE78cs3csHNuiT2gzWzrjg=">(), true)
         );
         String var4 = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern(IliIlllilIi<"IliIlllilIi","rhvh+DsYO48cUh5UF9n9W9hEfTA0eQltL6hx10GanKFRLYJxJI/1ezs4Zq5wjXk=">()));
         var7 ^= ((long)(pos.method_8326() + ((~(-75345788 ^ 3) << 23 | ~(-75345788 ^ 3) >>> 9) + 27 ^ -1140703494)) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)(pos.method_8328() + (~(1735127312 - 17) + -107 ^ -1735127395)) ^ var7) & -1L >>> 32;
         String var10001 = IliIlllilIi<"IliIlllilIi","mWlgYFKtbOsbVVw500csliUbutyN+da3J4y1ABxlb8ROi+PXL5/mQrnKY6ifehL5KYdrpLN9z3OrA1W5pT8NMZBRSQ5YzUZtFDS42getQRqWEePhmqugFh1hhSg=">();
         Object[] var10002 = new Object[(-1452645417 - -69) * -1 ^ 1452645347];
         var10002[0] = var4;
         var10002[1] = result.IilIlIiill.name();
         var10002[2] = (int)(var7 >>> 32);
         var10002[3] = (int)var7;
         var10002[4] = result.illIlIiill;
         var10002[5] = result.lilIlIiill.name();
         var10002[-(1445793137 >>> 31 | 1445793137 << 1) ^ 1403381016] = result.IIiIlIiill;
         var3.write(String.format(var10001, var10002));
         var3.close();
      } catch (IOException var9) {
      }
   }

   private iIliiillIlliiill iIIilIlIil(List<class_1923> snapshot, Map<class_1923, Iilllilllilllill> component) {
      iIliiillIlliiill var3 = new iIliiillIlliiill();
      var3.IilIiiiill = snapshot;
      Iilllilllilllill var4 = null;
      boolean var5 = false;
      long var6 = 0L;
      long var8 = 0L;

      for (class_1923 var11 : snapshot) {
         Iilllilllilllill var12 = (Iilllilllilllill)component.get(var11);
         if (var12 != null) {
            if (var12.iliIlIiill == iilIiillIIiIiill.Illliliill) {
               var5 = true;
            }

            var3.iilIiiiill = var3.iilIiiiill + var12.lIiIlIiill;
            var3.IIiIiiiill = var3.IIiIiiiill + var12.iIiIlIiill;
            var3.lIiIiiiill = var3.lIiIiiiill + var12.IliIlIiill;
            var3.iIiIiiiill = var3.iIiIiiiill + var12.lliIlIiill;
            var3.IliIiiiill = var3.IliIiiiill + var12.illIlIiill;
            if (var12.iilIlIiill > var3.lilIiiiill) {
               var3.lilIiiiill = var12.iilIlIiill;
            }

            if (var12.lilIlIiill.ordinal() > var3.lliIiiiill.ordinal()) {
               var3.lliIiiiill = var12.lilIlIiill;
            }

            if (var4 == null || var12.lIiIlIiill > var4.lIiIlIiill || var12.lIiIlIiill == var4.lIiIlIiill && var12.illIlIiill > var4.illIlIiill) {
               var4 = var12;
            }

            var6 += (long)(var11.method_8326() + 8);
            var8 += (long)(var11.method_8328() + 8);
         }
      }

      if (var4 != null) {
         var3.iliIiiiill = var4.IilIlIiill;
      }

      var3.IiiIiiiill = liIiiiiIii(var3.iIiIiiiill, var3.iilIiiiill, var3.IIiIiiiill, var3.lIiIiiiill, var3.iliIiiiill);
      if (var3.IiiIiiiill == iilIiillIIiIiill.Illliliill && !var5 && var4 != null) {
         var3.IiiIiiiill = var4.iliIlIiill;
      }

      var3.liiIiiiill = (double)var6 / (double)Math.max(1, snapshot.size());
      var3.iiiIiiiill = (double)var8 / (double)Math.max(1, snapshot.size());
      HashSet var19 = new HashSet(snapshot);
      int[] var20 = new int[snapshot.size() * 16];
      int var21 = 0;

      for (class_1923 var14 : snapshot) {
         int var15 = var14.method_8326();
         int var16 = var14.method_8328();
         int var17 = var15 + 16;
         int var18 = var16 + 16;
         if (!var19.contains(new class_1923(var14.field_9181, var14.field_9180 - 1))) {
            var20[var21++] = var15;
            var20[var21++] = var16;
            var20[var21++] = var17;
            var20[var21++] = var16;
         }

         if (!var19.contains(new class_1923(var14.field_9181, var14.field_9180 + 1))) {
            var20[var21++] = var15;
            var20[var21++] = var18;
            var20[var21++] = var17;
            var20[var21++] = var18;
         }

         if (!var19.contains(new class_1923(var14.field_9181 - 1, var14.field_9180))) {
            var20[var21++] = var15;
            var20[var21++] = var16;
            var20[var21++] = var15;
            var20[var21++] = var18;
         }

         if (!var19.contains(new class_1923(var14.field_9181 + 1, var14.field_9180))) {
            var20[var21++] = var17;
            var20[var21++] = var16;
            var20[var21++] = var17;
            var20[var21++] = var18;
         }
      }

      var3.IIIliiiill = Arrays.copyOf(var20, var21);
      return var3;
   }

   private boolean llIililIil(Iilllilllilllill result) {
      long var6 = -8884743223354983672L;
      long var8 = 8000034170517656767L;
      var6 ^= ((long)(result.IIiIlIiill >= ((~1274856379 ^ 29) * 991146299 - 21 ^ -1223462548) && result.illIlIiill >= this.liIlliiIll() ? 1 : 0) << 32 ^ var6)
         & -1L << 32;
      var6 ^= ((long)(this.IIllllIlll() > 0 && result.lIiIlIiill >= this.IIllllIlll() ? 1 : 0) ^ var6) & -1L >>> 32;
      var8 ^= ((long)(result.IliIlIiill <= 0 && result.iIiIlIiill <= 0 ? 0 : 1) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(result.lliIlIiill >= ((-416201113 << 1 | -416201113 >>> 31) * -117 ^ -1393187482) ? 1 : 0) ^ var8) & -1L >>> 32;
      return (int)(var6 >>> 32) != 0 || (int)var6 != 0 || (int)(var8 >>> 32) != 0 || (int)var8 != 0;
   }

   private void iIiilIliil(class_1923 result, Iilllilllilllill pos) {
      long var9 = 8194214352909875573L;
      if (this.iiIiiiliiIIliiilii.Iilllilliill()) {
         if (this.IiIilliIil(pos.iliIlIiill)) {
            if (pos.lilIlIiill == llllllililllllil.lIIIliiIil) {
               long var3 = System.currentTimeMillis();
               Long var5 = this.ilIIIIiiiIiIIIIiii.get(result);
               if (var5 == null || var3 - var5 >= (-402851272024709987L ^ -402851272024723363L)) {
                  this.ilIIIIiiiIiIIIIiii.put(result, var3);
                  var9 ^= ((long)(result.method_8326() + (~(~252470468 - -103 >>> 1 | ~252470468 - -103 << 31) ^ -2021248474)) << 32 ^ var9) & -1L << 32;
                  var9 ^= ((long)(result.method_8328() + ((421209301 << 3 | 421209301 >>> 29) * 1944890851 ^ -225653008)) ^ var9) & -1L >>> 32;
                  String var8 = String.format(
                     IliIlllilIi<"IliIlllilIi","8vIeoIdGSCqkXmMZVGAvN7tqu3fp8eW462pxHbh5VSfva/hgDELYIKGIvoI+GB9qYAq9h4d0NVbchSi/r5zP">(),
                     pos.IilIlIiill.name().toLowerCase(),
                     (int)(var9 >>> 32),
                     (int)var9,
                     pos.illIlIiill
                  );
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","JLGLYCDVnY4MtlKfrgocli30BfbtJtWe8cikWnBcGB3ZffqHqqQL">(), var8, true);
                  this.lliililiil(result, pos);
                  if (this.lIliiiliiiIliiilii.Iilllilliill()) {
                     IilIlllilIll.IliIlllilIi();
                  }
               }
            }
         }
      }
   }

   private void lIilliIill(class_1923 cp) {
      if (this.IliIlllilIi()) {
         this.IliIIIiiilliIIIiii.IilliliilIIi(cp.field_9181, cp.field_9180);
      }
   }

   private void iilIiIIiIi() {
      IilIlllilIll.liiiIIllIl();
      int var1 = System.identityHashCode(Iiiilllliiilll.field_1687);
      if (this.llilIIiiiililIIiii == null || var1 != this.IiilIIiiiliilIIiii) {
         this.Ilillllill();
         this.llilIIiiiililIIiii = Iiiilllliiilll.field_1687.method_27983().method_29177().toString();
         this.IiilIIiiiliilIIiii = var1;
      }

      String var2 = this.llilIIiiiililIIiii;
      class_1923 var3 = Iiiilllliiilll.field_1724.method_31476();
      int var4 = this.Iilliiliililliilii.Iilllilliill();
      int var5 = iiliiiIIiiii.liiiIIllIl(Iiiilllliiilll.field_1687.method_31607());
      int var6 = iiliiiIIiiii.iIlIlllllill(Iiiilllliiilll.field_1687.method_31600());
      if (var6 < var5) {
         if (!this.iIilIIiiiIlilIIiii.isEmpty()) {
            this.iIilIIiiiIlilIIiii = new ArrayList<>();
            this.iliIIIiiiIiiIIIiii = new ArrayList<>();
         }
      } else {
         int var7 = this.lllliiliiillliilii.Iilllilliill();
         if (var7 != this.iIIlIIiiiIlIlIIiii) {
            this.iIIlIIiiiIlIlIIiii = var7;
            this.iiilIIiiiIIIiIIiii = true;
         }

         this.liiIIIiiiiiiIIIiii = var5;
         this.IIIlIIiiilIIlIIiii = var6;
         this.IliIIIiiilliIIIiii
            .IIlllIlliIll(Iiiilllliiilll.field_1687, var3.field_9181, var3.field_9180, var4, 30000L, iIIlIIIiIlIlIIIi.IliIlllilIi(800), this::lIiIiiIiIi);
         this.IilIIIiiililIIIiii++;
         if (this.IilIIIiiililIIIiii % 10 == 0) {
            long var8 = System.currentTimeMillis();
            int var10 = var4 + 4;
            this.lIiIIIiiiiIiIIIiii.keySet().removeIf(playerChunk -> {
               int var4x = (int)(playerChunk & 4294967295L);
               int var5x = (int)(playerChunk >> 32);
               boolean var6x = Math.abs(var4x - var3.field_9181) > var10 || Math.abs(var5x - var3.field_9180) > var10;
               if (var6x) {
                  this.liiiIIiiiiiiiIIiii.remove(playerChunk);
                  this.iiilIIiiiIIIiIIiii = true;
               }

               return var6x;
            });
            this.IliIIIiiilliIIIiii.IiIlliIliiIl(var3.field_9181, var3.field_9180, var10);
            if (var8 - this.IIIIlIiiilIIIlIiii > 30000L) {
               this.IIIIlIiiilIIIlIiii = var8;
               int var11 = this.iliiIIiiiIiiiIIiii.IlIlllIlilIl(var8, var3.field_9181, var3.field_9180, var4 + 24);
            }

            if (var8 - this.iIIIlIiiiIlIIlIiii > 2000L) {
               this.iIIIlIiiiIlIIlIiii = var8;
               class_2338 var15 = Iiiilllliiilll.field_1724.method_24515();
               int var12 = this.iliiIIiiiIiiiIIiii.IiIlliIliiIl(var15.method_10263(), var15.method_10264(), var15.method_10260(), 5, var8, 10000L);
               if (var12 > 0) {
                  for (int var13 = -1; var13 <= 1; var13++) {
                     for (int var14 = -1; var14 <= 1; var14++) {
                        this.IliIIIiiilliIIIiii.IilliliilIIi(var3.field_9181 + var13, var3.field_9180 + var14);
                     }
                  }

                  this.iiilIIiiiIIIiIIiii = true;
               }
            }

            this.llIlIIiiiilIlIIiii = this.IiIlIIiiiliIlIIiii = this.iiIlIIiiiIIllIIiii = this.lIllIIiiiiIllIIiii = this.IlllIIiiillllIIiii = this.illlIIiiiIillIIiii = 0;
            this.lillIIiiiiillIIiii = 0L;
            liIlIIliiIlIIl var16 = this.iIliIIiiiIlliIIiii;
            if (var16 != null) {
               this.iIliIIiiiIlliIIiii = null;
               this.IIliIIiiilIliIIiii = false;
               if (var16.IIilIliIllIilIliIl == this.IiliIIiiililiIIiii && var16.IlIiIliIlllIiIliIl != null) {
                  this.iIIliIlIli(var16);
               }
            } else {
               this.iliIiIiiIi();
            }

            if (var8 - this.llliIIiiiilliIIiii >= 5000L) {
               this.iiilIIiiiIIIiIIiii = true;
            }

            if (this.iiilIIiiiIIIiIIiii && !this.IIliIIiiilIliIIiii && var8 - this.llliIIiiiilliIIiii >= 250L) {
               this.iiilIIiiiIIIiIIiii = false;
               this.llliIIiiiilliIIiii = var8;
               this.IIIlilIIli(var2);
            }
         }
      }
   }

   public IiiliIiliiliIi() {
      super(IliIlllilIi<"IliIlllilIi","JLGLYCDVnY4MtlKfrgocli30BfbtJtWe8cikWnBcGB3ZffqHqqQL">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIiliiliiiIiliilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","GS+miU1ePv9ybsxPckhiwfAbyu2A1NlVVUPPJevKp3VOxgvu+5E6y9af">(),
         IliIlllilIi<"IliIlllilIi","G4Z8BuSOivvbrYhF27wtGDaATF94xtYQT2ezxVn5j/vN1ioWFlqQtDLz/DJw4EER7w0M5v4=">(),
         true
      );
      this.Ililiiliilliliilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","yAvwJlVUObqDLx059u0SIzUy5BFpiGabFCPENPLu4+lWrZmV">(),
         IliIlllilIi<"IliIlllilIi","Cq1gS2r4QF5DDI+04XaLL8lnSKw/qjxRFL3RFdT3rOLYXwyK9f+xqbQfkdFMHOiiUkagppgD8Ww=">(),
         true
      );
      this.ililiiliiIiiliilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gyvFF3ZxCtEc6AK2xjH0+fWq1f/BM0tfxP1OdYlbHLGk4wM=">(),
         IliIlllilIi<"IliIlllilIi","gWJRHgKE1XwK4BQ9Cc9umxOvXb+A7QBZTcMNluqnok2WbUa+t+FVVjJ34ErmUvzl9ngWKNUVYYasmWyPS79UCTbXEixJGYTR4jlefqy49Kc9mMQ=">(),
         true
      );
      this.liiliiliiiiiliilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ClH3OXBEC0mr2rcUQZWaCkQlvNcETohg1Y/XzeCEIaCg">(),
         IliIlllilIi<"IliIlllilIi","OdVA/v8sEelYV9hYvfQIH5QPNYmUpdxkRnPHmQRoHtbR6+lLhvsmpt0VqxSeBbmXf+W/QWcrhtMT">(),
         true
      );
      this.IIIiiiliilIIiiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","6cVqhfudHQ3Wde4wD5462kP07NQ2bl1mywk4Flkt5hfG0lvK">(),
         IliIlllilIi<"IliIlllilIi","cBv18VpvVAOPv15nOzs4dNGy2gM+qpxq7X1ab0+1Uqz/gvma0cdt6pyrwgsY+VqoLze6aoO8K+ojY/jH0so=">(),
         true
      );
      this.iIIiiiliiIlIiiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","/ZqAVggf9NXYIEVEIm6UQgxbeQ0q0NBzb52c53j2XOgr0jg=">(),
         IliIlllilIi<"IliIlllilIi","yF93sXuH/y9nRL5AYXuOLYyN8tmWHGigU/kpqxYaKby3JVJdHUqZ4gntk6jD0uvTgNv1902DW7r2FdRRZSGzPVi6zvb9xp5U4AoWiFHuaFw=">(),
         true
      );
      this.llIiiiliiilIiiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","BtdRCE+ZkeL4YVQ6Ldr/QD5zbaQiS3mlaBGT9uvTtTk=">(),
         IliIlllilIi<"IliIlllilIi","n/OMff2vcX0iKVdJLBHbss77WjCJcvgcxw26F0LZKDhq6LvP7wSgdXWHyOOKxr60BOFwDndaUsoalROiiStyCQCWfwgY">(),
         true
      );
      this.IiIiiiliiliIiiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","HL1HfNJiX1iuB6h/b+dUf6KHY9wUQB/nONvDjzc4hB8JKg==">(),
         IliIlllilIi<"IliIlllilIi","ej1ATGnsn1HFEv0oBQBvU+8yjaFSMbA4Bthcr9UynzfQjitIKeAi9RlQKptJy8i3iwpuZwqBijo+36+fweEU3QUh2wIl/MmlY5BM94oH/DKCQA==">(),
         true
      );
      this.iiIiiiliiIIliiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Lzr01G+4i07c8Mt692N4G/+eJV7rzIr9d9QN5uL+JOqrUAcAdjbrplE=">(),
         IliIlllilIi<"IliIlllilIi","wRGJoHffCmNVG0FZIptPNPZEPdsXmoIyfPXF4Q++rrS3e2KGybqtkhkL1wvo7FoKoSZpYPIIYqAaAA==">(),
         true
      );
      this.lIliiiliiiIliiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","qUkpNo9mvDQWvwdh6noj44zxtu4TLzjPCngmk+jTd7Mxqd5oWXc=">(),
         IliIlllilIi<"IliIlllilIi","JAR0k5rhq60WwE1WTu1yL1GwmLTxnMdhaznjQiKgMq8YWqKdBsKtHr9sBJFRQofczLXnzD2Dna9glw==">(),
         false
      );
      this.IlIIIIiiillIIIIiii = new ConcurrentHashMap<>();
      this.ilIIIIiiiIiIIIIiii = new ConcurrentHashMap<>();
      this.liIIIIiiiiiIIIIiii = new iIIlIIIiIlIlIIIi();
      this.IIlIIIiiilIlIIIiii = false;
      this.lllIIIiiiillIIIiii = -1;
      this.IilIIIiiililIIIiii = 0;
      this.iilIIIiiiIIiIIIiii = new ArrayList<>();
      this.lIiIIIiiiiIiIIIiii = new ConcurrentHashMap<>();
      this.IliIIIiiilliIIIiii = new iIIlIIIiIlIlIIIi();
      this.iliIIIiiiIiiIIIiii = new ArrayList<>();
      this.iIIlIIiiiIlIlIIiii = -1;
      this.IIilIIiiilIilIIiii = new ConcurrentHashMap<>();
      this.iIilIIiiiIlilIIiii = new ArrayList<>();
      this.llilIIiiiililIIiii = null;
      this.IiilIIiiiliilIIiii = 0;
      this.iiilIIiiiIIIiIIiii = false;
      this.liIiIIiiiiiIiIIiii = Executors.newSingleThreadExecutor(r -> {
         Thread var1 = new Thread(r, IliIlllilIi<"IliIlllilIi","bxcKHVTII/zpfwRIQLtqFHgxtN4+6B3YuLrECHrCA5J5p8BfsaDb1OmeOGkmaZGmTI/pRA==">());
         var1.setDaemon(true);
         var1.setPriority(1);
         return var1;
      });
      this.IIliIIiiilIliIIiii = false;
      this.iIliIIiiiIlliIIiii = null;
      this.llliIIiiiilliIIiii = 0L;
      this.IiliIIiiililiIIiii = 0;
      this.lIiiIIiiiiIiiIIiii = new llllIliilllIli();
      this.iliiIIiiiIiiiIIiii = new lIIlIiIliIIlIiIl();
      this.liiiIIiiiiiiiIIiii = ConcurrentHashMap.newKeySet();
      this.IIIIlIiiilIIIlIiii = 0L;
      this.iIIIlIiiiIlIIlIiii = 0L;
      this.llIIlIiiiilIIlIiii = 0;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lllliiliiillliilii,
            this.Iilliiliililliilii,
            this.iIIiiiliiIlIiiilii,
            this.llIiiiliiilIiiilii,
            this.IiIiiiliiliIiiilii,
            this.iiIiiiliiIIliiilii,
            this.lIliiiliiiIliiilii
         }
      );
      IliiIIiiilliiIIiii = this;
      ClientChunkEvents.CHUNK_LOAD.register((Load)(world, chunk) -> this.lIilliIill(chunk.method_12004()));
   }

   private static double iiiliIIIii(iliIIillIiiIIill c, double px, double pz) {
      double var5 = c.Ililillill - px;
      double var7 = c.ililillill - pz;
      return var5 * var5 + var7 * var7;
   }

   private int lllIiillIi(int argb, float a) {
      long var4 = 2328401520515098192L;
      var4 ^= (
            (long)Math.max(
                     0,
                     Math.min(
                        ((-1021333271 * 49 >>> 23 | -1021333271 * 49 << 9) << 9 | (-1021333271 * 49 >>> 23 | -1021333271 * 49 << 9) >>> 23) ^ 1919247548,
                        Math.round(a * 255.0F)
                     )
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      return (int)(var4 >>> 32) << (~(~(-212710293 >>> 23 | -212710293 << 9)) ^ -1533487106) | argb & (-(-1750772222 * -59 * 123) ^ -853745331);
   }

   private String iIlIiIllIi(iIliiillIlliiill c) {
      switch (c.IiiIiiiill) {
         case Iilliliill:
            return c.iilIiiiill >= 14
               ? IliIlllilIi<"IliIlllilIi","g39gNTwGycCy+HFndsLPil4OyuEzfUHqtKoSHGZnJCgGykBvnJVEJQ==">()
               : IliIlllilIi<"IliIlllilIi","7vNKJWQo47RjdLdoW72PZ+WPQl1+aIarFxdUCH2w7RXXblbsrSEu">();
         case lilliliill:
            return IliIlllilIi<"IliIlllilIi","3DB+WFn0xZS+xlECU5DdfZ4ZGi1gv1TxIEOFZnNXReYU/ry2N+MwvnI=">();
         case Illliliill:
            return c.iilIiiiill > 0
               ? IliIlllilIi<"IliIlllilIi","fE9ktCpr8m2/WzpTGbFR1sxn193oP054e2vHQYkAKDvQeEM=">()
               : IliIlllilIi<"IliIlllilIi","OM3ZOYuRMeJ84xnydnHb2Popq1mskbtciUek4YkZEG8K4jU=">();
         case illliliill:
            return c.iilIiiiill >= 14
               ? IliIlllilIi<"IliIlllilIi","19R1oe8e383q6mHBz9DTKyRojFJH0nUXPKriipUhKY/3">()
               : IliIlllilIi<"IliIlllilIi","gyvFF3ZxCtEc6AK2xjH0+fWq1f/BM0tfxP1OdYlbHLGk4wM=">();
         case lllliliill:
            return IliIlllilIi<"IliIlllilIi","kYUBD9xZG4s4FBARbljNVQhNgWJueDwPzey6NhqO/B0=">();
         case iilliliill:
            return IliIlllilIi<"IliIlllilIi","6cVqhfudHQ3Wde4wD5462kP07NQ2bl1mywk4Flkt5hfG0lvK">();
         default:
            return IliIlllilIi<"IliIlllilIi","Kl+Q/ziZykiDor/sqNoOKcFFXjNofZxqtzH1cqYsPgg=">();
      }
   }

   private void iliIiIiiIi() {
      List var1 = this.iIilIIiiiIlilIIiii;
      if (!var1.isEmpty() && Iiiilllliiilll.field_1724 != null) {
         String var2 = this.llilIIiiiililIIiii;
         double var3 = Iiiilllliiilll.field_1724.method_23317();
         double var5 = Iiiilllliiilll.field_1724.method_23321();
         double var7 = (double)this.Iilliiliililliilii.Iilllilliill() * 16.0 + 48.0;
         double var9 = var7 * var7;
         ArrayList var11 = new ArrayList();

         for (iliIIillIiiIIill var13 : var1) {
            if (var13.llllillill.equals(var2) && this.llIliilIli(var13) && !(iiiliIIIii(var13, var3, var5) > var9)) {
               var11.add(var13);
            }
         }

         var11.sort((b, a) -> Double.compare(iiiliIIIii(b, var3, var5), iiiliIIIii(a, var3, var5)));
         this.iliIIIiiiIiiIIIiii = var11;
      } else {
         if (!this.iliIIIiiiIiiIIIiii.isEmpty()) {
            this.iliIIIiiiIiiIIIiii = new ArrayList<>();
         }
      }
   }

   private static boolean lilliiilli(class_1297 ent) {
      if (ent instanceof class_1321 var1 && var1.method_6181()) {
         return true;
      }

      if (ent instanceof class_1496 var2 && var2.method_6727()) {
         return true;
      }

      if (ent instanceof class_1308 var3 && var3.method_16914()) {
         return true;
      }

      if (ent instanceof class_9817 var4 && var4.method_60953()) {
         return true;
      }

      return false;
   }

   private static String ilIiiIiIii(lIiiIIIiiIiiIIIi e) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 1; var2 < 148; var2++) {
         if (e.Illlllllilll(var2) > 0) {
            var1.add(var2);
         }
      }

      var1.sort((b, ex) -> Integer.compare(e.Illlllllilll(ex), e.Illlllllilll(b)));
      StringBuilder var4 = new StringBuilder();

      for (int var3 = 0; var3 < var1.size() && var3 < 8; var3++) {
         if (var4.length() > 0) {
            var4.append(IliIlllilIi<"IliIlllilIi","yM3OLK595MRrWPDGbf8ajPFrJpIFZUeFA4SWIcer">());
         }

         var4.append(iliiIllIiiiIll.IliIlllilIi((Integer)var1.get(var3))).append(' ').append(e.Illlllllilll((Integer)var1.get(var3)));
      }

      return var4.toString();
   }

   private void iIIliIlIli(liIlIIliiIlIIl job) {
      lIIillIiiIIillIi var2 = job.iIilIliIlIlilIliIl;
      boolean var3 = job.llilIliIlililIliIl;
      List var4 = job.iiilIliIlIIIiIliIl;
      int var5 = job.IiilIliIlliilIliIl;
      String var6 = job.lillIliIliillIliIl;
      List var7 = job.IlIiIliIlllIiIliIl;
      ArrayList var8 = new ArrayList();
      long var9 = System.currentTimeMillis();

      for (lIiiIIIiiIiiIIIi var12 : var7) {
         iliIiiiIiiIiii var13 = iliIiiiIiiIiii.IliIlllilIi(var12.IIIllIIliIIl(), var5);
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = 0;

         for (long var19 : var12.iIIIlIlIIl()) {
            iiiIIIilIIIlIIil var21 = this.lIiIIIiiiiIiIIIiii.get(var19);
            if (var21 != null) {
               var13.iIlIlllllill(var21.ilIIIlIIil);
               boolean var22 = var2.llIIIIlIIi && (var3 || var21.lIlIIlIIil);
               if (!var22) {
                  var14 += var21.llIIIlIIil;
               }

               int var23 = var21.liIIIlIIil - var21.iiIIIlIIil;
               if (var22) {
                  var15 += var23;
                  var16 += var21.iiIIIlIIil - var21.IIlIIlIIil;
                  var17 += var21.IIlIIlIIil;
               } else {
                  var15 += var21.liIIIlIIil;
               }
            }
         }

         var12.iIlIlllllill(var14);
         int var26 = IliiIIilliiIIi.IilliliilIIi(var15 + var12.IIIilIIiiIIi(), var16, var17);

         for (iiliIiIiIIiiIiIi var20 : var4) {
            if (var20.iliIiiliiiii(var12.IiIIlliIIl(), var12.lIlIliIlIl(), var12.illIlIilIl(), var12.iiIIlIIlIl(), var12.IllIllllIl(), var12.lilIliilIl())) {
               var13.IilliliilIIi(var20.ilIliIiIIi);
            } else if (var20.IilliliilIIi(
               var12.IiIIlliIIl(), var12.lIlIliIlIl(), var12.illIlIilIl(), var12.iiIIlIIlIl(), var12.IllIllllIl(), var12.lilIliilIl()
            )) {
               var13.IlIlllIlilIl(var20.ilIliIiIIi);
            }
         }

         if (var2.iIIIIIlIIi) {
            this.lIlliiIlli(var12, var13);
         }

         if (var13.IIlllIlliIll(120) > 0) {
            var12.IilliliilIIi();
         }

         Illiilllllliilll var28 = iiIliiIiIIlliiIi.IliIlllilIi(var13);
         IllIiIIllllIiIIl var29 = IIiIilIilIiIilIi.IliIlllilIi(var12, var28, var2);
         boolean var30 = var29.lIliIIilIl && this.IiIliliIli(var12);
         if (var29.lIliIIilIl) {
            var8.add(this.Illlilllli(var12, var28, var29, var6, var9, var30, var26));
         }
      }

      var8.sort((a, b) -> Integer.compare(b.Iiilillill, a.Iiilillill));
      this.iIilIIiiiIlilIIiii = var8;
      this.iliIiIiiIi();

      for (iliIIillIiiIIill var25 : var8) {
         this.IIililIili(var25);
      }
   }

   private void Ilillllill() {
      this.lIiIIIiiiiIiIIIiii.clear();
      this.IliIIIiiilliIIIiii.liiiIIllIl();
      this.IIilIIiiilIilIIiii.clear();
      this.iIilIIiiiIlilIIiii = new ArrayList<>();
      this.iliIIIiiiIiiIIIiii = new ArrayList<>();
      this.iiilIIiiiIIIiIIiii = false;
      this.iliiIIiiiIiiiIIiii.IIlllIlliIll();
      this.liiiIIiiiiiiiIIiii.clear();
      this.llIIlIiiiilIIlIiii = 0;
      this.IiliIIiiililiIIiii++;
      this.iIliIIiiiIlliIIiii = null;
      this.IIliIIiiilIliIIiii = false;
      this.llliIIiiiilliIIiii = 0L;
      this.llilIIiiiililIIiii = null;
   }

   private boolean IiIliliIli(lIiiIIIiiIiiIIIi e) {
      if (Iiiilllliiilll.field_1687 == null) {
         return true;
      } else {
         try {
            List var2 = e.IIIllIIliIIl();
            int var3 = var2.size();
            int var4 = Math.max(1, var3 / 48);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            class_2339 var8 = new class_2339();

            for (int var9 = 0; var9 < var3; var9 += var4) {
               ilIlIIilIiIlIIil var10 = (ilIlIIilIiIlIIil)var2.get(var9);
               if (Iiiilllliiilll.field_1687.method_8393(var10.IlIiIlIIil >> 4, var10.ilIiIlIIil >> 4)) {
                  var5++;
                  if (this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil, var10.llIiIlIIil, var10.ilIiIlIIil))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil, var10.llIiIlIIil + 1, var10.ilIiIlIIil))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil, var10.llIiIlIIil - 1, var10.ilIiIlIIil))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil + 1, var10.llIiIlIIil, var10.ilIiIlIIil))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil - 1, var10.llIiIlIIil, var10.ilIiIlIIil))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil, var10.llIiIlIIil, var10.ilIiIlIIil + 1))
                     || this.iiIliIIlli(var8.method_10103(var10.IlIiIlIIil, var10.llIiIlIIil, var10.ilIiIlIIil - 1))) {
                     var6++;
                  }

                  int var11 = Iiiilllliiilll.field_1687.method_8624(class_2903.field_13202, var10.IlIiIlIIil, var10.ilIiIlIIil);
                  if (var11 - var10.llIiIlIIil >= 6) {
                     var7++;
                  }
               }
            }

            return var5 == 0 ? true : var6 * 4 < var5 && var7 * 2 > var5;
         } catch (Throwable var12) {
            return true;
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         this.iilIiIIiIi();
      }
   }

   private int lililiilil(List<class_2338> listA, List<class_2338> listB, int maxDist) {
      int var4 = 0;

      for (class_2338 var6 : listA) {
         for (class_2338 var8 : listB) {
            if (var6.method_19455(var8) <= maxDist) {
               var4++;
               break;
            }
         }
      }

      return var4;
   }

   private lIIillIiiIIillIi liiIiiiiIi() {
      return new lIIillIiiIIillIi(
         this.iiiIlIIIll(), this.lIIlliIIll(), this.IlIllllIll(), this.ilIllIiIll(), 6, true, true, true, true, true, true, true, true, true, true, true, false
      );
   }

   private int lIIlliIIll() {
      long var2 = 1252263490508259635L;
      var2 ^= ((long)this.lllliiliiillliilii.Iilllilliill() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) <= ((-501865146 << 5 | -501865146 >>> 27) * 93 * -113 ^ -61 ^ -486027499)
         ? 4
         : ((int)(var2 >>> 32) >= (~478536281 - 87 ^ -478536377) ? 2 : 3);
   }

   private long iilllIIill(int cx, int cz) {
      try {
         iIiilIllIliilIll var3 = liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.get(class_1923.method_8331(cx, cz));
         if (var3 == null) {
            return 0L;
         } else {
            long var4 = 0L;

            for (int var6 = 1; var6 <= var3.IIliIlilll && var6 - 1 < 64; var6++) {
               int var7 = (var3.lIliIlilll + (var6 - 1)) * 16;
               if (var7 > -30) {
                  break;
               }

               if (iiliiiIIiiii.lIiiIiIlilli(var7) && var3.llliIlilll[var6] == lilIlIiiilIlIi.iiiIIlIiiIIIlIlIii) {
                  var4 |= 1L << var6 - 1;
               }
            }

            return var4;
         }
      } catch (Throwable var8) {
         return 0L;
      }
   }

   private void IlIIillIIi(Matrix4f matrix, float high, float y, float z, int x, boolean accent) {
      float var7 = y + (accent ? 72.0F : 48.0F);
      this.ilIIiIiIIi(matrix, high, y, z, y + 2.0F, 0.14F, this.lllIiillIi(-1, accent ? 0.95F : 0.75F), this.lllIiillIi(x, accent ? 0.9F : 0.6F));
      this.ilIIiIiIIi(matrix, high, y, z, var7, 0.32F, this.lllIiillIi(x, accent ? 0.38F : 0.26F), this.lllIiillIi(x, 0.0F));
      this.ilIIiIiIIi(matrix, high, y, z, var7, 0.11F, this.lllIiillIi(x, accent ? 1.0F : 0.85F), this.lllIiillIi(x, 0.0F));
   }

   private int illilIilil(List<class_2338> positions) {
      if (positions.size() < 3) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < positions.size(); var3++) {
            for (int var4 = var3 + 1; var4 < positions.size(); var4++) {
               class_2338 var5 = (class_2338)positions.get(var3);
               class_2338 var6 = (class_2338)positions.get(var4);
               double var7 = (double)var5.method_19455(var6);
               if (var7 <= 2.0) {
                  var2++;
               }
            }
         }

         return Math.min(var2, 15);
      }
   }

   private void ilIIiIiIIi(Matrix4f fade, float matrix, float x, float bottom, float top, float y, int half, int z) {
      class_4588 var9 = iIiiIIilIliiIIil.IilliliilIIi();
      var9.method_22918(fade, matrix - y, x, bottom).method_39415(half);
      var9.method_22918(fade, matrix + y, x, bottom).method_39415(half);
      var9.method_22918(fade, matrix + y, top, bottom).method_39415(z);
      var9.method_22918(fade, matrix - y, top, bottom).method_39415(z);
      var9.method_22918(fade, matrix, x, bottom - y).method_39415(half);
      var9.method_22918(fade, matrix, x, bottom + y).method_39415(half);
      var9.method_22918(fade, matrix, top, bottom + y).method_39415(z);
      var9.method_22918(fade, matrix, top, bottom - y).method_39415(z);
   }

   private void lIlliiIlli(lIiiIIIiiIiiIIIi e, iliIiiiIiiIiii sc) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         try {
            class_238 var3 = new class_238(
               (double)(e.IiIIlliIIl() - 16),
               (double)Math.max(e.lIlIliIlIl() - 8, -72),
               (double)(e.illIlIilIl() - 16),
               (double)(e.iiIIlIIlIl() + 17),
               (double)Math.min(e.IllIllllIl() + 9, -21),
               (double)(e.lilIliilIl() + 17)
            );
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            HashMap var7 = new HashMap();

            for (class_1297 var9 : Iiiilllliiilll.field_1687.method_8335(Iiiilllliiilll.field_1724, var3)) {
               if (var9 instanceof class_1646) {
                  var4++;
               } else if (var9 instanceof class_1439) {
                  var5++;
               } else if (var9 instanceof class_1604) {
                  var6++;
               } else if (var9 instanceof class_1429) {
                  var7.merge(var9.method_5864(), 1, Integer::sum);
               }
            }

            int var12 = 0;

            for (int var10 : var7.values()) {
               var12 = Math.max(var12, var10);
            }

            sc.IIilliiIIl = var4;
            sc.lIilliiIIl = var5;
            sc.iIilliiIIl = var6;
            sc.IlilliiIIl = var12;
            e.lIiiIiIlilli(var4, var5, var6, var12);
         } catch (Throwable var11) {
         }
      }
   }

   private List<ilIlIIilIiIlIIil> illliIilli() {
      ArrayList var1 = new ArrayList();
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         try {
            double var2 = (double)this.Iilliiliililliilii.Iilllilliill() * 16.0 + 16.0;
            double var4 = Iiiilllliiilll.field_1724.method_23317();
            double var6 = Iiiilllliiilll.field_1724.method_23321();
            class_238 var8 = new class_238(var4 - var2, -64.0, var6 - var2, var4 + var2, -29.0, var6 + var2);
            int var9 = 0;

            for (class_1297 var11 : Iiiilllliiilll.field_1687.method_8335(Iiiilllliiilll.field_1724, var8)) {
               if (var11.method_5805()) {
                  class_2338 var12 = var11.method_24515();
                  if (iiliiiIIiiii.IliIlllilIi(var12.method_10264())) {
                     label43:
                     if (!(var11 instanceof class_1533) && !(var11 instanceof class_1534)) {
                        if (var11 instanceof class_1531) {
                           class_1531 var13 = (class_1531)var11;
                           if (!var13.method_6912()) {
                              break label43;
                           }
                        }

                        if (!(var11 instanceof class_1693) && !(var11 instanceof class_10256)) {
                           if (var9 < 16 && lilliiilli(var11)) {
                              var1.add(
                                 ilIlIIilIiIlIIil.IliIlllilIi(
                                    var12.method_10263(), var12.method_10264(), var12.method_10260(), lIlliIIiiIlliIIi.lIiilliiil, 3, 144, 0
                                 )
                              );
                              var9++;
                           }
                           continue;
                        }

                        var1.add(
                           ilIlIIilIiIlIIil.IilliliilIIi(
                              var12.method_10263(), var12.method_10264(), var12.method_10260(), lIlliIIiiIlliIIi.IIiilliiil, 4, 32, 0, 143, 0
                           )
                        );
                        continue;
                     }

                     var1.add(
                        ilIlIIilIiIlIIil.IliIlllilIi(var12.method_10263(), var12.method_10264(), var12.method_10260(), lIlliIIiiIlliIIi.lIiilliiil, 2, 142, 0)
                     );
                  }
               }
            }
         } catch (Throwable var14) {
         }

         return var1;
      } else {
         return var1;
      }
   }

   private int liIlliiIll() {
      return Math.max(5, (519672554 * -117 ^ 87 ^ 55 ^ -672146569) + (5 - this.lllliiliiillliilii.Iilllilliill()) * 4);
   }

   private class_243 IilIililIi(class_243 pos) {
      return llilllililll.iIlIlllllill(pos);
   }

   private static String IlIiillIii(List<ilIlIIilIiIlIIil> cells) {
      HashMap var1 = new HashMap();

      for (ilIlIIilIiIlIIil var3 : cells) {
         if (var3.iliIiiliiiii(64)) {
            var1.merge(var3.IlliIlIIil, 1, Integer::sum);
         }
      }

      ArrayList var5 = new ArrayList(var1.entrySet());
      var5.sort((b, a) -> Integer.compare((Integer)a.getValue(), (Integer)b.getValue()));
      StringBuilder var6 = new StringBuilder();

      for (int var4 = 0; var4 < var5.size() && var4 < 6; var4++) {
         if (var6.length() > 0) {
            var6.append(IliIlllilIi<"IliIlllilIi","yM3OLK595MRrWPDGbf8ajPFrJpIFZUeFA4SWIcer">());
         }

         var6.append(iliiIllIiiiIll.IliIlllilIi((Integer)((Entry)var5.get(var4)).getKey())).append(' ').append(((Entry)var5.get(var4)).getValue());
      }

      return var6.toString();
   }

   @Override
   protected void Illillliilli() {
      this.IlIIIIiiillIIIIiii.clear();
      this.ilIIIIiiiIiIIIIiii.clear();
      this.liIIIIiiiiiIIIIiii.liiiIIllIl();
      this.IIlIIIiiilIlIIIiii = false;
      this.lllIIIiiiillIIIiii = -1;
      this.iilIIIiiiIIiIIIiii = new ArrayList<>();
      this.IilIIIiiililIIIiii = 0;
      this.Ilillllill();
   }

   private iilIiillIIiIiill Illillllil(class_2818 bottomY, int spawnerCount, int topYInclusive, int trialCount, int chunk) {
      if (Iiiilllliiilll.field_1687 == null) {
         return null;
      } else {
         try {
            lililIIiiililIIi var6 = iiIiiIlIIliiIl.iIlIlllllill(
               bottomY, Iiiilllliiilll.field_1687, this.lIiiIIiiiiIiiIIiii, spawnerCount, topYInclusive, null, false
            );
            Illiilllllliilll var7 = iiIliiIiIIlliiIi.IliIlllilIi(var6.iliilIiiil);
            boolean var8 = var7.iIIlIllill || var7.lIIlIllill >= 40;
            if (!var8 && !var7.lIiiIiIlilli()) {
               return null;
            } else {
               for (ilIlIIilIiIlIIil var10 : var6.IliilIiiil) {
                  boolean var11 = var10.IiIiIlIIil == lIlliIIiiIlliIIi.IIiilliiil || var10.IiIiIlIIil == lIlliIIiiIlliIIi.lIiilliiil;
                  if (var11 && !var7.IilliliilIIi(var10.IlliIlIIil)) {
                     return null;
                  }
               }

               if (var8 || chunk > 0) {
                  return iilIiillIIiIiill.lllliliill;
               } else {
                  return trialCount > 0 ? iilIiillIIiIiill.illliliill : iilIiillIIiIiill.Iilliliill;
               }
            }
         } catch (Throwable var12) {
            return null;
         }
      }
   }

   private int IIllllIlll() {
      return Math.max(2, (-(-(--1138918343)) - -105 ^ 1138918454) + (5 - this.lllliiliiillliilii.Iilllilliill()));
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         this.Iiililiili(event);
      }
   }

   private boolean IiIilliIil(iilIiillIIiIiill kind) {
      switch (kind) {
         case Iilliliill:
            return this.iilliiliiIIiliilii.Iilllilliill();
         case lilliliill:
            return this.lIiliiliiiIiliilii.Iilllilliill();
         case Illliliill:
            return this.Ililiiliilliliilii.Iilllilliill();
         case illliliill:
            return this.ililiiliiIiiliilii.Iilllilliill();
         case lllliliill:
            return this.liiliiliiiiiliilii.Iilllilliill();
         case iilliliill:
            return this.IIIiiiliilIIiiilii.Iilllilliill();
         default:
            return true;
      }
   }

   private int IlIllllIll() {
      return Math.max(
         5, Math.min(~((-111283530 * -29 - 117) * 13) ^ 995783672, (-(896372942 ^ 107) ^ -896372911) + (5 - this.lllliiliiillliilii.Iilllilliill()))
      );
   }
}
