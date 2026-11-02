package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_10799;
import net.minecraft.class_124;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_268;
import net.minecraft.class_2960;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_742;
import net.minecraft.class_9304;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class iliIliIlIiiIliIl extends ilIllIiIll {
   private final int[] illlliiIll;
   private static final float iiliIiiIll = 0.7F;
   private float IlilliiIll;
   private static final float iiIiIiiIll = 3.0F;
   private final ConcurrentLinkedQueue<class_2663> liiIliiIll;
   private static final int IlIlIiiIll = 3;
   private static final Color[] llIlliiIll;
   private static final float IlIIliiIll = 0.55F;
   private final iiIiiilIIliiil iillIiiIll;
   private static final float iIIiIiiIll = 5.0F;
   private final Matrix4f llllliiIll;
   private static final int lIIlIiiIll = 1;
   private final iiIiiilIIliiil lIilIiiIll;
   private final iiIiiilIIliiil iiIlIiiIll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","FLFgycSmPxwDNVlsxAs7em3vahrfigvX71Ev2uV3lpTemL7Nlo5sG7w=">(),
      IliIlllilIi<"IliIlllilIi","UyvdZUGZjFs8hir2BgA2cnB9lnZY3gS2Y/pGqbQhDazL9MlWg/mDTAP2QPfTg20IS7JrppnWkT9Y0XRVri5Gv5YRF1hHTw==">(),
      true
   );
   private static final int illIliiIll = 15922423;
   private static final int iIIlIiiIll = 2;
   private static final String[] liilliiIll;
   private static final float lIliIiiIll = 7.0F;
   private static final int lilIliiIll = 658190;
   private final iiIiiilIIliiil iIilIiiIll;
   private final lliliIIiililiIIi IIIiIiiIll;
   private static final float IlIiIiiIll = 3.0F;
   private final IIIIlilllIIIlill IiilIiiIll;
   private static final float IIliIiiIll = 5.0F;
   private final Map<Object, String[]> IIIlliiIll;
   private static final float llIIliiIll = 1.0F;
   private final lliliIIiililiIIi lIIiIiiIll;
   private static final int lIiIliiIll = 13225430;
   private float IiilliiIll;
   private static final int ilIlIiiIll = 1;
   private boolean iIllliiIll;
   private final iiIiiilIIliiil llllIiiIll;
   private static final String[] IlIlliiIll;
   private static final float iIiiIiiIll = 12.0F;
   private final iiIiiilIIliiil IlilIiiIll;
   private static final int lllIliiIll = 14699339;
   private static final float llliIiiIll = 0.82F;
   private static final float lIIIliiIll = 0.92F;
   private static final float ilIiIiiIll = 4.0F;
   private final iiIiiilIIliiil ililIiiIll;
   private long lIllliiIll;
   private final iiIiiilIIliiil lillIiiIll;
   public static final String lliIIiiIll = "Top";
   private static final int IllIliiIll = 14731304;
   private static final int iilIliiIll = 5562506;
   private static final float iliiIiiIll = 6.0F;
   private static final int iIiIliiIll = 0;
   private static final int lIlIliiIll = 14;
   private final iiIiiilIIliiil IIilIiiIll;
   public static final String IiiIIiiIll = "Left";
   private boolean IlllliiIll;
   private final iiIiiilIIliiil IillIiiIll;
   private static final float iiiiIiiIll = 80.0F;
   private static final int[] ilIlliiIll;
   public static final String liiIIiiIll = "Right";
   private final List<llllliilllli> lillliiIll;
   public static Matrix4f lIiIIiiIll = new Matrix4f();
   private final class_4587 iiIlliiIll;
   private static final float illiIiiIll = 0.8F;
   private static final int IiIlIiiIll = 2;
   private static final Map<String, Integer> lliIliiIll = new HashMap<>();
   private static final int IIlIliiIll = 512;
   public static Matrix4f iIiIIiiIll = new Matrix4f();
   private static final int IiIIliiIll = 6;
   private final iilliIlIIiliIl IIllIiiIll = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","1iyQJihIwvfiKQN3cian2Ffrpz6ohgLsN8WtV53/NMkQJ1gl9D/9xw==">(),
      IliIlllilIi<"IliIlllilIi","XMzM9yaq3i3eXDNBcJ4sYxQWw6zSHS7fvvKLT4ezUVylraSBUjqqT2NDbD6X77GxjWK74TQLxNHJ/J33OShTmU2A">(),
      96,
      8,
      256
   );
   private static final float IIIIliiIll = 180.0F;
   private static final Map<String, String> IliIliiIll = new HashMap<>();
   private float ililliiIll;
   private static final float IiliIiiIll = 0.55F;
   private static final float llIiIiiIll = 3.0F;
   private static final int IIiIliiIll = 15909198;
   private static final float liIiIiiIll = 4.0F;
   private static final float IIiiIiiIll = 3.0F;
   private final Int2ObjectOpenHashMap<String> lIIlliiIll;
   private final Map<UUID, iilIllIIiIll> IiiIliiIll;
   private class_1799 iIilliiIll;
   private static final float iIliIiiIll = 9.0F;
   private static final int liIIliiIll = 4;
   private final iiIiiilIIliiil llilIiiIll;
   private final List<llllliilllli> iillliiIll;
   private final llllliilllli IIilliiIll;
   private final Vector3f IillliiIll;
   private final ArrayList<Object[]> lIilliiIll;
   private static final float IlliIiiIll = 7.0F;
   private final iiIiiilIIliiil IlllIiiIll;
   private static final float IiIiIiiIll = 4.0F;
   private static final float liliIiiIll = 0.52F;
   private float llilliiIll;
   public static Matrix4f IliIIiiIll = new Matrix4f();
   private static final int IIIlIiiIll = 0;
   private final class_4587 IIllliiIll;
   private final iiIiiilIIliiil iIllIiiIll;
   private final iiIiiilIIliiil illlIiiIll;
   private static final String[] iiiIIiiIll = new String[]{
      IliIlllilIi<"IliIlllilIi","tBqMlQT/Z/xK+tvafLzWDxoblwGoDPdmrHKUja5QqA==">(),
      IliIlllilIi<"IliIlllilIi","DC5LqoAAc3+/eaQwq/qS/YO5p073whfz32fqpvVnEdR/IA==">(),
      IliIlllilIi<"IliIlllilIi","DyxmD9hyDGCvB+zOALyyToWOyY9Hs2WBr02rPpZICZY=">(),
      IliIlllilIi<"IliIlllilIi","e5eBxfFemYvN57HPSdnqJmwC6M6aQd0GhTYIi0AEaCAb">()
   };
   private static final int IilIliiIll = 9080728;
   private static final int iiIIliiIll = 6;
   private static final float lliiIiiIll = 8.0F;
   private final Map<UUID, IlIllIllllIllIll> iliIliiIll;
   private final lliliIIiililiIIi iiilIiiIll;
   private static final float iIIIliiIll = 130.0F;
   private static final float IliiIiiIll = 3.0F;
   private static final int iIlIliiIll = 6282350;
   private WeakReference<Object> iiiIliiIll;
   private static final int liIlIiiIll = 3;
   private final iiIiiilIIliiil lIllIiiIll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","AzqZqJ3GYXyyY2bjArNszNPS6dZcYb+MDi1Fa19Ue0jCNIAcaxf5">(),
      IliIlllilIi<"IliIlllilIi","lV5ZFjSWu8y8dx54LaGFTPyHofONaFMZgYZNHwoGnBFPYa++ulb/dVRORh6T1TLoKQtIXqifZRIx">(),
      true
   );
   private static final String[] iIIlliiIll;
   private long IiIlliiIll;
   private static final int llIlIiiIll = 0;
   private static final float IiiiIiiIll = 2.5F;
   private final lliliIIiililiIIi liilIiiIll;
   public static final String iliIIiiIll = "Bottom";
   private static final float ilIIliiIll = 0.72F;
   private static final float lIiiIiiIll = 9.0F;
   private static final float liiiIiiIll = 34.0F;

   private float IIIillIIil(llllliilllli t, IIliiIlllIliiIll font) {
      IlIllIllllIllIll var3 = t.IIIlIIlIllIIlIIlIl;
      float var4 = this.liilliiill(t, font);
      float var5 = font.iIlIlllllill(var3.Illliillll) * 0.8F;
      float var6 = var3.lllliillll.isEmpty() ? 0.0F : font.iIlIlllllill(var3.lllliillll) * 0.8F;
      float var7 = var3.iilliillll.isEmpty() ? 0.0F : var3.iIiliillll + 6.0F;
      float var8 = var3.lIiliillll > 0.0F ? (t.iiilIIlIlIIIiIIlIl >= 0 ? 8.5F : 0.0F) + var3.lIiliillll : 0.0F;
      return 10.0F
         + (var4 > 0.0F ? var4 + 5.0F : 0.0F)
         + (t.IIilIIlIllIilIIlIl ? 7.0F : 0.0F)
         + var3.IIiliillll
         + (var7 > 0.0F ? 5.0F + var7 : 0.0F)
         + (var8 > 0.0F ? 5.0F + var8 : 0.0F)
         + 5.0F
         + var5
         + (var6 > 0.0F ? 1.5F + var6 : 0.0F)
         + 1.5F
         + 7.0F;
   }

   private void illilIilil(llllliilllli icons, class_4587 font, class_332 m, IIliiIlllIliiIll t, boolean ctx) {
      float var6 = icons.lIlIlIlIliIlIlIlIl[1];
      float var7 = icons.IllIlIlIllllIlIlIl[1];
      float var8 = icons.IiIlIIlIlliIlIIlIl;
      boolean var9 = icons.liiiIIlIliiiiIIlIl[1];
      this.ilillIiill(font, var6, var7, icons.llilIIlIlililIIlIl, var8);
      float var10 = Math.max(8.0F, icons.iiIlIIlIlIIllIIlIl * 0.8F) + 2.0F;
      float var11 = 5.0F;
      float var12 = 3.0F;

      for (int var13 = 0; var13 < icons.IliiIIlIllliiIIlIl; var13++) {
         class_1293 var14 = icons.IiliIIlIlliliIIlIl[var13];
         if (ctx) {
            class_2960 var15 = null;

            try {
               var15 = class_329.method_71644(var14.method_5579());
            } catch (Throwable var17) {
            }

            if (var15 != null) {
               m.method_52707(
                  class_10799.field_56883, var15, Math.round(var11), Math.round(var12 + (var10 - 8.0F) / 2.0F), 8, 8, IiIliliIli(16777215, var8).getRGB()
               );
               this.IlllliiIll = true;
            }
         }

         boolean var18 = var14.method_5584() >= 0 && var14.method_5584() < 200 && !var14.method_48559();
         IilIililIi(
            t,
            font,
            icons.iiliIIlIlIIiiIIlIl[var13],
            var11 + 8.0F + 2.0F,
            this.lllIiillIi(var12, var10, 0.8F),
            0.8F,
            IiIliliIli(var18 ? 14699339 : 13225430, var8)
         );
         if (var9) {
            var12 += var10;
         } else {
            var11 += 10.0F + icons.lIiiIIlIliIiiIIlIl[var13] + 6.0F;
         }
      }
   }

   private float iilIiIIiIi(float distance) {
      float var2 = illliIilli(distance / (float)this.IIllIiiIll.Iilllilliill(), 0.0F, 1.0F);
      return 1.0F + -0.27999997F * var2;
   }

   private static float iiIliIIlli(float dt, float cur, float speed, float target) {
      if (speed <= 0.0F) {
         return dt;
      } else {
         float var4 = Math.min(1.0F, speed * target);
         return dt + (cur - dt) * var4;
      }
   }

   private static boolean iliIiIiiIi(class_1657 player) {
      return player.method_5667().version() == (~(-84890228 >>> 19 | -84890228 << 13) * 93 ^ 511253119);
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      long var4 = -2882100297846685911L;
      if (e.iilIIiiIll instanceof class_2663 var2 && this.IIilIiiIll.Iilllilliill()) {
         var4 ^= ((long)var2.method_11470() << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) != (((1269579019 << 3 | 1269579019 >>> 29) >>> 11 | (1269579019 << 3 | 1269579019 >>> 29) << 21) ^ 189508638)
            && (int)(var4 >>> 32) != (-(1919893231 * 1556147571 * -724452315) ^ 904855180)) {
            return;
         }

         if (this.liiIliiIll.size() >= ((-571845636 >>> 15 | -571845636 << 17) * 81 ^ 637824020)) {
            this.liiIliiIll.poll();
         }

         this.liiIliiIll.add(var2);
         return;
      }
   }

   private boolean lIilliIill(int e, llllliilllli index, int t) {
      float var4 = index.iIIIlIlIlIlIIlIlIl[t];
      float var5 = index.llIIlIlIlilIIlIlIl[t];
      float var6 = var4 + index.IiIIlIlIlliIIlIlIl[t];
      float var7 = var5 + index.iiIIlIlIlIIlIlIlIl[t];

      for (int var8 = e + 1; var8 < this.iillliiIll.size(); var8++) {
         llllliilllli var9 = this.iillliiIll.get(var8);

         for (int var10 = 0; var10 < 3; var10++) {
            if (var9.iliiIIlIlIiiiIIlIl[var10]) {
               float var11 = var9.iIIIlIlIlIlIIlIlIl[var10];
               float var12 = var9.llIIlIlIlilIIlIlIl[var10];
               if (var11 < var6 && var11 + var9.IiIIlIlIlliIIlIlIl[var10] > var4 && var12 < var7 && var12 + var9.iiIIlIlIlIIlIlIlIl[var10] > var5) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static void IilIililIi(IIliiIlllIliiIll x, class_4587 s, String m, float font, float y, float c, Color scale) {
      if (m != null && !m.isEmpty()) {
         if (Math.abs(c - 1.0F) < 0.001F) {
            x.IliIlllilIi(m, font, y, scale);
         } else {
            s.method_22903();

            try {
               s.method_46416(font, y, 0.0F);
               s.method_22905(c, c, 1.0F);
               x.IliIlllilIi(m, 0.0F, 0.0F, scale);
            } finally {
               s.method_22909();
            }
         }
      }
   }

   private static int liIlliiIll(lliliIIiililiIIi s) {
      String var1 = s.Iilllilliill();

      return switch (var1) {
         case IliIlllilIi<"IliIlllilIi","DC5LqoAAc3+/eaQwq/qS/YO5p073whfz32fqpvVnEdR/IA==">() -> 1;
         case IliIlllilIi<"IliIlllilIi","DyxmD9hyDGCvB+zOALyyToWOyY9Hs2WBr02rPpZICZY=">() -> 2;
         case IliIlllilIi<"IliIlllilIi","e5eBxfFemYvN57HPSdnqJmwC6M6aQd0GhTYIi0AEaCAb">() -> 3;
         default -> 0;
      };
   }

   private String lliililiil(class_1799 stack) {
      long var3 = -980622844317765563L;
      if (this.IillIiiIll.Iilllilliill() && stack.method_7986() && stack.method_7936() > 0) {
         var3 ^= ((long)Math.round(100.0F * (float)(stack.method_7936() - stack.method_7919()) / (float)stack.method_7936()) << 32 ^ var3) & -1L << 32;
         return iIIlliiIll[Math.max(0, Math.min((-1497074621 - 31) * 21 ^ -1373796720, (int)(var3 >>> 32)))];
      } else {
         return "";
      }
   }

   private void iilllIIill(llllliilllli stack, class_1799 t) {
      if (t != null && !t.method_7960() && stack.llliIIlIlilliIIlIl < (((211947366 >>> 25 | 211947366 << 7) ^ 113) * 121 ^ 1285804857)) {
         stack.liIiIIlIliiIiIIlIl[stack.llliIIlIlilliIIlIl++] = t;
      }
   }

   private void ilillIiill(class_4587 h, float m, float w, int accent, float alpha) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(h, IiIliliIli(0, 0.3F * alpha), -1.5, -1.0, (double)(m + 1.5F), (double)(w + 2.0F), 5.5, 12.0);
         llilllililll.IiIlliIliiIl(h, IiIliliIli(accent, 0.2F * alpha), -1.0, -1.0, (double)(m + 1.0F), (double)(w + 1.0F), 5.0, 12.0);
         llilllililll.IiIlliIliiIl(h, IiIliliIli(658190, 0.86F * alpha), 0.0, 0.0, (double)m, (double)w, 4.0, 12.0);
      } finally {
         llilllililll.IIIilIIiiIIi();
      }
   }

   private boolean iIlllIllll(llllliilllli t, class_1657 dt, float tickDelta, float player) {
      UUID var5 = dt.method_5667();
      IlIllIllllIllIll var6 = this.iliIliiIll.computeIfAbsent(var5, k -> new IlIllIllllIllIll());
      var6.IlIliillll = true;
      t.liiIIIlIliiiIIIlIl = dt;
      t.IIIlIIlIllIIlIIlIl = var6;
      float var7 = Iiiilllliiilll.field_1724.method_5739(dt);
      t.iIIlIIlIlIlIlIIlIl = var7;
      boolean var8 = var7 <= (float)this.IIllIiiIll.Iilllilliill();
      double var9 = Illlilllli(dt.field_6014, dt.method_23317(), tickDelta);
      double var11 = Illlilllli(dt.field_6036, dt.method_23318(), tickDelta) + (double)dt.method_17682() + 0.5;
      double var13 = Illlilllli(dt.field_5969, dt.method_23321(), tickDelta);
      boolean var15 = this.lilliiilli(var9, var11, var13);
      float var16 = this.llilliiIll;
      float var17 = this.ililliiIll;
      boolean var18 = false;
      if (var8 && var15 && !this.iiIlIiiIll.Iilllilliill()) {
         long var19 = Iiiilllliiilll.field_1687.method_75260();
         if (var6.IiIliillll != var19) {
            var6.IiIliillll = var19;
            var6.ilIliillll = this.lIiIiiIiIi(dt);
         }

         var18 = var6.ilIliillll;
      }

      float var55 = Math.max(1.0F, dt.method_6063());
      float var20 = illliIilli(dt.method_6032(), 0.0F, var55);
      if (!var6.llIliillll) {
         var6.llIliillll = true;
         var6.lIIliillll = 0.0F;
         var6.iIIliillll = var20;
      }

      boolean var21 = var8 && !var18 && var15;
      float var22 = player / 0.18F;
      var6.lIIliillll = var21 ? Math.min(1.0F, var6.lIIliillll + var22) : Math.max(0.0F, var6.lIIliillll - var22);
      var6.iIIliillll = iiIliIIlli(var6.iIIliillll, var20, player, 10.0F);
      if (!(var6.lIIliillll <= 0.001F) && var15) {
         float var23 = lIlliiIlli(var6.lIIliillll);
         t.IiIlIIlIlliIlIIlIl = var23;
         t.iIilIIlIlIlilIIlIl = !this.iIllliiIll && var23 >= 0.55F;
         float var24 = this.iilIiIIiIi(var7) * (float)this.IiilIiiIll.Iilllilliill() * (0.92F + 0.07999998F * var23);
         t.llIlIIlIlilIlIIlIl = var24;
         if (!this.IIllllIlll(t, dt, tickDelta)) {
            t.lIllIIlIliIllIIlIl = t.illlIIlIlIillIIlIl = var16;
            t.IlllIIlIlllllIIlIl = t.lillIIlIliillIIlIl = var17;
         }

         IIliiIlllIliiIll var25 = CorzClient.fontManager.lIiiIiIlilli();
         float var26 = var25.IilliliilIIi();
         t.iiIlIIlIlIIllIIlIl = var26;
         this.IlilliiIll = (float)var25.IlIillIiilIi(0, 100) - 50.0F;
         t.IIilIIlIllIilIIlIl = this.iIilIiiIll.Iilllilliill() && iIIiIiIlIlIiIiIl.liiiIIllIl(dt);
         t.llilIIlIlililIIlIl = t.IIilIIlIllIilIIlIl ? 5562506 : IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         t.IlIiIIlIlllIiIIlIl = illliIilli(var6.iIIliillll / var55, 0.0F, 1.0F);
         float var27 = Math.max(0.0F, dt.method_6067());
         t.ilIiIIlIlIiIiIIlIl = var27 / var55;
         t.IiilIIlIlliilIIlIl = llIliilIli(t.IlIiIIlIlllIiIIlIl);
         long var28 = Iiiilllliiilll.field_1687.method_75260();
         if (var6.liIliillll != var28 || var6.lliliillll != var25) {
            var6.liIliillll = var28;
            var6.lliliillll = var25;
            String var30 = iIIliIlIli(var25, liIlliIiiiIlliIi.lllllillll(dt.method_5477().getString()), 130.0F);
            if (!var30.equals(var6.lilliillll)) {
               var6.lilliillll = var30;
               var6.IIiliillll = var25.iIlIlllllill(var30);
            }

            String var31 = this.lIilIiiIll.Iilllilliill() ? IiIilliIil(dt) : "";
            if (!var31.equals(var6.iilliillll)) {
               var6.iilliillll = var31;
               var6.iIiliillll = var31.isEmpty() ? 0.0F : var25.iIlIlllllill(var31) * 0.7F;
            }

            var6.Ililiillll = iiIilIIlil(dt);
            var6.iIlliillll = Long.MIN_VALUE;
         }

         t.iiilIIlIlIIIiIIlIl = this.IlllIiiIll.Iilllilliill() ? this.IliIilliIi(dt) : -1;
         int var56 = this.iIllIiiIll.Iilllilliill() ? (int)var7 : -1;
         long var57 = (long)t.iiilIIlIlIIIiIIlIl << 32 | (long)var56 & 4294967295L;
         if (var57 != var6.iIlliillll) {
            var6.iIlliillll = var57;
            String var33 = t.iiilIIlIlIIIiIIlIl >= 0 ? t.iiilIIlIlIIIiIIlIl + IliIlllilIi<"IliIlllilIi","RuYyZlMm84wnum5rCagM2ZNPUG3RD7lDTbrCOb2H">() : "";
            String var34 = var56 >= 0 ? var56 + IliIlllilIi<"IliIlllilIi","D3/0jFTqufDZL/FuBl5xJXeui4hpd80C/3XTYzQ=">() : "";
            var6.Iilliillll = IIIlilIIli(var33, var34);
            var6.lIiliillll = var6.Iilliillll.isEmpty() ? 0.0F : var25.iIlIlllllill(var6.Iilliillll) * 0.82F;
         }

         int var58 = Math.round(var6.iIIliillll * 10.0F);
         int var59 = var27 > 0.05F ? Math.round(var27) : -1;
         if (var58 != var6.iiIliillll) {
            var6.iiIliillll = var58;
            var6.Illliillll = var58 / 10 + IliIlllilIi<"IliIlllilIi","1ySw4VYV4fX8+p6X6DmYYrizRE9Wz6uqNNFGU/g=">() + Math.abs(var58 % 10);
         }

         if (var59 != var6.IIlliillll) {
            var6.IIlliillll = var59;
            var6.lllliillll = var59 < 0 ? "" : IliIlllilIi<"IliIlllilIi","50itrsyDO+HYvG1RKyLtCou4c3hEmi7Tjyxd8rI=">() + var59;
         }

         t.lIIiIIlIliIIiIIlIl = this.IIilIiiIll.Iilllilliill() ? this.lIIlliIIll(dt) : -1;
         if (t.lIIiIIlIliIIiIIlIl != var6.lIlliillll) {
            var6.lIlliillll = t.lIIiIIlIliIIiIIlIl;
            var6.illliillll = t.lIIiIIlIliIIiIIlIl < 0
               ? ""
               : (t.lIIiIIlIliIIiIIlIl < 100 ? IlIlliiIll[t.lIIiIIlIliIIiIIlIl] : String.valueOf(t.lIIiIIlIliIIiIIlIl));
         }

         t.llliIIlIlilliIIlIl = 0;
         if (this.llllIiiIll.Iilllilliill() && !this.iIllliiIll) {
            this.iilllIIill(t, dt.method_6118(class_1304.field_6169));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6174));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6172));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6166));
            if (this.illlIiiIll.Iilllilliill()) {
               this.iilllIIill(t, dt.method_6047());
               this.iilllIIill(t, dt.method_6079());
            }
         }

         for (int var35 = 0; var35 < t.llliIIlIlilliIIlIl; var35++) {
            t.IIliIIlIllIliIIlIl[var35] = this.lliililiil(t.liIiIIlIliiIiIIlIl[var35]);
            t.iIliIIlIlIlliIIlIl[var35] = this.iIiilIliil(t.liIiIIlIliiIiIIlIl[var35]);
         }

         t.IliiIIlIllliiIIlIl = 0;
         if (this.iillIiiIll.Iilllilliill()) {
            for (class_1293 var36 : dt.method_6026()) {
               if (t.IliiIIlIllliiIIlIl >= 6) {
                  break;
               }

               if (var36.method_5592()) {
                  t.IiliIIlIlliliIIlIl[t.IliiIIlIllliiIIlIl] = var36;
                  t.iiliIIlIlIIiiIIlIl[t.IliiIIlIllliiIIlIl] = this.lililiilil(var36);
                  t.lIiiIIlIliIiiIIlIl[t.IliiIIlIllliiIIlIl] = var25.iIlIlllllill(t.iiliIIlIlIIiiIIlIl[t.IliiIIlIllliiIIlIl]) * 0.8F;
                  t.IliiIIlIllliiIIlIl++;
               }
            }
         }

         float var61 = t.lIllIIlIliIllIIlIl;
         float var62 = t.IlllIIlIlllllIIlIl;
         float var37 = t.illlIIlIlIillIIlIl;
         float var38 = t.lillIIlIliillIIlIl;
         float var39 = (var61 + var37) / 2.0F;
         float var40 = var62 - 3.0F;
         float var41 = var38 + 3.0F;
         float var42 = var61 - 4.0F;
         float var43 = var37 + 4.0F;
         float var44 = var62;
         float var45 = var62;

         for (int var46 = 0; var46 < 4; var46++) {
            t.iliiIIlIlIiiiIIlIl[var46] = false;
         }

         if (this.lIllIiiIll.Iilllilliill()) {
            int var63 = liIlliiIll(this.lIIiIiiIll);
            t.iliiIIlIlIiiiIIlIl[3] = true;
            if (var63 != 2 && var63 != 3) {
               float var65 = illliIilli((var37 - var61) * 0.9F, 34.0F * var24, 80.0F * var24);
               float var48 = Math.max(2.0F, 2.5F * var24);
               float var68 = var63 == 0 ? var40 - var48 : var41;
               lllllillll(t, 3, var39 - var65 / 2.0F, var68, var65, var48, var65, var48, false, false);
               if (var63 == 0) {
                  var40 = var68 - 3.0F * var24;
               } else {
                  var41 = var68 + var48 + 3.0F * var24;
               }
            } else {
               float var47 = Math.max(2.0F, 2.5F * var24);
               float var49 = Math.max(var62 + 8.0F, var38);
               float var50 = var63 == 2 ? var42 - var47 : var43;
               lllllillll(t, 3, var50, var62, var47, var49 - var62, var47, var49 - var62, true, var63 == 2);
               if (var63 == 2) {
                  var42 = var50 - 4.0F;
               } else {
                  var43 = var50 + var47 + 4.0F;
               }
            }
         }

         for (int var64 = 0; var64 < 3; var64++) {
            int var66 = liIlliiIll(var64 == 0 ? this.liilIiiIll : (var64 == 1 ? this.IIIiIiiIll : this.iiilIiiIll));
            boolean var67 = var66 == 2 || var66 == 3;
            float var69;
            float var70;
            if (var64 == 0) {
               var69 = this.IIIillIIil(t, var25);
               var70 = var26 + 6.0F;
            } else if (var64 == 1) {
               if (t.IliiIIlIllliiIIlIl == 0) {
                  continue;
               }

               var69 = this.lIliliIlil(t, var67);
               var70 = this.Illillllil(t, var26, var67);
            } else {
               if (t.llliIIlIlilliIIlIl == 0) {
                  continue;
               }

               var69 = this.iiiilIIIIi(t, var25, var67);
               var70 = this.lIIIiiIIIi(t, var26, var67);
            }

            float var51 = var69 * var24;
            float var52 = var70 * var24;
            float var53;
            float var54;
            switch (var66) {
               case 1:
                  var53 = var39 - var51 / 2.0F;
                  var54 = var41;
                  var41 += var52 + 3.0F * var24;
                  break;
               case 2:
                  var53 = var42 - var51;
                  var54 = var44;
                  var44 += var52 + 3.0F * var24;
                  break;
               case 3:
                  var53 = var43;
                  var54 = var45;
                  var45 += var52 + 3.0F * var24;
                  break;
               default:
                  var53 = var39 - var51 / 2.0F;
                  var54 = var40 - var52;
                  var40 -= var52 + 3.0F * var24;
            }

            t.iliiIIlIlIiiiIIlIl[var64] = true;
            lllllillll(t, var64, var53, var54, var51, var52, var69, var70, var67, var66 == 2);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      this.iiiIlIIIll();
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            long var2 = System.currentTimeMillis();
            float var4 = this.IiIlliiIll == 0L ? 0.0F : Math.min(0.1F, (float)(var2 - this.IiIlliiIll) / 1000.0F);
            this.IiIlliiIll = var2;

            for (IlIllIllllIllIll var6 : this.iliIliiIll.values()) {
               var6.IlIliillll = false;
            }

            boolean var11 = !Iiiilllliiilll.field_1773.method_19418().method_19333();
            class_4587 var12 = this.iiIlliiIll;
            var12.method_34426();
            CorzClient.fontManager.iIlIlllllill(var12);
            this.llllliiIll.set(lIiIIiiIll).mul(iIiIIiiIll).mul(IliIIiiIll);
            this.iillliiIll.clear();
            int var7 = 0;

            for (class_742 var9 : Iiiilllliiilll.field_1687.method_18456()) {
               if ((var9 != Iiiilllliiilll.field_1724 || this.IlilIiiIll.Iilllilliill() && !var11)
                  && !var9.method_5767()
                  && (!this.ililIiiIll.Iilllilliill() || !iliIiIiiIi(var9))
                  && (!this.llilIiiIll.Iilllilliill() || !this.liiIiiiiIi(var9))) {
                  if (var7 == this.lillliiIll.size()) {
                     this.lillliiIll.add(new llllliilllli());
                  }

                  llllliilllli var10 = this.lillliiIll.get(var7);
                  if (this.iIlllIllll(var10, var9, event.lIiIilIIIl, var4)) {
                     this.iillliiIll.add(var10);
                     var7++;
                  }
               }
            }

            this.iillliiIll.sort((b, a) -> Float.compare(a.iIIlIIlIlIlIlIIlIl, b.iIIlIIlIlIlIlIIlIl));

            for (int var13 = 0; var13 < this.iillliiIll.size(); var13++) {
               this.Ilillllill(this.iillliiIll.get(var13), var13, var12, event.IIiIilIIIl);
            }

            for (int var14 = 0; var14 < var7; var14++) {
               this.lillliiIll.get(var14).liiIIIlIliiiIIIlIl = null;
            }

            this.iillliiIll.clear();
            this.iliIliiIll.entrySet().removeIf(e -> !e.getValue().IlIliillll);
            if (this.IIIlliiIll.size() > 256) {
               this.IIIlliiIll.clear();
            }
         }
      }
   }

   public float IlIllllIll(float fallback) {
      return !Float.isNaN(this.IiilliiIll) && System.currentTimeMillis() - this.lIllliiIll <= (60848893569705750L ^ 60848893569705606L)
         ? this.IiilliiIll
         : fallback;
   }

   @Override
   public void Iilililiiili() {
      this.iliIliiIll.clear();
      this.IiiIliiIll.clear();
      this.liiIliiIll.clear();
      this.iiiIliiIll = new WeakReference<>(null);
      this.IiIlliiIll = 0L;
      this.lIllliiIll = 0L;
   }

   private boolean lIiIiiIiIi(class_1657 player) {
      try {
         class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         class_243 var3 = player.method_33571();
         class_3965 var4 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17558, class_242.field_1348, player));
         return var4 != null && var4.method_17783() != class_240.field_1333
            ? var4.method_17784().method_1025(var2) < var3.method_1025(var2) - Double.longBitsToDouble(-4498367852768424726L ^ -137662548578297711L)
            : false;
      } catch (Throwable var5) {
         return false;
      }
   }

   private static double Illlilllli(double t, double a, float b) {
      return t + (a - t) * (double)b;
   }

   private static void lllllillll(llllliilllli h, int vertical, float lh, float y, float t, float leftSide, float w, float e, boolean lw, boolean x) {
      h.iIIIlIlIlIlIIlIlIl[vertical] = lh;
      h.llIIlIlIlilIIlIlIl[vertical] = y;
      h.IiIIlIlIlliIIlIlIl[vertical] = t;
      h.iiIIlIlIlIIlIlIlIl[vertical] = leftSide;
      h.lIlIlIlIliIlIlIlIl[vertical] = w;
      h.IllIlIlIllllIlIlIl[vertical] = e;
      h.liiiIIlIliiiiIIlIl[vertical] = lw;
      h.IIIIlIlIllIIIlIlIl[vertical] = x;
   }

   private static int iiIilIIlil(class_1657 player) {
      try {
         class_268 var1 = player.method_5781();
         if (var1 != null) {
            Integer var2 = var1.method_1202().method_532();
            if (var2 != null && (var2 & (~1703622619 + 81 ^ -1702152310)) != ((831944880 + 69) * -1483715975 + -43 ^ -887487907)) {
               return var2 & ((334384870 + 123 + -101) * -652835029 ^ 1789515691);
            }
         }
      } catch (Throwable var3) {
      }

      return -88501766 + 5 - -1 ^ -93298730;
   }

   private static int llIliilIli(float ratio) {
      if (ratio > 0.6F) {
         return (~-232555907 << 31 | ~-232555907 >>> 1) ^ 112303791;
      } else {
         return ratio > 0.3F
            ? ((-1605359754 ^ -71) >>> 1 | (-1605359754 ^ -71) << 31) ^ -1355340721
            : ((-1226018444 * 96516119 >>> 13 | -1226018444 * 96516119 << 19) >>> 11 | (-1226018444 * 96516119 >>> 13 | -1226018444 * 96516119 << 19) << 21)
               ^ -7
               ^ 915331081;
      }
   }

   private void liIIiiiIIi(class_332 size, class_1799 stack, float ctx, float y, float x) {
      if (!this.iIllliiIll && stack != null && !stack.method_7960()) {
         this.IlllliiIll = true;
         Matrix3x2fStack var6 = size.method_51448();
         var6.pushMatrix();

         try {
            var6.translate(ctx, y);
            var6.scale(x / 16.0F, x / 16.0F);
            size.method_51427(stack, 0, 0);
         } finally {
            var6.popMatrix();
         }
      }
   }

   private float lllIiillIi(float boxH, float boxY, float scale) {
      return boxH + boxY / 2.0F + this.IlilliiIll * scale;
   }

   public boolean IIililIili() {
      return this.IliIlllilIi();
   }

   private float lIliliIlil(llllliilllli t, boolean vertical) {
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (int var5 = 0; var5 < t.IliiIIlIllliiIIlIl; var5++) {
         float var6 = 10.0F + t.lIiiIIlIliIiiIIlIl[var5];
         var3 += var6;
         var4 = Math.max(var4, var6);
      }

      return vertical ? 10.0F + var4 : 10.0F + var3 + 6.0F * (float)Math.max(0, t.IliiIIlIllliiIIlIl - 1);
   }

   private static String IIIlilIIli(String a, String b) {
      if (a.isEmpty() && b.isEmpty()) {
         return "";
      } else if (a.isEmpty()) {
         return b;
      } else {
         return b.isEmpty() ? a : a + IliIlllilIi<"IliIlllilIi","jF+Xba7TeZn7pHb1LH11iNEny4HGKY6dpv5c6oqCctQ=">() + b;
      }
   }

   public boolean ilIllIiIll(class_332 ctx, float icons, boolean tickDelta) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && this.IliIlllilIi()) {
         long var4 = System.currentTimeMillis();
         float var6 = this.lIllliiIll != 0L && var4 - this.lIllliiIll <= 400L ? Math.min(0.1F, (float)(var4 - this.lIllliiIll) / 1000.0F) : 0.0F;
         this.lIllliiIll = var4;
         class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
         CorzClient.fontManager.iIlIlllllill(this.IIllliiIll);
         this.iIllliiIll = !tickDelta;
         this.IlllliiIll = false;
         this.llllliiIll.set(lIiIIiiIll).mul(iIiIIiiIll).mul(IliIIiiIll);

         boolean var9;
         try {
            this.iiiIlIIIll();
            llllliilllli var8 = this.IIilliiIll;
            this.IiilliiIll = Float.NaN;
            if (this.iIlllIllll(var8, Iiiilllliiilll.field_1724, icons, var6)) {
               this.IiilliiIll = this.Iillllilll(var8);
               this.iillliiIll.clear();
               this.iillliiIll.add(var8);
               this.Ilillllill(var8, 0, this.IIllliiIll, ctx);
               this.iillliiIll.clear();
            }

            var9 = this.IlllliiIll;
         } finally {
            this.iIllliiIll = false;
            CorzClient.fontManager.iIlIlllllill(var7);
         }

         return var9;
      } else {
         return false;
      }
   }

   private float Illillllil(llllliilllli vertical, float t, boolean fh) {
      float var4 = Math.max(8.0F, t * 0.8F) + 2.0F;
      return fh ? 6.0F + var4 * (float)vertical.IliiIIlIllliiIIlIl : 6.0F + var4;
   }

   private static String iIIliIlIli(IIliiIlllIliiIll s, String font, float maxW) {
      if (font == null) {
         return "";
      } else if (s.iIlIlllllill(font) <= maxW) {
         return font;
      } else {
         String var3 = IliIlllilIi<"IliIlllilIi","4zd5BMBkrX/Q3D+F0ftuN00weBXBKoIYxU+zyyELHA==">();
         float var4 = s.iIlIlllllill(var3);
         StringBuilder var5 = new StringBuilder();
         float var6 = 0.0F;

         for (int var7 = 0; var7 < font.length(); var7++) {
            float var8 = s.iIlIlllllill(String.valueOf(font.charAt(var7)));
            if (var6 + var8 + var4 > maxW) {
               break;
            }

            var5.append(font.charAt(var7));
            var6 += var8;
         }

         return var5.append(var3).toString();
      }
   }

   private void IlIIillIIi(llllliilllli icons, class_4587 font, class_332 t, IIliiIlllIliiIll ctx, boolean m) {
      float var6 = icons.lIlIlIlIliIlIlIlIl[2];
      float var7 = icons.IllIlIlIllllIlIlIl[2];
      float var8 = icons.IiIlIIlIlliIlIIlIl;
      int var9 = icons.llilIIlIlililIIlIl;
      this.ilillIiill(font, var6, var7, var9, var8);
      float var10 = icons.iiIlIIlIlIIllIIlIl * 0.55F + 0.5F;
      if (!icons.liiiIIlIliiiiIIlIl[2]) {
         int var20 = 0;

         for (int var21 = 0; var21 < icons.llliIIlIlilliIIlIl; var21++) {
            var20 = Math.max(var20, icons.iIliIIlIlIlliIIlIl[var21].length);
         }

         float var22 = 5.0F;
         float var23 = 3.0F + (float)var20 * var10;

         for (int var24 = 0; var24 < icons.llliIIlIlilliIIlIl; var24++) {
            float var25 = this.Iiiilliiil(icons, ctx, var24);
            String[] var26 = icons.iIliIIlIlIlliIIlIl[var24];

            for (int var27 = 0; var27 < var26.length; var27++) {
               float var30 = ctx.iIlIlllllill(var26[var27]) * 0.55F;
               float var33 = var23 - (float)(var26.length - var27) * var10;
               IilIililIi(ctx, font, var26[var27], var22 + (var25 - var30) / 2.0F, var33, 0.55F, IiIliliIli(var27 == 0 ? var9 : 13225430, var8));
            }

            if (m) {
               this.liIIiiiIIi(t, icons.liIiIIlIliiIiIIlIl[var24], var22 + (var25 - 12.0F) / 2.0F, var23, 12.0F);
            }

            String var28 = icons.IIliIIlIllIliIIlIl[var24];
            if (!var28.isEmpty()) {
               float var31 = ctx.iIlIlllllill(var28) * 0.52F;
               IilIililIi(
                  ctx, font, var28, var22 + (var25 - var31) / 2.0F, var23 + 12.0F + 0.5F, 0.52F, IiIliliIli(ilIIiIiIIi(icons.liIiIIlIliiIiIIlIl[var24]), var8)
               );
            }

            var22 += var25 + 3.0F;
         }
      } else {
         boolean var11 = icons.IIIIlIlIllIIIlIlIl[2];
         float var12 = 3.0F;

         for (int var13 = 0; var13 < icons.llliIIlIlilliIIlIl; var13++) {
            float var14 = var11 ? var6 - 5.0F - 12.0F : 5.0F;
            if (m) {
               this.liIIiiiIIi(t, icons.liIiIIlIliiIiIIlIl[var13], var14, var12, 12.0F);
            }

            float var15 = var11 ? var14 - 2.0F : var14 + 12.0F + 2.0F;
            float var16 = this.lllIiillIi(var12, 12.0F, 0.55F);
            String[] var17 = icons.iIliIIlIlIlliIIlIl[var13];

            for (int var18 = 0; var18 < var17.length; var18++) {
               float var19 = ctx.iIlIlllllill(var17[var18]) * 0.55F;
               if (var11) {
                  var15 -= var19;
               }

               IilIililIi(ctx, font, var17[var18], var15, var16, 0.55F, IiIliliIli(var18 == 0 ? var9 : 13225430, var8));
               var15 = var11 ? var15 - 2.0F : var15 + var19 + 2.0F;
            }

            String var29 = icons.IIliIIlIllIliIIlIl[var13];
            if (!var29.isEmpty()) {
               float var32 = ctx.iIlIlllllill(var29) * 0.52F;
               if (var11) {
                  var15 -= var32;
               }

               IilIililIi(ctx, font, var29, var15, this.lllIiillIi(var12, 12.0F, 0.52F), 0.52F, IiIliliIli(ilIIiIiIIi(icons.liIiIIlIliiIiIIlIl[var13]), var8));
            }

            var12 += 13.0F;
         }
      }
   }

   private static int llIililIil(int ping) {
      if (ping < (-588624631 * 121 ^ 1790863633)) {
         return (
               ((1745129926 >>> 5 | 1745129926 << 27) >>> 21 | (1745129926 >>> 5 | 1745129926 << 27) << 11) << 29
                  | ((1745129926 >>> 5 | 1745129926 << 27) >>> 21 | (1745129926 >>> 5 | 1745129926 << 27) << 11) >>> 3
            )
            ^ 1081823837;
      } else {
         return ping < (((-1243687191 >>> 21 | -1243687191 << 11) << 9 | (-1243687191 >>> 21 | -1243687191 << 11) >>> 23) ^ 1855675737)
            ? ~(--1155574516) ^ -93 ^ 1140875904
            : -1103053495 * -65 - 87 ^ -1318077589;
      }
   }

   private void iIlIiIllIi(class_4587 y, float color, float absorb, float m, float x, float w, float h, int frac, float alpha) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(
            y,
            IiIliliIli(0, 0.55F * alpha),
            (double)(color - 0.5F),
            (double)(absorb - 0.5F),
            (double)(color + m + 0.5F),
            (double)(absorb + x + 0.5F),
            (double)(m / 2.0F + 0.5F),
            6.0
         );
         float var10 = Math.max(0.0F, x * w);
         if (var10 > 0.5F) {
            llilllililll.IiIlliIliiIl(
               y,
               IiIliliIli(frac, 0.95F * alpha),
               (double)color,
               (double)(absorb + x - var10),
               (double)(color + m),
               (double)(absorb + x),
               (double)(m / 2.0F),
               6.0
            );
         }

         float var11 = Math.min(x, x * illliIilli(h, 0.0F, 1.0F));
         if (var11 > 0.5F) {
            llilllililll.IiIlliIliiIl(
               y,
               IiIliliIli(15909198, 0.85F * alpha),
               (double)color,
               (double)(absorb + x - var11),
               (double)(color + m * 0.45F),
               (double)(absorb + x),
               (double)(m / 4.0F),
               6.0
            );
         }
      } finally {
         llilllililll.IIIilIIiiIIi();
      }
   }

   private static String IiIilliIil(class_1657 player) {
      try {
         class_268 var1 = player.method_5781();
         if (var1 == null) {
            return "";
         } else {
            String var2 = class_124.method_539(var1.method_1144().getString());
            if (var2 == null) {
               return "";
            } else {
               var2 = var2.replace(IliIlllilIi<"IliIlllilIi","Y5Bay0Da6DRxAim3D1FsT156L3qSxlfhOmtsZ28=">(), "")
                  .replace(IliIlllilIi<"IliIlllilIi","DCiY1r1jX+wejWjeWT16/Yabr9QlcW6k/a8t5j0=">(), "")
                  .replace(IliIlllilIi<"IliIlllilIi","TEXCY4RiMQ3PN+3mdK3edVUejSWx6IrF1QybT3o=">(), "")
                  .trim();
               if (var2.length() > (-(~(842104511 - -3) >>> 3 | ~(842104511 - -3) << 29) ^ 1179004887)) {
                  var2 = var2.substring(0, -(-111241278 + -23 ^ -3) ^ -111241308).trim();
               }

               return var2;
            }
         }
      } catch (Throwable var3) {
         return "";
      }
   }

   private float Iiiilliiil(llllliilllli i, IIliiIlllIliiIll font, int t) {
      float var4 = 12.0F;

      for (String var8 : i.iIliIIlIlIlliIIlIl[t]) {
         var4 = Math.max(var4, font.iIlIlllllill(var8) * 0.55F);
      }

      String var9 = i.IIliIIlIllIliIIlIl[t];
      if (!var9.isEmpty()) {
         var4 = Math.max(var4, font.iIlIlllllill(var9) * 0.52F);
      }

      return var4;
   }

   private static float lIlliiIlli(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private boolean lilliiilli(double y, double x, double z) {
      long var11 = -7876817400822863243L;
      var11 ^= ((long)Iiiilllliiilll.method_22683().method_4489() << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)Iiiilllliiilll.method_22683().method_4506() ^ var11) & -1L >>> 32;
      this.illlliiIll[2] = (int)(var11 >>> 32);
      this.illlliiIll[3] = (int)var11;
      class_243 var9 = Iiiilllliiilll.field_1773.method_19418().method_71156();
      this.llllliiIll.project((float)(y - var9.field_1352), (float)(x - var9.field_1351), (float)(z - var9.field_1350), this.illlliiIll, this.IillliiIll);
      if (!(this.IillliiIll.z <= 0.0F) && !(this.IillliiIll.z >= 1.0F)) {
         float var10 = (float)Iiiilllliiilll.method_22683().method_4495();
         this.llilliiIll = this.IillliiIll.x / var10;
         this.ililliiIll = ((float)((int)var11) - this.IillliiIll.y) / var10;
         return true;
      } else {
         return false;
      }
   }

   private String[] iIiilIliil(class_1799 stack) {
      if (!this.lillIiiIll.Iilllilliill()) {
         return liilliiIll;
      } else {
         class_9304 var2 = stack.method_58657();
         if (var2 != null && !var2.method_57543()) {
            String[] var3 = this.IIIlliiIll.get(var2);
            if (var3 != null) {
               return var3;
            } else {
               ArrayList var4 = this.lIilliiIll;
               var4.clear();

               for (Entry var6 : var2.method_57539()) {
                  class_6880 var7 = (class_6880)var6.getKey();
                  String var8 = var7.method_40230().map(k -> k.method_29177().method_12832()).orElse("");
                  String var9 = IliIliiIll.get(var8);
                  if (var9 == null) {
                     var9 = var8.isEmpty()
                        ? IliIlllilIi<"IliIlllilIi","73o9tyB40dzQBOa6g5YbbqcleheXugTH/bX1pwY=">()
                        : var8.substring(0, 1).toUpperCase(Locale.ROOT);
                  }

                  int var10 = var6.getIntValue();
                  int var11 = 1;

                  try {
                     var11 = ((class_1887)var7.comp_349()).method_8183();
                  } catch (Throwable var13) {
                  }

                  int var12 = lliIliiIll.getOrDefault(
                     var8, lliIliiIll.get(IliIlllilIi<"IliIlllilIi","9ncTzNrVydOaUCNcctFYIsIJdG3U0ntOlqumbyqIzsLfVdQL3rV7pL0naQ==">())
                  );
                  var4.add(new Object[]{var12, var10, var11 <= 1 && var10 <= 1 ? var9 : var9 + var10});
               }

               var4.sort((p, q) -> {
                  long var3x = 9121280495823197829L;
                  var3x ^= ((long)Integer.compare((Integer)p[0], (Integer)q[0]) << 32 ^ var3x) & -1L << 32;
                  return (int)(var3x >>> 32) != 0 ? (int)(var3x >>> 32) : Integer.compare((Integer)q[1], (Integer)p[1]);
               });
               int var14 = Math.min(4, var4.size());
               String[] var15 = new String[var14];

               for (int var16 = 0; var16 < var14; var16++) {
                  var15[var16] = (String)((Object[])var4.get(var16))[2];
               }

               var4.clear();
               this.IIIlliiIll.put(var2, var15);
               return var15;
            }
         } else {
            return liilliiIll;
         }
      }
   }

   private float Iillllilll(llllliilllli t) {
      float var2 = Float.NaN;

      for (int var3 = 0; var3 < 3; var3++) {
         if (t.iliiIIlIlIiiiIIlIl[var3] && t.liiiIIlIliiiiIIlIl[var3] && t.IIIIlIlIllIIIlIlIl[var3]) {
            float var4 = t.llIIlIlIlilIIlIlIl[var3] + t.iiIIlIlIlIIlIlIlIl[var3];
            var2 = Float.isNaN(var2) ? var4 : Math.max(var2, var4);
         }
      }

      return var2;
   }

   private void IIlIilIlIi(class_4587 frac, float y, float h, float x, float alpha, float absorb, float w, int m, float color) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(
            frac,
            IiIliliIli(0, 0.55F * color),
            (double)(y - 0.5F),
            (double)(h - 0.5F),
            (double)(y + x + 0.5F),
            (double)(h + alpha + 0.5F),
            (double)(alpha / 2.0F + 0.5F),
            6.0
         );
         float var10 = Math.max(0.0F, x * absorb);
         if (var10 > 0.5F) {
            llilllililll.IiIlliIliiIl(
               frac, IiIliliIli(m, 0.95F * color), (double)y, (double)h, (double)(y + var10), (double)(h + alpha), (double)(alpha / 2.0F), 6.0
            );
         }

         float var11 = Math.min(x, x * illliIilli(w, 0.0F, 1.0F));
         if (var11 > 0.5F) {
            llilllililll.IiIlliIliiIl(
               frac, IiIliliIli(15909198, 0.85F * color), (double)y, (double)h, (double)(y + var11), (double)(h + alpha * 0.45F), (double)(alpha / 4.0F), 6.0
            );
         }
      } finally {
         llilllililll.IIIilIIiiIIi();
      }
   }

   private float iiiilIIIIi(llllliilllli t, IIliiIlllIliiIll vertical, boolean font) {
      if (!font) {
         float var11 = 0.0F;

         for (int var12 = 0; var12 < t.llliIIlIlilliIIlIl; var12++) {
            var11 += this.Iiiilliiil(t, vertical, var12);
         }

         return 10.0F + var11 + 3.0F * (float)Math.max(0, t.llliIIlIlilliIIlIl - 1);
      } else {
         float var4 = 0.0F;

         for (int var5 = 0; var5 < t.llliIIlIlilliIIlIl; var5++) {
            float var6 = 12.0F;

            for (String var10 : t.iIliIIlIlIlliIIlIl[var5]) {
               var6 += 2.0F + vertical.iIlIlllllill(var10) * 0.55F;
            }

            String var13 = t.IIliIIlIllIliIIlIl[var5];
            if (!var13.isEmpty()) {
               var6 += 2.0F + vertical.iIlIlllllill(var13) * 0.52F;
            }

            var4 = Math.max(var4, var6);
         }

         return 10.0F + var4;
      }
   }

   private static int ilIIiIiIIi(class_1799 st) {
      float var1 = st.method_7936() <= 0 ? 1.0F : 1.0F - (float)st.method_7919() / (float)st.method_7936();
      return llIliilIli(var1);
   }

   public iliIliIlIiiIliIl() {
      super(IliIlllilIi<"IliIlllilIi","XMgHAo2ZJHXosOqyCQr6auuqIdGE8O0n66txpFT9JEEBbUuEBg==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iIllIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","FRq/MraXW1hENEHmp8jhqwXi0bIV1vs7dstILJM23I6oMz3DMkzzjYQ=">(),
         IliIlllilIi<"IliIlllilIi","AiRYFhnAKl706PSgsUeltcy54McE+wue1pDKcw2laPLLh9/HYGZQpQy48v4Br5jK6SXosZlL">(),
         true
      );
      this.IlllIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","68y1shI1Clm2XleR5ireI2zMuXNYspkvM8keK44GNFX2WU6K6Q==">(),
         IliIlllilIi<"IliIlllilIi","j3DWm9mSxdUOVTQpIxwnSkEGldtAGiZg8BvzIBfM3vuSi1esByUQlfu7nRJqE0X1rzl/Bqu7">(),
         true
      );
      this.llllIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","pD5KjS0Q+m+zE3P67e8udGquv/CCZUPYfa9jHETb+H8R0/Bm0HE=">(),
         IliIlllilIi<"IliIlllilIi","U6qc7jtBdBML5REf10v71UxLbQOHOF7NY3osoyW3tNa3jNaQw8pEtUGmwrrrpayAwAkrC7Advkc+HOYliduk3kE+nv7yuA==">(),
         true
      );
      this.illlIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","dwzCqfBKviQchqxQJohHEIJp4tMTRiVOgMZE4Mv32B1RORxByVswvcp1CQ==">(),
         IliIlllilIi<"IliIlllilIi","OKtcr7fFjVkuEC98u4sw9CsuFpR9y2ur0bL9CuqoNJR+49FHigEW+M1VYqfGRPagmKOlpJWGJR2VTgLYYKZpOW/aBJJkd5A=">(),
         true
      );
      this.IillIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","1lXHhkA/QG3mshw0m3wqkeAzL7q+reBYove2YoytF4NT6HApqDdsMgUGaw==">(),
         IliIlllilIi<"IliIlllilIi","42ONGMjmu8qoItTeAXRgvZurHiTnwHT4T6OdeNAplFER2uJHKB9fyLu8oTGKHomCyno5O2TpCA6G6gQOTnVQnww=">(),
         true
      );
      this.lillIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","bvnwyfD8OHx1J/0IdTy+Do8GgGA58qzzQz8rbX5oWQ4CFGJOXyqdGf5fCSLc">(),
         IliIlllilIi<"IliIlllilIi","3rSEnRNHbX881y0r4YWlviiCVHxDkiXB2+ii1EPixKu+osajmNcRPZcTrZQAaPMU5yXwrfQ/kli24Fbu0VuYJSsexW1exmMjvdV7NeweMHZBWlI=">(),
         true
      );
      this.iillIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","jz5wuGjn6yPjDYmWbHheAkH/FyuRAieoDBc/I3aAiwiq0W2g3TdLSw==">(),
         IliIlllilIi<"IliIlllilIi","aquc+9K0kqpgokHQlxHfC9Z4KNzItEOsB2Jd+PSQ59Sklz1ubxvmhgm9mFm7BwVL2SOwoFRhvHXZkqIYaOZ3X27H2rbtUmvk55Isz5i5Cir+rO6I9qMz5agXme4TQbHASdP22TZj">(),
         true
      );
      this.IIilIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","av/cWVde/S08bkL0UGk35+BmFbwwoH6kh371+CqHtePPM0MH0Q==">(),
         IliIlllilIi<"IliIlllilIi","0nUSEn0q3+wgp4hH9xcxuBPbuYRGQTnIBnHw2jMEpbYrOmmtpMfCCZndztuHNOiSWjnGBOaAPnNOSiVgIdDbSig=">(),
         true
      );
      this.lIilIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zpkgZorSvqdVfBaB4DgoJwvdTVdrGN1Wi95v1w0yCfr+6AV1yP9RUPI=">(),
         IliIlllilIi<"IliIlllilIi","RlIDcYou+6SfyZpo/eBGzUArH0jr4L3HrlUYRnsmQWQKIIPlU3qiKruRcoatWwBsTPn/Lfg3OQkfOfp2sZx5ymKS4EGWPfvw0kwt93wdWJdiWcs=">(),
         true
      );
      this.iIilIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","4qe7oKKzP5tlfPrhwi6CW/x56DuDzoqfXZHzgUg3TfKqZInmziYkhxJ4dBNMmg==">(),
         IliIlllilIi<"IliIlllilIi","nQ4beFUNK5RyXYWkPFZlnJNuqzdkXICFvvhUpf0fQYVldlke6tAMZGf7bkSE1F4CJSHlLo2PhgNVtRNS+e+3h5PZlfzktxlxug==">(),
         true
      );
      this.IlilIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Bhef9T6ecadlVlAGmc+FjY7V/RXOGP26Ivxg11ObEfj0QUKcbqitb+b2giuzzZq9tvXxJ2k=">(),
         IliIlllilIi<"IliIlllilIi","xUT8WLbzkkkmc8Dt6sbazF3lJM3UOFPs8AzxA+uR7aOB/ERdYA+G9LJ5JxSa0Lv54YzGnhkTfTQHgwbeymbjmN2gRXR5XDM=">(),
         false
      );
      this.llilIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","57wbBOPJnvmnn9bcibD4mFJq/JXRdyHAJDgS3p75yQXBwFnJDxvL">(),
         IliIlllilIi<"IliIlllilIi","VpLF+L4hWHEpFF9oOV69d0sL7x7HtpLQqYyQIo4PWKx/nUARu+CQPC/gQPDjNk+n7t4ku5WFKZHD9fI9KMiqopKJJ81LXJhlDDE/FM0lNBzECTRS98Uh0QiI2ngC1NVz72D1jqlEfa23Wom6+y7YYDLLLB/bQg==">(),
         false
      );
      this.ililIiiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","kmJJWhLOCvd0Tbo8BSUqqOH0ZqVzLIh5sJ44JlbWyBxSvpUjeYgV">(),
         IliIlllilIi<"IliIlllilIi","xWqVKOg9k/DV0xKZnT+mqKpR79W2QOI4Op/AQPfhhYTzTqHSl+CLFmylMPHLdxH56JxEpBofvnB+w52s4Uy2eWjNFYhemIiPBYRVJxnJS2heRUNMNzyfAerp9FMvQ8iW02iVcSzeuCO/FUDh1TS9iPEtDmOhzyx0jw==">(),
         false
      );
      this.IiilIiiIll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","JNG1icersyEffF0bEC43TM9vC2X2s9YE28rX6YFa1Nma">(),
         IliIlllilIi<"IliIlllilIi","hLk1I8JzkbfJ8x0VOJbCuAYcp6nzDP7ki7coK8pvJXTW9eddFV8c4d9x4n6QunQX02Obt3FPEwI=">(),
         1.0,
         0.5,
         2.0,
         0.05
      );
      this.liilIiiIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","rBnZ8djaCkDg1czpIjYH+cG5eSEqKxD+3k/wtjUQn2Yephy3JWxJ3Go=">(),
         IliIlllilIi<"IliIlllilIi","kH1J6TEKtTcHu8rRAlqOl2bTsY+QTLBYYVVJcl401sfcp/2xI9M4V1ZX/aiLbYO+PuIkawIYJJo7yqB3jeeFKmQyDIr+">(),
         IliIlllilIi<"IliIlllilIi","tBqMlQT/Z/xK+tvafLzWDxoblwGoDPdmrHKUja5QqA==">(),
         iiiIIiiIll
      );
      this.iiilIiiIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","bUlHVzIDWR1HRVvMFEyQZnzKiPqAUQDalHKJnjHQy4fKf5hEGiezUQ==">(),
         IliIlllilIi<"IliIlllilIi","knxUfrCySfshm88ZUbG1gBpNpEIbzUqE9Uf3ZyAwKv9eVzuNNMgWC2Ci8MayvCoWm1ScHHbWNxvJfTmLEMXQh2/HVPGebuoBZKo=">(),
         IliIlllilIi<"IliIlllilIi","tBqMlQT/Z/xK+tvafLzWDxoblwGoDPdmrHKUja5QqA==">(),
         iiiIIiiIll
      );
      this.IIIiIiiIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","bFsTgCK2FLUzZ0qK+esdEAyruUj3q+wAEwTNufIiX+r2zAb9iforuUiqEvE=">(),
         IliIlllilIi<"IliIlllilIi","LRkr7WzGtejlud+CJ6zuQ3jq5GEpe0MtjW5uQAx1s8VlPtcpQco2gNIJZp+RabmSjbvUDAeesey4GPlAHD0cYaj/9ON7Glw=">(),
         IliIlllilIi<"IliIlllilIi","tBqMlQT/Z/xK+tvafLzWDxoblwGoDPdmrHKUja5QqA==">(),
         iiiIIiiIll
      );
      this.lIIiIiiIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","upu8pY24M06FHlwm7Mc2AySVDRfZZi/2m4qadKF1MvXF90Ak48AFEAvOhqR2hN8=">(),
         IliIlllilIi<"IliIlllilIi","fMFkyL9fshG+eFilv8exR+CVhDKQYifJGoQk61+l949ANmrA51/nn467dtyUS1sdenm5oJMA/y9mYk7kNj/5rq0GzrE1MWqlstYD">(),
         IliIlllilIi<"IliIlllilIi","DyxmD9hyDGCvB+zOALyyToWOyY9Hs2WBr02rPpZICZY=">(),
         iiiIIiiIll
      );
      this.iliIliiIll = new HashMap<>();
      this.IiiIliiIll = new HashMap<>();
      this.liiIliiIll = new ConcurrentLinkedQueue<>();
      this.iiiIliiIll = new WeakReference<>(null);
      this.IIIlliiIll = new IdentityHashMap<>();
      this.lIIlliiIll = new Int2ObjectOpenHashMap();
      this.IiIlliiIll = 0L;
      this.iiIlliiIll = new class_4587();
      this.IIllliiIll = new class_4587();
      this.lIllliiIll = 0L;
      this.llllliiIll = new Matrix4f();
      this.illlliiIll = new int[4];
      this.IillliiIll = new Vector3f();
      this.lillliiIll = new ArrayList<>();
      this.iillliiIll = new ArrayList<>();
      this.IIilliiIll = new llllliilllli();
      this.lIilliiIll = new ArrayList<>();
      this.IiilliiIll = Float.NaN;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.iiIlIiiIll,
            this.IIllIiiIll,
            this.lIllIiiIll,
            this.iIllIiiIll,
            this.IlllIiiIll,
            this.llllIiiIll,
            this.illlIiiIll,
            this.IillIiiIll,
            this.lillIiiIll,
            this.iillIiiIll,
            this.IIilIiiIll,
            this.lIilIiiIll,
            this.iIilIiiIll,
            this.IlilIiiIll,
            this.llilIiiIll,
            this.ililIiiIll,
            this.IiilIiiIll,
            this.liilIiiIll,
            this.iiilIiiIll,
            this.IIIiIiiIll,
            this.lIIiIiiIll
         }
      );
   }

   private boolean liiIiiiiIi(class_1657 player) {
      if (iliIiIiiIi(player)) {
         return false;
      } else {
         class_634 var2 = Iiiilllliiilll.method_1562();
         return var2 != null && var2.method_2871(player.method_5667()) == null;
      }
   }

   private static float illliIilli(float v, float lo, float hi) {
      return v < lo ? lo : Math.min(v, hi);
   }

   private static String IIiillIiil(int n) {
      return switch (n) {
         case 1 -> IliIlllilIi<"IliIlllilIi","Hv05zhSjMK+cJnv+u4OREYoZs/sCuBljrPiSI0s=">();
         case 2 -> IliIlllilIi<"IliIlllilIi","CfGBieHCcI5Dv+g2qYPmZSgur7IoiQjpKsz93brg">();
         case 3 -> IliIlllilIi<"IliIlllilIi","qwRytfAgFDjJd+T7bbGloo5RX7EdFm4pQ/gitnbCYQ==">();
         case 4 -> IliIlllilIi<"IliIlllilIi","hz5ZQFYd4xojaCzY2B4YAB8t9c8LyFeDDRM8Ac5N">();
         case 5 -> IliIlllilIi<"IliIlllilIi","R0ZoFitiiS5GccrGW/fc7PZQtYtyRj/vf3lm8Lg=">();
         case 6 -> IliIlllilIi<"IliIlllilIi","EgLdzzanDI/BSXM3D/vaN5VLL8HEVKf7CA/ZmGTJ">();
         case 7 -> IliIlllilIi<"IliIlllilIi","yNt63btweMuHQ2ZRSQSXulcfinMz7s/AYVxIV4mPBQ==">();
         case 8 -> IliIlllilIi<"IliIlllilIi","a7IcbasWLpFIT+2P/5NVRqQDZN3ZsMlHibeuzD/ZKc4=">();
         case 9 -> IliIlllilIi<"IliIlllilIi","GuyMz6aTNNy51QhvjGpqSx9DiVoh1m/BstTHWeIc">();
         case 10 -> IliIlllilIi<"IliIlllilIi","D5eQA1OnIYODMmveLlz/0Zl9K/5CNC9UdJ/xsQU=">();
         default -> String.valueOf(n);
      };
   }

   private int lIIlliIIll(class_1657 p) {
      iilIllIIiIll var2 = this.IiiIliiIll.get(p.method_5667());
      if (var2 == null) {
         return 0;
      } else if (var2.IlIiIIIillIiIIIi == p.method_5628() && !p.method_29504()) {
         return var2.ilIiIIIiIiIiIIIi;
      } else {
         this.IiiIliiIll.remove(p.method_5667());
         return 0;
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      this.iiiIlIIIll();
   }

   private float lIIIiiIIIi(llllliilllli fh, float vertical, boolean t) {
      if (t) {
         return 6.0F + (float)fh.llliIIlIlilliIIlIl * 13.0F;
      } else {
         int var4 = 0;
         boolean var5 = false;

         for (int var6 = 0; var6 < fh.llliIIlIlilliIIlIl; var6++) {
            var4 = Math.max(var4, fh.iIliIIlIlIlliIIlIl[var6].length);
            if (!fh.IIliIIlIllIliIIlIl[var6].isEmpty()) {
               var5 = true;
            }
         }

         return 6.0F + (float)var4 * (vertical * 0.55F + 0.5F) + 12.0F + (var5 ? vertical * 0.52F + 1.0F : 0.0F);
      }
   }

   private int IliIilliIi(class_1657 player) {
      try {
         class_634 var2 = Iiiilllliiilll.method_1562();
         if (var2 == null) {
            return -1;
         } else {
            class_640 var3 = var2.method_2871(player.method_5667());
            return var3 != null ? Math.max(0, var3.method_2959()) : -1;
         }
      } catch (Throwable var4) {
         return -1;
      }
   }

   private void iIIilIlIil(llllliilllli ctx, class_4587 font, class_332 t, IIliiIlllIliiIll m, boolean icons) {
      IlIllIllllIllIll var6 = ctx.IIIlIIlIllIIlIIlIl;
      float var7 = ctx.lIlIlIlIliIlIlIlIl[0];
      float var8 = ctx.IllIlIlIllllIlIlIl[0];
      float var9 = ctx.IiIlIIlIlliIlIIlIl;
      this.ilillIiill(font, var7, var8, ctx.llilIIlIlililIIlIl, var9);
      float var10 = 5.0F;
      if (!var6.illliillll.isEmpty()) {
         if (icons) {
            if (this.iIilliiIll == null) {
               this.iIilliiIll = new class_1799(class_1802.field_8288);
            }

            this.liIIiiiIIi(t, this.iIilliiIll, var10, (var8 - 9.0F) / 2.0F, 9.0F);
         }

         var10 += 10.5F;
         IilIililIi(m, font, var6.illliillll, var10, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(ctx.lIIiIIlIliIIiIIlIl > 0 ? 15909198 : 9080728, var9));
         var10 += m.iIlIlllllill(var6.illliillll) * 0.8F + 5.0F;
      }

      if (ctx.IIilIIlIllIilIIlIl) {
         float var11 = (var8 - 4.0F) / 2.0F;
         llilllililll.Iiilliiliiil();

         try {
            llilllililll.IiIlliIliiIl(font, IiIliliIli(5562506, var9), (double)var10, (double)var11, (double)(var10 + 4.0F), (double)(var11 + 4.0F), 2.0, 8.0);
         } finally {
            llilllililll.IIIilIIiiIIi();
         }

         var10 += 7.0F;
      }

      m.IliIlllilIi(var6.lilliillll, var10, this.lllIiillIi(0.0F, var8, 1.0F), IiIliliIli(ctx.IIilIIlIllIilIIlIl ? 5562506 : 15922423, var9));
      var10 += var6.IIiliillll;
      if (!var6.iilliillll.isEmpty()) {
         var10 += 5.0F;
         float var24 = var6.iIiliillll + 6.0F;
         float var12 = (var8 - 9.0F) / 2.0F;
         llilllililll.Iiilliiliiil();

         try {
            llilllililll.IiIlliIliiIl(
               font, IiIliliIli(var6.Ililiillll, 0.22F * var9), (double)var10, (double)var12, (double)(var10 + var24), (double)(var12 + 9.0F), 4.5, 8.0
            );
         } finally {
            llilllililll.IIIilIIiiIIi();
         }

         IilIililIi(m, font, var6.iilliillll, var10 + 3.0F, this.lllIiillIi(var12, 9.0F, 0.7F), 0.7F, IiIliliIli(var6.Ililiillll, var9));
         var10 += var24;
      }

      if (var6.lIiliillll > 0.0F) {
         var10 += 5.0F;
         if (ctx.iiilIIlIlIIIiIIlIl >= 0) {
            iiIlilIlIIllilIl.IliIlllilIi(
               var10,
               (var8 - 7.0F) / 2.0F,
               7.0F,
               7.0F,
               lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<"IliIlllilIi","WTEhA0JPFShKx6uPH5b7LxHqMpWMeORoaQgQKq8ubELiJg==">()),
               IiIliliIli(llIililIil(ctx.iiilIIlIlIIIiIIlIl), var9),
               font
            );
            var10 += 8.5F;
         }

         IilIililIi(m, font, var6.Iilliillll, var10, this.lllIiillIi(0.0F, var8, 0.82F), 0.82F, IiIliliIli(9080728, var9));
      }

      float var25 = var7 - 5.0F;
      iiIlilIlIIllilIl.IliIlllilIi(
         var25 - 7.0F, (var8 - 7.0F) / 2.0F, 7.0F, 7.0F, lIlIIiliIlIIil.Iilililiiili(), IiIliliIli(ctx.IiilIIlIlliilIIlIl, var9), font
      );
      var25 -= 8.5F;
      if (!var6.lllliillll.isEmpty()) {
         float var27 = m.iIlIlllllill(var6.lllliillll) * 0.8F;
         IilIililIi(m, font, var6.lllliillll, var25 - var27, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(15909198, var9));
         var25 -= var27 + 1.5F;
      }

      float var28 = m.iIlIlllllill(var6.Illliillll) * 0.8F;
      IilIililIi(m, font, var6.Illliillll, var25 - var28, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(ctx.IiilIIlIlliilIIlIl, var9));
   }

   private String lililiilil(class_1293 e) {
      int var2 = Math.max(0, Math.min(255, e.method_5578()));
      boolean var3 = e.method_48559() || e.method_5584() < 0;
      int var4 = var3 ? 0 : Math.min(1048575, e.method_5584() / 20);
      int var5 = var3 ? -1 - var2 : var2 << 20 | var4;
      String var6 = (String)this.lIIlliiIll.get(var5);
      if (var6 != null) {
         return var6;
      } else {
         String var7 = var2 > 0 ? IIiillIiil(var2 + 1) + IliIlllilIi<"IliIlllilIi","nW/6lMpYDnXsPB+4OASrx6+tjPTV+ZTWNsW4hUo=">() : "";
         String var8 = var3
            ? var7 + IliIlllilIi<"IliIlllilIi","+OTJmB2hTuY6CcLHMrwi1sTl5PQAwsqlw7Zsin8/">()
            : var7
               + var4 / 60
               + IliIlllilIi<"IliIlllilIi","Rwkh6U1TvgDpTEL0e7weuYErqMtqlXZfnSGY6MI=">()
               + (var4 % 60 < 10 ? IliIlllilIi<"IliIlllilIi","6wQfy+wK4GABXkGCAo0AwV1ou1TGdcMM6jdCqWU=">() : "")
               + var4 % 60;
         if (this.lIIlliiIll.size() > 512) {
            this.lIIlliiIll.clear();
         }

         this.lIIlliiIll.put(var5, var8);
         return var8;
      }
   }

   private void Ilillllill(llllliilllli t, int index, class_4587 matrices, class_332 ctx) {
      float var5 = t.IiIlIIlIlliIlIIlIl;
      float var6 = t.llIlIIlIlilIlIIlIl;
      IIliiIlllIliiIll var7 = CorzClient.fontManager.lIiiIiIlilli();
      this.IlilliiIll = (float)var7.IlIillIiilIi(0, 100) - 50.0F;
      if (t.iliiIIlIlIiiiIIlIl[3]) {
         if (t.liiiIIlIliiiiIIlIl[3]) {
            this.iIlIiIllIi(
               matrices,
               t.iIIIlIlIlIlIIlIlIl[3],
               t.llIIlIlIlilIIlIlIl[3],
               t.IiIIlIlIlliIIlIlIl[3],
               t.iiIIlIlIlIIlIlIlIl[3],
               t.IlIiIIlIlllIiIIlIl,
               t.ilIiIIlIlIiIiIIlIl,
               t.IiilIIlIlliilIIlIl,
               var5
            );
         } else {
            this.IIlIilIlIi(
               matrices,
               t.iIIIlIlIlIlIIlIlIl[3],
               t.llIIlIlIlilIIlIlIl[3],
               t.IiIIlIlIlliIIlIlIl[3],
               t.iiIIlIlIlIIlIlIlIl[3],
               t.IlIiIIlIlllIiIIlIl,
               t.ilIiIIlIlIiIiIIlIl,
               t.IiilIIlIlliilIIlIl,
               var5
            );
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         if (t.iliiIIlIlIiiiIIlIl[var8]) {
            boolean var9 = t.iIilIIlIlIlilIIlIl && !this.lIilliIill(index, t, var8);
            matrices.method_22903();
            ctx.method_51448().pushMatrix();

            try {
               matrices.method_46416(t.iIIIlIlIlIlIIlIlIl[var8], t.llIIlIlIlilIIlIlIl[var8], 0.0F);
               matrices.method_22905(var6, var6, 1.0F);
               ctx.method_51448().translate(t.iIIIlIlIlIlIIlIlIl[var8], t.llIIlIlIlilIIlIlIl[var8]);
               ctx.method_51448().scale(var6, var6);
               if (var8 == 0) {
                  this.iIIilIlIil(t, matrices, ctx, var7, var9);
               } else if (var8 == 1) {
                  this.illilIilil(t, matrices, ctx, var7, var9);
               } else {
                  this.IlIIillIIi(t, matrices, ctx, var7, var9);
               }
            } finally {
               ctx.method_51448().popMatrix();
               matrices.method_22909();
            }
         }
      }
   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1687 != this.iiiIliiIll.get()) {
         this.iiiIliiIll = new WeakReference<>(Iiiilllliiilll.field_1687);
         this.IiiIliiIll.clear();
         this.liiIliiIll.clear();
      }

      if (Iiiilllliiilll.field_1687 == null) {
         this.liiIliiIll.clear();
      } else {
         class_2663 var1;
         while ((var1 = this.liiIliiIll.poll()) != null) {
            class_1297 var2 = var1.method_11469(Iiiilllliiilll.field_1687);
            if (var2 instanceof class_1657) {
               class_1657 var3 = (class_1657)var2;
               if (var1.method_11470() == 3) {
                  this.IiiIliiIll.remove(var3.method_5667());
               } else {
                  iilIllIIiIll var4 = this.IiiIliiIll.computeIfAbsent(var3.method_5667(), k -> new iilIllIIiIll());
                  if (var4.IlIiIIIillIiIIIi != var3.method_5628()) {
                     var4.IlIiIIIillIiIIIi = var3.method_5628();
                     var4.ilIiIIIiIiIiIIIi = 0;
                  }

                  var4.ilIiIIIiIiIiIIIi++;
               }
            }
         }

         if (!this.IiiIliiIll.isEmpty()) {
            this.IiiIliiIll.entrySet().removeIf(en -> {
               class_1657 var1x = Iiiilllliiilll.field_1687.method_18470(en.getKey());
               return var1x != null && (var1x.method_29504() || var1x.method_6032() <= 0.0F);
            });
            if (this.IiiIliiIll.size() > 64) {
               this.IiiIliiIll.keySet().removeIf(id -> Iiiilllliiilll.field_1687.method_18470(id) == null);
            }
         }
      }
   }

   static {
      String[][] var0 = new String[][]{
         {
               IliIlllilIi<"IliIlllilIi","pJoN10a5nN0i0dmfzC3KKDpcopVmxtZjVJ2vDQYi7JPmQ7SGoiU=">(),
               IliIlllilIi<"IliIlllilIi","mJ9h5lt5skYbPbPwWW1kkq6OMmphwcctn7DJU1c=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","VHMdh+5VGDDlxTO7XtEdwhqRW5wUqDvwPdMWZG+mJrkNlZHdMldrVedhOtE=">(),
               IliIlllilIi<"IliIlllilIi","VsuERSEQNujXKrjD7DTD5otQjUQOd93m29G712H3">()
         },
         {
               IliIlllilIi<"IliIlllilIi","hl65/8xNnLq2ZgZXuF8C965jBgoGbFIpwYFeXZKiGkljw/ssUf+pRCLgfA==">(),
               IliIlllilIi<"IliIlllilIi","akmTJvhwfW9WcbpdWDcrxu1JGE6pzTp7yne1Tf5W">()
         },
         {
               IliIlllilIi<"IliIlllilIi","Ho6gtiKmttJ7tMlnI5YmQw90b8E2kcQ9LPGKQmAiefxo1orxC80j6DbcdQEOVOuj2w==">(),
               IliIlllilIi<"IliIlllilIi","Vf1RIAvuVVfpxeOZ6unI+iUIGuIMBxZHRnet4yMT">()
         },
         {
               IliIlllilIi<"IliIlllilIi","WFlc3RbPqh3/V4mG9YjNnjeOypB4+eBrJTM29SGTBzaXKoQZXg==">(),
               IliIlllilIi<"IliIlllilIi","h3InPk+9A6u944EQ17cCpR2y+d1Zxwkt6+W2mlw=">()
         },
         {IliIlllilIi<"IliIlllilIi","EyuQhGDKzgXLgpxYIiXpIS7rmTOuq6aCzIqPpXzYnWSJ">(), IliIlllilIi<"IliIlllilIi","UkIZnzosGAuibjMaDQGUB4L43M1Ihm3fiO8H3NhD">()},
         {
               IliIlllilIi<"IliIlllilIi","Dr8BsWA2uxN66irmQIgH/VcVLAesmb5YVYa82o7A2RVkBv/nrwg8mTCsrHTqdA==">(),
               IliIlllilIi<"IliIlllilIi","7jFf23HRdEBcZIRUu0qWgrh5HnneWT8IcUPojKz5">()
         },
         {IliIlllilIi<"IliIlllilIi","NH8+LPp7lhVnifTbqzQJWVzRsSpqd7+UyGMIuOMj6sIJ">(), IliIlllilIi<"IliIlllilIi","BTyvjOcW8LFnJK98ypuTCuWVvZxANs/3XFfZcC0p">()},
         {
               IliIlllilIi<"IliIlllilIi","PzVg3edg/St7DTQv+XnMzJwig7zTYJ/MvCJ75H4K58fV61Vgtkk=">(),
               IliIlllilIi<"IliIlllilIi","0V2KTGrP5fRWqeV5JRPqLqrzRypsfPA248P4nbo=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","OGym1TWnyOLfz9AerR0iIFykHKagpiezFf4lgB/PiSXXX3U=">(),
               IliIlllilIi<"IliIlllilIi","2t63BvAdReBTvH5jkF00iTB7vJKoUvJANxAbEAY=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","wtwBzuHwUyydjSuoTSGT+DA26j4lNolPaJLYP6ETghRNlg==">(),
               IliIlllilIi<"IliIlllilIi","PIhUr/CqSQdo3WF45q9dHP7nK35BG4rFJC0zvLM=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","Xu+VKtfTC+Z80QSHV71uNOk2PoDbXQsRYmoOqdI4k5LmvgIP">(),
               IliIlllilIi<"IliIlllilIi","fL3LAofsxGMYRJQulFPoVqQusTeqTlaF0Ax96UBO">()
         },
         {
               IliIlllilIi<"IliIlllilIi","1IXO9GSh3gljz6dKNQFnxlQISW9rJBzoEtpyC/0NT3SbxzE=">(),
               IliIlllilIi<"IliIlllilIi","6aihxRPflcj8xAH9KMkZ+yt7//8MXdvN66ZBrVd4">()
         },
         {
               IliIlllilIi<"IliIlllilIi","qp7c24mremLzlcMOCoUhHYL1FkJ9Ni2ahxsOCH8F+8tVMCM=">(),
               IliIlllilIi<"IliIlllilIi","2KYsCcEHlu+VjgE265Z92xPECZ6oDihIKNMirRTn">()
         },
         {
               IliIlllilIi<"IliIlllilIi","tOdTycIaqZJupbcjo8I3mjVqKldJFUNVZWPD9nanqlYFbrC/XSfu0/nByQ==">(),
               IliIlllilIi<"IliIlllilIi","HMY6l/4tZC1JAPLZsMbsrYlElEKkXeIFn1ZoCtM+">()
         },
         {
               IliIlllilIi<"IliIlllilIi","GoA8VS7iXFPcgtH38hHPvAvH81/ZH1a+OOx4u1rDsg7ST/rJO625rKY=">(),
               IliIlllilIi<"IliIlllilIi","kt2mtZbj28HyCl13NFsPr7Fwym2vQ33Eh0hIhGFm">()
         },
         {
               IliIlllilIi<"IliIlllilIi","JG77pcGafn/PJDssrvcrWfmPg3+z6fBijQNo9+qQBfE1Vx8+7znf3w==">(),
               IliIlllilIi<"IliIlllilIi","WXvlMAOW5emXzygviHBXydCZfTi52PFIbERqfmqn">()
         },
         {
               IliIlllilIi<"IliIlllilIi","lVD5XgqrMX6POhNorDMle8D5AUichag+eQNk6ljOchZD79hDaeE=">(),
               IliIlllilIi<"IliIlllilIi","bJqy0vmuG97tUKp6K5M2CudiKDXJp0eHJ7883GmN">()
         },
         {
               IliIlllilIi<"IliIlllilIi","cph57CHwjnhM33HxEUtEoE3Ds1etKEbAjjHA5xDuYHMMhmNCtv17">(),
               IliIlllilIi<"IliIlllilIi","B1vPJukj2qBIkrmxWGkR9BnJux7JJCnK5Hh6wzpg">()
         },
         {
               IliIlllilIi<"IliIlllilIi","gOM7ueUSXzkF/EI/eELRfiojSmOaepJ8KufNtJ2tGyos5EwgN4Vm">(),
               IliIlllilIi<"IliIlllilIi","4BQkNiU5gDUtRl0og8Q4zyw6CCM/nu1gPID8C50=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","3DF6yipR6boCBdxKvm77NwQcNEWu6B9KHLyRfJnFu7creISj0M03l3M=">(),
               IliIlllilIi<"IliIlllilIi","ZlemRB5XfEuXiP5HMXVvlN3pDo9KGRJYl1wQketv">()
         },
         {
               IliIlllilIi<"IliIlllilIi","ZhShE1wkUSZei0LH4Erj+KQInvoQMeklpgKSOi602FgL1Q==">(),
               IliIlllilIi<"IliIlllilIi","Q7RYsZYTAYzah9j3o99AWubfklpXJAl9mL14Qn8=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","DH8KqWvVrzS+eN6wkyctDxT1Ef3W3G27dlzJotBZKPLZuS5VBoiz">(),
               IliIlllilIi<"IliIlllilIi","RQpFUTsdQ1HObtUMUBPCg44qiYFpaDr6M0l67dIZ">()
         },
         {
               IliIlllilIi<"IliIlllilIi","3/XQ7bvkfDoTRKhUUQI5LhQnq9bwgs2luhesb/sojYi/bbVyTg==">(),
               IliIlllilIi<"IliIlllilIi","oSCCdIrXPV8dZ/Wp5iYVq6+V5Wbfz1H3vbQ6Hlw=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","qBuapOBNQuxqua2+RNl79llfdk13hs0DHMfFZz3C9SOzXik=">(),
               IliIlllilIi<"IliIlllilIi","wG2zl2oj6lCmX9xpQB7B+V9JpphUPbpLsNW2tRA=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","X+/YrnA4hJlc/J8IYh2maK2wCFUY4ePeb2q+reV9HjlFkbDk1kWzi/8=">(),
               IliIlllilIi<"IliIlllilIi","DRJh8IY7xgSsAoWcYzgrqmPKEV3hDOij0NzIYaie">()
         },
         {
               IliIlllilIi<"IliIlllilIi","3z70DbAsamU0Q2Qf9QnMnINzOSQtF47X3CzLmzzbai+KVf5Ifvs=">(),
               IliIlllilIi<"IliIlllilIi","Bp60A/lRPrYk/1tBHSynDRR2yZhggPwzgz0fqf7L">()
         },
         {IliIlllilIi<"IliIlllilIi","/Uwl4tcZZul6sjKAkGkPlepsd7SFyDOx+yDRI1lVb4mE">(), IliIlllilIi<"IliIlllilIi","MTff/DzdaB5iQUQ2ID0X25gFS20dkHYY6wi+7Kc+">()},
         {IliIlllilIi<"IliIlllilIi","CM7s6tr54ahfn4ntEa3oIKAQuoKVDSiKAyHq+Cqo5NSB">(), IliIlllilIi<"IliIlllilIi","LrcFTXjgZ+iU1By7j/FaT747u8EHSiZtezQzc181">()},
         {
               IliIlllilIi<"IliIlllilIi","lWRikmCNRZkhYP3fE9I+6enIahN68wZsrKOzeWeMI+MV33Og">(),
               IliIlllilIi<"IliIlllilIi","Hv05zhSjMK+cJnv+u4OREYoZs/sCuBljrPiSI0s=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","27oEDx1VqHKA3BEcAo4Xu7AlxKp9i2Mu+n4vekzq6ol09KWu6Q==">(),
               IliIlllilIi<"IliIlllilIi","rsglQ4bVtp3pukqUTAu8hwpX9aPvwLdRdpsGUrFV">()
         },
         {
               IliIlllilIi<"IliIlllilIi","ye+SUV0dUd/nNBadNm4oMRGrr72AzKD1Fq0eK1Rcm749P6dRfL9KJA==">(),
               IliIlllilIi<"IliIlllilIi","g4vKEFAdszJoyZ1q6QtFvGEZ/pQLA/twju24D9sa">()
         },
         {
               IliIlllilIi<"IliIlllilIi","k9AHrzzVyGnanWsH42yZQhmCo1M+FD9X34gmb3bO3ezvH+Ay">(),
               IliIlllilIi<"IliIlllilIi","64/WmJD5X+USV3rMhfORQiSRkPIEpadvc0uUNIdi">()
         },
         {
               IliIlllilIi<"IliIlllilIi","isQI0e33HEzAEG8MifBvOzHPWKMtp/5cPEG6q2WF21C6ZAVFOFA=">(),
               IliIlllilIi<"IliIlllilIi","Sk9chC8MwT8zGVGCKM8AkpidLtiYg445nVBKnwkA">()
         },
         {
               IliIlllilIi<"IliIlllilIi","h/kqMvbFensaT0+8vXc+fcvw67pHQUOpXR3Va2mGKfhQTio=">(),
               IliIlllilIi<"IliIlllilIi","DeT0C/NSk4SEHSQIn36A3SrlbA6AoQzjczMfpNw=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","RjJ5YhmME9U5jsRVjxyBaz6l/e8f3JRUvWNubegTRqVaSlXUdVI=">(),
               IliIlllilIi<"IliIlllilIi","66ydsU4/C7jjl0RhMHz3OcEJA7l/5iVVdBRszH8l">()
         },
         {IliIlllilIi<"IliIlllilIi","pB9bqoQYRkeXkXRqBE0DyMDY1bb9ATTCQhpdtseai9w=">(), IliIlllilIi<"IliIlllilIi","jAbwNTLTb55O4a7EcYNYAC2uaOOR4ynAB+0R15lN">()},
         {
               IliIlllilIi<"IliIlllilIi","9ncTzNrVydOaUCNcctFYIsIJdG3U0ntOlqumbyqIzsLfVdQL3rV7pL0naQ==">(),
               IliIlllilIi<"IliIlllilIi","qIi1S3TamTCUL+qeL4VY7JEto02QuSfwxBEu4PjJ">()
         },
         {
               IliIlllilIi<"IliIlllilIi","tpwiofPrMh1QDGptDb3BL6zi+92l4ZhZGl08tMyO2DGJK9DXqoc=">(),
               IliIlllilIi<"IliIlllilIi","AgSFw14YN82kkZcKe82JI+IvFtv3eVnjeFXyjyQ=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","z0Z9jRQFcN2GcuxIuV1gYMeRaUpa7e3zpwR2Vg2w2kPIMnc=">(),
               IliIlllilIi<"IliIlllilIi","T28lA1K5HSPCc7I5CwA4NPITa4En4QO70oMvDfk=">()
         },
         {
               IliIlllilIi<"IliIlllilIi","HDtgtjvXImrMSKSVlUwoA4vaxVUs8RxW89pimxotLeVdrxWmX5fACFQ=">(),
               IliIlllilIi<"IliIlllilIi","jJCYbE1Pn74zX2rNBkiHlZlZvcDEcRF22aaGHFHl">()
         },
         {
               IliIlllilIi<"IliIlllilIi","oCD63wL0NnbkjSMsvcHzB24m2wSwdSXXzUsVhPvuaRKx/kqXxxLhB/prlQ==">(),
               IliIlllilIi<"IliIlllilIi","7Y06LFPp3xpY+q9kU4C1X19l9uj/8gzORkjiV3sV">()
         }
      };

      for (int var1 = 0; var1 < var0.length; var1++) {
         IliIliiIll.put(var0[var1][0], var0[var1][1]);
         lliIliiIll.put(var0[var1][0], var1);
      }

      iIIlliiIll = new String[101];
      IlIlliiIll = new String[100];

      for (int var2 = 0; var2 <= 100; var2++) {
         iIIlliiIll[var2] = var2 + IliIlllilIi<"IliIlllilIi","xbDTA5D5O3Uewi//Q5Wm0QZKpSM92fTjix+0bVM=">();
      }

      for (int var3 = 0; var3 < 100; var3++) {
         IlIlliiIll[var3] = String.valueOf(var3);
      }

      llIlliiIll = new Color[512];
      ilIlliiIll = new int[512];
      liilliiIll = new String[0];
   }

   private static Color IiIliliIli(int rgb, float alpha01) {
      long var6 = 1657837092938034440L;
      long var8 = -5033166847584832272L;
      var6 ^= ((long)Math.max(0, Math.min(~745986699 * -1875962727 ^ 1144025771, Math.round(alpha01 * 255.0F))) << 32 ^ var6) & -1L << 32;
      var6 ^= (
            (long)(
                  (int)(var6 >>> 32) << ((-(707693014 >>> 15 | 707693014 << 17) << 11 | -(707693014 >>> 15 | 707693014 << 17) >>> 21) ^ -1654841478)
                     | rgb & ((~-103518186 << 21 | ~-103518186 >>> 11) ^ -35702130)
               )
               ^ var6
         )
         & -1L >>> 32;
      var8 ^= (
            (long)(
                     (int)var6 * (-(~(~1615876048 ^ 81)) ^ 26790350)
                        >>> (
                           (((905987337 >>> 5 | 905987337 << 27) - -63) * -252645135 << 17 | ((905987337 >>> 5 | 905987337 << 27) - -63) * -252645135 >>> 15)
                              ^ -1511103726
                        )
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      Color var5 = llIlliiIll[(int)(var8 >>> 32)];
      if (var5 == null || ilIlliiIll[(int)(var8 >>> 32)] != (int)var6) {
         var5 = new Color((int)var6, true);
         llIlliiIll[(int)(var8 >>> 32)] = var5;
         ilIlliiIll[(int)(var8 >>> 32)] = (int)var6;
      }

      return var5;
   }

   private float liilliiill(llllliilllli font, IIliiIlllIliiIll t) {
      IlIllIllllIllIll var3 = font.IIIlIIlIllIIlIIlIl;
      return var3.illliillll.isEmpty() ? 0.0F : 10.5F + t.iIlIlllllill(var3.illliillll) * 0.8F;
   }

   private boolean IIllllIlll(llllliilllli tickDelta, class_1657 t, float player) {
      double var4 = Illlilllli(t.field_6014, t.method_23317(), player);
      double var6 = Illlilllli(t.field_6036, t.method_23318(), player);
      double var8 = Illlilllli(t.field_5969, t.method_23321(), player);
      class_238 var10 = t.method_5829();
      double var11 = (var10.field_1320 - var10.field_1323) / 2.0;
      double var13 = (var10.field_1324 - var10.field_1321) / 2.0;
      double var15 = var10.field_1325 - var10.field_1322;
      float var17 = Float.MAX_VALUE;
      float var18 = Float.MAX_VALUE;
      float var19 = -Float.MAX_VALUE;
      float var20 = -Float.MAX_VALUE;
      int var21 = 0;

      for (int var22 = 0; var22 < 8; var22++) {
         double var23 = var4 + ((var22 & 1) == 0 ? -var11 : var11);
         double var25 = var6 + ((var22 & 2) == 0 ? 0.0 : var15);
         double var27 = var8 + ((var22 & 4) == 0 ? -var13 : var13);
         if (this.lilliiilli(var23, var25, var27)) {
            var21++;
            var17 = Math.min(var17, this.llilliiIll);
            var19 = Math.max(var19, this.llilliiIll);
            var18 = Math.min(var18, this.ililliiIll);
            var20 = Math.max(var20, this.ililliiIll);
         }
      }

      if (var21 < 2) {
         return false;
      } else {
         tickDelta.lIllIIlIliIllIIlIl = var17;
         tickDelta.IlllIIlIlllllIIlIl = var18;
         tickDelta.illlIIlIlIillIIlIl = var19;
         tickDelta.lillIIlIliillIIlIl = var20;
         return true;
      }
   }
}
