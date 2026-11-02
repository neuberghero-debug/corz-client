package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;

public final class lilliilliilliill {
   private static final Comparator<IIilliIllIilliIl> liIiliiill = Comparator.comparingInt(IIilliIllIilliIl::IilliliilIIi)
      .thenComparingInt(IIilliIllIilliIl::lIiiIiIlilli)
      .thenComparingInt(IIilliIllIilliIl::iliIiiliiiii);
   private static final int[][] IiIiliiill = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

   public static illIlIllIilIlIll IliIlllilIi(liiiilIliiiiilIl request, lliIiliiliIili bannedFingerprints, Set<Long> view) {
      long var24 = 1122679387466119337L;
      long var26 = -1427467737358345389L;
      long var28 = 9214466567338375228L;
      long var30 = -4240956836954553123L;
      Objects.requireNonNull(request, illIlIilIl<"illIlIilIl","qhqk5hdQR/Z33CQUrGncjpk/9IswC93FIhuR6nJH6ARaMyQ=">());
      Objects.requireNonNull(bannedFingerprints, illIlIilIl<"illIlIilIl","H2jU7c6fOqBeMbVX8iMsCEpvFu745DK5fr3J5EOKKAY=">());
      Set var3 = view == null ? Set.of() : view;
      Set var4 = IIlilIliiIli(request, bannedFingerprints);
      PriorityQueue var5 = new PriorityQueue<>(
         Comparator.<IIlliillIlliil>comparingInt(n -> n.IIliiIllilIliiIlli + IIIilIIiiIIi(n.IlIiiIllillIiiIlli, request.IilliliilIIi()))
            .thenComparingInt(n -> n.ilIiiIlliIiIiiIlli.size())
            .thenComparingInt(n -> n.liIiiIlliiiIiiIlli.size())
            .thenComparingInt(n -> n.IlIiiIllillIiiIlli.IilliliilIIi())
            .thenComparingInt(n -> n.IlIiiIllillIiiIlli.lIiiIiIlilli())
            .thenComparingInt(n -> n.IlIiiIllillIiiIlli.iliIiiliiiii())
            .thenComparingLong(n -> Iliilliiilii(n.ilIiiIlliIiIiiIlli))
      );
      HashMap var6 = new HashMap();
      IIlliillIlliil var7 = new IIlliillIlliil(request.lIiiIiIlilli(), new LinkedHashSet<>(), List.of(), 0);
      var5.add(var7);
      var6.put(IilliliilIIi(var7), 0);
      var24 ^= (0L ^ var24) & -1L << 32;
      var24 ^= ((long)IIIllIIliIIl(var7, request, bannedFingerprints).size() ^ var24) & -1L >>> 32;
      var26 ^= (0L ^ var26) & -1L << 32;
      var26 ^= ((long)Math.abs(request.IilliliilIIi().IilliliilIIi() - request.lIiiIiIlilli().IilliliilIIi()) ^ var26) & -1L >>> 32;
      var28 ^= ((long)Math.abs(request.IilliliilIIi().iliIiiliiiii() - request.lIiiIiIlilli().iliIiiliiiii()) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)(request.IilliliilIIi().lIiiIiIlilli() - request.lIiiIiIlilli().lIiiIiIlilli()) ^ var28) & -1L >>> 32;
      if ((int)var26 > request.IIIllIIliIIl() + 3
         || (int)(var28 >>> 32) > request.IIIllIIliIIl() + 3
         || (int)var28 > request.IlIlllIlilIl() + 2
         || (int)var28 < -request.IlIlllIlilIl() - 1) {
         var5.clear();
      }

