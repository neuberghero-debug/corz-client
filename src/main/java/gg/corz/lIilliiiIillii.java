package gg.corz;

import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.system.MemoryUtil;

public final class lIilliiiIillii {
   static final int IlilIliIIl = 8;
   private int IlIiIliIIl;
   private final Map<Integer, IiIlIlilliIlIlil> ililIliIIl;
   private int iIIiIliIIl;
   private final Set<Integer> IiilIliIIl;
   private int[] liilIliIIl;
   private long iiilIliIIl;
   private int lIIiIliIIl;
   private final int[] llilIliIIl = new int[(~(1973893166 << 27 | 1973893166 >>> 5) >>> 25 | ~(1973893166 << 27 | 1973893166 >>> 5) << 7) ^ 694361934];
   private int IIIiIliIIl;

   private void Ililllililil(int preset) {
      try {
         IiIlIlilliIlIlil var2 = IiIlIlilliIlIlil.iIlIlllllill(preset);
         this.ililIliIIl.put(preset, var2);
      } catch (Throwable var6) {
         Iiilliiliiil(
            IlIillIiilIi<"IlIillIiilIi","8m82o1xgmq6fCrKr+c2/k2jF+jIB+5r76WKWOFlqYL7fV1c/">()
               + IiIlIlilliIlIlil.iillIIiIil[preset]
               + IlIillIiilIi<"IlIillIiilIi","3lfA+eYZD6R7LU6oEWw+P2p3LFb7bArakrAOQjeJtljcVQ9bAA==">()
               + var6
         );
      } finally {
         this.IiilIliIIl.remove(preset);
      }
   }

   public synchronized void iIlIlllllill() {
      if (this.IlIiIliIIl <= (~(~-1059742177 >>> 3 | ~-1059742177 << 29) ^ -132467753)) {
         try {
            this.IlIlllIlilIl();
         } catch (Throwable var2) {
            if (this.IlIiIliIIl++ < ((-(1487083973 >>> 15 | 1487083973 << 17) >>> 27 | -(1487083973 >>> 15 | 1487083973 << 17) << 5) ^ -1901471910)) {
               Iiilliiliiil(IlIillIiilIi<"IlIillIiilIi","kY1HjCWKIIHnf/pxOEcqgEUWaPA41RGZFVU4iURSik3XtumX3obmJipuEHY=">() + var2);
            }
         }
      }
   }

   private boolean IlIlllIlilIl() {
      long var1 = ALC10.alcGetCurrentContext();
      if (var1 == (-7748487817348108156L ^ -7748487817348108156L)) {
         return false;
      } else {
         if (var1 != this.iiilIliIIl) {
            this.IIillIiliIil();
            if (!this.IiIlliIliiIl()) {
               this.IlIiIliIIl++;
               return false;
            }

            this.iiilIliIIl = var1;
         }

         if (this.IIIiIliIIl != this.lIIiIliIIl) {
            IiIlIlilliIlIlil var3 = this.ililIliIIl.get(this.lIIiIliIIl);
            if (var3 != null) {
               this.IIlllIlliIll(var3);
            }
         }

         return this.IIIiIliIIl >= 0;
      }
   }

   private void Iilllilliill() {
      for (int var4 : this.liilIliIIl) {
         if (var4 != 0) {
            AL10.alDeleteBuffers(var4);
         }
      }

      this.liilIliIIl = new int[0];
   }

   public synchronized boolean IilliliilIIi(int gain, boolean release, float code) {
      long var5 = -41414091733716718L;
      if (this.IlIiIliIIl > ((~(-(198523183 << 27 | 198523183 >>> 5)) >>> 27 | ~(-(198523183 << 27 | 198523183 >>> 5)) << 5) ^ 198523163)) {
         return false;
      } else {
         try {
            var5 ^= ((long)this.iliIiiliiiii(gain, release, code) << 32 ^ var5) & -1L << 32;
            return (boolean)((int)(var5 >>> 32));
         } catch (Throwable var7) {
            if (this.IlIiIliIIl++ < (((744606132 >>> 31 | 744606132 << 1) + -119 + -73) * 15 ^ 863344603)) {
               Iiilliiliiil(IlIillIiilIi<"IlIillIiilIi","elmoGjlRRprxh3ajrWSRmd75atvRcg6W1o8EhYC4CBRmddVNazEOHPQ=">() + var7);
            }

            return false;
         }
      }
   }

   private void IIIllIIliIIl() {
      if (this.iiilIliIIl != 0L && this.iiilIliIIl == ALC10.alcGetCurrentContext()) {
         AL10.alGetError();

         for (int var4 : this.llilIliIIl) {
            if (var4 != 0) {
               AL10.alSourceStop(var4);
               AL10.alSourcei(var4, 4105, 0);
               AL10.alDeleteSources(var4);
            }
         }

         this.Iilllilliill();
         AL10.alGetError();
      }
   }

   private boolean IiIlliIliiIl() {
      AL10.alGetError();

      for (int var1 = 0; var1 < 8; var1++) {
         int var2 = AL10.alGenSources();
         if (AL10.alGetError() != 0 || var2 == 0) {
            for (int var3 = 0; var3 < var1; var3++) {
               AL10.alDeleteSources(this.llilIliIIl[var3]);
            }

            Arrays.fill(this.llilIliIIl, 0);
            AL10.alGetError();
            return false;
         }

         AL10.alSourcei(var2, 514, 1);
         AL10.alSource3f(var2, 4100, 0.0F, 0.0F, 0.0F);
         AL10.alSourcef(var2, 4129, 0.0F);
         this.llilIliIIl[var1] = var2;
      }

      AL10.alGetError();
      return true;
   }

