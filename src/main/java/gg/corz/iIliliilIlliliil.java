package gg.corz;

public final class iIliliilIlliliil {
   private long IIIIlIIiil;
   private long iiiiIIIiil = Long.MIN_VALUE;

   public iIliliilIlliliil() {
      this.IIIIlIIiil = Long.MIN_VALUE;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public liIiIIiiiIiIIi liiiIIllIl(
      illIliiIilIlii sprintOff, long hadForward, liIiIIiiiIiIIi tick, boolean dwell, boolean sprinting, boolean desired, boolean urgent, int sprintWindow
   ) {
      long var33 = -9200167004670573893L;
      long var23 = -2223568852285330048L;
      long var25 = 7529334122812098356L;
      long var27 = 6417633396720711555L;
      long var29 = -7957338926689443853L;
      long var31 = -4173107819682463948L;
      if (this.IIIIlIIiil != hadForward - 1L && urgent) {
         this.iiiiIIIiil = Math.max(this.iiiiIIIiil, hadForward - 1L);
      }

      liIiIIiiiIiIIi var10 = tick != null ? tick : liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      var23 ^= ((long)(sprinting && desired ? 1 : 0) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)(sprinting && !urgent && this.iIlIlllllill(hadForward, sprintWindow) ? 1 : 0) ^ var23) & -1L >>> 32;
      var25 ^= ((long)((int)(var23 >>> 32) == 0 && (int)var23 == 0 ? 0 : 1) << 32 ^ var25) & -1L << 32;
      if (sprinting && var10 instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = var10;

         label108: {
            label133: {
               try {
                  var59 = var10000.IliIlllilIi();
               } catch (Throwable var41) {
                  var58 = var41;
                  boolean var10001 = false;
                  break label133;
               }

               var25 ^= ((long)var59 ^ var25) & -1L >>> 32;
               var27 ^= ((long)((int)var25) << 32 ^ var27) & -1L << 32;
               var10000 = var10;

               try {
                  var61 = var10000.liiiIIllIl();
               } catch (Throwable var40) {
                  var58 = var40;
                  boolean var72 = false;
                  break label133;
               }

               var25 ^= ((long)var61 ^ var25) & -1L >>> 32;
               var27 ^= ((long)((int)var25) ^ var27) & -1L >>> 32;
               var10000 = var10;

               try {
                  var63 = var10000.iIlIlllllill();
               } catch (Throwable var39) {
                  var58 = var39;
                  boolean var73 = false;
                  break label133;
               }

               var25 ^= ((long)var63 ^ var25) & -1L >>> 32;
               var29 ^= ((long)((int)var25) << 32 ^ var29) & -1L << 32;
               var10000 = var10;

               try {
                  var65 = var10000.IilliliilIIi();
               } catch (Throwable var38) {
                  var58 = var38;
                  boolean var74 = false;
                  break label133;
               }

               var25 ^= ((long)var65 ^ var25) & -1L >>> 32;
               var29 ^= ((long)((int)var25) ^ var29) & -1L >>> 32;
               var10000 = var10;

               try {
                  var67 = var10000.lIiiIiIlilli();
               } catch (Throwable var37) {
                  var58 = var37;
                  boolean var75 = false;
                  break label133;
               }

               var25 ^= ((long)var67 ^ var25) & -1L >>> 32;
               var31 ^= ((long)((int)var25) << 32 ^ var31) & -1L << 32;
               var10000 = var10;

               try {
                  var69 = var10000.iliIiiliiiii();
               } catch (Throwable var36) {
                  var58 = var36;
                  boolean var76 = false;
                  break label133;
               }

               var25 ^= ((long)var69 ^ var25) & -1L >>> 32;
               var31 ^= ((long)((int)var25) ^ var31) & -1L >>> 32;
               var10000 = var10;

               try {
                  var71 = var10000.IIIllIIliIIl();
                  break label108;
               } catch (Throwable var35) {
                  var58 = var35;
                  boolean var77 = false;
               }
            }

            Throwable var15 = var58;
            throw new MatchException(var15.toString(), var15);
         }

         var25 ^= ((long)var71 ^ var25) & -1L >>> 32;
         var33 ^= ((long)((int)var25) << 32 ^ var33) & -1L << 32;
         var10 = new liIiIIiiiIiIIi(
            (int)(var27 >>> 32) != 0 && (int)(var25 >>> 32) == 0,
            (boolean)((int)var27),
            (boolean)((int)(var29 >>> 32)),
            (boolean)((int)var29),
            (boolean)((int)(var31 >>> 32)),
            (boolean)((int)var31),
            false
         );
      }

      liIiIIiiiIiIIi var14 = sprintOff.IilliliilIIi(
         var10, dwell, new liIiIIiiiIiIIi((boolean)((int)(var25 >>> 32)), false, false, false, false, false, sprinting)
      );
      if (var14.IliIlllilIi() && !var14.liiiIIllIl() && !urgent) {
         this.iiiiIIIiil = hadForward;
      }

      this.IIIIlIIiil = hadForward;
      return var14;
   }

   public boolean iIlIlllllill(long tick, int sprintWindow) {
      return this.iiiiIIIiil != Long.MIN_VALUE && tick - this.iiiiIIIiil < (long)sprintWindow;
   }

   public void IliIlllilIi() {
      this.iiiiIIIiil = Long.MIN_VALUE;
      this.IIIIlIIiil = Long.MIN_VALUE;
   }
}
