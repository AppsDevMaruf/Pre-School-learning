package com.marufalam.preschoollearning.fragments.drawing;

import static android.os.Environment.getExternalStorageDirectory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.Manifest;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.kyanogen.signatureview.SignatureView;
import com.marufalam.preschoollearning.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import yuku.ambilwarna.AmbilWarnaDialog;

public class DrawingFragment extends Fragment {
    SignatureView signatureView;
    ImageButton imgEraser, imgColor, imgSave;
    SeekBar seekBar;
    TextView txtPenSize;
    int defaultColor;

    private static String fileName;

    File path = new File(getExternalStorageDirectory().getAbsolutePath() + "/myPaintings");

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_drawing, container, false);

        signatureView = view.findViewById(R.id.signature_view);

        seekBar = view.findViewById(R.id.penSize);

        txtPenSize = view.findViewById(R.id.txtPenSize);

        imgColor = view.findViewById(R.id.btnColor);

        imgEraser = view.findViewById(R.id.btnEraser);

        imgSave = view.findViewById(R.id.btnSave);

        askPermission();

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        String date = format.format(new Date());
        fileName = path + "/" + date + ".png";

        if (!path.exists()) {
            path.mkdirs();
        }


        defaultColor = ContextCompat.getColor(

                requireActivity(), R.color.black);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtPenSize.setText(i + "dp");
                signatureView.setPenSize(i);
                seekBar.setMax(80);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        imgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColorPicker();
            }
        });
        imgEraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signatureView.clearCanvas();
            }
        });
        imgSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!signatureView.isBitmapEmpty()) {
                    {
                        try {
                            saveImage();
                        } catch (IOException e) {
                            e.printStackTrace();

                            Toast.makeText(requireActivity(), "Couldn't Save!"+e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
        return view;
    }


    private void saveImage() throws IOException {

        File file = new File(fileName);
        Bitmap bitmap = signatureView.getSignatureBitmap();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, bos);
        byte[] bitmapData = bos.toByteArray();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bitmapData);
        fos.flush();
        fos.close();
        Toast.makeText(requireActivity(), "Drawing Saved!!", Toast.LENGTH_SHORT).show();

    }

    private void openColorPicker() {
        AmbilWarnaDialog ambilWarnaDialog = new AmbilWarnaDialog(requireActivity(), defaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                defaultColor = color;
                signatureView.setPenColor(color);
            }
        });
        ambilWarnaDialog.show();

    }

    private void askPermission() {
        Dexter.withContext(requireActivity())
                .withPermissions(Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        Toast.makeText(requireActivity(), "Granted!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).check();
    }
}