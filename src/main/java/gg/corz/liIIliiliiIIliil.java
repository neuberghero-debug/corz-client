package gg.corz;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_640;

final class liIIliiliiIIliil {
   class_2561 IIIilIilil;
   class_2561 IlIilIilil;
   boolean iiIilIilil;
   class_2561 iIIilIilil;
   int liIilIilil;
   IliIilllliIill IiIilIilil;
   String ilIilIilil;
   class_268 lIIilIilil;
   class_124 llIilIilil;

   void liiiIIllIl(class_640 e, GameProfile prof) {
      long var5 = 7370282546072759477L;
      this.iiIilIilil = true;
      this.IIIilIilil = e.method_2971();
      this.ilIilIilil = prof.name();
      class_268 var3 = e.method_2955();
      this.lIIilIilil = var3;
      var5 ^= ((long)(var3 != null && this.IIIilIilil == null ? 1 : 0) << 32 ^ var5) & -1L << 32;
      this.iIIilIilil = (int)(var5 >>> 32) != 0 ? var3.method_1144() : null;
      this.IlIilIilil = (int)(var5 >>> 32) != 0 ? var3.method_1136() : null;
      this.llIilIilil = (int)(var5 >>> 32) != 0 ? var3.method_1202() : null;
   }

   private liIIliiliiIIliil() {
   }

   boolean IliIlllilIi(class_640 prof, GameProfile e) {
      if (this.iiIilIilil && prof.method_2971() == this.IIIilIilil && e.name() == this.ilIilIilil) {
         class_268 var3 = prof.method_2955();
         return var3 != this.lIIilIilil
            ? false
            : var3 == null
               || this.IIIilIilil != null
               || var3.method_1144() == this.iIIilIilil && var3.method_1136() == this.IlIilIilil && var3.method_1202() == this.llIilIilil;
      } else {
         return false;
      }
   }
}
