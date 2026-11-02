package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.sound.sampled.AudioFormat;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_4231;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;

public final class IillIlilillIli {
   static final String illIlIIIIl = "sounds/c2pack/";
   public static final int IiIIlIIIIl = 8;
   public static final long IllIlIIIIl = 8388608L;
   private static volatile Map<String, IiliIllliliIll> lIiIlIIIIl;
   private static long IiiIlIIIIl;
   public static final int iiIIlIIIIl = 2048;
   public static final long lllIlIIIIl = 134217728L;
   public static final String ilIIlIIIIl = "knife_packs";
   static final Pattern IilIlIIIIl = Pattern.compile(
      IiiIlliiIl<"IiiIlliiIl","dO1xYus71r5/M83BQv+278POnm2W44LGa2s4wrdYmCG12PCwPTJPfwWCRF8LnOXIeYBJ/Imn+G+YXJsY6MykLedZfRw=">()
   );
   static final Pattern lilIlIIIIl = Pattern.compile(
      IiiIlliiIl<"IiiIlliiIl","gTZhHvkDBGisdwT7CO668kvnKDy4rcQ6oDmDl5yN/KZ0Gq8d0sbNGakgRJLsELv7QXlAhBHPCRjybSjnShzDVyT885BplGUPzTWJju5WEv1oNt+tCm5zcyKW">()
   );
   private static long iliIlIIIIl;
   public static final long lIlIlIIIIl = 67108864L;
   private static CompletableFuture<Void> iIiIlIIIIl;
   private static final ExecutorService IIiIlIIIIl = Executors.newSingleThreadExecutor(r -> {
      Thread var1 = new Thread(r, IiiIlliiIl<"IiiIlliiIl","J8Kcq3VWHKuVU0ppmSk0ZYQnzDj74N/WPdxDA3bZy3tlKhMRDSXeaOaDaguBX7ZCDw==">());
      var1.setDaemon(true);
      var1.setPriority(4);
      return var1;
   });
   static final Pattern iilIlIIIIl = Pattern.compile(IiiIlliiIl<"IiiIlliiIl","k/7n00gJCu0X+OCBmxgH8158nJ9z09buoo0U7ZumpGCxANHT8sBhkL31WC56IlZ1w20fiT3J/6Q=">());
   private static long liiIlIIIIl;
   private static final Map<String, Integer> lliIlIIIIl = new HashMap<>();
   public static final int liIIlIIIIl = 8192;
   private static final List<String> IliIlIIIIl = new ArrayList<>();
   public static final String llIIlIIIIl = "c2pack|";
   public static final long iIlIlIIIIl = 2097152L;
   public static final float IIlIlIIIIl = 0.7F;

   public static synchronized void IIIIllIIIl() {
      liiIlIIIIl = 0L;
   }

   public static String IiIlliIliiIl(String entry) {
      if (entry != null
         && !entry.contains(IiiIlliiIl<"IiiIlliiIl","ZG9wYC6vUWhY6paA+L6p4pNgkvXgok6O/Q8ieBJ0">())
         && !entry.contains(IiiIlliiIl<"IiiIlliiIl","xnpRJF7dXXErGCckdR1QYQQB00TsHagPYzek9dvU">())) {
         Matcher var1 = lilIlIIIIl.matcher(entry);
         return var1.matches() ? var1.group(1) + IiiIlliiIl<"IiiIlliiIl","akL6ig3d0c4s7Z4tCnH45XacKoqJhb6UAor+Gww=">() + var1.group(3) : null;
      } else {
         return null;
      }
   }

   public static String IIlllIlliIll(String pack, String effect) {
      return IiiIlliiIl<"IiiIlliiIl","intVVgCDutCKOVbpYT7jvzRQjeRvzU2JrWtBDPrO899LTwM=">()
         + pack
         + IiiIlliiIl<"IiiIlliiIl","OjKdXH/rxAuboPLIRQHpea341tbDEB4KAcpM02k=">()
         + effect;
   }

