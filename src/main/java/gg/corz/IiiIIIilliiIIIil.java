package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;

public final class IiiIIIilliiIIIil {
   public static final String iIIIIlIIil = "constructible poses: a dirt floor makes them standable";
   public static final int liiiiIIIil = 24;
   public static final int IIiiiIIIil = 16;
   public static final String IliiiIIIil = "future-stand boundary";
   static final double IiiiiIIIil = 0.6;
   static final int iliiiIIIil = 2;
   public static final int iiliiIIIil = 24;
   public static final int lIiiiIIIil = 6;
   static final int lliiiIIIil = 3;
   public static final long iIiiiIIIil = Long.MIN_VALUE;
   public static final String IIIIIlIIil = "foot-layer poses: the head-level boundary was refuted";
   public static final String iiiiiIIIil = "head-level poses: no stand at the family's layer or one above can exist";
   public static final String lIIIIlIIil = "edge-bridge descent";
   public static final String liliiIIIil = "service-access";

   static Set<lIiliiliIiliil> IiIlliIliiIl(Collection<lIiliiliIiliil> walk, Collection<lIiliiliIiliil> floorY, int poses) {
      long var11 = -8299366852648682368L;
      long var13 = 407485606456194905L;
      LinkedHashSet var3 = new LinkedHashSet<>(IlIlllIlilIl(walk, poses));

      for (lIiliiliIiliil var5 : walk) {
         lIiliiliIiliil var6 = null;
         var11 ^= (9223372032559808512L ^ var11) & -1L << 32;

         for (lIiliiliIiliil var9 : floorY) {
            var11 ^= (
                  (long)(
                        Math.abs(var9.IIlllIlliIll() - var5.IIlllIlliIll())
                           + Math.abs(var9.Illlllllilll() - var5.Illlllllilll())
                           + Math.abs(var9.Iilllilliill() - var5.Iilllilliill())
                     )
                     ^ var11
               )
               & -1L >>> 32;
            if (var6 == null || (int)var11 < (int)(var11 >>> 32) || (int)var11 == (int)(var11 >>> 32) && var9.IIIllIIliIIl() < var6.IIIllIIliIIl()) {
               var6 = var9;
               var11 ^= ((long)((int)var11) << 32 ^ var11) & -1L << 32;
            }
         }

         if (var6 != null) {
            var13 ^= ((long)var6.IIlllIlliIll() << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)var6.Illlllllilll() ^ var13) & -1L >>> 32;
            var11 ^= ((long)var6.Iilllilliill() ^ var11) & -1L >>> 32;
            var3.add(var6);

            while ((int)(var13 >>> 32) != var5.IIlllIlliIll()) {
               var13 ^= ((long)((int)(var13 >>> 32) + Integer.signum(var5.IIlllIlliIll() - (int)(var13 >>> 32))) << 32 ^ var13) & -1L << 32;
               var3.add(new lIiliiliIiliil((int)(var13 >>> 32), (int)var13, (int)var11));
            }

            while ((int)var11 != var5.Iilllilliill()) {
               var11 ^= ((long)((int)var11 + Integer.signum(var5.Iilllilliill() - (int)var11)) ^ var11) & -1L >>> 32;
               var3.add(new lIiliiliIiliil((int)(var13 >>> 32), (int)var13, (int)var11));
            }

            while ((int)var13 != var5.Illlllllilll()) {
               var13 ^= ((long)((int)var13 + Integer.signum(var5.Illlllllilll() - (int)var13)) ^ var13) & -1L >>> 32;
               var3.add(new lIiliiliIiliil((int)(var13 >>> 32), (int)var13, (int)var11));
            }
         }
      }

