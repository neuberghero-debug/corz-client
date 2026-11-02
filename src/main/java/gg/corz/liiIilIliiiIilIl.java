package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_10256;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1304;
import net.minecraft.class_1308;
import net.minecraft.class_1321;
import net.minecraft.class_1429;
import net.minecraft.class_1439;
import net.minecraft.class_1496;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1693;
import net.minecraft.class_1694;
import net.minecraft.class_1802;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9817;
import net.minecraft.class_2902.class_2903;

public final class liiIilIliiiIilIl {
   static final int IliiillIll = 4;
   static final int IiiiillIll = 4;
   static final int liiiillIll = 0;
   static final int llIIIilIll = 3;
   static final int iiiiillIll = 5;
   static final int iIIIIilIll = 12;
   static final double iIiiillIll = 192.0;
   static final int lliiillIll = 10;
   static final int lIIIIilIll = 16;
   static final int IlIIIilIll = 10;
   static final int iliiillIll = 2;
   static final int IIIIIilIll = 3;
   private final Set<UUID> ilIIIilIll = new HashSet<>();

   static void IIIllIIliIIl(List<Ililiillliliil> now, lliIIIliliIIIl villagers, long book) {
      ArrayList var4 = new ArrayList();

      for (Ililiillliliil var6 : now) {
         if (!IiIlliIliiIl(var4, var6, 20)) {
            int var7 = 0;
            int var8 = 0;

            for (Ililiillliliil var10 : now) {
               if (Math.abs(var10.iIllIllliIlllIllli - var6.iIllIllliIlllIllli) <= 10
                  && Math.abs(var10.IillIlllilillIllli - var6.IillIlllilillIllli) <= 10
                  && Math.abs(var10.llllIllliilllIllli - var6.llllIllliilllIllli) <= 4) {
                  var7++;
                  if (var10.iillIllliIIilIllli) {
                     var8++;
                  }
               }
            }

            if (var7 >= 4) {
               villagers.iliIiiliiiii(
                  lIilllliIillll.lllliiiilillliiiil,
                  var6.iIllIllliIlllIllli,
                  var6.llllIllliilllIllli,
                  var6.IillIlllilillIllli,
                  Illlllllilll<"Illlllllilll","P7NJAYm/BP/Ltmkuhp450WXw3d8BMZ2F8R+nedwRJYUy">()
                     + (var6.iIllIllliIlllIllli >> 4)
                     + Illlllllilll<"Illlllllilll","xUFOwKQlq1Swvt1+XH/V1LkhjlMlpW51Xyon8vg=">()
                     + (var6.IillIlllilillIllli >> 4),
                  lIilllliIillll.lllliiiilillliiiil.IlIIIIIIillIIIIIIi + (var8 >= 2 ? 5 : 0),
                  var7 + Illlllllilll<"Illlllllilll","hoBaeWgaAo4cf2XvSpGhkfTnE1dmrNQIlsURF5PS5ckbCh6VkHSiQJSD7AGT9A==">(),
                  book
               );
               var4.add(var6);
            }
         }
      }
   }

   private static boolean iliIiiliiiii(class_1531 a) {
      for (class_1304 var4 : class_1304.values()) {
         if (var4 != class_1304.field_48824 && var4 != class_1304.field_55946 && !a.method_6118(var4).method_7960()) {
            return true;
         }
      }

      return a.method_6929();
   }