   static synchronized String IIiilIiiiIii(class_2960 location) {
      long var3 = 2331780218273455611L;
      if (location != null && IiiIlliiIl<"IiiIlliiIl","G7ny8K0Ns3pAnwbOewdOtJigCU2LcYrwUIkVY0mMiqN069Wm+hI=">().equals(location.method_12836())) {
         Matcher var1 = iilIlIIIIl.matcher(location.method_12832());
         if (!var1.matches()) {
            return null;
         } else {
            var3 ^= ((long)Integer.parseInt(var1.group(1)) << 32 ^ var3) & -1L << 32;
            return (int)(var3 >>> 32) < IliIlIIIIl.size() ? IliIlIIIIl.get((int)(var3 >>> 32)) : null;
         }
      } else {
         return null;
      }
   }

   public static boolean Illlllllilll(String sound) {
      return sound != null && sound.startsWith(IiiIlliiIl<"IiiIlliiIl","intVVgCDutCKOVbpYT7jvzRQjeRvzU2JrWtBDPrO899LTwM=">());
   }

   public static List<Path> lIiiIiIlilli(Path dir) {
      ArrayList var1 = new ArrayList();
      if (dir != null && Files.isDirectory(dir, LinkOption.NOFOLLOW_LINKS)) {
         try (DirectoryStream var2 = Files.newDirectoryStream(dir)) {
            for (Path var4 : var2) {
               if (IilliliilIIi(var4.getFileName().toString()) != null && Files.isRegularFile(var4, LinkOption.NOFOLLOW_LINKS)) {
                  long var5 = Files.size(var4);
                  if (var5 > 0L && var5 <= 67108864L) {
                     var1.add(var4);
                  }
               }
            }
         } catch (IOException | RuntimeException var9) {
            return new ArrayList<>();
         }

         var1.sort((a, b) -> a.getFileName().toString().compareTo(b.getFileName().toString()));
         return var1.size() > 8 ? new ArrayList<>(var1.subList(0, 8)) : var1;
      } else {
         return var1;
      }
   }

   public static List<iIiiiilIliiiil> Ililllililil(List<IIIilIIilIIilIIi> length, float cues, Function<String, String> resolve) {
      if (length != null && !length.isEmpty()) {
         ArrayList var3 = new ArrayList();
         float var4 = IIillIiliIil();

         for (IIIilIIilIIilIIi var6 : length) {
            if (!(var6.IliIlllilIi() < 0.0F) && !(var6.IliIlllilIi() > cues)) {
               String var7 = (String)resolve.apply(var6.liiiIIllIl());
               if (var7 != null) {
                  var3.add(new iIiiiilIliiiil(var6.IliIlllilIi(), var7, var4, 1.0F));
               }
            }
         }

         return var3.isEmpty() ? null : List.copyOf(var3);
      } else {
         return null;
      }
   }

   public static List<IIIilIIilIIilIIi> Iiilliiliiil(List<IIIilIIilIIilIIi> cues, float to, float from) {
      if (cues != null && !cues.isEmpty()) {
         float var3 = to > 0.0F && from > 0.0F ? from / to : 1.0F;
         ArrayList var4 = new ArrayList(cues.size());

         for (IIIilIIilIIilIIi var6 : cues) {
            var4.add(new IIIilIIilIIilIIi(var3 == 1.0F ? var6.IliIlllilIi() : Math.min(from, var6.IliIlllilIi() * var3), var6.liiiIIllIl()));
         }

         return List.copyOf(var4);
      } else {
         return List.of();
      }
   }

