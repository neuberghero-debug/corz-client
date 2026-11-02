package gg.corz;

import java.util.Arrays;

final class llllIililllIil {
   final int IIIlIIiIilIIlIIiIi;
   final int[] llIlIIiIiilIlIIiIi;
   final int[] IiIlIIiIiliIlIIiIi;
   final IillIillillIil iiIlIIiIiIIllIIiIi;
   final int[] lIllIIiIiiIllIIiIi = new int[3];
   final int[] iIIlIIiIiIlIlIIiIi;

   boolean has(int q, int p, int axis, int t) {
      this.lIllIIiIiiIllIIiIi[q] = p;
      this.lIllIIiIiiIllIIiIi[(q + 1) % 3] = axis;
      this.lIllIIiIiiIllIIiIi[(q + 2) % 3] = t;
      return this.iiIlIIiIiIIllIIiIi.has(this.lIllIIiIiiIllIIiIi[0], this.lIllIIiIiiIllIIiIi[1], this.lIllIIiIiiIllIIiIi[2]);
   }

   llllIililllIil(int ys, int[] zs, int[] cells, int[] count, IillIillillIil xs) {
      this.IIIlIIiIilIIlIIiIi = ys;
      this.iIIlIIiIiIlIlIIiIi = zs;
      this.llIlIIiIiilIlIIiIi = cells;
      this.IiIlIIiIiliIlIIiIi = count;
      this.iiIlIIiIiIIllIIiIi = xs;
   }

   void point(IillllIllillllIl out, int axis, int p, int t, int q) {
      this.lIllIIiIiiIllIIiIi[axis] = p;
      this.lIllIIiIiiIllIIiIi[(axis + 1) % 3] = t;
      this.lIllIIiIiiIllIIiIi[(axis + 2) % 3] = q;
      out.IliIlllilIi((float)this.lIllIIiIiiIllIIiIi[0]);
      out.IliIlllilIi((float)this.lIllIIiIiiIllIIiIi[1]);
      out.IliIlllilIi((float)this.lIllIIiIiiIllIIiIi[2]);
   }

   int coord(int axis, int i) {
      return i == 0 ? this.iIIlIIiIiIlIlIIiIi[axis] : (i == 1 ? this.llIlIIiIiilIlIIiIi[axis] : this.IiIlIIiIiliIlIIiIi[axis]);
   }

