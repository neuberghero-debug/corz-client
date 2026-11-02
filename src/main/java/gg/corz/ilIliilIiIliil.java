package gg.corz;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryUtil;

final class ilIliilIiIliil {
   private ilIliilIiIliil() {
   }

   static illIIIliIilIIIli IliIlllilIi(byte[] data) {
      ByteBuffer var1 = MemoryUtil.memAlloc(data.length);

      illIIIliIilIIIli var26;
      try {
         var1.put(data).flip();
         int[] var2 = new int[1];
         long var3 = STBVorbis.stb_vorbis_open_memory(var1, var2, null);
         if (var3 == 0L) {
            throw new IOException(liiiIIllIl<"liiiIIllIl","9FcMhdCkNp3a7vcTrZodQt8u+TrerhfJFMqYqJ1DiP8fAiBznvhEr5o31g0Q">() + var2[0]);
         }

         try {
            STBVorbisInfo var7 = STBVorbisInfo.malloc();

            int var5;
            int var6;
            try {
               STBVorbis.stb_vorbis_get_info(var3, var7);
               var5 = var7.channels();
               var6 = var7.sample_rate();
            } catch (Throwable var22) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var21) {
                     var22.addSuppressed(var21);
                  }
               }

               throw var22;
            }

            if (var7 != null) {
               var7.close();
            }

            if (var5 < 1 || var5 > 2 || var6 <= 0) {
               throw new IOException(liiiIIllIl<"liiiIIllIl","ej+NguyMmfNBkivVZIjz6+g4q1Q+4wIfuTxnv5/SSgq9M/Jf34hl59HpOsOWcGIVZw0=">());
            }

            int var25 = STBVorbis.stb_vorbis_stream_length_in_samples(var3);
            if (var25 <= 0) {
               throw new IOException(liiiIIllIl<"liiiIIllIl","JvW3uFmPIvrGjF7rU6ABa6xuArPnGDHgDauL3DQFbkeXTxDwqw==">());
            }

            short[] var8 = new short[var25 * var5];
            int var9 = STBVorbis.stb_vorbis_get_samples_short_interleaved(var3, var5, var8);
            if (var9 < var25) {
               short[] var10 = new short[Math.max(0, var9) * var5];
               System.arraycopy(var8, 0, var10, 0, var10.length);
               var8 = var10;
            }

            var26 = new illIIIliIilIIIli(var8, var5, var6);
         } finally {
            STBVorbis.stb_vorbis_close(var3);
         }
      } finally {
         MemoryUtil.memFree(var1);
      }

      return var26;
   }
}
