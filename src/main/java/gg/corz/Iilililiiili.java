package gg.corz;

public interface Iilililiiili {
   int Illlllllllll = 960;
   int illlllIillll = 540;
   int lIlllliIllll = 2;
   int IIillllIilll = 384;
   int lilllliillll = 680;

   static int IliIlllilIi(int framebufferH, int framebufferW) {
      long var3 = -8653224090449750116L;
      var3 ^= ((long)((int)Math.round(Math.min((double)framebufferH / 960.0, (double)framebufferW / 540.0))) << 32 ^ var3) & -1L << 32;

      while ((int)(var3 >>> 32) > 2 && (framebufferH / (int)(var3 >>> 32) < 680 || framebufferW / (int)(var3 >>> 32) < 384)) {
         var3 += -4294967296L;
      }

      return Math.max(2, (int)(var3 >>> 32));
   }
}
