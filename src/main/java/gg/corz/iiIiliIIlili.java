package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class iiIiliIIlili {
   private static final String liiiiIlIliiiiiIlIl = "https://discord.gg/corzgg";
   private static long lIlIIllIliIlIIllIl;
   private static final String IiliiIlIlliliiIlIl = "corz_logo_v2";
   private static final long llliiIlIlilliiIlIl = 1476045767755174113L;
   private static final String lIiiiIlIliIiiiIlIl = "Playing CorzClient";
   private static InputStream lilIIllIliilIIllIl;
   private static final String iliiiIlIlIiiiiIlIl = "https://www.corz.gg/";
   private static final String IliiiIlIllliiiIlIl = "corz.gg";
   private static volatile boolean IllIIllIllllIIllIl = false;
   private static final String iiliiIlIlIIiiiIlIl = "CorzClient";
   private static final int IIIIIllIllIIIIllIl = 0;
   private static final int llIIIllIlilIIIllIl = 2;
   private static Closeable IIiIIllIllIiIIllIl;
   private static ScheduledExecutorService IiIIIllIlliIIIllIl;
   private static OutputStream illIIllIlIilIIllIl;
   private static final int iIIIIllIlIlIIIllIl = 1;
   private static final AtomicInteger iiIIIllIlIIlIIllIl = new AtomicInteger(1);

   public static void lIiiIiIlilli() {
      IllIIllIllllIIllIl = false;
      if (IiIIIllIlliIIIllIl != null) {
         IiIIIllIlliIIIllIl.shutdownNow();
      }

      try {
         if (illIIllIlIilIIllIl != null) {
            JsonObject var0 = new JsonObject();
            var0.addProperty(IIillIiliIil<"IIillIiliIil","IvazMNrCgV69G6b4V/JN4DQluVmMZ4CyJjUYiI4=">(), 1);
            var0.addProperty(IIillIiliIil<"IIillIiliIil","4Y40+0rlzeOhTtT0eUUwXPzZpKEG1nSyUnBwvL6HpSFftDCfdw==">(), String.valueOf(1476045767755174113L));
            IIIllIIliIIl(2, var0.toString());
         }
      } catch (Exception var1) {
      }

      IIlllIlliIll();
   }

   private static byte[] IiIlliIliiIl(int n) {
      long var4 = -2663682399088260545L;
      byte[] var1 = new byte[n];
      var4 ^= (0L ^ var4) & -1L << 32;

      while ((int)(var4 >>> 32) < n) {
         var4 ^= ((long)lilIIllIliilIIllIl.read(var1, (int)(var4 >>> 32), n - (int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         if ((int)var4 < 0) {
            return null;
         }

         var4 ^= ((long)((int)(var4 >>> 32) + (int)var4) << 32 ^ var4) & -1L << 32;
      }

      return var1;
   }

   public static void IliIlllilIi() {
      lIlIIllIliIlIIllIl = System.currentTimeMillis() / 1000L;
      IiIIIllIlliIIIllIl = Executors.newSingleThreadScheduledExecutor(r -> {
         Thread var1 = new Thread(r, IIillIiliIil<"IIillIiliIil","RyD/90HNvDqccM5W0sT3vn4+xOiQe6H3n8g+eZfB+gVrLiPU5s//lgQxMQS5AuD/XQ==">());
         var1.setDaemon(true);
         return var1;
      });
      IiIIIllIlliIIIllIl.scheduleAtFixedRate(iiIiliIIlili::liiiIIllIl, 0L, 15L, TimeUnit.SECONDS);
   }

   private static void iliIiiliiiii() {
      long var9 = -2160642868652135092L;
      long var11 = 9053105333073264285L;
      long var13 = 6904000284830722491L;
      var9 ^= (
            (long)System.getProperty(IIillIiliIil<"IIillIiliIil","+F41y36BcD9I2vZBsNhWu/seXyBrGels+rdxHuyUnooAyBE=">(), "")
                     .toLowerCase()
                     .contains(IIillIiliIil<"IIillIiliIil","yMU5gqAWXrp253WZp5pQD2pMWrUSuvLqssfZP4YYjA==">())
                  << 32
               ^ var9
         )
         & -1L << 32;
      if ((int)(var9 >>> 32) != 0) {
         for (long var19 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var19 < 10; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            try {
               String var17 = IIillIiliIil<"IIillIiliIil","CiAE416ZXkoQODwY+mA/TV7W5ryxGHzGWkYQVZ1/4y6t+tJfvkcTO1Z2nqF4Dq2UjQ==">() + (int)var19;
               RandomAccessFile var3 = new RandomAccessFile(var17, IIillIiliIil<"IIillIiliIil","rSHCwdZdTwho+O/wV6KpK+iGqw2XdUNBv3dnhwsT">());
               IIiIIllIllIiIIllIl = var3;
               lilIIllIliilIIllIl = new FileInputStream(var3.getFD());
               illIIllIlIilIIllIl = new FileOutputStream(var3.getFD());
               return;
            } catch (IOException var15) {
            }
         }
      } else {
         String[] var1 = new String[]{
            System.getenv(IIillIiliIil<"IIillIiliIil","s36wTAp3mifHvDHyWasE4Pyvn25lnAJDDJQTZOz7GVmzQlAUHrsGHEzV6A==">()),
            System.getenv(IIillIiliIil<"IIillIiliIil","mheiWBN+G1lzuyNoIGseLxmz+Aq2tlwihXnm6luVFqFBDA==">()),
            System.getProperty(IIillIiliIil<"IIillIiliIil","IrAKVC8PpHj/PzIcXVq25xQlydK2hO5jhII/2taF3dbLtKArFy8QEgyZ">()),
            IIillIiliIil<"IIillIiliIil","JGpn719jMWYNzjPMs+L46JOnYtyGZON42QqxsL1uBzE=">()
         };
         String[] var2 = var1;
         var11 ^= ((long)var1.length << 32 ^ var11) & -1L << 32;

         for (long var21 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var21 < (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            String var5 = var2[(int)var21];
            if (var5 != null) {
               for (var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < 10; var13 += 4294967296L) {
                  try {
                     UnixDomainSocketAddress var7 = UnixDomainSocketAddress.of(
                        var5 + IIillIiliIil<"IIillIiliIil","eAqtwm5JuNDbeIN7Dhw3NDo5VSKXpVqU/k/A4S9TRHMy6h7YhpQjV8U=">() + (int)(var13 >>> 32)
                     );
                     SocketChannel var8 = SocketChannel.open(var7);
                     var8.configureBlocking(true);
                     IIiIIllIllIiIIllIl = var8;
                     lilIIllIliilIIllIl = var8.socket().getInputStream();
                     illIIllIlIilIIllIl = var8.socket().getOutputStream();
                     return;
                  } catch (Exception var16) {
                  }
               }
            }
         }
      }
   }

   private static void IilliliilIIi() {
      if (IllIIllIllllIIllIl && illIIllIlIilIIllIl != null) {
         try {
            JsonObject var0 = new JsonObject();
            var0.addProperty(
               IIillIiliIil<"IIillIiliIil","+DuCIfeonmgGkG6+9/o0CG6gQi1tCftwVBhPTj2Hi841xnc=">(),
               IIillIiliIil<"IIillIiliIil","QDfdDyuVQBxzpr+QSQjszkafqHH+j5NYvkwMIPwuxvbySW/7BcMlXXwmALVP3A==">()
            );
            var0.addProperty(
               IIillIiliIil<"IIillIiliIil","g0UUiAWzykZ01PPlgKDlmTlpZrlZ/thKXt/FXvGBnlJf">(),
               IIillIiliIil<"IIillIiliIil","j4da104Kcnt8aNXubdyJ58NAKyIM1Up+tFyjATbY8ybGDqI=">()
            );
            JsonObject var1 = new JsonObject();
            var1.addProperty(IIillIiliIil<"IIillIiliIil","pQ63DrsKg2dS4+pbIV8PNB6HQDRdb5iTRSze5BBnaXSV">(), lIlIIllIliIlIIllIl);
            var0.add(IIillIiliIil<"IIillIiliIil","B+9dmfK6J4uQLJyiH5nt2OQcrFvNwW+lQBAKZ4MvUmUiMI3ZGvs=">(), var1);
            JsonObject var2 = new JsonObject();
            var2.addProperty(
               IIillIiliIil<"IIillIiliIil","/GcNR8A//oyPnFcGMkk9GloG/BmnUOv4Ud11dWQbuHwaO0AFCNIa">(),
               IIillIiliIil<"IIillIiliIil","ebKXaFVjYNr/Xn6Ea+nwAZkR+FiSkELx+jWZ0WZy1BIAoWToKKnOYw==">()
            );
            var2.addProperty(
               IIillIiliIil<"IIillIiliIil","hkb1MIcJFowF5POTFMialSGEhNeCl4C11WBdfoHT8IJ8WQwACLE=">(),
               IIillIiliIil<"IIillIiliIil","+YkzIkF5lSdITE2U5o4Oywr7a6vhCqM07or+udvVtE9OZykPmQc=">()
            );
            var0.add(IIillIiliIil<"IIillIiliIil","fPg7inNcHTngVcNCQ4ypev4LAq8AMv/xFVZd/c+V6xqNdA==">(), var2);
            JsonArray var3 = new JsonArray();
            JsonObject var4 = new JsonObject();
            var4.addProperty(
               IIillIiliIil<"IIillIiliIil","wuMAFbteUCl+/a3XnwvRTbXaOWjgLwnuHF91Vy6CbFGV">(),
               IIillIiliIil<"IIillIiliIil","XJ9YEvgUYlXIXR032jerjm7V/fCgKPmp3OVdOHJQ0xoxTc4=">()
            );
            var4.addProperty(
               IIillIiliIil<"IIillIiliIil","aUTJbL2ChmNs4TTB5VaXW2A3DKmAICjLKGOH8mmX4Q==">(),
               IIillIiliIil<"IIillIiliIil","RqrmZpw22Nz/4hBN2SKKQls7lBYpb5MxOaGqsI86bmcgBR5oIkNkkBP89VjIHXXR">()
            );
            var3.add(var4);
            JsonObject var5 = new JsonObject();
            var5.addProperty(
               IIillIiliIil<"IIillIiliIil","wuMAFbteUCl+/a3XnwvRTbXaOWjgLwnuHF91Vy6CbFGV">(),
               IIillIiliIil<"IIillIiliIil","R9XPD9ee5gCglzMKjO7ik6ivBDtJjXqbDnu8bd59vS2KyNI=">()
            );
            var5.addProperty(
               IIillIiliIil<"IIillIiliIil","aUTJbL2ChmNs4TTB5VaXW2A3DKmAICjLKGOH8mmX4Q==">(),
               IIillIiliIil<"IIillIiliIil","8s7BvBv0M6/18ewW9gnnmf5mXQUMu+d4sflBOi8dx0MNr5t2ZPgrl0422a9km8qnXDhlzbc=">()
            );
            var3.add(var5);
            var0.add(IIillIiliIil<"IIillIiliIil","jT4yjkwH/vyH3iXzV2wzLJyGrq9eIPNpKFLcS24fm3qfZfs=">(), var3);
            JsonObject var6 = new JsonObject();
            var6.addProperty(IIillIiliIil<"IIillIiliIil","ligP+VIbFama55MAPNlUzAP3OMHLWdtH/7Y+aYUsdw==">(), (int)(ProcessHandle.current().pid() & 2147483647L));
            var6.add(IIillIiliIil<"IIillIiliIil","Ru+hVDfRj2lN4yxkjodyVo/uDh7LWMZzpvYcKJHX+T1NGIt9">(), var0);
            JsonObject var7 = new JsonObject();
            var7.addProperty(
               IIillIiliIil<"IIillIiliIil","Ehx7QKgs8d2HemfqbWBIdH8WSdNRYKb7npzlDrcnDw==">(),
               IIillIiliIil<"IIillIiliIil","64fJPj03JPbzKwe451yG870txl6wEjmUAdTpMRJNyCkT00FDULrOrg==">()
            );
            var7.addProperty(
               IIillIiliIil<"IIillIiliIil","pFyS7lnIPgtrBMWQCmUHUkWb38bgNpnlmiarZMwSjSzp">(), String.valueOf(iiIIIllIlIIlIIllIl.getAndIncrement())
            );
            var7.add(IIillIiliIil<"IIillIiliIil","I37YMUcfyibpwMq1NmrXP5Vnrduek9JiZ2ZeeAailM4=">(), var6);
            IIIllIIliIIl(1, var7.toString());
         } catch (Exception var8) {
            IIlllIlliIll();
         }
      }
   }

   private static void IIIllIIliIIl(int op, String json) {
      byte[] var2 = json.getBytes(StandardCharsets.UTF_8);
      ByteBuffer var3 = ByteBuffer.allocate(8 + var2.length).order(ByteOrder.LITTLE_ENDIAN);
      var3.putInt(op);
      var3.putInt(var2.length);
      var3.put(var2);
      illIIllIlIilIIllIl.write(var3.array());
      illIIllIlIilIIllIl.flush();
   }

   private static String IlIlllIlilIl() {
      long var4 = -7642989291487246192L;

      try {
         byte[] var0 = IiIlliIliiIl(8);
         if (var0 == null) {
            return null;
         } else {
            ByteBuffer var1 = ByteBuffer.wrap(var0).order(ByteOrder.LITTLE_ENDIAN);
            var1.getInt();
            var4 ^= ((long)var1.getInt() << 32 ^ var4) & -1L << 32;
            byte[] var3 = IiIlliIliiIl((int)(var4 >>> 32));
            return var3 == null ? null : new String(var3, StandardCharsets.UTF_8);
         }
      } catch (Exception var6) {
         return null;
      }
   }

   private static void iIlIlllllill() {
      IIlllIlliIll();

      try {
         iliIiiliiiii();
         if (illIIllIlIilIIllIl == null) {
            return;
         }

         JsonObject var0 = new JsonObject();
         var0.addProperty(IIillIiliIil<"IIillIiliIil","IvazMNrCgV69G6b4V/JN4DQluVmMZ4CyJjUYiI4=">(), 1);
         var0.addProperty(IIillIiliIil<"IIillIiliIil","4Y40+0rlzeOhTtT0eUUwXPzZpKEG1nSyUnBwvL6HpSFftDCfdw==">(), String.valueOf(1476045767755174113L));
         IIIllIIliIIl(0, var0.toString());
         Future var1 = Executors.newSingleThreadExecutor().submit(() -> IlIlllIlilIl());
         String var2 = (String)var1.get(3L, TimeUnit.SECONDS);
         if (var2 == null || !var2.contains(IIillIiliIil<"IIillIiliIil","0FdQhyPv3x3PxFLTXni5jyUDMXkOOqAQ6rFMTLB1290O">())) {
            IIlllIlliIll();
            return;
         }

         IllIIllIllllIIllIl = true;
         Thread.sleep(200L);
         IilliliilIIi();
      } catch (Exception var3) {
         IIlllIlliIll();
      }
   }

   private static void IIlllIlliIll() {
      IllIIllIllllIIllIl = false;

      try {
         if (illIIllIlIilIIllIl != null) {
            illIIllIlIilIIllIl.close();
         }
      } catch (Exception var3) {
      }

      try {
         if (lilIIllIliilIIllIl != null) {
            lilIIllIliilIIllIl.close();
         }
      } catch (Exception var2) {
      }

      try {
         if (IIiIIllIllIiIIllIl != null) {
            IIiIIllIllIiIIllIl.close();
         }
      } catch (Exception var1) {
      }

      illIIllIlIilIIllIl = null;
      lilIIllIliilIIllIl = null;
      IIiIIllIllIiIIllIl = null;
   }

   private static void liiiIIllIl() {
      if (!IllIIllIllllIIllIl) {
         iIlIlllllill();
      }
   }
}
