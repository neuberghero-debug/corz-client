package gg.corz;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Locale;

final class IlIIIIIillIIIIIi {
   private static volatile Process llilliIiil;
   private static volatile boolean IiilliIiil;
   private static final String liilliIiil = "$ErrorActionPreference = 'SilentlyContinue'\n[Console]::OutputEncoding = [System.Text.Encoding]::UTF8\nAdd-Type -AssemblyName System.Runtime.WindowsRuntime\n$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object { $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]\nfunction Await($op, $type) { $t = $asTaskGeneric.MakeGenericMethod($type).Invoke($null, @($op)); $t.Wait(-1) | Out-Null; $t.Result }\n$mgrType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType=WindowsRuntime]\n$mgr = Await ($mgrType::RequestAsync()) $mgrType\n$sep = [char]31\nwhile ($true) {\n  try {\n    $sessions = $mgr.GetSessions()\n    $s = $sessions | Where-Object { $_.SourceAppUserModelId -like '*Spotify*' } | Select-Object -First 1\n    if (-not $s) { $s = $mgr.GetCurrentSession() }\n    if ($s) {\n      $m = Await ($s.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n      $tl = $s.GetTimelineProperties()\n      $pb = $s.GetPlaybackInfo()\n      $posMs = $tl.Position.TotalMilliseconds\n      if ([int]$pb.PlaybackStatus -eq 4) { $age = ([DateTimeOffset]::Now - $tl.LastUpdatedTime).TotalMilliseconds; if ($age -gt 0 -and $age -lt 900000) { $posMs += $age } }\n      Write-Output (\"T\" + $sep + $m.Title + $sep + $m.Artist + $sep + ([int]$tl.Position.TotalSeconds) + $sep + ([int]$tl.EndTime.TotalSeconds) + $sep + ([int]$pb.PlaybackStatus) + $sep + ([long]$posMs))\n    } else { Write-Output \"NONE\" }\n  } catch { Write-Output \"NONE\" }\n  [Console]::Out.Flush()\n  Start-Sleep -Milliseconds 350\n}\n";
   private static volatile long ililliIiil;

   static synchronized void IliIlllilIi() {
      if (llilliIiil == null || !llilliIiil.isAlive()) {
         if (System.getProperty(IIIllIIliIIl<"IIIllIIliIIl","LhU9yngIrFNG4Pmk9DYZ7cSGrFkB9Vt7dOIi3G7/WCrCZXc=">(), "")
            .toLowerCase(Locale.ROOT)
            .contains(IIIllIIliIIl<"IIIllIIliIIl","FidzlNi7IspCMwQ8QJ3XfAtsXEjdhFWddKczSZ8Dkg==">())) {
            long var0 = System.currentTimeMillis();
            if (var0 - ililliIiil >= 5000L) {
               ililliIiil = var0;

               try {
                  File var2 = File.createTempFile(
                     IIIllIIliIIl<"IIIllIIliIIl","wFEfjhzHwVt17t3iy3X+3ILjT+005AC0EMewxjVNlsafSuR1U7AzHA==">(),
                     IIIllIIliIIl<"IIIllIIliIIl","O56rTW+k7XoSG9DgiDM9D9ATfCcjKUfbbf03V9ZoB74=">()
                  );
                  var2.deleteOnExit();
                  Files.writeString(
                     var2.toPath(),
                     IIIllIIliIIl<"IIIllIIliIIl","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">()
                        + IIIllIIliIIl<"IIIllIIliIIl","UTgHx3MAvUFtjODmDrpSU/OdOV4C5Vz+b7ZoS8Tus0sfJcIO/2wo8/48TmG7Hb0IbT5qhDPqJXZRXPx9Cu0a6BHSiWYxnIACaOtgGraonwFaEVAJuYts2DPEz3uxY78giogYWe9Iwti+ubTSIpmMuQpTHRi73GvAaQqMn9ZjIQ==">()
                        + IIIllIIliIIl<"IIIllIIliIIl","w66V4X69ReivYnt+07bdok5pAyiJkaufgUpSOJSjnZ/88Y5dGPZglj0DmW/kRSgggWfBsCaPnWryE+JAIJYYK5zqB7eCUau+hlIpjlAQnq2GYpPews2JTRC/9HUfaP8Wz43fRVQ6VTfjvTddfkhz14P/SGTYNt6lAK65Xu3JgpDyX2wEMFt8QGFeMUs8Fg==">()
                  );
                  Process var3 = new ProcessBuilder(
                        IIIllIIliIIl<"IIIllIIliIIl","cJFfH2E1hI7CWpbDI8g/JpcwSrxptAjEIrziByOEI8xayywkcG0=">(),
                        IIIllIIliIIl<"IIIllIIliIIl","TN+Y3ljev+bBJ1FNTvq6UCKwuGbVE2qiCGw5DqsHz/qgBEKNCb4=">(),
                        IIIllIIliIIl<"IIIllIIliIIl","1xYhRHKlNNewQ4AZ5GzHDNgeiJqwAvpRGG7pbeHI0v6FKqXXxFAgLUm0uhg=">(),
                        IIIllIIliIIl<"IIIllIIliIIl","x1fniBXVdRfryEw6538BqMBAHgnkiOylaN7pp5vV9oG8YA==">(),
                        IIIllIIliIIl<"IIIllIIliIIl","TmctbgUebRRt0zgAovJSP4GNB+s1K7A/uA5/Kzs2Z2/CJoMPp6R06g==">(),
                        IIIllIIliIIl<"IIIllIIliIIl","oeaIePe57jcgziTW58tosvE4Vhm9BPWgTVr6mN9UKKjD2w==">(),
                        IIIllIIliIIl<"IIIllIIliIIl","CVywg1pI2vlP6EIJJJo3IxMZwOreYO8l+0vkGxUeqDB6">(),
                        var2.getAbsolutePath()
                     )
                     .start();
                  llilliIiil = var3;
                  Thread var4 = new Thread(
                     () -> iIlIlllllill(var3), IIIllIIliIIl<"IIIllIIliIIl","3VmLRZb+tsYjrINPUNgREE7qnWguml64XWsMB3rwQeGyIrrK28S3HdYOcYwiRKA=">()
                  );
                  var4.setDaemon(true);
                  var4.start();
                  if (!IiilliIiil) {
                     IiilliIiil = true;
                     Runtime.getRuntime().addShutdownHook(new Thread(IlIIIIIillIIIIIi::liiiIIllIl));
                  }
               } catch (Exception var5) {
               }
            }
         }
      }
   }

