package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

final class IIlilillIlilil {
   static final IlIillillIilli illillIliIilillIli = new IlIillillIilli(
      new lIiliiliIiliil(0, 0, 0), new lIiliiliIiliil(0, 0, 0), false, new lIiliiliIiliil(0, 0, 0), 0, 0.0, 0.0, 0.0, 0, 0.0, false
   );
   static final double iiIillIliIIlillIli = 15.0;
   private final Map<lIiliiliIiliil, Double> IIIillIlilIIillIli = new HashMap<>();
   private static final int[][] lIlillIliiIlillIli = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
   private final lIiliiliIiliil IiIillIliliIillIli;
   private static final int[][] IllillIlilllillIli = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
   private final Map<lIiliiliIiliil, IIiIliIilIiIliIi> iIIillIliIlIillIli = new HashMap<>();
   static final double[] lilillIliiilillIli = new double[]{0.0, -0.1, 0.1};
   private final Map<lIiliiliIiliil, iiilllllIIIillll> llIillIliilIillIli = new HashMap<>();

   static void Ililllililil(IIiiIiIllIiiIiIl out, lIiliiliIiliil w, List<IIiIliIilIiIliIi> c) {
      lIiliiliIiliil var3 = w.IilliliilIIi();
      if (out.IIIIllIIIl(var3)) {
         lIiliiliIiliil var4 = var3.IilliliilIIi();
         if (!(out.lilIliilIl(var4) < 0.8) || out.IIIIllIIIl(var4)) {
            if (!out.IilliliilIIi(var4)) {
               c.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.IlliiilIillliiilIi, w, var3, var3, 1, null));
            }
         }
      }
   }

   IIiIliIilIiIliIi iIlIlllllill(lIiliiliIiliil c) {
      return this.iIIillIliIlIillIli.get(c);
   }

   static int[] IiIiliIiiiIi(Set<lIiliiliIiliil> cells) {
      int[] var1 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

      for (lIiliiliIiliil var3 : cells) {
         var1[0] = Math.min(var1[0], var3.IIlllIlliIll());
         var1[1] = Math.min(var1[1], var3.Illlllllilll());
         var1[2] = Math.min(var1[2], var3.Iilllilliill());
         var1[3] = Math.max(var1[3], var3.IIlllIlliIll());
         var1[4] = Math.max(var1[4], var3.Illlllllilll());
         var1[5] = Math.max(var1[5], var3.Iilllilliill());
      }

      return var1;
   }

   iiilllllIIIillll IilliliilIIi(lIiliiliIiliil c) {
      return this.llIillIliilIillIli.getOrDefault(c, iiilllllIIIillll.lIIIliIill);
   }

   static IlIillillIilli Iilllilliill(
      IIiiIiIllIiiIiIl w,
      lIiliiliIiliil popped,
      lIiliiliIiliil opt,
      iIliIIiIlliIIi cache,
      IIlilillIlilil c,
      Set<lIiliiliIiliil> nav,
      Map<Long, IlIillillIilli> f
   ) {
      long var22 = 3765984075458397876L;
      long var24 = -2064092579438855278L;
      long var7 = popped.IIIllIIliIIl() * -7046029254386353131L ^ opt.IIIllIIliIIl();
      IlIillillIilli var9 = (IlIillillIilli)f.get(var7);
      if (var9 == null) {
         var9 = Iiilliiliiil(w, popped, opt, cache);
         f.put(var7, var9 == null ? illillIliIilillIli : var9);
      }

      if (var9 != null && var9 != illillIliIilillIli) {
         return var9;
      } else {
         IlIillillIilli var10 = null;
         double var11 = Double.POSITIVE_INFINITY;
         var22 ^= (-4294967296L ^ var22) & -1L << 32;

         while ((int)(var22 >>> 32) <= 1) {
            for (var22 ^= ~var22 & -1L >>> 32; (int)var22 <= 1; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
               for (var24 ^= (-4294967296L ^ var24) & -1L << 32; (int)(var24 >>> 32) <= 1; var24 += 4294967296L) {
                  if ((int)(var22 >>> 32) != 0 || (int)var22 != 0 || (int)(var24 >>> 32) != 0) {
                     lIiliiliIiliil var16 = popped.IliIlllilIi((int)(var22 >>> 32), (int)(var24 >>> 32), (int)var22);
                     if (nav.contains(var16) && w.IiiIlliiIl(var16)) {
                        double var17 = c.liiiIIllIl(var16);
                        if (!(var17 >= var11)) {
                           long var19 = var16.IIIllIIliIIl() * -7046029254386353131L ^ opt.IIIllIIliIIl();
                           IlIillillIilli var21 = (IlIillillIilli)f.get(var19);
                           if (var21 == null) {
                              var21 = Iiilliiliiil(w, var16, opt, cache);
                              f.put(var19, var21 == null ? illillIliIilillIli : var21);
                           }

                           if (var21 != null && var21 != illillIliIilillIli) {
                              var10 = var21;
                              var11 = var17;
                           }
                        }
                     }
                  }
               }
            }

            var22 += 4294967296L;
         }

         return var10;
      }
   }

   static void IIlllIlliIll(IIiiIiIllIiiIiIl c, lIiliiliIiliil w, List<IIiIliIilIiIliIi> out) {
      long var11 = 5307688289982273338L;
      long var13 = -4622881913624156841L;
      int[][] var3 = IllillIlilllillIli;
      var11 ^= ((long)var3.length << 32 ^ var11) & -1L << 32;

      for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         int[] var6 = var3[(int)var11];
         lIiliiliIiliil var7 = w.IliIlllilIi(var6[0], 0, 0);
         lIiliiliIiliil var8 = w.IliIlllilIi(0, 0, var6[1]);
         if (c.IIiIllIiIl(var7)
            && c.IIiIllIiIl(var7.liiiIIllIl())
            && c.IIiIllIiIl(var8)
            && c.IIiIllIiIl(var8.liiiIIllIl())
            && IIIllIIliIIl(c, var7)
            && IIIllIIliIIl(c, var8)) {
            lIiliiliIiliil var9 = w.IliIlllilIi(var6[0], 0, var6[1]);
            if (c.IiiIlliiIl(var9)) {
               out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, w, var9, null, 0, null));
            }
         }
      }

      var3 = lIlillIliiIlillIli;
      var11 ^= ((long)var3.length << 32 ^ var11) & -1L << 32;

      for (long var22 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         int[] var16 = var3[(int)var22];
         lIiliiliIiliil var17 = w.IliIlllilIi(var16[0], 0, var16[1]);
         if (c.IiiIlliiIl(var17)) {
            out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, w, var17, null, 0, null));
         } else {
            lIiliiliIiliil var18 = var17.liiiIIllIl();
            if (c.IIiIllIiIl(w.liiiIIllIl()) && c.IIiIllIiIl(w.iIlIlllllill(2)) && c.IiiIlliiIl(var18)) {
               out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, w, var18, null, 0, null));
            } else if (c.IIiIllIiIl(var17) && c.IIiIllIiIl(var17.liiiIIllIl())) {
               for (var13 ^= (4294967296L ^ var13) & -1L << 32; (int)(var13 >>> 32) <= 2; var13 += 4294967296L) {
                  lIiliiliIiliil var10 = var17.lIiiIiIlilli((int)(var13 >>> 32));
                  if (c.IiiIlliiIl(var10)) {
                     out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, w, var10, null, 0, null));
                     break;
                  }

                  if (!c.IIiIllIiIl(var10.liiiIIllIl()) || !c.IIiIllIiIl(var10)) {
                     break;
                  }
               }
            }
         }
      }
   }

   static IIlilillIlilil IlIlllIlilIl(IIiiIiIllIiiIiIl dirtLeft, lIiliiliIiliil start, iIliIIiIlliIIi w, int constructionNear, Set<lIiliiliIiliil> opt) {
      return IiIlliIliiIl(dirtLeft, start, w, constructionNear, opt, dirtLeft.lllllliIll.keySet());
   }

   static void Illlllllilll(
      IIiiIiIllIiiIiIl w,
      lIiliiliIiliil nav,
      iIliIIiIlliIIi popped,
      int dirtFromCache,
      IIlilillIlilil maxK,
      Set<lIiliiliIiliil> opt,
      Map<Long, IlIillillIilli> c,
      List<IIiIliIilIiIliIi> out
   ) {
      long var19 = -5103316399871613679L;
      long var21 = -2447221433401612424L;

      for (var19 ^= (4294967296L ^ var19) & -1L << 32; (int)(var19 >>> 32) <= dirtFromCache && !w.IIlllIlliIll(nav); var19 += 4294967296L) {
         var19 ^= (1L ^ var19) & -1L >>> 32;

         for (var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < (int)(var19 >>> 32) && (int)var19 != 0; var21 += 4294967296L) {
            if (!w.lIIlliIIll(nav.iIlIlllllill((int)(var21 >>> 32)), popped)) {
               var19 ^= (0L ^ var19) & -1L >>> 32;
            }
         }

         if ((int)var19 == 0 || !w.IIiIllIiIl(nav.iIlIlllllill((int)(var19 >>> 32))) || !w.IIiIllIiIl(nav.iIlIlllllill((int)(var19 >>> 32) + 1))) {
            break;
         }

         out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.iiIiiilIiIIliiilIi, nav, nav.iIlIlllllill((int)(var19 >>> 32)), nav, (int)(var19 >>> 32), null));
      }

      int[][] var8 = lIlillIliiIlillIli;
      var19 ^= ((long)var8.length ^ var19) & -1L >>> 32;

      for (long var28 = var21 ^ (0L ^ var21) & -1L << 32; (int)(var28 >>> 32) < (int)var19; var28 += 4294967296L) {
         int[] var11 = var8[(int)(var28 >>> 32)];
         lIiliiliIiliil var12 = nav.IliIlllilIi(var11[0], 0, var11[1]);
         if (!w.IiiIlliiIl(var12)) {
            lIiliiliIiliil var13 = var12.IilliliilIIi();
            if (w.lIIlliIIll(var13, popped)
               && !w.IilliliilIIi(var12)
               && !w.lIiiIiIlilli(var12)
               && w.lilIliilIl(var12) <= 0.26
               && w.IIiIllIiIl(var12.liiiIIllIl())) {
               IlIillillIilli var14 = Iilllilliill(w, nav, var13, popped, maxK, opt, c);
               if (var14 == null && w.iIillliIll) {
                  var14 = IIillIiliIil(w, nav, var13, popped);
               }

               if (var14 == null && w.IlillliIll) {
                  var14 = IIillIiliIil(w, nav, var13, popped);
               }

               lIiliiliIiliil var15 = w.iIillliIll && var14 != null && maxK.IilliliilIIi(nav).IilliliilIIi().contains(nav.IilliliilIIi())
                  ? nav.IilliliilIIi()
                  : null;
               if (var14 != null) {
                  out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.lIliiilIiiIliiilIi, nav, var12, var13, 1, var14.iIlIlllllill(), var14, var15));
               }
            }
         }

         lIiliiliIiliil var23 = var12.liiiIIllIl();
         if (!w.IiiIlliiIl(var23)
            && w.IIiIllIiIl(nav.liiiIIllIl())
            && w.IIiIllIiIl(nav.iIlIlllllill(2))
            && w.lIIlliIIll(var12, popped)
            && w.IIiIllIiIl(var23)
            && w.IIiIllIiIl(var23.liiiIIllIl())) {
            IlIillillIilli var24 = Iilllilliill(w, nav, var12, popped, maxK, opt, c);
            if (var24 != null) {
               out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.lIliiilIiiIliiilIi, nav, var23, var12, 1, var24.iIlIlllllill(), var24));
            }
         }

         if (!w.IiiIlliiIl(var12) && w.IIiIllIiIl(var12) && w.IIiIllIiIl(var23)) {
            for (var28 ^= (1L ^ var28) & -1L >>> 32; (int)var28 <= 2; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               lIiliiliIiliil var25 = var12.lIiiIiIlilli((int)var28);
               lIiliiliIiliil var16 = var25.IilliliilIIi();
               if (!w.IIiIllIiIl(var25) || !w.IIiIllIiIl(var25.liiiIIllIl()) || w.IiiIlliiIl(var25)) {
                  break;
               }

               if (w.lIIlliIIll(var16, popped)) {
                  IlIillillIilli var17 = Iilllilliill(w, nav, var16, popped, maxK, opt, c);
                  lIiliiliIiliil var18 = w.iIillliIll && maxK.IilliliilIIi(nav).IilliliilIIi().contains(nav.IilliliilIIi()) ? nav.IilliliilIIi() : null;
                  if (var17 != null) {
                     out.add(new IIiIliIilIiIliIi(ilIlIilIiIlIil.lIliiilIiiIliiilIi, nav, var25, var16, 1, var17.iIlIlllllill(), var17, var18));
                  }
               }

               if (!w.IliIlllilIi(var16).isEmpty()) {
                  break;
               }
            }
         }
      }
   }

   Set<lIiliiliIiliil> IliIlllilIi() {
      return this.IIIillIlilIIillIli.keySet();
   }

   static boolean iliIiiliiiii(IIiiIiIllIiiIiIl from, lIiliiliIiliil to, lIiliiliIiliil w) {
      long var6 = -604851359474691471L;
      var6 ^= ((long)Integer.signum(w.IIlllIlliIll() - to.IIlllIlliIll()) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Integer.signum(w.Iilllilliill() - to.Iilllilliill()) ^ var6) & -1L >>> 32;
      if (w.Illlllllilll() < to.Illlllllilll() && ((int)(var6 >>> 32) != 0 || (int)var6 != 0)) {
         lIiliiliIiliil var5 = w.IliIlllilIi((int)(var6 >>> 32), 0, (int)var6);
         return from.IIiIllIiIl(var5) && from.IIiIllIiIl(var5.liiiIIllIl()) && !IIIllIIliIIl(from, var5);
      } else {
         return false;
      }
   }

   static boolean IlIillIiilIi(lIiliiliIiliil c, Set<lIiliiliIiliil> r, int hot) {
      if (r != null && !r.isEmpty()) {
         for (lIiliiliIiliil var4 : r) {
            if (c.IiIlliIliiIl(var4) <= hot) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   List<IIiIliIilIiIliIi> lIiiIiIlilli(lIiliiliIiliil stand) {
      long var9 = 8579714727277615182L;
      ArrayList var2 = new ArrayList();
      lIiliiliIiliil var3 = stand;
      var9 ^= (0L ^ var9) & -1L << 32;

      while (!var3.equals(this.IiIillIliliIillIli)) {
         int var10000 = (int)(var9 >>> 32);
         var9 += 4294967296L;
         if (var10000 >= 4096) {
            break;
         }

         IIiIliIilIiIliIi var5 = this.iIIillIliIlIillIli.get(var3);
         if (var5 == null) {
            break;
         }

         var2.add(var5);
         var3 = var5.IIIllliIIi;
      }

      Collections.reverse(var2);
      ArrayList var11 = new ArrayList();
      IIiIliIilIiIliIi var6 = null;

      for (IIiIliIilIiIliIi var8 : var2) {
         if (var8.iiiIlliIIi == ilIlIilIiIlIil.IiIiiilIiliIiiilIi && var8.IiIllliIIi == null) {
            var6 = new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var6 == null ? var8.IIIllliIIi : var6.IIIllliIIi, var8.lIIllliIIi, null, 0, null);
         } else {
            if (var6 != null) {
               var11.add(var6);
               var6 = null;
            }

            var11.add(var8);
         }
      }

      if (var6 != null) {
         var11.add(var6);
      }

      return var11;
   }

   static boolean IIIilIIiiIIi(lIiliiliIiliil hot, Set<lIiliiliIiliil> c, int r) {
      long var6 = -487661086401444963L;
      if (c == null) {
         return false;
      } else {
         for (lIiliiliIiliil var4 : c) {
            var6 ^= ((long)(var4.Illlllllilll() - hot.Illlllllilll()) << 32 ^ var6) & -1L << 32;
            if ((int)(var6 >>> 32) > r
               && (int)(var6 >>> 32) <= r + 3
               && Math.abs(var4.IIlllIlliIll() - hot.IIlllIlliIll()) <= r
               && Math.abs(var4.Iilllilliill() - hot.Iilllilliill()) <= r) {
               return true;
            }
         }

         return false;
      }
   }

   static boolean IIIllIIliIIl(IIiiIiIllIiiIiIl c, lIiliiliIiliil w) {
      long var3 = -7906341690151648647L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) <= 2; var5 += 4294967296L) {
         if (c.IiiIlliiIl(w.lIiiIiIlilli((int)(var5 >>> 32)))) {
            return true;
         }
      }

      return false;
   }

   static IIlilillIlilil IiIlliIliiIl(
      IIiiIiIllIiiIiIl w, lIiliiliIiliil opt, iIliIIiIlliIIi dirtLeft, int start, Set<lIiliiliIiliil> windowCells, Set<lIiliiliIiliil> constructionNear
   ) {
      long var48 = -4365546127415824241L;
      long var38 = 8893603377712964161L;
      long var40 = 1415766276471694360L;
      long var42 = -8953752846105255588L;
      long var44 = 7902093287527227801L;
      long var46 = 8980960099385533094L;
      IIlilillIlilil var6 = new IIlilillIlilil(opt);
      int[] var7 = constructionNear.isEmpty()
         ? new int[]{opt.IIlllIlliIll(), opt.Illlllllilll(), opt.Iilllilliill(), opt.IIlllIlliIll(), opt.Illlllllilll(), opt.Iilllilliill()}
         : IiIiliIiiiIi(constructionNear);
      var38 ^= ((long)dirtLeft.Iilililiiili() << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)(Math.min(var7[0], opt.IIlllIlliIll()) - (int)(var38 >>> 32)) ^ var38) & -1L >>> 32;
      var40 ^= ((long)(Math.max(var7[3], opt.IIlllIlliIll()) + (int)(var38 >>> 32)) << 32 ^ var40) & -1L << 32;
      var40 ^= ((long)(Math.min(var7[2], opt.Iilllilliill()) - (int)(var38 >>> 32)) ^ var40) & -1L >>> 32;
      var42 ^= ((long)(Math.max(var7[5], opt.Iilllilliill()) + (int)(var38 >>> 32)) << 32 ^ var42) & -1L << 32;
      var42 ^= ((long)(Math.min(var7[1], opt.Illlllllilll()) - 4) ^ var42) & -1L >>> 32;
      var44 ^= ((long)(Math.max(var7[4], opt.Illlllllilll()) + 4) << 32 ^ var44) & -1L << 32;
      var44 ^= ((long)((int)Math.ceil(dirtLeft.Iiilliiliiil()) + 2) ^ var44) & -1L >>> 32;
      PriorityQueue var16 = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));
      var6.IIIillIlilIIillIli.put(opt, 0.0);
      var6.llIillIliilIillIli.put(opt, iiilllllIIIillll.lIIIliIill);
      var16.add(new double[]{0.0, (double)opt.IIlllIlliIll(), (double)opt.Illlllllilll(), (double)opt.Iilllilliill()});
      HashSet var17 = new HashSet();
      HashMap var18 = new HashMap();
      var46 ^= (0L ^ var46) & -1L << 32;

      label306:
      while (!var16.isEmpty()) {
         int var10000 = (int)(var46 >>> 32);
         var46 += 4294967296L;
         if (var10000 >= 20000 || Thread.currentThread().isInterrupted()) {
            break;
         }

         double[] var20 = (double[])var16.poll();
         lIiliiliIiliil var21 = new lIiliiliIiliil((int)var20[1], (int)var20[2], (int)var20[3]);
         if (!(var20[0] > var6.IIIillIlilIIillIli.getOrDefault(var21, Double.POSITIVE_INFINITY) + 1.0E-6) && var17.add(var21)) {
            double var22 = var20[0];
            iiilllllIIIillll var24 = var6.IilliliilIIi(var21);
            w.Iiilliiliiil(var24);

            try {
               if (w.IiiIlliiIl(var21) || var21.equals(opt)) {
                  ArrayList var25 = new ArrayList();
                  IIlllIlliIll(w, var21, var25);
                  var46 ^= ((long)var24.iIlIlllllill() ^ var46) & -1L >>> 32;
                  if (start - (int)var46 > 0 && IlIillIiilIi(var21, windowCells, (int)var44)) {
                     Illlllllilll(w, var21, dirtLeft, Math.min(dirtLeft.IlIillIiilIi(), start - (int)var46), var6, var17, var18, var25);
                  } else if (start - (int)var46 > 0 && w.llillliIll && IIIilIIiiIIi(var21, windowCells, (int)var44)) {
                     Illlllllilll(w, var21, dirtLeft, Math.min(3, start - (int)var46), var6, var17, var18, var25);
                  }

                  Ililllililil(w, var21, var25);
                  Iterator var27 = var25.iterator();

                  while (true) {
                     IIiIliIilIiIliIi var28;
                     lIiliiliIiliil var29;
                     double var32;
                     label285:
                     while (true) {
                        label263:
                        while (true) {
                           if (!var27.hasNext()) {
                              continue label306;
                           }

                           var28 = (IIiIliIilIiIliIi)var27.next();
                           var29 = var28.lIIllliIIi;
                           if ((var28.iiiIlliIIi != ilIlIilIiIlIil.IiIiiilIiliIiiilIi || !dirtLeft.IIillIiliIil(var29))
                              && var29.IIlllIlliIll() >= (int)var38
                              && var29.IIlllIlliIll() <= (int)(var40 >>> 32)
                              && var29.Iilllilliill() >= (int)var40
                              && var29.Iilllilliill() <= (int)(var42 >>> 32)
                              && var29.Illlllllilll() >= (int)var42
                              && var29.Illlllllilll() <= (int)(var44 >>> 32)) {
                              if (w.iIillliIll
                                 && var28.iiiIlliIIi == ilIlIilIiIlIil.IiIiiilIiliIiiilIi
                                 && var28.IiIllliIIi == null
                                 && var24.IilliliilIIi().contains(var21.IilliliilIIi())
                                 && !var29.IilliliilIIi().equals(var21.IilliliilIIi())
                                 && iIlllIIiIllllIIi.Iilllilliill(w, dirtLeft, Set.of(), var21.IilliliilIIi(), var29)) {
                                 var28 = new IIiIliIilIiIliIi(ilIlIilIiIlIil.IiIiiilIiliIiiilIi, var21, var29, null, 0, null, null, var21.IilliliilIIi());
                              }

                              switch (var28.iiiIlliIIi) {
                                 case illiiilIiIiliiilIi:
                                    var61 = 1.0 + 0.4 * (double)Math.abs(var29.Illlllllilll() - var21.Illlllllilll());
                                    break label263;
                                 case lIliiilIiiIliiilIi:
                                    var61 = 10.0 * (double)var28.IlIllliIIi + 2.0;
                                    break label263;
                                 case IIiiiilIilIiiiilIi:
                                    var61 = 11.4 + (var28.llIllliIIi != null && !var28.llIllliIIi.equals(var21) ? 3.0 : 0.0);
                                    break label263;
                                 case IiIiiilIiliIiiilIi:
                                    var61 = 3.0;
                                    break label263;
                                 default:
                                    var61 = 1.0;
                                    break label263;
                              }
                           }
                        }

                        double var30 = var61;
                        if (w.iIillliIll
                           && (var28.iiiIlliIIi == ilIlIilIiIlIil.IiIiiilIiliIiiilIi || var28.iiiIlliIIi == ilIlIilIiIlIil.lIliiilIiiIliiilIi)
                           && iliIiiliiiii(w, var21, var29)) {
                           var30 += 15.0;
                        }

                        var32 = var22 + var30;
                        if (var32 < var6.IIIillIlilIIillIli.getOrDefault(var29, Double.POSITIVE_INFINITY) - 1.0E-6) {
                           switch (var28.iiiIlliIIi) {
                              case illiiilIiIiliiilIi:
                                 var62 = var28.IiIllliIIi != null ? var24.liiiIIllIl(var28.IiIllliIIi) : var24;
                                 break label285;
                              case lIliiilIiiIliiilIi:
                                 ArrayList var35 = new ArrayList();

                                 for (var48 ^= (0L ^ var48) & -1L << 32; (int)(var48 >>> 32) < var28.IlIllliIIi; var48 += 4294967296L) {
                                    var35.add(var28.IIIllliIIi.iIlIlllllill((int)(var48 >>> 32)));
                                 }

                                 var62 = var24.IliIlllilIi(var35);
                                 break label285;
                              case IIiiiilIilIiiiilIi:
                                 var62 = var28.IiIllliIIi != null
                                    ? var24.liiiIIllIl(var28.IiIllliIIi).IliIlllilIi(List.of(var28.iIIllliIIi))
                                    : var24.IliIlllilIi(List.of(var28.iIIllliIIi));
                                 break label285;
                              case IiIiiilIiliIiiilIi:
                                 var62 = var24.liiiIIllIl(var28.iIIllliIIi);
                                 break label285;
                              default:
                                 var62 = var24;
                                 break label285;
                           }
                        }
                     }

                     iiilllllIIIillll var34 = var62;
                     var6.IIIillIlilIIillIli.put(var29, var32);
                     var6.iIIillIliIlIillIli.put(var29, var28);
                     var6.llIillIliilIillIli.put(var29, var34);
                     var16.add(new double[]{var32, (double)var29.IIlllIlliIll(), (double)var29.Illlllllilll(), (double)var29.Iilllilliill()});
                  }
               }
            } finally {
               w.IIIilIIiiIIi();
            }
         }
      }

      return var6;
   }

   static IlIillillIilli Iiilliiliiil(IIiiIiIllIiiIiIl c, lIiliiliIiliil f, lIiliiliIiliil opt, iIliIIiIlliIIi w) {
      long var27 = 4665194718891021160L;
      long var29 = -8670055413841907968L;
      if (!opt.equals(f) && !opt.equals(f.liiiIIllIl())) {
         for (long var31 = var27 ^ (0L ^ var27) & -1L << 32; (int)(var31 >>> 32) < 6; var31 += 4294967296L) {
            lIiliiliIiliil var5 = opt.iliIiiliiiii((int)(var31 >>> 32));
            if (!var5.equals(f) && !var5.equals(f.liiiIIllIl()) && !c.IliIlllilIi(var5).isEmpty()) {
               var31 ^= ((long)iiIiIIilIIliIIil.IliIlllilIi((int)(var31 >>> 32)) ^ var31) & -1L >>> 32;
               var29 ^= ((long)c.iliIiiliiiii(var5) << 32 ^ var29) & -1L << 32;

               for (IIlIIIilIlIIIi var9 : c.liiiIIllIl(var5)) {
                  if (iIlllIIiIllllIIi.IiiIlliiIl(var9, (int)var31)) {
                     for (var29 ^= ((long)((int)(var29 >>> 32) != 0 ? 1 : 0) ^ var29) & -1L >>> 32;
                        (int)var29 < 2;
                        var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32
                     ) {
                        double[] var11 = c.iiiIlIIIll(f, (int)var29 == 1);

                        for (double[] var13 : iIlllIIiIllllIIi.lliIliliIl(w.IiIiliIiiiIi())) {
                           double[] var14 = iIlllIIiIllllIIi.iiiIlIIIll(var5, var9, (int)var31, var13[0], var13[1]);
                           if (!(iIlllIIiIllllIIi.ilIllIiIll(var11, var14[0], var14[1], var14[2]) > w.Iiilliiliiil() * w.Iiilliiliiil())) {
                              int[] var15 = iiIiIIilIIliIIil.liiiIIllIl((int)var31);
                              double var16 = (var11[0] - var14[0]) * (double)var15[0]
                                 + (var11[1] - var14[1]) * (double)var15[1]
                                 + (var11[2] - var14[2]) * (double)var15[2];
                              if (!(var16 <= 1.0E-4) && c.ilIllIiIll(var11, var14, var5, false)) {
                                 double var18 = var14[0] - var11[0];
                                 double var20 = var14[1] - var11[1];
                                 double var22 = var14[2] - var11[2];
                                 double var24 = Math.min(var13[2], iIlllIIiIllllIIi.lIIlliIIll(var9, (int)var31) * var13[2]);
                                 IlIillillIilli var26 = new IlIillillIilli(
                                    opt,
                                    f,
                                    (int)var29 == 1,
                                    var5,
                                    (int)var31,
                                    var14[0],
                                    var14[1],
                                    var14[2],
                                    iiIiIIilIIliIIil.IlIlllIlilIl(var18, var20, var22),
                                    var24,
                                    c.IIIIllIIIl(var5)
                                 );
                                 if (!w.IIiilIiiiIii().contains(var26.IliIlllilIi())) {
                                    return var26;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   static IlIillillIilli IIillIiliIil(IIiiIiIllIiiIiIl opt, lIiliiliIiliil f, lIiliiliIiliil w, iIliIIiIlliIIi c) {
      long var23 = 7504868914187502096L;
      long var25 = 7498845522761598377L;
      long var27 = -7384295147094249608L;
      lIiliiliIiliil var4 = f.IilliliilIIi();
      var23 ^= ((long)(w.IIlllIlliIll() - var4.IIlllIlliIll()) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)(w.Iilllilliill() - var4.Iilllilliill()) ^ var23) & -1L >>> 32;
      if (w.Illlllllilll() == var4.Illlllllilll()
         && Math.abs((int)(var23 >>> 32)) + Math.abs((int)var23) == 1
         && iIlllIIiIllllIIi.iIiIiiliil.equals(opt.IliIlllilIi(var4))
         && !opt.lIiiIiIlilli(var4)
         && !opt.IilliliilIIi(var4)) {
         lIiliiliIiliil var7 = f.IliIlllilIi((int)(var23 >>> 32), 0, (int)var23);
         if (opt.IIiIllIiIl(var7) && opt.IIiIllIiIl(var7.liiiIIllIl())) {
            var25 ^= ((long)((int)(var23 >>> 32) > 0 ? 5 : ((int)(var23 >>> 32) < 0 ? 4 : ((int)var23 > 0 ? 3 : 2))) << 32 ^ var25) & -1L << 32;
            double[] var9 = opt.iiiIlIIIll(f, true);
            double var10 = c.Iiilliiliiil() * c.Iiilliiliiil();

            for (double[] var13 : iIlllIIiIllllIIi.lliIliliIl(false)) {
               double[] var14 = iIlllIIiIllllIIi.iiiIlIIIll(var4, iIlllIIiIllllIIi.lIiIiiliil, (int)(var25 >>> 32), var13[0], var13[1]);
               var25 ^= (1L ^ var25) & -1L >>> 32;
               var27 ^= (0L ^ var27) & -1L << 32;

               while ((int)(var27 >>> 32) < iliiiIiIiiiiIi.lIiIlliiiiIiIlliii.length && (int)var25 != 0) {
                  for (var27 ^= (0L ^ var27) & -1L >>> 32;
                     (int)var27 < lilillIliiilillIli.length && (int)var25 != 0;
                     var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32
                  ) {
                     double var18 = iliiiIiIiiiiIi.lIiIlliiiiIiIlliii[(int)(var27 >>> 32)];
                     double var20 = lilillIliiilillIli[(int)var27];
                     double[] var22 = new double[]{
                        var9[0] + (double)((int)(var23 >>> 32)) * var18 + (double)((int)var23) * var20,
                        var9[1],
                        var9[2] + (double)((int)var23) * var18 + (double)((int)(var23 >>> 32)) * var20
                     };
                     var25 ^= (
                           (long)(
                                 (var22[0] - var14[0]) * (double)((int)(var23 >>> 32)) + (var22[2] - var14[2]) * (double)((int)var23) > 1.0E-4
                                       && iIlllIIiIllllIIi.ilIllIiIll(var22, var14[0], var14[1], var14[2]) <= var10
                                       && opt.ilIllIiIll(var22, var14, var4, false)
                                    ? 1
                                    : 0
                              )
                              ^ var25
                        )
                        & -1L >>> 32;
                  }

                  var27 += 4294967296L;
               }

               if ((int)var25 != 0) {
                  double var16 = var9[0] + (double)((int)(var23 >>> 32)) * 0.79;
                  double var29 = var9[2] + (double)((int)var23) * 0.79;
                  IlIillillIilli var30 = new IlIillillIilli(
                     w,
                     f,
                     true,
                     var4,
                     (int)(var25 >>> 32),
                     var14[0],
                     var14[1],
                     var14[2],
                     iiIiIIilIIliIIil.IlIlllIlilIl(var14[0] - var16, var14[1] - var9[1], var14[2] - var29),
                     var13[2],
                     opt.IIIIllIIIl(var4)
                  );
                  if (!c.IIiilIiiiIii().contains(var30.IliIlllilIi())) {
                     return var30;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   double liiiIIllIl(lIiliiliIiliil c) {
      return this.IIIillIlilIIillIli.getOrDefault(c, Double.POSITIVE_INFINITY);
   }

   private IIlilillIlilil(lIiliiliIiliil start) {
      this.IiIillIliliIillIli = start;
   }
}
