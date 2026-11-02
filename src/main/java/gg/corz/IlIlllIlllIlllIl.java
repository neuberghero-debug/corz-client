package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import net.fabricmc.loader.api.FabricLoader;

public final class IlIlllIlllIlllIl {
   private static final Pattern IlilliIiIl = Pattern.compile(
      lilIliilIl<"lilIliilIl","gchdegBgkK0csRqvY+8+I1T7iduOgUjIGFhsDC36ECQ69IySPmf7+WxnkOazKUBYAm9R2KJFQ3A=">()
   );
   private static final long liilliIiIl = Long.MIN_VALUE;
   private final ConcurrentLinkedQueue<llililililililil> IIliliIiIl;
   private final LinkedHashMap<String, IIiliIIilIiliIIi> iiIiliIiIl = new LinkedHashMap<>(16, 0.75F, true);
   public static final int IillliIiIl = 200;
   private static final String IlIiliIiIl = "corz-bot-learn";
   private static final int iiilliIiIl = 0;
   private static final long IiilliIiIl = 60000L;
   private static final String llilliIiIl = ".json";
   private final ConcurrentLinkedQueue<IIiliIIilIiliIIi> lIliliIiIl;
   private boolean llliliIiIl;
   private static final int IIIiliIiIl = 1;
   private final Supplier<Path> llIiliIiIl;
   private static final Pattern lIilliIiIl = Pattern.compile(lilIliilIl<"lilIliilIl","4veyB4P5l/2x/GT9aT5QVe+CdHB1jyIgpE1ATKZaSBOpsH3GUnMdIiOhuEeL">());
   private volatile int IlliliIiIl;
   private final Executor ilIiliIiIl;
   private static final String ililliIiIl = ".json.tmp";
   private final LongSupplier IiIiliIiIl;
   private boolean illiliIiIl;
   public static final long iillliIiIl = 30000L;
   private static final Pattern iIilliIiIl = Pattern.compile(lilIliilIl<"lilIliilIl","X5jyGI6rAvw+tk1BNYmAT4162bGxJpNH7AIir9HmzPsud9Dym2lAO6zS0K3j9JHDmkYP">());
   private static final int lIIiliIiIl = 2;
   private volatile Path iIliliIiIl;
   private static final int iIIiliIiIl = 16;
   public static final int lillliIiIl = 64;
   private static final Pattern IIilliIiIl = Pattern.compile(lilIliilIl<"lilIliilIl","XcFwOhsMiXsSXvaUf2VYGnJN9WpzkKWgvsVs98PAk7+Hly7OIDj74cjNsg==">());
   private final Random liIiliIiIl;

   private static int Illillliilli(Path d) {
      long var5 = -8897619128645230595L;
      var5 ^= (0L ^ var5) & -1L << 32;

      try (DirectoryStream var2 = Files.newDirectoryStream(d)) {
         for (Path var4 : var2) {
            if (iIilliIiIl.matcher(var4.getFileName().toString()).matches() && Files.isRegularFile(var4, LinkOption.NOFOLLOW_LINKS)) {
               var5 += 4294967296L;
            }
         }
      }

      return (int)(var5 >>> 32);
   }

   private String IIIIllIIIl(IIiliIIilIiliIIi e) {
      if (e.lIIliliiil.IIlllIlliIll()) {
         return lilIliilIl<"lilIliilIl","EwxKX5T2Q1FrKh2LtgZCdROpjD3WEoJyrD9S9ng=">();
      } else {
         return e.iIIliliiil == 1
            ? lilIliilIl<"lilIliilIl","3U3SaW2MaiJt+8Ew6xRePOFoSLb4D6LoFDeCMHA=">()
            : lilIliilIl<"lilIliilIl","2vEl2Fk3HRJ2hT/4GiYW54/8ep5bI9x2h15VGF8=">();
      }
   }

   public void iIlIlllllill(boolean on) {
      long var5 = -3376519870983663716L;
      var5 ^= ((long)this.llliliIiIl << 32 ^ var5) & -1L << 32;
      this.llliliIiIl = on;
      if (on && (int)(var5 >>> 32) == 0) {
         for (IIiliIIilIiliIIi var4 : new ArrayList<>(this.iiIiliIiIl.values())) {
            this.IIillIiliIil(var4);
         }
      }
   }