   float[] edges() {
      long var32 = 7101279614010453362L;
      long var34 = -8291172503848310018L;
      long var36 = -755852915883411333L;
      long var22 = -6855817869912835129L;
      long var38 = -7069312804197233930L;
      long var24 = 2998413581023707705L;
      long var40 = -4971017593737989223L;
      long var26 = 5849542946046502833L;
      long var28 = 8271486015667048846L;
      long var30 = -8483893736786061996L;
      IillllIllillllIl var1 = new IillllIllillllIl(this.IIIlIIiIilIIlIIiIi * 6);
      lilllIliilllIl var2 = new lilllIliilllIl(this.IIIlIIiIilIIlIIiIi * 2);
      var22 ^= (0L ^ var22) & -1L << 32;

      while ((int)(var22 >>> 32) < 3) {
         var22 ^= ((long)(((int)(var22 >>> 32) + 1) % 3) ^ var22) & -1L >>> 32;
         var24 ^= ((long)(((int)(var22 >>> 32) + 2) % 3) << 32 ^ var24) & -1L << 32;
         var2.liiiIIllIl();

         for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < this.IIIlIIiIilIIlIIiIi; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            var26 ^= ((long)this.coord((int)var24, (int)(var22 >>> 32)) << 32 ^ var26) & -1L << 32;
            var26 ^= ((long)this.coord((int)var24, (int)var22) ^ var26) & -1L >>> 32;
            var28 ^= ((long)this.coord((int)var24, (int)(var24 >>> 32)) << 32 ^ var28) & -1L << 32;

            for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 <= 1; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               var30 ^= (0L ^ var30) & -1L << 32;

               while ((int)(var30 >>> 32) <= 1) {
                  var30 ^= ((long)((int)var26 + (int)var28) ^ var30) & -1L >>> 32;
                  long var50 = var32 ^ ((long)((int)(var28 >>> 32) + (int)(var30 >>> 32)) << 32 ^ var32) & -1L << 32;
                  var32 = var50 ^ ((long)this.has((int)(var22 >>> 32), (int)(var26 >>> 32), (int)var30 - 1, (int)(var50 >>> 32) - 1) ^ var50) & -1L >>> 32;
                  long var52 = var34
                     ^ ((long)this.has((int)(var22 >>> 32), (int)(var26 >>> 32), (int)var30 - 1, (int)(var32 >>> 32)) << 32 ^ var34) & -1L << 32;
                  var34 = var52 ^ ((long)this.has((int)(var22 >>> 32), (int)(var26 >>> 32), (int)var30, (int)(var32 >>> 32) - 1) ^ var52) & -1L >>> 32;
                  var36 ^= ((long)this.has((int)(var22 >>> 32), (int)(var26 >>> 32), (int)var30, (int)(var32 >>> 32)) << 32 ^ var36) & -1L << 32;
                  var36 ^= ((long)((int)var32 == 0 && (int)(var34 >>> 32) == 0 ? (int)var30 : (int)var30 - 1) ^ var36) & -1L >>> 32;
                  var38 ^= (
                        (long)(
                                 (int)var32 != 0
                                    ? (int)(var32 >>> 32) - 1
                                    : ((int)(var34 >>> 32) != 0 ? (int)(var32 >>> 32) : ((int)var34 != 0 ? (int)(var32 >>> 32) - 1 : (int)(var32 >>> 32)))
                              )
                              << 32
                           ^ var38
                     )
                     & -1L << 32;
                  if ((int)var36 == (int)var26 && (int)(var38 >>> 32) == (int)(var28 >>> 32)) {
                     var38 ^= (
                           (long)(
                                 ((int)var32 != 0 ? 1 : 0)
                                    + ((int)(var34 >>> 32) != 0 ? 1 : 0)
                                    + ((int)var34 != 0 ? 1 : 0)
                                    + ((int)(var36 >>> 32) != 0 ? 1 : 0)
                              )
                              ^ var38
                        )
                        & -1L >>> 32;
                     var40 ^= ((long)((int)var38 != 1 && (int)var38 != 3 && ((int)var38 != 2 || (int)var32 != (int)(var36 >>> 32)) ? 0 : 1) << 32 ^ var40)
                        & -1L << 32;
                     if ((int)(var40 >>> 32) != 0) {
                        var2.IliIlllilIi((long)((int)var30) << 42 | (long)((int)(var32 >>> 32)) << 21 | (long)((int)(var26 >>> 32)));
                     }
                  }

                  var30 += 4294967296L;
               }
            }
         }

         var2.iIlIlllllill();