   static synchronized void liiiIIllIl() {
      Process var0 = llilliIiil;
      llilliIiil = null;
      if (var0 != null) {
         var0.destroyForcibly();
      }
   }

   private IlIIIIIillIIIIIi() {
   }

   private static void iIlIlllllill(Process p) {
      String var1 = null;
      String var2 = null;
      String var3 = null;
      String var4 = null;
      int var5 = 0;
      int var6 = 0;

      String var8;
      try (BufferedReader var7 = new BufferedReader(new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8))) {
         while ((var8 = var7.readLine()) != null) {
            if (!var8.isEmpty() && !var8.startsWith(IIIllIIliIIl<"IIIllIIliIIl","Rbd+yENoUwCo6HbNhltrY93aZeYQeBro2hfVWICeEQ8=">())) {
               String[] var9 = var8.split(IIIllIIliIIl<"IIIllIIliIIl","9BOYDBp+qtiiCyfLwIJMHOFMsEuWGiSrI9biS5A=">(), -1);
               if (var9.length >= 6 && IIIllIIliIIl<"IIIllIIliIIl","vIauhO3DBvAOoGYQHMbOc+mDz3aUwG2w6sie0bw=">().equals(var9[0])) {
                  String var10 = var9[1];
                  String var11 = var9[2];
                  int var12 = Math.max(1, IilliliilIIi(var9[4]));
                  boolean var13 = IilliliilIIi(var9[5]) == 4;
                  long var14 = var9.length >= 7 ? lIiiIiIlilli(var9[6], -1L) : -1L;
                  IiIiIIliliIiIIli.IlIIillIIi(var11, var10);
                  if (var12 <= 1) {
                     if (++var6 < 4) {
                        IiIiIIliliIiIIli.IlIllllIll(var10, var11, var13);
                        continue;
                     }
                  } else {
                     var6 = 0;
                  }

                  long var16 = var14 >= 0L ? var14 : (long)IilliliilIIi(var9[3]) * 1000L;
                  boolean var18 = !var10.equals(var1) || !var11.equals(var2);
                  if (!var18 || var12 <= 1 || var12 != var5 || var16 <= 3000L || var10.equals(var3) && var11.equals(var4)) {
                     var3 = null;
                     var4 = null;
                     if (var14 >= 0L) {
                        IiIiIIliliIiIIli.lIIlliIIll(var10, var11, var14, var12, var13, 900L);
                     } else {
                        IiIiIIliliIiIIli.iiiIlIIIll(var10, var11, IilliliilIIi(var9[3]), var12, var13);
                     }

                     if (var12 > 1) {
                        var1 = var10;
                        var2 = var11;
                        var5 = var12;
                        Iiilililliililil.iIlIlllllill(var11, var10, var12);
                     }
                  } else {
                     var3 = var10;
                     var4 = var11;
                     IiIiIIliliIiIIli.IlIllllIll(var10, var11, var13);
                  }
               }
            }
         }
      } catch (Exception var21) {
      }
   }

   private static long lIiiIiIlilli(String def, long s) {
      try {
         return Long.parseLong(def.trim());
      } catch (Exception var4) {
         return s;
      }
   }

   private static int IilliliilIIi(String s) {
      try {
         return Integer.parseInt(s.trim());
      } catch (Exception var2) {
         return 0;
      }
   }
}
