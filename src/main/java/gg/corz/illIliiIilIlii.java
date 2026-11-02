package gg.corz;

import java.util.Arrays;
import java.util.Random;

public final class illIliiIilIlii {
   private static final int ililiIiIIl = 5;
   private static final int IIiliIiIIl = 0;
   private static final int lIiliIiIIl = 1;
   private final long[] iIliiIiIIl;
   private static final int IiIiiIiIIl = 3;
   private long IiliiIiIIl;
   private final Random iiIiiIiIIl;
   private static final int llIiiIiIIl = 6;
   private final boolean[] IIliiIiIIl = new boolean[7];
   private static final int[] iIIiiIiIIl = new int[]{0, 1, 2, 3, 6, 4, 5};
   private static final int[] iiiliIiIIl = new int[]{2, 2, 3, 3, 1, 3, 2};
   private static final int liiliIiIIl = 7;
   private static final int IliliIiIIl = 3;
   private final long[] IlliiIiIIl;
   public static final int lilliIiIIl = 20;
   private static final long liIiiIiIIl = 1048576L;
   private static final int[] IIIiiIiIIl = new int[]{1, 1, 1, 1, 1, 2, 1};
   private static final int iIiliIiIIl = 2;
   private static final int IlIiiIiIIl = 3;
   private static final int ilIiiIiIIl = 1;
   private static final int[] lIIiiIiIIl = new int[]{6, 4, 5, 0, 1, 2, 3};
   private static final int lliliIiIIl = 4;
   private final int[] llliiIiIIl;
   private final int[] illiiIiIIl;
   private final boolean[] lIliiIiIIl = new boolean[7];
   public static final int IilliIiIIl = 12;
   private static final int IiiliIiIIl = 6;
   public static final int iilliIiIIl = 4;

