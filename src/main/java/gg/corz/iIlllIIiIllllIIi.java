package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public final class iIlllIIiIllllIIi {
   public static final List<IIlIIIilIlIIIi> IliIiiliil = List.of(new IIlIIIilIlIIIi(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375));
   static final double IlIliiliil = 10.0;
   public static final double liiIiiliil = 1.62;
   static final int Illliiliil = 256;
   static final int ilIliiliil = 3;
   static final double IIIliiliil = 0.26;
   public static final List<IIlIIIilIlIIIi> iliIiiliil = List.of();
   static final double IIlliiliil = 0.0625;
   public static final AtomicInteger IiIliiliil = new AtomicInteger();
   public static final List<IIlIIIilIlIIIi> iIiIiiliil = List.of(iIlllIIiIllllIIi.lIiIiiliil);
   static final double llIliiliil = 1.0E-6;
   private static final int[] iiIliiliil = new int[]{0, 1, 2, 3, 4, 5};
   public static final IIlIIIilIlIIIi lIiIiiliil = new IIlIIIilIlIIIi(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
   private static final List<double[]> lIlliiliil;
   static final int iIIliiliil = 2;
   static final double lIIliiliil = 0.8;
   public static final List<IIlIIIilIlIIIi> lliIiiliil = List.of(new IIlIIIilIlIIIi(0.0, 0.0, 0.0, 1.0, 0.125, 1.0));
   private static final List<double[]> iIlliiliil;
   public static int IIiIiiliil;
   public static final String IiiIiiliil = "SUPPORT_TEAMMATE";
   public static final double iiiIiiliil = 1.27;
   static final double liIliiliil = 2.0;

   static int illIlIilIl(double dz, double dx) {
      if (Math.abs(dz) > Math.abs(dx)) {
         return dz >= 0.0 ? 5 : 4;
      } else {
         return dx >= 0.0 ? 3 : 2;
      }
   }

   public static Illiiilllliiil iliIiiliiiii(llilIiililIi options, Set<lIiliiliIiliil> mayDescend, lIiliiliIiliil feet, iIliIIiIlliIIi dirt, boolean base) {
      long var33 = -5329810976966394423L;
      long var35 = -5092085135843614730L;
      long var37 = 6293795187629956801L;
      long var39 = -5739210730984248496L;
      long var29 = 875759051979025819L;
      long var31 = 2528833104520026650L;
      if (mayDescend.isEmpty()) {
         return new Illiiilllliiil(ilIlIIliIiIlIIli.lllIllIlIi, List.of(), List.of(), List.of(), List.of(), List.of(), 0, "");
      } else {
         long var5 = dirt.Iliilliiilii() > 0L ? System.nanoTime() + dirt.Iliilliiilii() : Long.MAX_VALUE;
         iIliIIiIlliIIi var7 = dirt;
         IIiiIiIllIiiIiIl var8 = new IIiiIiIllIiiIiIl(options, List.of());
         var8.llillliIll = base;

         for (lIiliiliIiliil var10 : mayDescend) {
            var8.llIIlilIIl(var10);
         }

         LinkedHashSet var43 = new LinkedHashSet(mayDescend);
         ArrayList var44 = new ArrayList();
         ArrayList var11 = new ArrayList();
         lIiliiliIiliil var12 = feet;
         var29 ^= (0L ^ var29) & -1L << 32;
         var29 ^= (0L ^ var29) & -1L >>> 32;
         var31 ^= (0L ^ var31) & -1L << 32;
         var31 ^= (0L ^ var31) & -1L >>> 32;
         var33 ^= (-4294967296L ^ var33) & -1L << 32;
         var33 ^= (0L ^ var33) & -1L >>> 32;
         var35 ^= (0L ^ var35) & -1L << 32;
         Object var20 = Set.of();

         while (!var43.isEmpty()) {
            int var10000 = (int)var31;
            var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32;
            if (var10000 >= 128) {
               break;
            }

            if (System.nanoTime() > var5) {
               var29 ^= (1L ^ var29) & -1L >>> 32;
               break;
            }

            var8.ilillliIll.clear();
            IIlilillIlilil var21 = IIlilillIlilil.IiIlliIliiIl(var8, var12, var7, 0, var43, var43);
            IIlilillIlilil var22 = var21;
            if (var8.llillliIll) {
               var8.IiillliIll = IlIlllIlilIl(var8, var21, var43);
            }

            liIllIlliiIllIll var23 = IiIlliIliiIl(var8, var21, var7, var43, var12);
            if (var23 == null && var7.IIIilIIiiIIi() - (int)(var29 >>> 32) > 0) {
               var21 = IIlilillIlilil.IiIlliIliiIl(var8, var12, var7, var7.IIIilIIiiIIi() - (int)(var29 >>> 32), var43, var43);
               var23 = IiIlliIliiIl(var8, var21, var7, var43, var12);
            }

            if (var23 != null && var7.IIIilIIiiIIi() - (int)(var29 >>> 32) > 0) {
               var35 ^= ((long)var23.IIIiiillll.Illlllllilll() ^ var35) & -1L >>> 32;
               var37 ^= (0L ^ var37) & -1L << 32;

               for (lIiliiliIiliil var27 : var43) {
                  if (var27.Illlllllilll() > (int)var35) {
                     var37 ^= (4294967296L ^ var37) & -1L << 32;
                     break;
                  }
               }

               if ((int)(var37 >>> 32) != 0) {
                  IIlilillIlilil var61 = IIlilillIlilil.IiIlliIliiIl(var8, var12, var7, var7.IIIilIIiiIIi() - (int)(var29 >>> 32), var43, var43);
                  liIllIlliiIllIll var70 = IiIlliIliiIl(var8, var61, var7, var43, var12);
                  if (var70 != null && var70.IIIiiillll.Illlllllilll() > (int)var35) {
                     var21 = var61;
                     var23 = var70;
                  }
               }
            }

            if (var23 == null && var8.llillliIll) {
               lIiliiliIiliil var24 = null;
               if (var43.contains(var12.IilliliilIIi()) && var43.contains(var12.lIiiIiIlilli(2))) {
                  var24 = var12.IilliliilIIi();
               } else {
                  for (lIiliiliIiliil var62 : var8.IiillliIll) {
                     if (!var43.contains(var62.liiiIIllIl()) && (var24 == null || var62.Illlllllilll() > var24.Illlllllilll())) {
                        var24 = var62;
                     }
                  }
               }

               if (var24 != null && (int)(var29 >>> 32) > 0 && var11.size() > (int)(var29 >>> 32)) {
                  var37 ^= (0L ^ var37) & -1L << 32;

                  for (lIiliiliIiliil var71 : var43) {
                     if (!var71.equals(var24) && !var8.IiillliIll.contains(var71) && var71.Illlllllilll() >= var24.Illlllllilll()) {
                        var37 ^= (4294967296L ^ var37) & -1L << 32;
                        break;
                     }
                  }

                  if ((int)(var37 >>> 32) != 0) {
                     var31 ^= (4294967296L ^ var31) & -1L << 32;
                     break;
                  }
               }

               lIiliiliIiliil var55 = var24 == null ? null : IIIllIIliIIl(var8, var24);
               if (var55 != null) {
                  if (!var24.equals(var12.IilliliilIIi())) {
                     for (IIiIliIilIiIliIi var74 : var22.lIiiIiIlilli(var24.liiiIIllIl())) {
                        if (var74.iiiIlliIIi == ilIlIilIiIlIil.IiIiiilIiliIiiilIi) {
                           var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var74.lIIllliIIi, var74.lIIllliIIi, 0, null, ""));
                           var12 = var74.lIIllliIIi;
                        } else if (var74.iiiIlliIIi == ilIlIilIiIlIil.IlliiilIillliiilIi) {
                           if (!var12.equals(var74.IIIllliIIi)) {
                              var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var74.IIIllliIIi, var74.IIIllliIIi, 0, null, ""));
                           }

                           var8.IiIIlliIIl(var74.iIIllliIIi);
                           var43.remove(var74.iIIllliIIi);
                           var11.add(var74.iIIllliIIi);
                           var44.add(
                              new liIIIlliiIIIll(
                                 ilIlIilIiIlIil.IlliiilIillliiilIi,
                                 var74.iIIllliIIi,
                                 var74.lIIllliIIi,
                                 1,
                                 null,
                                 iIIilIlIil<"iIIilIlIil","rVIUCP3zwSgQv/3GZ9u4qmIuBsHSSiG08PEH5uK6WJDvtemN65nFWex0yPl6fQ==">()
                              )
                           );
                           var12 = var74.lIIllliIIi;
                        }
                     }

                     if (!var12.equals(var24.liiiIIllIl())) {
                        var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var24.liiiIIllIl(), var24.liiiIIllIl(), 0, null, ""));
                        var12 = var24.liiiIIllIl();
                     }
                  }

                  var8.IiIIlliIIl(var24);
                  var43.remove(var24);
                  var11.add(var24);
                  var44.add(
                     new liIIIlliiIIIll(
                        ilIlIilIiIlIil.IlliiilIillliiilIi,
                        var24,
                        var24,
                        1,
                        null,
                        iIIilIlIil<"iIIilIlIil","rVIUCP3zwSgQv/3GZ9u4qmIuBsHSSiG08PEH5uK6WJDvtemN65nFWex0yPl6fQ==">()
                     )
                  );
                  var12 = var55;
                  continue;
               }
            }

            if (var23 == null && base && (int)(var33 >>> 32) < 0 && var7.IIIilIIiiIIi() - (int)(var29 >>> 32) > 0 && !var43.contains(var12.IilliliilIIi())) {
               var35 ^= (1L ^ var35) & -1L >>> 32;

               for (lIiliiliIiliil var64 : var43) {
                  if (var64.Illlllllilll() > var12.Illlllllilll() - 2
                     && (var64.Illlllllilll() >= var12.Illlllllilll() || !var43.contains(var64.IilliliilIIi()))) {
                     var35 ^= (0L ^ var35) & -1L >>> 32;
                     break;
                  }
               }

               if ((int)var35 == 0 && !var8.ilillliIll.isEmpty()) {
                  var35 ^= (1L ^ var35) & -1L >>> 32;

                  for (lIiliiliIiliil var65 : var43) {
                     if (!var8.ilillliIll.contains(var65)
                        && var65.Illlllllilll() > var12.Illlllllilll() - 2
                        && (var65.Illlllllilll() >= var12.Illlllllilll() || !var43.contains(var65.IilliliilIIi()))) {
                        var35 ^= (0L ^ var35) & -1L >>> 32;
                        break;
                     }
                  }
               }

               if ((int)var35 != 0) {
                  var8.iIillliIll = true;

                  try {
                     var21 = IIlilillIlilil.IiIlliIliiIl(
                        var8, var12, var7.Iilililiiili() > 4 ? var7.Iilllilliill(4) : var7, var7.IIIilIIiiIIi() - (int)(var29 >>> 32), Set.of(), var43
                     );
                     var23 = IiIlliIliiIl(var8, var21, var7, var43, var12);
                  } finally {
                     var8.iIillliIll = false;
                  }

                  if (var23 != null) {
                     var33 ^= ((long)var44.size() << 32 ^ var33) & -1L << 32;
                     var33 ^= ((long)var11.size() ^ var33) & -1L >>> 32;
                     var35 ^= ((long)((int)(var29 >>> 32)) << 32 ^ var35) & -1L << 32;
                     var20 = new LinkedHashSet(var43);
                     if (dirt.Iliilliiilii() > 0L) {
                        var5 = Math.max(var5, System.nanoTime() + dirt.Iliilliiilii());
                     }
                  }
               }
            }

            if (var23 != null && (int)(var29 >>> 32) > 0 && var11.size() > (int)(var29 >>> 32)) {
               HashSet var51 = new HashSet();

               for (IIiIliIilIiIliIi var66 : var21.lIiiIiIlilli(var23.lIIiiillll)) {
                  if (var66.iiiIlliIIi == ilIlIilIiIlIil.IlliiilIillliiilIi) {
                     var51.add(var66.iIIllliIIi);
                  }
               }

               var37 ^= (0L ^ var37) & -1L << 32;
               if (!var51.isEmpty()) {
                  for (lIiliiliIiliil var72 : var43) {
                     if (!var51.contains(var72) && !var72.equals(var23.IIIiiillll) && var72.Illlllllilll() > var23.IIIiiillll.Illlllllilll()) {
                        var37 ^= (4294967296L ^ var37) & -1L << 32;
                        break;
                     }
                  }
               }

               if ((int)(var37 >>> 32) != 0) {
                  var31 ^= (4294967296L ^ var31) & -1L << 32;
                  break;
               }
            }

            if (var23 == null) {
               break;
            }

            for (IIiIliIilIiIliIi var59 : var21.lIiiIiIlilli(var23.lIIiiillll)) {
               switch (var59.iiiIlliIIi) {
                  case illiiilIiIiliiilIi:
                     var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var59.lIIllliIIi, var59.lIIllliIIi, 0, null, ""));
                     var12 = var59.lIIllliIIi;
                     if (var59.IiIllliIIi != null) {
                        var8.IiIIlliIIl(var59.IiIllliIIi);
                        var43.remove(var59.IiIllliIIi);
                        var11.add(var59.IiIllliIIi);
                        var44.add(
                           new liIIIlliiIIIll(
                              ilIlIilIiIlIil.illiiilIiIiliiilIi,
                              var59.IiIllliIIi,
                              var59.lIIllliIIi,
                              1,
                              null,
                              iIIilIlIil<"iIIilIlIil","xErmqiGozYpLcUfitqjJTS1qaziVz56AV9FzGAAzE3UyY0O2pJjVyOg=">()
                           )
                        );
                     }
                     break;
                  case lIliiilIiiIliiilIi:
                     if (!var12.equals(var59.IIIllliIIi)) {
                        var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var59.IIIllliIIi, var59.IIIllliIIi, 0, null, ""));
                     }

                     for (var37 ^= (0L ^ var37) & -1L >>> 32; (int)var37 < var59.IlIllliIIi; var37 ^= (var37 ^ var37 + (long)1) & -1L >>> 32) {
                        lIiliiliIiliil var73 = var59.IIIllliIIi.iIlIlllllill((int)var37);
                        var8.llIIlilIIl(var73);
                        var43.add(var73);
                     }

                     var29 ^= ((long)((int)(var29 >>> 32) + var59.IlIllliIIi) << 32 ^ var29) & -1L << 32;
                     var44.add(
                        new liIIIlliiIIIll(
                           ilIlIilIiIlIil.iiIiiilIiIIliiilIi,
                           var59.IIIllliIIi,
                           var59.lIIllliIIi,
                           var59.IlIllliIIi,
                           null,
                           iIIilIlIil<"iIIilIlIil","G9Kc+cBO+YHC0ACv5qeCKBjx+Ydrxmr8nTGMbcW4nO9aaw==">() + var23.IIIiiillll
                        )
                     );
                     var12 = var59.lIIllliIIi;
                     break;
                  case IIiiiilIilIiiiilIi:
                     lIiliiliIiliil var68 = var59.llIllliIIi == null ? var59.IIIllliIIi : var59.llIllliIIi;
                     if (!var12.equals(var68)) {
                        var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var68, var68, 0, null, ""));
                     }

                     var8.llIIlilIIl(var59.iIIllliIIi);
                     var43.add(var59.iIIllliIIi);
                     var29 += 4294967296L;
                     var44.add(
                        new liIIIlliiIIIll(
                           ilIlIilIiIlIil.lIliiilIiiIliiilIi,
                           var59.iIIllliIIi,
                           var68,
                           1,
                           var59.ilIllliIIi,
                           iIIilIlIil<"iIIilIlIil","qbXd+CqKIQStKsgraLVbGsMesOs6VF2xUSHXUz4Dq8mdOKpzHRvR1pxT">() + var23.IIIiiillll
                        )
                     );
                     var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var59.lIIllliIIi, var59.lIIllliIIi, 0, null, ""));
                     var12 = var59.lIIllliIIi;
                     if (var59.IiIllliIIi != null) {
                        var8.IiIIlliIIl(var59.IiIllliIIi);
                        var43.remove(var59.IiIllliIIi);
                        var11.add(var59.IiIllliIIi);
                        var44.add(
                           new liIIIlliiIIIll(
                              ilIlIilIiIlIil.illiiilIiIiliiilIi,
                              var59.IiIllliIIi,
                              var59.lIIllliIIi,
                              1,
                              null,
                              iIIilIlIil<"iIIilIlIil","xErmqiGozYpLcUfitqjJTS1qaziVz56AV9FzGAAzE3UyY0O2pJjVyOg=">()
                           )
                        );
                     }
                     break;
                  case IiIiiilIiliIiiilIi:
                     if (!var12.equals(var59.IIIllliIIi)) {
                        var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var59.IIIllliIIi, var59.IIIllliIIi, 0, null, ""));
                     }

                     var8.IiIIlliIIl(var59.iIIllliIIi);
                     var43.remove(var59.iIIllliIIi);
                     var11.add(var59.iIIllliIIi);
                     var44.add(
                        new liIIIlliiIIIll(
                           ilIlIilIiIlIil.IlliiilIillliiilIi,
                           var59.iIIllliIIi,
                           var59.lIIllliIIi,
                           1,
                           null,
                           iIIilIlIil<"iIIilIlIil","rVIUCP3zwSgQv/3GZ9u4qmIuBsHSSiG08PEH5uK6WJDvtemN65nFWex0yPl6fQ==">()
                        )
                     );
                     var12 = var59.lIIllliIIi;
               }
            }

            if (!var12.equals(var23.lIIiiillll)) {
               var44.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var23.lIIiiillll, var23.lIIiiillll, 0, null, ""));
            }

            var44.add(
               new liIIIlliiIIIll(
                  ilIlIilIiIlIil.illiiilIiIiliiilIi,
                  var23.IIIiiillll,
                  var23.lIIiiillll,
                  1,
                  null,
                  iIIilIlIil<"iIIilIlIil","wZO3D7iNlTeZLuu1RVI/cdLJzHuSBKgVh/CGsjT1GaPrD861/oieWyg=">()
               )
            );
            var8.IiIIlliIIl(var23.IIIiiillll);
            var43.remove(var23.IIIiiillll);
            var11.add(var23.IIIiiillll);
         }

         var39 ^= (0L ^ var39) & -1L << 32;

         while ((int)(var31 >>> 32) == 0 && (int)var29 == 0 && var8.IIIIllIIIl(var12.IilliliilIIi()) && var43.contains(var12.IilliliilIIi())) {
            int var85 = (int)(var39 >>> 32);
            var39 += 4294967296L;
            if (var85 >= 16) {
               break;
            }

            lIiliiliIiliil var46 = var12.IilliliilIIi();
            var8.IiIIlliIIl(var46);
            lIiliiliIiliil var48 = null;

            for (var35 ^= (0L ^ var35) & -1L >>> 32; (int)var35 < 2 && var48 == null; var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
               if (var8.IiiIlliiIl(var46.lIiiIiIlilli((int)var35))) {
                  var48 = var46.lIiiIiIlilli((int)var35);
               }
            }

            if (var48 == null) {
               var8.llIIlilIIl(var46);
               break;
            }

            var44.add(
               new liIIIlliiIIIll(
                  ilIlIilIiIlIil.IlliiilIillliiilIi,
                  var46,
                  var46,
                  1,
                  null,
                  iIIilIlIil<"iIIilIlIil","rVIUCP3zwSgQv/3GZ9u4qmIuBsHSSiG08PEH5uK6WJDvtemN65nFWex0yPl6fQ==">()
               )
            );
            var43.remove(var46);
            var11.add(var46);
            var12 = var48;
         }

         if ((int)(var33 >>> 32) >= 0
            && (
               !var20.containsAll(var43) || var43.size() >= var20.size() || (int)(var31 >>> 32) == 0 && (int)var29 == 0 && var43.contains(var12.IilliliilIIi())
            )) {
            var44.subList((int)(var33 >>> 32), var44.size()).clear();
            var11.subList((int)var33, var11.size()).clear();
            var43.clear();
            var43.addAll((Collection)var20);
            var29 ^= ((long)((int)(var35 >>> 32)) << 32 ^ var29) & -1L << 32;
            var31 ^= (0L ^ var31) & -1L << 32;
            var29 ^= (0L ^ var29) & -1L >>> 32;
         }

         ArrayList var47 = new ArrayList();

         for (lIiliiliIiliil var53 : var43) {
            var47.add(
               new iIIIliiIlIIlii(
                  var53,
                  iIIilIlIil<"iIIilIlIil","uTFM9daMPZijd5SgkRBtpf33GJg6vDVF3Nf4mafPGvifDOV1jyaw31wRiRJkBIA9QzapfZqasS+ra0eylavdPmCDEsKXcsc9s9nYoj05JDFfKXVlOdYkNj8N6BB2Z7S3aqpnCptmtU5UQwLqfnuKo2G4X5yFxLMpLg84B9ahwSQQ">(),
                  List.of()
               )
            );
         }

         String var50 = (int)var29 != 0
            ? iIIilIlIil<"iIIilIlIil","Aj8vJn6FZfc1d66ca/5aQRkCgcEX/TdFGR8AE0s+4Azt7sWNbkJb">()
            : ((int)(var31 >>> 32) != 0 ? iIIilIlIil<"iIIilIlIil","3iN/Hi0BPfWnzPgzUM9PM0O4rNJA0wxuSDH5kNWvASDI1itGPLJg">() : "");
         ilIlIIliIiIlIIli var54 = var43.isEmpty() ? ilIlIIliIiIlIIli.iIlIllIlIi : ilIlIIliIiIlIIli.IllIllIlIi;
         List var60 = var43.isEmpty()
            ? List.of()
            : List.of(
               new ilIiiiIiIiii(
                  List.copyOf(var43),
                  List.copyOf(var47),
                  iIIilIlIil<"iIIilIlIil","QVkt5zMsFxnWMRSRhVDfz/xeowDPxnURHn1DXq8bSM1PG2Q//hD3EP6QHdGH/Gwrf+7VfaRkuqgioA==">()
               )
            );
         return new Illiiilllliiil(var54, List.copyOf(var44), List.copyOf(var11), List.copyOf(var43), List.copyOf(var47), var60, (int)(var29 >>> 32), var50);
      }
   }

   public static Illiiilllliiil iIlIlllllill(llilIiililIi base, List<liiIililiiiIilil> feet, lIiliiliIiliil targets, iIliIIiIlliIIi options) {
      return IilliliilIIi(base, feet, targets, options, null);
   }

   private static List<ilIiiiIiIiii> iIlllIllll(List<lIiliiliIiliil> blockers, List<iIIIliiIlIIlii> unsolved, String escalations) {
      long var19 = 4201477443395005259L;
      HashMap var3 = new HashMap();

      for (iIIIliiIlIIlii var5 : unsolved) {
         var3.put(var5.IliIlllilIi(), var5);
      }

      LinkedHashSet var21 = new LinkedHashSet(blockers);
      HashMap var22 = new HashMap();
      HashMap var6 = new HashMap();
      HashSet var7 = new HashSet();
      ArrayDeque var8 = new ArrayDeque();
      ArrayList var9 = new ArrayList();
      int[] var10 = new int[]{0};

      for (lIiliiliIiliil var12 : var21) {
         if (!var22.containsKey(var12)) {
            lllllillll(var12, var21, var3, var22, var6, var7, var8, var9, var10);
         }
      }

      ArrayList var23 = new ArrayList();
      String var24 = escalations.isBlank() ? iIIilIlIil<"iIIilIlIil","tHaA+aLLCzNKTD1YsgFHO5utNBDVmXM8eicisyfE4m0=">() : escalations.trim();

      for (List var14 : var9) {
         var19 ^= (
               (long)(
                        var14.size() == 1 && var3.containsKey(var14.get(0)) && ((iIIIliiIlIIlii)var3.get(var14.get(0))).iIlIlllllill().contains(var14.get(0))
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var19
            )
            & -1L << 32;
         if (var14.size() >= 2 || (int)(var19 >>> 32) != 0) {
            ArrayList var16 = new ArrayList();

            for (lIiliiliIiliil var18 : var14) {
               if (var3.containsKey(var18)) {
                  var16.add((iIIIliiIlIIlii)var3.get(var18));
               }
            }

            var23.add(
               new ilIiiiIiIiii(
                  List.copyOf(var14),
                  List.copyOf(var16),
                  iIIilIlIil<"iIIilIlIil","HFQAV66powPhMq9VG/3REWziDKO++D6X17nj5Cit9PGeAqJ9qefCdld2vEMR2O53Of9uM63EYCmyWLta5gQk6Ok0J2xj">()
                     + var24
                     + iIIilIlIil<"iIIilIlIil","M4iAZxrY47hsbO3ABaOAEeRht30ykAv1bkwf3Y+S4U/YG8gseBnO+7npHnTBHnxswgUEw3hOB7yflpcjwDKBSiUFJ5Q/zW4n6yfz7qxosXuW0EUYOULB6rdENWrB2ZZWXtri1J6mno9qtwNMTgZWmyvegDXHRZ0=">()
               )
            );
         }
      }

      if (var23.isEmpty()) {
         ArrayList var25 = new ArrayList();

         for (lIiliiliIiliil var15 : blockers) {
            if (var3.containsKey(var15)) {
               var25.add((iIIIliiIlIIlii)var3.get(var15));
            }
         }

         var23.add(
            new ilIiiiIiIiii(
               List.copyOf(blockers),
               List.copyOf(var25),
               iIIilIlIil<"iIIilIlIil","wwSXClVstvOz+LPd73t9mCWFqELY9pqCdSLrXJFVwoUPWxXXKvlf2mmWwxCwIYDL5WYwBu8oghNQXpkHWloiuBPw4Vqedbg5blqjj/rmwTWZMT4UzVmBD3k7uM6xbU5O9GXeJKwzVWvO">()
                  + var24
            )
         );
      }

      return var23;
   }

   private static liIllIlliiIllIll Illlllllilll(
      IIiiIiIllIiiIiIl nav, IIlilillIlilil feet, iIliIIiIlliIIi opt, Set<lIiliiliIiliil> locallyBanned, lIiliiliIiliil w, Set<Long> remaining
   ) {
      long var33 = 1485992864190210059L;
      long var35 = 101913790765985105L;
      double var6 = opt.Iiilliiliiil();
      var33 ^= ((long)((int)Math.ceil(var6)) << 32 ^ var33) & -1L << 32;
      liIllIlliiIllIll var9 = null;

      for (lIiliiliIiliil var11 : locallyBanned) {
         if ((var9 == null || var11.Illlllllilll() >= var9.IIIiiillll.Illlllllilll()) && (!nav.llillliIll || !nav.IiillliIll.contains(var11))) {
            liIllIlliiIllIll var12 = null;

            for (lIiliiliIiliil var14 : feet.IliIlllilIi()) {
               if (Math.abs(var14.IIlllIlliIll() - var11.IIlllIlliIll()) <= (int)(var33 >>> 32)
                  && Math.abs(var14.Iilllilliill() - var11.Iilllilliill()) <= (int)(var33 >>> 32)
                  && var14.Illlllllilll() >= var11.Illlllllilll() - 4
                  && var14.Illlllllilll() <= var11.Illlllllilll() + 3
                  && (
                     var14.Illlllllilll() != var11.Illlllllilll() - 4
                        || Math.abs(var14.IIlllIlliIll() - var11.IIlllIlliIll()) <= 1 && Math.abs(var14.Iilllilliill() - var11.Iilllilliill()) <= 1
                  )
                  && !var14.equals(var11)
                  && !var14.liiiIIllIl().equals(var11)
                  && !var14.IilliliilIIi().equals(var11)
                  && (
                     !locallyBanned.contains(var11.IilliliilIIi())
                        || var14.Illlllllilll() <= var11.Illlllllilll() + 2
                           && (
                              var14.Illlllllilll() != var11.Illlllllilll() + 2
                                 || Math.abs(var14.IIlllIlliIll() - var11.IIlllIlliIll()) + Math.abs(var14.Iilllilliill() - var11.Iilllilliill()) == 1
                           )
                  )
                  && !remaining.contains(iIliIIiIlliIIi.liiiIIllIl(var11, var14))
                  && !opt.iIlIlllllill(var11, var14)) {
                  double var15 = feet.liiiIIllIl(var14) - (nav.iIillliIll && locallyBanned.contains(var14.IilliliilIIi()) ? 1000.0 : 0.0);
                  if (nav.iIillliIll && feet.IilliliilIIi(var14).IilliliilIIi().contains(var14.IilliliilIIi())) {
                     var15 += 500.0;
                  }

                  if (var12 == null || !(var15 >= var12.iIIiiillll)) {
                     nav.Iiilliiliiil(feet.IilliliilIIi(var14));

                     try {
                        if (nav.IiiIlliiIl(var14) && nav.IIIIllIIIl(var11)) {
                           double[] var17 = nav.iiiIlIIIll(var14, var14.Illlllllilll() == var11.Illlllllilll() - 4);
                           double var18 = (double)var11.IIlllIlliIll() + 0.5;
                           double var20 = (double)var11.Illlllllilll() + 0.5;
                           double var22 = (double)var11.Iilllilliill() + 0.5;
                           if (!(ilIllIiIll(var17, var18, var20, var22) > (var6 + 0.87) * (var6 + 0.87))) {
                              var33 ^= (0L ^ var33) & -1L >>> 32;
                              var35 ^= (0L ^ var35) & -1L << 32;

                              label348:
                              while (true) {
                                 if ((int)(var35 >>> 32) < 6 && (int)var33 == 0) {
                                    int[] var26 = iiIiIIilIIliIIil.liiiIIllIl((int)(var35 >>> 32));
                                    Iterator var27 = lliIliliIl(false).iterator();

                                    while (true) {
                                       if (var27.hasNext()) {
                                          double[] var28 = (double[])var27.next();
                                          double[] var29 = iiiIlIIIll(var11, lIiIiiliil, (int)(var35 >>> 32), var28[0], var28[1]);
                                          double var30 = (var17[0] - var29[0]) * (double)var26[0]
                                             + (var17[1] - var29[1]) * (double)var26[1]
                                             + (var17[2] - var29[2]) * (double)var26[2];
                                          if (var30 <= 1.0E-4
                                             || ilIllIiIll(var17, var29[0], var29[1], var29[2]) > var6 * var6
                                             || !nav.ilIllIiIll(var17, var29, var11, true)) {
                                             continue;
                                          }

                                          var33 ^= (1L ^ var33) & -1L >>> 32;
                                       }

                                       var35 += 4294967296L;
                                       continue label348;
                                    }
                                 }

                                 if ((int)var33 != 0) {
                                    var12 = new liIllIlliiIllIll(var11, var14, var15);
                                 }
                                 break;
                              }
                           }
                        }
                     } finally {
                        nav.IIIilIIiiIIi();
                     }
                  }
               }
            }

            if (var12 != null
               && (
                  var9 == null
                     || var11.Illlllllilll() > var9.IIIiiillll.Illlllllilll()
                     || var11.Illlllllilll() == var9.IIIiiillll.Illlllllilll() && var12.iIIiiillll < var9.iIIiiillll
               )) {
               var9 = var12;
            }
         }
      }

      return var9;
   }

   static boolean iilllIIill(IIiiIiIllIiiIiIl w, lIiliiliIiliil s, lIiliiliIiliil placing) {
      long var12 = 341959747964548080L;
      long var14 = -2326930254866673338L;
      if (w.IIillliIll != Integer.MIN_VALUE && s.Illlllllilll() > w.IIillliIll + 2) {
         var12 ^= ((long)(placing != null && w.illllliIll.add(placing) ? 1 : 0) << 32 ^ var12) & -1L << 32;

         try {
            ArrayDeque var4 = new ArrayDeque();
            HashSet var5 = new HashSet();
            var4.add(s);
            var5.add(s);
            ArrayList var6 = new ArrayList();

            while (!var4.isEmpty() && var5.size() < 256) {
               if (Thread.currentThread().isInterrupted()) {
                  var12 ^= (0L ^ var12) & -1L >>> 32;
                  return (boolean)((int)var12);
               }

               lIiliiliIiliil var7 = (lIiliiliIiliil)var4.poll();
               if (var7.Illlllllilll() <= w.IIillliIll) {
                  var14 ^= (4294967296L ^ var14) & -1L << 32;
                  return (boolean)((int)(var14 >>> 32));
               }

               if (!var7.equals(s) && w.lIillliIll.contains(var7)) {
                  var14 ^= (4294967296L ^ var14) & -1L << 32;
                  return (boolean)((int)(var14 >>> 32));
               }

               lIiliiliIiliil var8 = var7;

               while (w.IIIIllIIIl(var8.IilliliilIIi()) && var8.Illlllllilll() > w.IIillliIll) {
                  var8 = var8.IilliliilIIi();
               }

               if (var8.Illlllllilll() <= w.IIillliIll) {
                  var14 ^= (1L ^ var14) & -1L >>> 32;
                  return (boolean)((int)var14);
               }

               if (!var8.equals(var7) && var5.add(var8)) {
                  var4.add(var8);
               }

               var6.clear();
               IIlilillIlilil.IIlllIlliIll(w, var7, var6);

               for (IIiIliIilIiIliIi var10 : var6) {
                  if (Math.abs(var10.iIlIlllllill().IIlllIlliIll() - s.IIlllIlliIll()) <= 8
                     && Math.abs(var10.iIlIlllllill().Iilllilliill() - s.Iilllilliill()) <= 8
                     && var5.add(var10.iIlIlllllill())) {
                     var4.add(var10.iIlIlllllill());
                  }
               }
            }

            var12 ^= (0L ^ var12) & -1L >>> 32;
            return (boolean)((int)var12);
         } finally {
            if ((int)(var12 >>> 32) != 0) {
               w.illllliIll.remove(placing);
            }
         }
      } else {
         return true;
      }
   }

   private static boolean Iilllilliill(IIiiIiIllIiiIiIl opt, iIliIIiIlliIIi s, Set<lIiliiliIiliil> d, lIiliiliIiliil remaining, lIiliiliIiliil w) {
      long var22 = 9041230445392071756L;
      double var5 = s.Iiilliiliiil();
      var22 ^= ((long)((int)Math.ceil(var5)) << 32 ^ var22) & -1L << 32;
      if (Math.abs(w.IIlllIlliIll() - remaining.IIlllIlliIll()) <= (int)(var22 >>> 32)
         && Math.abs(w.Iilllilliill() - remaining.Iilllilliill()) <= (int)(var22 >>> 32)) {
         if (w.Illlllllilll() >= remaining.Illlllllilll() - 4
            && w.Illlllllilll() <= remaining.Illlllllilll() + 3
            && (
               w.Illlllllilll() != remaining.Illlllllilll() - 4
                  || Math.abs(w.IIlllIlliIll() - remaining.IIlllIlliIll()) <= 1 && Math.abs(w.Iilllilliill() - remaining.Iilllilliill()) <= 1
            )) {
            if (!w.equals(remaining) && !w.liiiIIllIl().equals(remaining) && !w.IilliliilIIi().equals(remaining)) {
               if (!d.contains(remaining.IilliliilIIi())
                  || w.Illlllllilll() <= remaining.Illlllllilll() + 2
                     && (
                        w.Illlllllilll() != remaining.Illlllllilll() + 2
                           || Math.abs(w.IIlllIlliIll() - remaining.IIlllIlliIll()) + Math.abs(w.Iilllilliill() - remaining.Iilllilliill()) == 1
                     )) {
                  if (opt.IiiIlliiIl(w) && opt.IIIIllIIIl(remaining)) {
                     double[] var8 = opt.iiiIlIIIll(w, w.Illlllllilll() == remaining.Illlllllilll() - 4);
                     double var9 = (double)remaining.IIlllIlliIll() + 0.5;
                     double var11 = (double)remaining.Illlllllilll() + 0.5;
                     double var13 = (double)remaining.Iilllilliill() + 0.5;
                     if (ilIllIiIll(var8, var9, var11, var13) > (var5 + 0.87) * (var5 + 0.87)) {
                        return false;
                     } else {
                        for (long var25 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var25 < 6; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
                           int[] var16 = iiIiIIilIIliIIil.liiiIIllIl((int)var25);

                           for (double[] var18 : lliIliliIl(false)) {
                              double[] var19 = iiiIlIIIll(remaining, lIiIiiliil, (int)var25, var18[0], var18[1]);
                              double var20 = (var8[0] - var19[0]) * (double)var16[0]
                                 + (var8[1] - var19[1]) * (double)var16[1]
                                 + (var8[2] - var19[2]) * (double)var16[2];
                              if (!(var20 <= 1.0E-4)
                                 && !(ilIllIiIll(var8, var19[0], var19[1], var19[2]) > var5 * var5)
                                 && opt.ilIllIiIll(var8, var19, remaining, true)) {
                                 return true;
                              }
                           }
                        }

                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static Set<lIiliiliIiliil> IIlilIliiIli(Set<lIiliiliIiliil> blockers, List<iIIIliiIlIIlii> remaining) {
      HashSet var2 = new HashSet();

      for (ilIiiiIiIiii var4 : iIlllIllll(new ArrayList<>(blockers), remaining, "")) {
         if (var4.iIlIlllllill().startsWith(iIIilIlIil<"iIIilIlIil","jTHUdT+iTmEp5HGzgSK/OSEjyHS1ddzasaucghccnV09+6JWxksu3rOiXeYe">())) {
            var2.addAll(var4.IliIlllilIi());
         }
      }

      return var2;
   }

   static {
      long var33 = 6734707120343435220L;
      long var35 = 3012932596290116191L;
      long var37 = -3054370746835926448L;
      long var25 = 8409366706215763781L;
      long var27 = 7314143965297689583L;
      long var29 = -1684571967456024684L;
      long var31 = 5560698235561243480L;
      double[] var0 = new double[]{0.5, 0.3, 0.7};
      ArrayList var1 = new ArrayList();
      double[] var2 = var0;
      var25 ^= ((long)var0.length << 32 ^ var25) & -1L << 32;

      for (long var43 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var43 < (int)(var43 >>> 32); var43 ^= (var43 ^ var43 + (long)1) & -1L >>> 32) {
         double var5 = var2[(int)var43];
         double[] var7 = var0;
         var27 ^= ((long)var0.length << 32 ^ var27) & -1L << 32;

         for (var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
            double var10 = var7[(int)var27];
            var1.add(new double[]{var5, var10, Math.min(Math.min(var5, 1.0 - var5), Math.min(var10, 1.0 - var10))});
         }
      }

      var1.sort((a, b) -> Double.compare(b[2], a[2]));
      var2 = new double[]{0.5, 0.3, 0.7, 0.15, 0.85, 0.08, 0.92};
      ArrayList var3 = new ArrayList();
      double[] var4 = var2;
      var29 ^= ((long)var2.length << 32 ^ var29) & -1L << 32;

      for (long var46 = var29 ^ (0L ^ var29) & -1L >>> 32; (int)var46 < (int)(var46 >>> 32); var46 ^= (var46 ^ var46 + (long)1) & -1L >>> 32) {
         double var41 = var4[(int)var46];
         double[] var9 = var2;
         var31 ^= ((long)var2.length << 32 ^ var31) & -1L << 32;

         for (var31 ^= (0L ^ var31) & -1L >>> 32; (int)var31 < (int)(var31 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
            double var12 = var9[(int)var31];
            var33 ^= (0L ^ var33) & -1L << 32;
            double[] var15 = var0;
            var33 ^= ((long)var0.length ^ var33) & -1L >>> 32;
            var35 ^= (0L ^ var35) & -1L << 32;

            while ((int)(var35 >>> 32) < (int)var33) {
               double var18 = var15[(int)(var35 >>> 32)];
               double[] var20 = var0;
               var35 ^= ((long)var0.length ^ var35) & -1L >>> 32;

               for (var37 ^= (0L ^ var37) & -1L << 32; (int)(var37 >>> 32) < (int)var35; var37 += 4294967296L) {
                  double var23 = var20[(int)(var37 >>> 32)];
                  if (var18 == var41 && var23 == var12) {
                     var33 ^= (4294967296L ^ var33) & -1L << 32;
                  }
               }

               var35 += 4294967296L;
            }

            if ((int)(var33 >>> 32) == 0) {
               var3.add(new double[]{var41, var12, Math.min(Math.min(var41, 1.0 - var41), Math.min(var12, 1.0 - var12))});
            }
         }
      }

      var3.sort((a, b) -> Double.compare(b[2], a[2]));
      ArrayList var40 = new ArrayList(var1);
      var40.addAll(var3);
      lIlliiliil = Collections.unmodifiableList(var1);
      iIlliiliil = Collections.unmodifiableList(var40);
   }

   private static boolean IIIilIIiiIIi(List<iIIIliiIlIIlii> blockers) {
      for (iIIIliiIlIIlii var2 : blockers) {
         if (var2.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","zOa/8erGNa9McNzEC2qe8rjLQfSt64QB1KRKEi47QNVFLWKpAS4lHGlPP/YyeQ==">())
            || var2.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","I/ngU4WlcI8DhDd3uNPyk9VGp/puxH7hRois1F9krwxv959tQA1aUH7ft3s=">())
            || var2.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","4L784L3zjczYo77qaqY9l07mKb5U3GSjA8DbrkLiZ0kUVPatq56dk6QC">())
            || var2.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","zjPvroOgeO8eOfwuNfpmtcYj+Ev64uRejbyK5XinxJAQUyTyFi9gv/VCJDn4VA==">())
            || var2.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","oBcv4UhrOJOr1fQlkrtgiGcqjuVLh4DkWMPFtCrB7mQdovzGNtkE2/7INlrIp3DefqjtRQRvtg==">())) {
            return true;
         }
      }

      return false;
   }

   static boolean lIlIliIlIl(int b, int a) {
      return b == a || b == iiIiIIilIIliIIil.IliIlllilIi(a);
   }

   private static boolean IiIiliIiiiIi(IIiiIiIllIiiIiIl opt, Set<lIiliiliIiliil> remaining, List<iIIIliiIlIIlii> dirtLeft, iIliIIiIlliIIi w, int blockers) {
      long var16 = -3071845533416534986L;
      long var18 = 7038150577312190140L;
      var16 ^= (0L ^ var16) & -1L << 32;

      for (iIIIliiIlIIlii var7 : dirtLeft) {
         lIiliiliIiliil var8 = var7.IliIlllilIi();
         if (!opt.Iilililiiili(var8) && remaining.contains(var8)) {
            liiIililiiiIilil var9 = opt.IlIillIiilIi(var8);
            var16 ^= (
                  (long)(
                        var7.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","4L784L3zjczYo77qaqY9l07mKb5U3GSjA8DbrkLiZ0kUVPatq56dk6QC">())
                              && var9.IilliliilIIi() == Ililliillillii.liIiIliIIl
                              && var9.iliIiiliiiii() == IIiIllillIiIllil.iIlilliIil
                           ? 1
                           : 0
                     )
                     ^ var16
               )
               & -1L >>> 32;
            var18 ^= (
                  (long)(
                           !var7.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","4L784L3zjczYo77qaqY9l07mKb5U3GSjA8DbrkLiZ0kUVPatq56dk6QC">())
                                    && !var7.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","I/ngU4WlcI8DhDd3uNPyk9VGp/puxH7hRois1F9krwxv959tQA1aUH7ft3s=">())
                                 || var9.IilliliilIIi() != Ililliillillii.iIliIliIIl && var9.IilliliilIIi() != Ililliillillii.IlliIliIIl
                              ? 0
                              : 1
                        )
                        << 32
                     ^ var18
               )
               & -1L << 32;
            if (((int)var16 != 0 || (int)(var18 >>> 32) != 0) && var9.lIiiIiIlilli() >= 2) {
               lIiliiliIiliil var12 = var8.iliIiiliiiii(iiIiIIilIIliIIil.IliIlllilIi(var9.lIiiIiIlilli()));
               if (!remaining.contains(var12) && opt.lIIlliIIll(var12, w)) {
                  List var13 = Illillliilli(opt, var8, var12, remaining, w, Math.min(3, blockers));
                  if (var13 != null) {
                     for (lIiliiliIiliil var15 : var13) {
                        opt.Iliilliiilii(var15, var8);
                        remaining.add(var15);
                     }

                     var16 ^= (4294967296L ^ var16) & -1L << 32;
                  }
               }
            }
         }
      }

      return (boolean)((int)(var16 >>> 32));
   }

   private static String IIllllIlll(IIiiIiIllIiiIiIl w, liiIililiiiIilil remaining, Set<lIiliiliIiliil> t) {
      long var10 = -377198687981587531L;
      long var12 = -6149163302088662637L;
      long var14 = 1327701844151944013L;
      var10 ^= (-8589934592L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) <= 2) {
         for (var10 ^= (-2L ^ var10) & -1L >>> 32; (int)var10 <= 2; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            int[] var5 = llIiIiililIiIiil.iiilIIilil;
            var12 ^= ((long)var5.length << 32 ^ var12) & -1L << 32;

            for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
               var14 ^= ((long)var5[(int)var12] << 32 ^ var14) & -1L << 32;
               lIiliiliIiliil var9 = remaining.liiiIIllIl().IliIlllilIi((int)(var10 >>> 32), (int)(var14 >>> 32), (int)var10);
               if (t.contains(var9.IilliliilIIi())) {
                  return iIIilIlIil<"iIIilIlIil","fAjuROT2yt/Mem4Nx+9HmeiMtOB0/vOp0kjI0jV6Mt4hFb5ADkKz26Y5ZQ+IXA==">()
                     + var9
                     + iIIilIlIil<"iIIilIlIil","PFVtaGEB4soqA/iyohjG7DT8CPHbX8G55ykAfEvj3xQgLSzFwqe/6QytMfVDnf9hJA==">()
                     + var9.IilliliilIIi();
               }
            }
         }

         var10 += 4294967296L;
      }

      return iIIilIlIil<"iIIilIlIil","kAAgMwMkDBT4htwm6Tt59oeRl6IpOzBO55KlQ3o2WgJ5yT+m6317eFIbZHk5AsPQk4AizFh4">();
   }

   private static double lilIliilIl(double t, double look, double dx, int dy, liiIililiiiIilil dz) {
      if (dz.IilliliilIIi() == Ililliillillii.llIiIliIIl || dz.IilliliilIIi() == Ililliillillii.lIliIliIIl || dz.IilliliilIIi() == Ililliillillii.IIliIliIIl) {
         return 0.0;
      } else if (dz.IilliliilIIi() != Ililliillillii.iIliIliIIl && dz.IilliliilIIi() != Ililliillillii.IlliIliIIl) {
         double var20 = Math.abs(t);
         double var21 = Math.abs(look);
         double var22 = Math.abs(dx);
         double var14;
         if (dz.IilliliilIIi() != Ililliillillii.liIiIliIIl && dz.IilliliilIIi() != Ililliillillii.iiIiIliIIl) {
            double var16 = iiIiIIilIIliIIil.iIlIlllllill(dy) ? var21 : (dy != 5 && dy != 4 ? var22 : var20);
            double var18 = IIiIllIiIl(var20, var21, var22);
            if (var16 < Math.max(Math.max(var20, var21), var22) - 1.0E-12) {
               var18 = Math.max(Math.max(var20, var21), var22);
            }

            var14 = (var16 - var18) / Math.max(1.0E-6, var16);
         } else {
            var14 = Math.abs(var20 - var22) / Math.max(1.0E-6, Math.max(var20, var22));
         }

         return var14 < 0.1 ? 4.0 : (var14 < 0.25 ? 1.5 : 0.0);
      } else {
         double var8 = Math.abs(t);
         double var10 = Math.abs(dx);
         double var12 = Math.abs(var8 - var10) / Math.max(1.0E-6, Math.max(var8, var10));
         return var12 < 0.1 ? 4.0 : (var12 < 0.25 ? 1.5 : 0.0);
      }
   }

   private static int[] iIIIlIlIIl(liiIililiiiIilil t) {
      if (t.IiIlliIliiIl() >= 0) {
         return new int[]{t.IiIlliIliiIl()};
      } else if (t.lIiiIiIlilli() < 0 && t.IilliliilIIi() != Ililliillillii.IIliIliIIl) {
         return iiIliiliil;
      } else {
         switch (t.IilliliilIIi()) {
            case lIliIliIIl:
               return iiIiIIilIIliIIil.IIIllIIliIIl(t.lIiiIiIlilli(), ilIiillIiIiill.iIiiiIlIiIliiiIlIi);
            case ilIiIliIIl:
               return iiIiIIilIIliIIil.IIIllIIliIIl(t.lIiiIiIlilli(), ilIiillIiIiill.IIiiiIlIilIiiiIlIi);
            case IlliIliIIl:
            case iiIiIliIIl:
            case liIiIliIIl:
            default:
               return iiIliiliil;
            case iIliIliIIl:
               if (t.lIiiIiIlilli() != 0 && t.lIiiIiIlilli() >= 0) {
                  return new int[]{t.lIiiIiIlilli()};
               }

               return new int[]{0, 1};
            case IIliIliIIl:
               return new int[]{0, iiIiIIilIIliIIil.IliIlllilIi(t.lIiiIiIlilli())};
            case IiIiIliIIl:
               return new int[]{1, iiIiIIilIIliIIil.IliIlllilIi(t.lIiiIiIlilli())};
         }
      }
   }

   private static boolean IiiIlliiIl(IIlIIIilIlIIIi face, int b) {
      return switch (b) {
         case 0, 1 -> face.lIiiIiIlilli() > face.liiiIIllIl();
         default -> face.IilliliilIIi() > face.IliIlllilIi() && face.iliIiiliiiii() > face.iIlIlllllill() && face.lIiiIiIlilli() > face.liiiIIllIl();
      };
   }

   private static double lIIlliIIll(IIlIIIilIlIIIi b, int face) {
      return switch (face) {
         case 0, 1 -> Math.min(b.IilliliilIIi() - b.IliIlllilIi(), b.iliIiiliiiii() - b.iIlIlllllill());
         case 2, 3 -> Math.min(b.IilliliilIIi() - b.IliIlllilIi(), b.lIiiIiIlilli() - b.liiiIIllIl());
         default -> Math.min(b.lIiiIiIlilli() - b.liiiIIllIl(), b.iliIiiliiiii() - b.iIlIlllllill());
      };
   }

   private static liiIililiiiIilil iiIIlIIlIl(IIiiIiIllIiiIiIl w, lIiliiliIiliil c, Set<lIiliiliIiliil> remaining) {
      long var5 = 3808240653934182282L;

      for (long var7 = var5 ^ (8589934592L ^ var5) & -1L << 32; (int)(var7 >>> 32) <= 5; var7 += 4294967296L) {
         lIiliiliIiliil var4 = c.iliIiiliiiii((int)(var7 >>> 32));
         if (remaining.contains(var4) && !w.Iilililiiili(var4) && IiIIlliIIl(w.IlIillIiilIi(var4), c)) {
            return w.IlIillIiilIi(var4);
         }
      }

      return null;
   }

   private static double iIiIlIliIl(double margin) {
      return margin < 0.12 ? 6.0 : (margin < 0.2 ? 3.0 : (margin < 0.3 ? 1.0 : 0.0));
   }

   private static liIIiiiiiIIiii Iiiiliiiiiii(
      IIiiIiIllIiiIiIl footLayerOnly,
      liiIililiiiIilil opt,
      IIlilillIlilil nav,
      iIliIIiIlliIIi blockers,
      Set<lIiliiliIiliil> remaining,
      List<iIIIliiIlIIlii> wideFluid,
      boolean w,
      boolean t
   ) {
      long var80 = -361430530126233394L;
      long var82 = 8698347569838857178L;
      long var84 = -7741172575098181440L;
      long var70 = -1926096209867310204L;
      long var86 = 7922212464284873902L;
      long var72 = 3924745219427018496L;
      long var88 = 4499727278771588006L;
      long var74 = -948821528031218081L;
      long var76 = -3052341758718956946L;
      long var78 = 9079505118895608409L;
      double var8 = blockers.Iiilliiliiil();
      var70 ^= ((long)((int)Math.ceil(var8)) << 32 ^ var70) & -1L << 32;
      ArrayList var11 = new ArrayList();
      ArrayList var12 = new ArrayList();
      var70 ^= (0L ^ var70) & -1L >>> 32;
      var72 ^= (0L ^ var72) & -1L << 32;
      var72 ^= (0L ^ var72) & -1L >>> 32;
      var74 ^= (0L ^ var74) & -1L << 32;
      var74 ^= (0L ^ var74) & -1L >>> 32;
      var76 ^= (0L ^ var76) & -1L << 32;
      liIIiiiiiIIiii var19 = null;
      HashMap var20 = new HashMap();
      var76 ^= ((long)(opt.IlIlllIlilIl() != null && footLayerOnly.IIlilIliiIli(opt.IlIlllIlilIl()) ? 1 : 0) ^ var76) & -1L >>> 32;
      int[] var22 = iIIIlIlIIl(opt);
      var78 ^= ((long)var22.length << 32 ^ var78) & -1L << 32;

      for (long var103 = var78 ^ (0L ^ var78) & -1L >>> 32; (int)var103 < (int)(var103 >>> 32); var103 ^= (var103 ^ var103 + (long)1) & -1L >>> 32) {
         var80 ^= ((long)var22[(int)var103] << 32 ^ var80) & -1L << 32;
         lIiliiliIiliil var26 = opt.liiiIIllIl().iliIiiliiiii((int)(var80 >>> 32));
         var80 ^= ((long)iiIiIIilIIliIIil.IliIlllilIi((int)(var80 >>> 32)) ^ var80) & -1L >>> 32;
         if (remaining.contains(var26)) {
            var11.add(var26);
         } else if (footLayerOnly.IiIlliIliiIl(var26)) {
            var12.add(var26);
         } else {
            var82 ^= ((long)(footLayerOnly.IliIlllilIi(var26).isEmpty() && footLayerOnly.Ililllililil(var26).isEmpty() ? 0 : 1) << 32 ^ var82) & -1L << 32;
            if ((int)(var82 >>> 32) == 0) {
               if (footLayerOnly.lIIlliIIll(var26, blockers)) {
                  var72 ^= (4294967296L ^ var72) & -1L << 32;
               }
            } else {
               var82 ^= ((long)footLayerOnly.iliIiiliiiii(var26) ^ var82) & -1L >>> 32;
               var84 ^= ((long)((int)var76 != 0 && var26.equals(opt.IlIlllIlilIl()) ? 1 : 0) << 32 ^ var84) & -1L << 32;
               if (opt.IilliliilIIi() != Ililliillillii.liIiIliIIl || (int)var76 == 0 || (int)var82 == 0 || (int)(var84 >>> 32) != 0) {
                  if (!footLayerOnly.IliIlllilIi(var26).isEmpty()) {
                     var70 ^= (1L ^ var70) & -1L >>> 32;
                  }

                  List var31 = footLayerOnly.liiiIIllIl(var26);
                  if (var31.isEmpty()) {
                     var31 = footLayerOnly.Ililllililil(var26);
                  }

                  for (IIlIIIilIlIIIi var33 : var31) {
                     if (IiiIlliiIl(var33, (int)var80)) {
                        for (lIiliiliIiliil var35 : nav.IliIlllilIi()) {
                           if (Math.abs(var35.IIlllIlliIll() - opt.liiiIIllIl().IIlllIlliIll()) <= (int)(var70 >>> 32)
                              && Math.abs(var35.Iilllilliill() - opt.liiiIIllIl().Iilllilliill()) <= (int)(var70 >>> 32)
                              && (
                                 w
                                    ? llIiIiililIiIiil.IliIlllilIi(var35.Illlllllilll(), opt.liiiIIllIl().Illlllllilll())
                                    : var35.Illlllllilll() >= opt.liiiIIllIl().Illlllllilll() - 3
                                       && var35.Illlllllilll() <= opt.liiiIIllIl().Illlllllilll() + 2
                              )) {
                              var84 ^= (
                                    (long)(
                                          var35.equals(opt.liiiIIllIl())
                                                && (int)(var80 >>> 32) == 0
                                                && opt.iliIiiliiiii() == IIiIllillIiIllil.illilliIil
                                                && opt.IilliliilIIi() == Ililliillillii.liIiIliIIl
                                             ? 1
                                             : 0
                                       )
                                       ^ var84
                                 )
                                 & -1L >>> 32;
                              if ((!var35.equals(opt.liiiIIllIl()) || (int)var84 != 0)
                                 && !var35.liiiIIllIl().equals(opt.liiiIIllIl())
                                 && !var35.equals(var26)
                                 && !var35.liiiIIllIl().equals(var26)
                                 && (opt.IlIlllIlilIl() == null || !var35.equals(opt.IlIlllIlilIl()) && !var35.liiiIIllIl().equals(opt.IlIlllIlilIl()))
                                 && (blockers.Illillliilli() || !remaining.contains(var35) || (int)var84 != 0)
                                 && (!remaining.contains(var35.liiiIIllIl()) || IiIIlliIIl(opt, var35.liiiIIllIl()))) {
                                 if (blockers.iIlIlllllill(opt.liiiIIllIl(), var35)) {
                                    IIiIiiliil++;
                                 } else if (blockers.IIillIiliIil(var35) && nav.IilliliilIIi(var35).iIlIlllllill() == 0) {
                                    var76 ^= (4294967296L ^ var76) & -1L << 32;
                                 } else {
                                    footLayerOnly.Iiilliiliiil(nav.IilliliilIIi(var35));

                                    try {
                                       if (footLayerOnly.IiiIlliiIl(var35)) {
                                          var72 ^= (1L ^ var72) & -1L >>> 32;
                                          if (blockers.IIIIllIIIl() && (int)var84 == 0 && footLayerOnly.lIlIliIlIl(var35, opt.liiiIIllIl())) {
                                             var74 ^= (1L ^ var74) & -1L >>> 32;
                                          } else if (blockers.IIIIllIIIl()
                                             && !var20.computeIfAbsent(var35, tx -> iilllIIill(footLayerOnly, tx, opt.liiiIIllIl()))) {
                                             var74 ^= (1L ^ var74) & -1L >>> 32;
                                          } else {
                                             double var37 = nav.liiiIIllIl(var35);
                                             var86 ^= (
                                                   (long)(
                                                            !blockers.Iiiiliiiiiii()
                                                                  || !footLayerOnly.illIlIilIl(var35)
                                                                     && opt.liiiIIllIl().Illlllllilll() >= var35.Illlllllilll()
                                                                  || (int)var76 != 0 && (int)(var84 >>> 32) == 0
                                                               ? 0
                                                               : 1
                                                         )
                                                         << 32
                                                      ^ var86
                                                )
                                                & -1L << 32;

                                             for (var86 ^= (0L ^ var86) & -1L >>> 32; (int)var86 < 2; var86 ^= (var86 ^ var86 + (long)1) & -1L >>> 32) {
                                                var88 ^= ((long)((int)var86 == 1 ? 1 : 0) << 32 ^ var88) & -1L << 32;
                                                if (((int)var82 == 0 || (int)(var88 >>> 32) != 0)
                                                   && ((int)var76 == 0 || (int)(var84 >>> 32) != 0 || (int)(var88 >>> 32) == 0)
                                                   && ((int)(var86 >>> 32) == 0 || (int)(var88 >>> 32) != 0)) {
                                                   double[] var42 = footLayerOnly.iiiIlIIIll(var35, (boolean)((int)(var88 >>> 32)));
                                                   double var43 = (double)opt.liiiIIllIl().IIlllIlliIll() + 0.5;
                                                   double var45 = (double)opt.liiiIIllIl().Illlllllilll() + 0.5;
                                                   double var47 = (double)opt.liiiIIllIl().Iilllilliill() + 0.5;
                                                   double var49 = t ? var8 : Math.max(1.0, var8 - 0.6);
                                                   if (!(ilIllIiIll(var42, var43, var45, var47) > var49 * var49)) {
                                                      for (double[] var52 : lliIliliIl(blockers.IiIiliIiiiIi())) {
                                                         double[] var53 = iiiIlIIIll(var26, var33, (int)var80, var52[0], var52[1]);
                                                         if (!(ilIllIiIll(var42, var53[0], var53[1], var53[2]) > var8 * var8)) {
                                                            int[] var54 = iiIiIIilIIliIIil.liiiIIllIl((int)var80);
                                                            double var55 = (var42[0] - var53[0]) * (double)var54[0]
                                                               + (var42[1] - var53[1]) * (double)var54[1]
                                                               + (var42[2] - var53[2]) * (double)var54[2];
                                                            if (!(var55 <= 1.0E-4)) {
                                                               double var57 = var53[0] - var42[0];
                                                               double var59 = var53[1] - var42[1];
                                                               double var61 = var53[2] - var42[2];
                                                               var88 ^= ((long)iiIiIIilIIliIIil.IlIlllIlilIl(var57, var59, var61) ^ var88) & -1L >>> 32;
                                                               if (llIIlilIIl(opt, (int)var88, var57, var61, (boolean)((int)(var84 >>> 32)))
                                                                  && IllIllllIl(opt, (int)var80, var53[1], var57, var61)) {
                                                                  var74 ^= (4294967296L ^ var74) & -1L << 32;
                                                                  if (footLayerOnly.ilIllIiIll(var42, var53, var26, false)
                                                                     && (
                                                                        !opt.IliIlllilIi()
                                                                           || !iIIilIlIil<"iIIilIlIil","aFnl/NANOOlL4tLgBlxI60wzeG3TnOp1KgpNF8z+lR8V">()
                                                                              .equals(opt.iIlIlllllill())
                                                                           || !footLayerOnly.IIillIiliIil(var26)
                                                                     )
                                                                     && (!opt.IliIlllilIi() || footLayerOnly.liIlliiIll(var42, var53, var26, (int)var80))) {
                                                                     double var64 = Math.min(var52[2], lIIlliIIll(var33, (int)var80) * var52[2]);
                                                                     double var66 = var37
                                                                        + 2.0
                                                                           * (double)llIiIiililIiIiil.liiiIIllIl(
                                                                              var35.Illlllllilll(), opt.liiiIIllIl().Illlllllilll()
                                                                           )
                                                                        + iIiIlIliIl(var64)
                                                                        + ((int)(var88 >>> 32) != 0 ? 0.5 : 0.0)
                                                                        + ((int)var82 != 0 ? 1.0 : 0.0)
                                                                        + (
                                                                           !iiIiIIilIIliIIil.iIlIlllllill((int)var80)
                                                                                 && (
                                                                                    opt.IilliliilIIi() == Ililliillillii.iIliIliIIl
                                                                                       || opt.IilliliilIIi() == Ililliillillii.IlliIliIIl
                                                                                 )
                                                                              ? 0.0
                                                                              : lilIliilIl(var57, var59, var61, (int)var88, opt)
                                                                        );
                                                                     IlIillillIilli var68 = new IlIillillIilli(
                                                                        opt.liiiIIllIl(),
                                                                        var35,
                                                                        (boolean)((int)(var88 >>> 32)),
                                                                        var26,
                                                                        (int)var80,
                                                                        var53[0],
                                                                        var53[1],
                                                                        var53[2],
                                                                        (int)var88,
                                                                        var64,
                                                                        false
                                                                     );
                                                                     if (!blockers.IIiilIiiiIii().contains(var68.IliIlllilIi())) {
                                                                        if (var19 == null || var66 < var19.iiliiliIIl - 1.0E-6) {
                                                                           var19 = new liIIiiiiiIIiii(var68, var66);
                                                                        }
                                                                        break;
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
                                    } finally {
                                       footLayerOnly.IIIilIIiiIIi();
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

      if (var19 != null) {
         return var19;
      } else {
         String var92;
         if ((int)var70 == 0) {
            var92 = !var11.isEmpty()
               ? iIIilIlIil<"iIIilIlIil","41FfXnfVf5eSOqihlCOuA2dlMQCscb4aNaShFSm8TQMAwUZh2Y+Zc4CgYMbsQR5P6FqJ0aq75zt8Dc7FiGQR0y5jeAcQC04xqXwBOEP0ml4rQPt09dcqTMwBb9Nw">()
               : (
                  !var12.isEmpty()
                     ? iIIilIlIil<"iIIilIlIil","j0+N5QnuURkS0MxW0aEfHcbZpdE277EyO9eV4RLCqK4GguAhKiNxCBswYCQNqK6Z7zB3Aa4Ll4pmZc6ldA15ZPwOnZS/9Z/rJf1JgeHx6pBrwEtp4MKWiWsRhA/W42OF/BRpjAz96EIOhKplADss/hjEAh6QElkIM0Oc">()
                     : (
                        (int)(var72 >>> 32) != 0
                           ? iIIilIlIil<"iIIilIlIil","+mPWo4AYDysvlawPYBC/scEMJYJShQw6e/26j+me23v8ciBX0JifWg3ulYQTXjKyBfEzrd2LGnLnYNb+p8KP2buFJHGyaLGv4WHDuvdT0R1oddHMTFqnow05BQXhQdl8jgw=">()
                           : iIIilIlIil<"iIIilIlIil","lh8oek1loMNjMSysvUQoa0NlngmhMHLjm+lbql4VKQje1+OJvs2E+1M/mkey01v2s1WMs5mmur4nh4axaFI/YPquPhDThB06iIonxnNZvFH5b/7awoAvyYWl21Sn9mEoypQYSmBjKWg=">()
                     )
               );
         } else if ((int)var72 == 0) {
            lIiliiliIiliil var23 = IIIIllIIIl(footLayerOnly, opt);
            if (var23 != null) {
               var12.add(var23);
               var92 = iIIilIlIil<"iIIilIlIil","gzSjMyTPov9fOQqNs/pQBMy90BeeR39Ka+dynaHCegvv6lvtnl/9ukzUTwgOUTr0xIoDpERd+hjwFRETQcu09KgD8WMWyWdWxNlMvSYj5xzV/Mq+o2X/t+UKoqp+8oWG7aKurboczOELew==">()
                  + var23
                  + iIIilIlIil<"iIIilIlIil","dRFxaR+h1pzP1eUYFGDvOLXDjsCDY0o7h0t6Guc=">();
            } else if ((int)(var76 >>> 32) != 0) {
               var92 = iIIilIlIil<"iIIilIlIil","9GTjoGknghFVWUVfynhTIbKfVVQZhbOed1xPndHvcxUuDa2Qkirzoz989AON7Su3XMSfSY+bAepyPBiX4YvvahN+5P7DG4ImtK28/1lMvLx594pOwWlLrtgAejotF6fxwV+PCybIy2JDG1PrmL7yJTAuIX9bQ3K0Ty4Vb3DewAVoxA/IgxjzLyexC2EbZYZTXx+2OIcVCKUk468A+tI=">();
            } else {
               var92 = iIIilIlIil<"iIIilIlIil","7apP3k5xvY/jInNSTjXFKjoS3crcpMkqELBQTEO5XFZ5nC68ivJ3QZLAStIH4UaIYcISYTENse1aWFOpQYrOQfw8+lCq2gkw9N8KBT6UPpg=">()
                  + IIllllIlll(footLayerOnly, opt, remaining)
                  + iIIilIlIil<"iIIilIlIil","dRFxaR+h1pzP1eUYFGDvOLXDjsCDY0o7h0t6Guc=">();
            }
         } else if ((int)var74 != 0 && (int)(var74 >>> 32) == 0) {
            var92 = iIIilIlIil<"iIIilIlIil","vvrMMjCG1fNRqcnonU6tQYMMusAI5pFjE/Cki11AbVIfryNhxZhoIMoSQZ1XHvofYXX5uBGnV/MVZJFHK6eB1eZItMMmeHeeWY6HJ7RZ0I+1UoEQyY4LG5VlAEZh/BZ+0rcLU/q2Fwrt1vx2L4hXJXg7uwJMqY8CIDEDg9CeBBxBrOGVBfWgB5t9s/gF3Q==">();
         } else if ((int)(var74 >>> 32) == 0) {
            var92 = iIIilIlIil<"iIIilIlIil","1wGVKb2QEK+0Lo5CA69YaWzN1+b6ADrry5NVQ34CfAYx2XGdiKB1Uo1DFw7myIhAbyH5B4Ii5lWp+B8a+/CHHV6vN05HK9MYNK4LB3eGtSJ8XaRfAoQH1K+c/4Pi3QLMwQ==">()
               + liIlliiIll(opt.lIiiIiIlilli())
               + iIIilIlIil<"iIIilIlIil","dRFxaR+h1pzP1eUYFGDvOLXDjsCDY0o7h0t6Guc=">();
         } else {
            var92 = iIIilIlIil<"iIIilIlIil","eaMhLATKSJu+WzTvje30rh6PnQ1OU5Q8raufpjIdRnZEOHSSqWWZ1hYAhREyIGmghFparCaWaqeEbmReqIRYi2n219sXyxgMriyHGmnT7CJz7z8LkMgfquM31WK8FIlgcL22D6cSI3sdT7tSh/A=">();
         }

         ArrayList var93 = var11;
         if (!var12.isEmpty()) {
            var93 = new ArrayList(var11);
            var93.addAll(var12);
         }

         wideFluid.add(new iIIIliiIlIIlii(opt.liiiIIllIl(), var92, List.copyOf(var93)));
         return null;
      }
   }

   private static void lllllillll(
      lIiliiliIiliil v,
      Set<lIiliiliIiliil> counter,
      Map<lIiliiliIiliil, iIIIliiIlIIlii> sccs,
      Map<lIiliiliIiliil, Integer> onStack,
      Map<lIiliiliIiliil, Integer> low,
      Set<lIiliiliIiliil> nodes,
      ArrayDeque<lIiliiliIiliil> stack,
      List<List<lIiliiliIiliil>> byCell,
      int[] index
   ) {
      onStack.put(v, index[0]);
      low.put(v, index[0]);
      index[0]++;
      stack.push(v);
      nodes.add(v);
      iIIIliiIlIIlii var9 = (iIIIliiIlIIlii)sccs.get(v);
      if (var9 != null) {
         for (lIiliiliIiliil var11 : var9.iIlIlllllill()) {
            if (counter.contains(var11)) {
               if (!onStack.containsKey(var11)) {
                  lllllillll(var11, counter, sccs, onStack, low, nodes, stack, byCell, index);
                  low.put(v, Math.min((Integer)low.get(v), (Integer)low.get(var11)));
               } else if (nodes.contains(var11)) {
                  low.put(v, Math.min((Integer)low.get(v), (Integer)onStack.get(var11)));
               }
            }
         }
      }

      if (((Integer)low.get(v)).equals(onStack.get(v))) {
         ArrayList var12 = new ArrayList();

         lIiliiliIiliil var13;
         do {
            var13 = (lIiliiliIiliil)stack.pop();
            nodes.remove(var13);
            var12.add(var13);
         } while (!var13.equals(v));

         byCell.add(var12);
      }
   }

   static boolean IIiilIiiiIii(liiIililiiiIilil t) {
      return t.IilliliilIIi() == Ililliillillii.ilIiIliIIl && t.lIiiIiIlilli() == 0 || t.IilliliilIIi() == Ililliillillii.IiIiIliIIl && t.lIiiIiIlilli() == 1;
   }

   private iIlllIIiIllllIIi() {
   }

   static boolean IllIllllIl(liiIililiiiIilil hy, int t, double face, double dx, double dz) {
      long var11 = -8554612177011537373L;
      var11 ^= ((long)(hy.IilliliilIIi() == Ililliillillii.IlliIliIIl ? 1 : 0) << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) == 0 && hy.IilliliilIIi() != Ililliillillii.iIliIliIIl) {
         return true;
      } else if (iiIiIIilIIliIIil.iIlIlllllill(t)) {
         return (t == 0 ? 1 : 0) == (int)(var11 >>> 32) && (hy.lIiiIiIlilli() < 0 || illIlIilIl(dx, dz) == iiIiIIilIIliIIil.IliIlllilIi(hy.lIiiIiIlilli()));
      } else {
         double var9 = face - (double)hy.liiiIIllIl().Illlllllilll();
         return (hy.lIiiIiIlilli() < 0 || t == hy.lIiiIiIlilli()) && ((int)(var11 >>> 32) != 0 ? var9 >= 0.5625 : var9 <= 0.4375);
      }
   }

   public static List<IIlIIIilIlIIIi> liiiIIllIl(IIiIllillIiIllil s) {
      return switch (s) {
         case lIlilliIil, iIlilliIil -> iIiIiiliil;
         case lllilliIil -> IliIiiliil;
         case illilliIil -> lliIiiliil;
         case IllilliIil -> iliIiiliil;
      };
   }

   static List<double[]> lliIliliIl(boolean edge) {
      return edge ? iIlliiliil : lIlliiliil;
   }

   static Set<lIiliiliIiliil> IlIlllIlilIl(IIiiIiIllIiiIiIl remaining, IIlilillIlilil walk, Set<lIiliiliIiliil> w) {
      long var8 = 4218098833481202597L;
      HashSet var3 = new HashSet();

      for (lIiliiliIiliil var5 : w) {
         if (!w.contains(var5.liiiIIllIl())
            && w.contains(var5.IilliliilIIi())
            && walk.IliIlllilIi().contains(var5.liiiIIllIl())
            && remaining.IiiIlliiIl(var5.liiiIIllIl())) {
            var8 ^= (0L ^ var8) & -1L << 32;

            for (lIiliiliIiliil var7 = var5; w.contains(var7); var7 = var7.IilliliilIIi()) {
               var8 += 4294967296L;
            }

            if ((int)(var8 >>> 32) >= 3) {
               for (lIiliiliIiliil var10 = var5; w.contains(var10); var10 = var10.IilliliilIIi()) {
                  var3.add(var10);
               }
            }
         }
      }

      return var3;
   }

   static List<lIiliiliIiliil> Illillliilli(
      IIiiIiIllIiiIiIl n, lIiliiliIiliil target, lIiliiliIiliil opt, Set<lIiliiliIiliil> maxLen, iIliIIiIlliIIi remaining, int w
   ) {
      long var19 = 3800234462847615958L;
      long var21 = -3733095138959119733L;
      if (w <= 0) {
         return null;
      } else if (n.Iiiiliiiiiii(opt, target)) {
         return List.of(opt);
      } else {
         HashMap var6 = new HashMap();
         HashMap var7 = new HashMap();
         ArrayDeque var8 = new ArrayDeque();
         var6.put(opt, null);
         var7.put(opt, 1);
         var8.add(opt);

         while (!var8.isEmpty()) {
            lIiliiliIiliil var9 = (lIiliiliIiliil)var8.poll();
            var19 ^= ((long)((Integer)var7.get(var9)).intValue() << 32 ^ var19) & -1L << 32;
            if ((int)(var19 >>> 32) < w) {
               int[] var11 = new int[]{0, 2, 3, 4, 5, 1};
               int[] var12 = var11;
               var19 ^= ((long)var11.length ^ var19) & -1L >>> 32;
               var21 ^= (0L ^ var21) & -1L << 32;

               while ((int)(var21 >>> 32) < (int)var19) {
                  var21 ^= ((long)var12[(int)(var21 >>> 32)] ^ var21) & -1L >>> 32;
                  lIiliiliIiliil var16 = var9.iliIiiliiiii((int)var21);
                  if (!var16.equals(target)
                     && !var6.containsKey(var16)
                     && !maxLen.contains(var16)
                     && n.lIIlliIIll(var16, remaining)
                     && (!var16.equals(target.liiiIIllIl()) || !var9.equals(target))) {
                     var6.put(var16, var9);
                     var7.put(var16, (int)(var19 >>> 32) + 1);
                     if (Iilililiiili(n, var16, var6.keySet(), target)) {
                        ArrayList var17 = new ArrayList();

                        for (lIiliiliIiliil var18 = var16; var18 != null; var18 = (lIiliiliIiliil)var6.get(var18)) {
                           var17.add(var18);
                        }

                        return var17;
                     }

                     var8.add(var16);
                  }

                  var21 += 4294967296L;
               }
            }
         }

         return null;
      }
   }

   private static boolean llIIlilIIl(liiIililiiiIilil dz, int look, double partnerFace, double dx, boolean t) {
      return switch (dz.IilliliilIIi()) {
         case lIliIliIIl -> iiIiIIilIIliIIil.IliIlllilIi(look) == dz.lIiiIiIlilli();
         case ilIiIliIIl -> look == dz.lIiiIiIlilli();
         case IlliIliIIl -> t || dz.lIiiIiIlilli() < 0 || illIlIilIl(partnerFace, dx) == iiIiIIilIIliIIil.IliIlllilIi(dz.lIiiIiIlilli());
         case iiIiIliIIl -> dz.lIiiIiIlilli() < 0 || lIlIliIlIl(illIlIilIl(partnerFace, dx), dz.lIiiIiIlilli());
         default -> true;
      };
   }

   static double[] iiiIlIIIll(lIiliiliIiliil v, IIlIIIilIlIIIi face, int n, double b, double u) {
      double var7 = (double)v.IIlllIlliIll() + face.IliIlllilIi();
      double var9 = (double)v.IIlllIlliIll() + face.IilliliilIIi();
      double var11 = (double)v.Illlllllilll() + face.liiiIIllIl();
      double var13 = (double)v.Illlllllilll() + face.lIiiIiIlilli();
      double var15 = (double)v.Iilllilliill() + face.iIlIlllllill();
      double var17 = (double)v.Iilllilliill() + face.iliIiiliiiii();

      return switch (n) {
         case 0 -> new double[]{IlIllllIll(var7, var9, b), var11, IlIllllIll(var15, var17, u)};
         case 1 -> new double[]{IlIllllIll(var7, var9, b), var13, IlIllllIll(var15, var17, u)};
         case 2 -> new double[]{IlIllllIll(var7, var9, b), IlIllllIll(var11, var13, u), var15};
         case 3 -> new double[]{IlIllllIll(var7, var9, b), IlIllllIll(var11, var13, u), var17};
         case 4 -> new double[]{var7, IlIllllIll(var11, var13, b), IlIllllIll(var15, var17, u)};
         default -> new double[]{var9, IlIllllIll(var11, var13, b), IlIllllIll(var15, var17, u)};
      };
   }

   private static boolean IlIillIiilIi(IIiiIiIllIiiIiIl dirtLeft, Set<lIiliiliIiliil> remaining, List<iIIIliiIlIIlii> blockers, iIliIIiIlliIIi w, int opt) {
      long var20 = 7364772460847163741L;
      long var22 = -990332002569848843L;
      long var24 = 286521693417450176L;
      var20 ^= (0L ^ var20) & -1L << 32;
      Set var6 = IIlilIliiIli(remaining, blockers);

      for (iIIIliiIlIIlii var8 : blockers) {
         lIiliiliIiliil var9 = var8.IliIlllilIi();
         if (!dirtLeft.Iilililiiili(var9) && remaining.contains(var9)) {
            var20 ^= ((long)var8.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","CxIvbrCdnl209Oo0bPPDph7a63LjVG5QTjpx4+blXn0Azj/xz+ldvrnhvQ==">()) ^ var20)
               & -1L >>> 32;
            var22 ^= (
                  (long)(
                           var8.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","PjH4AMcMN1MO3J6Q4WbkIyjyG+NCymWvIL4Md8YPm8URJbWxI6VZBTlXUA==">())
                                 && var6.contains(var9)
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var22
               )
               & -1L << 32;
            if ((int)var20 != 0 || (int)(var22 >>> 32) != 0) {
               liiIililiiiIilil var12 = dirtLeft.IlIillIiilIi(var9);
               List var13 = null;
               int[] var14 = iIIIlIlIIl(var12);
               var22 ^= ((long)var14.length ^ var22) & -1L >>> 32;
               var24 ^= (0L ^ var24) & -1L << 32;

               while ((int)(var24 >>> 32) < (int)var22) {
                  var24 ^= ((long)var14[(int)(var24 >>> 32)] ^ var24) & -1L >>> 32;
                  lIiliiliIiliil var18 = var9.iliIiiliiiii((int)var24);
                  if (!remaining.contains(var18) && dirtLeft.lIIlliIIll(var18, w)) {
                     List var19 = Illillliilli(dirtLeft, var9, var18, remaining, w, Math.min(3, opt));
                     if (var19 != null && (var13 == null || var19.size() < var13.size())) {
                        var13 = var19;
                     }
                  }

                  var24 += 4294967296L;
               }

               if (var13 != null) {
                  for (lIiliiliIiliil var15 : var13) {
                     dirtLeft.Iliilliiilii(var15, var9);
                     remaining.add(var15);
                  }

                  var20 ^= (4294967296L ^ var20) & -1L << 32;
               }
            }
         }
      }

      return (int)(var20 >>> 32) != 0 || IiIiliIiiiIi(dirtLeft, remaining, blockers, w, opt);
   }

   private static boolean IIlllIlliIll(IIiiIiIllIiiIiIl w, IIlilillIlilil nav, iIliIIiIlliIIi remaining, Set<lIiliiliIiliil> removal, liIllIlliiIllIll opt) {
      long var16 = 8246453878876723206L;
      LinkedHashSet var5 = new LinkedHashSet(removal);
      var5.remove(opt.IliIlllilIi());
      if (var5.isEmpty()) {
         return true;
      } else {
         HashSet var6 = new HashSet<>(w.IilllliIll);
         HashSet var7 = new HashSet<>(w.lilllliIll);
         iiilllllIIIillll var8 = nav.IilliliilIIi(opt.liiiIIllIl()).liiiIIllIl(opt.IliIlllilIi());

         for (lIiliiliIiliil var10 : var8.IilliliilIIi()) {
            w.llIIlilIIl(var10);
         }

         for (lIiliiliIiliil var22 : var8.lIiiIiIlilli()) {
            w.IiIIlliIIl(var22);
         }

         try {
            IIlilillIlilil var21 = IIlilillIlilil.IiIlliIliiIl(w, opt.liiiIIllIl(), remaining, 0, var5, var5);

            for (lIiliiliIiliil var11 : var5) {
               for (lIiliiliIiliil var13 : var21.IliIlllilIi()) {
                  if (Iilllilliill(w, remaining, var5, var11, var13)) {
                     var16 ^= (4294967296L ^ var16) & -1L << 32;
                     return (boolean)((int)(var16 >>> 32));
                  }
               }
            }

            var16 ^= (0L ^ var16) & -1L >>> 32;
            return (boolean)((int)var16);
         } finally {
            w.IilllliIll.clear();
            w.IilllliIll.addAll(var6);
            w.lilllliIll.clear();
            w.lilllliIll.addAll(var7);
         }
      }
   }

   private static boolean Iiilliiliiil(IIiiIiIllIiiIiIl w, List<iIIIliiIlIIlii> blockers) {
      for (iIIIliiIlIIlii var3 : blockers) {
         liiIililiiiIilil var4 = w.IlIillIiilIi(var3.IliIlllilIi());
         int[] var5 = var4 == null ? iiIliiliil : iIIIlIlIIl(var4);
         if (var5.length == 1
            && !iiIiIIilIIliIIil.iIlIlllllill(var5[0])
            && (
               var3.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","I/ngU4WlcI8DhDd3uNPyk9VGp/puxH7hRois1F9krwxv959tQA1aUH7ft3s=">())
                  || var3.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","4L784L3zjczYo77qaqY9l07mKb5U3GSjA8DbrkLiZ0kUVPatq56dk6QC">())
                  || var3.liiiIIllIl().startsWith(iIIilIlIil<"iIIilIlIil","zOa/8erGNa9McNzEC2qe8rjLQfSt64QB1KRKEi47QNVFLWKpAS4lHGlPP/YyeQ==">())
            )) {
            return true;
         }
      }

      return false;
   }

   static boolean IiIIlliIIl(liiIililiiiIilil c, lIiliiliIiliil t) {
      return c != null
         && c.IilliliilIIi() == Ililliillillii.liIiIliIIl
         && c.lIiiIiIlilli() >= 2
         && iIIilIlIil<"iIIilIlIil","zS7tMp6CF0Xddx7nD3eyYnx+kmP1iLivMvuw7CjrNEzz/Vz0">().equals(c.iIlIlllllill())
         && c.liiiIIllIl().iliIiiliiiii(c.lIiiIiIlilli()).equals(t);
   }

   public static String lIilliIill(
      llilIiililIi placedSoFar, List<liiIililiiiIilil> dirtSoFar, Set<lIiliiliIiliil> world, Set<lIiliiliIiliil> in, IlIillillIilli targets
   ) {
      long var19 = -4642464836291396135L;
      long var21 = -3329426474160873262L;
      IIiiIiIllIiiIiIl var5 = new IIiiIiIllIiiIiIl(placedSoFar, dirtSoFar);

      for (lIiliiliIiliil var7 : world) {
         var5.illllliIll.add(var7);
      }

      for (lIiliiliIiliil var25 : in) {
         var5.llIIlilIIl(var25);
      }

      liiIililiiiIilil var24 = var5.IlIillIiilIi(targets.liiiIIllIl());
      if (var24 == null) {
         return iIIilIlIil<"iIIilIlIil","aiu6H/3LDywiG9bL3SddkxSD8j49pEVKRSAUCcx6lOCVPrRUD0HR14VP">();
      } else if (!var5.IiiIlliiIl(targets.iIlIlllllill())) {
         return iIIilIlIil<"iIIilIlIil","CmBrxYWQxV7bSz+xiH4q9QkV69e1CjZ/WbkQMmJ1Qr32xkmj0SDk6CxqsukOn4M=">();
      } else {
         var19 ^= (
               (long)(
                        targets.iIlIlllllill().equals(var24.liiiIIllIl())
                              && var24.iliIiiliiiii() == IIiIllillIiIllil.illilliIil
                              && var24.IilliliilIIi() == Ililliillillii.liIiIliIIl
                              && targets.lIiiIiIlilli().equals(var24.liiiIIllIl().IilliliilIIi())
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var19
            )
            & -1L << 32;
         if ((!targets.iIlIlllllill().equals(var24.liiiIIllIl()) || (int)(var19 >>> 32) != 0)
            && !targets.iIlIlllllill().liiiIIllIl().equals(var24.liiiIIllIl())) {
            double[] var8 = var5.iiiIlIIIll(targets.iIlIlllllill(), targets.IilliliilIIi());
            double[] var9 = new double[]{targets.IIIllIIliIIl(), targets.IlIlllIlilIl(), targets.IiIlliIliiIl()};
            if (var5.IliIlllilIi(targets.lIiiIiIlilli()).isEmpty() && var5.Ililllililil(targets.lIiiIiIlilli()).isEmpty()) {
               return iIIilIlIil<"iIIilIlIil","E5px5gRZni/9kagyOXVinXMr4LgZBVYN5pHur/THkwH7e4KNxMLJQ619Lfx9ZOLo">();
            } else if (!var5.ilIllIiIll(var8, var9, targets.lIiiIiIlilli(), false)) {
               return iIIilIlIil<"iIIilIlIil","OCFLO+fKN6ht6T4scUB1MHKFv41hACYQY+bMQLBIbZ24bew3FerudxVm5lBgiZ83fQ==">();
            } else {
               double var10 = var9[0] - var8[0];
               double var12 = var9[1] - var8[1];
               double var14 = var9[2] - var8[2];
               var19 ^= ((long)iiIiIIilIIliIIil.IlIlllIlilIl(var10, var12, var14) ^ var19) & -1L >>> 32;
               var21 ^= (
                     (long)(
                              var24.IlIlllIlilIl() != null && var5.IIlilIliiIli(var24.IlIlllIlilIl()) && targets.lIiiIiIlilli().equals(var24.IlIlllIlilIl())
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var21
                  )
                  & -1L << 32;
               if (!llIIlilIIl(var24, (int)var19, var10, var14, (boolean)((int)(var21 >>> 32)))) {
                  return iIIilIlIil<"iIIilIlIil","gGjtGyUKVDBlGamO9wOkIJKb97I1sCgjlQ0THr278eSx">()
                     + liIlliiIll((int)var19)
                     + iIIilIlIil<"iIIilIlIil","XA5ECaOXLb8btxCeYG07tw8yOS1Y9e+/LrBRjieD7VUW/Je2AkOLWWfNtR6Hx5AaQloDcQQ=">()
                     + liIlliiIll(var24.lIiiIiIlilli());
               } else if (!IllIllllIl(var24, targets.iliIiiliiiii(), targets.IlIlllIlilIl(), var10, var14)) {
                  return iIIilIlIil<"iIIilIlIil","Zz9MvEprYahbyeUdHBKLY0kIjxQZwYnHWADDJS5HuogjOG0Si+mtXSo=">()
                     + liIlliiIll(targets.iliIiiliiiii())
                     + iIIilIlIil<"iIIilIlIil","BygqahzJh7V0D0y5oVFpPLSoIrbs1RrtrqjdpM30Q+1unNfRGaYqkuSQFGUURewsieQiGvpw9djLw1xzo3e+">()
                     + liIlliiIll(var24.lIiiIiIlilli())
                     + iIIilIlIil<"iIIilIlIil","t9IWuijp20etY8+Y3grH7aOvVDE0Pad2EjWmIQ2X32YY7KUJ8KjCMw==">();
               } else {
                  if (var24.IilliliilIIi() == Ililliillillii.IIliIliIIl) {
                     var21 ^= ((long)(iiIiIIilIIliIIil.iIlIlllllill(targets.iliIiiliiiii()) ? 0 : iiIiIIilIIliIIil.IliIlllilIi(targets.iliIiiliiiii())) ^ var21)
                        & -1L >>> 32;
                     if (var24.lIiiIiIlilli() >= 0 && (int)var21 != var24.lIiiIiIlilli()) {
                        return iIIilIlIil<"iIIilIlIil","cchlann1BhE0iXioHlEHzh9n+n8RJlxVDv/agd/wtjD5K3y5oPipq5q+kULO6JRaUcWCFv7BWydGeOHa1DBkAvRZ">()
                           + liIlliiIll((int)var21);
                     }
                  }

                  return null;
               }
            }
         } else {
            return iIIilIlIil<"iIIilIlIil","K7lA+UIoHTkk0Xz9ZCOUH5GR1r+ymuwtopB8JtUMGzq/h0ANXdrPsaGBVzoy+4B8">();
         }
      }
   }

   static lIiliiliIiliil IIIllIIliIIl(IIiiIiIllIiiIiIl w, lIiliiliIiliil c) {
      long var5 = 2083056536695546347L;
      w.IiIIlliIIl(c);

      try {
         for (long var9 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var9 >>> 32) < 2; var9 += 4294967296L) {
            if (w.IiiIlliiIl(c.lIiiIiIlilli((int)(var9 >>> 32)))) {
               return c.lIiiIiIlilli((int)(var9 >>> 32));
            }
         }

         return null;
      } finally {
         w.llIIlilIIl(c);
      }
   }

   public static Illiiilllliiil lIiiIiIlilli(llilIiililIi base, Set<lIiliiliIiliil> options, lIiliiliIiliil dirt, iIliIIiIlliIIi feet) {
      return iliIiiliiiii(base, options, dirt, feet, false);
   }

   private static double IlIllllIll(double a, double b, double t) {
      return a + (b - a) * t;
   }

   static int Iillllilll(IIiiIiIllIiiIiIl opt, lIiliiliIiliil startFeet, iIliIIiIlliIIi w) {
      long var11 = 390229803402242884L;
      long var13 = -25753442286294946L;
      IIlilillIlilil var3 = IIlilillIlilil.IiIlliIliiIl(opt, startFeet, w, 0, Set.of(), Set.of(startFeet));
      var11 ^= ((long)startFeet.Illlllllilll() << 32 ^ var11) & -1L << 32;

      for (lIiliiliIiliil var6 : var3.IliIlllilIi()) {
         var11 ^= ((long)Math.min((int)(var11 >>> 32), var6.Illlllllilll()) << 32 ^ var11) & -1L << 32;
      }

      if ((int)(var11 >>> 32) >= startFeet.Illlllllilll() && !opt.lllllliIll.isEmpty()) {
         IIlilillIlilil var15 = IIlilillIlilil.IlIlllIlilIl(opt, startFeet, w, 0, Set.of());
         HashMap var16 = new HashMap();

         for (lIiliiliIiliil var8 : var15.IliIlllilIi()) {
            var16.merge(var8.Illlllllilll(), 1, Integer::sum);
         }

         var11 ^= ((long)startFeet.Illlllllilll() ^ var11) & -1L >>> 32;
         var13 ^= (0L ^ var13) & -1L << 32;

         for (Entry var10 : var16.entrySet()) {
            if ((Integer)var10.getValue() > (int)(var13 >>> 32) || (Integer)var10.getValue() == (int)(var13 >>> 32) && (Integer)var10.getKey() > (int)var11) {
               var11 ^= ((long)((Integer)var10.getKey()).intValue() ^ var11) & -1L >>> 32;
               var13 ^= ((long)((Integer)var10.getValue()).intValue() << 32 ^ var13) & -1L << 32;
            }
         }

         if ((int)var11 >= startFeet.Illlllllilll() - 2) {
            return (int)(var11 >>> 32);
         } else {
            opt.lIillliIll = new HashSet<>(var15.IliIlllilIi());
            return (int)var11;
         }
      } else {
         return (int)(var11 >>> 32);
      }
   }

   private static Illiiilllliiil IIillIiliIil(
      llilIiililIi base, List<liiIililiiiIilil> targets, lIiliiliIiliil escalations, iIliIIiIlliIIi opt, String startFeet, long deadline, lIIIiiiiIIIiii stream
   ) {
      long var26 = 7564891850163227655L;
      long var28 = -3028889535005443890L;
      long var30 = 7816229663102863052L;
      IIiiIiIllIiiIiIl var8 = new IIiiIiIllIiiIiIl(base, targets);
      var8.IIillliIll = Iillllilll(var8, escalations, opt);
      ArrayList var9 = new ArrayList();
      ArrayList var10 = new ArrayList();
      LinkedHashSet var11 = new LinkedHashSet();

      for (liiIililiiiIilil var13 : targets) {
         var11.add(var13.liiiIIllIl());
      }

      for (liiIililiiiIilil var36 : targets) {
         if (!base.IliIlllilIi(var36.liiiIIllIl()).isEmpty() && !var36.IliIlllilIi()) {
            var9.add(
               new liIIIlliiIIIll(
                  ilIlIilIiIlIil.liliiilIiiiliiilIi,
                  var36.liiiIIllIl(),
                  null,
                  1,
                  null,
                  var36.iIlIlllllill() + iIIilIlIil<"iIIilIlIil","gFYPig+Rxhtyjz5wGDxLxOWhpFdenfNOmcuidSLjBrjW1u8BtgVORs5e5UnglFEOQpEeDO4=">()
               )
            );
         }
      }

      lIiliiliIiliil var35 = escalations;
      var26 ^= (0L ^ var26) & -1L << 32;
      Object var14 = List.of();
      var26 ^= (0L ^ var26) & -1L >>> 32;
      var28 ^= (0L ^ var28) & -1L << 32;

      while (!var11.isEmpty()) {
         int var10000 = (int)(var28 >>> 32);
         var28 += 4294967296L;
         if (var10000 >= 96) {
            break;
         }

         if (System.nanoTime() > deadline) {
            var26 ^= (1L ^ var26) & -1L >>> 32;
            break;
         }

         if (Thread.currentThread().isInterrupted()) {
            var26 ^= (1L ^ var26) & -1L >>> 32;
            break;
         }

         var28 ^= ((long)var11.stream().anyMatch(c -> !var8.IlIillIiilIi(c).IliIlllilIi()) ^ var28) & -1L >>> 32;
         IIlilillIlilil var18 = IIlilillIlilil.IlIlllIlilIl(var8, var35, opt, 0, var11);
         ArrayList var19 = new ArrayList();
         liIIiiiiiIIiii var20 = Ililllililil(var8, var18, opt, var11, var19, (boolean)((int)var28), opt.IIIilIIiiIIi() - (int)(var26 >>> 32));
         if (var20 == null && opt.IIIilIIiiIIi() - (int)(var26 >>> 32) > 0 && IIIilIIiiIIi(var19)) {
            var19.clear();
            var18 = IIlilillIlilil.IlIlllIlilIl(var8, var35, opt, opt.IIIilIIiiIIi() - (int)(var26 >>> 32), var11);
            var20 = Ililllililil(var8, var18, opt, var11, var19, (boolean)((int)var28), opt.IIIilIIiiIIi() - (int)(var26 >>> 32));
         }

         if (var20 == null) {
            if ((int)(var26 >>> 32) < opt.IIIilIIiiIIi() && IlIillIiilIi(var8, var11, var19, opt, opt.IIIilIIiiIIi() - (int)(var26 >>> 32))) {
               continue;
            }

            if (opt.IiIiliIiiiIi() && (int)(var26 >>> 32) < opt.IIIilIIiiIIi() && Iiilliiliiil(var8, var19)) {
               var8.IlillliIll = true;

               try {
                  var18 = IIlilillIlilil.IlIlllIlilIl(var8, var35, opt, opt.IIIilIIiiIIi() - (int)(var26 >>> 32), var11);
               } finally {
                  var8.IlillliIll = false;
               }

               var20 = Ililllililil(var8, var18, opt, var11, new ArrayList<>(), (boolean)((int)var28), opt.IIIilIIiiIIi() - (int)(var26 >>> 32));
            }

            if (var20 == null) {
               var14 = var19;
               break;
            }
         }

         liiIililiiiIilil var21 = opt.IIIilIIiiIIi() - (int)(var26 >>> 32) > 0 ? iiIIlIIlIl(var8, var20.liliiliIIl.liiiIIllIl(), var11) : null;
         if (var21 != null) {
            IIlilillIlilil var22 = IIlilillIlilil.IlIlllIlilIl(var8, var35, opt, opt.IIIilIIiiIIi() - (int)(var26 >>> 32), var11);
            liIIiiiiiIIiii var23 = Iliilliiilii(var8, var21, var22, opt, var11, new ArrayList<>());
            if (var23 != null) {
               var18 = var22;
               var20 = var23;
            }
         }

         lIiliiliIiliil var42 = var35;

         for (IIiIliIilIiIliIi var24 : var18.lIiiIiIlilli(var20.liliiliIIl.iIlIlllllill())) {
            switch (var24.iiiIlliIIi) {
               case illiiilIiIiliiilIi:
                  var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var24.lIIllliIIi, var24.lIIllliIIi, 0, null, ""));
                  var42 = var24.lIIllliIIi;
                  break;
               case lIliiilIiiIliiilIi:
                  if (!var42.equals(var24.IIIllliIIi)) {
                     var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var24.IIIllliIIi, var24.IIIllliIIi, 0, null, ""));
                  }

                  for (var30 ^= (0L ^ var30) & -1L << 32; (int)(var30 >>> 32) < var24.IlIllliIIi; var30 += 4294967296L) {
                     var8.llIIlilIIl(var24.IIIllliIIi.iIlIlllllill((int)(var30 >>> 32)));
                  }

                  var26 ^= ((long)((int)(var26 >>> 32) + var24.IlIllliIIi) << 32 ^ var26) & -1L << 32;
                  var9.add(
                     new liIIIlliiIIIll(
                        ilIlIilIiIlIil.iiIiiilIiIIliiilIi,
                        var24.IIIllliIIi,
                        var24.lIIllliIIi,
                        var24.IlIllliIIi,
                        null,
                        iIIilIlIil<"iIIilIlIil","Rxf5pchGY/N6Jj+juv2uMPhFuiBlNxz1z4OraPaoz9Cm/Rjzk3b/Gw==">() + var20.liliiliIIl.iIlIlllllill()
                     )
                  );
                  var42 = var24.lIIllliIIi;
                  break;
               case IIiiiilIilIiiiilIi:
                  lIiliiliIiliil var25 = var24.llIllliIIi == null ? var24.IIIllliIIi : var24.llIllliIIi;
                  if (!var42.equals(var25)) {
                     var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var25, var25, 0, null, ""));
                  }

                  var8.llIIlilIIl(var24.iIIllliIIi);
                  var26 += 4294967296L;
                  var9.add(
                     new liIIIlliiIIIll(
                        ilIlIilIiIlIil.lIliiilIiiIliiilIi,
                        var24.iIIllliIIi,
                        var25,
                        1,
                        var24.ilIllliIIi,
                        iIIilIlIil<"iIIilIlIil","dnCdCQwyV38wXy48nBMx8zFYnXIAj2VLyGA2jtwf2epUDRNWZntf9AKo5Ro=">() + var24.lIIllliIIi
                     )
                  );
                  var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var24.lIIllliIIi, var24.lIIllliIIi, 0, null, ""));
                  var42 = var24.lIIllliIIi;
                  break;
               case IiIiiilIiliIiiilIi:
                  if (!var42.equals(var24.IIIllliIIi)) {
                     var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var24.IIIllliIIi, var24.IIIllliIIi, 0, null, ""));
                  }

                  var8.IiIIlliIIl(var24.iIIllliIIi);
                  var9.add(
                     new liIIIlliiIIIll(
                        ilIlIilIiIlIil.IlliiilIillliiilIi,
                        var24.iIIllliIIi,
                        var24.lIIllliIIi,
                        1,
                        null,
                        iIIilIlIil<"iIIilIlIil","rVIUCP3zwSgQv/3GZ9u4qmIuBsHSSiG08PEH5uK6WJDvtemN65nFWex0yPl6fQ==">()
                     )
                  );
                  var42 = var24.lIIllliIIi;
            }
         }

         if (!var42.equals(var20.liliiliIIl.iIlIlllllill())) {
            var9.add(new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var20.liliiliIIl.iIlIlllllill(), var20.liliiliIIl.iIlIlllllill(), 0, null, ""));
         }

         liiIililiiiIilil var44 = var8.IlIillIiilIi(var20.liliiliIIl.liiiIIllIl());
         if (var8.Iilililiiili(var44.liiiIIllIl())) {
            var8.llIIlilIIl(var44.liiiIIllIl());
            var26 += 4294967296L;
            var9.add(
               new liIIIlliiIIIll(
                  ilIlIilIiIlIil.lIliiilIiiIliiilIi,
                  var44.liiiIIllIl(),
                  var20.liliiliIIl.iIlIlllllill(),
                  1,
                  var20.liliiliIIl,
                  iIIilIlIil<"iIIilIlIil","sEFu96WF+qxmNl+pKhEnI11dHyT6VQGAe34pIY1eIoRhwP11rHeW/vj4bhO/WOzHMpY=">() + var8.IIiilIiiiIii(var44.liiiIIllIl())
               )
            );
         } else {
            if (var44.IliIlllilIi() && var8.IIIIllIIIl(var44.liiiIIllIl())) {
               var8.IiIIlliIIl(var44.liiiIIllIl());
               var9.add(
                  new liIIIlliiIIIll(
                     ilIlIilIiIlIil.illiiilIiIiliiilIi,
                     var44.liiiIIllIl(),
                     var20.liliiliIIl.iIlIlllllill(),
                     1,
                     null,
                     iIIilIlIil<"iIIilIlIil","p7ijz8Iu7zu09tZAkTZOzPDmGmekZulheIujsqFVBW//kvRXsIduB/M7G4xquyg8BN3sLuFiXHCf9/Wr1L1VLO3kgaI=">()
                  )
               );
            }

            var9.add(
               new liIIIlliiIIIll(
                  ilIlIilIiIlIil.IIiiiilIilIiiiilIi, var44.liiiIIllIl(), var20.liliiliIIl.iIlIlllllill(), 1, var20.liliiliIIl, var44.iIlIlllllill()
               )
            );
            var8.iIIIlIlIIl(var44);
            var10.add(var44.liiiIIllIl());
         }

         var11.remove(var44.liiiIIllIl());
         var35 = var20.liliiliIIl.iIlIlllllill();
         if (stream != null) {
            stream.IliIlllilIi(var9);
         }
      }

      ArrayList var17 = new ArrayList();

      for (lIiliiliIiliil var39 : var11) {
         if (!var8.Iilililiiili(var39)) {
            var17.add(var39);
         }
      }

      String var38 = (int)var26 != 0 ? (startFeet + iIIilIlIil<"iIIilIlIil","9Rw/DMnY5wdVIHfFz9jRjVs8F4imf2M42h7fmrr2Oye6oU8QkaXQVg==">()).trim() : startFeet;
      List var40 = var17.isEmpty() ? List.of() : iIlllIllll(var17, (List<iIIIliiIlIIlii>)var14, var38);
      ilIlIIliIiIlIIli var41 = var17.isEmpty() ? ilIlIIliIiIlIIli.iIlIllIlIi : ilIlIIliIiIlIIli.IllIllIlIi;
      return new Illiiilllliiil(
         var41,
         List.copyOf(var9),
         List.copyOf(var10),
         List.copyOf(var17),
         List.copyOf((Collection<? extends iIIIliiIlIIlii>)var14),
         var40,
         (int)(var26 >>> 32),
         var38.trim()
      );
   }

   private static liIllIlliiIllIll IiIlliIliiIl(IIiiIiIllIiiIiIl w, IIlilillIlilil remaining, iIliIIiIlliIIi nav, Set<lIiliiliIiliil> opt, lIiliiliIiliil feet) {
      long var8 = -3977406324036116373L;
      if (w.llillliIll && opt.size() > 1) {
         HashSet var5 = new HashSet();

         for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < 8; var10 += 4294967296L) {
            liIllIlliiIllIll var7 = Illlllllilll(w, remaining, nav, opt, feet, var5);
            if (var7 == null || IIlllIlliIll(w, remaining, nav, opt, var7)) {
               return var7;
            }

            var5.add(iIliIIiIlliIIi.liiiIIllIl(var7.IliIlllilIi(), var7.liiiIIllIl()));
            w.ilillliIll.add(var7.IliIlllilIi());
         }

         return null;
      } else {
         return Illlllllilll(w, remaining, nav, opt, feet, Set.of());
      }
   }

   public static String liIlliiIll(int dir) {
      return switch (dir) {
         case 0 -> iIIilIlIil<"iIIilIlIil","IrwT8nGK+/1S2gEvLRf106r5/ukxr0deT57gyI+9ZdE=">();
         case 1 -> iIIilIlIil<"iIIilIlIil","/1tGU+MSbtueYnxJizJjDhGkP+8ODnRvdpmjUFYM">();
         case 2 -> iIIilIlIil<"iIIilIlIil","90C7vYsdJarcFksIU/9nZrMisz1MApmns+qRdHxNuaIF">();
         case 3 -> iIIilIlIil<"iIIilIlIil","ANT9OG1OEqadmwpDeb9d6aAVmXSJoly2PMdvxL6gvhwK">();
         case 4 -> iIIilIlIil<"iIIilIlIil","wFabmCdQYV6XM1/JhFoQUaMZ6AaT0gC47R+VVen6KH0=">();
         case 5 -> iIIilIlIil<"iIIilIlIil","7CUBY1nnFF1XwEQetJ0rp5n/v1yAbGSSmkhlEQWMKbs=">();
         default -> iIIilIlIil<"iIIilIlIil","zolP/kg6ViyuEjGUAdQDfXMhHy1HB7Gd9NEt7tk=">();
      };
   }

   public static void IliIlllilIi() {
      IIiIiiliil = 0;
   }

   private static lIiliiliIiliil IIIIllIIIl(IIiiIiIllIiiIiIl t, liiIililiiiIilil w) {
      long var9 = 2241847800220680119L;
      long var11 = 4798118121100889509L;
      long var13 = 964242325986121618L;
      var9 ^= (-8589934592L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) <= 2) {
         for (var9 ^= (-2L ^ var9) & -1L >>> 32; (int)var9 <= 2; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            int[] var4 = llIiIiililIiIiil.iiilIIilil;
            var11 ^= ((long)var4.length << 32 ^ var11) & -1L << 32;

            for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               var13 ^= ((long)var4[(int)var11] << 32 ^ var13) & -1L << 32;
               lIiliiliIiliil var8 = w.liiiIIllIl().IliIlllilIi((int)(var9 >>> 32), (int)(var13 >>> 32), (int)var9);
               if (!var8.equals(w.liiiIIllIl()) && t.IiIlliIliiIl(var8.IilliliilIIi()) && t.IliIlllilIi(var8).isEmpty()) {
                  return var8.IilliliilIIi();
               }
            }
         }

         var9 += 4294967296L;
      }

      return null;
   }

   private static liIIiiiiiIIiii Iliilliiilii(
      IIiiIiIllIiiIiIl w, liiIililiiiIilil remaining, IIlilillIlilil nav, iIliIIiIlliIIi opt, Set<lIiliiliIiliil> blockers, List<iIIIliiIlIIlii> t
   ) {
      liIIiiiiiIIiii var6 = Iiiiliiiiiii(w, remaining, nav, opt, blockers, t, false, false);
      if (var6 == null && remaining.IliIlllilIi() && !t.isEmpty() && remaining.liiiIIllIl().equals(((iIIIliiIlIIlii)t.get(t.size() - 1)).IliIlllilIi())) {
         iIIIliiIlIIlii var7 = (iIIIliiIlIIlii)t.remove(t.size() - 1);
         var6 = Iiiiliiiiiii(w, remaining, nav, opt, blockers, t, false, true);
         if (var6 == null) {
            t.set(t.size() - 1, var7);
         }
      }

      if (var6 != null && !llIiIiililIiIiil.IliIlllilIi(var6.liliiliIIl.iIlIlllllill().Illlllllilll(), remaining.liiiIIllIl().Illlllllilll())) {
         IiIliiliil.incrementAndGet();
      }

      return var6;
   }

   private static liIIiiiiiIIiii Ililllililil(
      IIiiIiIllIiiIiIl remaining,
      IIlilillIlilil w,
      iIliIIiIlliIIi nav,
      Set<lIiliiliIiliil> opt,
      List<iIIIliiIlIIlii> nonFluidLeft,
      boolean dirtLeft,
      int blockers
   ) {
      long var13 = 4528332008302311975L;
      liIIiiiiiIIiii var7 = null;

      for (lIiliiliIiliil var9 : opt) {
         liiIililiiiIilil var10 = remaining.IlIillIiilIi(var9);
         if (!var10.IliIlllilIi() || !dirtLeft) {
            liIIiiiiiIIiii var11 = Iliilliiilii(remaining, var10, w, nav, opt, nonFluidLeft);
            if (var11 != null) {
               var13 ^= ((long)(w.IilliliilIIi(var11.IliIlllilIi().iIlIlllllill()).iIlIlllllill() + (remaining.Iilililiiili(var9) ? 1 : 0)) << 32 ^ var13)
                  & -1L << 32;
               if ((int)(var13 >>> 32) <= blockers
                  && (
                     var7 == null
                        || var11.iiliiliIIl < var7.iiliiliIIl - 1.0E-6
                        || Math.abs(var11.iiliiliIIl - var7.iiliiliIIl) <= 1.0E-6 && var11.liliiliIIl.Illlllllilll() > var7.liliiliIIl.Illlllllilll()
                  )) {
                  var7 = var11;
               }
            }
         }
      }

      return var7;
   }

   private static double ilIllIiIll(double[] x, double e, double z, double y) {
      double var7 = x[0] - e;
      double var9 = x[1] - z;
      double var11 = x[2] - y;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   private static double IIiIllIiIl(double b, double c, double a) {
      double var6 = Math.max(b, Math.max(c, a));
      if (b == var6) {
         return Math.max(c, a);
      } else {
         return c == var6 ? Math.max(b, a) : Math.max(b, c);
      }
   }

   private static boolean Iilililiiili(IIiiIiIllIiiIiIl chainCells, lIiliiliIiliil w, Set<lIiliiliIiliil> target, lIiliiliIiliil m) {
      long var6 = 1684149025283085449L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 6; var8 += 4294967296L) {
         lIiliiliIiliil var5 = w.iliIiiliiiii((int)(var8 >>> 32));
         if (!var5.equals(m) && !target.contains(var5) && !chainCells.IliIlllilIi(var5).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   public static Illiiilllliiil IilliliilIIi(
      llilIiililIi base, List<liiIililiiiIilil> targets, lIiliiliIiliil feet, iIliIIiIlliIIi options, lIIIiiiiIIIiii stream
   ) {
      long var13 = 688538927350878096L;
      if (targets.isEmpty()) {
         return new Illiiilllliiil(ilIlIIliIiIlIIli.lllIllIlIi, List.of(), List.of(), List.of(), List.of(), List.of(), 0, "");
      } else {
         iIliIIiIlliIIi var5 = options;
         StringBuilder var6 = new StringBuilder();
         Illiiilllliiil var7 = null;
         StringBuilder var8 = new StringBuilder(iIIilIlIil<"iIIilIlIil","PYtq6rWm4qBH4vziSwgqiGLtGABnNzBiSYem1iFclGktKh0=">());
         long var9 = options.Iliilliiilii() > 0L ? System.nanoTime() + options.Iliilliiilii() : Long.MAX_VALUE;
         if (stream != null) {
            stream.liiiIIllIl();
         }

         for (long var15 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var15 >>> 32) < 4; var15 += 4294967296L) {
            Illiiilllliiil var12 = IIillIiliIil(base, targets, feet, var5, var6.toString(), var9, (int)(var15 >>> 32) == 0 ? stream : null);
            if (var7 == null || var12.lIiiIiIlilli().size() > var7.lIiiIiIlilli().size()) {
               var7 = var12;
            }

            if (var12.IliIlllilIi()) {
               return var12;
            }

            if (System.nanoTime() > var9) {
               var8.append(iIIilIlIil<"iIIilIlIil","7bfmX9/zP6DBW7iFbjGzZXoHU6QK8fZUZtH2u3HL1/uoINjE+zeVcg==">());
               break;
            }

            if ((int)(var15 >>> 32) == 0 && stream != null && !stream.IilliliilIIi()) {
               var8.append(iIIilIlIil<"iIIilIlIil","8VMThQPOazI4KuWmHk3eONjt1pfBeBO8VcRuFNFBe36eAllyQQ==">());
               break;
            }

            if ((int)(var15 >>> 32) == 0 && !var5.iiIiiiiliIIliiiili) {
               var5 = var5.IiIlliIliiIl();
               var6.append(iIIilIlIil<"iIIilIlIil","lZbPzbCkg5+bfADjep99LReNbu4Tna7c4dJsW8LNcBwLdB5M7A==">());
               var8.append(iIIilIlIil<"iIIilIlIil","lZbPzbCkg5+bfADjep99LReNbu4Tna7c4dJsW8LNcBwLdB5M7A==">());
            } else if ((int)(var15 >>> 32) <= 1 && !var5.lIliiiiliiIliiiili) {
               var5 = var5.IIlllIlliIll();
               var6.append(iIIilIlIil<"iIIilIlIil","bnAiQ9VPl9/IDoxivXjd7s85FSccwxfNnPKvos3RhClW3Dz47LGbmw7iRvQ=">());
               var8.append(iIIilIlIil<"iIIilIlIil","bnAiQ9VPl9/IDoxivXjd7s85FSccwxfNnPKvos3RhClW3Dz47LGbmw7iRvQ=">());
            } else {
               if ((int)(var15 >>> 32) > 2 || var5.Illiiiilillliiiili) {
                  break;
               }

               var5 = var5.Ililllililil();
               var6.append(iIIilIlIil<"iIIilIlIil","9pO/CIlFvKi4NGs69vVWMHcz6c+8x2+zxXAWrtP8qVlFb/a9TXQn8uEF">());
               var8.append(iIIilIlIil<"iIIilIlIil","9pO/CIlFvKi4NGs69vVWMHcz6c+8x2+zxXAWrtP8qVlFb/a9TXQn8uEF">());
            }
         }

         if (var7 != null && !var7.IliIlllilIi()) {
            String var11 = var8.toString().trim();
            if (var7.IIlllIlliIll().contains(iIIilIlIil<"iIIilIlIil","Aj8vJn6FZfc1d66ca/5aQRkCgcEX/TdFGR8AE0s+4Azt7sWNbkJb">())
               && !var11.contains(iIIilIlIil<"iIIilIlIil","Aj8vJn6FZfc1d66ca/5aQRkCgcEX/TdFGR8AE0s+4Azt7sWNbkJb">())) {
               var11 = (var11 + iIIilIlIil<"iIIilIlIil","9Rw/DMnY5wdVIHfFz9jRjVs8F4imf2M42h7fmrr2Oye6oU8QkaXQVg==">()).trim();
            }

            if (!var11.equals(var7.IIlllIlliIll().trim())) {
               var7 = new Illiiilllliiil(
                  var7.iIlIlllllill(),
                  var7.IilliliilIIi(),
                  var7.lIiiIiIlilli(),
                  var7.iliIiiliiiii(),
                  var7.IIIllIIliIIl(),
                  iIlllIllll(var7.iliIiiliiiii(), var7.IIIllIIliIIl(), var11),
                  var7.IiIlliIliiIl(),
                  var11
               );
            }
         }

         return var7;
      }
   }
}