   public static boolean Illillliilli(String sound) {
      long var5 = -7663149555616549181L;
      var5 ^= (
            (long)(
                     !IiiIlliiIl<"IiiIlliiIl","Flc8rEoAQ67c1pP50gNAKW8v/89OJeT7sa9TfKXObV1NJA==">().equals(sound)
                           && !IiiIlliiIl<"IiiIlliiIl","PC6ZISa83GiNlHg0BR5WOpVgsH4rokjFnFr2PxG9hS4K7E9RLwoXf+lc6K0=">().equals(sound)
                        ? 0
                        : 1
                  )
                  << 32
               ^ var5
         )
         & -1L << 32;
      if ((int)(var5 >>> 32) == 0 && !IiiIlliiIl<"IiiIlliiIl","tkz9WPpVxkL4h4rqD4lV0+Wb+aeBRZzPMDwAWUbbwzs1">().equals(sound)) {
         return false;
      } else if (lIiIlIIIIl != null && iIiIiliIliIili.liiiIIllIl()) {
         iiIiliiIIlilii var2 = iIiIiliIliIili.lIiiIiIlilli();
         if (var2 == null) {
            return false;
         } else {
            liIlIiliiIlIil var3 = iIllliIlllli.iliIiiliiiii(var2);
            lIIiilIliIIiilIl var4 = var3 == null ? null : var3.liiiIIllIl();
            return IIlilIliiIli(
               var2,
               var4,
               (int)(var5 >>> 32) != 0
                  ? (var4 == null ? var2.IIIllIIliIIl() : iIIIIilIlIIIil.liiiIIllIl(var2, var4))
                  : IiiIlliiIl<"IiiIlliiIl","zAsiLfEgv5YdmeL1OSyuoOCSrFb43Mi1p+Ti9Bbs12h4oqM=">()
            );
         }
      } else {
         return false;
      }
   }

   public static iiIiliiIIlilii IIIilIIiiIIi(iiIiliiIIlilii knife) {
      return knife == iiIiliiIIlilii.lIIllliIIl ? iiIiliiIIlilii.llIllliIIl : null;
   }

   private IillIlilillIli() {
   }

   public static boolean Iliilliiilii(class_2960 location) {
      return location != null
         && IiiIlliiIl<"IiiIlliiIl","G7ny8K0Ns3pAnwbOewdOtJigCU2LcYrwUIkVY0mMiqN069Wm+hI=">().equals(location.method_12836())
         && location.method_12832().startsWith(IiiIlliiIl<"IiiIlliiIl","fCtNakroL3wzdyWg1ip0h9fbbGZQRgE/WKqkHgjLpSdf5y0BbU+UPFVW">());
   }

   public static Map<String, String> IlIlllIlilIl(List<String> names) {
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var2 = new LinkedHashMap();

      for (String var4 : names) {
         String var5 = IiIlliIliiIl(var4);
         if (var5 != null) {
            LinkedHashMap var6 = var4.contains(IiiIlliiIl<"IiiIlliiIl","xlRuozEZtM5se5e2r7R6MS4MbhaEHIz5gIGLt2S6mJrsSJU03qpuVal+">()) ? var1 : var2;
            if (var6.size() < 2048) {
               var6.putIfAbsent(var5, var4);
            }
         }
      }

      LinkedHashMap var7 = new LinkedHashMap(var1);

      for (Entry var9 : var2.entrySet()) {
         if (var7.size() < 2048) {
            var7.putIfAbsent((String)var9.getKey(), (String)var9.getValue());
         }
      }

      return Collections.unmodifiableMap(var7);
   }

   public static Path IliIlllilIi() {
      return FabricLoader.getInstance()
         .getConfigDir()
         .resolve(IiiIlliiIl<"IiiIlliiIl","G7ny8K0Ns3pAnwbOewdOtJigCU2LcYrwUIkVY0mMiqN069Wm+hI=">())
         .resolve(IiiIlliiIl<"IiiIlliiIl","s5QzOsy4wnPaeswkb8Mtjkp4irQ5axKDRtwNkTh4GS6rn9AqmnXf">());
   }

