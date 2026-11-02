package gg.corz;

import net.minecraft.class_2680;

public final class IlilIlllilIl {
   private IlilIlllilIl() {
   }

   public static IIiillIllIiillIl IliIlllilIi(IilIlllllilIllll walk) {
      IIiIillIiIil var1 = new IIiIillIiIil();
      if (walk != null) {
         walk.emit(var1::IliIlllilIi);
      }

      return new IIiillIllIiillIl(var1.iIlIlllllill(), var1.liiiIIllIl());
   }

   public static IIiillIllIiillIl liiiIIllIl(iIilliIlIlilliIl s) {
      return s == null
         ? new IIiillIllIiillIl(0L, 0)
         : IliIlllilIi(
            sink -> {
               long var11 = -1967238499918470135L;
               long var13 = -6631435894901484495L;
               long var15 = 5195355864266714591L;

               for (IiliIIIililiIIIi var3 : s.IIIliiiIll) {
                  var11 ^= ((long)var3.iIlIlllllill() << 32 ^ var11) & -1L << 32;
                  var11 ^= ((long)var3.IilliliilIIi() ^ var11) & -1L >>> 32;
                  var13 ^= ((long)var3.lIiiIiIlilli() << 32 ^ var13) & -1L << 32;

                  for (var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 < var3.liIIIlliil; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
                     var15 ^= (0L ^ var15) & -1L << 32;

                     while ((int)(var15 >>> 32) < var3.iiIIIlliil) {
                        for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < var3.IiIIIlliil; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
                           class_2680 var10 = var3.IIIllIIliIIl((int)var15, (int)var13, (int)(var15 >>> 32));
                           if (var10 != null && !var10.method_26215()) {
                              sink.cell(
                                 (int)(var11 >>> 32) + (int)var15,
                                 (int)var11 + (int)var13,
                                 (int)(var13 >>> 32) + (int)(var15 >>> 32),
                                 var10.toString().hashCode()
                              );
                           }
                        }

                        var15 += 4294967296L;
                     }
                  }
               }
            }
         );
   }
}