   public int lIiiIiIlilli() {
      long var6 = 4135917580267587301L;
      long var8 = -7673606311838264169L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.illiiIiIIl;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static boolean[] Iilllilliill(liIiIIiiiIiIIi k) {
      long var16 = -5987999097979055366L;
      long var10 = -6943281196497491663L;
      long var12 = 1850880969023253488L;
      long var14 = -1239231696358974763L;
      if (k instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = k;

         label65: {
            label71: {
               try {
                  var40 = var10000.IliIlllilIi();
               } catch (Throwable var24) {
                  var39 = var24;
                  boolean var10001 = false;
                  break label71;
               }

               var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
               var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
               var10000 = k;

               try {
                  var42 = var10000.liiiIIllIl();
               } catch (Throwable var23) {
                  var39 = var23;
                  boolean var53 = false;
                  break label71;
               }

               var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
               var10000 = k;

               try {
                  var44 = var10000.iIlIlllllill();
               } catch (Throwable var22) {
                  var39 = var22;
                  boolean var54 = false;
                  break label71;
               }

               var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
               var10000 = k;

               try {
                  var46 = var10000.IilliliilIIi();
               } catch (Throwable var21) {
                  var39 = var21;
                  boolean var55 = false;
                  break label71;
               }

               var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
               var10000 = k;

               try {
                  var48 = var10000.lIiiIiIlilli();
               } catch (Throwable var20) {
                  var39 = var20;
                  boolean var56 = false;
                  break label71;
               }

               var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
               var10000 = k;

               try {
                  var50 = var10000.iliIiiliiiii();
               } catch (Throwable var19) {
                  var39 = var19;
                  boolean var57 = false;
                  break label71;
               }

               var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
               var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
               var10000 = k;

               try {
                  var52 = var10000.IIIllIIliIIl();
                  break label65;
               } catch (Throwable var18) {
                  var39 = var18;
                  boolean var58 = false;
               }
            }

            Throwable var9 = var39;
            throw new MatchException(var9.toString(), var9);
         }

         var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new boolean[]{
            (boolean)((int)var10),
            (boolean)((int)(var12 >>> 32)),
            (boolean)((int)var12),
            (boolean)((int)(var14 >>> 32)),
            (boolean)((int)var14),
            (boolean)((int)(var16 >>> 32)),
            (boolean)((int)var16)
         };
      } else {
         return new boolean[7];
      }
   }

   public liIiIIiiiIiIIi IilliliilIIi(liIiIIiiiIiIIi urgentRelease, boolean desired, liIiIIiiiIiIIi urgent) {
      long var16 = 2651005720210657888L;
      long var12 = -6253238536277676562L;
      long var14 = 5882154056353565543L;
      this.IiliiIiIIl++;
      this.illiiIiIIl[Illlllllilll(this.IiliiIiIIl)] = 0;
      boolean[] var4 = Iilllilliill(urgentRelease);
      boolean[] var5 = Iilllilliill(urgent);

      for (var12 ^= (0L ^ var12) & -1L << 32; (int)(var12 >>> 32) < 7; var12 += 4294967296L) {
         if (var4[(int)(var12 >>> 32)] && !this.lIliiIiIIl[(int)(var12 >>> 32)]) {
            this.iIliiIiIIl[(int)(var12 >>> 32)] = this.IiliiIiIIl;
         }

         this.lIliiIiIIl[(int)(var12 >>> 32)] = var4[(int)(var12 >>> 32)];
      }

      this.iliIiiliiiii(var4, 0, 1);
      this.iliIiiliiiii(var4, 2, 3);
      if (var4[6] && (!var4[0] || var4[1])) {
         var4[6] = false;
      }

      var12 ^= ((long)(12 + (desired ? 4 : 0)) << 32 ^ var12) & -1L << 32;
      int[] var7 = lIIiiIiIIl;
      var12 ^= ((long)var7.length ^ var12) & -1L >>> 32;
      var14 ^= (0L ^ var14) & -1L << 32;

      while ((int)(var14 >>> 32) < (int)var12) {
         var14 ^= ((long)var7[(int)(var14 >>> 32)] ^ var14) & -1L >>> 32;
         if (this.IIliiIiIIl[(int)var14] && !var4[(int)var14]) {
            var16 ^= ((long)(!desired && !var5[(int)var14] ? 0 : 1) << 32 ^ var16) & -1L << 32;
            if (((int)(var16 >>> 32) != 0 || this.IiIlliIliiIl((int)var14) >= (long)this.llliiIiIIl[(int)var14])
               && ((int)var14 != 0 || !this.IIliiIiIIl[6])
               && this.lIiiIiIlilli() < ((int)(var16 >>> 32) != 0 ? 16 : (int)(var12 >>> 32))) {
               this.IlIlllIlilIl((int)var14, false);
            }
         }

         var14 += 4294967296L;
      }

      var7 = iIIiiIiIIl;
      var12 ^= ((long)var7.length ^ var12) & -1L >>> 32;
      var14 ^= (0L ^ var14) & -1L << 32;

      while ((int)(var14 >>> 32) < (int)var12) {
         var14 ^= ((long)var7[(int)(var14 >>> 32)] ^ var14) & -1L >>> 32;
         if (!this.IIliiIiIIl[(int)var14] && var4[(int)var14] && (desired || this.IiIlliIliiIl((int)var14) >= (long)IIIiiIiIIl[(int)var14])) {
            var16 ^= ((long)IIlllIlliIll((int)var14) << 32 ^ var16) & -1L << 32;
            if (((int)(var16 >>> 32) < 0 || !this.IIliiIiIIl[(int)(var16 >>> 32)])
               && ((int)var14 != 6 || this.IIliiIiIIl[0] && !this.IIliiIiIIl[1])
               && this.lIiiIiIlilli() < (int)(var12 >>> 32)) {
               this.IlIlllIlilIl((int)var14, true);
               this.llliiIiIIl[(int)var14] = this.IIIllIIliIIl((int)var14);
            }
         }

         var14 += 4294967296L;
      }

      return new liIiIIiiiIiIIi(
         this.IIliiIiIIl[0], this.IIliiIiIIl[1], this.IIliiIiIIl[2], this.IIliiIiIIl[3], this.IIliiIiIIl[4], this.IIliiIiIIl[5], this.IIliiIiIIl[6]
      );
   }

   private static boolean[] IIillIiliIil(boolean[] k) {
      if (k[0] && k[1]) {
         k[0] = false;
         k[1] = false;
      }

      if (k[2] && k[3]) {
         k[2] = false;
         k[3] = false;
      }

      if (k[6] && (!k[0] || k[1])) {
         k[6] = false;
      }

      return k;
   }

   private void iliIiiliiiii(boolean[] a, int want, int b) {
      if (a[want] && a[b]) {
         if (this.iIliiIiIIl[want] > this.iIliiIiIIl[b]) {
            a[b] = false;
         } else if (this.iIliiIiIIl[b] > this.iIliiIiIIl[want]) {
            a[want] = false;
         } else if (this.IIliiIiIIl[want] && !this.IIliiIiIIl[b]) {
            a[b] = false;
         } else if (this.IIliiIiIIl[b] && !this.IIliiIiIIl[want]) {
            a[want] = false;
         } else {
            a[want] = false;
            a[b] = false;
         }
      }
   }

   private static int IIlllIlliIll(int k) {
      return switch (k) {
         case 0 -> 1;
         case 1 -> 0;
         case 2 -> 3;
         case 3 -> 2;
         default -> -1;
      };
   }

   private int IIIllIIliIIl(int k) {
      if (k == 2 || k == 3) {
         return 3 + this.iiIiiIiIIl.nextInt(4);
      } else {
         return k == 4 ? 1 + this.iiIiiIiIIl.nextInt(3) : iiiliIiIIl[k];
      }
   }

   private void IlIlllIlilIl(int state, boolean k) {
      this.IIliiIiIIl[state] = k;
      this.IlliiIiIIl[state] = this.IiliiIiIIl;
      this.illiiIiIIl[Illlllllilll(this.IiliiIiIIl)]++;
   }

   public illIliiIilIlii(Random rnd) {
      this.iIliiIiIIl = new long[7];
      this.IlliiIiIIl = new long[7];
      this.llliiIiIIl = new int[7];
      this.illiiIiIIl = new int[20];
      this.iiIiiIiIIl = rnd != null ? rnd : new Random();
      this.IliIlllilIi(liIiIIiiiIiIIi.lIiliiiliiIiliiili);
   }

   private static int Illlllllilll(long tick) {
      return (int)Math.floorMod(tick, 20L);
   }

   private long IiIlliIliiIl(int k) {
      return this.IiliiIiIIl - this.IlliiIiIIl[k];
   }

   public void IliIlllilIi(liIiIIiiiIiIIi current) {
      long var4 = -1416672549884032723L;
      Arrays.fill(this.illiiIiIIl, 0);
      boolean[] var2 = IIillIiliIil(Iilllilliill(current));

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 7; var6 += 4294967296L) {
         this.IIliiIiIIl[(int)(var6 >>> 32)] = var2[(int)(var6 >>> 32)];
         this.lIliiIiIIl[(int)(var6 >>> 32)] = var2[(int)(var6 >>> 32)];
         this.iIliiIiIIl[(int)(var6 >>> 32)] = this.IiliiIiIIl - 1048576L;
         this.IlliiIiIIl[(int)(var6 >>> 32)] = this.IiliiIiIIl - 1048576L;
         this.llliiIiIIl[(int)(var6 >>> 32)] = iiiliIiIIl[(int)(var6 >>> 32)];
      }
   }

   void liiiIIllIl(liIiIIiiiIiIIi current) {
      long var4 = -9205897046666942134L;
      boolean[] var2 = IIillIiliIil(Iilllilliill(current));

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 7; var6 += 4294967296L) {
         if (this.IIliiIiIIl[(int)(var6 >>> 32)] != var2[(int)(var6 >>> 32)]) {
            this.IIliiIiIIl[(int)(var6 >>> 32)] = var2[(int)(var6 >>> 32)];
            this.lIliiIiIIl[(int)(var6 >>> 32)] = var2[(int)(var6 >>> 32)];
            this.iIliiIiIIl[(int)(var6 >>> 32)] = this.IiliiIiIIl - 1048576L;
            this.IlliiIiIIl[(int)(var6 >>> 32)] = this.IiliiIiIIl - 1048576L;
            this.llliiIiIIl[(int)(var6 >>> 32)] = iiiliIiIIl[(int)(var6 >>> 32)];
         }
      }
   }

   public liIiIIiiiIiIIi iIlIlllllill(liIiIIiiiIiIIi desired, boolean urgent) {
      return this.IilliliilIIi(desired, urgent, null);
   }
}
