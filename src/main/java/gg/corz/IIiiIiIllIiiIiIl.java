package gg.corz;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class IIiiIiIllIiiIiIl implements llilIiililIi {
   final llilIiililIi IllllliIll;
   private iiilllllIIIillll liillliIll;
   final Map<lIiliiliIiliil, lIiliiliIiliil> iilllliIll;
   final Set<lIiliiliIiliil> ilillliIll;
   final Map<lIiliiliIiliil, liiIililiiiIilil> lllllliIll = new LinkedHashMap<>();
   final Set<lIiliiliIiliil> illllliIll = new HashSet<>();
   Set<lIiliiliIiliil> lIillliIll;
   boolean IlillliIll;
   static final int lIIilliIll = 8;
   static final int iIIilliIll = 1024;
   private int iiillliIll;
   final Set<lIiliiliIiliil> IilllliIll = new HashSet<>();
   final Set<lIiliiliIiliil> lilllliIll = new HashSet<>();
   int IIillliIll;
   private int IIIilliIll;
   boolean iIillliIll;
   boolean llillliIll;
   Set<lIiliiliIiliil> IiillliIll;

   IIiiIiIllIiiIiIl(llilIiililIi base, List<liiIililiiiIilil> targets) {
      this.iilllliIll = new HashMap<>();
      this.IIillliIll = Integer.MIN_VALUE;
      this.lIillliIll = Set.of();
      this.ilillliIll = new HashSet<>();
      this.IiillliIll = Set.of();
      this.liillliIll = iiilllllIIIillll.lIIIliIill;
      this.iiillliIll = -1;
      this.IllllliIll = base;

      for (liiIililiiiIilil var4 : targets) {
         this.lllllliIll.put(var4.liiiIIllIl(), var4);
      }
   }

   boolean IiiIlliiIl(lIiliiliIiliil feet) {
      lIiliiliIiliil var2 = feet.IilliliilIIi();
      if (this.illllliIll.contains(var2) && lliIliliIl(this.lllllliIll.get(var2))) {
         return false;
      } else if (!this.IilliliilIIi(var2) && !this.lIiiIiIlilli(var2) && !this.Illlllllilll(var2)) {
         if (this.lilIliilIl(var2) < 0.8) {
            return false;
         } else if (!this.IilliliilIIi(feet) && !this.lIiiIiIlilli(feet) && !this.iIiIlIliIl(feet)) {
            if (this.lilIliilIl(feet) > 0.26) {
               return false;
            } else {
               lIiliiliIiliil var3 = feet.liiiIIllIl();
               return !this.IilliliilIIi(var3) && !this.iIiIlIliIl(var3) && this.IliIlllilIi(var3).isEmpty();
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   liiIililiiiIilil IlIillIiilIi(lIiliiliIiliil c) {
      return this.lllllliIll.get(c);
   }

   static double iIlllIllll(double[] dy, double b, double c, double dx, lIiliiliIiliil e, IIlIIIilIlIIIi dz) {
      long var23 = -7649474599864539468L;
      double var9 = 0.0;
      double var11 = 1.000001;
      double[] var13 = new double[]{
         (double)e.IIlllIlliIll() + dz.IliIlllilIi(), (double)e.Illlllllilll() + dz.liiiIIllIl(), (double)e.Iilllilliill() + dz.iIlIlllllill()
      };
      double[] var14 = new double[]{
         (double)e.IIlllIlliIll() + dz.IilliliilIIi(), (double)e.Illlllllilll() + dz.lIiiIiIlilli(), (double)e.Iilllilliill() + dz.iliIiiliiiii()
      };
      double[] var15 = new double[]{b, c, dx};

      for (long var25 = var23 ^ (0L ^ var23) & -1L << 32; (int)(var25 >>> 32) < 3; var25 += 4294967296L) {
         if (Math.abs(var15[(int)(var25 >>> 32)]) < 1.0E-12) {
            if (dy[(int)(var25 >>> 32)] < var13[(int)(var25 >>> 32)] - 1.0E-9 || dy[(int)(var25 >>> 32)] > var14[(int)(var25 >>> 32)] + 1.0E-9) {
               return -1.0;
            }
         } else {
            double var17 = (var13[(int)(var25 >>> 32)] - dy[(int)(var25 >>> 32)]) / var15[(int)(var25 >>> 32)];
            double var19 = (var14[(int)(var25 >>> 32)] - dy[(int)(var25 >>> 32)]) / var15[(int)(var25 >>> 32)];
            if (var17 > var19) {
               double var21 = var17;
               var17 = var19;
               var19 = var21;
            }

            var9 = Math.max(var9, var17);
            var11 = Math.min(var11, var19);
            if (var9 > var11) {
               return -1.0;
            }
         }
      }

      return var9;
   }

   boolean lIIlliIIll(lIiliiliIiliil c, iIliIIiIlliIIi opt) {
      if (this.IliIlllilIi(c).isEmpty() && !this.IilliliilIIi(c) && !this.IlIlllIlilIl(c) && this.Ililllililil(c).isEmpty()) {
         liiIililiiiIilil var3 = this.lllllliIll.get(c);
         return var3 != null && !this.illllliIll.contains(c) ? opt.IIlilIliiIli() && var3.IliIlllilIi() : !this.IlIllllIll(c);
      } else {
         return false;
      }
   }

   void Iliilliiilii(lIiliiliIiliil serves, lIiliiliIiliil c) {
      this.iilllliIll.put(serves, c);
      this.lllllliIll
         .put(
            serves,
            new liiIililiiiIilil(
               serves,
               Iilllilliill<"Iilllilliill","nT2tHH9yaS2TmXhTU7nGJm6ejw7cNCJB4Waxa7ZGqI0=">(),
               Ililliillillii.llIiIliIIl,
               -1,
               IIiIllillIiIllil.lIlilliIil,
               false,
               null
            )
         );
   }

   static boolean lliIliliIl(liiIililiiiIilil t) {
      if (t != null && t.iliIiiliiiii() == IIiIllillIiIllil.lIlilliIil) {
         String var1 = t.iIlIlllllill();
         return var1.endsWith(Iilllilliill<"Iilllilliill","SYFxoEt0iFEZxdpMWSsxs/fetVM/1n7PQagbDPoQ5i6oKg==">())
            || var1.endsWith(Iilllilliill<"Iilllilliill","RB/z3C8zRPTNkNVcvCoKJ+BAmE5BYCKWLkgtz/C7RIPveCYQw3TV">())
            || var1.endsWith(Iilllilliill<"Iilllilliill","bRvtyoc2P3M8hSI6i4SsHi7ClEqcmnQGWL5UBKdsAXU0">());
      } else {
         return false;
      }
   }

   @Override
   public boolean IIillIiliIil(lIiliiliIiliil c) {
      return !this.IllllliIll.IIillIiliIil(c)
         ? false
         : !this.liillliIll.lIiiIiIlilli().contains(c)
            && !this.liillliIll.IilliliilIIi().contains(c)
            && !this.lilllliIll.contains(c)
            && !this.IilllliIll.contains(c)
            && !this.lllllliIll.containsKey(c);
   }

   @Override
   public List<IIlIIIilIlIIIi> IliIlllilIi(lIiliiliIiliil c) {
      if (this.liillliIll.lIiiIiIlilli().contains(c)) {
         return iIlllIIiIllllIIi.iliIiiliil;
      } else if (this.liillliIll.IilliliilIIi().contains(c)) {
         return iIlllIIiIllllIIi.iIiIiiliil;
      } else if (this.lilllliIll.contains(c)) {
         return iIlllIIiIllllIIi.iliIiiliil;
      } else if (this.IilllliIll.contains(c)) {
         return iIlllIIiIllllIIi.iIiIiiliil;
      } else if (this.illllliIll.contains(c)) {
         return iIlllIIiIllllIIi.liiiIIllIl(this.lllllliIll.get(c).iliIiiliiiii());
      } else {
         return this.lllllliIll.containsKey(c) ? iIlllIIiIllllIIi.iliIiiliil : this.IllllliIll.IliIlllilIi(c);
      }
   }

   @Override
   public List<IIlIIIilIlIIIi> iIlIlllllill(lIiliiliIiliil c) {
      return !this.liillliIll.lIiiIiIlilli().contains(c)
            && !this.liillliIll.IilliliilIIi().contains(c)
            && !this.lilllliIll.contains(c)
            && !this.IilllliIll.contains(c)
            && !this.illllliIll.contains(c)
            && !this.lllllliIll.containsKey(c)
         ? this.IllllliIll.iIlIlllllill(c)
         : this.IliIlllilIi(c);
   }

   @Override
   public boolean IIIllIIliIIl(lIiliiliIiliil c) {
      return this.IIIIllIIIl(c);
   }

   boolean Iiiiliiiiiii(lIiliiliIiliil except, lIiliiliIiliil c) {
      long var5 = -1721118300838372805L;

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 6; var7 += 4294967296L) {
         lIiliiliIiliil var4 = except.iliIiiliiiii((int)(var7 >>> 32));
         if (!var4.equals(c) && !this.IliIlllilIi(var4).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   boolean IIIIllIIIl(lIiliiliIiliil c) {
      if (this.liillliIll.lIiiIiIlilli().contains(c)) {
         return false;
      } else if (this.liillliIll.IilliliilIIi().contains(c)) {
         return true;
      } else {
         return this.lilllliIll.contains(c) ? false : this.IilllliIll.contains(c) || this.IllllliIll.IIIllIIliIIl(c);
      }
   }

   private boolean IIllllIlll(double[] p, double[] outline, lIiliiliIiliil supportIsDirt, boolean support, boolean eye) {
      long var48 = -4192122660510217076L;
      long var50 = 1664319660046710203L;
      long var52 = -1684382891733090424L;
      long var44 = 2660519366820550868L;
      long var46 = 8022163605292575537L;
      double var6 = outline[0] - p[0];
      double var8 = outline[1] - p[1];
      double var10 = outline[2] - p[2];
      double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
      if (var12 < 1.0E-9) {
         return false;
      } else {
         var44 ^= ((long)((int)Math.floor(p[0])) << 32 ^ var44) & -1L << 32;
         var44 ^= ((long)((int)Math.floor(p[1])) ^ var44) & -1L >>> 32;
         var46 ^= ((long)((int)Math.floor(p[2])) << 32 ^ var46) & -1L << 32;
         var46 ^= ((long)((int)Math.floor(outline[0] - var6 * 1.0E-7)) ^ var46) & -1L >>> 32;
         var48 ^= ((long)((int)Math.floor(outline[1] - var8 * 1.0E-7)) << 32 ^ var48) & -1L << 32;
         var48 ^= ((long)((int)Math.floor(outline[2] - var10 * 1.0E-7)) ^ var48) & -1L >>> 32;
         var50 ^= ((long)(var6 > 0.0 ? 1 : (var6 < 0.0 ? -1 : 0)) << 32 ^ var50) & -1L << 32;
         var50 ^= ((long)(var8 > 0.0 ? 1 : (var8 < 0.0 ? -1 : 0)) ^ var50) & -1L >>> 32;
         var52 ^= ((long)(var10 > 0.0 ? 1 : (var10 < 0.0 ? -1 : 0)) << 32 ^ var52) & -1L << 32;
         double var23 = (int)(var50 >>> 32) == 0
            ? Double.POSITIVE_INFINITY
            : ((double)((int)(var50 >>> 32) > 0 ? (int)(var44 >>> 32) + 1 : (int)(var44 >>> 32)) - p[0]) / var6;
         double var25 = (int)var50 == 0 ? Double.POSITIVE_INFINITY : ((double)((int)var50 > 0 ? (int)var44 + 1 : (int)var44) - p[1]) / var8;
         double var27 = (int)(var52 >>> 32) == 0
            ? Double.POSITIVE_INFINITY
            : ((double)((int)(var52 >>> 32) > 0 ? (int)(var46 >>> 32) + 1 : (int)(var46 >>> 32)) - p[2]) / var10;
         double var29 = (int)(var50 >>> 32) == 0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var6);
         double var31 = (int)var50 == 0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var8);
         double var33 = (int)(var52 >>> 32) == 0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var10);
         var52 ^= (0L ^ var52) & -1L >>> 32;

         while (true) {
            int var10000 = (int)var52;
            var52 ^= (var52 ^ var52 + (long)1) & -1L >>> 32;
            if (var10000 >= 64) {
               break;
            }

            lIiliiliIiliil var36 = new lIiliiliIiliil((int)(var44 >>> 32), (int)var44, (int)(var46 >>> 32));
            List var37 = var36.equals(supportIsDirt) && support ? iIlllIIiIllllIIi.iIiIiiliil : this.liiiIIllIl(var36);
            if (eye) {
               var37 = var36.equals(supportIsDirt) ? iIlllIIiIllllIIi.iliIiiliil : this.iIlIlllllill(var36);
            }

            for (IIlIIIilIlIIIi var39 : var37) {
               double var40 = iIlllIllll(p, var6, var8, var10, var36, var39);
               if (!(var40 < 0.0)) {
                  if (var36.equals(supportIsDirt)) {
                     if (var40 < 0.9999) {
                        return false;
                     }
                  } else if (var40 < 0.999999) {
                     return false;
                  }
               }
            }

            if ((int)(var44 >>> 32) == (int)var46 && (int)var44 == (int)(var48 >>> 32) && (int)(var46 >>> 32) == (int)var48) {
               break;
            }

            if (var23 < var25 && var23 < var27) {
               var44 ^= ((long)((int)(var44 >>> 32) + (int)(var50 >>> 32)) << 32 ^ var44) & -1L << 32;
               var23 += var29;
            } else if (var25 < var27) {
               var44 ^= ((long)((int)var44 + (int)var50) ^ var44) & -1L >>> 32;
               var25 += var31;
            } else {
               var46 ^= ((long)((int)(var46 >>> 32) + (int)(var52 >>> 32)) << 32 ^ var46) & -1L << 32;
               var27 += var33;
            }

            if (var23 > 1.000001
               && var25 > 1.000001
               && var27 > 1.000001
               && ((int)(var44 >>> 32) != (int)var46 || (int)var44 != (int)(var48 >>> 32) || (int)(var46 >>> 32) != (int)var48)) {
               lIiliiliIiliil var54 = new lIiliiliIiliil((int)var46, (int)(var48 >>> 32), (int)var48);
               List var55 = var54.equals(supportIsDirt) && support ? iIlllIIiIllllIIi.iIiIiiliil : this.liiiIIllIl(var54);
               if (eye) {
                  var55 = var54.equals(supportIsDirt) ? iIlllIIiIllllIIi.iliIiiliil : this.iIlIlllllill(var54);
               }

               Iterator var56 = var55.iterator();

               double var42;
               do {
                  if (!var56.hasNext()) {
                     return true;
                  }

                  IIlIIIilIlIIIi var41 = (IIlIIIilIlIIIi)var56.next();
                  var42 = iIlllIllll(p, var6, var8, var10, var54, var41);
               } while (!(var42 >= 0.0) || var54.equals(supportIsDirt) || !(var42 < 0.999999));

               return false;
            }
         }

         return true;
      }
   }

   lIiliiliIiliil IIiilIiiiIii(lIiliiliIiliil c) {
      return this.iilllliIll.get(c);
   }

   boolean IllIllllIl(lIiliiliIiliil target, lIiliiliIiliil stand) {
      long var17 = -1244667563241740141L;
      long var19 = 7519396563709396682L;
      long var15 = 7666002216106178493L;
      liiIililiiiIilil var3 = this.lllllliIll.get(stand);
      if (var3 != null && var3.IliIlllilIi() && Iilllilliill<"Iilllilliill","C/pfuv2eZuuo4JSP3HS1OUo9bDimQoBKs0dfT8AemuE=">().equals(var3.iIlIlllllill())) {
         if (this.iiillliIll < 0) {
            var15 ^= (0L ^ var15) & -1L << 32;

            for (liiIililiiiIilil var6 : this.lllllliIll.values()) {
               if (var6.IliIlllilIi() && Iilllilliill<"Iilllilliill","C/pfuv2eZuuo4JSP3HS1OUo9bDimQoBKs0dfT8AemuE=">().equals(var6.iIlIlllllill())) {
                  var15 += 4294967296L;
               }
            }

            this.iiillliIll = (int)(var15 >>> 32);
         }

         if (this.iiillliIll <= 8 && ++this.IIIilliIll <= 1024) {
            final HashMap var4 = new HashMap();
            ArrayDeque var21 = new ArrayDeque();
            var4.put(stand, 3);
            var21.add(stand);

            for (long var24 = var15 ^ (0L ^ var15) & -1L >>> 32;
               !var21.isEmpty() && (int)var24 < 400 && var4.size() < 256;
               var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32
            ) {
               lIiliiliIiliil var7 = (lIiliiliIiliil)var21.poll();
               lIiliiliIiliil var8 = var7.IilliliilIIi();
               if (this.IliIlllilIi(var8).isEmpty()) {
                  if (var4.getOrDefault(var8, -1) < 3) {
                     var4.put(var8, 3);
                     var21.add(var8);
                  }
               } else {
                  var17 ^= ((long)((Integer)var4.get(var7)).intValue() << 32 ^ var17) & -1L << 32;
                  if ((int)(var17 >>> 32) > 0) {
                     int[][] var10 = IIlilillIlilil.lIlillIliiIlillIli;
                     var17 ^= ((long)var10.length ^ var17) & -1L >>> 32;

                     for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < (int)var17; var19 += 4294967296L) {
                        int[] var13 = var10[(int)(var19 >>> 32)];
                        lIiliiliIiliil var14 = var7.IliIlllilIi(var13[0], 0, var13[1]);
                        if (this.IliIlllilIi(var14).isEmpty() && var4.getOrDefault(var14, -1) < (int)(var17 >>> 32) - 1) {
                           var4.put(var14, (int)(var17 >>> 32) - 1);
                           var21.add(var14);
                        }
                     }
                  }
               }
            }

            if (!var4.containsKey(target) && !var4.containsKey(target.liiiIIllIl())) {
               final Illillllil var22 = this.iiIIlIIlIl();
               Illillllil var23 = new Illillllil() {
                  @Override
                  public boolean IliIlllilIi(int y, int z, int x) {
                     return !var4.containsKey(new lIiliiliIiliil(y, z, x)) && var22.IliIlllilIi(y, z, x);
                  }

                  @Override
                  public boolean solid(int x, int z, int y) {
                     return var4.containsKey(new lIiliiliIiliil(x, z, y)) || var22.solid(x, z, y);
                  }
               };
               return iIlilIilIllilIil.IlIlllIlilIl(var23, target.IIlllIlliIll(), target.Illlllllilll(), target.Iilllilliill(), 40) <= 12;
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

   void iIIIlIlIIl(liiIililiiiIilil t) {
      this.illllliIll.add(t.liiiIIllIl());
   }

   boolean illIlIilIl(lIiliiliIiliil feet) {
      long var7 = -1537382451461782733L;
      int[][] var2 = IIlilillIlilil.lIlillIliiIlillIli;
      var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         int[] var5 = var2[(int)var10];
         lIiliiliIiliil var6 = feet.IliIlllilIi(var5[0], 0, var5[1]);
         if (this.lIiiIiIlilli(var6) || this.lIiiIiIlilli(var6.IilliliilIIi())) {
            return true;
         }

         if (this.IliIlllilIi(var6).isEmpty() && this.IliIlllilIi(var6.IilliliilIIi()).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   void llIIlilIIl(lIiliiliIiliil c) {
      this.IilllliIll.add(c);
      this.lilllliIll.remove(c);
   }

   boolean Illillliilli(lIiliiliIiliil c) {
      return this.lllllliIll.containsKey(c) && !this.illllliIll.contains(c);
   }

   void Iiilliiliiil(iiilllllIIIillll d) {
      this.liillliIll = d == null ? iiilllllIIIillll.lIIIliIill : d;
   }

   boolean liIlliiIll(double[] support, double[] p, lIiliiliIiliil eye, int face) {
      double var5 = p[0] - support[0];
      double var7 = p[1] - support[1];
      double var9 = p[2] - support[2];
      double var11 = Double.POSITIVE_INFINITY;
      IIlIIIilIlIIIi var13 = null;

      for (IIlIIIilIlIIIi var15 : this.iIlIlllllill(eye)) {
         double var16 = iIlllIllll(support, var5, var7, var9, eye, var15);
         if (var16 > 1.0E-9 && var16 < var11) {
            var11 = var16;
            var13 = var15;
         }
      }

      if (var13 == null) {
         return false;
      } else {
         int[] var19 = iiIiIIilIIliIIil.liiiIIllIl(face);
         double var20 = var19[0] > 0
            ? (double)eye.IIlllIlliIll() + var13.IilliliilIIi()
            : (
               var19[0] < 0
                  ? (double)eye.IIlllIlliIll() + var13.IliIlllilIi()
                  : (
                     var19[1] > 0
                        ? (double)eye.Illlllllilll() + var13.lIiiIiIlilli()
                        : (
                           var19[1] < 0
                              ? (double)eye.Illlllllilll() + var13.liiiIIllIl()
                              : (var19[2] > 0 ? (double)eye.Iilllilliill() + var13.iliIiiliiiii() : (double)eye.Iilllilliill() + var13.iIlIlllllill())
                        )
                  )
            );
         double var17 = var19[0] != 0 ? support[0] + var11 * var5 : (var19[1] != 0 ? support[1] + var11 * var7 : support[2] + var11 * var9);
         return Math.abs(var17 - var20) < 1.0E-6 && this.IIllllIlll(support, p, eye, false, true);
      }
   }

   @Override
   public List<IIlIIIilIlIIIi> liiiIIllIl(lIiliiliIiliil c) {
      return !this.liillliIll.lIiiIiIlilli().contains(c)
            && !this.liillliIll.IilliliilIIi().contains(c)
            && !this.lilllliIll.contains(c)
            && !this.IilllliIll.contains(c)
            && !this.illllliIll.contains(c)
            && !this.lllllliIll.containsKey(c)
         ? this.IllllliIll.liiiIIllIl(c)
         : this.IliIlllilIi(c);
   }

   @Override
   public boolean iliIiiliiiii(lIiliiliIiliil c) {
      if (this.liillliIll.IilliliilIIi().contains(c) || this.IilllliIll.contains(c)) {
         return false;
      } else if (this.illllliIll.contains(c)) {
         return this.lllllliIll.get(c).IIIllIIliIIl();
      } else {
         return this.lllllliIll.containsKey(c) ? false : this.IllllliIll.iliIiiliiiii(c);
      }
   }

   double lilIliilIl(lIiliiliIiliil c) {
      double var2 = 0.0;

      for (IIlIIIilIlIIIi var5 : this.IliIlllilIi(c)) {
         var2 = Math.max(var2, var5.lIiiIiIlilli());
      }

      return var2;
   }

   boolean IIlilIliiIli(lIiliiliIiliil partner) {
      return this.illllliIll.contains(partner) || !this.lllllliIll.containsKey(partner) && !this.IliIlllilIi(partner).isEmpty();
   }

   double[] iiiIlIIIll(lIiliiliIiliil feet, boolean sneak) {
      double var3 = (double)(feet.Illlllllilll() - 1) + this.lilIliilIl(feet.IilliliilIIi());
      double var5 = this.lilIliilIl(feet);
      if (var5 > 0.0 && var5 <= 0.26) {
         var3 = Math.max(var3, (double)feet.Illlllllilll() + var5);
      }

      return new double[]{(double)feet.IIlllIlliIll() + 0.5, var3 + (sneak ? 1.27 : 1.62), (double)feet.Iilllilliill() + 0.5};
   }

   boolean lIlIliIlIl(lIiliiliIiliil stand, lIiliiliIiliil target) {
      lllIllIiillIllIi var3 = iIlilIilIllilIil.IIillIiliIil(
         this.iiIIlIIlIl(),
         stand.IIlllIlliIll(),
         stand.Illlllllilll(),
         stand.Iilllilliill(),
         target.IIlllIlliIll(),
         target.Illlllllilll(),
         target.Iilllilliill(),
         !this.lllllliIll.containsKey(target) || !this.IllllliIll.Illlllllilll(target)
      );
      return var3.IliIlllilIi()
            && var3.IilliliilIIi() == var3.lIiiIiIlilli()
            && target.Illlllllilll() > stand.Illlllllilll()
            && this.IIIIllIIIl(stand.IilliliilIIi())
         ? false
         : var3.IliIlllilIi() || var3.IilliliilIIi() >= 40 && this.IllIllllIl(stand, target);
   }

   void IiIIlliIIl(lIiliiliIiliil c) {
      this.IilllliIll.remove(c);
      this.lilllliIll.add(c);
   }

   boolean IlIllllIll(lIiliiliIiliil c) {
      long var6 = 6569474559076206135L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 6; var8 += 4294967296L) {
         lIiliiliIiliil var3 = c.iliIiiliiiii((int)(var8 >>> 32));
         liiIililiiiIilil var4 = this.lllllliIll.get(var3);
         if (var4 != null && !this.Iilililiiili(var3)) {
            if (var4.iliIiiliiiii() != IIiIllillIiIllil.lIlilliIil) {
               return false;
            }
         } else {
            if (this.IIIIllIIIl(var3) || this.lilllliIll.contains(var3)) {
               return false;
            }

            if (!this.IllllliIll.IlIlllIlilIl(var3) && !this.IllllliIll.IiIlliIliiIl(var3)) {
               List var5 = this.IllllliIll.IliIlllilIi(var3);
               if (var5.size() != 1 || !iIlllIIiIllllIIi.lIiIiiliil.equals(var5.get(0))) {
                  return false;
               }
            } else if (!this.IllllliIll.Iilllilliill(var3)) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public List<IIlIIIilIlIIIi> Ililllililil(lIiliiliIiliil c) {
      return !this.liillliIll.lIiiIiIlilli().contains(c)
            && !this.liillliIll.IilliliilIIi().contains(c)
            && !this.lilllliIll.contains(c)
            && !this.IilllliIll.contains(c)
            && !this.illllliIll.contains(c)
            && !this.lllllliIll.containsKey(c)
         ? this.IllllliIll.Ililllililil(c)
         : List.of();
   }

   Illillllil iiIIlIIlIl() {
      return new Illillllil() {
         @Override
         public boolean solid(int y, int x, int z) {
            return !IIiiIiIllIiiIiIl.this.IliIlllilIi(new lIiliiliIiliil(y, x, z)).isEmpty();
         }

         @Override
         public boolean IliIlllilIi(int y, int z, int x) {
            lIiliiliIiliil var4 = new lIiliiliIiliil(y, z, x);
            return !IIiiIiIllIiiIiIl.this.IliIlllilIi(var4).isEmpty() && IIiiIiIllIiiIiIl.this.lilIliilIl(var4) <= 0.26 && !this.IliIlllilIi(y, z - 1, x)
               ? false
               : !IIiiIiIllIiiIiIl.this.lIiiIiIlilli(var4) && !IIiiIiIllIiiIiIl.this.Illlllllilll(var4) && !IIiiIiIllIiiIiIl.this.IliIlllilIi(var4).isEmpty();
         }
      };
   }

   boolean IiIiliIiiiIi(lIiliiliIiliil c) {
      return this.illllliIll.contains(c);
   }

   void IIIilIIiiIIi() {
      this.liillliIll = iiilllllIIIillll.lIIIliIill;
   }

   boolean Iilililiiili(lIiliiliIiliil c) {
      return this.iilllliIll.containsKey(c);
   }

   @Override
   public boolean IilliliilIIi(lIiliiliIiliil c) {
      if (this.liillliIll.lIiiIiIlilli().contains(c)
         || this.liillliIll.IilliliilIIi().contains(c)
         || this.lilllliIll.contains(c)
         || this.IilllliIll.contains(c)) {
         return false;
      } else if (this.illllliIll.contains(c)) {
         return this.lllllliIll.get(c).IliIlllilIi();
      } else {
         return this.lllllliIll.containsKey(c) ? false : this.IllllliIll.IilliliilIIi(c);
      }
   }

   boolean ilIllIiIll(double[] eye, double[] supportIsDirt, lIiliiliIiliil p, boolean support) {
      return this.IIllllIlll(eye, supportIsDirt, p, support, false);
   }

   @Override
   public boolean Illlllllilll(lIiliiliIiliil c) {
      if (!this.IllllliIll.Illlllllilll(c)) {
         return false;
      } else {
         return this.liillliIll.lIiiIiIlilli().contains(c)
               || this.liillliIll.IilliliilIIi().contains(c)
               || this.lilllliIll.contains(c)
               || this.IilllliIll.contains(c)
            ? false
            : !this.lllllliIll.containsKey(c) || this.illllliIll.contains(c);
      }
   }

   boolean IIiIllIiIl(lIiliiliIiliil c) {
      return !this.IilliliilIIi(c) && !this.iIiIlIliIl(c) && !this.lIiiIiIlilli(c) && this.IliIlllilIi(c).isEmpty();
   }

   @Override
   public boolean lIiiIiIlilli(lIiliiliIiliil c) {
      return !this.liillliIll.lIiiIiIlilli().contains(c)
            && !this.liillliIll.IilliliilIIi().contains(c)
            && !this.lilllliIll.contains(c)
            && !this.IilllliIll.contains(c)
            && !this.lllllliIll.containsKey(c)
         ? this.IllllliIll.lIiiIiIlilli(c)
         : false;
   }

   @Override
   public boolean IIlllIlliIll(lIiliiliIiliil b) {
      return this.IllllliIll.IIlllIlliIll(b);
   }

   @Override
   public boolean IlIlllIlilIl(lIiliiliIiliil c) {
      return !this.lllllliIll.containsKey(c) && !this.illllliIll.contains(c) && !this.IilllliIll.contains(c) ? this.IllllliIll.IlIlllIlilIl(c) : false;
   }

   boolean iIiIlIliIl(lIiliiliIiliil c) {
      return this.lllllliIll.containsKey(c)
         && !this.illllliIll.contains(c)
         && !this.IilllliIll.contains(c)
         && !this.lilllliIll.contains(c)
         && !this.liillliIll.lIiiIiIlilli().contains(c)
         && !this.liillliIll.IilliliilIIi().contains(c)
         && this.IllllliIll.IilliliilIIi(c);
   }

   @Override
   public boolean IiIlliIliiIl(lIiliiliIiliil c) {
      return !this.lllllliIll.containsKey(c) && !this.illllliIll.contains(c) && !this.IilllliIll.contains(c) ? this.IllllliIll.IiIlliIliiIl(c) : false;
   }
}
