package gg.corz;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class lIIIliiliIIIliil {
   private final iIiIlIliIl IliIlIilil;
   private int ilIllIilil;
   private static final int lIiIlIilil = -2;
   private IillIiIllillIiIl iIIllIilil;
   private static final int iilIlIilil = 48;
   private final Map<class_2338, Integer> IiiIlIilil;
   private static final float IIiIlIilil = 32.0F;
   private final Set<Long> liiIlIilil;
   private static final int illIlIilil = 120;
   private int llIllIilil;
   private int IIIllIilil;
   private boolean iiIllIilil;
   private static final int IilIlIilil = 300;
   private IllliiIilllliiIi lIIllIilil;
   private static final int iIlIlIilil = 24;
   private static final int IllIlIilil = 6;
   private static final int lllIlIilil = 50;
   private static final String[] iIiIlIilil = new String[]{
      iiiIlIIIll<"iiiIlIIIll","iZPwKw30Ioc5d3r62fRu8VFBIIaLeeqoSikgSzDIE5xjQ2Q=">(),
      iiiIlIIIll<"iiiIlIIIll","eishw6uBL6ojUqjKOMiQs3qwr92GMdHUdlllvy7gpk1l">(),
      iiiIlIIIll<"iiiIlIIIll","ws7BZv2uDBOSI27HgtGLNbVusGJMAFaS9dcDzphIvT4UsQ==">(),
      iiiIlIIIll<"iiiIlIIIll","gLAbkFJW3Sl75ib0nCfMc9UwDhJio0SHPgi8qQPjZK7MPg==">(),
      iiiIlIIIll<"iiiIlIIIll","YYPf/LwDFjjZ+k/UxT9UBaVf4QXGdAFKyRvzcdyDCiql">(),
      iiiIlIIIll<"iiiIlIIIll","DtJeLnTHndCDo9SZH54wKm+7YuxRWD8rPmnsA1qBTRej">(),
      iiiIlIIIll<"iiiIlIIIll","F5p9TIweBQFuWhL7WzVXlc4RbCaX0tcQAnRy0cC0+uF67Q4=">(),
      iiiIlIIIll<"iiiIlIIIll","aHt1HsXuxssOBw+KoORSIMGa0dpxWuR3Xb32JTbRqF26">(),
      iiiIlIIIll<"iiiIlIIIll","GrwozDSpPq9YdLiGrT9o5Mt1KHDmsAydXF9UyYauUQ==">(),
      iiiIlIIIll<"iiiIlIIIll","bs+4U6HsenAPkXBIBhsQFQIvDN2kI7i3ExKdngujxas=">(),
      iiiIlIIIll<"iiiIlIIIll","d4YAO/3e06zA19+wcCT+CAwn5+XxKKDm00pY44I1C6Y=">(),
      iiiIlIIIll<"iiiIlIIIll","M4XvWBsaT0qpFJP7MmiftzpA1DyL5YnssZkcIbnYA3jDpw==">(),
      iiiIlIIIll<"iiiIlIIIll","Z1dpMxEXRAr2u9VWM0QgDa97513mATVpoeyOiKsH1FPN">(),
      iiiIlIIIll<"iiiIlIIIll","y5Rhsv9uZV+9Meeen5abGR+DxZsJWKEZDxwM7LqCRLQCeJPa">(),
      iiiIlIIIll<"iiiIlIIIll","ugc7mhVNW71ggmQT6KESYuGRzqCX1WJ8Dt3MNfseSXDNlw==">(),
      iiiIlIIIll<"iiiIlIIIll","TF+nQM69im9TjNlZ60StehOt0osR6IlPO+MzzmlEnXVobSE=">(),
      iiiIlIIIll<"iiiIlIIIll","ffuLcYjm3a6Aydn/v0JQC58ASJPwKrzxUnaWprV4X0w=">(),
      iiiIlIIIll<"iiiIlIIIll","splDiBY7d6NP+N3QwwzE+SbpPiZMd5QhO1bsCJQ6m3dyvA==">(),
      iiiIlIIIll<"iiiIlIIIll","sRtfuTtYDvjMw6vOE6c0aYfxhxn5KrQIFsmALtPZrg==">()
   };
   private boolean liIllIilil;
   private long IiIllIilil;
   private int IlIllIilil;
   private static final int lilIlIilil = 4;
   private boolean IIlllIilil;
   private final Map<class_2338, Integer> iliIlIilil = new HashMap<>();
   private final ArrayDeque<class_2338> iiiIlIilil;
   private final class_310 lliIlIilil;
   private int lIlllIilil;

   static boolean llIIlilIIl(class_746 p, Predicate<class_1799> test) {
      long var5 = -2865639546305162188L;
      if (p == null) {
         return false;
      } else {
         class_1661 var2 = p.method_31548();

         for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 36; var7 += 4294967296L) {
            class_1799 var4 = var2.method_5438((int)(var7 >>> 32));
            if (!var4.method_7960() && test.test(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean IIIllIIliIIl(class_746 p, class_1937 w) {
      if (p != null && w != null) {
         class_2338 var3 = p.method_24515();
         return !p.method_5771() && !lllIIlilillIIlil.liiiIIllIl(w, var3) && !lllIIlilillIIlil.liiiIIllIl(w, var3.method_10084())
            ? p.method_5869() && p.method_5669() < p.method_5748() / 3
            : true;
      } else {
         return false;
      }
   }

   private class_2338 Iilllilliill(class_746 w, class_1937 p) {
      long var16 = -4376150599403957786L;
      long var14 = -9043719714482868302L;
      class_2338 var3 = w.method_24515();
      class_2338 var4 = null;
      double var5 = Double.MAX_VALUE;

      for (class_2338 var8 : this.iiiIlIilil) {
         var14 ^= ((long)(var8.method_10264() - var3.method_10264()) << 32 ^ var14) & -1L << 32;
         if ((int)(var14 >>> 32) <= 2 && (int)(var14 >>> 32) >= -3) {
            double var10 = lllIlIIlillIlIIl.IIiIllIiIl(w, var8);
            if (!(var10 > 64.0) && IiIlliIliiIl(p, var8)) {
               double var12 = var10 + (double)Math.abs((int)(var14 >>> 32)) * 2.0 + (double)IIillIiliIil(p, var8) * 6.0;
               if (var12 < var5) {
                  var5 = var12;
                  var4 = var8;
               }
            }
         }
      }

      if (var4 != null) {
         return var4;
      } else {
         for (long var19 = var14 ^ (1L ^ var14) & -1L >>> 32; (int)var19 <= 3; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            for (var16 ^= ((long)(-((int)var19)) << 32 ^ var16) & -1L << 32; (int)(var16 >>> 32) <= (int)var19; var16 += 4294967296L) {
               for (var19 ^= ((long)(-((int)var19)) << 32 ^ var19) & -1L << 32; (int)(var19 >>> 32) <= (int)var19; var19 += 4294967296L) {
                  if (Math.max(Math.abs((int)(var16 >>> 32)), Math.abs((int)(var19 >>> 32))) == (int)var19) {
                     for (var16 ^= (1L ^ var16) & -1L >>> 32; (int)var16 >= -1; var16 ^= (var16 ^ var16 + (long)-1) & -1L >>> 32) {
                        class_2338 var11 = var3.method_10069((int)(var16 >>> 32), (int)var16, (int)(var19 >>> 32));
                        if (IiIlliIliiIl(p, var11)) {
                           double var18 = lllIlIIlillIlIIl.IIiIllIiIl(w, var11) + (double)Math.abs((int)var16) * 2.0 + (double)IIillIiliIil(p, var11) * 6.0;
                           if (var18 < var5) {
                              var5 = var18;
                              var4 = var11;
                           }
                        }
                     }
                  }
               }
            }

            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   lIIIliiliIIIliil(iIiIlIliIl engine, class_310 mc) {
      this.IiiIlIilil = new HashMap<>();
      this.liiIlIilil = new HashSet<>();
      this.iiiIlIilil = new ArrayDeque<>();
      this.IliIlIilil = engine;
      this.lliIlIilil = mc;
   }

   private void iliIiiliiiii() {
      if (this.IIIllIilil > 0) {
         this.IIIllIilil--;
      }

      if (!this.iliIlIilil.isEmpty()) {
         this.iliIlIilil.replaceAll((v, k) -> k - 1);
         this.iliIlIilil.values().removeIf(v -> v <= 0);
      }

      if (++this.ilIllIilil >= 200) {
         this.ilIllIilil = 0;
         this.IiiIlIilil.clear();
         this.liiIlIilil.clear();
      }
   }

   private boolean Iiilliiliiil(class_746 reach, class_1937 p, class_243 eye, double w) {
      class_2338 var6 = this.lIIllIilil.IliIlllilIi();
      if (this.iliIlIilil.containsKey(var6)) {
         return false;
      } else if (!liilIlIiiiilIlIi.iIlIlllllill(p.method_8316(this.lIIllIilil.liiiIIllIl()))) {
         return false;
      } else if (!p.method_8320(var6).method_45474()) {
         return false;
      } else if (reach.method_5829().method_994(new class_238(var6))) {
         return false;
      } else {
         return eye.method_1025(this.iIIllIilil.iIlIlllllill()) > w * w ? false : liilIlIiiiilIlIi.IlIillIiilIi(p, this.iIIllIilil.IliIlllilIi());
      }
   }

   int IiIIlliIIl(class_746 p, Predicate<class_1799> test) {
      long var6 = -4104921325146038139L;
      if (p == null) {
         return -1;
      } else {
         class_1661 var3 = p.method_31548();

         for (var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
            class_1799 var5 = var3.method_5438((int)(var6 >>> 32));
            if (!var5.method_7960() && test.test(var5)) {
               return (int)(var6 >>> 32);
            }
         }

         for (long var10 = var6 ^ (38654705664L ^ var6) & -1L << 32; (int)(var10 >>> 32) < 36; var10 += 4294967296L) {
            class_1799 var8 = var3.method_5438((int)(var10 >>> 32));
            if (!var8.method_7960() && test.test(var8)) {
               if (!lIlIiIliIlIiIl.Illlllllilll()) {
                  lIlIiIliIlIiIl.iIlIlllllill(() -> this.iiIIlIIlIl(test), true);
               }

               return -2;
            }
         }

         return -1;
      }
   }

   private boolean IIIilIIiiIIi(class_746 p, class_1937 reach, class_243 w, double eye) {
      long var16 = 5889663942336501118L;
      IllliiIilllliiIi var6 = this.lIIllIilil;
      IillIiIllillIiIl var7 = this.iIIllIilil;
      class_2338 var8 = var6.IliIlllilIi();
      String var9 = var6.IilliliilIIi()
         ? iiiIlIIIll<"iiiIlIIIll","Dlu3thEVid2r6hxbjGe7/MKu4RhRLX3e/4nhfkXdagA=">()
         : iiiIlIIIll<"iiiIlIIIll","9hI/NaFk0I7RXoIIeiT638CyQOY5o1bOr0JoIJZarXRj">();
      this.IliIlIilil.IIlllIlliIll().iIlIlllllill();
      this.IilliliilIIi();
      this.IliIlIilil.IiIiliIiiiIi();
      class_1268 var10 = this.Iilililiiili(p, reach, var6);
      class_239 var11 = p.method_5745(eye, 0.0F, false);
      if (var10 != null && this.IIIllIilil <= 0 && liilIlIiiiilIlIi.Ililllililil(var11, var7.IliIlllilIi(), var7.liiiIIllIl(), var8)) {
         class_3965 var12 = (class_3965)var11;
         class_2338 var13 = var12.method_17777().method_10093(var12.method_17780()).method_10062();
         if (var13.equals(var8) && !p.method_5829().method_994(new class_238(var13)) && liilIlIiiiilIlIi.IlIillIiilIi(reach, var12.method_17777())) {
            var16 ^= ((long)reach.method_8316(var13).method_15771() << 32 ^ var16) & -1L << 32;
            class_1269 var15 = this.lliIlIilil.field_1761.method_2896(p, var10, var12);
            if (var15.method_23665()) {
               p.method_6104(var10);
            }

            this.IIIllIilil = 2;
            this.IliIlIilil.IIlllIlliIll().iIiliiiIIi = 2;
            if (this.IiiIlIilil.merge(var13, 1, Integer::sum) >= 4) {
               this.IiiIlIilil.remove(var13);
               this.iliIlIilil.put(var13, 300);
               this.IliIlIilil
                  .Iiilliiliiil(
                     iiiIlIIIll<"iiiIlIIIll","4Es+xHs2OQ0vgBlN/XiZxM8HNS+UgA3u5U5y7XT94k+C2UCCxDndmRsgNdyvaVoaupRbZ1GiXFVgZigL3Ac5Mr4D">()
                        + var13.method_23854()
                        + iiiIlIIIll<"iiiIlIIIll","0iRY2eb7QB3+reDhkWHlEn0XPPVCkKxzlVR4AUp50uodazuch0L0gOhd">()
                  );
            }

            this.IliIlIilil.IlIillIiilIi(var13, (boolean)((int)(var16 >>> 32)));
            this.IliIlIilil
               .Iiilliiliiil(
                  iiiIlIIIll<"iiiIlIIIll","3laHyB+J21aY+8xhxp8MnSyc71vYkMCCKgB+AVkq/9gMqXM+">()
                     + var9
                     + iiiIlIIIll<"iiiIlIIIll","ga049gRzUXPeoe3CCk2pC3ArWPHlm7x7+hVGEiU=">()
                     + IiIiliIiiiIi(var6)
                     + iiiIlIIIll<"iiiIlIIIll","FOJepNvQqhGHcD+uyk4i4qG/qO3wn0snUtfdkHvVwN0=">()
                     + var13.method_23854()
               );
            this.liiiIIllIl();
            this.lIiiIiIlilli();
            return true;
         }
      }

      float[] var18 = IIlilIliiIli(w, var7.iIlIlllllill());
      float var19 = Math.abs(class_3532.method_15393(var18[0] - p.method_36454()));
      float var14 = Math.abs(var18[1] - p.method_36455());
      Illillliilli(p, var18);
      if (var10 == null) {
         this.IliIlIilil
            .Iiilliiliiil(
               iiiIlIIIll<"iiiIlIIIll","X8qpaJq5TRP6vc8szT8WlHD/Pv3GOG0AfBPwZ1lcQr+GydetSOTigoQ4+GYQN9ioHFFRhmcyu9pU3at4e9qnu43O2e2oKTMCDH0Aw07cdtM=">() + var9
            );
         if (++this.IlIllIilil > 50) {
            this.IlIillIiilIi(var6, var7);
         }

         return true;
      } else if (var19 < 1.2F && var14 < 1.2F && ++this.llIllIilil > 6) {
         this.liiIlIilil.add(liilIlIiiiilIlIi.Iiilliiliiil(var8, var7.liiiIIllIl()));
         this.liiiIIllIl();
         return true;
      } else if (++this.IlIllIilil > 50) {
         this.IlIillIiilIi(var6, var7);
         return true;
      } else {
         this.IliIlIilil
            .Iiilliiliiil(
               iiiIlIIIll<"iiiIlIIIll","nERj706GST57ydNuxY5y41STqz4wqiedOCSYbCQQuaLYMHzctw==">()
                  + var9
                  + iiiIlIIIll<"iiiIlIIIll","ga049gRzUXPeoe3CCk2pC3ArWPHlm7x7+hVGEiU=">()
                  + IiIiliIiiiIi(var6)
                  + iiiIlIIIll<"iiiIlIIIll","FOJepNvQqhGHcD+uyk4i4qG/qO3wn0snUtfdkHvVwN0=">()
                  + var8.method_23854()
            );
         return true;
      }
   }

   private void iiIIlIIlIl(Predicate<class_1799> test) {
      long var6 = 2551382847482536074L;
      class_746 var2 = this.lliIlIilil.field_1724;
      if (var2 != null && this.lliIlIilil.field_1761 != null && var2.field_7512 == var2.field_7498) {
         class_1661 var3 = var2.method_31548();

         for (var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
            class_1799 var5 = var3.method_5438((int)(var6 >>> 32));
            if (!var5.method_7960() && test.test(var5)) {
               return;
            }
         }

         for (long var10 = var6 ^ (38654705664L ^ var6) & -1L << 32; (int)(var10 >>> 32) < 36; var10 += 4294967296L) {
            class_1799 var8 = var3.method_5438((int)(var10 >>> 32));
            if (!var8.method_7960() && test.test(var8)) {
               this.lliIlIilil.field_1761.method_2906(var2.field_7498.field_7763, (int)(var10 >>> 32), lIlIliIlIl(var3), class_1713.field_7791, var2);
               return;
            }
         }
      }
   }

   private void lIiiIiIlilli() {
      if (this.iiIllIilil) {
         this.iiIllIilil = false;
         this.IliIlIilil.IIlllIlliIll().IliliiiIIi = false;
      }
   }

   private static int IIillIiliIil(class_1937 w, class_2338 c) {
      long var5 = 3982056297228837237L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 <= 1; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         class_2338 var4 = c.method_10086((int)var5);
         if (lllIIlilillIIlil.liiiIIllIl(w, var4.method_10095())) {
            var5 += 4294967296L;
         }

         if (lllIIlilillIIlil.liiiIIllIl(w, var4.method_10072())) {
            var5 += 4294967296L;
         }

         if (lllIIlilillIIlil.liiiIIllIl(w, var4.method_10078())) {
            var5 += 4294967296L;
         }

         if (lllIIlilillIIlil.liiiIIllIl(w, var4.method_10067())) {
            var5 += 4294967296L;
         }
      }

      if (lllIIlilillIIlil.liiiIIllIl(w, c.method_10086(2))) {
         var5 += 4294967296L;
      }

      return (int)(var5 >>> 32);
   }

   private void liiiIIllIl() {
      this.lIIllIilil = null;
      this.iIIllIilil = null;
      this.IlIllIilil = 0;
      this.llIllIilil = 0;
   }

   private class_1268 Iilililiiili(class_746 t, class_1937 p, IllliiIilllliiIi w) {
      long var6 = 3196179142767009169L;
      class_1661 var4 = t.method_31548();
      if (!w.IilliliilIIi()) {
         if (IllIllllIl(t.method_6079())) {
            return class_1268.field_5810;
         }

         var6 ^= ((long)this.IiIIlliIIl(t, lIIIliiliIIIliil::IllIllllIl) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) >= 0) {
            var4.method_61496((int)(var6 >>> 32));
            return class_1268.field_5808;
         }

         if ((int)(var6 >>> 32) == -2) {
            return null;
         }
      }

      var6 ^= ((long)this.IIiilIiiiIii(t, w.IilliliilIIi(), this.liIllIilil) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) < 0) {
         return (int)(var6 >>> 32) == -1 && liilIlIiiiilIlIi.Iliilliiilii(t.method_6079(), w.IilliliilIIi()) >= 0 ? class_1268.field_5810 : null;
      } else {
         if (var4.method_67532() != (int)(var6 >>> 32)) {
            var4.method_61496((int)(var6 >>> 32));
         }

         return class_1268.field_5808;
      }
   }

   public void IliIlllilIi() {
      this.iliIlIilil.clear();
      this.IiiIlIilil.clear();
      this.liiIlIilil.clear();
      this.iiiIlIilil.clear();
      this.IIIllIilil = 0;
      this.liIllIilil = false;
      this.iiIllIilil = false;
      this.liiiIIllIl();
      if (this.IIlllIilil && this.lliIlIilil.field_1690 != null) {
         this.lliIlIilil.field_1690.field_1904.method_23481(false);
      }

      this.IIlllIilil = false;
      this.lIlllIilil = 0;
   }

   private static float Illlllllilll(double v) {
      if (Math.abs(v) < 0.12) {
         return 0.0F;
      } else {
         return v > 0.0 ? 1.0F : -1.0F;
      }
   }

   private static float[] IIlilIliiIli(class_243 eye, class_243 aim) {
      double var2 = aim.field_1352 - eye.field_1352;
      double var4 = aim.field_1351 - eye.field_1351;
      double var6 = aim.field_1350 - eye.field_1350;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)(Math.toDegrees(Math.atan2(var6, var2)) - 90.0);
      float var11 = class_3532.method_15363((float)(-Math.toDegrees(Math.atan2(var4, var8))), -90.0F, 90.0F);
      return new float[]{var10, var11};
   }

   private void IlIlllIlilIl(class_746 p, class_1937 w) {
      if (p.method_24828() && !p.method_5771() && !p.method_5869()) {
         class_2338 var3 = p.method_24515().method_10062();
         if (IiIlliIliiIl(w, var3)) {
            if (!var3.equals(this.iiiIlIilil.peekFirst())) {
               this.iiiIlIilil.remove(var3);
               this.iiiIlIilil.addFirst(var3);

               while (this.iiiIlIilil.size() > 48) {
                  this.iiiIlIilil.removeLast();
               }
            }
         }
      }
   }

   static boolean IllIllllIl(class_1799 s) {
      return s != null && !s.method_7960() && s.method_7909() == class_2246.field_10258.method_8389();
   }

   private boolean Ililllililil(class_746 p, class_1937 w) {
      long var16 = 8724196266243074170L;
      long var18 = 8005586083687835214L;
      double var3 = p.method_55754();
      class_243 var5 = p.method_33571();
      if (this.lIIllIilil != null && !this.Iiilliiliiil(p, w, var5, var3)) {
         this.liiiIIllIl();
      }

      if (this.lIIllIilil == null) {
         List var6 = liilIlIiiiilIlIi.IIlllIlliIll(w, p.method_24515(), p.method_5829(), var5, p.method_5828(1.0F));
         if (var6.isEmpty()) {
            return false;
         }

         var16 ^= ((long)this.Iliilliiilii(p, true) << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)this.Iliilliiilii(p, false) ^ var16) & -1L >>> 32;
         double var9 = (var3 + 1.0) * (var3 + 1.0);
         class_238 var11 = p.method_5829().method_1014(3.0);
         var18 ^= (0L ^ var18) & -1L << 32;

         for (IllliiIilllliiIi var14 : var6) {
            if (!this.iliIlIilil.containsKey(var14.IliIlllilIi())
               && (var14.IilliliilIIi() ? (int)(var16 >>> 32) != 0 : (int)var16 != 0)
               && !(var5.method_1025(class_243.method_24953(var14.IliIlllilIi())) > var9)
               && (var14.IilliliilIIi() || var14.iIlIlllllill() != IllIIIillllIIIil.lIiIiIIIil)
               && (var14.IilliliilIIi() || var14.iIlIlllllill() != IllIIIillllIIIil.IIiIiIIIil || var11.method_994(new class_238(var14.IliIlllilIi())))) {
               var18 += 4294967296L;
               if ((int)(var18 >>> 32) > 24) {
                  break;
               }

               IillIiIllillIiIl var15 = liilIlIiiiilIlIi.IIillIiliIil(w, var5, var3, var14.IliIlllilIi(), this.liiIlIilil);
               if (var15 != null) {
                  this.lIIllIilil = var14;
                  this.iIIllIilil = var15;
                  this.IlIllIilil = 0;
                  this.llIllIilil = 0;
                  break;
               }
            }
         }

         if (this.lIIllIilil == null) {
            this.Iiiiliiiiiii(p, var6);
            this.lIiiIiIlilli();
            return false;
         }
      }

      return this.IIIilIIiiIIi(p, w, var5, var3);
   }

   private void Iiiiliiiiiii(class_746 targets, List<IllliiIilllliiIi> p) {
      long var6 = -7150904384314052352L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (IllliiIilllliiIi var5 : p) {
         if (var5.IilliliilIIi()) {
            var6 ^= (4294967296L ^ var6) & -1L << 32;
            break;
         }
      }

      if ((int)(var6 >>> 32) != 0 && !this.Iliilliiilii(targets, true)) {
         long var8 = System.currentTimeMillis();
         if (var8 - this.IiIllIilil >= 15000L) {
            this.IiIllIilil = var8;
            this.IliIlIilil
               .llliiillii(
                  iiiIlIIIll<"iiiIlIIIll","F09b5fefC45//O397zOxlUpWq6ne2aWQQYgnUK0XEmhWYIPK04Gx1BMHBiIrdzeH5Zf3+PVoFnLDE2laLSrDoiscsOxSCsgrOe+7Mz+AtSAT8kxEE+GGUAC7SBcyqH58BMnSLkwCYiCEjUKf">()
               );
         }
      }
   }

   private static void Illillliilli(class_746 p, float[] want) {
      float var2 = p.method_36454();
      float var3 = class_3532.method_15393(want[0] - var2);
      float var4 = Math.abs(var3) <= 2.0F ? var3 : class_3532.method_15363(var3 * 0.6F, -32.0F, 32.0F);
      p.method_36456(var2 + var4);
      float var5 = p.method_36455();
      float var6 = want[1] - var5;
      float var7 = Math.abs(var6) <= 2.0F ? var6 : class_3532.method_15363(var6 * 0.6F, -32.0F, 32.0F);
      p.method_36457(class_3532.method_15363(var5 + var7, -90.0F, 90.0F));
   }

   boolean Iliilliiilii(class_746 p, boolean lava) {
      if (p == null) {
         return false;
      } else if (lava || !IllIllllIl(p.method_6079()) && !llIIlilIIl(p, lIIIliiliIIIliil::IllIllllIl)) {
         return liilIlIiiiilIlIi.Iliilliiilii(p.method_6079(), lava) >= 0 ? true : llIIlilIIl(p, lavax -> liilIlIiiiilIlIi.Iliilliiilii(lavax, lava) >= 0);
      } else {
         return true;
      }
   }

   private void IilliliilIIi() {
      this.IliIlIilil.IIlllIlliIll().IliliiiIIi = true;
      this.iiIllIilil = true;
   }

   private void IlIillIiilIi(IllliiIilllliiIi t, IillIiIllillIiIl pl) {
      this.iliIlIilil.put(t.IliIlllilIi(), 120);
      this.liiIlIilil.add(liilIlIiiiilIlIi.Iiilliiliiil(t.IliIlllilIi(), pl.liiiIIllIl()));
      this.IliIlIilil
         .Iiilliiliiil(
            iiiIlIIIll<"iiiIlIIIll","QyAsPX9Krns1BM0diNqUu1SbUYuV11TkDtzYBc9ykFdoLyaGSlmHTjXGOzkz7RUbbLy7DHAF/A==">()
               + t.IliIlllilIi().method_23854()
               + iiiIlIIIll<"iiiIlIIIll","ur107twBtiMMKU5FgdxH4F6QPPlkyepX0x6DUKjP4mO+mk3tiIjtIPH0bHtXn9PYdvZuqQ==">()
         );
      this.liiiIIllIl();
   }

   private static int lIlIliIlIl(class_1661 inv) {
      long var3 = -1802013442522900557L;

      for (var3 ^= (0L ^ var3) & -1L << 32; (int)(var3 >>> 32) < 9; var3 += 4294967296L) {
         if (inv.method_5438((int)(var3 >>> 32)).method_7960()) {
            return (int)(var3 >>> 32);
         }
      }

      for (var3 ^= (34359738368L ^ var3) & -1L << 32; (int)(var3 >>> 32) >= 0; var3 += -4294967296L) {
         class_1799 var2 = inv.method_5438((int)(var3 >>> 32));
         if (var2.method_7909() instanceof class_1747 && !IllIllllIl(var2)) {
            return (int)(var3 >>> 32);
         }
      }

      for (long var8 = var3 ^ (34359738368L ^ var3) & -1L << 32; (int)(var8 >>> 32) >= 0; var8 += -4294967296L) {
         class_1799 var5 = inv.method_5438((int)(var8 >>> 32));
         if (!var5.method_7963() && !illIlIilIl(var5) && (int)(var8 >>> 32) != inv.method_67532()) {
            return (int)(var8 >>> 32);
         }
      }

      return 8;
   }

   private int IIiilIiiiIii(class_746 p, boolean urgent, boolean lava) {
      long var10 = -3457616325897156513L;
      long var12 = 3472832895994274281L;
      long var14 = -8936324455824449185L;
      class_1661 var4 = p.method_31548();
      var10 ^= (-4294967296L ^ var10) & -1L << 32;
      var10 ^= ~var10 & -1L >>> 32;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var12 >>> 32) < 9) {
         var12 ^= ((long)liilIlIiiiilIlIi.Iliilliiilii(var4.method_5438((int)(var12 >>> 32)), urgent) ^ var12) & -1L >>> 32;
         if ((int)var12 > (int)var10) {
            var10 ^= ((long)((int)var12) ^ var10) & -1L >>> 32;
            var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
         }

         var12 += 4294967296L;
      }

      if ((int)var10 >= 2) {
         return (int)(var10 >>> 32);
      } else {
         var12 ^= (-4294967296L ^ var12) & -1L << 32;
         var12 ^= (9L ^ var12) & -1L >>> 32;

         while ((int)var12 < 36) {
            var12 ^= ((long)Math.max((int)(var12 >>> 32), liilIlIiiiilIlIi.Iliilliiilii(var4.method_5438((int)var12), urgent)) << 32 ^ var12) & -1L << 32;
            var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
         }

         if ((int)(var12 >>> 32) > (int)var10 && (!lava || (int)(var10 >>> 32) < 0)) {
            var12 ^= ((long)((int)(var12 >>> 32)) ^ var12) & -1L >>> 32;
            var14 ^= ((long)this.IiIIlliIIl(p, want -> liilIlIiiiilIlIi.Iliilliiilii(want, urgent) >= lavax) << 32 ^ var14) & -1L << 32;
            if ((int)(var14 >>> 32) >= 0 || (int)(var14 >>> 32) == -2) {
               return (int)(var14 >>> 32);
            }
         }

         return (int)(var10 >>> 32);
      }
   }

   private static String IiIiliIiiiIi(IllliiIilllliiIi t) {
      return switch (t.iIlIlllllill()) {
         case lilIiIIIil -> iiiIlIIIll<"iiiIlIIIll","2fD5zzUMdG4jSuJTnzUlWT/NQZFHZt6z+SNdAfkUhFX4lg==">();
         case iilIiIIIil -> iiiIlIIIll<"iiiIlIIIll","mLhRp+dHHbqEEpsABjmUZnj5Z98lvNZ3oeLC39PkbMZbjuY41iwhTWONYei34w==">();
         case IIiIiIIIil -> iiiIlIIIll<"iiiIlIIIll","79JfeAe95CdFEs7jGbHPJyewjkCflSRPv3CBQ7skmp4=">();
         case lIiIiIIIil -> iiiIlIIIll<"iiiIlIIIll","3hoaquEjEfosbxcrf1IatUh5zMFfSplIMZkrGID9iTUpk7tve60=">();
      };
   }

   static boolean illIlIilIl(class_1799 s) {
      long var6 = 6833848677393809890L;
      if (s != null && !s.method_7960()) {
         String var1 = s.method_7909().method_7876().toLowerCase();
         String[] var2 = iIiIlIilil;
         var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

         for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            String var5 = var2[(int)var9];
            if (var1.contains(var5)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean iIlIlllllill() {
      long var4 = 5992182142239310295L;
      class_746 var1 = this.lliIlIilil.field_1724;
      class_638 var2 = this.lliIlIilil.field_1687;
      if (var1 != null && var2 != null) {
         this.iliIiiliiiii();
         this.IlIlllIlilIl(var1, var2);
         var4 ^= ((long)this.IIIllIIliIIl(var1, var2) << 32 ^ var4) & -1L << 32;
         this.liIllIilil = (int)(var4 >>> 32) != 0 || var1.method_5809();
         if ((int)(var4 >>> 32) != 0) {
            this.IIIIllIIIl();
            this.liiiIIllIl();
            if (this.IIlllIlliIll(var1, var2)) {
               return true;
            }
         }

         if (this.IliIlIilil.IiIlliIliiIl().liliIIiliiiliIIili && this.Ililllililil(var1, var2)) {
            this.IIIIllIIIl();
            return true;
         } else {
            this.lIiiIiIlilli();
            return this.iIIIlIlIIl(var1);
         }
      } else {
         return false;
      }
   }

   private static boolean IiIlliIliiIl(class_1937 w, class_2338 c) {
      return !lllIIlilillIIlil.IIIllIIliIIl(w, c) ? false : !lllIIlilillIIlil.iIlIlllllill(w, c.method_10084());
   }

   private boolean iIIIlIlIIl(class_746 p) {
      long var4 = 8507449112722854895L;
      if (!this.IliIlIilil.IiIlliIliiIl().lliiIIiliiliiIIili) {
         if (this.IIlllIilil) {
            this.IIlllIilil = false;
            this.lliIlIilil.field_1690.field_1904.method_23481(false);
         }

         return false;
      } else {
         var4 ^= ((long)p.method_7344().method_7586() << 32 ^ var4) & -1L << 32;
         if (!this.IIlllIilil && (int)(var4 >>> 32) <= 10 && this.IiIIlliIIl(p, lIIIliiliIIIliil::illIlIilIl) >= 0) {
            this.IIlllIilil = true;
         }

         if (!this.IIlllIilil) {
            return false;
         } else if ((int)(var4 >>> 32) >= 20) {
            this.IIlllIilil = false;
            this.lliIlIilil.field_1690.field_1904.method_23481(false);
            return false;
         } else {
            var4 ^= ((long)this.IiIIlliIIl(p, lIIIliiliIIIliil::illIlIilIl) ^ var4) & -1L >>> 32;
            if ((int)var4 == -2 && ++this.lIlllIilil <= 100) {
               this.lliIlIilil.field_1690.field_1904.method_23481(false);
               this.IliIlIilil.IIlllIlliIll().iIlIlllllill();
               this.IliIlIilil
                  .Iiilliiliiil(
                     iiiIlIIIll<"iiiIlIIIll","fmmpCx72lWn/w5a9mlflESFYfP5eBSBiiKTEM3+Q9mekPGC1yYxrFcHB4XJdbiA5Xsf/ptyKVOigcfwi75KXVBGa">()
                        + (int)(var4 >>> 32)
                        + iiiIlIIIll<"iiiIlIIIll","kHzTU4hgExc8oC2aagekFN/q5MiK3IuJTqC+pvWwgkVYYjA=">()
                  );
               return true;
            } else {
               this.lIlllIilil = 0;
               if ((int)var4 < 0) {
                  this.IIlllIilil = false;
                  this.lliIlIilil.field_1690.field_1904.method_23481(false);
                  return false;
               } else {
                  p.method_31548().method_61496((int)var4);
                  this.lliIlIilil.field_1690.field_1904.method_23481(true);
                  this.IliIlIilil.IIlllIlliIll().iIlIlllllill();
                  this.IliIlIilil
                     .Iiilliiliiil(
                        iiiIlIIIll<"iiiIlIIIll","it3jITFm8FX8qJrk/9ceT5m5r1RhlwSMDUOZ2UNZOyuG0Zgf">()
                           + (int)(var4 >>> 32)
                           + iiiIlIIIll<"iiiIlIIIll","kHzTU4hgExc8oC2aagekFN/q5MiK3IuJTqC+pvWwgkVYYjA=">()
                     );
                  return true;
               }
            }
         }
      }
   }

   private boolean IIlllIlliIll(class_746 w, class_1937 p) {
      long var19 = 4764225269072151755L;
      class_2338 var3 = this.Iilllilliill(w, p);
      if (var3 == null) {
         return false;
      } else {
         this.IliIlIilil.IiIiliIiiiIi();
         double var4 = (double)var3.method_10263() + 0.5 - w.method_23317();
         double var6 = (double)var3.method_10260() + 0.5 - w.method_23321();
         double var8 = Math.toRadians((double)w.method_36454());
         double var10 = Math.sin(var8);
         double var12 = Math.cos(var8);
         double var14 = var6 * var12 - var4 * var10;
         double var16 = var6 * var10 + var4 * var12;
         this.iiIllIilil = false;
         this.IliIlIilil.IIlllIlliIll().IliliiiIIi = false;
         this.IliIlIilil.IIlllIlliIll().IliIlllilIi(Illlllllilll(var14), Illlllllilll(var16), true, false);
         var19 ^= ((long)(!w.method_5771() && !lllIIlilillIIlil.liiiIIllIl(p, w.method_24515()) ? 0 : 1) << 32 ^ var19) & -1L << 32;
         this.IliIlIilil
            .Iiilliiliiil(
               (
                     (int)(var19 >>> 32) != 0
                        ? iiiIlIIIll<"iiiIlIIIll","yQt5eH8BqHrXjzoWnuQWZ6M2qkGXmMmyRvnVP+QlCbIbItw=">()
                        : iiiIlIIIll<"iiiIlIIIll","NkWalTv7jDN0n6r9l1AV4W66IWbt0qTPg53H40xBJNjl1dlymBTloHKcoZYpDA==">()
                  )
                  + iiiIlIIIll<"iiiIlIIIll","0NwZknauahHjS8Z3r9IAeNIga1i8sJvDE5g8R39HFtNZ0obN4PK8OkHOTBAaoY6w">()
                  + var3.method_23854()
            );
         return true;
      }
   }

   private void IIIIllIIIl() {
      if (this.IIlllIilil) {
         this.IIlllIilil = false;
         this.lIlllIilil = 0;
         if (this.lliIlIilil.field_1690 != null) {
            this.lliIlIilil.field_1690.field_1904.method_23481(false);
         }
      }
   }
}