   private void IIIilIIiiIIi(IIiliIIilIiliIIi key, String e) {
      ililllilIiilllil var3 = null;

      try {
         if (!IIiIIllIiIIl.IliIlllilIi()) {
            Path var4 = this.Iiiiliiiiiii();
            Path var5 = var4.resolve(e + lilIliilIl<"lilIliilIl","WCDD335PWk7qAty+HlRVP7V6gR4FTL3SSHSLcqXmgco7">());
            if (Files.isRegularFile(var5, LinkOption.NOFOLLOW_LINKS) && Files.size(var5) <= 16384L) {
               String var6 = Iilililiiili(var5);
               if (var6 != null) {
                  var3 = IIIIIillIIIIil.liiiIIllIl(var6);
               }
            }

            if (Files.isDirectory(var4)) {
               this.IlliliIiIl = Illillliilli(var4);
            }
         }
      } catch (IOException | RuntimeException var7) {
         IiIIlliIIl(lilIliilIl<"lilIliilIl","GlH0cnCSK5n2aAH6h++UqlO3rgIB83q4SO9IPRFlGss=">(), var7);
      }

      this.IIliliIiIl.add(new llililililililil(key, var3));
   }

   public static String liiiIIllIl(String playerName) {
      if (playerName == null) {
         return null;
      } else {
         String var1 = playerName.toLowerCase(Locale.ROOT);
         return IIilliIiIl.matcher(var1).matches() ? lilIliilIl<"lilIliilIl","41n21u/SsxexV7DQbIV73iztr/zetFwvlcJZW2d0">() + var1 : null;
      }
   }

   private void Iilllilliill(IIiliIIilIiliIIi force, boolean e) {
      long var9 = -3078693380840074444L;
      ilIliliIiIlili var3 = force.lIIliliiil;
      if (this.llliliIiIl && var3.iIlIlllllill() != null && var3.Illlllllilll() && !IIiIIllIiIIl.IliIlllilIi()) {
         if (force.iIIliliiil != 2) {
            this.IIillIiliIil(force);
         } else {
            long var4 = this.IiIiliIiIl.getAsLong();
            if (e || force.IlIliliiil == Long.MIN_VALUE || var4 < force.IlIliliiil || var4 - force.IlIliliiil >= 30000L) {
               String var6 = IIIIIillIIIIil.IliIlllilIi(var3.IIillIiliIil(var4));
               if (var6 != null) {
                  force.IlIliliiil = var4;
                  var9 ^= ((long)(!this.illiliIiIl ? 1 : 0) << 32 ^ var9) & -1L << 32;
                  this.illiliIiIl = true;
                  String var8 = var3.iIlIlllllill();
                  this.Iiilliiliiil(() -> this.IlIillIiilIi(force, var8, var6, prune));
               }
            }
         }
      }
   }

   private static long IIiilIiiiIii(Path p) {
      return Files.getLastModifiedTime(p, LinkOption.NOFOLLOW_LINKS).toMillis();
   }

