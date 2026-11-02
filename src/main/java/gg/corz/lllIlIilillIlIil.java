package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import org.joml.Matrix4f;

public class lllIlIilillIlIil extends ilIllIiIll {
   private static final int iiliiiIIil = 6;
   private final iiIiiilIIliiil IIliiiIIil;
   private static final int iIIIIIlIil = 40;
   private boolean lIlIIIlIil;
   private static final int lliiiiIIil = 4;
   private static final int lIiiiiIIil = 1;
   private final iiIiiilIIliiil liIiiiIIil;
   private final iilliIlIIiliIl iIliiiIIil;
   private static final double IiliiiIIil = 2.0;
   private static final int IlIIIIlIil = 10;
   private List<IiIIliiliIIlii> iiIIIIlIil;
   private final Long2ObjectOpenHashMap<Illlliilllllliil> llIIIIlIil;
   private static final int iliiiiIIil = 5;
   private static final long liiiiiIIil = 12000L;
   private final LongOpenHashSet IiIIIIlIil;
   private final iIIlIIIiIlIlIIIi ilIIIIlIil;
   private static final int iiiiiiIIil = 400;
   private final iiIiiilIIliiil lIliiiIIil;
   private static final int IIIIIIlIil = 3;
   private final iiIiiilIIliiil IiIiiiIIil;
   private static final int liliiiIIil = 16;
   private static final int lIIIIIlIil = 200;
   private static final int IIiiiiIIil = 0;
   private static final int iIiiiiIIil = 2;
   private final iilliIlIIiliIl llIiiiIIil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","8sVkF02QkL3ZPf9WKK1/GMLm7muKgFdoGFyEZtuHsGbLUY3E2OyP">(),
      IliIlllilIi<"IliIlllilIi","c8Bhof/CvS6jsv6ZoQcZa93yJcdM5Oz3MoCRoM5E5F5tJBt5vsExwEIkmQTp+aVh2mEV71UW+Su/ixNVJFf98IFG0UP5x+rMmi5ODAPkQSAaEIW3wcYiU227fofrR/+urqyF/jvYKLMga1NE0ZWLAQ8M46/veb0=">(),
      3,
      1,
      10
   );
   private final iilliIlIIiliIl IlliiiIIil;
   private static final int IiiiiiIIil = 6;
   private List<IiIiIIlliIiIIl> liIIIIlIil;
   private final iiIiiilIIliiil iiIiiiIIil;
   private static final double illiiiIIil = 6.0;
   private int IIlIIIlIil;
   private final iiIiiilIIliiil ilIiiiIIil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","bfqJU25GV2r7BE63exnXSXXD8kjrKa8MYrneFzXrvNp72QQ0">(),
      IliIlllilIi<"IliIlllilIi","oN2OmtOY5H7NZVkzmQYIwm5mS7jw9zb8aBLavk5g9A2sOJIu7s7IsTtNmEPG/kWhSEFUz5zs3PBu/fY+s4Bxe117IAOzdZ3RiJzGd9FovlhxKoYBYr3XxuehGpEkThul">(),
      true
   );
   private static final int IliiiiIIil = 3;
   private final lliliIIiililiIIi llliiiIIil;
   private static final int IlIiiiIIil = 5;
   private int iIlIIIlIil;

   private static boolean Iillllilll(class_2826[] y, int lz, class_2680 st, int lx, int sections, int bottomY) {
      long var9 = -26037944413196832L;
      class_2248 var6 = lllllillll(y, lz, lx, sections + 1, bottomY);
      if (var6 != class_2246.field_9993 && var6 != class_2246.field_10463) {
         var9 ^= ((long)ilillIiill(y, lz, lx, sections, bottomY, -1, class_2246.field_9993, class_2246.field_10463) << 32 ^ var9) & -1L << 32;
         var9 ^= (
               (long)(
                     st.method_27852(class_2246.field_9993)
                           && st.method_28498(class_2741.field_12517)
                           && st.method_11654(class_2741.field_12517) == ((--377928548 * -23 >>> 3 | --377928548 * -23 << 29) * -1643291835 ^ 1582713433)
                        ? 1
                        : 0
                  )
                  ^ var9
            )
            & -1L >>> 32;
         return (int)var9 != 0 && (int)(var9 >>> 32) >= (((1123728949 ^ 1) << 11 | (1123728949 ^ 1) >>> 21) ^ -705584609)
            || (int)(var9 >>> 32) >= ((-1831072948 * -1090785345 - -21 >>> 11 | -1831072948 * -1090785345 - -21 << 21) ^ 959416194);
      } else {
         return false;
      }
   }

   private static boolean iIlllIllll(class_2248 b) {
      return b == class_2246.field_27160
         || b == class_2246.field_27161
         || b == class_2246.field_27162
         || b == class_2246.field_27163
         || b == class_2246.field_27164;
   }

   private void ilIllIiIll(class_2818 chunk, long key) {
      Illlliilllllliil var4;
      try {
         var4 = this.liIlliiIll(chunk, chunk.method_12004());
      } catch (Throwable var6) {
         var4 = null;
      }

      Illlliilllllliil var5 = var4 != null ? (Illlliilllllliil)this.llIIIIlIil.put(key, var4) : (Illlliilllllliil)this.llIIIIlIil.remove(key);
      if (var5 == null ? var4 != null : !var5.IliIlllilIi(var4)) {
         this.lIlIIIlIil = true;
      }
   }

   private void IlIllllIll() {
      this.llIIIIlIil.clear();
      this.ilIIIIlIil.liiiIIllIl();
      this.IiIIIIlIil.clear();
      this.liIIIIlIil = List.of();
      this.iiIIIIlIil = List.of();
      this.IIlIIIlIil = 0;
      this.lIlIIIlIil = false;
      this.iIlIIIlIil = -1;
   }

   public lllIlIilillIlIil() {
      super(IliIlllilIi<"IliIlllilIi","I9ANy5MWQh+1cxFkxKWChBTE/zuWkCXEEY0SfZvkDRUJkVE0WHfIjOV2350=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IiIiiiIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","rKlCTN4B2q+hCIp1+BjOeNbVBXYkvb5CDDwIX1pKUK4=">(),
         IliIlllilIi<"IliIlllilIi","zkHxpzNrqgP5k38Y/HbZBYeSjkRFbQzZOTFDzQXkVVCGxKLNewiux084DSVbJTy1ElVg9Sxx/xVuIL9nOI6G9R0elcycZQ==">(),
         true
      );
      this.liIiiiIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","c+DsAnOepnL1yaL0HV7wATgOBlnLQ+p/WUqoQdbK6W31AQ==">(),
         IliIlllilIi<"IliIlllilIi","JHZgscLvawLabw22fGnhpsNPeuFltsy5cj2sCaMHpp+Nv6+VqEV7KEWaGgATZVw/rh51ZkF3Ufzi2HI=">(),
         true
      );
      this.iiIiiiIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Ni/Ja6S8NjPmM8G29RLmuzoC18ECxK0yn6LmKtzaq587aoM=">(),
         IliIlllilIi<"IliIlllilIi","ymkGwBrGeRpVBeJcBcbfqlPB+2A7TokR5LjtbO+oFwEiwo4lECl35Ca/LLWGpusc1Wu+UG4NQ61suGGtc1Dl28hbLA==">(),
         true
      );
      this.IIliiiIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","XT4asxgdnzdKyso1C8s0mBFNoygySFzUkpD7glNzM9Y9">(),
         IliIlllilIi<"IliIlllilIi","CFyaX+Ih/fgjiixwhk/ouGaFYiZkrosw1cRWfKTYVklGUrv3TbB5kHCgF00fLDwFBfds7iYa8N6lZbdf8NoUyRuFasA=">(),
         true
      );
      this.lIliiiIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","hc7itlGyGa9GB2N2UgAclTGmk4pv6Qx2xk8x6RGrqdGjpgRdTA==">(),
         IliIlllilIi<"IliIlllilIi","r97Bd1kbKAWgoQlwbd7r21hiv3KV4SFyfCG2D5LRC2SSwZfAgMQ3TCVLUvby0TKWrVEl+OPldY2Zhtwdhpua0SuC/PlGADOcfoMgSg==">(),
         true
      );
      this.iIliiiIIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","+uWrjYd/sQEl7y1oQX784tcIB10xaEcPYOpq/yPhs85Npyak">(),
         IliIlllilIi<"IliIlllilIi","6pEyyMQomqPdsdKx/nGbNsum/hp1mVecXtYHGFQtBj3PqnlsknivDAhLHIOiOrkXv/3VGf4xdKgESCgiD1MFXs9eM2DfG0c=">(),
         100,
         -64,
         320
      );
      this.IlliiiIIil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","A2NHz7EoGfP0OFQfYiKW7VPrIGxDSSxASOPG4nbheyGqyXE=">(),
         IliIlllilIi<"IliIlllilIi","E9pI1CCIFkzManVTwgmJ4+G5srRMmk9aGpgCQIjHZ2KvKPhinJNnMawTvNMY5aWAAq138ez6d7iV3Mh40BtYyXXG9u25DtG3">(),
         90,
         0,
         255
      );
      this.llliiiIIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","0Ya6/qOyyCW8Tu7ztgEZum42IYZXkUvv5qsh+qV4OC7Cverh4vxwoO4=">(),
         IliIlllilIi<"IliIlllilIi","6IY+rgjs4jzaObd0wlGvToNFK/YyuZyr33Afcuo+U9EaAvLbIk8Zh2CRoYA/4T2Uqu4mQTSSQgXRhK6nTEgdqeu+ESva44RjOTiOrYCNlJJ2eA==">(),
         IliIlllilIi<"IliIlllilIi","jN3g6x3G0drMMX6xvydvsSIgV1Yx+g7mPxjc0fA8702i">(),
         IliIlllilIi<"IliIlllilIi","jN3g6x3G0drMMX6xvydvsSIgV1Yx+g7mPxjc0fA8702i">(),
         IliIlllilIi<"IliIlllilIi","lCz8Ve+k7Dp9O6md53GflmRfgrW3X/pUZyGJj5Jai88=">(),
         IliIlllilIi<"IliIlllilIi","ru70zQ92vLie45LEea1lUH4bZWxt2vXw34NcwTswpA==">()
      );
      this.llIIIIlIil = new Long2ObjectOpenHashMap();
      this.ilIIIIlIil = new iIIlIIIiIlIlIIIi();
      this.IiIIIIlIil = new LongOpenHashSet();
      this.liIIIIlIil = List.of();
      this.iiIIIIlIil = List.of();
      this.iIlIIIlIil = -1;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.llIiiiIIil,
            this.ilIiiiIIil,
            this.IiIiiiIIil,
            this.liIiiiIIil,
            this.iiIiiiIIil,
            this.IIliiiIIil,
            this.lIliiiIIil,
            this.iIliiiIIil,
            this.IlliiiIIil,
            this.llliiiIIil
         }
      );
   }

   private static int IIllllIlll(class_2248 doKelp, boolean doBamboo, boolean doDrip, boolean doAme, boolean b, boolean doBerries, boolean doVines) {
      if (doBamboo && iIlllIllll(doKelp)) {
         return 1;
      } else if (!doDrip || doKelp != class_2246.field_9993 && doKelp != class_2246.field_10463) {
         if (doAme && doKelp == class_2246.field_10211) {
            return 3;
         } else if (b && doKelp == class_2246.field_16999) {
            return 4;
         } else if (doBerries && doKelp == class_2246.field_10597) {
            return 5;
         } else {
            return doVines && doKelp == class_2246.field_28048 ? ~(-1398928405 * -17) + 69 ^ 1988020953 : 0;
         }
      } else {
         return 2;
      }
   }

   private static boolean lIilliIill(class_2826[] y, int lx, int sections, int bottomY, int lz) {
      return lllllillll(y, lx, sections, bottomY + 1, lz) == class_2246.field_10597
         ? false
         : ilillIiill(y, lx, sections, bottomY, lz, -1, class_2246.field_10597, class_2246.field_10597) >= (717674175 * -125 - -103 ^ 485041443);
   }

   private static boolean Ilillllill(class_2826[] lx, int lz, int sections, int bottomY, int y) {
      return lllllillll(lx, lz, sections, bottomY + 1, y) != class_2246.field_28048 && lllllillll(lx, lz, sections, bottomY - 1, y) == class_2246.field_28048
         ? ilillIiill(lx, lz, sections, bottomY, y, -1, class_2246.field_28048, class_2246.field_28048) >= (((-1996155985 ^ 91) + -63) * 107 ^ 1159675042)
         : false;
   }

   private int lIIlliIIll() {
      return this.llIiiiIIil.Iilllilliill()
         | (this.ilIiiiIIil.Iilllilliill() ? -(-785007644 >>> 31 | -785007644 << 1) ^ 1570015543 : 0)
         | (this.IiIiiiIIil.Iilllilliill() ? ~((1175151296 + -91) * 678152731 + -69) ^ -1192104035 : 0)
         | (this.liIiiiIIil.Iilllilliill() ? ~(1707322358 * 75) ^ 799841005 : 0)
         | (this.iiIiiiIIil.Iilllilliill() ? (1773636519 << 23 | 1773636519 >>> 9) * -858993459 + -51 + 93 ^ -1007619861 : 0)
         | (this.IIliiiIIil.Iilllilliill() ? (57496454 * -13 << 9 | 57496454 * -13 >>> 23) - 119 ^ -444304081 : 0)
         | (this.lIliiiIIil.Iilllilliill() ? (-1727103661 + 111) * -17 ^ 15 ^ -704018927 : 0);
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         List var2 = this.liIIIIlIil;
         if (!var2.isEmpty()) {
            Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
            int var4 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
            double var5 = (double)this.iIliiiIIil.Iilllilliill();
            float var7 = iIiiIIilIliiIIil.Iiilliiliiil(var5);
            int var8 = IiIilliIil(this.IlliiiIIil.Iilllilliill()) << 24 | var4;
            int var9 = -939524096 | var4;
            int var10 = 0;

            for (int var11 = var2.size(); var10 < var11; var10++) {
               IiIiIIlliIiIIl var12 = (IiIiIIlliIiIIl)var2.get(var10);
               double var13 = (double)(class_1923.method_8325(var12.llIliliIlilIliliIl) << 4);
               double var15 = (double)(class_1923.method_8332(var12.llIliliIlilIliliIl) << 4);
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var13 + 8.0, var5, var15 + 8.0, 12.0F)) {
                  float var17 = iIiiIIilIliiIIil.Ililllililil(var13);
                  float var18 = iIiiIIilIliiIIil.IIIilIIiiIIi(var15);
                  float var19 = var17 + 16.0F;
                  float var20 = var18 + 16.0F;
                  iIiiIIilIliiIIil.Illillliilli(var3, var17, var7, var18, var17, var7, var20, var19, var7, var20, var19, var7, var18, var8);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var17, var7, var18, var19, var7, var18, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var19, var7, var18, var19, var7, var20, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var19, var7, var20, var17, var7, var20, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var17, var7, var20, var17, var7, var18, var9, 2.0F);
               }
            }

            var10 = -234881024 | var4;
            List var22 = this.iiIIIIlIil;
            int var23 = 0;

            for (int var24 = var22.size(); var23 < var24; var23++) {
               IiIIliiliIIlii var14 = (IiIIliiliIIlii)var22.get(var23);
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var14.lliIiIiIIl, var5 + 3.0, var14.iliIiIiIIl, 4.0F)) {
                  float var25 = iIiiIIilIliiIIil.Ililllililil(var14.lliIiIiIIl);
                  float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(var14.iliIiIiIIl);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25, var7, var16, var25, var7 + 6.0F, var16, var10, 3.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25 - 1.5F, var7 + 0.05F, var16, var25 + 1.5F, var7 + 0.05F, var16, var10, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25, var7 + 0.05F, var16 - 1.5F, var25, var7 + 0.05F, var16 + 1.5F, var10, 2.0F);
               }
            }

            iIiiIIilIliiIIil.IiIiliIiiiIi();
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         try {
            int var1 = this.lIIlliIIll() ^ System.identityHashCode(Iiiilllliiilll.field_1687) << 14;
            if (var1 != this.iIlIIIlIil) {
               if (this.iIlIIIlIil != -1) {
                  this.llIIIIlIil.clear();
                  this.ilIIIIlIil.liiiIIllIl();
                  this.lIlIIIlIil = true;
               }

               this.iIlIIIlIil = var1;
            }

            class_1923 var2 = Iiiilllliiilll.field_1724.method_31476();
            int var3 = Math.min((Integer)Iiiilllliiilll.field_1690.method_42503().method_41753() + 1, 16);
            this.ilIIIIlIil
               .IIlllIlliIll(Iiiilllliiilll.field_1687, var2.field_9181, var2.field_9180, var3, 12000L, iIIlIIIiIlIlIIIi.IliIlllilIi(400), this::ilIllIiIll);
            this.IIlIIIlIil++;
            if (this.IIlIIIlIil % 40 == 0) {
               int var4 = var3 + 2;
               ObjectIterator var5 = this.llIIIIlIil.long2ObjectEntrySet().fastIterator();

               while (var5.hasNext()) {
                  long var6 = ((Entry)var5.next()).getLongKey();
                  if (Math.abs(class_1923.method_8325(var6) - var2.field_9181) > var4 || Math.abs(class_1923.method_8332(var6) - var2.field_9180) > var4) {
                     var5.remove();
                     this.lIlIIIlIil = true;
                  }
               }

               this.ilIIIIlIil.IiIlliIliiIl(var2.field_9181, var2.field_9180, var4 + 2);
            }

            if (this.lIlIIIlIil && this.IIlIIIlIil % 10 == 0) {
               this.lIlIIIlIil = false;
               this.liilliiill();
            }
         } catch (Exception var8) {
         }
      }
   }

   private Illlliilllllliil liIlliiIll(class_2818 chunk, class_1923 cpos) {
      class_2826[] var3 = chunk.method_12006();
      int var4 = chunk.method_31607();
      boolean var5 = this.ilIiiiIIil.Iilllilliill();
      boolean var6 = this.IiIiiiIIil.Iilllilliill();
      boolean var7 = this.liIiiiIIil.Iilllilliill();
      boolean var8 = this.iiIiiiIIil.Iilllilliill();
      boolean var9 = this.IIliiiIIil.Iilllilliill();
      boolean var10 = this.lIliiiIIil.Iilllilliill();
      if (!var5 && !var6 && !var7 && !var8 && !var9 && !var10) {
         return null;
      } else {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         double var17 = 0.0;
         double var19 = 0.0;
         double var21 = 0.0;
         class_2248 var23 = null;
         int var24 = 0;

         for (int var25 = 0; var25 < var3.length; var25++) {
            class_2826 var26 = var3[var25];
            if (var26 != null
               && !var26.method_38292()
               && var26.method_19523(doVines -> IIllllIlll(doVines.method_26204(), var5, var6, var7, var8, var9, var10) != 0)) {
               int var27 = var4 + (var25 << 4);

               for (int var28 = 0; var28 < 16; var28++) {
                  for (int var29 = 0; var29 < 16; var29++) {
                     for (int var30 = 0; var30 < 16; var30++) {
                        class_2680 var31 = var26.method_12254(var30, var28, var29);
                        class_2248 var32 = var31.method_26204();
                        if (var32 != var23) {
                           var23 = var32;
                           var24 = IIllllIlll(var32, var5, var6, var7, var8, var9, var10);
                        }

                        if (var24 != 0) {
                           int var33 = var27 + var28;
                           double var34 = 0.0;
                           switch (var24) {
                              case 1:
                                 if (var11 < 16) {
                                    var11++;
                                    var34 = 6.0;
                                 }
                                 break;
                              case 2:
                                 if (var12 < 6 && Iillllilll(var3, var4, var31, var30, var33, var29)) {
                                    var12++;
                                    var34 = 2.0;
                                 }
                                 break;
                              case 3:
                                 if (var13 < 6 && iilllIIill(var3, var4, var30, var33, var29)) {
                                    var13++;
                                    var34 = 2.0;
                                 }
                                 break;
                              case 4:
                                 if (var14 < 6 && var31.method_28498(class_2741.field_12497) && (Integer)var31.method_11654(class_2741.field_12497) == 3) {
                                    var14++;
                                    var34 = 2.0;
                                 }
                                 break;
                              case 5:
                                 if (var15 < 6 && lIilliIill(var3, var4, var30, var33, var29)) {
                                    var15++;
                                    var34 = 2.0;
                                 }
                                 break;
                              case 6:
                                 if (var16 < 6 && Ilillllill(var3, var4, var30, var33, var29)) {
                                    var16++;
                                    var34 = 2.0;
                                 }
                           }

                           if (var34 > 0.0) {
                              var17 += var34;
                              var19 += ((double)((cpos.field_9181 << 4) + var30) + 0.5) * var34;
                              var21 += ((double)((cpos.field_9180 << 4) + var29) + 0.5) * var34;
                           }
                        }
                     }
                  }
               }
            }
         }

         double var36 = (double)var11 * 6.0 + (double)(var12 + var13 + var14 + var15 + var16) * 2.0;
         return var36 < (double)this.iiiIlIIIll() ? null : new Illlliilllllliil(cpos.method_8324(), var36, var17, var19, var21);
      }
   }

   private static int IiIilliIil(int v) {
      return Math.max(0, Math.min(-(~1841441979 - 19) ^ 27 ^ 1841441835, v));
   }

   private List<IiIIliiliIIlii> IIIillIIil(List<IiIiIIlliIiIIl> byKey, Map<Long, Illlliilllllliil> flagged) {
      byte var3 = 3;
      HashMap var4 = new HashMap();

      for (IiIiIIlliIiIIl var6 : byKey) {
         var4.put(var6.llIliliIlilIliliIl, var6);
      }

      ArrayList var17 = new ArrayList();
      HashSet var18 = new HashSet();

      for (IiIiIIlliIiIIl var8 : byKey) {
         if (var18.add(var8.llIliliIlilIliliIl)) {
            ArrayList var9 = new ArrayList();
            ArrayDeque var10 = new ArrayDeque();
            var10.add(var8);

            while (!var10.isEmpty()) {
               IiIiIIlliIiIIl var11 = (IiIiIIlliIiIIl)var10.poll();
               var9.add(var11);
               int var12 = class_1923.method_8325(var11.llIliliIlilIliliIl);
               int var13 = class_1923.method_8332(var11.llIliliIlilIliliIl);

               for (int var14 = -var3; var14 <= var3; var14++) {
                  for (int var15 = -var3; var15 <= var3; var15++) {
                     if (var14 != 0 || var15 != 0) {
                        IiIiIIlliIiIIl var16 = (IiIiIIlliIiIIl)var4.get(class_1923.method_8331(var12 + var14, var13 + var15));
                        if (var16 != null && var18.add(var16.llIliliIlilIliliIl)) {
                           var10.add(var16);
                        }
                     }
                  }
               }
            }

            var17.add(this.iIIilIlIil(var9, flagged));
         }
      }

      var17.sort(Comparator.<IiIIliiliIIlii>comparingDouble(z -> z.IiiIiIiIIl).reversed());
      return var17;
   }

   private void liilliiill() {
      int var1 = this.iiiIlIIIll();
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap();
      ObjectIterator var4 = this.llIIIIlIil.values().iterator();

      while (var4.hasNext()) {
         Illlliilllllliil var5 = (Illlliilllllliil)var4.next();
         if (!(var5.iIIlIiilil < (double)var1)) {
            var2.add(new IiIiIIlliIiIIl(var5.lIIlIiilil, var5.iIIlIiilil));
            var3.put(var5.lIIlIiilil, var5);
         }
      }

      this.liIIIIlIil = List.copyOf(var2);
      this.iiIIIIlIil = this.IIIillIIil(var2, var3);
      this.llIililIil();
   }

   private static boolean iilllIIill(class_2826[] y, int bottomY, int sections, int lz, int lx) {
      return lllllillll(y, bottomY, sections, lz - 1, lx) == class_2246.field_10211
         ? false
         : ilillIiill(y, bottomY, sections, lz, lx, 1, class_2246.field_10211, class_2246.field_10211) >= (-(-(-449385163)) ^ -449385159);
   }

   private IiIIliiliIIlii iIIilIlIil(List<IiIiIIlliIiIIl> group, Map<Long, Illlliilllllliil> byKey) {
      HashSet var3 = new HashSet();
      double var4 = 0.0;
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;

      for (IiIiIIlliIiIIl var17 : group) {
         var3.add(var17.llIliliIlilIliliIl);
         var4 += var17.IiIliliIlliIliliIl;
         Illlliilllllliil var18 = (Illlliilllllliil)byKey.get(var17.llIliliIlilIliliIl);
         if (var18 != null && var18.IlIlIiilil > 0.0) {
            var6 += var18.IlIlIiilil;
            var8 += var18.llIlIiilil;
            var10 += var18.ilIlIiilil;
         }

         var12 += (double)(class_1923.method_8325(var17.llIliliIlilIliliIl) * 16 + 8) * var17.IiIliliIlliIliliIl;
         var14 += (double)(class_1923.method_8332(var17.llIliliIlilIliliIl) * 16 + 8) * var17.IiIliliIlliIliliIl;
      }

      double var20 = var6 > 0.0 ? var8 / var6 : var12 / var4;
      double var21 = var6 > 0.0 ? var10 / var6 : var14 / var4;
      return new IiIIliiliIIlii(Set.copyOf(var3), var20, var21, var4);
   }

   private void llIililIil() {
      if (Iiiilllliiilll.field_1724 != null) {
         for (IiIIliiliIIlii var2 : this.iiIIIIlIil) {
            boolean var3 = true;

            for (long var5 : var2.IliIiIiIIl) {
               if (this.IiIIIIlIil.contains(var5)) {
                  var3 = false;
                  break;
               }
            }

            for (long var10 : var2.IliIiIiIIl) {
               this.IiIIIIlIil.add(var10);
            }

            if (var3 && !this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","ru70zQ92vLie45LEea1lUH4bZWxt2vXw34NcwTswpA==">())) {
               int var9 = (int)Math.round(var2.lliIiIiIIl);
               int var11 = (int)Math.round(var2.iliIiIiIIl);
               int var6 = (int)Math.hypot((double)var9 - Iiiilllliiilll.field_1724.method_23317(), (double)var11 - Iiiilllliiilll.field_1724.method_23321());
               String var7 = IliIlllilIi<"IliIlllilIi","KAvd5K/Nk9mPqanNPHPvORr/Jcpqsf1rdOZcgjFsBxBkQpvmhq3DbA==">()
                  + var6
                  + IliIlllilIi<"IliIlllilIi","1fC52EM+D3OJlg+5qj0OwrIxIye43zRvnetjBUbt/0oM">()
                  + var9
                  + IliIlllilIi<"IliIlllilIi","Md4ry7xcJbt0bZacJMpJrwRzCpjZGLls9lT+n+Kl">()
                  + var11;
               if (this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","jN3g6x3G0drMMX6xvydvsSIgV1Yx+g7mPxjc0fA8702i">())) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","MNOjUMFVVq6BmNs9Yh8mg6Fov8fir8l/k3PrrmbMjfWKwqqY8Q==">(), var7, true);
               } else if (this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","lCz8Ve+k7Dp9O6md53GflmRfgrW3X/pUZyGJj5Jai88=">())) {
                  Iiiilllliiilll.field_1724
                     .method_7353(
                        class_2561.method_43470(IliIlllilIi<"IliIlllilIi","7XspvrRlah16FNcbDpJxHQuDf41x/w5FTzZ9UCanihgQloYMRO/WXH4=">() + var7), false
                     );
               }
            }
         }
      }
   }

   private int iiiIlIIIll() {
      return this.llIiiiIIil.Iilllilliill() * 5;
   }

   @Override
   protected void Illillliilli() {
      this.IlIllllIll();
   }

   private static int ilillIiill(class_2826[] bottomY, int sections, int a, int b, int step, int lx, class_2248 lz, class_2248 y) {
      int var8;
      for (var8 = 1; var8 < 40; var8++) {
         b += lx;
         class_2248 var9 = lllllillll(bottomY, sections, a, b, step);
         if (var9 != lz && var9 != y) {
            break;
         }
      }

      return var8;
   }

   private static class_2248 lllllillll(class_2826[] lx, int y, int bottomY, int sections, int lz) {
      long var7 = 2197749618314404252L;
      var7 ^= ((long)(sections - y >> 4) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) >= 0 && (int)(var7 >>> 32) < lx.length) {
         class_2826 var6 = lx[(int)(var7 >>> 32)];
         return var6 != null && !var6.method_38292()
            ? var6.method_12254(bottomY, sections & (~(575524362 + -89) ^ -575524287), lz).method_26204()
            : class_2246.field_10124;
      } else {
         return class_2246.field_10243;
      }
   }

   @Override
   protected void Iilililiiili() {
      this.IlIllllIll();
   }
}
