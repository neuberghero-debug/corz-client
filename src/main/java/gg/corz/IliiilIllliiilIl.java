package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_5455;
import net.minecraft.class_6796;
import net.minecraft.class_7924;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import org.joml.Matrix4f;

public class IliiilIllliiilIl extends ilIllIiIll {
   private static final int llliIIiIll = 1;
   private final iiIiiilIIliiil iIllIIiIll;
   private final iiIiiilIIliiil IillIIiIll;
   private final iiIiiilIIliiil illlIIiIll;
   private static final int ilIiIIiIll = 5;
   private static final int ililIIiIll = 400;
   private final IilIiililIii iillIIiIll;
   private static final int liliIIiIll = 4;
   private static final int IiilIIiIll = 40;
   private int IlilIIiIll;
   private final iiIiiilIIliiil IlllIIiIll;
   private final iiIiiilIIliiil iiIlIIiIll;
   private final iIIlIIIiIlIlIIIi iIilIIiIll;
   private static final int IlliIIiIll = 0;
   private static final int IiIiIIiIll = 6;
   private int llilIIiIll;
   private final iiIiiilIIliiil IIllIIiIll;
   private static final int illiIIiIll = 2;
   private static final int iiIiIIiIll = 2;
   private static final int IIliIIiIll = 1;
   private static final int llIiIIiIll = 5;
   private static final int liIiIIiIll = 2;
   private static final int iIiiIIiIll = 8;
   private final iiIiiilIIliiil IiIlIIiIll;
   private static final int iiliIIiIll = 5;
   private static final int lIliIIiIll = 14;
   private static final double lIIiIIiIll = 72.0;
   private final iilliIlIIiliIl liIlIIiIll;
   private static final int iiilIIiIll = 64;
   private final iiIiiilIIliiil llllIIiIll;
   private static final int IlIiIIiIll = 6;
   private static final int IIiiIIiIll = 6;
   private final Long2ObjectOpenHashMap<IIliiIilIliiIi> lIilIIiIll;
   private static final long liilIIiIll = 15000L;
   private static final int iIIiIIiIll = 10;
   private static final int IIIiIIiIll = 160;
   private static final int IiliIIiIll = 3;
   private final iiIiiilIIliiil lIllIIiIll;
   private final iilliIlIIiliIl ilIlIIiIll;
   private final iilliIlIIiliIl llIlIIiIll = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","HAiJf9BtsU9WCDFp2oW5g1JpBhl/bc0QyxLT3oYizQrC2AcF92kxEgysM0dVKaM=">(),
      IliIlllilIi<"IliIlllilIi","76vry+GCyOSvFrlOztCkLcwuNjUQA+qYBPf2j5MxsD0w+a0HQBlXHZVjIW22y4/uLLfSVL91TR9xVexvu9hWaJtSnsRO89s832+xzA==">(),
      4,
      1,
      12
   );
   private static final int iIliIIiIll = 24;
   private static final int lIiiIIiIll = 7;
   private final IIiiIIIllIiiIIIl lillIIiIll;
   private final List<iliIiiIiiIii> IIilIIiIll;

   private static int IIllllIlll(
      class_2680 doCave, boolean doDeep, boolean st, boolean doAme, boolean doCocoa, boolean doKelp, boolean doVine, boolean doBee, boolean doBamboo
   ) {
      if (doCave.method_26215()) {
         return 0;
      } else if (doDeep
         && doCave.method_27852(class_2246.field_28888)
         && doCave.method_28498(class_2741.field_12496)
         && doCave.method_11654(class_2741.field_12496) != class_2351.field_11052) {
         return 1;
      } else if (st && doCave.method_27852(class_2246.field_27161)) {
         return 2;
      } else if (doAme && iIlllIllll(doCave)) {
         return 3;
      } else if (doCocoa
         && doCave.method_27852(class_2246.field_10302)
         && doCave.method_28498(class_2741.field_12556)
         && (Integer)doCave.method_11654(class_2741.field_12556) == ((-1155792942 * -65 << 25 | -1155792942 * -65 >>> 7) ^ 1560004629)) {
         return 4;
      } else if (doKelp
         && (doCave.method_27852(class_2246.field_20421) || doCave.method_27852(class_2246.field_20422))
         && doCave.method_28498(class_2741.field_20432)
         && (Integer)doCave.method_11654(class_2741.field_20432) == (-411914466 + 71 + 11 ^ -411914379)) {
         return 5;
      } else if (doVine && doCave.method_27852(class_2246.field_10463)) {
         return (-1335331550 - -103) * 19 ^ 398506285;
      } else if (doBee
         && doCave.method_27852(class_2246.field_10211)
         && doCave.method_28498(class_2741.field_12516)
         && String.valueOf(doCave.method_11654(class_2741.field_12516))
            .equalsIgnoreCase(IliIlllilIi<"IliIlllilIi","HtNs8rQryLGpRJ0dHzMsYi2SPJ135Q13oy29KPUClTsw">())) {
         return (-1363470919 * -111 >>> 5 | -1363470919 * -111 << 27) ^ 123 ^ 1239878874;
      } else {
         return doBamboo && doCave.method_27852(class_2246.field_10597) ? (1435345780 * -19 >>> 27 | 1435345780 * -19 << 5) ^ -811873124 : 0;
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = this.lIIlliIIll();
         if (var1 != this.llilIIiIll) {
            this.llilIIiIll = var1;
            this.lIilIIiIll.clear();
            this.iIilIIiIll.liiiIIllIl();
         }

         class_1923 var2 = Iiiilllliiilll.field_1724.method_31476();
         int var3 = this.llIlIIiIll.Iilllilliill();
         this.iIilIIiIll
            .IIlllIlliIll(Iiiilllliiilll.field_1687, var2.field_9181, var2.field_9180, var3, 15000L, iIIlIIIiIlIlIIIi.IliIlllilIi(400), this::IlIllllIll);
         if (++this.IlilIIiIll % 40 == 0) {
            int var4 = var3 + 2;
            ObjectIterator var5 = this.lIilIIiIll.long2ObjectEntrySet().fastIterator();

            while (var5.hasNext()) {
               long var6 = ((Entry)var5.next()).getLongKey();
               if (Math.abs(class_1923.method_8325(var6) - var2.field_9181) > var4 || Math.abs(class_1923.method_8332(var6) - var2.field_9180) > var4) {
                  var5.remove();
               }
            }

            this.iIilIIiIll.IiIlliIliiIl(var2.field_9181, var2.field_9180, var4 + 2);
         }
      }
   }

   private static boolean iIlllIllll(class_2680 st) {
      return (st.method_27852(class_2246.field_28675) || st.method_27852(class_2246.field_28676))
         && st.method_28498(class_2741.field_28716)
         && (Boolean)st.method_11654(class_2741.field_28716);
   }

   private static class_5321<class_6796> iiiIlIIIll(String id) {
      return class_5321.method_29179(
         class_7924.field_41245, class_2960.method_60655(IliIlllilIi<"IliIlllilIi","iZvWo5KljiH/s/bIBBAgHKFETmu/sy9fTNr+Ny1G4y6ucX2tgQ==">(), id)
      );
   }

   private int liIlliiIll() {
      long var2 = 1990560047946173283L;
      var2 ^= ((long)this.ilIlIIiIll.Iilllilliill() << 32 ^ var2) & -1L << 32;
      return Math.max(-(-1624502051 * 31 - -111) ^ -1180044088, (~(~551343247) ^ 551343265) - (int)(var2 >>> 32) * 4);
   }

   @Override
   protected void Iilililiiili() {
      this.lIilIIiIll.clear();
      this.iIilIIiIll.liiiIIllIl();
   }

   private int lllllillll(class_2818 chunk, class_1923 markers, List<int[]> cpos) {
      try {
         Long var4 = IilIiililIii.IliIlllilIi(this.lillIIiIll.Iilllilliill());
         if (var4 != null && Iiiilllliiilll.field_1687 != null) {
            class_5455 var5 = Iiiilllliiilll.field_1687.method_30349();
            int var6 = 0;

            for (iliIiiIiiIii var8 : this.IIilIIiIll) {
               if (var8.IliIlllilIi().Iilllilliill()) {
                  boolean var9 = var8.liiiIIllIl()
                     .stream()
                     .anyMatch(
                        k -> k.method_29177().method_12832().contains(IliIlllilIi<"IliIlllilIi","aHUi9IxJQUz6LB6jJ6ARCUdA5ylzYZ4CK0GrAi7Q1PUdSSda">())
                              || k.method_29177().method_12832().contains(IliIlllilIi<"IliIlllilIi","xgE+YMXTNt8kokcbYJYBxu9/ncFt50eOmPjMuEPaWQhR">())
                     );
                  if (var9) {
                     int var10 = 0;
                     int var11 = 0;

                     for (class_5321 var13 : var8.liiiIIllIl()) {
                        for (class_2338 var16 : this.iillIIiIll
                           .liiiIIllIl(Iiiilllliiilll.field_1687, var5, var4, markers.field_9181, markers.field_9180, var13)) {
                           var10++;
                           if (this.Iillllilll(var16, var8.iIlIlllllill())) {
                              var11++;
                           } else if (var9 && cpos.size() < 64) {
                              cpos.add(new int[]{var16.method_10263(), var16.method_10264(), var16.method_10260()});
                           }
                        }
                     }

                     if (var9 && var10 > 0 && var11 == 0) {
                        var6 += 14 * Math.min(var10, 3);
                     }
                  }
               }
            }

            return var6;
         } else {
            return 0;
         }
      } catch (Throwable var17) {
         return 0;
      }
   }

   private void IlIllllIll(class_2818 key, long chunk) {
      try {
         IIliiIilIliiIi var4 = this.ilIllIiIll(key, key.method_12004());
         if (var4 != null) {
            this.lIilIIiIll.put(chunk, var4);
         } else {
            this.lIilIIiIll.remove(chunk);
         }
      } catch (Throwable var5) {
         this.lIilIIiIll.remove(chunk);
      }
   }

   private int lIIlliIIll() {
      int var1 = (this.iiIlIIiIll.Iilllilliill() ? 1 : 0)
         | (this.IIllIIiIll.Iilllilliill() ? 2 : 0)
         | (this.lIllIIiIll.Iilllilliill() ? 4 : 0)
         | (this.iIllIIiIll.Iilllilliill() ? 8 : 0)
         | (this.IlllIIiIll.Iilllilliill() ? 16 : 0)
         | (this.llllIIiIll.Iilllilliill() ? 32 : 0)
         | (this.illlIIiIll.Iilllilliill() ? 64 : 0)
         | (this.IillIIiIll.Iilllilliill() ? 128 : 0)
         | (this.IiIlIIiIll.Iilllilliill() ? 256 : 0);
      return 31 * (31 * (31 * System.identityHashCode(Iiiilllliiilll.field_1687) + this.lillIIiIll.Iilllilliill().hashCode()) + this.ilIlIIiIll.Iilllilliill())
         + var1;
   }

   private IIliiIilIliiIi ilIllIiIll(class_2818 cpos, class_1923 chunk) {
      class_2826[] var3 = cpos.method_12006();
      int var4 = Iiiilllliiilll.field_1687.method_31607();
      byte var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      byte var11 = 0;
      int var12 = 0;
      ArrayList var13 = new ArrayList();
      int var14 = Integer.MAX_VALUE;
      int var15 = Integer.MIN_VALUE;
      boolean var16 = this.IillIIiIll.Iilllilliill();
      boolean var17 = this.iIllIIiIll.Iilllilliill();
      boolean var18 = this.IIllIIiIll.Iilllilliill();
      boolean var19 = this.llllIIiIll.Iilllilliill();
      boolean var20 = this.illlIIiIll.Iilllilliill();
      boolean var21 = this.iiIlIIiIll.Iilllilliill();
      boolean var22 = this.IlllIIiIll.Iilllilliill();
      boolean var23 = this.lIllIIiIll.Iilllilliill();
      if (!var16 && !var17 && !var18 && !var19 && !var20 && !var21 && !var22 && !var23) {
         return null;
      } else {
         class_2680 var24 = null;
         int var25 = 0;

         for (int var26 = 0; var26 < var3.length; var26++) {
            class_2826 var27 = var3[var26];
            if (var27 != null
               && !var27.method_38292()
               && var27.method_19523(doKelp -> IIllllIlll(doKelp, var16, var17, var18, var19, var20, var21, var22, var23) != 0)) {
               int var28 = var4 + (var26 << 4);

               for (int var29 = 0; var29 < 16; var29++) {
                  for (int var30 = 0; var30 < 16; var30++) {
                     for (int var31 = 0; var31 < 16; var31++) {
                        class_2680 var32 = var27.method_12254(var30, var29, var31);
                        if (var32 != var24) {
                           var24 = var32;
                           var25 = IIllllIlll(var32, var16, var17, var18, var19, var20, var21, var22, var23);
                        }

                        if (var25 != 0) {
                           byte var33 = 0;
                           switch (var25) {
                              case 1:
                                 if (var5 < 24) {
                                    var5 += 10;
                                    var33 = 10;
                                 }
                                 break;
                              case 2:
                                 if (var6 < 24) {
                                    var6 += 6;
                                    var33 = 6;
                                 }
                                 break;
                              case 3:
                                 if (var7 < 24) {
                                    var7 += 5;
                                    var33 = 5;
                                 }
                                 break;
                              case 4:
                                 if (var8 < 24) {
                                    var8 += 5;
                                    var33 = 5;
                                 }
                                 break;
                              case 5:
                                 if (var9 < 24) {
                                    var9 += 6;
                                    var33 = 6;
                                 }
                                 break;
                              case 6:
                                 if (var10 < 24) {
                                    var10 += 2;
                                    var33 = 2;
                                 }
                                 break;
                              case 7:
                                 if (var11 < 24) {
                                    var11 += 2;
                                    var33 = 2;
                                 }
                                 break;
                              case 8:
                                 if (var12 < 24) {
                                    var12++;
                                    var33 = 1;
                                 }
                           }

                           if (var33 > 0) {
                              int var34 = (chunk.field_9181 << 4) + var30;
                              int var35 = var28 + var29;
                              int var36 = (chunk.field_9180 << 4) + var31;
                              if (var13.size() < 64) {
                                 var13.add(new int[]{var34, var35, var36});
                              }

                              if (var35 < var14) {
                                 var14 = var35;
                              }

                              if (var35 > var15) {
                                 var15 = var35;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         int var37 = this.lllllillll(cpos, chunk, var13);
         if (var37 > 0) {
            for (int[] var40 : var13) {
               if (var40[1] < var14) {
                  var14 = var40[1];
               }

               if (var40[1] > var15) {
                  var15 = var40[1];
               }
            }
         }

         int var39 = var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12 + var37;
         int var41 = (var5 > 0 ? 1 : 0)
            + (var6 > 0 ? 1 : 0)
            + (var7 > 0 ? 1 : 0)
            + (var8 > 0 ? 1 : 0)
            + (var9 > 0 ? 1 : 0)
            + (var10 > 0 ? 1 : 0)
            + (var11 > 0 ? 1 : 0)
            + (var12 > 0 ? 1 : 0)
            + (var37 > 0 ? 1 : 0);
         int var42 = this.liIlliiIll();
         if (this.IiIlIIiIll.Iilllilliill() && var37 == 0 && var5 == 0 && var6 == 0 && var7 == 0 && var8 == 0 && var9 == 0) {
            var42 += 12;
         }

         if (var39 < var42) {
            return null;
         } else {
            IIliiIilIliiIi var43 = new IIliiIilIliiIi();
            var43.IIiliIiiilIiliIiii = var39;
            var43.iIiliIiiiIliliIiii = var41;
            var43.iiiliIiiiIIIiiIiii = var13;
            var43.lliliIiiiililiIiii = var14 == Integer.MAX_VALUE ? (int)Iiiilllliiilll.field_1724.method_23318() - 4 : var14;
            var43.IiiliIiiiliiliIiii = var15 == Integer.MIN_VALUE ? (int)Iiiilllliiilll.field_1724.method_23318() + 4 : var15;
            return var43;
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.lIilIIiIll.clear();
      this.iIilIIiIll.liiiIIllIl();
      this.IlilIIiIll = 0;
   }

   private static int iilllIIill(int r, int b, int a, int g) {
      return (r & (((-1969448026 << 5 | -1969448026 >>> 27) << 31 | (-1969448026 << 5 | -1969448026 >>> 27) >>> 1) + -51 ^ -1446397238))
            << (-((-1875923029 << 5 | -1875923029 >>> 27) * -49 * -1527099483) ^ -463767742)
         | (b & (~((1751415901 >>> 23 | 1751415901 << 9) * -49) ^ -61 ^ -2006696205)) << (-874288861 + -73 - -3 ^ -874288947)
         | (a & ((1233698656 >>> 29 | 1233698656 << 3) * 1227133513 - -55 ^ -2023508170)) << ((2145471081 << 27 | 2145471081 >>> 5) ^ -53 ^ 59 ^ -1275005525)
         | g & ((((-1170627003 << 7 | -1170627003 >>> 25) ^ -117) << 19 | ((-1170627003 << 7 | -1170627003 >>> 25) ^ -117) >>> 13) ^ -357099111);
   }

   private boolean Iillllilll(class_2338 a, List<class_2248> blocks) {
      int var3 = Iiiilllliiilll.field_1687.method_31607();
      int var4 = Iiiilllliiilll.field_1687.method_31607() + Iiiilllliiilll.field_1687.method_31605();
      class_2339 var5 = new class_2339();

      for (int var6 = -40; var6 <= 40; var6++) {
         int var7 = a.method_10264() + var6;
         if (var7 >= var3 && var7 < var4) {
            for (int var8 = -2; var8 <= 2; var8++) {
               for (int var9 = -2; var9 <= 2; var9++) {
                  var5.method_10103(a.method_10263() + var8, var7, a.method_10260() + var9);
                  class_2248 var10 = Iiiilllliiilll.field_1687.method_8320(var5).method_26204();

                  for (class_2248 var12 : blocks) {
                     if (var10 == var12) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   public IliiilIllliiilIl() {
      super(IliIlllilIi<"IliIlllilIi","Mu0oXbsvj6+6COyAciL0XWUHkfpEyI7cZ4q6vbcm3ic5g/8OoFi4nWe6q2k=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.ilIlIIiIll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","70BxcGhYlTuvJOnYVTGfjaamJV490FO+SesgZNfltG0UV5E1he9P">(),
         IliIlllilIi<"IliIlllilIi","kPRdfZLnNtlNAGN8Nucc2qyze615cIoOxyCuSa6qdH27vJB3ITJhoYgzpCPrRlzv4sJfWo5FSzTHFKfC/ZHypMj7ppUnux7Uq7puPXLrDxwNBk4tKze3r+fQOtWwrTonthkoFIsnA0XGtBPZl5COdxhso+71699e9kvtjPILUuwdo6K7cZqMER9X+WPKoVAvqz7BxM4Qdp5elC0GZqhX/SbzlOs=">(),
         3,
         1,
         10
      );
      this.IiIlIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","YhZMWZkvKIkGNdzgGwarostIhGXN3QGJZRwQRLCzamHnlYTpTydK/zixHYQ=">(),
         IliIlllilIi<"IliIlllilIi","YIouog0XVII4aVk39KbJghdtVrk26+UVjF0FXvlxCPZa6cWfWMuafhwkun6qD3u6f58z47uoxeL+PGO4WQBaA7UK4fC3JuOl2dVzdCD7X6aYd5pNnwWTPNEGGfeWSCYyADikSSVeas/pe7L6JHG/xsAPNMNXt4V9LhxnvImHT4nEw+5TYACawR6WaNZoNFz38R6iNhwdJXWg+4OU06cQsG0=">(),
         true
      );
      this.liIlIIiIll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","HBxalR9l1sVq1yq2PBc2+lwToHooD0pqbW6WCoP7H2sb">(),
         IliIlllilIi<"IliIlllilIi","uoQIEqrNJUEDvyPo2sVs554vvHB+kVwvbbeVLEy7jK8s+bTSWTmEAoMBt9AjmOgOMhAyi/CrKexEPnIX5GcK6Yb9V8zd">(),
         80,
         0,
         255
      );
      this.iiIlIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","2uP4Que8yJALk97m2cNzPnSQhA+eA1/DFlexHd9W/BQ=">(),
         IliIlllilIi<"IliIlllilIi","+enJFSI7p6ebP3ZK3W2FHnaToHCoCNz0uCWpDTD3avXH/ahrjrOjg+xC52OSLDGAmjjKtqAQMsmzZF8uGgYbkTpSW8xTKlxo">(),
         true
      );
      this.IIllIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","fq5a9V6pc+D+7KsXT6M6cVq24oTe7dIruWjOS7/vGui3Fb8zWgQ=">(),
         IliIlllilIi<"IliIlllilIi","sOqFXx4yaX4HBn03p4THK5GpsK4vylSdMZ+um+HFeoEy2EanSCoEZsLAn6bgIk2XdraXuZc46YsZRvzjhrUQtL+MTaA=">(),
         true
      );
      this.lIllIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","V80dS9+E5jkmj1Lx3Fg0sQ/4DZo15jo37cfSIq93SE94">(),
         IliIlllilIi<"IliIlllilIi","0mzu0uFtU6ig3aVtZy3XSfniViNZXMjmR0ZXZ0CoAwi03hW1TmGRBfiESSgUb6uubxQ=">(),
         true
      );
      this.iIllIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","DYERrVLTQgQQSx5D4VRja6z2+hlcB+0lGU++6w3gncTxs3Sb">(),
         IliIlllilIi<"IliIlllilIi","fNeRzgNyQAHMXTPeH5U0+Dd9ma68WEbh+K8CSX/GjMKGMxdfJjDOqabJ2aAToX4c2U57l/kQFADeOYzoWQA1rHsbSKkkTPiL2uAj/c88ZDw4OMT3ACB9v3j5/kYf6S5o">(),
         true
      );
      this.IlllIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","AAd2Vla6sojc12ulokOSE4+yJRGnVfJcGibKMfLXis1a9A==">(),
         IliIlllilIi<"IliIlllilIi","YygSNeJsLz0kbkbmeVy7cFqm8Bz/j78c6rPGnGQITU3+8xDuwqOA9vMFgzI2ZWAhbxu26ea0">(),
         true
      );
      this.llllIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","QFN4/hjSkzD0yDmZXPybC8feId3cFUbzyOKNjKpkCozV">(),
         IliIlllilIi<"IliIlllilIi","I4DYX9Jw/0gIq3o7nltrbD1Hw2c4Vak/ZoVhf8/Zm7SM6pd5lQffE/OpytmjK8xY5vewaw==">(),
         true
      );
      this.illlIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","wMLBa2Gp3tYqNPflN5g9QUDjxK8A35j42MnskzjbwhUPLPwr">(),
         IliIlllilIi<"IliIlllilIi","Lz5ixWvH/04Y99QoVSRKA92QcxLUjjrUseL7fc4ACGBdyUwHBvjbYwSaKjct7BsXB6fSrjo1nJ7kZSgPKizQfQWhl1xCLE3y">(),
         true
      );
      this.IillIIiIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","bIhmOtk/z4oT64J9niklM/iA2tYUkGSvTxEMQ80aai2MaG2nAxZr5Vhe89t5">(),
         IliIlllilIi<"IliIlllilIi","IC3durQ3sPVL5eAAU+oDYUWGhctDmHjZOs0Q+76NCE429MgDEG+PGzOGqSDtk54er3kf4KYOuPTg25vyLrUbAvtjzmvv5D03aHniWHSm8zNgYqvZxtlFHl2aJIZAPqLvdRRhkICQbT1cykvrCS7e6hK9nCa0Ly/Rrw==">(),
         true
      );
      this.lillIIiIll = new IIiiIIIllIiiIIIl(
         IliIlllilIi<"IliIlllilIi","8UVn/naoZF060COTVAp97dfREibmlqKQV3IRIKh6Zro=">(),
         IliIlllilIi<"IliIlllilIi","WJ72w4j9F/ShsahF9UKamxSEmajT3jNpcBQ/R72/pIAUUXgC7AhI9NUXzRvslnYAKUkNm76vIS3QlLQZKKlb7ucvN7WsQY1IuhpVzlTGtIV25LPD46BJq9NjufdAlL0yNCSOKKNyiRFopJ/wKQ2yf7VWsfxmk7Yqe/4Zpw1lJ0FNluhN+LR7bubZyQK137m7UynH">(),
         ""
      );
      this.iillIIiIll = new IilIiililIii();
      this.IIilIIiIll = new ArrayList<>();
      this.lIilIIiIll = new Long2ObjectOpenHashMap();
      this.iIilIIiIll = new iIIlIIIiIlIlIIIi();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.llIlIIiIll,
            this.ilIlIIiIll,
            this.IiIlIIiIll,
            this.liIlIIiIll,
            this.iiIlIIiIll,
            this.IIllIIiIll,
            this.lIllIIiIll,
            this.iIllIIiIll,
            this.IlllIIiIll,
            this.llllIIiIll,
            this.illlIIiIll,
            this.IillIIiIll,
            this.lillIIiIll
         }
      );
      this.IIilIIiIll
         .add(
            new iliIiiIiiIii(
               this.iiIlIIiIll,
               List.of(
                  iiiIlIIIll(IliIlllilIi<"IliIlllilIi","9Odb8hareMiP/2dywWa6Wup7F0rcjmHlJgpUGL07S4XSkbb3Bg==">()),
                  iiiIlIIIll(IliIlllilIi<"IliIlllilIi","IKT0inxQUr1FtfRi6kXCHZKPbyauyMLXK3U6rfOYVI5Kzt6Qnw==">())
               ),
               List.of(class_2246.field_9993, class_2246.field_10463)
            )
         );
      this.IIilIIiIll
         .add(
            new iliIiiIiiIii(
               this.IIllIIiIll,
               List.of(iiiIlIIIll(IliIlllilIi<"IliIlllilIi","dfa/UIvrPhNCVr4CKlbUl1F/oDjzAyvlj2Kx5FYD6ZQ4n8AzF8M=">())),
               List.of(class_2246.field_28675, class_2246.field_28676)
            )
         );
      this.IIilIIiIll
         .add(
            new iliIiiIiiIii(
               this.lIllIIiIll,
               List.of(iiiIlIIIll(IliIlllilIi<"IliIlllilIi","iBfMUKbjBmbklqN7GT/kUIy8NhybDACtGWoN/V3+nInO">())),
               List.of(class_2246.field_10597)
            )
         );
      this.IIilIIiIll
         .add(
            new iliIiiIiiIii(
               this.IlllIIiIll,
               List.of(
                  iiiIlIIIll(IliIlllilIi<"IliIlllilIi","N9cOLAeCeJageeD1AO8q13wI3Chd+lbQBuY8qFjhuQR7XA==">()),
                  iiiIlIIIll(IliIlllilIi<"IliIlllilIi","iDS5wUmUART87lBEvU8YhcFOCcaL/TVzTYK6UpIK3uIOGqoy397jqw==">()),
                  iiiIlIIIll(IliIlllilIi<"IliIlllilIi","eMXyXq6Rraz7TinfYdwyUWEGd/keMh6DAyj5VlQcXBOevVLSlM4VE+Vjwk9K">())
               ),
               List.of(class_2246.field_10211, class_2246.field_10108)
            )
         );
      this.IIilIIiIll
         .add(
            new iliIiiIiiIii(
               this.iIllIIiIll,
               List.of(iiiIlIIIll(IliIlllilIi<"IliIlllilIi","bFJ6Vg83Q61kC84TkTU99wJ1q4XqMOoTzzxRNTsdybwzn3rY0axUu8mm">())),
               List.of(
                  class_2246.field_27160,
                  class_2246.field_27159,
                  class_2246.field_27161,
                  class_2246.field_27164,
                  class_2246.field_27163,
                  class_2246.field_27162,
                  class_2246.field_27114
               )
            )
         );
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !this.lIilIIiIll.isEmpty()) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         double var3 = Iiiilllliiilll.field_1724.method_23317();
         double var5 = Iiiilllliiilll.field_1724.method_23321();
         float var7 = (float)Math.max(0, Math.min(255, this.liIlIIiIll.Iilllilliill())) / 255.0F;
         float var8 = Math.min(1.0F, var7 + 0.35F);
         int var9 = iilllIIill(255, 255, 40, 40);
         int var10 = iilllIIill(Math.min(255, this.liIlIIiIll.Iilllilliill() + 90), 255, 90, 90);
         int var11 = 160;
         ObjectIterator var12 = this.lIilIIiIll.long2ObjectEntrySet().fastIterator();

         while (var12.hasNext()) {
            Entry var13 = (Entry)var12.next();
            long var14 = var13.getLongKey();
            IIliiIilIliiIi var16 = (IIliiIilIliiIi)var13.getValue();
            double var17 = (double)(class_1923.method_8325(var14) << 4);
            double var19 = (double)(class_1923.method_8332(var14) << 4);
            double var21 = (double)(var16.lliliIiiiililiIiii - 1);
            double var23 = (double)(var16.IiiliIiiiliiliIiii + 2);
            if (var23 - var21 < 3.0) {
               var21--;
               var23 += 2.0;
            }

            if (!iIiiIIilIliiIIil.IlIillIiilIi(var17 + 8.0, (var21 + var23) * 0.5, var19 + 8.0, 12.0F + (float)(var23 - var21) * 0.5F)) {
               float var25 = iIiiIIilIliiIIil.Ililllililil(var17);
               float var26 = iIiiIIilIliiIIil.IIIilIIiiIIi(var19);
               float var27 = var25 + 16.0F;
               float var28 = var26 + 16.0F;
               float var29 = iIiiIIilIliiIIil.Iiilliiliiil(var21);
               float var30 = iIiiIIilIliiIIil.Iiilliiliiil(var23);
               iIiiIIilIliiIIil.IIlilIliiIli(var2, var25, var29, var26, var27, var30, var28, 1.0F, 0.15F, 0.15F, var7);
               iIiiIIilIliiIIil.iIIIlIlIIl(var2, var25, var29, var26, var27, var30, var28, var9, 2.0F);
               if (var11 > 0) {
                  double var31 = var17 + 8.0 - var3;
                  double var33 = var19 + 8.0 - var5;
                  if (!(var31 * var31 + var33 * var33 > 5184.0)) {
                     List var35 = var16.iiiliIiiiIIIiiIiii;
                     int var36 = 0;

                     for (int var37 = var35.size(); var36 < var37 && var11 > 0; var36++) {
                        int[] var38 = (int[])var35.get(var36);
                        float var39 = iIiiIIilIliiIIil.Ililllililil((double)var38[0]);
                        float var40 = iIiiIIilIliiIIil.Iiilliiliiil((double)var38[1]);
                        float var41 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var38[2]);
                        iIiiIIilIliiIIil.IIlilIliiIli(var2, var39, var40, var41, var39 + 1.0F, var40 + 1.0F, var41 + 1.0F, 1.0F, 0.35F, 0.35F, var8);
                        iIiiIIilIliiIIil.iIIIlIlIIl(var2, var39, var40, var41, var39 + 1.0F, var40 + 1.0F, var41 + 1.0F, var10, 1.25F);
                        var11--;
                     }
                  }
               }
            }
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }
}
