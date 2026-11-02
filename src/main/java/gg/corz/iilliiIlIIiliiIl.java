package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1802;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iilliiIlIIiliiIl extends ilIllIiIll {
   static final String iIlIilIlll = "Box";
   private final iiIiiilIIliiil lllIilIlll;
   private static final int ilIIilIlll = 256;
   static final String lIlIilIlll = "Block";
   private static final double llIIilIlll = 64.0;
   private static final int liIIilIlll = 3;
   private final iilliIlIIiliIl illIilIlll;
   private ExecutorService IliIilIlll;
   private final iiIiiilIIliiil lilIilIlll;
   private final AtomicBoolean lIiIilIlll;
   private volatile int iliIilIlll;
   private int lliIilIlll;
   private final Set<Long> iIiIilIlll;
   private final lliliIIiililiIIi IllIilIlll = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","RrUcjEbGCG6SZ9eFoiABAlM+XCoDcohzi5yAjN9tu1w=">(),
      IliIlllilIi<"IliIlllilIi","M0Nex+SnlG6N5l4GW05q7jKNt6YUGPnHUioTadicr4wszhtM0eZBoxK4NGNkstBsgbbGUROt2dL1ur1uZiZb5eB845lc55kn+QB/7PNP1AeXI4HBkskcDl/thUkkc7rvtzRmVxTKB8S8y2Q=">(),
      IliIlllilIi<"IliIlllilIi","i+IkfOcmlNFDtrpdsbVRcNDao47bx9HYhdyvuJR4goBe4eFSrsc6">(),
      IliIlllilIi<"IliIlllilIi","i+IkfOcmlNFDtrpdsbVRcNDao47bx9HYhdyvuJR4goBe4eFSrsc6">(),
      IliIlllilIi<"IliIlllilIi","LVUUOsrX9Vtc2YRlHJ7jiIJuvf108Ey24yF3ZOw6bwOl">(),
      IliIlllilIi<"IliIlllilIi","29xDdibvbDJZwJNQv3HOddY2Lhjve6SRrLHj0aVdZA==">()
   );
   static final String IIlIilIlll = "Block + Box";
   private static final int IiIIilIlll = 512;
   private static final int iiIIilIlll = 8192;
   private volatile List<lliiIliiliiIli> iilIilIlll;
   private final iiIiiilIIliiil IilIilIlll;
   private volatile List<class_2338> IIiIilIlll;

   private void iIlllIllll() {
      List var1 = this.iilIilIlll;
      if (!var1.isEmpty()) {
         int var2 = 0;

         for (lliiIliiliiIli var4 : var1) {
            long var5 = class_2338.method_10064((int)var4.IliIlllilIi(), (int)var4.liiiIIllIl(), (int)var4.iIlIlllllill());
            if (this.iIiIilIlll.add(var5) && var2 < 3 && Iiiilllliiilll.field_1724 != null) {
               String var7 = var4.IIIllIIliIIl()
                  ? (int)var4.IliIlllilIi()
                     + IliIlllilIi<"IliIlllilIi","GCKX1A1GMM7WV84Le4IXXjlt9i9lC5jqWz28FSU=">()
                     + (int)var4.liiiIIllIl()
                     + IliIlllilIi<"IliIlllilIi","GCKX1A1GMM7WV84Le4IXXjlt9i9lC5jqWz28FSU=">()
                     + (int)var4.iIlIlllllill()
                  : IliIlllilIi<"IliIlllilIi","dxPjvNWa2aCB/HcN+3NJt5pg1c/bqMeR0JrxErA=">()
                     + (int)((var4.IliIlllilIi() + var4.IilliliilIIi()) / 2.0)
                     + IliIlllilIi<"IliIlllilIi","GCKX1A1GMM7WV84Le4IXXjlt9i9lC5jqWz28FSU=">()
                     + (int)((var4.liiiIIllIl() + var4.lIiiIiIlilli()) / 2.0)
                     + IliIlllilIi<"IliIlllilIi","GCKX1A1GMM7WV84Le4IXXjlt9i9lC5jqWz28FSU=">()
                     + (int)((var4.iIlIlllllill() + var4.iliIiiliiiii()) / 2.0);
               Iiiilllliiilll.field_1724
                  .method_7353(
                     class_2561.method_43470(IliIlllilIi<"IliIlllilIi","Rxm7PYBZRgK11bt313dAAQvejYyBc0sg3xqIoiTs/eRcc0URBv9eSJRdq3k5/7SIsUVD+OV2h/A=">() + var7),
                     false
                  );
               var2++;
            }
         }

         if (this.iIiIilIlll.size() > 8192) {
            this.iIiIilIlll.clear();
         }
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         String var2 = this.IllIilIlll.Iilllilliill();
         boolean var3 = iilllIIill(var2);
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var5 = Iiiilllliiilll.field_1724.method_23317();
         double var7 = Iiiilllliiilll.field_1724.method_23318();
         double var9 = Iiiilllliiilll.field_1724.method_23321();
         class_4587 var11 = event.IliiiIIilliiiIIi;
         var11.method_22903();
         var11.method_22904(-var4.field_1352, -var4.field_1351, -var4.field_1350);
         Matrix4f var12 = var11.method_23760().method_23761();
         int var13 = lIilliIill(255, 60, 255, 90);
         int var14 = lIilliIill(235, 80, 220, 255);
         int var15 = lIilliIill(150, 60, 150, 200);
         int var16 = lIilliIill(200, 255, 60, 220);
         boolean var17 = this.IilIilIlll.Iilllilliill();

         for (lliiIliiliiIli var19 : this.iilIilIlll) {
            double var20 = (var19.IliIlllilIi() + var19.IilliliilIIi()) / 2.0;
            double var22 = (var19.liiiIIllIl() + var19.lIiiIiIlilli()) / 2.0;
            double var24 = (var19.iIlIlllllill() + var19.iliIiiliiiii()) / 2.0;
            double var26 = var20 - var5;
            double var28 = var22 - var7;
            double var30 = var24 - var9;
            boolean var32 = var26 * var26 + var28 * var28 + var30 * var30 <= 4096.0;
            if (!var19.IIIllIIliIIl() || var3) {
               int var33;
               float var34;
               float var35;
               if (var19.IIIllIIliIIl()) {
                  var33 = var13;
                  var34 = 3.0F;
                  var35 = 0.01F;
               } else {
                  var33 = var32 ? var14 : var15;
                  var34 = var32 ? 2.0F : 1.2F;
                  var35 = -0.4F;
               }

               iIiiIIilIliiIIil.iIIIlIlIIl(
                  var12,
                  (float)var19.IliIlllilIi() - var35,
                  (float)var19.liiiIIllIl() - var35,
                  (float)var19.iIlIlllllill() - var35,
                  (float)var19.IilliliilIIi() + var35,
                  (float)var19.lIiiIiIlilli() + var35,
                  (float)var19.iliIiiliiiii() + var35,
                  var33,
                  var34
               );
            }

            if (var17) {
               Iillllilll.IIlllIlliIll(var20, var22, var24, var16, 1.2F);
            }
         }

         for (class_1297 var37 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var37 instanceof class_1542) {
               class_1542 var38 = (class_1542)var37;
               if (var38.method_6983().method_31574(class_1802.field_22019)) {
                  class_238 var21 = var38.method_5829();
                  iIiiIIilIliiIIil.iIIIlIlIIl(
                     var12,
                     (float)var21.field_1323,
                     (float)var21.field_1322,
                     (float)var21.field_1321,
                     (float)var21.field_1320,
                     (float)var21.field_1325,
                     (float)var21.field_1324,
                     var13,
                     3.0F
                  );
                  if (var17) {
                     Iillllilll.IIlllIlliIll(var38.method_23317(), var38.method_23318(), var38.method_23321(), var16, 1.2F);
                  }
               }
            }
         }

         var11.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   @Override
   protected void Iilililiiili() {
      if (this.IliIilIlll != null) {
         this.IliIilIlll.shutdownNow();
      }

      this.IliIilIlll = null;
      this.iilIilIlll = List.of();
      this.IIiIilIlll = List.of();
      this.iIiIilIlll.clear();
   }

   private static List<lliiIliiliiIli> IIllllIlll(List<class_2338> positions) {
      boolean[] var1 = new boolean[positions.size()];
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < positions.size(); var3++) {
         if (!var1[var3]) {
            int var4 = Integer.MAX_VALUE;
            int var5 = Integer.MAX_VALUE;
            int var6 = Integer.MAX_VALUE;
            int var7 = Integer.MIN_VALUE;
            int var8 = Integer.MIN_VALUE;
            int var9 = Integer.MIN_VALUE;
            ArrayDeque var10 = new ArrayDeque();
            var10.add(var3);
            var1[var3] = true;

            while (!var10.isEmpty()) {
               int var11 = (Integer)var10.poll();
               class_2338 var12 = (class_2338)positions.get(var11);
               var4 = Math.min(var4, var12.method_10263());
               var5 = Math.min(var5, var12.method_10264());
               var6 = Math.min(var6, var12.method_10260());
               var7 = Math.max(var7, var12.method_10263() + 1);
               var8 = Math.max(var8, var12.method_10264() + 1);
               var9 = Math.max(var9, var12.method_10260() + 1);

               for (int var13 = 0; var13 < positions.size(); var13++) {
                  if (!var1[var13]) {
                     class_2338 var14 = (class_2338)positions.get(var13);
                     int var15 = Math.max(
                        Math.abs(var12.method_10263() - var14.method_10263()),
                        Math.max(Math.abs(var12.method_10264() - var14.method_10264()), Math.abs(var12.method_10260() - var14.method_10260()))
                     );
                     if (var15 <= 2) {
                        var1[var13] = true;
                        var10.add(var13);
                     }
                  }
               }
            }

            var2.add(new lliiIliiliiIli((double)var4, (double)var5, (double)var6, (double)var7, (double)var8, (double)var9, true));
         }
      }

      return var2;
   }

   static boolean Iillllilll(String mode) {
      return !IliIlllilIi<"IliIlllilIi","29xDdibvbDJZwJNQv3HOddY2Lhjve6SRrLHj0aVdZA==">().equals(mode);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = System.identityHashCode(Iiiilllliiilll.field_1687);
         if (var1 != this.iliIilIlll) {
            this.iliIilIlll = var1;
            this.iilIilIlll = List.of();
            this.IIiIilIlll = List.of();
         }

         if (this.lilIilIlll.Iilllilliill()) {
            this.iIlllIllll();
         } else if (!this.iIiIilIlll.isEmpty()) {
            this.iIiIilIlll.clear();
         }

         if (++this.lliIilIlll >= 20) {
            this.lliIilIlll = 0;
            ExecutorService var2 = this.IliIilIlll;
            if (var2 != null && !var2.isShutdown()) {
               if (this.lIiIilIlll.compareAndSet(false, true)) {
                  double var3 = Iiiilllliiilll.field_1724.method_23317();
                  double var5 = Iiiilllliiilll.field_1724.method_23318();
                  double var7 = Iiiilllliiilll.field_1724.method_23321();
                  ArrayList var9 = new ArrayList();
                  int var10 = (Integer)Iiiilllliiilll.field_1690.method_42503().method_41753();
                  class_1923 var11 = Iiiilllliiilll.field_1724.method_31476();

                  for (int var12 = var11.field_9181 - var10; var12 <= var11.field_9181 + var10; var12++) {
                     for (int var13 = var11.field_9180 - var10; var13 <= var11.field_9180 + var10; var13++) {
                        if (Iiiilllliiilll.field_1687.method_8393(var12, var13)) {
                           var9.add(Iiiilllliiilll.field_1687.method_8497(var12, var13));
                        }
                     }
                  }

                  boolean var14 = this.lllIilIlll.Iilllilliill();
                  int var15 = this.illIilIlll.Iilllilliill();
                  var2.submit(() -> {
                     try {
                        iiiIlillIIIllill var11x = iiiIlIIIll(var9, var14, var15, var3, var5, var7);
                        if (var1 == this.iliIilIlll) {
                           this.iilIilIlll = var11x.IliIlllilIi();
                           this.IIiIilIlll = var11x.liiiIIllIl();
                        }
                     } catch (Throwable var15x) {
                     } finally {
                        this.lIiIilIlll.set(false);
                     }
                  });
               }
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.iilIilIlll = List.of();
      this.IIiIilIlll = List.of();
      this.lliIilIlll = 0;
      this.lIiIilIlll.set(false);
      this.iIiIilIlll.clear();
      this.IliIilIlll = Executors.newSingleThreadExecutor(task -> {
         Thread var1 = new Thread(task, IliIlllilIi<"IliIlllilIi","3k/XdQSuEsP3nObvSciwpDme/6QFh+L0QRFV6rIUhToExb3JxcnpGryuH5uGTNqAyw==">());
         var1.setDaemon(true);
         return var1;
      });
   }

   private static iiiIlillIIIllill iiiIlIIIll(List<class_2818> chunks, boolean ghostCap, int playerX, double exposedOnly, double playerZ, double playerY) {
      HashMap var9 = new HashMap();

      for (class_2818 var11 : chunks) {
         var9.put(var11.method_12004().method_8324(), var11);
      }

      ArrayList var24 = new ArrayList();
      ArrayList var25 = new ArrayList();
      ArrayList var12 = new ArrayList();
      int var13 = 0;
      int var14 = 0;

      for (class_2818 var16 : chunks) {
         class_2826[] var17 = var16.method_12006();
         int var18 = var16.method_32891();
         class_1923 var19 = var16.method_12004();

         for (int var20 = 0; var20 < var17.length; var20++) {
            class_2826 var21 = var17[var20];
            if (var21 != null && !var21.method_38292() && var21.method_19523(state -> state.method_27852(class_2246.field_22109))) {
               int var22 = var18 + var20 << 4;
               List var23 = IlIllllIll(var21, var19.method_8326(), var22, var19.method_8328());
               var13 += var23.size();
               if (var23.isEmpty()) {
                  var25.add(
                     new lliiIliiliiIli(
                        (double)var19.method_8326(),
                        (double)var22,
                        (double)var19.method_8328(),
                        (double)(var19.method_8326() + 16),
                        (double)(var22 + 16),
                        (double)(var19.method_8328() + 16),
                        false
                     )
                  );
               } else {
                  if (ghostCap) {
                     var23.removeIf(pos -> !ilIllIiIll(var9, pos.method_10263(), pos.method_10264(), pos.method_10260()));
                  }

                  var14 += var23.size();
                  if (!var23.isEmpty()) {
                     var12.addAll(var23);
                     var24.addAll(IIllllIlll(var23));
                  }
               }
            }
         }
      }

      Comparator var26 = Comparator.comparingDouble(
         playerXx -> lIIlliIIll(
               (playerXx.IliIlllilIi() + playerXx.IilliliilIIi()) / 2.0,
               (playerXx.liiiIIllIl() + playerXx.lIiiIiIlilli()) / 2.0,
               (playerXx.iIlIlllllill() + playerXx.iliIiiliiiii()) / 2.0,
               exposedOnly,
               playerZ,
               playerY
            )
      );
      var24.sort(var26);
      var25.sort(var26);
      var12.sort(
         Comparator.comparingDouble(
            playerYx -> lIIlliIIll(
                  (double)playerYx.method_10263() + 0.5,
                  (double)playerYx.method_10264() + 0.5,
                  (double)playerYx.method_10260() + 0.5,
                  exposedOnly,
                  playerZ,
                  playerY
               )
         )
      );
      ArrayList var27 = new ArrayList();
      var27.addAll(var24.subList(0, Math.min(256, var24.size())));
      var27.addAll(var25.subList(0, Math.min(Math.max(0, playerX), var25.size())));
      List var28 = List.copyOf(var12.subList(0, Math.min(512, var12.size())));
      return new iiiIlillIIIllill(List.copyOf(var27), var28, var13, var14, var25.size());
   }

   private static List<class_2338> IlIllllIll(class_2826 originZ, int originY, int section, int originX) {
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            for (int var7 = 0; var7 < 16; var7++) {
               if (originZ.method_12254(var7, var5, var6).method_27852(class_2246.field_22109)) {
                  var4.add(new class_2338(originY + var7, section + var5, originX + var6));
               }
            }
         }
      }

      return var4;
   }

   static boolean iilllIIill(String mode) {
      return !IliIlllilIi<"IliIlllilIi","LVUUOsrX9Vtc2YRlHJ7jiIJuvf108Ey24yF3ZOw6bwOl">().equals(mode);
   }

   private static boolean ilIllIiIll(Map<Long, class_2818> x, int z, int byPos, int y) {
      return liIlliiIll(x, z + 1, byPos, y)
         || liIlliiIll(x, z - 1, byPos, y)
         || liIlliiIll(x, z, byPos + 1, y)
         || liIlliiIll(x, z, byPos - 1, y)
         || liIlliiIll(x, z, byPos, y + 1)
         || liIlliiIll(x, z, byPos, y - 1);
   }

   public int lllllillll() {
      return this.iilIilIlll.size();
   }

   private static boolean liIlliiIll(Map<Long, class_2818> z, int y, int byPos, int x) {
      class_2818 var4 = (class_2818)z.get(class_1923.method_8331(y >> 4, x >> 4));
      if (var4 == null) {
         return false;
      } else {
         class_2680 var5 = var4.method_8320(new class_2338(y, byPos, x));
         return var5.method_26215() || var5.method_27852(class_2246.field_10164);
      }
   }

   private static int lIilliIill(int r, int g, int b, int a) {
      return (r & ((~(-240665592 * -69) ^ 63) - -121 ^ 573943406)) << (-(1111476077 << 19 | 1111476077 >>> 13) ^ -996807142)
         | (g & (((-967948486 << 11 | -967948486 >>> 21) << 11 | (-967948486 << 11 | -967948486 >>> 21) >>> 21) - -75 ^ -827223261))
            << (
               ((-631179845 * -991146299 << 3 | -631179845 * -991146299 >>> 29) >>> 31 | (-631179845 * -991146299 << 3 | -631179845 * -991146299 >>> 29) << 1)
                  ^ -1107218844
            )
         | (b & (((-1537765068 ^ 49 ^ 127) << 21 | (-1537765068 ^ 49 ^ 127) >>> 11) ^ 794069517))
            << (((2033799852 >>> 1 | 2033799852 << 31) ^ 23) * 1205604855 ^ 1564516031)
         | a & (-220476746 * -71 ^ -1526020231);
   }

   public iilliiIlIIiliiIl() {
      super(IliIlllilIi<"IliIlllilIi","jYM2LWMNX8yPtq5hKTE9gwENeg5/Qj9xhCV0YjCzFvsABakPX3K5tOJfBos=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lllIilIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","nSb8w7jmyr6hb23QkleeMnkfDYRDmJ6lAluNHXakeEtfhHa++gGKJg==">(),
         IliIlllilIi<"IliIlllilIi","JdRtFF7H1igPzqcFgwQj7oVLDUzc4lFTvUaTEh2218jAeEA/eqQFJ45SNNCTT/HaArom+u77/u7Wx3tcA6DzUq9J+8uqdxeQIDRxRlcm1apfnnyIVYy1ibhZ7n7GzaiOJMAH8NRAgS64a98=">(),
         true
      );
      this.illIilIlll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","QhqZv0yBE2Arg6tlxvF5xwQO9MXVt/s3hbM193tWXLVxoGAbp3RcwW0=">(),
         IliIlllilIi<"IliIlllilIi","FT9OAw/Q/XNsBME2KrYfGVP5CUrgUI/DgsYaUtbGAJ3RZc3JpCVCWMKE1sFevHbbpMUvo3iAaVayaCtHhYfx/aHBlonIPt1kFRy3g77d03PmdgHooj0GcmsSrzsVB6YuqwL3rsQ=">(),
         8,
         1,
         64
      );
      this.IilIilIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","4E07W13bxB9zbfPSf+01vHR0zDceHT1YrObTFUpspXBMi6s=">(),
         IliIlllilIi<"IliIlllilIi","Hab0DebFgWskzgnJ5QRLPC7NNRzy7YjNZDWZ4moE01RFdmzKeJz27j4BgUBsxujNyA6xsR1DOaMwOftexEqhZRmIRA==">(),
         true
      );
      this.lilIilIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","xQ0TLer5Qc/OLYj00RZuik/+wCYvHgZlu5CUxKJCqdH2xCnAaGT3tuha">(),
         IliIlllilIi<"IliIlllilIi","jh3qQPjXB2Tnq4cudXuVSV5mcdO6WRWWpVVCde4RjrQUh5DTualpa0CxD0JZ0ifXR9G++Xikl68LIToUKe1z6f1NY0z95N7OtkVamta1xtPj36fz9ZqA2aRCu6BD2DpdA9oBin3yi1d7Yw==">(),
         true
      );
      this.iilIilIlll = List.of();
      this.IIiIilIlll = List.of();
      this.lIiIilIlll = new AtomicBoolean();
      this.iIiIilIlll = new HashSet<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IllIilIlll, this.lllIilIlll, this.illIilIlll, this.IilIilIlll, this.lilIilIlll});
   }

   private static double lIIlliIIll(double px, double y, double pz, double x, double z, double py) {
      double var12 = px - x;
      double var14 = y - z;
      double var16 = pz - py;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }
}