   public String IIlllIlliIll() {
      long var8 = 7240874722101169648L;
      StringBuilder var1 = new StringBuilder(lilIliilIl<"lilIliilIl","c+dSCW4IRix7Q3VoHTz7VuD9Gqdmoje6dXJ47PAcd2c=">());

      Path var2;
      try {
         var2 = this.Iiiiliiiiiii();
      } catch (RuntimeException var10) {
         var2 = null;
      }

      var1.append(var2 == null ? lilIliilIl<"lilIliilIl","M6m+Si9t8WSDhhZtfp4XgenJkYc4O40udcqYweM=">() : var2.toString());
      var1.append(lilIliilIl<"lilIliilIl","3GQZOQzVtgHaQ1vlFOeelQfs0z7itshs//bmt04wBLwEE1X5LA==">())
         .append(
            this.llliliIiIl
               ? lilIliilIl<"lilIliilIl","AHcRMNlSQL8r+UjmoboaPu5G4EPUiB1e/wz1v01B">()
               : lilIliilIl<"lilIliilIl","4SO9l4IgDQZBua8nQt1mZkuwpnCsVeCOAd15A3V/JQ==">()
         );
      var8 ^= ((long)this.IlliliIiIl << 32 ^ var8) & -1L << 32;
      var1.append(lilIliilIl<"lilIliilIl","EBUQQaa40M79O2IPVRkg8krYEF5APJXZYJeRw9KlirD4aZQ=">())
         .append((int)(var8 >>> 32) < 0 ? lilIliilIl<"lilIliilIl","M6m+Si9t8WSDhhZtfp4XgenJkYc4O40udcqYweM=">() : String.valueOf((int)(var8 >>> 32)));
      ArrayList var4 = new ArrayList<>(this.iiIiliIiIl.values());
      Collections.reverse(var4);
      var8 ^= (0L ^ var8) & -1L >>> 32;

      for (IIiliIIilIiliIIi var7 : var4) {
         int var10000 = (int)var8;
         var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         if (var10000 >= 16) {
            break;
         }

         var1.append(' ')
            .append(
               var7.lIIliliiil.iIlIlllllill() == null
                  ? lilIliilIl<"lilIliilIl","q6qPfIPk27QEjFmjgFYmiBOOoNPiMffmK8n1MxCKXw==">()
                  : var7.lIIliliiil.iIlIlllllill()
            )
            .append(':')
            .append(var7.lIIliliiil.IlIlllIlilIl())
            .append(':')
            .append(this.IIIIllIIIl(var7));
      }

      return var1.toString();
   }

   private void IIillIiliIil(IIiliIIilIiliIIi e) {
      String var2 = e.lIIliliiil.iIlIlllllill();
      if (e.iIIliliiil == 0 && var2 != null && this.llliliIiIl && !IIiIIllIiIIl.IliIlllilIi()) {
         e.iIIliliiil = 1;
         if (!this.Iiilliiliiil(() -> this.IIIilIIiiIIi(e, var2))) {
            e.iIIliliiil = 0;
         }
      }
   }

   public void IiIlliIliiIl(String name) {
      this.iiIiliIiIl.remove(llIIlilIIl(name));
      String var2 = liiiIIllIl(name);
      if (var2 != null && this.llliliIiIl && !IIiIIllIiIIl.IliIlllilIi()) {
         this.Iiilliiliiil(() -> this.IiIiliIiiiIi(var2));
      }
   }

   private static String llIIlilIIl(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }

   public static IlIlllIlllIlllIl IliIlllilIi() {
      return new IlIlllIlllIlllIl(IlIlllIlllIlllIl::iiIIlIIlIl, new liiliiiliiiliiil(), System::currentTimeMillis, new Random());
   }

   private void IiIiliIiiiIi(String key) {
      if (!IIiIIllIiIIl.IliIlllilIi() && lIilliIiIl.matcher(key).matches()) {
         try {
            Path var2 = this.Iiiiliiiiiii();
            Files.deleteIfExists(var2.resolve(key + lilIliilIl<"lilIliilIl","WCDD335PWk7qAty+HlRVP7V6gR4FTL3SSHSLcqXmgco7">()));
            Files.deleteIfExists(var2.resolve(key + lilIliilIl<"lilIliilIl","Z6S0/15XPPn8wroALjcZBfFIMW2pRaGblBg9Le2D7+H6c2I/IQ==">()));
            if (Files.isDirectory(var2)) {
               this.IlliliIiIl = Illillliilli(var2);
            }
         } catch (RuntimeException | IOException var3) {
            IiIIlliIIl(lilIliilIl<"lilIliilIl","RHXn7SbXQnlGe9eLgrJOJRULvPxyP2Wyw91bCTLlEmy3vA==">(), var3);
         }
      }
   }