      return var3;
   }

   public static lIilliIill IIillIiliIil(
      llilIiililIi remaining,
      lIiliiliIiliil base,
      Collection<lIiliiliIiliil> unbuiltSchematic,
      Set<lIiliiliIiliil> feet,
      iIliIIiIlliIIi footLayerOnly,
      boolean opt
   ) {
      return Iiilliiliiil(remaining, base, unbuiltSchematic, feet, footLayerOnly, opt, false);
   }

   static int IiIiliIiiiIi(llilIiililIi unbuiltSchematic, lliiililiiil opt, Set<lIiliiliIiliil> s, iIliIIiIlliIIi f, lIiliiliIiliil base) {
      return IiIIlliIIl(IllIllllIl(unbuiltSchematic, opt, s == null ? Set.of() : s), base, opt.iIlIlllllill(), f.Iiilliiliiil());
   }

   static int IIlilIliiIli(iIliIIiIlliIIi opt) {
      return (int)Math.ceil(opt.Iiilliiliiil()) + 2;
   }

   private static lIiliiliIiliil Illlllllilll(IIlilillIlilil poses, List<lIiliiliIiliil> nav, Map<lIiliiliIiliil, Integer> coverage) {
      long var12 = -2592592059689937494L;
      lIiliiliIiliil var3 = null;
      double var4 = Double.POSITIVE_INFINITY;
      var12 ^= (-4294967296L ^ var12) & -1L << 32;

      for (lIiliiliIiliil var8 : nav) {
         double var9 = poses.liiiIIllIl(var8);
         if (var9 != Double.POSITIVE_INFINITY) {
            var12 ^= ((long)((Integer)coverage.get(var8)).intValue() ^ var12) & -1L >>> 32;
            if (var3 == null || var9 < var4 - 1.0E-6 || Math.abs(var9 - var4) <= 1.0E-6 && (int)var12 > (int)(var12 >>> 32)) {
               var3 = var8;
               var4 = var9;
               var12 ^= ((long)((int)var12) << 32 ^ var12) & -1L << 32;
            }
         }
      }

      return var3;
   }

   private static IIlilillIlilil IIlllIlliIll(
      IIiiIiIllIiiIiIl options, lIiliiliIiliil serviceSpine, iIliIIiIlliIIi overlay, Set<lIiliiliIiliil> window, Set<lIiliiliIiliil> hot, boolean feet
   ) {
      long var9 = -2873739885735196054L;
      var9 ^= ((long)options.IlillliIll << 32 ^ var9) & -1L << 32;
      if (feet) {
         options.IlillliIll = true;
      }

      IIlilillIlilil var7;
      try {
         var7 = IIlilillIlilil.IiIlliIliiIl(options, serviceSpine, overlay, overlay.IIIilIIiiIIi(), window, hot);
      } finally {
         options.IlillliIll = (boolean)((int)(var9 >>> 32));
      }

      return var7;
   }

   static int IiIIlliIIl(IIiiIiIllIiiIiIl s, lIiliiliIiliil reach, List<lIiliiliIiliil> members, double ov) {
      return iiIIlIIlIl(s, reach, members, ov, false);
   }

   private static List<lIiliiliIiliil> iIIIlIlIIl(
      IIiiIiIllIiiIiIl opt, lliiililiiil f, iIliIIiIlliIIi footLayer, Predicate<lIiliiliIiliil> coverage, Map<lIiliiliIiliil, Integer> ov, boolean admit
   ) {
      long var18 = -5389638828660818044L;
      long var20 = 1207313916677008129L;
      long var22 = 1459400602516827691L;
      var18 ^= ((long)((int)Math.ceil(footLayer.Iiilliiliiil())) << 32 ^ var18) & -1L << 32;
      HashSet var7 = new HashSet();
      ArrayList var8 = new ArrayList();

      for (lIiliiliIiliil var10 : f.iIlIlllllill()) {
         for (var18 ^= (-3L ^ var18) & -1L >>> 32; (int)var18 <= 2; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            var20 ^= ((long)(-((int)(var18 >>> 32))) << 32 ^ var20) & -1L << 32;

            while ((int)(var20 >>> 32) <= (int)(var18 >>> 32)) {
               for (var20 ^= ((long)(-((int)(var18 >>> 32))) ^ var20) & -1L >>> 32;
                  (int)var20 <= (int)(var18 >>> 32);
                  var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32
               ) {
                  lIiliiliIiliil var14 = var10.IliIlllilIi((int)(var20 >>> 32), (int)var18, (int)var20);
                  if (var7.add(var14) && coverage.test(var14) && !opt.IiiIlliiIl(var14)) {
                     lIiliiliIiliil var15 = var14.IilliliilIIi();
                     if (opt.IIiIllIiIl(var14)
                        && opt.IIiIllIiIl(var14.liiiIIllIl())
                        && opt.lIIlliIIll(var15, footLayer)
                        && !var15.equals(var10)
                        && !f.iIlIlllllill().contains(var15)) {
                        opt.Iiilliiliiil(new iiilllllIIIillll(List.of(var15), List.of()));

                        try {
                           if (opt.IiiIlliiIl(var14)) {
                              var22 ^= ((long)iiIIlIIlIl(opt, var14, f.iIlIlllllill(), footLayer.Iiilliiliiil(), admit) << 32 ^ var22) & -1L << 32;
                              if ((int)(var22 >>> 32) > 0) {
                                 ov.put(var14, (int)(var22 >>> 32));
                                 var8.add(var14);
                              }
                           }
                        } finally {
                           opt.IIIilIIiiIIi();
                        }
                     }
                  }
               }

               var20 += 4294967296L;
            }
         }
      }

      return var8;
   }

   public static List<lIiliiliIiliil> IilliliilIIi(llilIiililIi max, lliiililiiil unbuiltSchematic, Set<lIiliiliIiliil> f, iIliIIiIlliIIi opt, int base) {
      Objects.requireNonNull(max, lIilliIill<"lIilliIill","G8mQM0170px95XvWQYKK2G4rDDhaAbgxgsI4CapGljI=">());
      Objects.requireNonNull(opt, lIilliIill<"lIilliIill","Gx8XCgyNl+ylyQeA1rSud8DkpIgkedWOlYoBDbEGjw==">());
      return Iiiiliiiiiii(max, unbuiltSchematic, f, opt, base).IliIlllilIi();
   }

   private static List<lIiliiliIiliil> IIIIllIIIl(
      IIiiIiIllIiiIiIl footLayer,
      lliiililiiil f,
      iIliIIiIlliIIi coverage,
      Set<lIiliiliIiliil> members,
      Set<lIiliiliIiliil> tier,
      Map<lIiliiliIiliil, Integer> opt,
      boolean unbuilt,
      boolean[] ov
   ) {
      ov[0] = ov[1] = false;
      List var8 = llIIlilIIl(footLayer, f, coverage, s -> !members.contains(s) && !tier.contains(s), opt, unbuilt);
      if (var8.isEmpty()) {
         var8 = llIIlilIIl(footLayer, f, coverage, s -> true, opt, unbuilt);
         ov[0] = !var8.isEmpty();
      }

      if (var8.isEmpty()) {
         var8 = iIIIlIlIIl(footLayer, f, coverage, membersx -> !members.contains(membersx) && !tier.contains(membersx), opt, unbuilt);
         ov[1] = !var8.isEmpty();
      }

      return var8;
   }

   private static iIiiIilIliiIil Iiiiliiiiiii(llilIiililIi opt, lliiililiiil max, Set<lIiliiliIiliil> f, iIliIIiIlliIIi base, int unbuiltSchematic) {
      long var17 = -8039697142077448742L;
      long var19 = 627300631734201025L;
      Set var5 = f == null ? Set.of() : f;
      IIiiIiIllIiiIiIl var6 = IllIllllIl(opt, max, var5);
      if (max != null && !max.iIlIlllllill().isEmpty() && unbuiltSchematic > 0) {
         HashSet var7 = new HashSet<>(max.iIlIlllllill());
         HashMap var8 = new HashMap();
         boolean[] var9 = new boolean[2];
         List var10 = IIIIllIIIl(var6, max, base, var7, var5, var8, false, var9);
         var17 ^= ((long)var9[0] << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)var9[1] ^ var17) & -1L >>> 32;
         HashMap var13 = new HashMap();

         for (lIiliiliIiliil var15 : var10) {
            var13.put(var15, iiIIlIIlIl(var6, var15, max.iIlIlllllill(), base.Iiilliiliiil(), true));
         }

         double[] var21 = illIlIilIl(max.iIlIlllllill());
         var10.sort((compliantCov, cen) -> {
            long var6x = -316816458555435495L;
            var6x ^= ((long)Integer.compare((Integer)var13.get(cen), (Integer)var13.get(compliantCov)) << 32 ^ var6x) & -1L << 32;
            if ((int)(var6x >>> 32) != 0) {
               return (int)(var6x >>> 32);
            } else {
               var6x ^= ((long)Integer.compare((Integer)var8.get(cen), (Integer)var8.get(compliantCov)) << 32 ^ var6x) & -1L << 32;
               if ((int)(var6x >>> 32) != 0) {
                  return (int)(var6x >>> 32);
               } else {
                  var6x ^= ((long)Double.compare(lilIliilIl(compliantCov, var21), lilIliilIl(cen, var21)) << 32 ^ var6x) & -1L << 32;
                  return (int)(var6x >>> 32) != 0 ? (int)(var6x >>> 32) : Long.compare(compliantCov.IIIllIIliIIl(), cen.IIIllIIliIIl());
               }
            }
         });
         var19 ^= ((long)(!var10.isEmpty() && var13.get(var10.get(0)) == 0 ? 1 : 0) << 32 ^ var19) & -1L << 32;
         List var16 = List.copyOf(var10);
         return new iIiiIilIliiIil(
            var16.size() > unbuiltSchematic ? var16.subList(0, unbuiltSchematic) : var16,
            var16,
            var8,
            (boolean)((int)(var17 >>> 32)),
            var6,
            (boolean)((int)var17),
            (boolean)((int)(var19 >>> 32))
         );
      } else {
         return new iIiiIilIliiIil(List.of(), List.of(), Map.of(), false, var6, false, false);
      }
   }

   private static IIiiIiIllIiiIiIl IllIllllIl(llilIiililIi unbuilt, lliiililiiil f, Set<lIiliiliIiliil> base) {
      LinkedHashSet var3 = new LinkedHashSet();
      if (f != null) {
         var3.addAll(f.iIlIlllllill());
      }

      ArrayList var4 = new ArrayList(base.size());

      for (lIiliiliIiliil var6 : base) {
         if (var6 != null && !var3.contains(var6)) {
            var4.add(var6);
         }
      }

      var4.sort((a, b) -> Long.compare(a.IIIllIIliIIl(), b.IIIllIIliIIl()));
      var3.addAll(var4);
      ArrayList var8 = new ArrayList(var3.size());

      for (lIiliiliIiliil var7 : var3) {
         var8.add(
            new liiIililiiiIilil(
               var7,
               lIilliIill<"lIilliIill","n0nBHFdBJmkPxx43zlDJTKnU1QtcvzJ0Zgdd1hk02sapKqlR0g==">(),
               Ililliillillii.llIiIliIIl,
               -1,
               IIiIllillIiIllil.lIlilliIil,
               false,
               null
            )
         );
      }

      return new IIiiIiIllIiiIiIl(unbuilt, var8);
   }

   private static double lilIliilIl(lIiliiliIiliil c, double[] s) {
      return Math.max(Math.abs((double)c.IIlllIlliIll() - s[0]), Math.max(Math.abs((double)c.Illlllllilll() - s[1]), Math.abs((double)c.Iilllilliill() - s[2])));
   }

   private static lIilliIill Iiilliiliiil(
      llilIiililIi serviceSpine,
      lIiliiliIiliil remaining,
      Collection<lIiliiliIiliil> unbuiltSchematic,
      Set<lIiliiliIiliil> base,
      iIliIIiIlliIIi footLayerOnly,
      boolean feet,
      boolean opt
   ) {
      lIilliIill var7 = null;
      lIilliIill var8 = null;
      lIilliIill var9 = null;

      for (lliiililiiil var11 : IliIlllilIi(unbuiltSchematic)) {
         lIilliIill var12 = IIIllIIliIIl(serviceSpine, remaining, var11, base, footLayerOnly, feet, opt);
         switch (var12.liiiIIllIl()) {
            case iIiiiliIliiili:
               if (var7 == null) {
                  var7 = var12;
               }
               break;
            case liliiliiiliili:
               return var12;
            case lliiiliiliiili:
               if (var9 == null) {
                  var9 = var12;
               }
               break;
            case IIiiililIiiili:
               if (var8 == null) {
                  var8 = var12;
               }
         }
      }

      if (var7 != null) {
         return var7;
      } else if (var8 != null) {
         return var8;
      } else {
         return var9 != null
            ? var9
            : new lIilliIill(
               ilIIiIiIIi.iIiiiliIliiili,
               Long.MIN_VALUE,
               0,
               List.of(),
               null,
               null,
               0,
               List.of(),
               lIilliIill<"lIilliIill","QjIjAitbiSMMfWq+gjr01e0qK+qQxfRaYrDQjib/w6FW41ItT+XdgFgRZpLtOQ==">()
            );
      }
   }

   public static lIilliIill lIiiIiIlilli(llilIiililIi f, lIiliiliIiliil feet, lliiililiiil unbuiltSchematic, Set<lIiliiliIiliil> opt, iIliIIiIlliIIi base) {
      return IIIllIIliIIl(f, feet, unbuiltSchematic, opt, base, false, false);
   }

   public static lIilliIill Iilllilliill(
      llilIiililIi opt, lIiliiliIiliil remaining, Collection<lIiliiliIiliil> base, Set<lIiliiliIiliil> feet, iIliIIiIlliIIi unbuiltSchematic
   ) {
      return IIillIiliIil(opt, remaining, base, feet, unbuiltSchematic, false);
   }

   private IiiIIIilliiIIIil() {
   }

   private static Set<lIiliiliIiliil> iIiIlIliIl(Collection<lIiliiliIiliil> cells) {
      ArrayList var1 = new ArrayList(cells);
      var1.sort((b, a) -> Long.compare(b.IIIllIIliIIl(), a.IIIllIIliIIl()));
      return Collections.unmodifiableSet(new LinkedHashSet<>(var1));
   }

   private static iIiiIilIliiIil Iliilliiilii(llilIiililIi opt, lliiililiiil f, Set<lIiliiliIiliil> unbuiltSchematic, iIliIIiIlliIIi base, int max) {
      long var15 = 8999396842861318753L;
      Set var5 = unbuiltSchematic == null ? Set.of() : unbuiltSchematic;
      IIiiIiIllIiiIiIl var6 = IllIllllIl(opt, f, var5);
      HashSet var7 = new HashSet<>(f.iIlIlllllill());
      HashMap var8 = new HashMap();
      List var9 = llIIlilIIl(var6, f, base, s -> true, var8, true);
      List var10 = iIIIlIlIIl(var6, f, base, s -> !var7.contains(s) && !var5.contains(s), var8, true);
      var15 ^= (0L ^ var15) & -1L << 32;

      for (lIiliiliIiliil var13 : var9) {
         if (var7.contains(var13) || var5.contains(var13)) {
            var15 ^= (4294967296L ^ var15) & -1L << 32;
            break;
         }
      }

      ArrayList var17 = new ArrayList(var9);
      var17.addAll(var10);
      double[] var18 = illIlIilIl(f.iIlIlllllill());
      var17.sort((coverage, cen) -> {
         long var5x = -2003023394394706217L;
         var5x ^= ((long)Integer.compare((Integer)var8.get(cen), (Integer)var8.get(coverage)) << 32 ^ var5x) & -1L << 32;
         if ((int)(var5x >>> 32) != 0) {
            return (int)(var5x >>> 32);
         } else {
            var5x ^= ((long)Double.compare(lilIliilIl(coverage, var18), lilIliilIl(cen, var18)) << 32 ^ var5x) & -1L << 32;
            return (int)(var5x >>> 32) != 0 ? (int)(var5x >>> 32) : Long.compare(coverage.IIIllIIliIIl(), cen.IIIllIIliIIl());
         }
      });
      List var14 = List.copyOf(var17);
      return new iIiiIilIliiIil(var14.size() > max ? var14.subList(0, max) : var14, var14, var8, (boolean)((int)(var15 >>> 32)), var6, !var10.isEmpty(), false);
   }

   public static int[] Illillliilli(double reach) {
      long var4 = -623970641120588115L;
      var4 ^= ((long)((int)Math.ceil(reach)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) + 2) ^ var4) & -1L >>> 32;
      return new int[]{Math.max(2 * (int)(var4 >>> 32) + 2, 10 + (int)(var4 >>> 32) + 1), 2 + (int)var4, 27 + (int)var4};
   }

   private static double[] illIlIilIl(List<lIiliiliIiliil> members) {
      long var9 = -6453237334134261872L;
      double var1 = 0.0;
      double var3 = 0.0;
      double var5 = 0.0;

      for (lIiliiliIiliil var8 : members) {
         var1 += (double)var8.IIlllIlliIll();
         var3 += (double)var8.Illlllllilll();
         var5 += (double)var8.Iilllilliill();
      }

      var9 ^= ((long)Math.max(1, members.size()) << 32 ^ var9) & -1L << 32;
      return new double[]{var1 / (double)((int)(var9 >>> 32)), var3 / (double)((int)(var9 >>> 32)), var5 / (double)((int)(var9 >>> 32))};
   }

   public static lIilliIill Ililllililil(
      llilIiililIi base,
      lIiliiliIiliil opt,
      Collection<lIiliiliIiliil> feet,
      Set<lIiliiliIiliil> remaining,
      iIliIIiIlliIIi footLayerOnly,
      boolean unbuiltSchematic
   ) {
      return Iiilliiliiil(base, opt, feet, remaining, footLayerOnly, unbuiltSchematic, true);
   }

   private static liIIIlliiIIIll IIiIllIiIl(lIiliiliIiliil to) {
      return new liIIIlliiIIIll(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, to, to, 0, null, "");
   }

   public static lIilliIill iliIiiliiiii(
      llilIiililIi f, lIiliiliIiliil opt, lliiililiiil unbuiltSchematic, Set<lIiliiliIiliil> feet, iIliIIiIlliIIi base, boolean footLayerOnly
   ) {
      return IIIllIIliIIl(f, opt, unbuiltSchematic, feet, base, footLayerOnly, false);
   }

   static iIliIIiIlliIIi IlIillIiilIi(iIliIIiIlliIIi opt) {
      iIliIIiIlliIIi var1 = new iIliIIiIlliIIi(
         opt.Iiilliiliiil(),
         opt.IIIilIIiiIIi() == 0 ? 0 : Math.max(opt.IIIilIIiiIIi(), 16),
         opt.IlIillIiilIi(),
         false,
         false,
         false,
         Math.max(opt.Iilililiiili(), 6)
      );
      return var1.iliIiiliiiii(opt.IIiilIiiiIii())
         .IliIlllilIi(opt.iIIIlIlIIl())
         .Illlllllilll(opt.llIIlilIIl())
         .IlIlllIlilIl(opt.Iiiiliiiiiii())
         .IilliliilIIi(opt.IIIIllIIIl());
   }

   static String lliIliliIl(lIiliiliIiliil c) {
      return c.IIlllIlliIll()
         + lIilliIill<"lIilliIill","7bpoLLegptgLdvneEdKgOMcgUipm3u+PavXH+Eg=">()
         + c.Illlllllilll()
         + lIilliIill<"lIilliIill","7bpoLLegptgLdvneEdKgOMcgUipm3u+PavXH+Eg=">()
         + c.Iilllilliill();
   }

   static boolean IIiilIiiiIii(llilIiililIi walk, Collection<lIiliiliIiliil> base, Set<lIiliiliIiliil> margin, int window) {
      long var8 = -8944253691970019212L;
      long var10 = 5534967640834684714L;

      for (lIiliiliIiliil var5 : base) {
         if (walk.IIIllIIliIIl(var5.IilliliilIIi())) {
            return false;
         }
      }

      int[] var12 = IIlilillIlilil.IiIiliIiiiIi(margin);
      var8 ^= ((long)(var12[0] - window) << 32 ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) <= var12[3] + window) {
         for (var8 ^= ((long)(var12[2] - window) ^ var8) & -1L >>> 32; (int)var8 <= var12[5] + window; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            for (var10 ^= ((long)(var12[1] - 4) << 32 ^ var10) & -1L << 32; (int)(var10 >>> 32) <= var12[4] + 4; var10 += 4294967296L) {
               if (walk.IIIllIIliIIl(new lIiliiliIiliil((int)(var8 >>> 32), (int)(var10 >>> 32), (int)var8))) {
                  return false;
               }
            }
         }

         var8 += 4294967296L;
      }

      return true;
   }

   static boolean Iilililiiili(llilIiililIi f, lliiililiiil base, lIiliiliIiliil feet) {
      long var6 = 712656750215279041L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (lIiliiliIiliil var5 : base.iIlIlllllill()) {
         if (f.IliIlllilIi(var5).isEmpty()) {
            if (var5.Illlllllilll() >= feet.Illlllllilll() - 1) {
               return false;
            }

            var6 ^= (4294967296L ^ var6) & -1L << 32;
         }
      }

      return (boolean)((int)(var6 >>> 32));
   }

   private static lIilliIill IIIllIIliIIl(
      llilIiililIi opt,
      lIiliiliIiliil f,
      lliiililiiil feet,
      Set<lIiliiliIiliil> unbuiltSchematic,
      iIliIIiIlliIIi serviceSpine,
      boolean footLayerOnly,
      boolean base
   ) {
      long var33 = 158403751155894760L;
      long var35 = 5270372902528478386L;
      long var31 = 6247787241682070599L;
      Objects.requireNonNull(opt, lIilliIill<"lIilliIill","G8mQM0170px95XvWQYKK2G4rDDhaAbgxgsI4CapGljI=">());
      Objects.requireNonNull(f, lIilliIill<"lIilliIill","AkSo5Lt8iqLlOenyUtd3diUv7ndh7ZI7VVSIMNuma3U=">());
      Objects.requireNonNull(serviceSpine, lIilliIill<"lIilliIill","Gx8XCgyNl+ylyQeA1rSud8DkpIgkedWOlYoBDbEGjw==">());
      if (feet != null && !feet.iIlIlllllill().isEmpty()) {
         iIiiIilIliiIil var7 = Iiiiliiiiiii(opt, feet, unbuiltSchematic, serviceSpine, 24);
         var31 ^= (0L ^ var31) & -1L << 32;
         if (footLayerOnly && var7.IIIllIIliIIl() && serviceSpine.IIIilIIiiIIi() > 0) {
            iIiiIilIliiIil var9 = Iliilliiilii(opt, feet, unbuiltSchematic, serviceSpine, 24);
            if (!var9.IliIlllilIi().isEmpty()) {
               var7 = var9;
               var31 ^= (4294967296L ^ var31) & -1L << 32;
            }
         }

         List var39 = var7.IliIlllilIi();
         if (var39.isEmpty()) {
            return new lIilliIill(
               ilIIiIiIIi.iIiiiliIliiili,
               feet.liiiIIllIl(),
               0,
               List.of(),
               null,
               null,
               0,
               List.of(),
               lIilliIill<"lIilliIill","u7Z68s2LkIu0WVhtrHr7BkJrefU7Hye8GQf+PmUq9o5G7GojgpQwB5Dy5bqAj3ZtuJQzbap0Ib4zSlozwwDX8PYCPax+nt221Fb6V7hUFsHmn/OV4inkE/ZjQPU=">()
            );
         } else {
            String var10 = (
                  var7.IilliliilIIi()
                     ? lIilliIill<"lIilliIill","8qOvTr0F21rmI/hJQMeNAxZZa/+MM3uvDIDIcIjYBcd3A7nOMiOWNOevaJJnnEa9b1dfKg==">()
                     : (
                        var7.iliIiiliiiii()
                           ? lIilliIill<"lIilliIill","bLDEIu4dnp0PnUFCCYkAEAreKcsVPHsjwcZyZpxA1XVRIAj+GvvQgV4S3mTEySNYM8hxPQUdZu3A22orDwg2V36fwNmID6N2mpgHUOj6Z11G4sE81A==">()
                           : ""
                     )
               )
               + (
                  var7.IIIllIIliIIl()
                     ? lIilliIill<"lIilliIill","D0G5p89gKU0dylLebobHuI9rQPxBsKCSSXz+ONZIyEvAvEWBBtcn0Qq7ej2F86OkTDx4w+Kj55QiHLeTQ0bouK+XYJVVazZnFsLTamQKAvcG5WOBR/phdtmOrE0xg0vCKaMalrIL">()
                     : ""
               )
               + (
                  (int)(var31 >>> 32) != 0
                     ? lIilliIill<"lIilliIill","Yf0AylfoOaPpxK8qj+dMt0bTab3extdmM23vyC9Sdi5ecqdEa9qfZLJ4jv6+ZypzRpy4MUI55L11JsckSIZYs4WVmhzQ5t05Aq0sX5i6H57wHJZU">()
                     : ""
               );
            LinkedHashSet var11 = new LinkedHashSet<>(feet.iIlIlllllill());
            var11.addAll(var39);
            Set var12 = liiiIIllIl(opt, f, var11, serviceSpine);
            Set var13 = opt.IIIllIIliIIl(f.IilliliilIIi()) ? var12 : null;

            for (lIiliiliIiliil var15 : var39) {
               if (var12.contains(var15)) {
                  if (var13 == null) {
                     var13 = liiiIIllIl(iIlIlllllill(opt), f, var11, serviceSpine);
                  }

                  if (var13.contains(var15)) {
                     var31 ^= ((long)var7.iIlIlllllill().get(var15).intValue() ^ var31) & -1L >>> 32;
                     return new lIilliIill(
                        ilIIiIiIIi.liliiliiiliili,
                        feet.liiiIIllIl(),
                        (int)var31,
                        lIlIliIlIl(var7.lIiiIiIlilli(), var15, feet.iIlIlllllill(), serviceSpine.Iiilliiliiil(), (boolean)((int)(var31 >>> 32))),
                        var15,
                        null,
                        0,
                        var39,
                        lIilliIill<"lIilliIill","vgNIFoS04S7RF4EquT2sGfFvz+q1vwuh48Zt9l5iAnIc5uP1Kw==">()
                           + var15
                           + lIilliIill<"lIilliIill","N7RluUsI/D9IKpG2EmhBygLkC4bUoY1xHgULx29xKJirhkYLmfks1GdnBVeuxtn2wEqB1fKSbAjblkE=">()
                           + f
                           + lIilliIill<"lIilliIill","rbHbps8wXJvQcRuEPCdM3A5+vxnV2u+v8wAEphX2BrlMP08Xqw==">()
                           + (int)var31
                           + lIilliIill<"lIilliIill","FVmZSMHmUE8LxaD/WH+UkzQ1riAeChLIGKmtWWTI/dg=">()
                           + feet.IliIlllilIi()
                           + lIilliIill<"lIilliIill","+JBDkDp5dbfPt9MgfQib1F7bqoSWO6Mg3SyHOZ76/G3YGaqGk08I5pxNB2MdAlOQkRqQl2Y=">()
                           + var10
                     );
                  }
               }
            }

            iIliIIiIlliIIi var40 = IlIillIiilIi(serviceSpine);
            Object var41 = var12;
            if (base) {
               LinkedHashSet var16 = new LinkedHashSet<>(var40.llIIlilIIl());
               ArrayList var17 = new ArrayList();

               for (lIiliiliIiliil var19 : var12) {
                  if (var19.Illlllllilll() < f.Illlllllilll()) {
                     var16.add(Long.valueOf(var19.IIIllIIliIIl()));
                  } else {
                     var17.add(var19);
                  }
               }

               var40 = var40.Illlllllilll(var16);
               var41 = var17;
            }

            LinkedHashSet var42 = new LinkedHashSet(var11);
            var42.add(f);
            IIiiIiIllIiiIiIl var43 = var7.lIiiIiIlilli();
            var33 ^= ((long)f.Illlllllilll() << 32 ^ var33) & -1L << 32;

            for (lIiliiliIiliil var20 : var12) {
               var33 ^= ((long)Math.min((int)(var33 >>> 32), var20.Illlllllilll()) << 32 ^ var33) & -1L << 32;
            }

            IIlilillIlilil var45 = IIlllIlliIll(
               var43,
               f,
               var40,
               base ? IiIlliIliiIl(var39, (Collection<lIiliiliIiliil>)var41, (int)(var33 >>> 32)) : IlIlllIlilIl(var39, (int)(var33 >>> 32)),
               var42,
               base
            );
            lIiliiliIiliil var46 = Illlllllilll(var45, var39, var7.iIlIlllllill());
            List var21 = var39;
            String var22 = "";
            if (var46 == null && var7.liiiIIllIl().size() > var39.size()) {
               var21 = var7.liiiIIllIl();
               var42.addAll(var21);
               var45 = IIlllIlliIll(
                  var43,
                  f,
                  var40,
                  base ? IiIlliIliiIl(var21, (Collection<lIiliiliIiliil>)var41, (int)(var33 >>> 32)) : IlIlllIlilIl(var21, (int)(var33 >>> 32)),
                  var42,
                  base
               );
               var46 = Illlllllilll(var45, var21, var7.iIlIlllllill());
               var22 = lIilliIill<"lIilliIill","45FSkvk5CSnhkQZUX2pFDIVj0J+KmaF0GAtFX2M9TMdkZCwYmfCHy5jkDDEv">()
                  + var39.size()
                  + lIilliIill<"lIilliIill","RP1r0EzC+5lbAk87jFcDEAupS0Ee4ZJOojyt2thHHlL2ShDdtiQi2Nqc5dzOjn4=">()
                  + var21.size()
                  + lIilliIill<"lIilliIill","VkGLxAF6GYpLkPwHKN0M1b4R3cLYiS2o5HQ1EqE9jaVQh49xvdoxh5kU6MY=">();
            }

            if (var46 == null && var40.IIIilIIiiIIi() > 0 && Iilililiiili(opt, feet, f)) {
               List var23 = var7.liiiIIllIl().size() > var39.size() ? var7.liiiIIllIl() : var39;
               var42.addAll(var23);
               if (IIiilIiiiIii(opt, var12, var42, var40.Iilililiiili())) {
                  var43.IlillliIll = true;

                  try {
                     var45 = IIlllIlliIll(
                        var43,
                        f,
                        var40,
                        base ? IiIlliIliiIl(var23, (Collection<lIiliiliIiliil>)var41, (int)(var33 >>> 32)) : IlIlllIlilIl(var23, (int)(var33 >>> 32)),
                        var42,
                        base
                     );
                  } finally {
                     var43.IlillliIll = false;
                  }

                  var46 = Illlllllilll(var45, var23, var7.iIlIlllllill());
                  if (var46 != null) {
                     var21 = var23;
                     var22 = var22 + lIilliIill<"lIilliIill","/kUFh7nzszQf0OZDH56AE27v5leDXBy37mbRHD749yBHB1tUnqT/QWo6FQ3M04uuhKU=">();
                  }
               }
            }

            if (var46 == null && (int)(var31 >>> 32) != 0) {
               lIilliIill var47 = IIIllIIliIIl(opt, f, feet, unbuiltSchematic, serviceSpine, false, base);
               return new lIilliIill(
                  var47.liiiIIllIl(),
                  var47.iIlIlllllill(),
                  var47.IilliliilIIi(),
                  var47.lIiiIiIlilli(),
                  var47.iliIiiliiiii(),
                  var47.IIIllIIliIIl(),
                  var47.IlIlllIlilIl(),
                  var47.IiIlliIliiIl(),
                  var47.IIlllIlliIll()
                     + lIilliIill<"lIilliIill","EP9pBLHrrXgIbzmU71W67TRaiCTuwXXZMNcpyE6sFVaqZULckuUAefXE8qY/764itS4cLTN4vMaOQ41p9zl/JXrfMq2WX5uay/nfRg==">()
               );
            } else if (var46 == null) {
               return new lIilliIill(
                  ilIIiIiIIi.lliiiliiliiili,
                  feet.liiiIIllIl(),
                  0,
                  List.of(),
                  null,
                  null,
                  0,
                  var39,
                  lIilliIill<"lIilliIill","1xPiXWktl4B/9VYar2X4KwoSMw2WnKi5hWYgA4+KVfwQzKLvlB8zSz/yERGL69shBcamF91/MbxM+7YI0UsGIe9WEFjxxHLRLERj5LznBj+eQR+WRykuEcNgMKXMETaSkyw=">()
                     + var40.IIIilIIiiIIi()
                     + lIilliIill<"lIilliIill","rBbw0fVWvodIeqedv9TYFzOcX0z3ogC3+zTmhzabPP8U9bI=">()
                     + var21.size()
                     + lIilliIill<"lIilliIill","JvCdpY0lTzuJbpalx9eOg4BykauYQsJQ1iJqHEQKD+w8Ex8fQqXgE7Xz+8VUQHAGjCBtaHoyQCiUuulQR5UiU5CfBqfbgeH3V7d/Ow==">()
                     + IIlilIliiIli(var40)
                     + lIilliIill<"lIilliIill","WuCrr6yrLAvZM6El/O5zETS8K/qjONNl3o8i8TKCLi81RUpAD7esldXL">()
                     + var10
               );
            } else {
               var33 ^= ((long)var7.iIlIlllllill().get(var46).intValue() ^ var33) & -1L >>> 32;
               Object var24 = var39;
               if (!var39.contains(var46)) {
                  var24 = new ArrayList(var39);
                  var24.add(var46);
               }

               ArrayList var25 = new ArrayList();
               lIiliiliIiliil var26 = f;
               var35 ^= (0L ^ var35) & -1L << 32;

               for (IIiIliIilIiIliIi var29 : var45.lIiiIiIlilli(var46)) {
                  switch (var29.IliIlllilIi()) {
                     case IiIiiilIiliIiiilIi:
                        var25.add(IIiIllIiIl(var29.iIlIlllllill()));
                        var26 = var29.iIlIlllllill();
                        break;
                     case iiIiiilIiIIliiilIi:
                        if (!var26.equals(var29.liiiIIllIl())) {
                           var25.add(IIiIllIiIl(var29.liiiIIllIl()));
                        }

                        for (var35 ^= (0L ^ var35) & -1L >>> 32; (int)var35 < var29.lIiiIiIlilli(); var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
                           var43.llIIlilIIl(var29.liiiIIllIl().iIlIlllllill((int)var35));
                        }

                        var35 ^= ((long)((int)(var35 >>> 32) + var29.lIiiIiIlilli()) << 32 ^ var35) & -1L << 32;
                        var25.add(
                           new liIIIlliiIIIll(
                              ilIlIilIiIlIil.iiIiiilIiIIliiilIi,
                              var29.liiiIIllIl(),
                              var29.iIlIlllllill(),
                              var29.lIiiIiIlilli(),
                              null,
                              lIilliIill<"lIilliIill","uYg3BjrqGWhr/OUUFa7G1trDUog70jqw0AcEBh0LetLbBr4n+DBG1syvrV6NsA==">() + var46
                           )
                        );
                        var26 = var29.iIlIlllllill();
                        break;
                     case lIliiilIiiIliiilIi:
                        lIiliiliIiliil var30 = var29.iliIiiliiiii() == null ? var29.liiiIIllIl() : var29.iliIiiliiiii();
                        if (!var26.equals(var30)) {
                           var25.add(IIiIllIiIl(var30));
                        }

                        var43.llIIlilIIl(var29.IilliliilIIi());
                        var35 += 4294967296L;
                        var25.add(
                           new liIIIlliiIIIll(
                              ilIlIilIiIlIil.lIliiilIiiIliiilIi,
                              var29.IilliliilIIi(),
                              var30,
                              1,
                              var29.IIIllIIliIIl(),
                              lIilliIill<"lIilliIill","ZmgGSns0M1BfIeMlxOKWbdtOjDN86vPsCtgos+8kwDB3q1k/FIiWlhx2h5qWCQ==">() + var46
                           )
                        );
                        var25.add(IIiIllIiIl(var29.iIlIlllllill()));
                        var26 = var29.iIlIlllllill();
                        break;
                     case IlliiilIillliiilIi:
                        if (!var26.equals(var29.liiiIIllIl())) {
                           var25.add(IIiIllIiIl(var29.liiiIIllIl()));
                        }

                        var43.IiIIlliIIl(var29.IilliliilIIi());
                        var25.add(
                           new liIIIlliiIIIll(
                              ilIlIilIiIlIil.IlliiilIillliiilIi,
                              var29.IilliliilIIi(),
                              var29.iIlIlllllill(),
                              1,
                              null,
                              lIilliIill<"lIilliIill","1F8Wb52BOeoigH3eWerj8SxktASk3KqRaPNW4xCb4nLHaOO8ZCVklV/+C8SGJw==">()
                           )
                        );
                        var26 = var29.iIlIlllllill();
                  }
               }

               if (!var26.equals(var46)) {
                  var25.add(IIiIllIiIl(var46));
               }

               Illiiilllliiil var48 = new Illiiilllliiil(
                  ilIlIIliIiIlIIli.iIlIllIlIi,
                  List.copyOf(var25),
                  List.of(),
                  List.of(),
                  List.of(),
                  List.of(),
                  (int)(var35 >>> 32),
                  lIilliIill<"lIilliIill","+Xfi2F7cvkDwDm4dXPdwvuaMTsp4NQxydLN2s4Nq49rscuvcI86qyajW">()
               );
               String var49 = lIilliIill<"lIilliIill","uYg3BjrqGWhr/OUUFa7G1trDUog70jqw0AcEBh0LetLbBr4n+DBG1syvrV6NsA==">()
                  + var46
                  + lIilliIill<"lIilliIill","K3LMPezpMSvakQ7DhjYYJZg5no1oPNDwPmt2YFWiYmxqrw0=">()
                  + (int)(var35 >>> 32)
                  + lIilliIill<"lIilliIill","zI9Xgyaq9hcspG3Du+ifHV8J4EtCHAOkvb28mamQPrl7Q1rD">()
                  + (int)var33
                  + lIilliIill<"lIilliIill","FVmZSMHmUE8LxaD/WH+UkzQ1riAeChLIGKmtWWTI/dg=">()
                  + feet.IliIlllilIi()
                  + lIilliIill<"lIilliIill","gyNwbGkZRk7Gne8wcDsq2QlpdWwPpBHDRDgSm8DFnbxmKurIDqbUdMKdSSc=">()
                  + var25.size()
                  + ((int)(var35 >>> 32) == 0 ? lIilliIill<"lIilliIill","lhk8lJ5oCjnWaCsZpRXD8EBF29zrp9xpb3szzjD6aphqvsdTyxn+2luMQFo4u8wRSqj0hVYg">() : "")
                  + var22
                  + var10;
               return new lIilliIill(
                  ilIIiIiIIi.IIiiililIiiili,
                  feet.liiiIIllIl(),
                  (int)var33,
                  lIlIliIlIl(var7.lIiiIiIlilli(), var46, feet.iIlIlllllill(), serviceSpine.Iiilliiliiil(), (boolean)((int)(var31 >>> 32))),
                  var46,
                  var48,
                  (int)(var35 >>> 32),
                  (List<lIiliiliIiliil>)var24,
                  var49
               );
            }
         }
      } else {
         return new lIilliIill(
            ilIIiIiIIi.iIiiiliIliiili,
            feet == null ? Long.MIN_VALUE : feet.liiiIIllIl(),
            0,
            List.of(),
            null,
            null,
            0,
            List.of(),
            lIilliIill<"lIilliIill","vUS1i5xKhkloVGRkddWb6pZWr40BjqZ2GFvlI/VIfP3EahX5iYFawtufnVtvxU+RmEyzOpFxu7y7hpCh">()
         );
      }
   }

   private static List<lIiliiliIiliil> llIIlilIIl(
      IIiiIiIllIiiIiIl admit, lliiililiiil coverage, iIliIIiIlliIIi opt, Predicate<lIiliiliIiliil> ov, Map<lIiliiliIiliil, Integer> f, boolean footLayer
   ) {
      long var16 = 5308538098263759455L;
      long var18 = 2135492506005757944L;
      long var20 = 1517776225507919844L;
      var16 ^= ((long)((int)Math.ceil(opt.Iiilliiliiil())) << 32 ^ var16) & -1L << 32;
      HashSet var7 = new HashSet();
      ArrayList var8 = new ArrayList();

      for (lIiliiliIiliil var10 : coverage.iIlIlllllill()) {
         for (var16 ^= (-3L ^ var16) & -1L >>> 32; (int)var16 <= 2; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            var18 ^= ((long)(-((int)(var16 >>> 32))) << 32 ^ var18) & -1L << 32;

            while ((int)(var18 >>> 32) <= (int)(var16 >>> 32)) {
               for (var18 ^= ((long)(-((int)(var16 >>> 32))) ^ var18) & -1L >>> 32;
                  (int)var18 <= (int)(var16 >>> 32);
                  var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32
               ) {
                  lIiliiliIiliil var14 = var10.IliIlllilIi((int)(var18 >>> 32), (int)var16, (int)var18);
                  if (var7.add(var14) && ov.test(var14) && admit.IiiIlliiIl(var14)) {
                     var20 ^= ((long)iiIIlIIlIl(admit, var14, coverage.iIlIlllllill(), opt.Iiilliiliiil(), footLayer) << 32 ^ var20) & -1L << 32;
                     if ((int)(var20 >>> 32) > 0) {
                        f.put(var14, (int)(var20 >>> 32));
                        var8.add(var14);
                     }
                  }
               }

               var18 += 4294967296L;
            }
         }
      }

      return var8;
   }

   static int iiIIlIIlIl(IIiiIiIllIiiIiIl reach, lIiliiliIiliil footLayer, List<lIiliiliIiliil> ov, double s, boolean members) {
      return lIlIliIlIl(reach, footLayer, ov, s, members).size();
   }

   public static String IIIilIIiiIIi(lIilliIill p) {
      return p == null
         ? lIilliIill<"lIilliIill","jskmoKzlJ70WVog/uVrQvyiQ9j5ZHmgqp0W216GwM42JFVIg">()
         : lIilliIill<"lIilliIill","lLgHKSD/D5PR+jD/chR4mOJthd9XNgtX8J7WrbA3ZH+Tfwg=">()
            + p.liiiIIllIl()
            + lIilliIill<"lIilliIill","YHY97b1C5F/NNTTtJk/o9u6Eji3py/142OwR7/OnLf4boQ==">()
            + (
               p.iIlIlllllill() == Long.MIN_VALUE
                  ? lIilliIill<"lIilliIill","D2pjXgZOsViNcnuB8zJgkEeXfwIlWsVEQVFN0wM=">()
                  : lliIliliIl(lIiliiliIiliil.IlIlllIlilIl(p.iIlIlllllill()))
            )
            + lIilliIill<"lIilliIill","CLLUxhSIvrH/1dsZi62DAum6lqfkrSpZpfCbk+dDj+WvGJAp">()
            + p.IilliliilIIi()
            + lIilliIill<"lIilliIill","7KoPiBOhhz7Q727d2i55a8QJPAfKTSq+3A6ArvEykWhmgFBB89Q=">()
            + (p.iliIiiliiiii() == null ? lIilliIill<"lIilliIill","D2pjXgZOsViNcnuB8zJgkEeXfwIlWsVEQVFN0wM=">() : lliIliliIl(p.iliIiiliiiii()))
            + lIilliIill<"lIilliIill","hUwMlE80DI+mPmtGiHz/D0cKGv0UwUyjXTDo4fKIsCyxHQ==">()
            + p.IlIlllIlilIl()
            + lIilliIill<"lIilliIill","U0/ORFozzLmOInAQ0DjVwhq6bqizuMLI5ZcGZSKjCSEof8k=">()
            + (p.IIIllIIliIIl() == null ? 0 : p.IIIllIIliIIl().IilliliilIIi().size())
            + lIilliIill<"lIilliIill","Z1qmt4bem9fmc5Uig+05/j8+IV+b2F7AUJ9U36STnfwy8kYIorNNVw==">()
            + p.IiIlliIliiIl().size()
            + lIilliIill<"lIilliIill","vijnQvYoao9Kqorg4slXKLHYqrjoU3tA01dq4FLYN+Ix">()
            + p.IIlllIlliIll().replace('\n', ' ').replace('\r', ' ');
   }

   public static Set<lIiliiliIiliil> liiiIIllIl(llilIiililIi window, lIiliiliIiliil base, Collection<lIiliiliIiliil> feet, iIliIIiIlliIIi opt) {
      Objects.requireNonNull(window, lIilliIill<"lIilliIill","G8mQM0170px95XvWQYKK2G4rDDhaAbgxgsI4CapGljI=">());
      Objects.requireNonNull(base, lIilliIill<"lIilliIill","AkSo5Lt8iqLlOenyUtd3diUv7ndh7ZI7VVSIMNuma3U=">());
      Objects.requireNonNull(opt, lIilliIill<"lIilliIill","Gx8XCgyNl+ylyQeA1rSud8DkpIgkedWOlYoBDbEGjw==">());
      LinkedHashSet var4 = new LinkedHashSet();
      if (feet != null) {
         for (lIiliiliIiliil var6 : feet) {
            if (var6 != null) {
               var4.add(var6);
            }
         }
      }

      var4.add(base);
      IIlilillIlilil var7 = IIlilillIlilil.IiIlliIliiIl(new IIiiIiIllIiiIiIl(window, List.of()), base, opt, 0, Set.of(), var4);
      return iIiIlIliIl(var7.IliIlllilIi());
   }

   static llilIiililIi iIlIlllllill(llilIiililIi b) {
      return new llilIiililIi() {
         @Override
         public List<IIlIIIilIlIIIi> iIlIlllllill(lIiliiliIiliil c) {
            return b.iIlIlllllill(c);
         }

         @Override
         public List<IIlIIIilIlIIIi> liiiIIllIl(lIiliiliIiliil c) {
            return b.liiiIIllIl(c);
         }

         @Override
         public boolean IIillIiliIil(lIiliiliIiliil c) {
            return b.IIillIiliIil(c);
         }

         @Override
         public boolean IIlllIlliIll(lIiliiliIiliil c) {
            return b.IIlllIlliIll(c);
         }

         @Override
         public boolean IIIllIIliIIl(lIiliiliIiliil c) {
            return false;
         }

         @Override
         public List<IIlIIIilIlIIIi> IliIlllilIi(lIiliiliIiliil c) {
            return b.IliIlllilIi(c);
         }

         @Override
         public boolean Iilllilliill(lIiliiliIiliil c) {
            return b.Iilllilliill(c);
         }

         @Override
         public boolean iliIiiliiiii(lIiliiliIiliil c) {
            return b.iliIiiliiiii(c);
         }

         @Override
         public boolean Illlllllilll(lIiliiliIiliil c) {
            return b.Illlllllilll(c);
         }

         @Override
         public boolean IilliliilIIi(lIiliiliIiliil c) {
            return b.IilliliilIIi(c);
         }

         @Override
         public boolean lIiiIiIlilli(lIiliiliIiliil c) {
            return b.lIiiIiIlilli(c);
         }

         @Override
         public boolean IlIlllIlilIl(lIiliiliIiliil c) {
            return b.IlIlllIlilIl(c);
         }

         @Override
         public boolean IiIlliIliiIl(lIiliiliIiliil c) {
            return b.IiIlliIliiIl(c);
         }

         @Override
         public List<IIlIIIilIlIIIi> Ililllililil(lIiliiliIiliil c) {
            return b.Ililllililil(c);
         }
      };
   }

   static Set<lIiliiliIiliil> IlIlllIlilIl(Collection<lIiliiliIiliil> floorY, int poses) {
      long var7 = 8394670399410737048L;
      LinkedHashSet var2 = new LinkedHashSet(floorY);

      for (lIiliiliIiliil var4 : floorY) {
         var7 ^= ((long)(var4.Illlllllilll() - 1) << 32 ^ var7) & -1L << 32;
         var7 ^= (0L ^ var7) & -1L >>> 32;

         while ((int)(var7 >>> 32) >= poses - 1 && (int)var7 < 24) {
            var2.add(new lIiliiliIiliil(var4.IIlllIlliIll(), (int)(var7 >>> 32), var4.Iilllilliill()));
            var7 += -4294967296L;
            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         }
      }

      return var2;
   }

   static List<lIiliiliIiliil> lIlIliIlIl(IIiiIiIllIiiIiIl ov, lIiliiliIiliil members, List<lIiliiliIiliil> s, double reach, boolean footLayer) {
      long var21 = 2151840168757445708L;
      var21 ^= ((long)((int)Math.ceil(reach)) << 32 ^ var21) & -1L << 32;
      double[] var7 = ov.iiiIlIIIll(members, false);
      double var8 = Math.max(1.0, reach - 0.6);
      double var10 = var8 * var8;
      ArrayList var12 = new ArrayList();

      for (lIiliiliIiliil var14 : s) {
         if (Math.abs(members.IIlllIlliIll() - var14.IIlllIlliIll()) <= (int)(var21 >>> 32)
            && Math.abs(members.Iilllilliill() - var14.Iilllilliill()) <= (int)(var21 >>> 32)
            && (
               footLayer
                  ? llIiIiililIiIiil.IliIlllilIi(members.Illlllllilll(), var14.Illlllllilll())
                  : members.Illlllllilll() >= var14.Illlllllilll() - 3 && members.Illlllllilll() <= var14.Illlllllilll() + 2
            )
            && !members.equals(var14)
            && !members.liiiIIllIl().equals(var14)) {
            double var15 = var7[0] - ((double)var14.IIlllIlliIll() + 0.5);
            double var17 = var7[1] - ((double)var14.Illlllllilll() + 0.5);
            double var19 = var7[2] - ((double)var14.Iilllilliill() + 0.5);
            if (!(var15 * var15 + var17 * var17 + var19 * var19 > var10)) {
               var12.add(var14);
            }
         }
      }

      return List.copyOf(var12);
   }

   public static List<lliiililiiil> IliIlllilIi(Collection<lIiliiliIiliil> remaining) {
      if (remaining != null && !remaining.isEmpty()) {
         LinkedHashSet var1 = new LinkedHashSet();

         for (lIiliiliIiliil var3 : remaining) {
            if (var3 != null) {
               var1.add(Long.valueOf(var3.IIIllIIliIIl()));
            }
         }

         if (var1.isEmpty()) {
            return List.of();
         } else {
            Map var11 = iiilliIlIIIiliIl.liiiIIllIl(var1, 1);
            HashMap var12 = new HashMap();

            for (Long var5 : var1) {
               var12.computeIfAbsent((Long)var11.get(var5), k -> new ArrayList<>()).add(var5);
            }

            ArrayList var13 = new ArrayList(var12.size());

            for (Entry var6 : var12.entrySet()) {
               List var7 = (List)var6.getValue();
               Collections.sort(var7);
               ArrayList var8 = new ArrayList(var7.size());

               for (Long var10 : var7) {
                  var8.add(lIiliiliIiliil.IlIlllIlilIl(var10));
               }

               var13.add(new lliiililiiil((Long)var6.getKey(), var8));
            }

            var13.sort(
               (a, b) -> a.IliIlllilIi() != b.IliIlllilIi() ? Integer.compare(b.IliIlllilIi(), a.IliIlllilIi()) : Long.compare(a.liiiIIllIl(), b.liiiIIllIl())
            );
            return List.copyOf(var13);
         }
      } else {
         return List.of();
      }
   }
}