   public void liiiIIllIl(class_638 end, class_746 book, lliIIIliliIIIl self, boolean now, boolean undergroundOnly, long world) {
      double var8 = book.method_23317();
      double var10 = book.method_23321();
      if (book.method_5854() != null && this.ilIIIilIll.size() < 64) {
         this.ilIIIilIll.add(book.method_5854().method_5667());
      }

      double var12 = 36864.0;
      ArrayList var14 = new ArrayList();
      ArrayList var15 = new ArrayList();
      HashMap var16 = new HashMap();

      for (class_1297 var18 : end.method_18112()) {
         if (var18 != book && var18.method_5805() && !(var18 instanceof class_1657)) {
            double var19 = var18.method_23317() - var8;
            double var21 = var18.method_23321() - var10;
            if (!(var19 * var19 + var21 * var21 > var12)) {
               int var23 = var18.method_31477();
               int var24 = var18.method_31478();
               int var25 = var18.method_31479();
               if (!this.iIlIlllllill(var18, book)) {
                  String var26 = var18.method_5845();
                  boolean var27 = !undergroundOnly || lIiiIiIlilli(end, var23, var24, var25);
                  if (var18 instanceof class_1646) {
                     class_1646 var28 = (class_1646)var18;
                     boolean var31 = var28.method_7231().comp_3522() >= 2;
                     if (var27 && IilliliilIIi(var28)) {
                        var14.add(new Ililiillliliil(var23, var24, var25, var31));
                     }

                     if (var31) {
                        self.lIiiIiIlilli(
                           lIilllliIillll.iilliiiilIIiliiiil,
                           var23,
                           var24,
                           var25,
                           Illlllllilll<"Illlllllilll","abiSYA9meTzBgm/WGhY677xDZhYrmZZKTTqEzMlSomA=">() + var26,
                           world
                        );
                     }
                  } else if (var18 instanceof class_1439) {
                     if (var27) {
                        var15.add(new Ililiillliliil(var23, var24, var25, false));
                     }
                  } else if (var18 instanceof class_1533) {
                     class_1533 var29 = (class_1533)var18;
                     if (var29.method_6940().method_7960() || now && var29.method_6940().method_31574(class_1802.field_8833)) {
                        continue;
                     }

                     self.lIiiIiIlilli(
                        lIilllliIillll.liiliiiiliiiliiiil,
                        var23,
                        var24,
                        var25,
                        Illlllllilll<"Illlllllilll","OA23ROgQBe3ejfZWtFtJYyL/k6kLjyyvGpupAwXJ2HGlFQ==">() + var26,
                        world
                     );
                  } else if (var18 instanceof class_1531) {
                     class_1531 var30 = (class_1531)var18;
                     if (var30.method_6912()) {
                        continue;
                     }

                     self.iliIiiliiiii(
                        lIilllliIillll.IIIiiiiillIIiiiiil,
                        var23,
                        var24,
                        var25,
                        Illlllllilll<"Illlllllilll","hQxgXEfuufcm0Xam1jvCgzh2zvIGRogQDfByIshXfLOQCw==">() + var26,
                        iliIiiliiiii(var30) ? lIilllliIillll.IIIiiiiillIIiiiiil.IlIIIIIIillIIIIIIi : 3,
                        null,
                        world
                     );
                  } else if (var18 instanceof class_1693 && !(var18 instanceof class_1694) || var18 instanceof class_10256) {
                     self.lIiiIiIlilli(
                        lIilllliIillll.iIIiiiiilIlIiiiiil,
                        var23,
                        var24,
                        var25,
                        Illlllllilll<"Illlllllilll","sMxO0it6YGZ2I9IqPf/roXaukMvpzyt8LNm4hXHZah3d">() + var26,
                        world
                     );
                  }

                  label148: {
                     if (var18 instanceof class_1321 var34 && var34.method_6181() || var18 instanceof class_1496 var36 && var36.method_6727()) {
                        self.lIiiIiIlilli(
                           lIilllliIillll.lIiliiiiliIiliiiil,
                           var23,
                           var24,
                           var25,
                           Illlllllilll<"Illlllllilll","fn2jt/5XdDhOOBB7tRldSPC9oQoF40lJSkLwYnkPZTk=">() + var26,
                           world
                        );
                        break label148;
                     }

                     if (var18 instanceof class_1308 var37 && var37.method_16914() && !(var18 instanceof class_1646)) {
                        self.lIiiIiIlilli(
                           lIilllliIillll.Ililiiiillliliiiil,
                           var23,
                           var24,
                           var25,
                           Illlllllilll<"Illlllllilll","7ALiGZO1nY1KiF6dmcxBeRJ4+1qczEyDNtcTsffDcVJS">() + var26,
                           world
                        );
                     }
                  }

                  if (var18 instanceof class_9817) {
                     class_9817 var35 = (class_9817)var18;
                     if (var35.method_60953()) {
                        self.lIiiIiIlilli(
                           lIilllliIillll.ililiiiilIiiliiiil,
                           var23,
                           var24,
                           var25,
                           Illlllllilll<"Illlllllilll","VWTzsFJisWa8DJznDRf3gIdcbVUaWXkeH5csE/q1GJPr9w==">() + var26,
                           world
                        );
                     }
                  }

                  if (var18 instanceof class_1429 && !(var18 instanceof class_1321)) {
                     var16.computeIfAbsent(var18.method_5864(), k -> new ArrayList<>()).add(new Ililiillliliil(var23, var24, var25, false));
                  }
               }
            }
         }
      }

      IIIllIIliIIl(var14, self, world);
      IlIlllIlilIl(var15, 3, 16, lIilllliIillll.Iilliiiillilliiiil, Illlllllilll<"Illlllllilll","1RK2dPnwOkxLoK7oAMut0K21HZU68FvIIIzLCpjQFeRW">(), self, world);

      for (Entry var33 : var16.entrySet()) {
         IlIlllIlilIl(
            (List<Ililiillliliil>)var33.getValue(),
            12,
            10,
            lIilllliIillll.llIiiiiililIiiiiil,
            Illlllllilll<"Illlllllilll","5yGTZQTmtlcxt7vsM6S/xd5a20vV7ZcUdGCcn5LcQa8=">()
               + class_1299.method_5890((class_1299)var33.getKey())
               + Illlllllilll<"Illlllllilll","wi9mv6Esdcof6WSb13q+WKpGRgfXXDWEmo5KPs8=">(),
            self,
            world
         );
      }
   }