   public String Illlllllilll(ilIliliIiIlili p) {
      if (p == null) {
         return lilIliilIl<"lilIliilIl","2vEl2Fk3HRJ2hT/4GiYW54/8ep5bI9x2h15VGF8=">();
      } else {
         IIiliIIilIiliIIi var2 = this.iiIiliIiIl.get(llIIlilIIl(p.IliIlllilIi()));
         String var3 = !this.llliliIiIl
            ? lilIliilIl<"lilIliilIl","4SO9l4IgDQZBua8nQt1mZkuwpnCsVeCOAd15A3V/JQ==">()
            : (p.iIlIlllllill() == null ? lilIliilIl<"lilIliilIl","q6qPfIPk27QEjFmjgFYmiBOOoNPiMffmK8n1MxCKXw==">() : p.iIlIlllllill());
         String var4 = var2 != null && var2.lIIliliiil == p
            ? this.IIIIllIIIl(var2)
            : (
               p.IIlllIlliIll()
                  ? lilIliilIl<"lilIliilIl","EwxKX5T2Q1FrKh2LtgZCdROpjD3WEoJyrD9S9ng=">()
                  : lilIliilIl<"lilIliilIl","2vEl2Fk3HRJ2hT/4GiYW54/8ep5bI9x2h15VGF8=">()
            );
         return var3
            + lilIliilIl<"lilIliilIl","LqQP+EfH4sUC+s0EfKCIUKRgjIVblagxZOjwBVo=">()
            + p.IlIlllIlilIl()
            + lilIliilIl<"lilIliilIl","LqQP+EfH4sUC+s0EfKCIUKRgjIVblagxZOjwBVo=">()
            + var4;
      }
   }

   private void Ililllililil() {
      Iterator var1 = this.iiIiliIiIl.values().iterator();

      while (this.iiIiliIiIl.size() > 64 && var1.hasNext()) {
         IIiliIIilIiliIIi var2 = (IIiliIIilIiliIIi)var1.next();
         var1.remove();
         if (var2.lIIliliiil.Illlllllilll()) {
            this.Iilllilliill(var2, true);
         }
      }
   }

   public void iliIiiliiiii() {
      llililililililil var1;
      while ((var1 = this.IIliliIiIl.poll()) != null) {
         IIiliIIilIiliIIi var2 = var1.IliIlllilIi();
         var2.iIIliliiil = 2;
         ililllilIiilllil var3 = var1.liiiIIllIl();
         if (var3 != null && iIIIlIlIIl(var2.lIIliliiil.liiiIIllIl(), var3.lIiiIiIlilli())) {
            var2.lIIliliiil.Ililllililil(var3);
         }
      }

      IIiliIIilIiliIIi var4;
      while ((var4 = this.lIliliIiIl.poll()) != null) {
         var4.IlIliliiil = Long.MIN_VALUE;
         var4.lIIliliiil.Iilllilliill();
      }
   }

   private static String Iilililiiili(Path file) {
      String var3;
      try (InputStream var1 = Files.newInputStream(file)) {
         byte[] var2 = var1.readNBytes(16385);
         if (var2.length > 16384) {
            return null;
         }

         var3 = new String(var2, StandardCharsets.UTF_8);
      }

      return var3;
   }

   public boolean IilliliilIIi() {
      return this.llliliIiIl;
   }

   private static Path iiIIlIIlIl() {
      try {
         return FabricLoader.getInstance()
            .getConfigDir()
            .resolve(lilIliilIl<"lilIliilIl","NbOuOmmluSQYBomnYt1Fk3vscjq+niOctJN+yFHJu63bZ2k5Ovo=">())
            .resolve(lilIliilIl<"lilIliilIl","Vh2quO1/cEGBYVJqG/ss8wMjZzV/OCLb6wmhiP6DFhY=">())
            .resolve(lilIliilIl<"lilIliilIl","U7R0wnr6v2y1jChkgMnJNN1GkERldjhklvBD3870cZYYrQpQkw==">());
      } catch (Throwable var1) {
         return Path.of(
            System.getProperty(lilIliilIl<"lilIliilIl","fTRTUYVoGGiHAIo6yQaQt6YAx+a/UEcTAx/sXFlihYy3msJi">()),
            lilIliilIl<"lilIliilIl","c3yUvl28LoAZ5cOW+ojA5vt5NfF/+qyH97bh5Y3lE4wQNQ==">(),
            lilIliilIl<"lilIliilIl","NbOuOmmluSQYBomnYt1Fk3vscjq+niOctJN+yFHJu63bZ2k5Ovo=">(),
            lilIliilIl<"lilIliilIl","Vh2quO1/cEGBYVJqG/ss8wMjZzV/OCLb6wmhiP6DFhY=">(),
            lilIliilIl<"lilIliilIl","U7R0wnr6v2y1jChkgMnJNN1GkERldjhklvBD3870cZYYrQpQkw==">()
         );
      }
   }