   public static synchronized String llIIlilIIl() {
      return IiiIlliiIl<"IiiIlliiIl","KKPjInMVcaCynzqG1RIlQUK57FOIQiIsnfJ7yCsEPTYmLDI=">()
         + iliIlIIIIl
         + IiiIlliiIl<"IiiIlliiIl","/s+3/gbm0eUEq0Wwr8zG3LW9OF8vpvx9AWURV72K5f+zML55Ug==">()
         + IiiIlIIIIl
         + IiiIlliiIl<"IiiIlliiIl","cK1VdqWl8pk2nQOJQEt3ZB/B5r6F66tiquQNMHee5L09g5c=">()
         + IliIlIIIIl.size();
   }

   public static synchronized void liiiIIllIl() {
      if (iIiIlIIIIl == null) {
         iIiIlIIIIl = CompletableFuture.runAsync(() -> {
            Map var0;
            try {
               var0 = iliIiiliiiii(IliIlllilIi());
            } catch (RuntimeException var4) {
               System.err.println(IiiIlliiIl<"IiiIlliiIl","9bl2QevwuLwOysnWTp06sW/NRedhZmLxtKoB92QO">() + var4);
               var0 = Map.of();
            }

            lIiIlIIIIl = var0;
            int var1 = 0;

            for (IiliIllliliIll var3 : var0.values()) {
               var1 += var3.iIlIlllllill().size();
            }
         }, IIiIlIIIIl);
      }
   }

   public static CompletableFuture<class_4231> IiIIlliIIl(class_2960 location) {
      String var1 = IIiilIiiiIii(location);
      return CompletableFuture.supplyAsync(
         () -> {
            try {
               if (var1 == null) {
                  throw new IOException(IiiIlliiIl<"IiiIlliiIl","b9YQ3guuo+0X5aov1SYkdMGFx+0/CldRPlRlYqVmmvqMbQ7gtk22dVTUxqRcVVzhrNG7cz4=">() + location);
               } else {
                  synchronized (IillIlilillIli.class) {
                     if (liiIlIIIIl > (2707231748511253871L ^ 2707231748645471599L)) {
                        throw new IOException(
                           IiiIlliiIl<"IiiIlliiIl","oSJVyT4x2xQqbOi7xJAEuNI/pnjMFAnfhxjcnzmoukLphviNIaVvqQ3is6r+J8LdmpYgn5irRamOB4pASKwhIs4=">()
                        );
                     }
                  }

                  iIiIIilIliIIil var8 = iiIIlIIlIl(var1);
                  synchronized (IillIlilillIli.class) {
                     IiiIlIIIIl++;
                     liiIlIIIIl = liiIlIIIIl + (long)var8.IliIlllilIi().limit();
                  }

                  return new class_4231(var8.IliIlllilIi(), var8.liiiIIllIl());
               }
            } catch (IOException | RuntimeException var7) {
               System.err
                  .println(
                     IiiIlliiIl<"IiiIlliiIl","9bl2QevwuLwOysnWTp06sW/NRedhZmLxtKoB92QO">()
                        + var1
                        + IiiIlliiIl<"IiiIlliiIl","7hbC+3MQkt63XNWjo96oggqLM5hQzs+hYY/f/RXJ">()
                        + var7
                  );
               throw new CompletionException(var7);
            }
         },
         IIiIlIIIIl
      );
   }

