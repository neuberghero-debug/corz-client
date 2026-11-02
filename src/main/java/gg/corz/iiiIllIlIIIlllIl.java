package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import net.minecraft.class_1923;
import net.minecraft.class_238;

final class iiiIllIlIIIlllIl {
   int IlllliIiIl;
   final int iiIlliIiIl;
   long iIllliIiIl;
   final int IIllliIiIl;
   final long liIlliIiIl;
   class_238 illlliIiIl;
   long llllliIiIl = -1L;
   GpuBuffer lIllliIiIl;

   iiiIllIlIIIlllIl(long key) {
      this.liIlliIiIl = key;
      this.iiIlliIiIl = class_1923.method_8325(key);
      this.IIllliIiIl = class_1923.method_8332(key);
   }

   int IliIlllilIi() {
      return this.iiIlliIiIl * 64;
   }

   int liiiIIllIl() {
      return this.IIllliIiIl * 64;
   }
}