   private static boolean iIIIlIlIIl(UUID u, String s) {
      return u != null && s != null && u.toString().equalsIgnoreCase(s);
   }

   public void IlIlllIlilIl() {
      for (IIiliIIilIiliIIi var2 : new ArrayList<>(this.iiIiliIiIl.values())) {
         if (var2.lIIliliiil.Illlllllilll()) {
            this.Iilllilliill(var2, true);
         }
      }
   }

   private void IlIillIiilIi(IIiliIIilIiliIIi text, String prune, String owner, boolean key) {
      long var10 = -3689444274420553165L;
      if (!IIiIIllIiIIl.IliIlllilIi() && lIilliIiIl.matcher(prune).matches()) {
         byte[] var5 = owner.getBytes(StandardCharsets.UTF_8);
         if (var5.length <= 16384) {
            Path var7 = null;

            Path var6;
            try {
               var6 = this.Iiiiliiiiiii();
               Files.createDirectories(var6);
               Path var8 = var6.resolve(prune + lilIliilIl<"lilIliilIl","WCDD335PWk7qAty+HlRVP7V6gR4FTL3SSHSLcqXmgco7">());
               var7 = var6.resolve(prune + lilIliilIl<"lilIliilIl","Z6S0/15XPPn8wroALjcZBfFIMW2pRaGblBg9Le2D7+H6c2I/IQ==">());
               Files.write(var7, var5, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
               if (IIiIIllIiIIl.IliIlllilIi()) {
                  Files.deleteIfExists(var7);
                  return;
               }

               try {
                  Files.move(var7, var8, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
               } catch (AtomicMoveNotSupportedException var12) {
                  Files.move(var7, var8, StandardCopyOption.REPLACE_EXISTING);
               }

               var7 = null;
            } catch (RuntimeException | IOException var14) {
               IiIIlliIIl(lilIliilIl<"lilIliilIl","V8bExjZhwPhjfvTD/BIUWNzR9t9PKUjIon/SH/mFYjM=">(), var14);
               if (var7 != null) {
                  Iliilliiilii(var7);
               }

               this.lIliliIiIl.add(text);
               return;
            }

            try {
               var10 ^= ((long)Illillliilli(var6) << 32 ^ var10) & -1L << 32;
               if (key || (int)(var10 >>> 32) > 200) {
                  this.IIlilIliiIli(var6, prune);
                  var10 ^= ((long)Illillliilli(var6) << 32 ^ var10) & -1L << 32;
               }

               this.IlliliIiIl = (int)(var10 >>> 32);
            } catch (IOException | RuntimeException var13) {
               IiIIlliIIl(lilIliilIl<"lilIliilIl","eznj9tIjFqyJWKjKBqFE5YHQ0q2YxCBydLVUL46CCx2T">(), var13);
            }
         }
      }
   }

   private static void Iliilliiilii(Path p) {
      try {
         Files.deleteIfExists(p);
      } catch (IOException | RuntimeException var2) {
         IiIIlliIIl(lilIliilIl<"lilIliilIl","6IqUoHtrwPJg3ZDyBw0HDArqHx84tP3MDG7gI/0hvhr7WKg=">(), var2);
      }
   }

   public ilIliliIiIlili lIiiIiIlilli(String name, UUID uuid) {
      String var3 = llIIlilIIl(name);
      IIiliIIilIiliIIi var4 = this.iiIiliIiIl.get(var3);
      if (var4 != null && uuid != null && !uuid.equals(var4.lIIliliiil.liiiIIllIl())) {
         this.iiIiliIiIl.remove(var3);
         var4 = null;
      }

      if (var4 == null) {
         var4 = new IIiliIIilIiliIIi(new ilIliliIiIlili(name, uuid, this.liIiliIiIl));
         this.iiIiliIiIl.put(var3, var4);
         this.Ililllililil();
      }

      if (this.llliliIiIl) {
         this.IIillIiliIil(var4);
      }

      return var4.lIIliliiil;
   }

   private static void IiIIlliIIl(String what, Throwable t) {
   }

   private Path Iiiiliiiiiii() {
      Path var1 = this.iIliliIiIl;
      if (var1 == null) {
         var1 = this.llIiliIiIl.get();
         this.iIliliIiIl = var1;
      }

      return var1;
   }

   public void IIIllIIliIIl(ilIliliIiIlili force, boolean p) {
      if (force != null) {
         IIiliIIilIiliIIi var3 = this.iiIiliIiIl.get(llIIlilIIl(force.IliIlllilIi()));
         if (var3 != null && var3.lIIliliiil == force) {
            this.Iilllilliill(var3, p);
         }
      }
   }

   private boolean Iiilliiliiil(Runnable job) {
      try {
         this.ilIiliIiIl.execute(job);
         return true;
      } catch (RejectedExecutionException var3) {
         IiIIlliIIl(lilIliilIl<"lilIliilIl","WTdDqn111alkVt4VIohjdS/SwJpqIsxnbtmjezw5vK9jtw==">(), var3);
         return false;
      }
   }

   private void IIlilIliiIli(Path keep, String d) {
      long var10 = 5533583856458394092L;
      long var3 = this.IiIiliIiIl.getAsLong();
      ArrayList var5 = new ArrayList();

      try (DirectoryStream var6 = Files.newDirectoryStream(keep)) {
         for (Path var8 : var6) {
            String var9 = var8.getFileName().toString();
            if (Files.isRegularFile(var8, LinkOption.NOFOLLOW_LINKS)) {
               if (iIilliIiIl.matcher(var9).matches()) {
                  if (!var9.equals(d + lilIliilIl<"lilIliilIl","WCDD335PWk7qAty+HlRVP7V6gR4FTL3SSHSLcqXmgco7">())) {
                     var5.add(new IlIlIlIillIlIlIi(var8, IIiilIiiiIii(var8), var9));
                  }
               } else if (IlilliIiIl.matcher(var9).matches()
                  && !var9.equals(d + lilIliilIl<"lilIliilIl","Z6S0/15XPPn8wroALjcZBfFIMW2pRaGblBg9Le2D7+H6c2I/IQ==">())
                  && var3 - IIiilIiiiIii(var8) > 60000L) {
                  Files.deleteIfExists(var8);
               }
            }
         }
      }

      var10 ^= ((long)(var5.size() + 1 - 200) << 32 ^ var10) & -1L << 32;
      if ((int)(var10 >>> 32) > 0) {
         var5.sort(Comparator.comparingLong(IlIlIlIillIlIlIi::liiiIIllIl).thenComparing(IlIlIlIillIlIlIi::iIlIlllllill));

         for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32;
            (int)var15 < (int)(var15 >>> 32) && (int)var15 < var5.size();
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32
         ) {
            Files.deleteIfExists(((IlIlIlIillIlIlIi)var5.get((int)var15)).IliIlllilIi());
         }
      }
   }

   public IlIlllIlllIlllIl(Supplier<Path> rnd, Executor io, LongSupplier dir, Random clockMs) {
      this.IIliliIiIl = new ConcurrentLinkedQueue<>();
      this.lIliliIiIl = new ConcurrentLinkedQueue<>();
      this.IlliliIiIl = -1;
      this.llIiliIiIl = Objects.requireNonNull(rnd, lilIliilIl<"lilIliilIl","qLDyTvF+nJ8W54BfIwdm1dLzdNE81JEVjxwZqCo65g==">());
      this.ilIiliIiIl = Objects.requireNonNull(io, lilIliilIl<"lilIliilIl","VsCpiQfqCmykFVPoVIDTMX5uy6DVlN2nENc9u8ix">());
      this.IiIiliIiIl = Objects.requireNonNull(dir, lilIliilIl<"lilIliilIl","Bi0meUIznytQjVkxqrtMtmQlUOu7R9iSJCLd7onUeU9AyrQ=">());
      this.liIiliIiIl = clockMs == null ? new Random() : clockMs;
   }
}
