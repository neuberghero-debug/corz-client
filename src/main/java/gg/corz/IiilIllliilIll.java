package gg.corz;

import java.util.ArrayList;

public final class IiilIllliilIll {
   public static final int[][] lIIllIliliIIllIlil = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
   private IilliIillilliIil IllIlIlillllIlIlil = IilliIillilliIil.lIllIilIil;
   private int lilIlIliliilIlIlil;
   public static final int llIIlIlililIIlIlil = 4;
   private static final double[] IlIllIlilllIllIlil = new double[]{0.5, 0.5, 0.5};
   public static final int iliiIIlilIiiiIIlil = 0;
   public static final int iiIIlIlilIIlIlIlil = 1;
   private int IIiIlIlillIiIlIlil;
   public static final int liiiIIliliiiiIIlil = 1;
   public static final int IIIIlIlillIIIlIlil = 2;
   public static final int lIlIlIliliIlIlIlil = 12;
   private int illIlIlilIilIlIlil;
   private String iiiIlIlilIIIllIlil = "";
   private int iIiIlIlilIliIlIlil;
   public static final int iIIIlIlilIlIIlIlil = 3;
   private boolean IiiIlIlilliiIlIlil;
   private boolean lliIlIlililiIlIlil;
   private static final double[][] IIlllIlillIlllIlil = new double[][]{
      {0.0, -1.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, -1.0}, {0.0, 0.0, 1.0}, {-1.0, 0.0, 0.0}, {1.0, 0.0, 0.0}
   };
   public static final double liIllIliliiIllIlil = 0.1;
   private static final double ilIllIlilIiIllIlil = 1.0E-7;
   public static final int IiIIlIlilliIIlIlil = 5;

   static double[][] IIillIiliIil(double[] box) {
      double var1 = box[3] - box[0];
      double var3 = box[4] - box[1];
      double var5 = box[5] - box[2];
      if (!(var1 <= 0.0) && !(var3 <= 0.0) && !(var5 <= 0.0)) {
         double var7 = 1.0 / (var1 * 2.0 + 1.0);
         double var9 = 1.0 / (var3 * 2.0 + 1.0);
         double var11 = 1.0 / (var5 * 2.0 + 1.0);
         double var13 = (1.0 - Math.floor(1.0 / var7) * var7) / 2.0;
         double var15 = (1.0 - Math.floor(1.0 / var11) * var11) / 2.0;
         ArrayList var17 = new ArrayList();

         for (double var18 = 0.0; var18 <= 1.0; var18 += var7) {
            for (double var20 = 0.0; var20 <= 1.0; var20 += var9) {
               for (double var22 = 0.0; var22 <= 1.0; var22 += var11) {
                  var17.add(
                     new double[]{box[0] + (box[3] - box[0]) * var18 + var13, box[1] + (box[4] - box[1]) * var20, box[2] + (box[5] - box[2]) * var22 + var15}
                  );
               }
            }
         }

         return var17.toArray(new double[0][]);
      } else {
         return new double[0][];
      }
   }

   public static boolean IIIilIIiiIIi(double[] face, int reach, double eye) {
      if (reach >= 0 && reach < 6) {
         double[] var4 = IIlllIlillIlllIlil[reach];
         double var5 = face[0] - (0.5 + 0.5 * var4[0]);
         double var7 = face[1] - (0.5 + 0.5 * var4[1]);
         double var9 = face[2] - (0.5 + 0.5 * var4[2]);
         double var11 = var5 * var4[0] + var7 * var4[1] + var9 * var4[2];
         return var11 < 0.1 ? false : var5 * var5 + var7 * var7 + var9 * var9 <= eye * eye;
      } else {
         return false;
      }
   }

   static boolean Ililllililil(double[] by, double[] a, int b, int bz, int bx) {
      long var25 = 8873176426601403359L;
      double var5 = 0.0;
      double var7 = 1.0;
      int[] var9 = new int[]{b, bz, bx};

      for (long var27 = var25 ^ (0L ^ var25) & -1L << 32; (int)(var27 >>> 32) < 3; var27 += 4294967296L) {
         double var11 = by[(int)(var27 >>> 32)];
         double var13 = a[(int)(var27 >>> 32)] - by[(int)(var27 >>> 32)];
         double var15 = (double)var9[(int)(var27 >>> 32)];
         double var17 = (double)var9[(int)(var27 >>> 32)] + 1.0;
         if (Math.abs(var13) < 1.0E-12) {
            if (var11 <= var15 || var11 >= var17) {
               return false;
            }
         } else {
            double var19 = (var15 - var11) / var13;
            double var21 = (var17 - var11) / var13;
            if (var19 > var21) {
               double var23 = var19;
               var19 = var21;
               var21 = var23;
            }

            var5 = Math.max(var5, var19);
            var7 = Math.min(var7, var21);
            if (var5 >= var7) {
               return false;
            }
         }
      }

      return var7 - var5 > 1.0E-7;
   }