   static String Iilllilliill(Map<String, IiliIllliliIll> all, String pack, String effect) {
      if (all != null && effect != null) {
         IiliIllliliIll var3 = pack == null ? null : (IiliIllliliIll)all.get(pack);
         if (var3 != null && var3.iIlIlllllill().containsKey(effect)) {
            return IIlllIlliIll(var3.IliIlllilIi(), effect);
         } else {
            for (IiliIllliliIll var5 : all.values()) {
               if (var5.iIlIlllllill().containsKey(effect)) {
                  return IIlllIlliIll(var5.IliIlllilIi(), effect);
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   static iIiIIilIliIIil iiIIlIIlIl(String key) {
      long var12 = 4529534867603604897L;
      String var1 = key.substring(IiiIlliiIl<"IiiIlliiIl","intVVgCDutCKOVbpYT7jvzRQjeRvzU2JrWtBDPrO899LTwM=">().length());
      var12 ^= ((long)var1.indexOf((-1437676413 * -45 + 69 ^ -69) - -51 ^ -270929212) << 32 ^ var12) & -1L << 32;
      if ((int)(var12 >>> 32) < 0) {
         throw new IOException(IiiIlliiIl<"IiiIlliiIl","xoPK2ObKcw8zp+7xEplBthcwJ81MAtP6xZIVUp6rq1sVqSbmYOO9Ig5fAa9Y0w==">());
      } else {
         Map var3 = lIiIlIIIIl;
         IiliIllliliIll var4 = var3 == null ? null : (IiliIllliliIll)var3.get(var1.substring(0, (int)(var12 >>> 32)));
         String var5 = var4 == null ? null : var4.iIlIlllllill().get(var1.substring((int)(var12 >>> 32) + 1));
         if (var5 == null) {
            throw new IOException(IiiIlliiIl<"IiiIlliiIl","whDlC4KJdLBuxDh8qufP/HmcXHT1BciUa6s15TkZq5cUs/X02tEVdQDktIZYLHbxw4IGBA==">());
         } else {
            ZipFile var7 = new ZipFile(var4.liiiIIllIl().toFile());

            byte[] var6;
            try {
               ZipEntry var8 = var7.getEntry(var5);
               if (var8 == null) {
                  throw new IOException(IiiIlliiIl<"IiiIlliiIl","whDlC4KJdLBuxDh8qufP/HmcXHT1BciUa6s15TkZq5cUs/X02tEVdQDktIZYLHbxw4IGBA==">());
               }

               try (InputStream var9 = var7.getInputStream(var8)) {
                  var6 = var9.readNBytes(-(-(--1783856675 * 5)) ^ 327251630);
               }
            } catch (Throwable var17) {
               try {
                  var7.close();
               } catch (Throwable var14) {
                  var17.addSuppressed(var14);
               }

               throw var17;
            }

            var7.close();
            if ((long)var6.length > (528755340837270155L ^ 528755340835173003L)) {
               throw new IOException(IiiIlliiIl<"IiiIlliiIl","QJ8N+bq2wfvCcTqKEiOFkk9k91gzSbwnFuxK2xbeuypTdvga7u7iWJxYh4myqBq9n49a4RxPwQ==">());
            } else {
               return lIlIliIlIl(var6);
            }
         }
      }
   }

   static iIiIIilIliIIil lIlIliIlIl(byte[] ogg) {
      ByteBuffer var1 = ByteBuffer.allocateDirect(ogg.length);
      var1.put(ogg).flip();
      MemoryStack var2 = MemoryStack.stackPush();

      iIiIIilIliIIil var16;
      try {
         IntBuffer var3 = var2.mallocInt(1);
         long var4 = STBVorbis.stb_vorbis_open_memory(var1, var3, null);
         if (var4 == 0L) {
            throw new IOException(
               IiiIlliiIl<"IiiIlliiIl","+dYapiRdfgOMnItrniLn774R6RP/JT+1L0ocAjVNSbh2MKBLgYMwfHKlHAuE">()
                  + var3.get(0)
                  + IiiIlliiIl<"IiiIlliiIl","1sP6XcTAa9oPTGuY1ERpnRzMASY0fck6AlRdmB0=">()
            );
         }

         try {
            label92: {
               STBVorbisInfo var6 = STBVorbis.stb_vorbis_get_info(var4, STBVorbisInfo.malloc(var2));
               int var7 = var6.channels();
               int var8 = var6.sample_rate();
               if (var7 >= 1 && var7 <= 2 && var8 >= 8000 && var8 <= 96000) {
                  long var9 = (long)STBVorbis.stb_vorbis_stream_length_in_samples(var4);
                  long var11 = var9 * (long)var7 * 2L;
                  if (var9 > 0L && var11 <= 8388608L) {
                     ByteBuffer var13 = ByteBuffer.allocateDirect((int)var11).order(ByteOrder.nativeOrder());
                     int var14 = STBVorbis.stb_vorbis_get_samples_short_interleaved(var4, var7, var13.asShortBuffer());
                     if (var14 <= 0) {
                        throw new IOException(IiiIlliiIl<"IiiIlliiIl","6b34inMGJzChUOpU/oQ1NLjpKsxKbZNvjlANGDJWTmHXtqmQoZFLM17fTOor7B4peoinM9I=">());
                     }

                     var13.limit(Math.min(var13.capacity(), var14 * var7 * 2));
                     AudioFormat var15 = new AudioFormat((float)var8, 16, var7, true, ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
                     var16 = new iIiIIilIliIIil(var13, var15);
                     break label92;
                  }

                  throw new IOException(IiiIlliiIl<"IiiIlliiIl","otUkgaxr/DHEOkVitAg0rMVG7yUwbymUkgAgEk8jVanOdrU9pEl+/Ml92g9yfVlr3hJVycPewlc=">());
               }

               throw new IOException(IiiIlliiIl<"IiiIlliiIl","RuUX5H6CHk+nPfpC5JLuUysCYLJga/nol0bxjkN/pjmEhOiEEjOcWJGpSFS2auoH0cs=">());
            }
         } finally {
            STBVorbis.stb_vorbis_close(var4);
            Reference.reachabilityFence(var1);
         }
      } catch (Throwable var23) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var21) {
               var23.addSuppressed(var21);
            }
         }

         throw var23;
      }

      if (var2 != null) {
         var2.close();
      }

      return var16;
   }

   static lliIiiililiIiiil IlIillIiilIi(iiIiliiIIlilii clip, lliIiiililiIiiil knife) {
      iiIiliiIIlilii var2 = IIIilIIiiIIi(clip);
      if (var2 == null) {
         return null;
      } else {
         iIllliIlllli.iIlIlllllill(var2);
         liIlIiliiIlIil var3 = iIllliIlllli.iliIiiliiiii(clip);
         liIlIiliiIlIil var4 = iIllliIlllli.iliIiiliiiii(var2);
         if (var4 == null) {
            return null;
         } else {
            String var5 = iIIIIilIlIIIil.lIiiIiIlilli(clip, var3 == null ? null : var3.liiiIIllIl(), knife.liiiIIllIl(), var2, var4.liiiIIllIl());
            return var5 == null ? null : var4.liiiIIllIl().iiiililIll.get(var5);
         }
      }
   }

   public static List<iIiiiilIliiiil> IiIiliIiiiIi(iiIiliiIIlilii knife, lliIiiililiIiiil clip) {
      if (knife != null && clip != null && iIlIlllllill()) {
         Map var2 = lIiIlIIIIl;
         if (!knife.IliIlllilIi()) {
            return Ililllililil(clip.lIiiIiIlilli(), clip.iIlIlllllill(), e -> Iilllilliill(var2, knife.illilliIIl, e));
         } else {
            lliIiiililiIiiil var3 = IlIillIiilIi(knife, clip);
            if (var3 == null) {
               return null;
            } else {
               String var4 = IIIilIIiiIIi(knife).illilliIIl;
               return Ililllililil(
                  Iiilliiliiil(var3.lIiiIiIlilli(), var3.iIlIlllllill(), clip.iIlIlllllill()), clip.iIlIlllllill(), all -> Iilllilliill(var2, var4, all)
               );
            }
         }
      } else {
         return null;
      }
   }

   public static boolean iIlIlllllill() {
      Map var0 = lIiIlIIIIl;
      if (var0 == null) {
         liiiIIllIl();
      }

      return var0 != null && !var0.isEmpty();
   }

   static String IilliliilIIi(String fileName) {
      if (fileName == null) {
         return null;
      } else {
         Matcher var1 = IilIlIIIIl.matcher(fileName);
         return var1.matches() ? var1.group(1) : null;
      }
   }

   static Map<String, String> IIIllIIliIIl(ZipFile zip) {
      ArrayList var1 = new ArrayList();
      Enumeration var2 = zip.entries();
      int var3 = 0;

      while (var2.hasMoreElements() && var3++ < 8192) {
         ZipEntry var4 = (ZipEntry)var2.nextElement();
         if (!var4.isDirectory()) {
            var1.add(var4.getName());
         }
      }

      return IlIlllIlilIl(var1);
   }

   public static synchronized class_2960 Iilililiiili(String key) {
      Integer var1 = lliIlIIIIl.get(key);
      if (var1 == null) {
         if (IliIlIIIIl.size() >= (-(-(-1021059881 * 15 - -13)) ^ 1863954598)) {
            return null;
         }

         var1 = IliIlIIIIl.size();
         IliIlIIIIl.add(key);
         lliIlIIIIl.put(key, var1);
      }

      return class_2960.method_60655(
         IiiIlliiIl<"IiiIlliiIl","G7ny8K0Ns3pAnwbOewdOtJigCU2LcYrwUIkVY0mMiqN069Wm+hI=">(),
         IiiIlliiIl<"IiiIlliiIl","0+wMGEamTDURynqAS6VqArRiqwheriSPpS2cEAMiRtZuWKI=">() + var1
      );
   }

   public static synchronized void Iiiiliiiiiii() {
      iliIlIIIIl++;
   }

   public static Map<String, IiliIllliliIll> iliIiiliiiii(Path dir) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Path var3 : lIiiIiIlilli(dir)) {
         String var4 = IilliliilIIi(var3.getFileName().toString());

         try (ZipFile var5 = new ZipFile(var3.toFile())) {
            Map var6 = IIIllIIliIIl(var5);
            if (!var6.isEmpty()) {
               var1.put(var4, new IiliIllliliIll(var4, var3, var6));
            }
         } catch (RuntimeException | IOException var10) {
            System.err
               .println(
                  IiiIlliiIl<"IiiIlliiIl","9bl2QevwuLwOysnWTp06sW/NRedhZmLxtKoB92QO">()
                     + var3.getFileName()
                     + IiiIlliiIl<"IiiIlliiIl","7hbC+3MQkt63XNWjo96oggqLM5hQzs+hYY/f/RXJ">()
                     + var10
               );
         }
      }

      return Collections.unmodifiableMap(var1);
   }

   public static boolean IIlilIliiIli(iiIiliiIIlilii knife, lIIiilIliIIiilIl model, String clip) {
      if (knife == null || clip == null || !iIlIlllllill()) {
         return false;
      } else if (model == null) {
         return !knife.IliIlllilIi() && lIiIlIIIIl.get(knife.illilliIIl) != null;
      } else if (clip.endsWith(IiiIlliiIl<"IiiIlliiIl","mGBVYXVsSk5GeOLS+LD0BF8UXP19aS5n+9gat+g=">())) {
         String var7 = clip.substring(0, clip.length() - 1);

         for (lliIiiililiIiiil var5 : model.iiiililIll.values()) {
            if (var5.liiiIIllIl().startsWith(var7) && knife.IlIlllIlilIl(var5.liiiIIllIl())) {
               List var6 = IiIiliIiiiIi(knife, var5);
               if (var6 != null && !var6.isEmpty()) {
                  return true;
               }
            }
         }

         return false;
      } else {
         List var3 = IiIiliIiiiIi(knife, model.iiiililIll.get(clip));
         return var3 != null && !var3.isEmpty();
      }
   }

   static synchronized long iIIIlIlIIl() {
      return liiIlIIIIl;
   }

   public static float IIillIiliIil() {
      float var0 = iilliliIIilili.IliIlllilIi(Double.longBitsToDouble(-776419433568186720L ^ -3832559734965348550L));
      return var0 > 0.0F ? 0.7F / var0 : 0.7F;
   }
}