   static boolean lIiiIiIlilli(class_638 x, int world, int y, int z) {
      long var5 = -3702432958284130927L;
      var5 ^= ((long)x.method_8624(class_2903.field_13203, world, z) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) <= x.method_31607()) {
         var5 ^= ((long)x.method_8624(class_2903.field_13197, world, z) << 32 ^ var5) & -1L << 32;
      }

      return y <= 0 && (int)(var5 >>> 32) - y >= (((971916941 << 15 | 971916941 >>> 17) ^ 39) * -37 ^ -422881804);
   }

   private static boolean IiIlliIliiIl(List<Ililiillliliil> r, Ililiillliliil done, int s) {
      for (Ililiillliliil var4 : r) {
         if (Math.abs(var4.iIllIllliIlllIllli - done.iIllIllliIlllIllli) <= s && Math.abs(var4.IillIlllilillIllli - done.IillIlllilillIllli) <= s) {
            return true;
         }
      }

      return false;
   }

   static void IlIlllIlilIl(List<Ililiillliliil> clue, int spots, int prefix, lIilllliIillll radius, String now, lliIIIliliIIIl min, long book) {
      if (clue.size() >= spots) {
         ArrayList var8 = new ArrayList();

         for (Ililiillliliil var10 : clue) {
            if (!IiIlliIliiIl(var8, var10, prefix * 2)) {
               int var11 = 0;

               for (Ililiillliliil var13 : clue) {
                  if (Math.abs(var13.iIllIllliIlllIllli - var10.iIllIllliIlllIllli) <= prefix
                     && Math.abs(var13.IillIlllilillIllli - var10.IillIlllilillIllli) <= prefix
                     && Math.abs(var13.llllIllliilllIllli - var10.llllIllliilllIllli) <= prefix) {
                     var11++;
                  }
               }

               if (var11 >= spots) {
                  min.lIiiIiIlilli(
                     radius,
                     var10.iIllIllliIlllIllli,
                     var10.llllIllliilllIllli,
                     var10.IillIlllilillIllli,
                     now
                        + (var10.iIllIllliIlllIllli >> 4)
                        + Illlllllilll<"Illlllllilll","xUFOwKQlq1Swvt1+XH/V1LkhjlMlpW51Xyon8vg=">()
                        + (var10.IillIlllilillIllli >> 4),
                     book
                  );
                  var8.add(var10);
               }
            }
         }
      }
   }

   private boolean iIlIlllllill(class_1297 e, class_746 self) {
      if (!e.method_5626(self) && self.method_5854() != e && !this.ilIIIilIll.contains(e.method_5667())) {
         if (e instanceof class_1321 var3 && var3.method_6181() && var3.method_6171(self)) {
            return true;
         }

         if (e instanceof class_9817 var4 && var4.method_60953() && var4.method_60952() == self) {
            return true;
         }

         return false;
      } else {
         return true;
      }
   }

   private static boolean IilliliilIIi(class_1646 v) {
      String var1 = v.method_7231().comp_3521().method_55840();
      return !var1.endsWith(Illlllllilll<"Illlllllilll","+HU+MyIWLX+WB12MmMK8cKGNXy+UIG9zAC/y2JslDl1s">())
         && !var1.endsWith(Illlllllilll<"Illlllllilll","uxz8yhKRJopwmEe+eb/lWj7q7/K2ahlF+0VCCZcfX4h4j4g=">());
   }

   public void IliIlllilIi() {
      this.ilIIIilIll.clear();
   }
}