   private liIIlIiliiIIlIil Illlllllilll() {
      long var2 = 4692192673008182569L;
      var2 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil ? 1 : 0) << 32 ^ var2) & -1L << 32;
      this.IiiIlIlilliiIlIlil = this.IiiIlIlilliiIlIlil || (int)(var2 >>> 32) != 0;
      this.IllIlIlillllIlIlil = IilliIillilliIil.IillIilIil;
      this.illIlIlilIilIlIlil = 0;
      this.iIiIlIlilIliIlIlil++;
      return (int)(var2 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
   }

   public liIIlIiliiIIlIil IIIllIIliIIl(ilIiliIlIiIiliIl s) {
      long var3 = -3633695660515804083L;
      if (s.ilIiiiiIll) {
         if (IlIlllIlilIl(this.IllIlIlillllIlIlil) && !s.IiIiiiiIll) {
            return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","5GvwuHuRviXANOkdbHlhXZ9iFWTiHYf0L/9tHaPJBqpkqUj13EAPk1l6">());
         } else {
            switch (this.IllIlIlillllIlIlil) {
               case IlllIilIil:
                  if (!s.IiIiiiiIll) {
                     return liIIlIiliiIIlIil.iilliiIIil;
                  } else if (s.liIiiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.lliIlIlililiIlIlil = true;
                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.lIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","PqVp6hh5Y3Eyg8lW/2KKVKagZpZGHj+yZtG2m9LLsPQTqIcAPrYh5g==">());
                  } else if (!s.iiIiiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","POeaHgbadmonugXEE1d7DXyMLqaaVxjal7ftlb9sD6PJnj2GRn0entJ1z6toCjNv3ZU=">());
                  } else {
                     if (!s.IIliiiiIll) {
                        return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","/R/+yakd6m3S+aAKpMmswxoNJQxMMlIpTeFShkuwVpa8HYzY88ZkSqR4QQ==">());
                     }

                     this.lliIlIlililiIlIlil = true;
                     this.IiIlliIliiIl(IilliIillilliIil.iIllIilIil);
                     return liIIlIiliiIIlIil.IIiliiIIil;
                  }
               case lillIilIil:
                  if (s.iIliiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.lIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","PqVp6hh5Y3Eyg8lW/2KKVKagZpZGHj+yZtG2m9LLsPQTqIcAPrYh5g==">());
                  } else if (!s.iiIiiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","POeaHgbadmonugXEE1d7DXyMLqaaVxjal7ftlb9sD6PJnj2GRn0entJ1z6toCjNv3ZU=">());
                  } else if (!s.IIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","/R/+yakd6m3S+aAKpMmswxoNJQxMMlIpTeFShkuwVpa8HYzY88ZkSqR4QQ==">());
                  } else {
                     if (!s.illiiiiIll) {
                        if (++this.illIlIlilIilIlIlil > 12) {
                           return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","xVfGFJ7SmQ6HHYJX3anurJG50nUZHEKlV3QKRzWKPyPED2izq0hR">());
                        }

                        return liIIlIiliiIIlIil.IIiliiIIil;
                     }

                     this.IIiIlIlillIiIlIlil++;
                     this.IiIlliIliiIl(IilliIillilliIil.IlllIilIil);
                     return liIIlIiliiIIlIil.lIiliiIIil;
                  }
               case llllIilIil:
                  if (s.iIliiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.IlliiiiIll && ++this.illIlIlilIilIlIlil < s.liliiiiIll) {
                     return liIIlIiliiIIlIil.iilliiIIil;
                  } else {
                     if (this.lilIlIliliilIlIlil < 1 && s.lIliiiiIll && s.iiIiiiiIll && s.IIliiiiIll) {
                        this.lilIlIliliilIlIlil++;
                        this.IiIlliIliiIl(IilliIillilliIil.iIllIilIil);
                        return liIIlIiliiIIlIil.iilliiIIil;
                     }

                     return this.IIlllIlliIll(
                        s.IlliiiiIll
                           ? Iilililiiili<"Iilililiiili","vY+vyCfJBdtIqUmdZKucmLvGTWly2kZxGcLJvKnKdP1Zz6/42x4U7YETzk1/">()
                           : Iilililiiili<"Iilililiiili","V4FoaBcCHCOzqWd/5vPeJLhb8qoUg9rRgxlVvU2BCoop1UZ5r3FKLdlWe6L1TLrg">()
                     );
                  }
               case IillIilIil:
                  if (!s.IiliiiiIll) {
                     if (!s.IiIiiiiIll) {
                        return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","5GvwuHuRviXANOkdbHlhXZ9iFWTiHYf0L/9tHaPJBqpkqUj13EAPk1l6">());
                     }

                     if (++this.illIlIlilIilIlIlil > 12) {
                        return this.IIlllIlliIll(Iilililiiili<"Iilililiiili","xVfGFJ7SmQ6HHYJX3anurJG50nUZHEKlV3QKRzWKPyPED2izq0hR">());
                     }

                     return liIIlIiliiIIlIil.iIiliiIIil;
                  }

                  this.IiIlliIliiIl(IilliIillilliIil.illlIilIil);
                  return liIIlIiliiIIlIil.IliliiIIil;
               case lIllIilIil:
                  this.IiIlliIliiIl(IilliIillilliIil.IillIilIil);
                  if (this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil) {
                     this.IiiIlIlilliiIlIlil = true;
                     return liIIlIiliiIIlIil.lliliiIIil;
                  }

                  return liIIlIiliiIIlIil.iilliiIIil;
               case illlIilIil:
                  if (this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil) {
                     this.IiiIlIlilliiIlIlil = true;
                     return liIIlIiliiIIlIil.lliliiIIil;
                  }

                  return liIIlIiliiIIlIil.iilliiIIil;
               case iIllIilIil:
               default:
                  return liIIlIiliiIIlIil.iilliiIIil;
            }
         }
      } else {
         var3 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil && this.IllIlIlillllIlIlil != IilliIillilliIil.lIllIilIil ? 1 : 0) << 32 ^ var3)
            & -1L << 32;
         this.iliIiiliiiii();
         return (int)(var3 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
      }
   }

   public int IilliliilIIi() {
      return this.IIiIlIlillIiIlIlil;
   }

   public static int Illillliilli(boolean[] hotbarIsGlowstone) {
      long var3 = -911721362965933792L;
      var3 ^= ((long)Math.min(9, hotbarIsGlowstone.length) << 32 ^ var3) & -1L << 32;

      for (long var6 = var3 ^ (0L ^ var3) & -1L >>> 32; (int)var6 < (int)(var6 >>> 32); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         if (hotbarIsGlowstone[(int)var6]) {
            return (int)var6;
         }
      }

      return -1;
   }

   public static lIIliiiliIIliiil Iilllilliill(double[] solid, boolean[] box, boolean[] placeable) {
      long var17 = 7485627197049581438L;
      long var19 = 7115768799822087728L;
      long var21 = -4126889809932245293L;
      long var23 = -3788816965566179459L;
      long var15 = -331950229801999849L;
      var15 ^= ((long)lIIllIliliIIllIlil.length << 32 ^ var15) & -1L << 32;
      int[] var4 = new int[(int)(var15 >>> 32)];
      var15 ^= (0L ^ var15) & -1L >>> 32;
      var17 ^= (0L ^ var17) & -1L << 32;
      boolean[] var7 = new boolean[(int)(var15 >>> 32)];
      double[][] var8 = IIillIiliIil(solid);
      var17 ^= ((long)var8.length ^ var17) & -1L >>> 32;
      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < (int)var17) {
         double[] var11 = var8[(int)(var19 >>> 32)];
         var19 ^= (0L ^ var19) & -1L >>> 32;
         var21 ^= (0L ^ var21) & -1L << 32;
         var21 ^= (0L ^ var21) & -1L >>> 32;

         while ((int)var21 < (int)(var15 >>> 32)) {
            var7[(int)var21] = Ililllililil(var11, IlIllIlilllIllIlil, lIIllIliliIIllIlil[(int)var21][0], 0, lIIllIliliIIllIlil[(int)var21][1]);
            var19 ^= ((long)((int)var19 | var7[(int)var21]) ^ var19) & -1L >>> 32;
            var21 ^= ((long)((int)(var21 >>> 32) | (var7[(int)var21] && box[(int)var21] ? 1 : 0)) << 32 ^ var21) & -1L << 32;
            var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32;
         }

         if ((int)var19 != 0) {
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
            if ((int)(var21 >>> 32) != 0) {
               var17 += 4294967296L;
            } else {
               for (var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var15 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                  if (var7[(int)var21] && placeable[(int)var21] && !box[(int)var21]) {
                     var4[(int)var21]++;
                  }
               }
            }
         }

         var19 += 4294967296L;
      }

      var23 ^= (-4294967296L ^ var23) & -1L << 32;

      for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var15 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         if (var4[(int)var17] > 0 && ((int)(var23 >>> 32) == -1 || var4[(int)var17] > var4[(int)(var23 >>> 32)])) {
            var23 ^= ((long)((int)var17) << 32 ^ var23) & -1L << 32;
         }
      }

      return new lIIliiiliIIliiil((int)(var23 >>> 32), (int)(var23 >>> 32) == -1 ? 0 : var4[(int)(var23 >>> 32)], (int)var15, (int)(var17 >>> 32));
   }

   public static int IlIillIiilIi(double[] reach, double[] eye, double look) {
      long var10 = -2843649431997593424L;
      var10 ^= (-4294967296L ^ var10) & -1L << 32;
      double var5 = -2.0;

      for (var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < 6; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         if (IIIilIIiiIIi(reach, (int)var10, look)) {
            double var8 = IIlilIliiIli(reach, eye, IIlllIlillIlllIlil[(int)var10]);
            if (var8 > var5) {
               var5 = var8;
               var10 ^= ((long)((int)var10) << 32 ^ var10) & -1L << 32;
            }
         }
      }

      return (int)(var10 >>> 32);
   }

   public IilliIillilliIil IliIlllilIi() {
      return this.IllIlIlillllIlIlil;
   }

   public static int Iiilliiliiil(int dir) {
      switch (dir) {
         case 0:
            return 1;
         case 1:
            return 0;
         case 2:
            return 3;
         case 3:
            return 2;
         case 4:
            return 5;
         case 5:
            return 4;
         default:
            return dir;
      }
   }

   public String liiiIIllIl() {
      return this.iiiIlIlilIIIllIlil;
   }

   public int iIlIlllllill() {
      return this.lilIlIliliilIlIlil;
   }

   private static double IIlilIliiIli(double[] eye, double[] look, double[] n) {
      double var3 = 0.5 + 0.5 * n[0] - eye[0];
      double var5 = 0.5 + 0.5 * n[1] - eye[1];
      double var7 = 0.5 + 0.5 * n[2] - eye[2];
      double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
      double var11 = Math.sqrt(look[0] * look[0] + look[1] * look[1] + look[2] * look[2]);
      return !(var9 < 1.0E-9) && !(var11 < 1.0E-9) ? (var3 * look[0] + var5 * look[1] + var7 * look[2]) / (var9 * var11) : -1.0;
   }

   private static boolean IlIlllIlilIl(IilliIillilliIil s) {
      return s == IilliIillilliIil.iIllIilIil || s == IilliIillilliIil.IlllIilIil;
   }

   public int lIiiIiIlilli() {
      return this.iIiIlIlilIliIlIlil;
   }

   private liIIlIiliiIIlIil IIlllIlliIll(String reason) {
      long var3 = 325927817359126711L;
      this.iiiIlIlilIIIllIlil = reason;
      var3 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil ? 1 : 0) << 32 ^ var3) & -1L << 32;
      this.IiiIlIlilliiIlIlil = this.IiiIlIlilliiIlIlil || (int)(var3 >>> 32) != 0;
      this.IllIlIlillllIlIlil = IilliIillilliIil.lillIilIil;
      this.illIlIlilIilIlIlil = 0;
      this.iIiIlIlilIliIlIlil++;
      return (int)(var3 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
   }

   public void iliIiiliiiii() {
      this.IllIlIlillllIlIlil = IilliIillilliIil.lIllIilIil;
      this.illIlIlilIilIlIlil = 0;
      this.lilIlIliliilIlIlil = 0;
      this.IIiIlIlillIiIlIlil = 0;
      this.iIiIlIlilIliIlIlil = 0;
      this.lliIlIlililiIlIlil = false;
      this.IiiIlIlilliiIlIlil = false;
      this.iiiIlIlilIIIllIlil = "";
   }

   public static int IiIiliIiiiIi(boolean[] look, int reach, double[] anchorDir, double[] eye, double neighborSolid) {
      long var14 = -171151089260271415L;
      var14 ^= (-4294967296L ^ var14) & -1L << 32;
      double var7 = -2.0;

      for (var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         if ((int)var14 != reach && (int)var14 < look.length && look[(int)var14]) {
            double[] var10 = IIlllIlillIlllIlil[(int)var14];
            double[] var11 = new double[]{anchorDir[0] - var10[0], anchorDir[1] - var10[1], anchorDir[2] - var10[2]};
            if (IIIilIIiiIIi(var11, Iiilliiliiil((int)var14), neighborSolid)) {
               double var12 = IIlilIliiIli(anchorDir, eye, var10);
               if (var12 > var7) {
                  var7 = var12;
                  var14 ^= ((long)((int)var14) << 32 ^ var14) & -1L << 32;
               }
            }
         }
      }

      return (int)(var14 >>> 32);
   }

   private void IiIlliIliiIl(IilliIillilliIil next) {
      this.IllIlIlillllIlIlil = next;
      this.illIlIlilIilIlIlil = 0;
      this.iIiIlIlilIliIlIlil++;
   }
}