      while (!var5.isEmpty()) {
         var24 += 4294967296L;
         if ((int)(var24 >>> 32) > request.Illlllllilll()) {
            var26 ^= (4294967296L ^ var26) & -1L << 32;
            break;
         }

         IIlliillIlliil var14 = (IIlliillIlliil)var5.poll();
         if (var14.liIiiIlliiiIiiIlli.size() <= request.IIlllIlliIll() && var14.ilIiiIlliIiIiiIlli.size() <= request.IiIlliIliiIl()) {
            if (lIiiIiIlilli(var14, request, bannedFingerprints) && var14.ilIiiIlliIiIiiIlli.size() < request.IiIlliIliiIl()) {
               iiIIIIilIIlIIIil var15 = IlIlllIlilIl(request.IilliliilIIi(), var14.ilIiiIlliIiIiiIlli, bannedFingerprints);
               LinkedHashSet var16 = new LinkedHashSet<>(var14.ilIiiIlliIiIiiIlli);
               var16.add(request.IilliliilIIi());
               lliiIiililiiIiil var17 = new lliiIiililiiIiil(
                  iIliIiiIlliIii.llIIlIiIIl,
                  var14.IlIiiIllillIiiIlli,
                  var14.IlIiiIllillIiiIlli,
                  request.IilliliilIIi(),
                  var15.IllIiIIIil,
                  var15.lllIiIIIil,
                  false
               );
               List var18 = IlIillIiilIi(var14.liIiiIlliiiIiiIlli, var17);
               IIlliillIlliil var19 = new IIlliillIlliil(var14.IlIiiIllillIiiIlli, var16, var18, var14.IIliiIllilIliiIlli + 5);
               if (!liiiIIllIl(var19, request, bannedFingerprints)) {
                  continue;
               }

               lIIlllliIIllll var20 = var14.ilIiiIlliIiIiiIlli.isEmpty() ? lIIlllliIIllll.lIiIiliiliIiIiliil : lIIlllliIIllll.IliIiliillliIiliil;
               IIilliIllIilliIl var21 = IiIiliIiiiIi(var18, request.lIiiIiIlilli());
               long var22 = Illillliilli(request, var14.IlIiiIllillIiiIlli, var21, var18, var16, var4, var20.name());
               if (!var3.contains(var22)) {
                  return new illIlIllIilIlIll(
                     request.IliIlllilIi(),
                     var20,
                     request.liiiIIllIl(),
                     request.IilliliilIIi(),
                     request.lIiiIiIlilli(),
                     var21,
                     var14.IlIiiIllillIiiIlli,
                     request.iliIiiliiiii(),
                     var18,
                     var16,
                     var4,
                     true,
                     (int)var24,
                     (int)(var24 >>> 32),
                     var22
                  );
               }
            }

            for (IIilliIllIilliIl var36 : iliIiiliiiii(var14, request, bannedFingerprints)) {
               iIliIiiIlliIii var38 = Ililllililil(var36, var14.ilIiiIlliIiIiiIlli, bannedFingerprints) ? iIliIiiIlliIii.IiIIlIiIIl : iIliIiiIlliIii.IlIIlIiIIl;
               lliiIiililiiIiil var40 = new lliiIiililiiIiil(var38, var14.IlIiiIllillIiiIlli, var36, null, null, null, false);
               iIlIlllllill(
                  var5,
                  var6,
                  new IIlliillIlliil(var36, var14.ilIiiIlliIiIiiIlli, IlIillIiilIi(var14.liIiiIlliiiIiiIlli, var40), var14.IIliiIllilIliiIlli + 1),
                  request
               );
            }

            if (var14.ilIiiIlliIiIiiIlli.size() < request.IiIlliIliiIl()) {
               for (lIIIiIlliIIIiIll var37 : IIIllIIliIIl(var14, request, bannedFingerprints)) {
                  LinkedHashSet var39 = new LinkedHashSet<>(var14.ilIiiIlliIiIiiIlli);
                  var39.add(var37.illlllilll);
                  lliiIiililiiIiil var41 = new lliiIiililiiIiil(
                     iIliIiiIlliIii.llIIlIiIIl,
                     var14.IlIiiIllillIiiIlli,
                     var14.IlIiiIllillIiiIlli,
                     var37.illlllilll,
                     var37.lillllilll,
                     var37.iillllilll,
                     var37.lIilllilll
                  );
                  iIliIiiIlliIii var42 = var37.lIilllilll ? iIliIiiIlliIii.ilIIlIiIIl : iIliIiiIlliIii.IiIIlIiIIl;
                  lliiIiililiiIiil var43 = new lliiIiililiiIiil(
                     var42, var14.IlIiiIllillIiiIlli, var37.IIilllilll, var37.illlllilll, var37.lillllilll, var37.iillllilll, false
                  );
                  var30 ^= ((long)(var14.IIliiIllilIliiIlli + 5 + (var37.lIilllilll ? 2 : 1)) << 32 ^ var30) & -1L << 32;
                  iIlIlllllill(
                     var5,
                     var6,
                     new IIlliillIlliil(var37.IIilllilll, var39, IlIillIiilIi(var14.liIiiIlliiiIiiIlli, var41, var43), (int)(var30 >>> 32)),
                     request
                  );
               }
            }
         }
      }