   private void IIlllIlliIll(IiIlIlilliIlIlil b) {
      AL10.alGetError();

      for (int var5 : this.llilIliIIl) {
         if (var5 != 0) {
            AL10.alSourceStop(var5);
            AL10.alSourcei(var5, 4105, 0);
         }
      }

      this.Iilllilliill();
      this.liilIliIIl = Illlllllilll(b.IlilIIiIil);
      int var6 = AL10.alGetError();
      if (var6 == 0 && this.liilIliIIl.length != 0) {
         this.IIIiIliIIl = b.iIilIIiIil;
      } else {
         Iiilliiliiil(IlIillIiilIi<"IlIillIiilIi","pHrRe9ERFz0Xvd00ACnsb9PHjgZqEicfDNGx+Q8z8VPwoA63zABq1s1MxAA=">() + Integer.toHexString(var6));
         this.Iilllilliill();
         this.IIIiIliIIl = -1;
         this.IlIiIliIIl++;
      }
   }

   private boolean iliIiiliiiii(int release, boolean gain, float code) {
      if (!this.IlIlllIlilIl()) {
         return false;
      } else {
         IiIlIlilliIlIlil var4 = this.ililIliIIl.get(this.IIIiIliIIl);
         if (var4 == null) {
            return false;
         } else {
            int var5 = gain ? var4.iliIiiliiiii(release) : var4.lIiiIiIlilli(release);
            if (var5 >= 0 && var5 < this.liilIliIIl.length && this.liilIliIIl[var5] != 0) {
               int var6 = this.llilIliIIl[this.iIIiIliIIl];
               this.iIIiIliIIl = (this.iIIiIliIIl + 1) % 8;
               AL10.alGetError();
               AL10.alSourceStop(var6);
               AL10.alSourcei(var6, 4105, this.liilIliIIl[var5]);
               AL10.alSourcef(var6, 4106, Math.max(0.0F, code));
               AL10.alSourcef(var6, 4099, 1.0F);
               AL10.alSourcePlay(var6);
               int var7 = AL10.alGetError();
               if (var7 != 0) {
                  if (this.IlIiIliIIl++ < 3) {
                     Iiilliiliiil(
                        IlIillIiilIi<"IlIillIiilIi","Q/Wky/hR/N/DtzbD6rPJ1raLR3Y1AaYsIHWZLG0wur9mVPGfxnbK">()
                           + Integer.toHexString(var7)
                           + IlIillIiilIi<"IlIillIiilIi","iw8UJP4Bm6+nfP6e7xDfgyoftqmAA5fe8GU7zkieHn3yXJHP">()
                     );
                  }

                  return false;
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      }
   }

   private void IIillIiliIil() {
      Arrays.fill(this.llilIliIIl, 0);
      this.liilIliIIl = new int[0];
      this.iiilIliIIl = 0L;
      this.IIIiIliIIl = -1;
      this.iIIiIliIIl = 0;
   }

   public synchronized boolean liiiIIllIl(int preset) {
      try {
         return this.iiilIliIIl != (2916587478547975359L ^ 2916587478547975359L)
            && this.IIIiIliIIl == preset
            && this.iiilIliIIl == ALC10.alcGetCurrentContext();
      } catch (Throwable var3) {
         return false;
      }
   }

   public lIilliiiIillii() {
      this.ililIliIIl = new ConcurrentHashMap<>();
      this.IiilIliIIl = ConcurrentHashMap.newKeySet();
      this.liilIliIIl = new int[0];
      this.IIIiIliIIl = -1;
      this.lIIiIliIIl = -1;
   }

   private static void Iiilliiliiil(String msg) {
   }

   public synchronized void lIiiIiIlilli() {
      try {
         this.IIIllIIliIIl();
      } catch (Throwable var2) {
      }

      this.IIillIiliIil();
      this.IlIiIliIIl = 0;
   }

   private static int[] Illlllllilll(illIIIliIilIIIli[] clips) {
      int[] var1 = new int[clips.length];

      for (int var2 = 0; var2 < clips.length; var2++) {
         illIIIliIilIIIli var3 = clips[var2];
         int var4 = AL10.alGenBuffers();
         ShortBuffer var5 = MemoryUtil.memAllocShort(var3.IIlllIlliIll().length);

         try {
            var5.put(var3.IIlllIlliIll()).flip();
            AL10.alBufferData(var4, var3.Illlllllilll() == 2 ? 4355 : 4353, var5, var3.Iilllilliill());
         } finally {
            MemoryUtil.memFree(var5);
         }

         var1[var2] = var4;
      }

      return var1;
   }

   public synchronized void IliIlllilIi(int preset) {
      long var4 = -1192621611416556134L;
      var4 ^= ((long)IiIlIlilliIlIlil.liiiIIllIl(preset) << 32 ^ var4) & -1L << 32;
      this.lIIiIliIIl = (int)(var4 >>> 32);
      if (!this.ililIliIIl.containsKey((int)(var4 >>> 32)) && this.IiilIliIIl.add((int)(var4 >>> 32))) {
         Thread var3 = new Thread(() -> this.Ililllililil(p), IlIillIiilIi<"IlIillIiilIi","8y6WTjjZQrG768l2U7UeZbJYCbSGjq5u7x7k6NGzLV1alNHIwrxBjo01Rg==">());
         var3.setDaemon(true);
         var3.setPriority(1);
         var3.start();
      }
   }
}
