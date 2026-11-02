package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_2211;
import net.minecraft.class_2248;
import net.minecraft.class_2315;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2377;
import net.minecraft.class_238;
import net.minecraft.class_2402;
import net.minecraft.class_2426;
import net.minecraft.class_2530;
import net.minecraft.class_2533;
import net.minecraft.class_265;
import net.minecraft.class_2665;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_5635;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;

final class llIlIlililIlIlil implements llilIiililIi {
   private final HashSet<Long> IiIlIIiIil;
   private final HashMap<Long, List<IIlIIIilIlIIIi>> IIllIIiIil;
   private final HashSet<Long> iIllIIiIil;
   private final HashMap<Long, List<IIlIIIilIlIIIi>> iiIlIIiIil;
   private final HashSet<Long> IlllIIiIil;
   private final HashSet<Long> lIllIIiIil;
   private final HashMap<Long, List<IIlIIIilIlIIIi>> liIlIIiIil;
   private final HashMap<Long, lilliIlliilliIll> ilIlIIiIil = new HashMap<>();

   @Override
   public boolean IiIlliIliiIl(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.IIIllIIliIIl();
   }

   @Override
   public List<IIlIIIilIlIIIi> liiiIIllIl(lIiliiliIiliil c) {
      List var2 = this.liIlIIiIil.get(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
      return var2 != null ? var2 : this.IliIlllilIi(c);
   }

   @Override
   public boolean Illlllllilll(lIiliiliIiliil c) {
      return !this.IlllIIiIil.isEmpty() && this.IlllIIiIil.contains(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
   }

   private llIlIlililIlIlil() {
      this.IiIlIIiIil = new HashSet<>();
      this.liIlIIiIil = new HashMap<>();
      this.iiIlIIiIil = new HashMap<>();
      this.IIllIIiIil = new HashMap<>();
      this.lIllIIiIil = new HashSet<>();
      this.iIllIIiIil = new HashSet<>();
      this.IlllIIiIil = new HashSet<>();
   }

   private static boolean IIIilIIiiIIi(class_2680 st) {
      class_2248 var1 = st.method_26204();
      return var1 instanceof class_2665
         || var1 instanceof class_2530
         || var1 instanceof class_2315
         || var1 instanceof class_2323
         || var1 instanceof class_2533
         || var1 instanceof class_2349
         || var1 instanceof class_2426;
   }

   @Override
   public boolean IIIllIIliIIl(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.lIiiIiIlilli();
   }

   private lilliIlliilliIll IlIillIiilIi(lIiliiliIiliil c) {
      return this.ilIlIIiIil.get(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
   }

   @Override
   public boolean IlIlllIlilIl(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.iliIiiliiiii();
   }

   @Override
   public List<IIlIIIilIlIIIi> iIlIlllllill(lIiliiliIiliil c) {
      List var2 = this.iiIlIIiIil.get(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
      return var2 != null ? var2 : this.liiiIIllIl(c);
   }

   @Override
   public boolean lIiiIiIlilli(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.iIlIlllllill();
   }

   static llIlIlililIlIlil Iiilliiliiil(
      iIlIilIlIllIilIl extraBounds, List<liiIililiiiIilil> marginXZ, class_2338 ab, int foreign, Set<Long> targets, Set<Long> reserved, Collection<Long> feet
   ) {
      class_310 var7 = class_310.method_1551();
      int var8 = ab.method_10263();
      int var9 = ab.method_10263();
      int var10 = ab.method_10264();
      int var11 = ab.method_10264();
      int var12 = ab.method_10260();
      int var13 = ab.method_10260();

      for (liiIililiiiIilil var15 : marginXZ) {
         var8 = Math.min(var8, var15.liiiIIllIl().IIlllIlliIll());
         var9 = Math.max(var9, var15.liiiIIllIl().IIlllIlliIll());
         var10 = Math.min(var10, var15.liiiIIllIl().Illlllllilll());
         var11 = Math.max(var11, var15.liiiIIllIl().Illlllllilll());
         var12 = Math.min(var12, var15.liiiIIllIl().Iilllilliill());
         var13 = Math.max(var13, var15.liiiIIllIl().Iilllilliill());
      }

      for (long var40 : feet) {
         class_2338 var17 = class_2338.method_10092(var40);
         var8 = Math.min(var8, var17.method_10263());
         var9 = Math.max(var9, var17.method_10263());
         var10 = Math.min(var10, var17.method_10264());
         var11 = Math.max(var11, var17.method_10264());
         var12 = Math.min(var12, var17.method_10260());
         var13 = Math.max(var13, var17.method_10260());
      }

      var8 -= foreign;
      var9 += foreign;
      var12 -= foreign;
      var13 += foreign;
      var10 -= 6;
      var11 += 6;
      llIlIlililIlIlil var39 = new llIlIlililIlIlil();

      for (Entry var16 : extraBounds.liiiiIiiIl.entrySet()) {
         if (extraBounds.IIiIiiliIl < (Integer)var16.getValue()) {
            var39.lIllIIiIil.add((Long)var16.getKey());
         }
      }

      HashSet var42 = new HashSet();
      boolean var43 = false;
      HashSet var44 = new HashSet();

      for (liiIililiiiIilil var19 : marginXZ) {
         if (var19.IiIlliIliiIl() == 0 && var19.IilliliilIIi() != Ililliillillii.ilIiIliIIl && var19.IilliliilIIi() != Ililliillillii.IiIiIliIIl) {
            var44.add(class_2338.method_10064(var19.liiiIIllIl().IIlllIlliIll(), var19.liiiIIllIl().Illlllllilll(), var19.liiiIIllIl().Iilllilliill()));
         }
      }

      for (liiIililiiiIilil var48 : marginXZ) {
         if (var48.IliIlllilIi()) {
            var43 = true;
            break;
         }
      }

      for (liiIililiiiIilil var49 : marginXZ) {
         class_2338 var20 = new class_2338(var49.liiiIIllIl().IIlllIlliIll(), var49.liiiIIllIl().Illlllllilll(), var49.liiiIIllIl().Iilllilliill());
         int var21 = extraBounds.llIilIiilIilIi(var20);
         if (var21 >= 0 && IIIilIIiiIIi(extraBounds.iiiliiliIl.get(var21))) {
            var42.add(var20.method_10063());
         }

         if (var21 >= 0 && IIIlIIIilIIlIIIi.iIlIlllllill(extraBounds.iiiliiliIl.get(var21)) && extraBounds.iiiliiliIl.get(var21).method_26227().method_15769()) {
            var39.IlllIIiIil.add(var20.method_10063());
         }
      }

      class_2339 var47 = new class_2339();

      for (int var50 = var8; var50 <= var9; var50++) {
         for (int var54 = var10; var54 <= var11; var54++) {
            for (int var58 = var12; var58 <= var13; var58++) {
               var47.method_10103(var50, var54, var58);
               class_2680 var22 = var7.field_1687.method_8320(var47);
               if (!var22.method_26215()) {
                  if (IIIilIIiiIIi(var22)) {
                     var42.add(var47.method_10063());
                  }

                  class_265 var23 = var22.method_26220(var7.field_1687, var47);
                  List var24;
                  if (var23.method_1110()) {
                     var24 = iIlllIIiIllllIIi.iliIiiliil;
                  } else {
                     ArrayList var25 = new ArrayList(2);

                     for (class_238 var27 : var23.method_1090()) {
                        var25.add(
                           new IIlIIIilIlIIIi(var27.field_1323, var27.field_1322, var27.field_1321, var27.field_1320, var27.field_1325, var27.field_1324)
                        );
                     }

                     var24 = List.copyOf(var25);
                  }

                  class_265 var67 = var43 ? var22.method_26218(var7.field_1687, var47) : var23;
                  if (var67 != var23 && !var67.method_1110()) {
                     ArrayList var69 = new ArrayList(2);

                     for (class_238 var28 : var67.method_1090()) {
                        var69.add(
                           new IIlIIIilIlIIIi(var28.field_1323, var28.field_1322, var28.field_1321, var28.field_1320, var28.field_1325, var28.field_1324)
                        );
                     }

                     var39.iiIlIIiIil.put(var47.method_10063(), List.copyOf(var69));
                  }

                  if (var43 && var22.method_26204() instanceof class_2402) {
                     var39.iIllIIiIil.add(var47.method_10063());
                  }

                  boolean var70 = IIIlIIIilIIlIIIi.iIlIlllllill(var22);
                  boolean var73 = IIIlIIIilIIlIIIi.IilliliilIIi(var22) && !(var22.method_26204() instanceof class_2377);
                  if (var70 && var22.method_26227().method_15769()) {
                     var39.IlllIIiIil.add(var47.method_10063());
                  }

                  if (var22.method_26204() instanceof class_2211) {
                     var39.IlllIIiIil.add(var47.method_10063());
                  }

                  if (var24.isEmpty() && !var70 && !var73) {
                     if (var22.method_26204() instanceof class_2349 && lIiIliIliIiIliIl.iliIiiliiiii(var22)) {
                        ArrayList var78 = new ArrayList(2);

                        for (class_238 var85 : var22.method_26218(var7.field_1687, var47).method_1090()) {
                           var78.add(
                              new IIlIIIilIlIIIi(var85.field_1323, var85.field_1322, var85.field_1321, var85.field_1320, var85.field_1325, var85.field_1324)
                           );
                        }

                        if (!var78.isEmpty()) {
                           var39.IIllIIiIil.put(var47.method_10063(), List.copyOf(var78));
                           var39.ilIlIIiIil
                              .put(var47.method_10063(), new lilliIlliilliIll(var24, false, false, iIlIilIlIllIilIl.Illliillllii(var22), false, false, false));
                        }
                     }

                     if (lIiIliIliIiIliIl.IIIllIIliIIl(var22) && var44.contains(class_2338.method_10064(var50, var54 + 1, var58))) {
                        ArrayList var79 = new ArrayList(3);

                        for (class_238 var86 : var22.method_26218(var7.field_1687, var47).method_1090()) {
                           var79.add(
                              new IIlIIIilIlIIIi(var86.field_1323, var86.field_1322, var86.field_1321, var86.field_1320, var86.field_1325, var86.field_1324)
                           );
                        }

                        if (!var79.isEmpty()) {
                           var39.IIllIIiIil.put(var47.method_10063(), List.copyOf(var79));
                        }
                     }
                  } else {
                     var39.ilIlIIiIil
                        .put(
                           var47.method_10063(),
                           new lilliIlliilliIll(
                              var24, var70, var73, iIlIilIlIllIilIl.Illliillllii(var22), extraBounds.illlIiliIl.contains(var47.method_10063()), false, false
                           )
                        );
                     if (var24.isEmpty() && var22.method_26204() instanceof class_5635) {
                        ArrayList var75 = new ArrayList(1);

                        for (class_238 var30 : var22.method_26218(var7.field_1687, var47).method_1090()) {
                           var75.add(
                              new IIlIIIilIlIIIi(var30.field_1323, var30.field_1322, var30.field_1321, var30.field_1320, var30.field_1325, var30.field_1324)
                           );
                        }

                        if (!var75.isEmpty()) {
                           var39.IIllIIiIil.put(var47.method_10063(), List.copyOf(var75));
                        }
                     }

                     if (!var23.method_1110() && var23.method_1105(class_2351.field_11052) > 1.0001) {
                        class_265 var76 = var22.method_26218(var7.field_1687, var47);
                        ArrayList var80 = new ArrayList(4);

                        for (class_238 var31 : var76.method_1090()) {
                           var80.add(
                              new IIlIIIilIlIIIi(var31.field_1323, var31.field_1322, var31.field_1321, var31.field_1320, var31.field_1325, var31.field_1324)
                           );
                        }

                        var39.liIlIIiIil.put(var47.method_10063(), List.copyOf(var80));
                     }

                     if (var22.method_26204() instanceof class_2377 && !var24.isEmpty()) {
                        ArrayList var77 = new ArrayList(var24);
                        var77.add(new IIlIIIilIlIIIi(0.125, 1.0, 0.125, 0.875, 1.0, 0.875));
                        var39.liIlIIiIil.put(var47.method_10063(), List.copyOf(var77));
                     }
                  }
               }
            }
         }
      }

      for (long var55 : targets) {
         class_2338 var59 = class_2338.method_10092(var55);
         if (var59.method_10263() >= var8
            && var59.method_10263() <= var9
            && var59.method_10264() >= var10
            && var59.method_10264() <= var11
            && var59.method_10260() >= var12
            && var59.method_10260() <= var13) {
            int var62 = extraBounds.llIilIiilIilIi(var59);
            if (var62 >= 0 && !extraBounds.iiiliiliIl.get(var62).method_26234(var7.field_1687, var59)) {
               var39.IiIlIIiIil.add(var55);
            }

            if (var62 >= 0 && IIIilIIiiIIi(extraBounds.iiiliiliIl.get(var62))) {
               var42.add(var55);
            }

            lilliIlliilliIll var65 = var39.ilIlIIiIil.get(var55);
            if (var65 == null) {
               var39.ilIlIIiIil.put(var55, new lilliIlliilliIll(iIlllIIiIllllIIi.iliIiiliil, false, false, false, false, true, false));
            } else if (!var65.iliIiiliiiii()) {
               var39.ilIlIIiIil
                  .put(
                     var55,
                     new lilliIlliilliIll(
                        var65.IliIlllilIi(), var65.liiiIIllIl(), var65.iIlIlllllill(), var65.IilliliilIIi(), var65.lIiiIiIlilli(), true, var65.IIIllIIliIIl()
                     )
                  );
            }
         }
      }

      for (long var56 : reserved) {
         class_2338 var60 = class_2338.method_10092(var56);
         if (var60.method_10263() >= var8
            && var60.method_10263() <= var9
            && var60.method_10264() >= var10
            && var60.method_10264() <= var11
            && var60.method_10260() >= var12
            && var60.method_10260() <= var13) {
            lilliIlliilliIll var63 = var39.ilIlIIiIil.get(var56);
            if (var63 == null) {
               var39.ilIlIIiIil.put(var56, new lilliIlliilliIll(iIlllIIiIllllIIi.iliIiiliil, false, false, false, false, true, true));
            } else if (var63.IliIlllilIi().isEmpty() && !var63.IIIllIIliIIl()) {
               var39.ilIlIIiIil
                  .put(
                     var56,
                     new lilliIlliilliIll(var63.IliIlllilIi(), var63.liiiIIllIl(), var63.iIlIlllllill(), var63.IilliliilIIi(), var63.lIiiIiIlilli(), true, true)
                  );
            }
         }
      }

      for (long var57 : var42) {
         for (class_2350 var68 : class_2350.values()) {
            class_2338 var71 = class_2338.method_10092(var57).method_10093(var68);
            if (var71.method_10263() >= var8
               && var71.method_10263() <= var9
               && var71.method_10264() >= var10
               && var71.method_10264() <= var11
               && var71.method_10260() >= var12
               && var71.method_10260() <= var13) {
               long var74 = var71.method_10063();
               lilliIlliilliIll var83 = var39.ilIlIIiIil.get(var74);
               if ((var83 == null || !var83.iliIiiliiiii() && var83.IliIlllilIi().isEmpty())
                  && (extraBounds.llllIlilllIl(var71) != null || extraBounds.liIlIliiIlIl(var71) != null)) {
                  var39.ilIlIIiIil
                     .put(
                        var74,
                        var83 == null
                           ? new lilliIlliilliIll(iIlllIIiIllllIIi.iliIiiliil, false, false, false, false, true, false)
                           : new lilliIlliilliIll(
                              var83.IliIlllilIi(),
                              var83.liiiIIllIl(),
                              var83.iIlIlllllill(),
                              var83.IilliliilIIi(),
                              var83.lIiiIiIlilli(),
                              true,
                              var83.IIIllIIliIIl()
                           )
                     );
                  var39.IiIlIIiIil.add(var74);
               }
            }
         }
      }

      return var39;
   }

   @Override
   public boolean IilliliilIIi(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.liiiIIllIl();
   }

   @Override
   public List<IIlIIIilIlIIIi> Ililllililil(lIiliiliIiliil c) {
      List var2 = this.IIllIIiIil.get(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
      return var2 != null ? var2 : List.of();
   }

   @Override
   public boolean IIillIiliIil(lIiliiliIiliil c) {
      return !this.iIllIIiIil.isEmpty() && this.iIllIIiIil.contains(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
   }

   @Override
   public List<IIlIIIilIlIIIi> IliIlllilIi(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 == null ? iIlllIIiIllllIIi.iliIiiliil : var2.IliIlllilIi();
   }

   @Override
   public boolean iliIiiliiiii(lIiliiliIiliil c) {
      lilliIlliilliIll var2 = this.IlIillIiilIi(c);
      return var2 != null && var2.IilliliilIIi();
   }

   @Override
   public boolean Iilllilliill(lIiliiliIiliil c) {
      return !this.IiIlIIiIil.contains(class_2338.method_10064(c.IIlllIlliIll(), c.Illlllllilll(), c.Iilllilliill()));
   }

   @Override
   public boolean IIlllIlliIll(lIiliiliIiliil b) {
      return this.lIllIIiIil.contains(class_2338.method_10064(b.IIlllIlliIll(), b.Illlllllilll(), b.Iilllilliill()));
   }
}