      lIIlllliIIllll var32 = (int)(var26 >>> 32) != 0
         ? lIIlllliIIllll.IIIliliillIIliliil
         : ((int)var24 == 0 ? lIIlllliIIllll.iliIiliilIiiIiliil : lIIlllliIIllll.liiIiliiliiiIiliil);
      long var35 = Iilililiiili(request, request.lIiiIiIlilli(), var4, var32.name());
      return new illIlIllIilIlIll(
         request.IliIlllilIi(),
         var32,
         request.liiiIIllIl(),
         request.IilliliilIIi(),
         request.lIiiIiIlilli(),
         request.lIiiIiIlilli(),
         null,
         request.iliIiiliiiii(),
         List.of(),
         Set.of(),
         var4,
         false,
         (int)var24,
         (int)(var24 >>> 32),
         var35
      );
   }

   public static long Illillliilli(
      liiiilIliiiiilIl request,
      IIilliIllIilliIl owned,
      IIilliIllIilliIl firstStand,
      List<lliiIiililiiIiil> failurePhase,
      Set<IIilliIllIilliIl> steps,
      Set<IIilliIllIilliIl> finalStand,
      String planned
   ) {
      long var7 = -3750763034362895579L;
      var7 = Iiiiliiiiiii(var7, (long)request.liiiIIllIl().hashCode());
      var7 = Iiiiliiiiiii(var7, (long)request.iIlIlllllill().hashCode());
      var7 = Iiiiliiiiiii(var7, (long)request.IilliliilIIi().hashCode());
      var7 = Iiiiliiiiiii(var7, (long)request.lIiiIiIlilli().hashCode());
      var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(firstStand));
      var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(owned));
      var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(request.iliIiiliiiii()));
      if (failurePhase != null) {
         for (lliiIiililiiIiil var10 : failurePhase) {
            var7 = Iiiiliiiiiii(var7, (long)var10.IliIlllilIi().ordinal());
            var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(var10.IilliliilIIi()));
            var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(var10.lIiiIiIlilli()));
            var7 = Iiiiliiiiiii(var7, (long)Objects.hashCode(var10.iliIiiliiiii()));
         }
      }

      var7 = IIiilIiiiIii(var7, steps);
      var7 = IIiilIiiiIii(var7, finalStand);
      return Iiiiliiiiiii(var7, (long)Objects.hashCode(planned));
   }

   private static iiIIIIilIIlIIIil IlIlllIlilIl(IIilliIllIilliIl dirt, Set<IIilliIllIilliIl> target, lliIiliiliIili view) {
      long var7 = 5712215531596745801L;
      int[][] var3 = new int[][]{{0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}, {0, 1, 0}};
      String[] var4 = new String[]{
         illIlIilIl<"illIlIilIl","03jgC3FhEsU9gsZItZqf7h2CwIcUOmqjO87lyXtG">(),
         illIlIilIl<"illIlIilIl","cy2NUCXEDIOpUCQ6oqXMg6EeMyXeSMKKkgz54NaPH8o=">(),
         illIlIilIl<"illIlIilIl","r48wDj7PgOHU/hYW/eK48g+y94SGwV7s0ceBTgcaXjs=">(),
         illIlIilIl<"illIlIilIl","+CtBf2pbaduyzpm1j/lpsVIPqrbvDWYvW/XzLZZIudgj">(),
         illIlIilIl<"illIlIilIl","esA+HlpLnVKrQkGZR6Z6DOyk+4lsbsMpzVXwRyHL2sJB">(),
         illIlIilIl<"illIlIilIl","xA1XKdLOFDx7xR34sUqXT2h9KxNDfnrbyNIgQANsiik=">()
      };

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < var3.length; var9 += 4294967296L) {
         IIilliIllIilliIl var6 = dirt.IliIlllilIi(var3[(int)(var9 >>> 32)][0], var3[(int)(var9 >>> 32)][1], var3[(int)(var9 >>> 32)][2]);
         if (Illlllllilll(var6, target, view)) {
            return new iiIIIIilIIlIIIil(var6, var4[(int)(var9 >>> 32)]);
         }
      }

      return null;
   }

   private static long IIiilIiiiIii(long hash, Set<IIilliIllIilliIl> cells) {
      if (cells != null && !cells.isEmpty()) {
         ArrayList var3 = new ArrayList(cells);
         var3.sort(liIiliiill);
         long var4 = hash;

         for (IIilliIllIilliIl var7 : var3) {
            var4 = Iiiiliiiiiii(var4, (long)var7.hashCode());
         }

         return var4;
      } else {
         return Iiiiliiiiiii(hash, 0L);
      }
   }

   private static boolean Illlllllilll(IIilliIllIilliIl view, Set<IIilliIllIilliIl> cell, lliIiliiliIili dirt) {
      return cell.contains(view) || dirt.liiiIIllIl(view);
   }

   private static int IIIilIIiiIIi(IIilliIllIilliIl from, IIilliIllIilliIl target) {
      return Math.abs(from.IilliliilIIi() - target.IilliliilIIi())
         + Math.abs(from.iliIiiliiiii() - target.iliIiiliiiii())
         + Math.max(0, target.lIiiIiIlilli() - 1 - from.lIiiIiIlilli()) * 2;
   }

   private static boolean Iiilliiliiil(IIilliIllIilliIl request, liiiilIliiiiilIl cell) {
      long var5 = 8758909643106963506L;
      long var7 = -1025280426109331307L;
      var5 ^= ((long)Math.abs(request.IilliliilIIi() - cell.lIiiIiIlilli().IilliliilIIi()) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.abs(request.iliIiiliiiii() - cell.lIiiIiIlilli().iliIiiliiiii()) ^ var5) & -1L >>> 32;
      var7 ^= ((long)Math.abs(request.lIiiIiIlilli() - cell.lIiiIiIlilli().lIiiIiIlilli()) << 32 ^ var7) & -1L << 32;
      return (int)(var5 >>> 32) <= cell.IIIllIIliIIl() && (int)var5 <= cell.IIIllIIliIIl() && (int)(var7 >>> 32) <= cell.IlIlllIlilIl();
   }

   private static boolean Iilllilliill(IIilliIllIilliIl dirt, Set<IIilliIllIilliIl> cell, lliIiliiliIili view) {
      return !cell.contains(dirt) && view.iIlIlllllill(dirt);
   }

   private static boolean IiIlliIliiIl(IIilliIllIilliIl feet, Set<IIilliIllIilliIl> dirt, lliIiliiliIili view) {
      return IIlllIlliIll(feet.iIlIlllllill(), dirt, view) && Iilllilliill(feet, dirt, view) && Iilllilliill(feet.liiiIIllIl(), dirt, view);
   }

   private static boolean IIlllIlliIll(IIilliIllIilliIl cell, Set<IIilliIllIilliIl> view, lliIiliiliIili dirt) {
      return view.contains(cell) || dirt.IliIlllilIi(cell);
   }

   private static long Iiiiliiiiiii(long hash, long value) {
      return (hash ^ value) * 1099511628211L;
   }

   private static List<lliiIiililiiIiil> IlIillIiilIi(List<lliiIiililiiIiil> input, lliiIiililiiIiil... steps) {
      long var7 = -3144070675523475096L;
      ArrayList var2 = new ArrayList(input);
      lliiIiililiiIiil[] var3 = steps;
      var7 ^= ((long)steps.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         lliiIiililiiIiil var6 = var3[(int)var10];
         var2.add(var6);
      }

      return List.copyOf(var2);
   }

   private static void iIlIlllllill(PriorityQueue<IIlliillIlliil> node, Map<ilIiIIIiIiIiIIIi, Integer> request, IIlliillIlliil open, liiiilIliiiiilIl best) {
      long var6 = 2105372317476945855L;
      if (open.liIiiIlliiiIiiIlli.size() <= best.IIlllIlliIll()
         && open.ilIiiIlliIiIiiIlli.size() <= best.IiIlliIliiIl()
         && Iiilliiliiil(open.IlIiiIllillIiiIlli, best)) {
         ilIiIIIiIiIiIIIi var4 = IilliliilIIi(open);
         var6 ^= ((long)request.getOrDefault(var4, Integer.MAX_VALUE).intValue() << 32 ^ var6) & -1L << 32;
         if (open.IIliiIllilIliiIlli < (int)(var6 >>> 32)) {
            request.put(var4, open.IIliiIllilIliiIlli);
            node.add(open);
         }
      }
   }

   private static boolean liiiIIllIl(IIlliillIlliil request, liiiilIliiiiilIl node, lliIiliiliIili view) {
      long var7 = -3320586507307801530L;
      IIilliIllIilliIl var3 = request.IlIiiIllillIiiIlli;
      HashSet var4 = new HashSet<>(request.ilIiiIlliIiIiiIlli);

      for (long var9 = var7 ^ ((long)(request.liIiiIlliiiIiiIlli.size() - 1) << 32 ^ var7) & -1L << 32; (int)(var9 >>> 32) >= 0; var9 += -4294967296L) {
         lliiIiililiiIiil var6 = request.liIiiIlliiiIiiIlli.get((int)(var9 >>> 32));
         if (var6.IiiiIIilil != iIliIiiIlliIii.ilIIlIiIIl && var6.IiiiIIilil != iIliIiiIlliIii.IiIIlIiIIl) {
            if (var6.IiiiIIilil == iIliIiiIlliIii.IlIIlIiIIl) {
               if (!var3.equals(var6.iiiiIIilil)) {
                  return false;
               }

               var3 = var6.liiiIIilil;
            } else if (var6.IiiiIIilil == iIliIiiIlliIii.llIIlIiIIl) {
               var4.remove(var6.IIIIlIilil);
            }
         } else {
            if (!var3.equals(var6.iiiiIIilil)) {
               return false;
            }

            var4.remove(var6.IIIIlIilil);
            if (!view.iIlIlllllill(var6.liiiIIilil) || Math.abs(var6.iiiiIIilil.IliIiiiIll - var6.liiiIIilil.IliIiiiIll) > 1) {
               return false;
            }

            var3 = var6.liiiIIilil;
         }
      }

      return var3.equals(node.lIiiIiIlilli()) && var4.isEmpty();
   }

   private static boolean Ililllililil(IIilliIllIilliIl view, Set<IIilliIllIilliIl> dirt, lliIiliiliIili feet) {
      return dirt.contains(view.iIlIlllllill()) || feet.iliIiiliiiii(view.iIlIlllllill());
   }

   private static long Iliilliiilii(Set<IIilliIllIilliIl> cells) {
      return IIiilIiiiIii(-3750763034362895579L, cells);
   }

   private static ilIiIIIiIiIiIIIi IilliliilIIi(IIlliillIlliil node) {
      ArrayList var1 = new ArrayList<>(node.ilIiiIlliIiIiiIlli);
      var1.sort(liIiliiill);
      return new ilIiIIIiIiIiIIIi(node.IlIiiIllillIiiIlli, List.copyOf(var1));
   }

   private static IIilliIllIilliIl IiIiliIiiiIi(List<lliiIiililiiIiil> steps, IIilliIllIilliIl fallback) {
      for (lliiIiililiiIiil var3 : steps) {
         if (var3.IliIlllilIi() == iIliIiiIlliIii.llIIlIiIIl) {
            return var3.liiiIIllIl();
         }
      }

      return fallback;
   }

   private static boolean lIiiIiIlilli(IIlliillIlliil request, liiiilIliiiiilIl node, lliIiliiliIili view) {
      long var7 = -3340908307118860856L;
      long var9 = -782640582044376087L;
      if (!IiIlliIliiIl(request.IlIiiIllillIiiIlli, request.ilIiiIlliIiIiiIlli, view)) {
         return false;
      } else {
         IIilliIllIilliIl var3 = node.IilliliilIIi();
         if (IIillIiliIil(var3, request.ilIiiIlliIiIiiIlli, view) && IlIlllIlilIl(var3, request.ilIiiIlliIiIiiIlli, view) != null) {
            if (!request.IlIiiIllillIiiIlli.equals(var3) && !request.IlIiiIllillIiiIlli.equals(var3.iIlIlllllill())) {
               var7 ^= ((long)(var3.lIiiIiIlilli() - request.IlIiiIllillIiiIlli.lIiiIiIlilli()) << 32 ^ var7) & -1L << 32;
               var7 ^= ((long)(var3.IilliliilIIi() - request.IlIiiIllillIiiIlli.IilliliilIIi()) ^ var7) & -1L >>> 32;
               var9 ^= ((long)(var3.iliIiiliiiii() - request.IlIiiIllillIiiIlli.iliIiiliiiii()) << 32 ^ var9) & -1L << 32;
               return (int)(var7 >>> 32) >= -1
                  && (int)(var7 >>> 32) <= 2
                  && (int)var7 * (int)var7 + (int)(var9 >>> 32) * (int)(var9 >>> 32) <= 10
                  && (int)var7 * (int)var7 + (int)(var9 >>> 32) * (int)(var9 >>> 32) + (int)(var7 >>> 32) * (int)(var7 >>> 32) <= 16;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private static boolean IIillIiliIil(IIilliIllIilliIl view, Set<IIilliIllIilliIl> cell, lliIiliiliIili dirt) {
      return !cell.contains(view) && dirt.IilliliilIIi(view) && !dirt.lIiiIiIlilli(view);
   }

   private static List<lIIIiIlliIIIiIll> IIIllIIliIIl(IIlliillIlliil request, liiiilIliiiiilIl view, lliIiliiliIili node) {
      long var16 = -214501547297709027L;
      ArrayList var3 = new ArrayList();
      IIilliIllIilliIl var4 = request.IlIiiIllillIiiIlli;
      IIilliIllIilliIl var5 = var4.iIlIlllllill();
      if (Iiilliiliiil(var4.liiiIIllIl(), view)
         && IIillIiliIil(var4, request.ilIiiIlliIiIiiIlli, node)
         && IIlllIlliIll(var5, request.ilIiiIlliIiIiiIlli, node)
         && Iilllilliill(var4.liiiIIllIl(), request.ilIiiIlliIiIiiIlli, node)
         && Iilllilliill(var4.liiiIIllIl().liiiIIllIl(), request.ilIiiIlliIiIiiIlli, node)) {
         var3.add(new lIIIiIlliIIIiIll(var4, var5, illIlIilIl<"illIlIilIl","03jgC3FhEsU9gsZItZqf7h2CwIcUOmqjO87lyXtG">(), var4.liiiIIllIl(), true, false));
      }

      int[][] var6 = IiIiliiill;
      var16 ^= ((long)var6.length << 32 ^ var16) & -1L << 32;

      for (long var20 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         int[] var9 = var6[(int)var20];
         IIilliIllIilliIl var10 = request.IlIiiIllillIiiIlli.IliIlllilIi(var9[0], 0, var9[1]);
         IIilliIllIilliIl var11 = var10.iIlIlllllill();
         iiIIIIilIIlIIIil var12 = IlIlllIlilIl(var11, request.ilIiiIlliIiIiiIlli, node);
         if (var12 != null
            && IIillIiliIil(var11, request.ilIiiIlliIiIiiIlli, node)
            && Iilllilliill(var10, request.ilIiiIlliIiIiiIlli, node)
            && Iilllilliill(var10.liiiIIllIl(), request.ilIiiIlliIiIiiIlli, node)
            && Iiilliiliiil(var10, view)) {
            LinkedHashSet var13 = new LinkedHashSet<>(request.ilIiiIlliIiIiiIlli);
            var13.add(var11);
            if (IiIlliIliiIl(var10, var13, node)) {
               var3.add(new lIIIiIlliIIIiIll(var11, var12.IllIiIIIil, var12.lllIiIIIil, var10, false, false));
            }
         }

         var12 = IlIlllIlilIl(var10, request.ilIiiIlliIiIiiIlli, node);
         IIilliIllIilliIl var14 = var10.liiiIIllIl();
         if (var12 != null
            && IIillIiliIil(var10, request.ilIiiIlliIiIiiIlli, node)
            && Iilllilliill(var14, request.ilIiiIlliIiIiiIlli, node)
            && Iilllilliill(var14.liiiIIllIl(), request.ilIiiIlliIiIiiIlli, node)
            && Iilllilliill(request.IlIiiIllillIiiIlli.liiiIIllIl().liiiIIllIl(), request.ilIiiIlliIiIiiIlli, node)
            && Iiilliiliiil(var14, view)) {
            LinkedHashSet var15 = new LinkedHashSet<>(request.ilIiiIlliIiIiiIlli);
            var15.add(var10);
            if (IiIlliIliiIl(var14, var15, node)) {
               var3.add(new lIIIiIlliIIIiIll(var10, var12.IllIiIIIil, var12.lllIiIIIil, var14, false, true));
            }
         }
      }

      return var3;
   }

   public static long Iilililiiili(liiiilIliiiiilIl request, IIilliIllIilliIl playerStart, Set<IIilliIllIilliIl> owned, String reason) {
      return Illillliilli(request, null, playerStart, List.of(), Set.of(), owned, reason);
   }

   private lilliilliilliill() {
   }

   private static Set<IIilliIllIilliIl> IIlilIliiIli(liiiilIliiiiilIl request, lliIiliiliIili view) {
      long var7 = 3215600695041339322L;
      long var9 = -6683035122693609098L;
      HashSet var2 = new HashSet();
      var7 ^= ((long)(-request.IIIllIIliIIl()) << 32 ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) <= request.IIIllIIliIIl()) {
         for (var7 ^= ((long)(-request.IIIllIIliIIl()) ^ var7) & -1L >>> 32; (int)var7 <= request.IIIllIIliIIl(); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            for (var9 ^= ((long)(-request.IlIlllIlilIl()) << 32 ^ var9) & -1L << 32; (int)(var9 >>> 32) <= request.IlIlllIlilIl(); var9 += 4294967296L) {
               IIilliIllIilliIl var6 = request.lIiiIiIlilli().IliIlllilIi((int)(var7 >>> 32), (int)(var9 >>> 32), (int)var7);
               if (view.iliIiiliiiii(var6)) {
                  var2.add(var6);
               }
            }
         }

         var7 += 4294967296L;
      }

      return Set.copyOf(var2);
   }

   private static List<IIilliIllIilliIl> iliIiiliiiii(IIlliillIlliil view, liiiilIliiiiilIl request, lliIiliiliIili node) {
      long var12 = 1165142786016048947L;
      long var14 = -4728586692273403798L;
      ArrayList var3 = new ArrayList();
      int[][] var4 = IiIiliiill;
      var12 ^= ((long)var4.length << 32 ^ var12) & -1L << 32;

      for (long var17 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         int[] var7 = var4[(int)var17];
         IIilliIllIilliIl var8 = view.IlIiiIllillIiiIlli.IliIlllilIi(var7[0], 0, var7[1]);
         if (Iiilliiliiil(var8, request) && IiIlliIliiIl(var8, view.ilIiiIlliIiIiiIlli, node)) {
            var3.add(var8);
         } else {
            IIilliIllIilliIl var9 = var8.liiiIIllIl();
            if (Iiilliiliiil(var9, request)
               && Iilllilliill(view.IlIiiIllillIiiIlli.liiiIIllIl(), view.ilIiiIlliIiIiiIlli, node)
               && Iilllilliill(view.IlIiiIllillIiiIlli.liiiIIllIl().liiiIIllIl(), view.ilIiiIlliIiIiiIlli, node)
               && IiIlliIliiIl(var9, view.ilIiiIlliIiIiiIlli, node)) {
               var3.add(var9);
            } else {
               for (var14 ^= (4294967296L ^ var14) & -1L << 32; (int)(var14 >>> 32) <= 2; var14 += 4294967296L) {
                  IIilliIllIilliIl var11 = var8.IliIlllilIi(0, -((int)(var14 >>> 32)), 0);
                  if (IiIlliIliiIl(var11, view.ilIiiIlliIiIiiIlli, node)) {
                     var3.add(var11);
                     break;
                  }

                  if (!Iilllilliill(var11.liiiIIllIl(), view.ilIiiIlliIiIiiIlli, node)) {
                     break;
                  }
               }
            }
         }
      }

      return var3;
   }
}