         for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < var2.IillilIlllillilIll; var24 ^= ((long)((int)(var32 >>> 32)) ^ var24) & -1L >>> 32) {
            long var7 = var2.llllilIllilllilIll[(int)var24];
            long var9 = var7 >>> 21;
            var30 ^= ((long)((int)(var7 & 2097151L)) << 32 ^ var30) & -1L << 32;
            var30 ^= ((long)((int)(var30 >>> 32)) ^ var30) & -1L >>> 32;

            for (var32 ^= ((long)((int)var24 + 1) << 32 ^ var32) & -1L << 32;
               (int)(var32 >>> 32) < var2.IillilIlllillilIll
                  && var2.llllilIllilllilIll[(int)(var32 >>> 32)] >>> 21 == var9
                  && (int)(var2.llllilIllilllilIll[(int)(var32 >>> 32)] & 2097151L) == (int)var30 + 1;
               var32 += 4294967296L
            ) {
               var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32;
            }

            var32 ^= ((long)((int)(var7 >>> 42)) ^ var32) & -1L >>> 32;
            var34 ^= ((long)((int)(var7 >>> 21 & 2097151L)) << 32 ^ var34) & -1L << 32;
            this.point(var1, (int)(var22 >>> 32), (int)(var30 >>> 32), (int)var32, (int)(var34 >>> 32));
            this.point(var1, (int)(var22 >>> 32), (int)var30 + 1, (int)var32, (int)(var34 >>> 32));
         }

         var22 += 4294967296L;
      }

      return var1.liiiIIllIl();
   }

   float[] faces() {
      long var32 = -8085728931493699482L;
      long var34 = 826690961048134428L;
      long var36 = -5102502356912746676L;
      long var38 = -6910418251797421005L;
      long var24 = -8551956287073921155L;
      long var40 = -1783657866098695037L;
      long var26 = -1440597724148234761L;
      long var42 = 8476136712725261197L;
      long var28 = -3675610370155516816L;
      long var44 = -5210368614747744134L;
      long var30 = 6338571337564564873L;
      lilllIliilllIl var1 = new lilllIliilllIl(this.IIIlIIiIilIIlIIiIi * 3);
      var24 ^= (0L ^ var24) & -1L << 32;

      while ((int)(var24 >>> 32) < this.IIIlIIiIilIIlIIiIi) {
         for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < 3; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            long var48 = var26 ^ ((long)(((int)var24 + 1) % 3) << 32 ^ var26) & -1L << 32;
            var26 = var48 ^ ((long)(((int)var24 + 2) % 3) ^ var48) & -1L >>> 32;
            var28 ^= ((long)this.coord((int)(var24 >>> 32), (int)var24) << 32 ^ var28) & -1L << 32;
            var28 ^= ((long)this.coord((int)(var24 >>> 32), (int)(var26 >>> 32)) ^ var28) & -1L >>> 32;
            var30 ^= ((long)this.coord((int)(var24 >>> 32), (int)var26) << 32 ^ var30) & -1L << 32;

            for (var30 ^= (0L ^ var30) & -1L >>> 32; (int)var30 <= 1; var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32) {
               var32 ^= ((long)((int)var30 == 0 ? (int)(var28 >>> 32) - 1 : (int)(var28 >>> 32) + 1) << 32 ^ var32) & -1L << 32;
               if (!this.has((int)var24, (int)(var32 >>> 32), (int)var28, (int)(var30 >>> 32))) {
                  long var11 = (long)((int)var24) * 2L + (long)((int)var30);
                  long var13 = (int)var30 == 0 ? (long)((int)(var28 >>> 32)) : (long)((int)(var28 >>> 32) + 1);
                  var1.IliIlllilIi(var11 << 58 | var13 << 38 | (long)((int)(var30 >>> 32)) << 19 | (long)((int)var28));
               }
            }
         }

         var24 += 4294967296L;
      }

      var1.iIlIlllllill();
      IillllIllillllIl var2 = new IillllIllillllIl(var1.IillilIlllillilIll * 4);
      boolean[] var3 = new boolean[64];

      for (long var49 = var26 ^ (0L ^ var26) & -1L << 32;
         (int)(var49 >>> 32) < var1.IillilIlllillilIll;
         var49 ^= ((long)((int)var28) << 32 ^ var49) & -1L << 32
      ) {
         long var5 = var1.llllilIllilllilIll[(int)(var49 >>> 32)] >>> 38;
         var28 ^= ((long)((int)(var49 >>> 32)) ^ var28) & -1L >>> 32;
         var30 ^= (9223372032559808512L ^ var30) & -1L << 32;
         var30 ^= (-2147483648L ^ var30) & -1L >>> 32;
         var32 ^= (9223372032559808512L ^ var32) & -1L << 32;

         for (var32 ^= (-2147483648L ^ var32) & -1L >>> 32;
            (int)var28 < var1.IillilIlllillilIll && var1.llllilIllilllilIll[(int)var28] >>> 38 == var5;
            var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32
         ) {
            var34 ^= ((long)((int)(var1.llllilIllilllilIll[(int)var28] & 524287L)) << 32 ^ var34) & -1L << 32;
            var34 ^= ((long)((int)(var1.llllilIllilllilIll[(int)var28] >>> 19 & 524287L)) ^ var34) & -1L >>> 32;
            if ((int)(var34 >>> 32) < (int)(var30 >>> 32)) {
               var30 ^= ((long)((int)(var34 >>> 32)) << 32 ^ var30) & -1L << 32;
            }

            if ((int)(var34 >>> 32) > (int)var30) {
               var30 ^= ((long)((int)(var34 >>> 32)) ^ var30) & -1L >>> 32;
            }

            if ((int)var34 < (int)(var32 >>> 32)) {
               var32 ^= ((long)((int)var34) << 32 ^ var32) & -1L << 32;
            }

            if ((int)var34 > (int)var32) {
               var32 ^= ((long)((int)var34) ^ var32) & -1L >>> 32;
            }
         }

         var34 ^= ((long)((int)var30 - (int)(var30 >>> 32) + 1) << 32 ^ var34) & -1L << 32;
         var34 ^= ((long)((int)var32 - (int)(var32 >>> 32) + 1) ^ var34) & -1L >>> 32;
         if (var3.length < (int)(var34 >>> 32) * (int)var34) {
            var3 = new boolean[Math.max((int)(var34 >>> 32) * (int)var34, var3.length * 2)];
         }

         Arrays.fill(var3, 0, (int)(var34 >>> 32) * (int)var34, false);
         var36 ^= ((long)((int)(var49 >>> 32)) << 32 ^ var36) & -1L << 32;

         while ((int)(var36 >>> 32) < (int)var28) {
            var36 ^= ((long)((int)(var1.llllilIllilllilIll[(int)(var36 >>> 32)] & 524287L) - (int)(var30 >>> 32)) ^ var36) & -1L >>> 32;
            var38 ^= ((long)((int)(var1.llllilIllilllilIll[(int)(var36 >>> 32)] >>> 19 & 524287L) - (int)(var32 >>> 32)) << 32 ^ var38) & -1L << 32;
            var3[(int)(var38 >>> 32) * (int)(var34 >>> 32) + (int)var36] = true;
            var36 += 4294967296L;
         }

         var36 ^= ((long)((int)(var5 >>> 20) >> 1) << 32 ^ var36) & -1L << 32;
         var36 ^= ((long)((int)(var5 & 1048575L)) ^ var36) & -1L >>> 32;
         var38 ^= (0L ^ var38) & -1L << 32;

         while ((int)(var38 >>> 32) < (int)var34) {
            for (var38 ^= (0L ^ var38) & -1L >>> 32; (int)var38 < (int)(var34 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
               if (var3[(int)(var38 >>> 32) * (int)(var34 >>> 32) + (int)var38]) {
                  var40 ^= (4294967296L ^ var40) & -1L << 32;

                  while (
                     (int)var38 + (int)(var40 >>> 32) < (int)(var34 >>> 32)
                        && var3[(int)(var38 >>> 32) * (int)(var34 >>> 32) + (int)var38 + (int)(var40 >>> 32)]
                  ) {
                     var40 += 4294967296L;
                  }

                  label123:
                  for (var40 ^= (1L ^ var40) & -1L >>> 32; (int)(var38 >>> 32) + (int)var40 < (int)var34; var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
                     for (var42 ^= (0L ^ var42) & -1L << 32; (int)(var42 >>> 32) < (int)(var40 >>> 32); var42 += 4294967296L) {
                        if (!var3[((int)(var38 >>> 32) + (int)var40) * (int)(var34 >>> 32) + (int)var38 + (int)(var42 >>> 32)]) {
                           break label123;
                        }
                     }
                  }

                  for (var42 ^= (0L ^ var42) & -1L << 32; (int)(var42 >>> 32) < (int)var40; var42 += 4294967296L) {
                     Arrays.fill(
                        var3,
                        ((int)(var38 >>> 32) + (int)(var42 >>> 32)) * (int)(var34 >>> 32) + (int)var38,
                        ((int)(var38 >>> 32) + (int)(var42 >>> 32)) * (int)(var34 >>> 32) + (int)var38 + (int)(var40 >>> 32),
                        false
                     );
                  }

                  long var62 = var42 ^ ((long)((int)var38 + (int)(var30 >>> 32)) << 32 ^ var42) & -1L << 32;
                  var42 = var62 ^ ((long)((int)(var38 >>> 32) + (int)(var32 >>> 32)) ^ var62) & -1L >>> 32;
                  long var63 = var44 ^ ((long)((int)(var42 >>> 32) + (int)(var40 >>> 32)) << 32 ^ var44) & -1L << 32;
                  var44 = var63 ^ ((long)((int)var42 + (int)var40) ^ var63) & -1L >>> 32;
                  this.point(var2, (int)(var36 >>> 32), (int)var36, (int)(var42 >>> 32), (int)var42);
                  this.point(var2, (int)(var36 >>> 32), (int)var36, (int)(var44 >>> 32), (int)var42);
                  this.point(var2, (int)(var36 >>> 32), (int)var36, (int)(var44 >>> 32), (int)var44);
                  this.point(var2, (int)(var36 >>> 32), (int)var36, (int)(var42 >>> 32), (int)var44);
               }
            }

            var38 += 4294967296L;
         }
      }

      return var2.liiiIIllIl();
   }
}
