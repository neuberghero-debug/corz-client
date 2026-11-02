package gg.corz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_156;

public final class lIIiIiIiiIIiIiIi {
   private volatile String iIillIiIIi;
   private volatile int llillIiIIi;
   private volatile String lIillIiIIi;
   private static final Path lilllIiIIi = FabricLoader.getInstance()
      .getGameDir()
      .resolve(IlIillIiilIi<"IlIillIiilIi","mRMWSU9v598SX1hkNx+pTScIeidTzS9AfP0X0XLqzsIJAa0mLc4=">())
      .resolve(IlIillIiilIi<"IlIillIiilIi","Y1uTpLoEZFCgESVvwJiXqa+54UxUWyZue1y80GYYXe26d2ptYsE=">());
   private volatile boolean IlillIiIIi;
   private volatile iIilliIlIlilliIl IIillIiIIi;
   private final List<String> iilllIiIIi = new ArrayList<>();

   public String iliIiiliiiii() {
      return this.lIillIiIIi;
   }

   public void IiIlliIliiIl(String fileName) {
      long var6 = -172135104432614129L;
      if (fileName != null && !fileName.isBlank()) {
         Path var2 = lilllIiIIi.resolve(fileName);
         if (!Files.exists(var2)) {
            this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","6st29vWNSC0trok5S/i8NTe2IUT+vJvm0Dfe1c9wfuc0tjVmEjsL96vF">() + fileName;
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IlIillIiilIi<"IlIillIiilIi","SM/z6qsgFW7pE3/McdEUKTjCx+Kz49qePp2x4EhCXa0ScpAEnh1NCQ==">(),
                  IlIillIiilIi<"IlIillIiilIi","3SypgyJQW6syQhgqJipFUAEEdV35mOamYE+HBiHzN2NZ6OBO4S7FvygZjTS9FA8=">(),
                  false
               );
            this.iIlIlllllill();
         } else {
            this.IlillIiIIi = true;
            this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","WjC0Oe3vXY+taUJa92Ylhu2+lD9YeEz5lmjaO7yTYAgI7hdp">()
               + fileName
               + IlIillIiilIi<"IlIillIiilIi","bbppeqgbSO/qpIaxMxtaARzKaJ0KmnIpsDJNqQ01NQ==">();
            String var3 = fileName.toLowerCase();
            var6 ^= ((long)this.llillIiIIi << 32 ^ var6) & -1L << 32;
            Thread var5 = new Thread(
               () -> {
                  try {
                     iIilliIlIlilliIl var5x = var3.endsWith(IlIillIiilIi<"IlIillIiilIi","y1yXHU68eqFMlGknildtC2g7IOpFf8ExuDfl94teAFED2hkV354=">())
                        ? iiiIlIiIIIllIi.IliIlllilIi(var2)
                        : lliillIliliillIl.IliIlllilIi(var2);
                     if (ticket == this.llillIiIIi) {
                        this.IIillIiIIi = var5x;
                        this.lIillIiIIi = fileName;
                        this.iIillIiIIi = var5x.iliIiiiIll
                           + IlIillIiilIi<"IlIillIiilIi","MGKf/Qo9lY8cbyYkM4ISLeajHtI63tzW4WNsMQHA">()
                           + var5x.iIIliiiIll
                           + IlIillIiilIi<"IlIillIiilIi","ZyvXf9/b8pxu9M4kkcj53Y+djzvUpm3AzzmMIelFslIelC/Z">();
                        Iliiiiilliiiii.IliIlllilIi()
                           .iIlIlllllill(
                              IlIillIiilIi<"IlIillIiilIi","SM/z6qsgFW7pE3/McdEUKTjCx+Kz49qePp2x4EhCXa0ScpAEnh1NCQ==">(),
                              IlIillIiilIi<"IlIillIiilIi","5KcWLTxdrNwCjOQQCfMi4NFs26xXRp2XCA33kUbzBPPDtPY=">()
                                 + var5x.iliIiiiIll
                                 + IlIillIiilIi<"IlIillIiilIi","JIOscgqFhKSATGNOzJfNr2m8hZJorn2gxvzpbQe3OA==">()
                                 + var5x.iIIliiiIll
                                 + IlIillIiilIi<"IlIillIiilIi","qkZlO/IVbYfheUUvXREH/UcNW4j/zBt3dGBZisic5kbdrNU=">(),
                              true
                           );
                        if (!var5x.IlIliiiIll.isEmpty()) {
                           Iliiiiilliiiii.IliIlllilIi()
                              .iIlIlllllill(
                                 IlIillIiilIi<"IlIillIiilIi","SM/z6qsgFW7pE3/McdEUKTjCx+Kz49qePp2x4EhCXa0ScpAEnh1NCQ==">(),
                                 var5x.IlIliiiIll.size()
                                    + IlIillIiilIi<"IlIillIiilIi","hvb8U4teBWQcVdxvf5KsEtGgFawBJeDBW4NwlWQ16EnAi5eDd9LbSEND3Nn32wLI8Q==">(),
                                 false
                              );
                        }

                        return;
                     }

                     return;
                  } catch (Exception var9) {
                     if (ticket == this.llillIiIIi) {
                        this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","yL150cerBmtJCNG/hIvy8+XZiG7HDH5/cCQYfQhUPFsj+MJmh3lwHPu8Hw==">() + fileName;
                        Iliiiiilliiiii.IliIlllilIi()
                           .iIlIlllllill(
                              IlIillIiilIi<"IlIillIiilIi","SM/z6qsgFW7pE3/McdEUKTjCx+Kz49qePp2x4EhCXa0ScpAEnh1NCQ==">(),
                              IlIillIiilIi<"IlIillIiilIi","Tue4y9yvpBN0Xk3CR3n31uNJdTekPJXiQN8PAHZveAjxcwqQBQ4cDU2hyEgzNLGHVg5bpgg=">(),
                              false
                           );
                        return;
                     }
                  } finally {
                     this.IlillIiIIi = false;
                  }
               },
               IlIillIiilIi<"IlIillIiilIi","L1QyAUOnnz1O9OQfcjdDKfJ5VHxC2WnWc8EWSRQS/f+0DQ0Ha8o3QpQ2q6uS4Q==">()
            );
            var5.setDaemon(true);
            var5.start();
         }
      }
   }

   public lIIiIiIiiIIiIiIi() {
      this.lIillIiIIi = "";
      this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","JG25qawAt+ClrknH9fuzUUXgEodYWUFF2hiWH0iHR/m1VXaASy/UgVushTL4RWo=">();
      this.IlillIiIIi = false;
      liiiIIllIl();
      this.iIlIlllllill();
   }

   public List<String> IilliliilIIi() {
      return this.iilllIiIIi;
   }

   public void Illlllllilll() {
      this.Iilllilliill(1);
   }

   public synchronized void iIlIlllllill() {
      liiiIIllIl();
      this.iilllIiIIi.clear();

      try (Stream var1 = Files.list(lilllIiIIi)) {
         var1.filter(
               p -> {
                  String var1x = p.getFileName().toString().toLowerCase();
                  return var1x.endsWith(IlIillIiilIi<"IlIillIiilIi","y1yXHU68eqFMlGknildtC2g7IOpFf8ExuDfl94teAFED2hkV354=">())
                     || var1x.endsWith(IlIillIiilIi<"IlIillIiilIi","UtWiPRh7iEmv123gtRElOo4N6fdgD8raechvG4amVqFc9w==">())
                     || var1x.endsWith(IlIillIiilIi<"IlIillIiilIi","FGdHPOX3DOQtpYA3mh7SjIQXX3JogxZGmj4k1VhEgOw0vEsB4+c=">());
               }
            )
            .map(p -> p.getFileName().toString())
            .sorted(Comparator.naturalOrder())
            .forEach(this.iilllIiIIi::add);
      } catch (IOException var6) {
      }

      if (!this.iilllIiIIi.contains(this.lIillIiIIi)) {
         this.lIillIiIIi = "";
      }
   }

   public iIilliIlIlilliIl lIiiIiIlilli() {
      return this.IIillIiIIi;
   }

   public String IIIllIIliIIl() {
      return this.iIillIiIIi;
   }

   private void Iilllilliill(int dir) {
      long var3 = 6268093208415003581L;
      if (this.iilllIiIIi.isEmpty()) {
         this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","ImM/g/psGsaDjFBlpJ2jmGUIR+YQ3KOPWHQIPYuxZ8bvkvKLgp8joAqv8FGydRapkXMs">();
      } else {
         var3 ^= ((long)this.iilllIiIIi.indexOf(this.lIillIiIIi) << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)(((int)(var3 >>> 32) + dir + this.iilllIiIIi.size() * 2) % this.iilllIiIIi.size()) << 32 ^ var3) & -1L << 32;
         this.IiIlliIliiIl(this.iilllIiIIi.get((int)(var3 >>> 32)));
      }
   }

   private static void liiiIIllIl() {
      try {
         Files.createDirectories(lilllIiIIi);
      } catch (IOException var1) {
      }
   }

   public void IIillIiliIil() {
      this.llillIiIIi++;
      this.IIillIiIIi = null;
      this.lIillIiIIi = "";
      this.iIillIiIIi = IlIillIiilIi<"IlIillIiilIi","JG25qawAt+ClrknH9fuzUUXgEodYWUFF2hiWH0iHR/m1VXaASy/UgVushTL4RWo=">();
   }

   public static Path IliIlllilIi() {
      return lilllIiIIi;
   }

   public void IIlllIlliIll() {
      this.Iilllilliill(-1);
   }

   public void IlIlllIlilIl() {
      liiiIIllIl();

      try {
         class_156.method_668().method_673(lilllIiIIi.toUri());
      } catch (Exception var2) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IlIillIiilIi<"IlIillIiilIi","SM/z6qsgFW7pE3/McdEUKTjCx+Kz49qePp2x4EhCXa0ScpAEnh1NCQ==">(),
               IlIillIiilIi<"IlIillIiilIi","3LNjokSAHZogngl28Ogl/IIcFIh9m1h2SxjywXLFqwvsJJzNrtGULnhG7M8Hp/+5">(),
               false
            );
      }
   }
}
